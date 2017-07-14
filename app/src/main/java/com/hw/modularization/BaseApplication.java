package com.hw.modularization;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.letv.sarrsdesktop.blockcanaryex.jrt.BlockCanaryEx;
import com.letv.sarrsdesktop.blockcanaryex.jrt.Config;

/**
 * Created by wandyer on 17-5-10.
 */

public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        boolean isInSamplerProcess = initBlockCanaryEx();
        super.onCreate();
        if(!isInSamplerProcess){
            initRouter();
        }
    }

    private boolean initBlockCanaryEx() {
        boolean isInSamplerProcess = BlockCanaryEx.isInSamplerProcess(this);
        if(!isInSamplerProcess) {
            BlockCanaryEx.install(new Config(this));
        }
        return isInSamplerProcess;
    }

    private void initRouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);
    }


}
