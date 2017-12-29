package com.example.edj07.baemin.app.home;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.app.home.banner.HomeBannerContainerimpl;
import com.example.edj07.baemin.app.home.category.HomeCategoryContainerimpl;
import com.example.edj07.baemin.app.home.search.HomeSearchContainerimpl;
import com.example.edj07.baemin.app.home.todayfill.HomeTodayfillContainerimpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_drawer_view) View navigationView;
    private ActionBarDrawerToggle drawerToggle;
    private DrawerLayout drawerList;

    @BindView(R.id.home_banner_view) View bannerView;
    private HomeBannerContainerimpl bannerContainer;

    //    @BindView(R.id.rv_home_todayfill) RecyclerView rvTodayfill;

    @BindView(R.id.home_category_view) View categoryView;
    private HomeCategoryContainerimpl categoryContainer;


//    @BindDrawable(R.drawable.shape_home_todayfill_divider)
//    Drawable todayfillDrawableDivider;

    @BindView(R.id.home_todayfill_view)View todayfillView;
    private HomeTodayfillContainerimpl todayfillContainer;

    @BindView(R.id.home_search_view)View searchView;
    private HomeSearchContainerimpl searchContainer;

//    @BindView(R.id.rv_home_search) RecyclerView rvSearch;
//    private HomeSearchAdapter searchAdapter;
//    @BindDrawable(R.drawable.shape_home_search_divider)
//    Drawable searchDrawableDivider;


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

        initDrawer();

        bannerContainer = new HomeBannerContainerimpl(bannerView);
        bannerContainer.loadItems();

//        initTodayfillRecycler();

        todayfillContainer = new HomeTodayfillContainerimpl(todayfillView);
        todayfillContainer.loadItems();
//
        categoryContainer = new HomeCategoryContainerimpl(categoryView);
        categoryContainer.loadItems();



        searchContainer = new HomeSearchContainerimpl(searchView);
        searchContainer.loadItems();

    }

    private void initDrawer(){
        int displayWidth = getResources().getDisplayMetrics().widthPixels;
        DrawerLayout.LayoutParams params = new DrawerLayout.LayoutParams(
                displayWidth,
                WindowManager.LayoutParams.MATCH_PARENT
        );
        params.gravity = Gravity.START;
        navigationView.setLayoutParams(params);
        Log.d("TAG", "initDrawer: "+params);


        Toolbar toolbar =(Toolbar) findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawerList = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(
                this,
                drawerList,
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

        drawerList.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle.syncState();
    }









    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (isDrawerOpened){
            drawerList.closeDrawers();
        }else{
            super.onBackPressed();
        }
    }
}
