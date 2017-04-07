package com.demo.lizejun.repotransition.utils;

import android.app.Activity;
import android.support.v4.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Utils {

    public static Pair<View, String>[] createPair(Activity activity, boolean includeSBar, Pair... otherParticipants) {
        View decor = activity.getWindow().getDecorView();
        View statusBar = null;
        if (includeSBar) {
            statusBar = decor.findViewById(android.R.id.statusBarBackground);
        }
        View navBar = decor.findViewById(android.R.id.navigationBarBackground);
        List<Pair> participants = new ArrayList<>(3);
        addNonNullViewToTransitionParticipants(statusBar, participants);
        addNonNullViewToTransitionParticipants(navBar, participants);
        if (otherParticipants != null && !(otherParticipants.length == 1 && otherParticipants[0] == null)) {
            participants.addAll(Arrays.asList(otherParticipants));
        }
        return participants.toArray(new Pair[participants.size()]);
    }

    private static void addNonNullViewToTransitionParticipants(View view, List<Pair> participants) {
        if (view == null) {
            return;
        }
        participants.add(new Pair<>(view, view.getTransitionName()));
    }
}
