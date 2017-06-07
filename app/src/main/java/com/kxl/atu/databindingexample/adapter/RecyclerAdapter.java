package com.kxl.atu.databindingexample.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.kxl.atu.databindingexample.BR;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.databinding.RecyclerItemBinding;

/**
 * Created by atu on 2017/6/7.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context context;
    String[] strings={"A","B","C","D","E","F","G","H","I",
    "J","K","L","M","N",};

    public RecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.recycler_item,parent,false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String name = strings[position];
        holder.getBinding().setVariable(BR.str,name);

        //executePendingBindings()方法说明
        // When a variable or observable changes, the binding will be scheduled to change before the next frame.
        // There are times, however, when binding must be executed immediately.
        // To force execution, use the executePendingBindings() method.
        holder.getBinding().executePendingBindings();//此方法必须执行在UI线程，当绑定的数据修改时更新视图
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private RecyclerItemBinding binding;
        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = (RecyclerItemBinding) binding;
        }

        public RecyclerItemBinding getBinding() {
            return binding;
        }

        public void setBinding(RecyclerItemBinding binding) {
            this.binding = binding;
        }
    }
}
