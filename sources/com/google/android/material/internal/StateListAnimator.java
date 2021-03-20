package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StateListAnimator {
    private final Animator.AnimatorListener animationListener = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.runningAnimator == animator) {
                stateListAnimator.runningAnimator = null;
            }
        }
    };
    @Nullable
    private Tuple lastMatch = null;
    @Nullable
    public ValueAnimator runningAnimator = null;
    private final ArrayList<Tuple> tuples = new ArrayList<>();

    public static class Tuple {
        public final ValueAnimator animator;
        public final int[] specs;

        public Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.specs = iArr;
            this.animator = valueAnimator;
        }
    }

    private void cancel() {
        ValueAnimator valueAnimator = this.runningAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.runningAnimator = null;
        }
    }

    private void start(@NonNull Tuple tuple) {
        ValueAnimator valueAnimator = tuple.animator;
        this.runningAnimator = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.animationListener);
        this.tuples.add(tuple);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.runningAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.runningAnimator = null;
        }
    }

    public void setState(int[] iArr) {
        Tuple tuple;
        int size = this.tuples.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                tuple = null;
                break;
            }
            tuple = this.tuples.get(i2);
            if (StateSet.stateSetMatches(tuple.specs, iArr)) {
                break;
            }
            i2++;
        }
        Tuple tuple2 = this.lastMatch;
        if (tuple != tuple2) {
            if (tuple2 != null) {
                cancel();
            }
            this.lastMatch = tuple;
            if (tuple != null) {
                start(tuple);
            }
        }
    }
}
