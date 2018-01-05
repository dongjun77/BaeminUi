package com.example.edj07.baemin.app.home.menu;

import android.content.Intent;
import android.view.View;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.app.home.HomeContainerImpl;
import com.example.edj07.baemin.util.Defines;

import butterknife.OnClick;

/**
 * Created by edj07 on 2017-12-29.
 */

public class HomeMenuContainer extends HomeContainerImpl {

    @OnClick(R.id.btn_home_point)
    void onPointClicked(View v){
        Intent intent = new Intent(Defines.INTENT_SPLASH_ACTIVITY);
        v.getContext().startActivity(intent);
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

//    @OnClick(R.id.tv_home_toolbar)
//    void onToolbarClicked(){
//
//    }

    public HomeMenuContainer(View contentView) {
        super(contentView);
    }

}
