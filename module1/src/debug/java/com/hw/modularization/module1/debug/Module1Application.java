package com.hw.modularization.module1.debug;

import android.app.Application;

import com.letv.sarrsdesktop.blockcanaryex.jrt.BlockCanaryEx;
import com.letv.sarrsdesktop.blockcanaryex.jrt.Config;

/**
 *
 * Created by wandyer on 17-5-10.
 */

public class Module1Application extends Application {

    @Override
    public void onCreate() {
        boolean isInSamplerProcess = initBlockCanaryEx();
        super.onCreate();
        if(!isInSamplerProcess){
            // TODO
        }
    }

    private boolean initBlockCanaryEx() {
        boolean isInSamplerProcess = BlockCanaryEx.isInSamplerProcess(this);
        if(!isInSamplerProcess) {
            BlockCanaryEx.install(new Config(this));
        }
        return isInSamplerProcess;
    }
}
