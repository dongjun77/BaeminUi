//package com.example.edj07.baemin.app.search;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.ViewGroup;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by edj07 on 2018-01-05.
// */
//
//public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder>{
//
//    private List<String> items = new ArrayList<>();
//
//    public void setItems(List<String> items){
//        this.items.clear();
//        this.items.addAll(items);
//        notifyDataSetChanged();
//    }
//
////    public void filter(String charText) {
////        charText = charText.toLowerCase(Locale.getDefault());
////        items.clear();
////        if (charText.length() == 0) {
////            items.addAll(arrayList);
////        } else {
////            for (Recent recent : arrayList) {
////                String name = recent.getAddress();
////                if (name.toLowerCase().contains(charText)) {
////                    items.add(recent);
////                }
////            }
////        }
////        notifyDataSetChanged();
////    }
//
//    @Override
//    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return SearchViewHolder.newInstance(parent);
//    }
//
//    @Override
//    public void onBindViewHolder(SearchViewHolder holder, int position) {
//        holder.bindItem(items.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//}
