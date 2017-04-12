package com.demo.lizejun.repotransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.lizejun.repotransition.transition.CustomContentTransition;

public class CTTargetActivity extends Activity {

    public static final String KEY_ICON = "key_icon";
    public static final String KEY_TITLE = "key_title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_ct_target);
        setUpViews();
        setUpNormalTransition();
    }

    private void setUpViews() {
        Intent intent = getIntent();
        ImageView iv = (ImageView) findViewById(R.id.iv_header);
        TextView tv = (TextView) findViewById(R.id.tv_header);
        iv.setImageResource(intent.getIntExtra(KEY_ICON, R.drawable.ic_1));
        tv.setText(intent.getStringExtra(KEY_TITLE));
    }

    private void setUpNormalTransition() {
        Window window = getWindow();
        CustomContentTransition contentTransition = new CustomContentTransition();
        contentTransition.addTarget(R.id.iv_bg);
        contentTransition.addTarget(R.id.tv_header);
        contentTransition.addTarget(R.id.iv_header);
        contentTransition.addTarget(R.id.tv_content);
        contentTransition.setDuration(500);
        window.setSharedElementReturnTransition(new ChangeBounds());
    }

}
