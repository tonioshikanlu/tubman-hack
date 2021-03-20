package com.airbnb.lottie.utils;

public class MeanCalculator {

    /* renamed from: n  reason: collision with root package name */
    private int f6895n;
    private float sum;

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int i2 = this.f6895n + 1;
        this.f6895n = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.f6895n = i2 / 2;
        }
    }

    public float getMean() {
        int i2 = this.f6895n;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.sum / ((float) i2);
    }
}
