package com.demo.lizejun.repotransition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startContentTransitionDemo(View view) {
        startActivity(ContentTransitionActivity.class);
    }

    private void startActivity(Class className) {
        Intent intent = new Intent(this, className);
        startActivity(intent);
    }

}
