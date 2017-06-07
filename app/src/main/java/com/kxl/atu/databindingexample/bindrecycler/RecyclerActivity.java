package com.kxl.atu.databindingexample.bindrecycler;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.Window;

import com.kxl.atu.databindingexample.BaseActivity;
import com.kxl.atu.databindingexample.R;
import com.kxl.atu.databindingexample.adapter.RecyclerAdapter;
import com.kxl.atu.databindingexample.bean.Content;
import com.kxl.atu.databindingexample.databinding.ActivityRecyclerBinding;

public class RecyclerActivity extends BaseActivity {

    private ActivityRecyclerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler);
        initToolBar();
        initRecycler();

    }

    private void initRecycler() {
        LinearLayoutManager manager = new LinearLayoutManager(RecyclerActivity.this);
        binding.recycler.setLayoutManager(manager);
        binding.recycler.setHasFixedSize(true);
        RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext());
        binding.recycler.setAdapter(adapter);
    }

    private void initToolBar() {
        Content content = new Content("THIS IS TITLE","THIS IS SUBTITLE");
        binding.setCon(content);

        binding.toolbar.toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        setSupportActionBar(binding.toolbar.toolbar);
        binding.toolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
