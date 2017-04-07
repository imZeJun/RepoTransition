package com.demo.lizejun.repotransition;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Window;

public class CTTargetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct_target);
        setUpTransition();
    }

    private void setUpTransition() {
        Window window = getWindow();
        window.setEnterTransition(new Fade());
        window.setExitTransition(null);
        window.setReturnTransition(new Slide());
        window.setReenterTransition(null);
    }

}
