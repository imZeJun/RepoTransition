package com.demo.lizejun.repotransition.transition;


import android.animation.Animator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class LogFadeTransition extends Visibility {

    private static final String TAG = "LogFadeTransition";

    @Override
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Log.d(TAG, "captureStartValues, view=" + transitionValues.view.getTag());
    }

    @Override
    public void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        Log.d(TAG, "captureEndValues, view=" + transitionValues.view.getTag());
    }

    @Override
    public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        Log.d(TAG, "onAppear, view=" + view.getTag());
        return super.onAppear(sceneRoot, view, startValues, endValues);

    }

    @Override
    public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        Log.d(TAG, "onDisappear, view=" + view.getTag());
        return super.onDisappear(sceneRoot, view, startValues, endValues);
    }
}
