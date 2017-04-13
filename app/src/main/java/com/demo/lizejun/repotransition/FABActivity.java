package com.demo.lizejun.repotransition;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.demo.lizejun.repotransition.bean.GridItemBean;
import java.util.ArrayList;
import java.util.List;

public class FABActivity extends AppCompatActivity {

    private FloatingActionButton mFab;
    private CoordinatorLayout mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        initView();
        mRootView = (CoordinatorLayout) findViewById(R.id.cl_root);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mRootView, "点击Fab", Snackbar.LENGTH_LONG).show();
            }
        });

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
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_content);
        GridItemAdapter adapter = new GridItemAdapter(data, this);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
