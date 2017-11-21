package com.example.edj07.baemin;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by edj07 on 2017-11-14.
 */

public class BaeminApplication extends Application{

    private static BaeminApplication instance;

    public static BaeminApplication getInstance(){
        return instance;
    }

//이니셜라이징부터
    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationInstance();
        Fresco.initialize(this);
    }

    private void initializeApplicationInstance(){
        instance = this;
    }

    public int getScreenWidth(){
        return getResources().getDisplayMetrics().widthPixels;
    }

}
