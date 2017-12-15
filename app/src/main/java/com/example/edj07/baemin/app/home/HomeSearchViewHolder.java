package com.example.edj07.baemin.app.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.edj07.baemin.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edj07 on 2017-12-11.
 */

public class HomeSearchViewHolder extends RecyclerView.ViewHolder {

    public static HomeSearchViewHolder newInstance(ViewGroup parent){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_search_item,parent,false);
        return new HomeSearchViewHolder(itemView);
    }

    @BindView(R.id.tv_home_Search_item)
    TextView tvItem;

    public HomeSearchViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindItem(String string){
        tvItem.setText(string);
    }
}
