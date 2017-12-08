package com.example.edj07.baemin.app.home;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edj07 on 2017-12-07.
 */

public class HomeTodayfillAdapter extends RecyclerView.Adapter<HomeTodayfillViewHolder> {

    private List<String> items = new ArrayList<>();

    public void setItems(List<String> items){
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public HomeTodayfillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return HomeTodayfillViewHolder.newInstance(parent);
    }

    @Override
    public void onBindViewHolder(HomeTodayfillViewHolder holder, int position) {
        holder.bindItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
