//package com.example.edj07.baemin.app.search;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.edj07.baemin.R;
//
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// * Created by edj07 on 2018-01-05.
// */
//
//public class SearchViewHolder extends RecyclerView.ViewHolder{
//
//    public static SearchViewHolder newInstance(ViewGroup parent){
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_main_item,parent,false);
//        return new SearchViewHolder(itemView);
//    }
//
//    @BindView(R.id.iv_search_item)ImageView ivSearchItem;
//    @BindView(R.id.tv_search_item)TextView tvSearchItem;
//
//    public SearchViewHolder(View itemView) {
//        super(itemView);
//        ButterKnife.bind(this,itemView);
//    }
//
//    public void bindItem(String address){
//        tvSearchItem.setText(address);
//    }
//}
