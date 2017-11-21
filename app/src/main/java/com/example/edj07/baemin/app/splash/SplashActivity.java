package com.example.edj07.baemin.app.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.util.Defines;

public class SplashActivity extends AppCompatActivity implements SplashView{

//    private static final int MILLIS_START_HOME = 2000;

    private SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

        splashPresenter = new SplashPresenterImpl(this);//딜리게이트 패턴
        splashPresenter.getData();
    }

//    private void getData(){
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startHomeActivity();
//            }
//        },MILLIS_START_HOME);
//    }

    @Override
    public void onSuccess2getData() {
        startHomeActivity();
    }

    @Override
    public void onFail2getData() {
        finish();
    }

    private void startHomeActivity(){
        Intent intent = new Intent(Defines.INTENT_HOME_ACTIVITY);
        startActivity(intent);
    }

}
