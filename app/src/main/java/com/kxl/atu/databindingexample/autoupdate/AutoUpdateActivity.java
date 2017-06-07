package com.kxl.atu.databindingexample.autoupdate;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.kxl.atu.databindingexample.BaseActivity;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.bean.User;
import com.kxl.atu.databindingexample.databinding.ActivityAutoUpdateBinding;
import com.kxl.atu.databindingexample.listener.EventListener;

import java.util.Random;

/**
 *变量改变自动更新数据
 */
public class AutoUpdateActivity extends BaseActivity {

    private ActivityAutoUpdateBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auto_update);
        final User user = new User("atu", "kong", 18);
        binding.setUser(user);
        binding.setEvent(new EventListener() {
            @Override
            public void click1(View v) {
                user.setFirstName("kong");
                user.setLastName("atu");
                Random random = new Random();
                int age = random.nextInt(100);
                user.setAge(age);
            }

            @Override
            public void click2(View v) {

            }

            @Override
            public void click3(String str) {

            }
        });
    }
}
