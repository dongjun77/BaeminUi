package com.example.edj07.baemin.app.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
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

import butterknife.BindDrawable;
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
    @BindDrawable(R.drawable.shape_home_todayfill_divider)
    Drawable todayfillDrawableDivider;


    @BindView(R.id.rv_home_category) RecyclerView rvCategory;
    private HomeCategoryAdapter categoryAdapter;
    @BindDrawable(R.drawable.shape_home_category_divider)
    Drawable categoryDrawableDivider;


    @BindView(R.id.rv_home_search) RecyclerView rvSearch;
    private HomeSearchAdapter searchAdapter;
    @BindDrawable(R.drawable.shape_home_search_divider)
    Drawable searchDrawableDivider;


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

        initBannerRecycler();
        initTodayfillRecycler();
        initCategoryRecycler();

        initSearchRecycler();

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
        rvBanner.setAdapter(bannerAdapter);
    }

    private void initCategoryRecycler(){
        GridLayoutManager layoutManager = new GridLayoutManager(this , 3);

//        Drawable horizontalDivider = ContextCompat.getDrawable(this, R.drawable.shape_home_category_divider);
//        Drawable verticalDivider = ContextCompat.getDrawable(this, R.drawable.shape_home_search_divider);

//        DividerItemDecoration itemDecorationVertical = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        DividerItemDecoration itemDecorationHorizontal = new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);

        rvCategory.setLayoutManager(layoutManager);

        rvCategory.setNestedScrollingEnabled(false);
        rvCategory.setHasFixedSize(true);

//        itemDecorationVertical.setDrawable(categoryDrawableDivider);
//        itemDecorationHorizontal.setDrawable(categoryDrawableDivider);

//        rvCategory.addItemDecoration(itemDecorationVertical);
//        rvCategory.addItemDecoration(itemDecorationHorizontal);

//        int spanCount = 3; //column 갯수
//        int spacing = 50; //50px
//        boolean includeEdge = true;
//        rvCategory.addItemDecoration(new HomeCategoryVerticalItemDecoration(spanCount,spacing,includeEdge));

        rvCategory.addItemDecoration(
                new HomeCategoryVerticalItemDecoration(ContextCompat.getDrawable(getApplicationContext(),R.drawable.shape_home_category_divider)));

        rvCategory.addItemDecoration(
                new HomeCategoryHorizontalItemDecoration(ContextCompat.getDrawable(getApplicationContext(),R.drawable.shape_home_category_divider)));

        categoryAdapter = new HomeCategoryAdapter();
        List<String> images = new ArrayList<>();
        for (int i = 0; i<14; i++){

            images.add("http://news20.busan.com/content/image/2017/08/23/20170823000179_0.jpg");
        }
        categoryAdapter.setItems(images);

        rvCategory.setAdapter(categoryAdapter);

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

//        DividerItemDecoration itemDecorationHorizontal = new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);
//        itemDecorationHorizontal.setDrawable(todayfillDrawableDivider);
//
//        rvTodayfill.addItemDecoration(itemDecorationHorizontal);

        rvTodayfill.addItemDecoration(
                new HomeTodayfillHorizontalItemDecoration(ContextCompat.getDrawable(getApplicationContext(),R.drawable.shape_home_todayfill_divider))
        );

        List<String> images = new ArrayList<>();
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxAi8dcGMEHIXFmUsy1zaACg0NDn3Ta_ZV0woVz2aFVzqMJpFGQ");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHUvbj4AfRlc5PjdKSMr2iPvUq_2k5j3d6AhQU_NFg5fyJIUOB7w");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoJVUxNQzHoBNwWb9RCTY1Hp1fIEHycheuZpcN02HMNO2GLs40");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        todayfillAdapter.setItems(images);
    }

    private void initSearchRecycler() {

        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        rvSearch.setLayoutManager(layoutManager);

        rvSearch.setNestedScrollingEnabled(false);
        rvSearch.setHasFixedSize(true);
//        DividerItemDecoration itemDecorationVertical = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
//        DividerItemDecoration itemDecorationHorizontal = new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL);

//        itemDecorationVertical.setDrawable(searchDrawableDivider);
//        itemDecorationHorizontal.setDrawable(searchDrawableDivider);
//
//        rvSearch.addItemDecoration(itemDecorationHorizontal);
//        rvSearch.addItemDecoration(itemDecorationVertical);

        rvSearch.addItemDecoration(
                new HomeSearchHorizontalItemDecoraion(ContextCompat.getDrawable(getApplicationContext(),R.drawable.shape_home_search_divider))
        );
        rvSearch.addItemDecoration(
                new HomeSearchVerticalItemDecoration(ContextCompat.getDrawable(getApplicationContext(),R.drawable.shape_home_search_divider))
        );

        searchAdapter = new HomeSearchAdapter();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i<14; i++){

            strings.add("배민라이더스");
        }

        searchAdapter.setItems(strings);
        rvSearch.setAdapter(searchAdapter);
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
