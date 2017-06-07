package com.kxl.atu.databindingexample.bindevent;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.databinding.ActivityEventBinding;
import com.kxl.atu.databindingexample.listener.EventListener;

public class EventActivity extends AppCompatActivity {

    private ActivityEventBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_event);
        binding.setTitle1("事件绑定1");
        binding.setTitle2("事件绑定2");
        binding.setTitle3("事件绑定3");
        binding.setTitle4("change ok");
        binding.setEvent(new EventListener() {
            @Override
            public void click1(View v) {
                binding.setTitle1("方法1被调用");
            }

            @Override
            public void click2(View v) {
                binding.setTitle2("方法2被调用");
            }

            @Override
            public void click3(String str) {
                binding.setTitle3(str);
            }
        });
    }
}
