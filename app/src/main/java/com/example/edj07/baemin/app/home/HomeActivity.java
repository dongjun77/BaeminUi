package com.example.edj07.baemin.app.home;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import com.example.edj07.baemin.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.navigation) View navigationView;

    @OnClick(R.id.btn_home_point)
    void onPointClicked(){

    }

    @OnClick(R.id.btn_home_coupon)
    void onCouponClicked(){

    }

    @OnClick(R.id.btn_home_cart)
    void onCartClicked(){

    }

    @OnClick(R.id.btn_home_list)
    void onListClicked(){

    }

    @OnClick(R.id.btn_home_love)
    void onLoveClicked(){

    }

    @OnClick(R.id.btn_home_talk)
    void onTalkClicked(){

    }
    @OnClick(R.id.btn_home_board)
    void onBoardClicked(){

    }

    @OnClick(R.id.btn_home_event)
    void onEventClicked(){

    }

    @OnClick(R.id.btn_home_advertisement)
    void onAdvertisementClicked(){

    }

    @OnClick(R.id.btn_home_protect)
    void onProtectClicked(){

    }

    @OnClick(R.id.btn_home_call)
    void onCallClicked(){

    }

    @OnClick(R.id.btn_home_setting)
    void onSettingClicked(){

    }

    @OnClick(R.id.li_home_call)
    void onLiCallClicked(){

    }

    @OnClick(R.id.li_home_store)
    void onliSettingClicked(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        ButterKnife.bind(this);

        int displayWidth = getResources().getDisplayMetrics().widthPixels;

        DrawerLayout.LayoutParams params = new DrawerLayout.LayoutParams(
                displayWidth,
                WindowManager.LayoutParams.MATCH_PARENT
        );

        params.gravity = Gravity.START;



        navigationView.setLayoutParams(params);
    }
}
