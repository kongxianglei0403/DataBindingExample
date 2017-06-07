package com.kxl.atu.databindingexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kxl.atu.databindingexample.autoupdate.AutoUpdateActivity;
import com.kxl.atu.databindingexample.bindbasicdatatype.BasicDataActivity;
import com.kxl.atu.databindingexample.bindevent.EventActivity;
import com.kxl.atu.databindingexample.bindmodel.BasicActivity;
import com.kxl.atu.databindingexample.bindfindview.FindViewActivity;
import com.kxl.atu.databindingexample.bindrecycler.RecyclerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }
    public void openBasic(View view){
        startActivity(new Intent(this, BasicActivity.class));
    }

    public void killFind(View view){
        startActivity(new Intent(this, FindViewActivity.class));
    }

    public void basicData(View view){
        startActivity(new Intent(this, BasicDataActivity.class));
    }

    public void bindEvent(View view){
        startActivity(new Intent(this, EventActivity.class));
    }

    public void autoUpdate(View view){
        startActivity(new Intent(this, AutoUpdateActivity.class));
    }

    public void recycler(View view){
        startActivity(new Intent(this, RecyclerActivity.class));
    }
}
