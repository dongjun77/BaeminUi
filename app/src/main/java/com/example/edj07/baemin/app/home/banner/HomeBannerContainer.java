package com.example.edj07.baemin.app.home.banner;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.edj07.baemin.R;
import com.example.edj07.baemin.app.home.HomeContainerImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by edj07 on 2017-12-15.
 */

public class HomeBannerContainer extends HomeContainerImpl {


    @BindView(R.id.tv_home_banner_position) TextView tvBannerPosition;
    @BindView(R.id.rv_home_banner) RecyclerView rvBanner;
    private HomeBannerAdapter bannerAdapter;

    public HomeBannerContainer(View contentView) {
        super(contentView);
    }

    @Override
    protected void initRecycler(Context context) {
        LinearLayoutManager BannerLayoutManager = new LinearLayoutManager(context);
        BannerLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        Log.d("TAG", "initBannerRecycler: banner"+(BannerLayoutManager == null));
        Log.d("TAG", "initBannerRecycler: banner"+(rvBanner == null));

        rvBanner.setLayoutManager(BannerLayoutManager);


        bannerAdapter = new HomeBannerAdapter();

        PagerSnapHelper helper = new PagerSnapHelper();
        helper.attachToRecyclerView(rvBanner);
        rvBanner.setNestedScrollingEnabled(false);
        rvBanner.setHasFixedSize(true);
        rvBanner.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                LinearLayoutManager layoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
//                int firstVisibleItem = layoutManager.findFirstVisibleItemPosition();
//                tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, recyclerView.getAdapter().getItemCount())); // 계속 호출한다 스크롤할때마다.
////                tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, bannerAdapter.getItemCount())); 외부에서 카운트 가져온다 위에는 내부에서 카운트
//            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    LinearLayoutManager layoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
                    int firstVisibleItem = layoutManager.findFirstVisibleItemPosition();
                    tvBannerPosition.setText(String.format("%d / %d ",firstVisibleItem + 1, recyclerView.getAdapter().getItemCount())); // 계속 호출한다 스크롤할때마다.
                }
            }
        });

        rvBanner.setAdapter(bannerAdapter);
    }

    @Override
    public void loadItems(){
        List<String> images = new ArrayList<>();
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSxAi8dcGMEHIXFmUsy1zaACg0NDn3Ta_ZV0woVz2aFVzqMJpFGQ");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHUvbj4AfRlc5PjdKSMr2iPvUq_2k5j3d6AhQU_NFg5fyJIUOB7w");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoJVUxNQzHoBNwWb9RCTY1Hp1fIEHycheuZpcN02HMNO2GLs40");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR03AlHVofsroDfMutMP8z-Tp-S-ywyTazBB7YAcDgbzokqLGtfJw");
        bannerAdapter.setItems(images);
        tvBannerPosition.setText(String.format("1 / %d", bannerAdapter.getItemCount()));
    }
}
