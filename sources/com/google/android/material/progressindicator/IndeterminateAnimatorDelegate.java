package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

public abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    public IndeterminateDrawable drawable;
    public final int[] segmentColors;
    public final float[] segmentPositions;

    public IndeterminateAnimatorDelegate(int i2) {
        this.segmentPositions = new float[(i2 * 2)];
        this.segmentColors = new int[i2];
    }

    public abstract void cancelAnimatorImmediately();

    public float getFractionInRange(int i2, int i3, int i4) {
        return ((float) (i2 - i3)) / ((float) i4);
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    public void registerDrawable(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    public abstract void requestCancelAnimatorAfterCurrentCycle();

    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
