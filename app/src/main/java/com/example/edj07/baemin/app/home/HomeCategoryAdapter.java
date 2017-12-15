package com.example.edj07.baemin.app.home;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edj07 on 2017-12-08.
 */

public class HomeCategoryAdapter extends RecyclerView.Adapter<HomeCategoryViewHolder> {

    private List<String> items = new ArrayList<>();

    public void setItems(List<String> items){
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public HomeCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return HomeCategoryViewHolder.newInstance(parent);
    }

    @Override
    public void onBindViewHolder(HomeCategoryViewHolder holder, int position) {
        holder.bindItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
