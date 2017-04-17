package com.demo.lizejun.repotransition;

import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SnackBarActivity extends AppCompatActivity {

    private CoordinatorLayout mCoordinatorLayout;
    private Snackbar mSnackBarRootView;
    private View mShowSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.cl_root);
        mShowSnackBar = findViewById(R.id.show_snack_bar);
    }

    public void showSnackBar(View view) {
        mSnackBarRootView = Snackbar.make(mCoordinatorLayout, "MessageView", Snackbar.LENGTH_INDEFINITE);
        mSnackBarRootView.setActionTextColor(getResources().getColor(android.R.color.holo_orange_dark));
        mSnackBarRootView.setAction("ActionView", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mSnackBarRootView", "click ActionView");
            }
        });
        changeSnackBarBackgroundColor(mSnackBarRootView);
        changeSnackBarMessageViewTextColor(mSnackBarRootView);
        mSnackBarRootView.show();
    }

    private void changeSnackBarBackgroundColor(Snackbar snackbar) {
        View view = snackbar.getView();
        view.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
    }

    private void changeSnackBarMessageViewTextColor(Snackbar snackbar) {
        ViewGroup viewGroup = (ViewGroup) snackbar.getView();
        SnackbarContentLayout contentLayout = (SnackbarContentLayout) viewGroup.getChildAt(0);
        TextView textView = (TextView) contentLayout.getChildAt(0);
        textView.setTextColor(getResources().getColor(android.R.color.darker_gray));
    }
}
