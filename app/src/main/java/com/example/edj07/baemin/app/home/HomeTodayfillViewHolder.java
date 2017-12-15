package com.example.edj07.baemin.app.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.edj07.baemin.R;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-07.
 */

public class HomeTodayfillViewHolder extends RecyclerView.ViewHolder {

    public static HomeTodayfillViewHolder newInstance(ViewGroup parent){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_todayfill_item,parent,false);
        return new HomeTodayfillViewHolder(itemView);
    }

    @BindView(R.id.iv_home_todayfill_simpleitem)SimpleDraweeView ivSimpleItem;
    @BindView(R.id.tv_home_todayfill_titleitem)TextView ivTitleItem;
    @BindView(R.id.tv_home_todayfill_tagitem)TextView ivTagItem;

    public HomeTodayfillViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindItem(String imageUri){
        ivSimpleItem.setImageURI(imageUri);
    }
}
