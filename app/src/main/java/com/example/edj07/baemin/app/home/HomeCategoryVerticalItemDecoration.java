package com.example.edj07.baemin.app.home;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by edj07 on 2017-12-15.
 */

public class HomeCategoryVerticalItemDecoration extends RecyclerView.ItemDecoration {


    private Drawable divider;
    public HomeCategoryVerticalItemDecoration(Drawable divider) {
        this.divider = divider;
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        final int left = parent.getPaddingLeft();
        final int right = parent.getWidth() - parent.getPaddingRight();

        final int childCount = parent.getChildCount();
        for (int i = 0; i<childCount; i++){
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams)child.getLayoutParams();
            final int top = child.getBottom() + params.bottomMargin;
            final int bottom = top +divider.getIntrinsicHeight();
            divider.setBounds(left, top,right,bottom);
            divider.draw(c);
        }
    }



}
