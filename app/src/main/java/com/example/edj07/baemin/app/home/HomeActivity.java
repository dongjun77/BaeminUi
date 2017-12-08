package com.example.edj07.baemin.app.home;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.edj07.baemin.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.home_drawer_view) View navigationView;
    private ActionBarDrawerToggle drawerToggle;
    private DrawerLayout drawerList;


    @BindView(R.id.tv_home_banner_position) TextView tvBannerPosition;
    @BindView(R.id.rv_home_banner) RecyclerView rvBanner;
    private HomeBannerAdapter bannerAdapter;


    @BindView(R.id.rv_home_todayfill) RecyclerView rvTodayfill;
    private HomeTodayfillAdapter todayfillAdapter;

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

        initBannerRecycler();

        initDrawer();

        initTodayfillRecycler();



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

    private void initBannerRecycler(){
        LinearLayoutManager BannerLayoutManager = new LinearLayoutManager(this);
        BannerLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rvBanner.setLayoutManager(BannerLayoutManager);

        bannerAdapter = new HomeBannerAdapter();
        rvBanner.setAdapter(bannerAdapter);

        PagerSnapHelper helper = new PagerSnapHelper();
        helper.attachToRecyclerView(rvBanner);
        rvBanner.setNestedScrollingEnabled(false);
        rvBanner.setHasFixedSize(true);
        rvBanner.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                LinearLayoutManager layoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
//                int firstVisibleItem = layoutManager.findFirstVisibleItemPosition();
//                tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, recyclerView.getAdapter().getItemCount())); // 계속 호출한다 스크롤할때마다.
////                tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, bannerAdapter.getItemCount())); 외부에서 카운트 가져온다 위에는 내부에서 카운트
//            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    LinearLayoutManager layoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
                    int firstVisibleItem = layoutManager.findFirstVisibleItemPosition();
                    tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, recyclerView.getAdapter().getItemCount())); // 계속 호출한다 스크롤할때마다.
                }
            }
        });

        List<String> images = new ArrayList<>();
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxAi8dcGMEHIXFmUsy1zaACg0NDn3Ta_ZV0woVz2aFVzqMJpFGQ");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHUvbj4AfRlc5PjdKSMr2iPvUq_2k5j3d6AhQU_NFg5fyJIUOB7w");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoJVUxNQzHoBNwWb9RCTY1Hp1fIEHycheuZpcN02HMNO2GLs40");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        bannerAdapter.setItems(images);
        tvBannerPosition.setText(String.format("1 / %d", bannerAdapter.getItemCount()));
    }

    private void initTodayfillRecycler(){
        LinearLayoutManager todayLayoutManager = new LinearLayoutManager(this);
        todayLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rvTodayfill.setLayoutManager(todayLayoutManager);

        todayfillAdapter = new HomeTodayfillAdapter();
        rvTodayfill.setAdapter(todayfillAdapter);

        PagerSnapHelper todayHelper = new PagerSnapHelper();
        todayHelper.attachToRecyclerView(rvTodayfill);
        rvTodayfill.setNestedScrollingEnabled(false);
        rvTodayfill.setHasFixedSize(true);

        List<String> images2 = new ArrayList<>();
        images2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        images2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxAi8dcGMEHIXFmUsy1zaACg0NDn3Ta_ZV0woVz2aFVzqMJpFGQ");
        images2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHUvbj4AfRlc5PjdKSMr2iPvUq_2k5j3d6AhQU_NFg5fyJIUOB7w");
        images2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoJVUxNQzHoBNwWb9RCTY1Hp1fIEHycheuZpcN02HMNO2GLs40");
        images2.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        todayfillAdapter.setItems(images2);
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
