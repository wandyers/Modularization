package com.hw.modularization.module1.debug.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hw.modularization.module1.R;

public class DebugActivity extends AppCompatActivity {

    private static final String TAG = "DebugActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module1_debug);
        initData();
    }

    public void initData(){
        Log.d(TAG, "function run.");
    }

}
