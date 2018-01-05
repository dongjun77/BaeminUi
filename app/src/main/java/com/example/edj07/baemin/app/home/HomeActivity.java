package com.example.edj07.baemin.app.home;

import android.content.Intent;
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
import android.widget.TextView;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.app.home.banner.HomeBannerContainer;
import com.example.edj07.baemin.app.home.category.HomeCategoryContainer;
import com.example.edj07.baemin.app.home.menu.HomeMenuContainer;
import com.example.edj07.baemin.app.home.search.HomeSearchContainer;
import com.example.edj07.baemin.app.home.todayfill.HomeTodayfillContainer;
import com.example.edj07.baemin.app.search.SearchActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    private ActionBarDrawerToggle drawerToggle;
    private DrawerLayout drawerList;

    @BindView(R.id.home_drawer_view) View navigationView;
    private HomeMenuContainer homeMenuContainer;


    @BindView(R.id.home_banner_view) View bannerView;
    private HomeContainerImpl bannerContainer;

    //    @BindView(R.id.rv_home_todayfill) RecyclerView rvTodayfill;

    @BindView(R.id.home_category_view) View categoryView;
    private HomeContainerImpl categoryContainer;


//    @BindDrawable(R.drawable.shape_home_todayfill_divider)
//    Drawable todayfillDrawableDivider;

    @BindView(R.id.home_todayfill_view)View todayfillView;
    private HomeContainerImpl todayfillContainer;

    @BindView(R.id.home_search_view)View searchView;
    private HomeContainerImpl searchContainer;

//    @BindView(R.id.rv_home_search) RecyclerView rvSearch;
//    private HomeSearchAdapter searchAdapter;
//    @BindDrawable(R.drawable.shape_home_search_divider)
//    Drawable searchDrawableDivider;


    boolean isDrawerOpened;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        ButterKnife.bind(this);

        initDrawer();

        bannerContainer = new HomeBannerContainer(bannerView);
        bannerContainer.loadItems();

//        initTodayfillRecycler();

        todayfillContainer = new HomeTodayfillContainer(todayfillView);
        todayfillContainer.loadItems();
//
        categoryContainer = new HomeCategoryContainer(categoryView);
        categoryContainer.loadItems();

        homeMenuContainer = new HomeMenuContainer(navigationView);

        TextView tv = (TextView)findViewById(R.id.tv_home_toolbar);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        searchContainer = new HomeSearchContainer(searchView);
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
