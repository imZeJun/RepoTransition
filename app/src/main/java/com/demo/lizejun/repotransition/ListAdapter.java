package com.demo.lizejun.repotransition;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.demo.lizejun.repotransition.bean.GridItemBean;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    private List<GridItemBean> mTitles;

    public ListAdapter(List<GridItemBean> titles) {
        mTitles = titles;
    }

    @Override
    public int getCount() {
        return mTitles.size();
    }

    @Override
    public Object getItem(int position) {
        return mTitles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        }
        ImageView iv = (ImageView) convertView.findViewById(R.id.iv_icon);
        TextView tv = (TextView) convertView.findViewById(R.id.tv_title);
        GridItemBean bean = mTitles.get(position);
        iv.setImageResource(bean.getIcon());
        tv.setText(bean.getTitle());
        return convertView;
    }
}
