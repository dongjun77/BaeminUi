package com.example.edj07.baemin.app.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.edj07.baemin.R;

import butterknife.BindView;

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.rv_search)RecyclerView rvSearch;
//    private SearchAdapter searchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);

//        LinearLayoutManager searchLayoutManager = new LinearLayoutManager(this);
//        searchLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        rvSearch.setLayoutManager(searchLayoutManager);
//
//        searchAdapter = new SearchAdapter();
//        rvSearch.setAdapter(searchAdapter);
//
//        List<String> images = new ArrayList<>();
//        images.add("범박동");
//        images.add("범박동");
//        images.add("범박동");
//        images.add("범박동");
//        images.add("범박동");
//        searchAdapter.setItems(images);
    }
}
