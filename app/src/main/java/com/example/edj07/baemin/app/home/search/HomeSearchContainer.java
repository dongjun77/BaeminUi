package com.example.edj07.baemin.app.home.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.app.home.HomeContainerImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindDrawable;
import butterknife.BindView;

/**
 * Created by edj07 on 2017-12-18.
 */

public class HomeSearchContainer extends HomeContainerImpl{

    @BindView(R.id.rv_home_search)RecyclerView rvSearch;
    private HomeSearchAdapter searchAdapter;
    @BindDrawable(R.drawable.shape_home_search_divider)Drawable searchDrawableDivider;

    public HomeSearchContainer(View contentView) {
        super(contentView);
    }

    @Override
    protected void initRecycler(Context context) {
        GridLayoutManager layoutManager = new GridLayoutManager(context, 3);
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
                new HomeSearchHorizontalItemDecoraion(ContextCompat.getDrawable(context, R.drawable.shape_home_search_divider))
        );
        rvSearch.addItemDecoration(
                new HomeSearchVerticalItemDecoration(ContextCompat.getDrawable(context,R.drawable.shape_home_search_divider))
        );

        searchAdapter = new HomeSearchAdapter();

        rvSearch.setAdapter(searchAdapter);
    }

    @Override
    public void loadItems() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i<14; i++){

            strings.add("배민라이더스");
        }

        searchAdapter.setItems(strings);
    }
}
