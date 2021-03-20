package androidx.constraintlayout.motion.utils;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    public static class Constant extends CurveFit {
        public double mTime;
        public double[] mValue;

        public Constant(double d, double[] dArr) {
            this.mTime = d;
            this.mValue = dArr;
        }

        public double getPos(double d, int i2) {
            return this.mValue[i2];
        }

        public void getPos(double d, double[] dArr) {
            double[] dArr2 = this.mValue;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void getPos(double d, float[] fArr) {
            int i2 = 0;
            while (true) {
                double[] dArr = this.mValue;
                if (i2 < dArr.length) {
                    fArr[i2] = (float) dArr[i2];
                    i2++;
                } else {
                    return;
                }
            }
        }

        public double getSlope(double d, int i2) {
            return ShadowDrawableWrapper.COS_45;
        }

        public void getSlope(double d, double[] dArr) {
            for (int i2 = 0; i2 < this.mValue.length; i2++) {
                dArr[i2] = 0.0d;
            }
        }

        public double[] getTimePoints() {
            return new double[]{this.mTime};
        }
    }

    public static CurveFit get(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        return i2 != 0 ? i2 != 2 ? new LinearCurveFit(dArr, dArr2) : new Constant(dArr[0], dArr2[0]) : new MonotonicCurveFit(dArr, dArr2);
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new ArcCurveFit(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d, int i2);

    public abstract void getPos(double d, double[] dArr);

    public abstract void getPos(double d, float[] fArr);

    public abstract double getSlope(double d, int i2);

    public abstract void getSlope(double d, double[] dArr);

    public abstract double[] getTimePoints();
}
