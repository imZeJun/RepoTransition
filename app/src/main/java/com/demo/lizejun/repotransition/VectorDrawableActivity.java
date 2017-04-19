package com.demo.lizejun.repotransition;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VectorDrawableActivity extends AppCompatActivity {

    private ImageView mAnimateView;
    private AnimatedVectorDrawable mAnimatedVectorDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_drawable);
        mAnimateView = (ImageView) findViewById(R.id.iv_dynamic);
        mAnimatedVectorDrawable = (AnimatedVectorDrawable) mAnimateView.getDrawable();
        mAnimateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimatedVectorDrawable.start();
            }
        });
    }
}
