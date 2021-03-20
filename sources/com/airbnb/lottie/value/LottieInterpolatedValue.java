package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public abstract class LottieInterpolatedValue<T> extends LottieValueCallback<T> {
    private final T endValue;
    private final Interpolator interpolator;
    private final T startValue;

    public LottieInterpolatedValue(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    public LottieInterpolatedValue(T t, T t2, Interpolator interpolator2) {
        this.startValue = t;
        this.endValue = t2;
        this.interpolator = interpolator2;
    }

    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return interpolateValue(this.startValue, this.endValue, this.interpolator.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public abstract T interpolateValue(T t, T t2, float f);
}
