package com.example.edj07.baemin.app.home.category;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edj07.baemin.R;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-08.
 */

public class HomeCategoryViewHolder extends RecyclerView.ViewHolder {

    public static HomeCategoryViewHolder newInstance(ViewGroup parent){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_category_item,parent,false);
        return new HomeCategoryViewHolder(itemView);
    }

    @BindView(R.id.iv_home_categoryitem)
    SimpleDraweeView ivItem;

    public HomeCategoryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindItem(String imageUri){
        ivItem.setImageURI(imageUri);
    }
}
