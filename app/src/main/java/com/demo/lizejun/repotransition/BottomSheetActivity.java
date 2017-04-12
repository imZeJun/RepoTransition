package com.demo.lizejun.repotransition;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.demo.lizejun.repotransition.bean.GridItemBean;

import java.util.ArrayList;
import java.util.List;

public class BottomSheetActivity extends AppCompatActivity {

    private View mBottomLayout;
    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        mBottomLayout = findViewById(R.id.bottom_sheet);
        mBottomSheetBehavior = BottomSheetBehavior.from(mBottomLayout);
        mBottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                Log.d("BottomSheet", "newState=" + newState);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                Log.d("BottomSheet", "onSlide=" + slideOffset);
            }
        });
        initView();
    }

    private void initView() {
        List<GridItemBean> data = new ArrayList<>();
        data.add(new GridItemBean(R.drawable.ic_1, "安全中心"));
        data.add(new GridItemBean(R.drawable.ic_2, "微信盒子"));
        data.add(new GridItemBean(R.drawable.ic_3, "微信好友"));
        data.add(new GridItemBean(R.drawable.ic_4, "微信朋友圈"));
        data.add(new GridItemBean(R.drawable.ic_5, "浏览器"));
        data.add(new GridItemBean(R.drawable.ic_6, "金牌"));
        data.add(new GridItemBean(R.drawable.ic_7, "铜牌"));
        data.add(new GridItemBean(R.drawable.ic_8, "银牌"));
        data.add(new GridItemBean(R.drawable.ic_1, "安全中心"));
        data.add(new GridItemBean(R.drawable.ic_2, "微信盒子"));
        data.add(new GridItemBean(R.drawable.ic_3, "微信好友"));
        data.add(new GridItemBean(R.drawable.ic_4, "微信朋友圈"));
        data.add(new GridItemBean(R.drawable.ic_5, "浏览器"));
        data.add(new GridItemBean(R.drawable.ic_6, "金牌"));
        data.add(new GridItemBean(R.drawable.ic_7, "铜牌"));
        data.add(new GridItemBean(R.drawable.ic_8, "银牌"));
        data.add(new GridItemBean(R.drawable.ic_1, "安全中心"));
        data.add(new GridItemBean(R.drawable.ic_2, "微信盒子"));
        data.add(new GridItemBean(R.drawable.ic_3, "微信好友"));
        data.add(new GridItemBean(R.drawable.ic_4, "微信朋友圈"));
        data.add(new GridItemBean(R.drawable.ic_5, "浏览器"));
        data.add(new GridItemBean(R.drawable.ic_6, "金牌"));
        data.add(new GridItemBean(R.drawable.ic_7, "铜牌"));
        data.add(new GridItemBean(R.drawable.ic_8, "银牌"));
        data.add(new GridItemBean(R.drawable.ic_1, "安全中心"));
        data.add(new GridItemBean(R.drawable.ic_2, "微信盒子"));
        data.add(new GridItemBean(R.drawable.ic_3, "微信好友"));
        data.add(new GridItemBean(R.drawable.ic_4, "微信朋友圈"));
        data.add(new GridItemBean(R.drawable.ic_5, "浏览器"));
        data.add(new GridItemBean(R.drawable.ic_6, "金牌"));
        data.add(new GridItemBean(R.drawable.ic_7, "铜牌"));
        data.add(new GridItemBean(R.drawable.ic_8, "银牌"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bottom_sheet);
        GridItemAdapter adapter = new GridItemAdapter(data, this);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void expandBottomSheet(View view) {
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void hideBottomSheet(View view) {
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
    }

    public void collapseBottomSheet(View view) {
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }


}
