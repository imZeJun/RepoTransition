package com.demo.lizejun.repotransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.demo.lizejun.repotransition.bean.GridItemBean;

import java.util.ArrayList;
import java.util.List;

public class NavigationBarActivity extends AppCompatActivity {


    private BottomNavigationBar mBottomNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_bar);
        initView();
        initViews();
    }

    private void initViews() {
        mBottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation);
        //1.设置Mode
        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        //2.设置BackgroundStyle
        mBottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        //3.设置背景色
        mBottomNavigationBar.setBarBackgroundColor(android.R.color.white);
        //4.设置每个Item
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_1, "Item 1").setActiveColorResource(android.R.color.holo_blue_dark));
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_2, "Item 2").setActiveColorResource(android.R.color.holo_green_dark));
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_3, "Item 3").setActiveColorResource(android.R.color.holo_orange_dark));
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_4, "Item 4").setActiveColorResource(android.R.color.holo_green_dark));
        BadgeItem badgeItem = new BadgeItem()
                .setBackgroundColorResource(android.R.color.holo_red_dark) //设置角标背景色
                .setText("5") //设置角标的文字
                .setTextColorResource(android.R.color.white) //设置角标文字颜色
                .setHideOnSelect(true); //在选中时是否隐藏角标
        mBottomNavigationBar.addItem(new BottomNavigationItem(R.drawable.ic_5, "Item 5").setActiveColorResource(android.R.color.holo_orange_dark).setBadgeItem(badgeItem));
        mBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {

            @Override
            public void onTabSelected(int position) {
                Log.d("onTabSelected", "position=" + position);
            }

            @Override
            public void onTabUnselected(int position) {
                Log.d("onTabUnselected", "position=" + position);

            }

            @Override
            public void onTabReselected(int position) {
                Log.d("onTabReselected", "position=" + position);

            }
        });
        //5.初始化
        mBottomNavigationBar.initialise();
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
