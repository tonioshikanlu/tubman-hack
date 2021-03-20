package b.o;

import android.view.animation.Interpolator;

public class u2 implements Interpolator {
    public double a = 1.0d;

    /* renamed from: b  reason: collision with root package name */
    public double f6312b = 10.0d;

    public u2(double d, double d2) {
        this.a = d;
        this.f6312b = d2;
    }

    public float getInterpolation(float f) {
        return (float) ((Math.cos(this.f6312b * ((double) f)) * Math.pow(2.718281828459045d, ((double) (-f)) / this.a) * -1.0d) + 1.0d);
    }
}
