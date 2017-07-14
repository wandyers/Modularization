package com.hw.modularization.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hw.modularization.R;

/**
 * Created by wandyer on 17-5-10.
 */

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                ARouter.getInstance().build("/module1","module1").navigation();
                break;
            case R.id.btn2:
                ARouter.getInstance().build("/module2", "module2").navigation();
                break;
        }
    }
}
