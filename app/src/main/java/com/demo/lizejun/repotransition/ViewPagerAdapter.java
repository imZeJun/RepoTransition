package com.demo.lizejun.repotransition;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {

    private List<String> mTitles;

    public ViewPagerAdapter(List<String> title) {
        mTitles = title;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ViewGroup itemView = (ViewGroup) LayoutInflater.from(container.getContext()).inflate(R.layout.item_view_pager, container, false);
        container.addView(itemView);
        TextView tv = (TextView) itemView.findViewById(R.id.tv_title);
        tv.setText(mTitles.get(position));
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return mTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
