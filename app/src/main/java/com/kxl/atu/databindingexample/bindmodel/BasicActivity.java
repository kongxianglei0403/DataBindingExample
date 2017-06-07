package com.kxl.atu.databindingexample.bindmodel;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.kxl.atu.databindingexample.BaseActivity;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.bean.User;
import com.kxl.atu.databindingexample.databinding.ActivityBasicBinding;

/**
 * Created by atu on 2017/6/6.
 * 绑定了model
 */

public class BasicActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding =  DataBindingUtil.setContentView(this, R.layout.activity_basic);
        User user = new User("atu","kong",17);
        binding.setUser(user);
    }
}
