package com.example.edj07.baemin.app.splash;

import android.os.Handler;

/**
 * Created by edj07 on 2017-11-14.
 */

public class SplashPresenterImpl implements SplashPresenter {

    private static final int MILLIS_GET_DATA = 2000;

    private SplashView splashView;

    public SplashPresenterImpl(SplashView splashView) {
        this.splashView = splashView;
    }

    @Override
    public void getData() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splashView.onSuccess2getData();
            }
        }, MILLIS_GET_DATA);

    }

}
