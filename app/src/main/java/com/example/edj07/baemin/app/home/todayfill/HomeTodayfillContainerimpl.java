package com.example.edj07.baemin.app.home.todayfill;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.edj07.baemin.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-18.
 */

public class HomeTodayfillContainerimpl implements HomeTodayfillContainer {

    @BindView(R.id.rv_home_todayfill)RecyclerView rvTodayfill;
    private HomeTodayfillAdapter todayfillAdapter;

    public HomeTodayfillContainerimpl(View contentView) {
        ButterKnife.bind(contentView);
        initTodayfillRecycler(contentView.getContext());
    }

    public void initTodayfillRecycler(Context context){
        LinearLayoutManager todayLayoutManager = new LinearLayoutManager(context);
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
                new HomeTodayfillHorizontalItemDecoration(ContextCompat.getDrawable(context, R.drawable.shape_home_todayfill_divider))
        );


    }

    @Override
    public void loadItems() {
        List<String> images = new ArrayList<>();
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxAi8dcGMEHIXFmUsy1zaACg0NDn3Ta_ZV0woVz2aFVzqMJpFGQ");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHUvbj4AfRlc5PjdKSMr2iPvUq_2k5j3d6AhQU_NFg5fyJIUOB7w");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoJVUxNQzHoBNwWb9RCTY1Hp1fIEHycheuZpcN02HMNO2GLs40");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        todayfillAdapter.setItems(images);
    }
}
