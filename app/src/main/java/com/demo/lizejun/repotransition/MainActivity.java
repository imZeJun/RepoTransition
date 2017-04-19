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
        startActivity(ContentTransitionOriginalActivity.class);
    }

    public void startAppBarLayoutDemo(View view) {
        startActivity(AppBarLayoutActivity.class);
    }

    public void startBottomSheetDemo(View view) {
        startActivity(BottomSheetActivity.class);
    }

    public void startFABDemo(View view) {
        startActivity(FABActivity.class);
    }

    public void startDrawerDemo(View view) {
        startActivity(DrawerLayoutActivity.class);
    }

    public void startSnackBarDemo(View view) {
        startActivity(SnackBarActivity.class);
    }

    public void startNavigationBar(View view) {
        startActivity(NavigationBarActivity.class);
    }

    public void startTabLayout(View view) {
        startActivity(TabLayoutActivity.class);
    }

    public void textInputLayoutActivity(View view) {
        startActivity(TextInputActivity.class);
    }

    public void vectorDrawable(View view) {
        startActivity(VectorDrawableActivity.class);
    }

    private void startActivity(Class className) {
        Intent intent = new Intent(this, className);
        startActivity(intent);
    }

}
