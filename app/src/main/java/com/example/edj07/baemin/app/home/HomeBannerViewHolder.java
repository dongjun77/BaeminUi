package com.example.edj07.baemin.app.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edj07.baemin.R;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-05.
 */

public class HomeBannerViewHolder extends RecyclerView.ViewHolder {

    public static HomeBannerViewHolder newInstance(ViewGroup parent){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_banner_item,parent,false);
        return new HomeBannerViewHolder(itemView);
    }

    @BindView(R.id.iv_home_banner_item)
    SimpleDraweeView ivItem;

    public HomeBannerViewHolder(View itemView){
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindItem(String imageUri){
        ivItem.setImageURI(imageUri);
    }

}
