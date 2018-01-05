package com.example.edj07.baemin.app.home.category;

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

public class HomeCategoryContainer extends HomeContainerImpl{

    @BindView(R.id.rv_home_category) RecyclerView rvCategory;
    private HomeCategoryAdapter categoryAdapter;
    @BindDrawable(R.drawable.shape_home_category_divider)
    Drawable categoryDrawableDivider;

    public HomeCategoryContainer(View contentView) {
        super(contentView);
    }

    @Override
    protected void initRecycler(Context context) {
        GridLayoutManager layoutManager = new GridLayoutManager(context , 3);

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
                new HomeCategoryVerticalItemDecoration(ContextCompat.getDrawable(context, R.drawable.shape_home_category_divider)));

        rvCategory.addItemDecoration(
                new HomeCategoryHorizontalItemDecoration(ContextCompat.getDrawable(context,R.drawable.shape_home_category_divider)));

        categoryAdapter = new HomeCategoryAdapter();


        rvCategory.setAdapter(categoryAdapter);
    }

    public void loadItems(){
        List<String> images = new ArrayList<>();
        for (int i = 0; i<14; i++){

            images.add("http://news20.busan.com/content/image/2017/08/23/20170823000179_0.jpg");
        }
        categoryAdapter.setItems(images);
    }


}
