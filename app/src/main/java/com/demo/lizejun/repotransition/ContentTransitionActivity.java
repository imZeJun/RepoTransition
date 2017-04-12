package com.demo.lizejun.repotransition;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.transition.ChangeBounds;
import android.view.Window;
import com.demo.lizejun.repotransition.bean.GridItemBean;
import java.util.ArrayList;
import java.util.List;

public class ContentTransitionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_content_transition);
        initView();
        setUpTransition();
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
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_content);
        GridItemAdapter adapter = new GridItemAdapter(data, this);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setUpTransition() {
        Window window = getWindow();
        window.setSharedElementReenterTransition(new ChangeBounds());
    }

}
