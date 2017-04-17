package com.demo.lizejun.repotransition;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {

    private static final String[] TITLE_SHORT = new String[] {
            "深圳","南京","上海"
    };

    private static final String[] TITLE_LONG = new String[] {
            "深圳","南京","内蒙古呼和浩特","广西壮族自治区","上海","北京","天津"
    };

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initViewPager();
        initTabLayout();
    }

    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.vp_content);
        List<String> titles = new ArrayList<>();
        Collections.addAll(titles, TITLE_LONG);
        mViewPagerAdapter = new ViewPagerAdapter(titles);
        mViewPager.setAdapter(mViewPagerAdapter);
    }

    private void initTabLayout() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }

}
