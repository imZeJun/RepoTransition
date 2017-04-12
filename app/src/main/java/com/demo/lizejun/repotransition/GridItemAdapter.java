package com.demo.lizejun.repotransition;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.demo.lizejun.repotransition.bean.GridItemBean;
import java.util.ArrayList;
import java.util.List;

public class GridItemAdapter extends RecyclerView.Adapter<GridItemAdapter.GridItemViewHolder> {

    private List<GridItemBean> mItems;
    private Activity mActivity;

    public GridItemAdapter(List<GridItemBean> items, Activity activity) {
        mItems = items;
        mActivity = activity;
    }

    @Override
    public GridItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new GridItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final GridItemViewHolder holder, int position) {
        GridItemBean bean = mItems.get(position);
        holder.mImageView.setImageResource(bean.getIcon());
        holder.mTitle.setText(bean.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTargetActivity(holder);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class GridItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;
        private TextView mTitle;

        GridItemViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_icon);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }

    private void startTargetActivity(GridItemViewHolder viewHolder) {
        ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(mActivity,
                Pair.create((View) viewHolder.mImageView, mActivity.getString(R.string.transition_icon_shared)),
                Pair.create((View) viewHolder.mTitle, mActivity.getString(R.string.transition_title_shared)));
        Intent intent = new Intent(mActivity, CTTargetActivity.class);
        GridItemBean bean = mItems.get(viewHolder.getAdapterPosition());
        intent.putExtra(CTTargetActivity.KEY_ICON, bean.getIcon());
        intent.putExtra(CTTargetActivity.KEY_TITLE, bean.getTitle());
        mActivity.startActivity(intent, compat.toBundle());
    }
}
