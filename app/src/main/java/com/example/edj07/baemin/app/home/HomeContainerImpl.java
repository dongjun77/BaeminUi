package com.example.edj07.baemin.app.home;

import android.content.Context;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-29.
 */

public abstract class HomeContainerImpl {

    public HomeContainerImpl(View contentView){
        ButterKnife.bind(this,contentView);
        initRecycler(contentView.getContext());
    }

    protected void initRecycler(Context context){}
    public void loadItems(){
    }//앱스트랙트는 의무를 준다.

}
