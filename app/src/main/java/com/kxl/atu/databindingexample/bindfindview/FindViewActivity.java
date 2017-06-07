package com.kxl.atu.databindingexample.bindfindview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.kxl.atu.databindingexample.BaseActivity;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.databinding.ActivityFindBinding;

/**
 * Created by atu on 2017/6/7.
 * 取消了findviewbyid
 */
public class FindViewActivity extends BaseActivity{
    private ActivityFindBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find);
        binding.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.text.setText("没有findviewbyid了");
            }
        });
    }
}
