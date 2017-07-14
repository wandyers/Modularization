package com.hw.modularization.moduleaspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by wandyer on 17-6-2.
 */
@Aspect
public class GuideAspect {

    private static final String TAG = "GuideAspect";

    @After("execution(* com.hw.modularization.module1.debug.ui.initData(..))")
    public void aroundJoinPoint(JoinPoint joinPoint) throws Throwable {
        Log.d(TAG, "GuideAspect-aroundJoinPoint run.");
    }

}
