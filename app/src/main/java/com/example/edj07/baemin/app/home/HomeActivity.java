package com.example.edj07.baemin.app.home;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.example.edj07.baemin.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_drawer_view) View navigationView;

    private ActionBarDrawerToggle DrawerToggle;
    private DrawerLayout DrawerList;

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

    boolean isDrawerOpened;

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


        Toolbar toolbar =(Toolbar) findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        DrawerList = (DrawerLayout) findViewById(R.id.drawer_layout);
        DrawerToggle = new ActionBarDrawerToggle(
                this,
                DrawerList,
                R.string.drawer_open,
                R.string.drawer_close
        ) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                isDrawerOpened=true;
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                isDrawerOpened=false;
            }
        };

        DrawerList.addDrawerListener(DrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        DrawerToggle.syncState();


        navigationView.setLayoutParams(params);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (DrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (isDrawerOpened){
            DrawerList.closeDrawers();
        }else{
            super.onBackPressed();
        }
    }
}
