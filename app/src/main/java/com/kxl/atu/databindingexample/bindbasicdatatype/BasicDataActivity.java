package com.kxl.atu.databindingexample.bindbasicdatatype;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.kxl.atu.databindingexample.BaseActivity;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.databinding.ActivityBasicDataBinding;

/**
 * 绑定基本数据类型
 */
public class BasicDataActivity extends BaseActivity {

    private ActivityBasicDataBinding binding;
    private boolean isCanClick = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_basic_data);
        binding.setContent("对string类型的数据进行绑定");
        binding.setEnable(isCanClick);
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCanClick){
                    binding.text.setText("楼上是真的");
                }else {
                    binding.text.setText("楼上是假的");
                    Snackbar.make(v,"我被的点击了",Snackbar.LENGTH_SHORT).show();
                }
                isCanClick = !isCanClick;
            }
        });
    }
}
