package com.hw.modularization.module1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by wandyer on 17-5-10.
 */
@Route(path = "/module1", group = "module1")
public class ModuleActivity extends AppCompatActivity {

    private static final String TAG = "Module1Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_module);
        initData();
    }

    public void initData(){
        Log.d(TAG, "function run.");
    }
}
