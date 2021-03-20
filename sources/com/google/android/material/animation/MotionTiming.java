package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;

public class MotionTiming {
    private long delay = 0;
    private long duration = 300;
    @Nullable
    private TimeInterpolator interpolator = null;
    private int repeatCount = 0;
    private int repeatMode = 1;

    public MotionTiming(long j2, long j3) {
        this.delay = j2;
        this.duration = j3;
    }

    public MotionTiming(long j2, long j3, @NonNull TimeInterpolator timeInterpolator) {
        this.delay = j2;
        this.duration = j3;
        this.interpolator = timeInterpolator;
    }

    @NonNull
    public static MotionTiming createFromAnimator(@NonNull ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), getInterpolatorCompat(valueAnimator));
        motionTiming.repeatCount = valueAnimator.getRepeatCount();
        motionTiming.repeatMode = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    private static TimeInterpolator getInterpolatorCompat(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator2 = valueAnimator.getInterpolator();
        return ((interpolator2 instanceof AccelerateDecelerateInterpolator) || interpolator2 == null) ? AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR : interpolator2 instanceof AccelerateInterpolator ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : interpolator2 instanceof DecelerateInterpolator ? AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR : interpolator2;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.interpolator;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        int hashCode = getInterpolator().getClass().hashCode();
        int repeatCount2 = getRepeatCount();
        return getRepeatMode() + ((repeatCount2 + ((hashCode + (((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31)) * 31)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder v = a.v(10);
        v.append(getClass().getName());
        v.append('{');
        v.append(Integer.toHexString(System.identityHashCode(this)));
        v.append(" delay: ");
        v.append(getDelay());
        v.append(" duration: ");
        v.append(getDuration());
        v.append(" interpolator: ");
        v.append(getInterpolator().getClass());
        v.append(" repeatCount: ");
        v.append(getRepeatCount());
        v.append(" repeatMode: ");
        v.append(getRepeatMode());
        v.append("}\n");
        return v.toString();
    }
}
