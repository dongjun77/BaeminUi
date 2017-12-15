package com.example.edj07.baemin.app.home;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by edj07 on 2017-12-15.
 */

public class HomeTodayfillHorizontalItemDecoration extends RecyclerView.ItemDecoration {

    private Drawable divider;
    public HomeTodayfillHorizontalItemDecoration(Drawable divider) {
        this.divider = divider;
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {

        final int top = parent.getPaddingTop();
        final int bottom = parent.getHeight() - parent.getPaddingBottom();

        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params = (RecyclerView.LayoutParams)child.getLayoutParams();
            final int left = child.getLeft() + params.rightMargin;
            final int right = left + divider.getIntrinsicWidth();
            divider.setBounds(left,top,right,bottom);
            divider.draw(c);
        }

//        View child = parent.getChildAt(parent.getChildCount()+1);
//        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams)child.getLayoutParams();
//        int left = child.getLeft() + params.rightMargin;
//        int right = left + divider.getIntrinsicWidth();
//        divider.setBounds(left,top,right,bottom);
//        divider.draw(c);



    }
}
