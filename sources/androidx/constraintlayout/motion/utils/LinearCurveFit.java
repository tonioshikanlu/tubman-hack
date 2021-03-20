package androidx.constraintlayout.motion.utils;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private double[] mT;
    private double mTotalLength = Double.NaN;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mT = dArr;
        this.mY = dArr2;
        if (length2 > 2) {
            int i2 = 0;
            double d = 0.0d;
            double d2 = 0.0d;
            while (i2 < dArr.length) {
                double d3 = dArr2[i2][0];
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d3 - d, d4 - d2);
                }
                i2++;
                d = d3;
                d2 = d4;
            }
            this.mTotalLength = ShadowDrawableWrapper.COS_45;
        }
    }

    private double getLength2D(double d) {
        if (Double.isNaN(this.mTotalLength)) {
            return ShadowDrawableWrapper.COS_45;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return ShadowDrawableWrapper.COS_45;
        }
        int i2 = length - 1;
        if (d >= dArr[i2]) {
            return this.mTotalLength;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i3 = 0;
        while (i3 < i2) {
            double[][] dArr2 = this.mY;
            double d5 = dArr2[i3][0];
            double d6 = dArr2[i3][1];
            if (i3 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.mT;
            if (d == dArr3[i3]) {
                return d2;
            }
            int i4 = i3 + 1;
            if (d < dArr3[i4]) {
                double d7 = (d - dArr3[i3]) / (dArr3[i4] - dArr3[i3]);
                double[][] dArr4 = this.mY;
                double d8 = dArr4[i3][0];
                double d9 = dArr4[i4][0];
                double d10 = 1.0d - d7;
                return Math.hypot(d6 - ((dArr4[i4][1] * d7) + (dArr4[i3][1] * d10)), d5 - ((d9 * d7) + (d8 * d10))) + d2;
            }
            i3 = i4;
            d3 = d5;
            d4 = d6;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    public double getPos(double d, int i2) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i3 = 0;
        if (d <= dArr[0]) {
            return this.mY[0][i2];
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            return this.mY[i4][i2];
        }
        while (i3 < i4) {
            double[] dArr2 = this.mT;
            if (d == dArr2[i3]) {
                return this.mY[i3][i2];
            }
            int i5 = i3 + 1;
            if (d < dArr2[i5]) {
                double d2 = (d - dArr2[i3]) / (dArr2[i5] - dArr2[i3]);
                double[][] dArr3 = this.mY;
                return (dArr3[i5][i2] * d2) + ((1.0d - d2) * dArr3[i3][i2]);
            }
            i3 = i5;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    public void getPos(double d, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.mY[0].length;
        if (d <= dArr2[0]) {
            for (int i3 = 0; i3 < length2; i3++) {
                dArr[i3] = this.mY[0][i3];
            }
            return;
        }
        int i4 = length - 1;
        if (d >= dArr2[i4]) {
            while (i2 < length2) {
                dArr[i2] = this.mY[i4][i2];
                i2++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            if (d == this.mT[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    dArr[i6] = this.mY[i5][i6];
                }
            }
            double[] dArr3 = this.mT;
            int i7 = i5 + 1;
            if (d < dArr3[i7]) {
                double d2 = (d - dArr3[i5]) / (dArr3[i7] - dArr3[i5]);
                while (i2 < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i2] = (dArr4[i7][i2] * d2) + ((1.0d - d2) * dArr4[i5][i2]);
                    i2++;
                }
                return;
            }
            i5 = i7;
        }
    }

    public void getPos(double d, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.mY[0].length;
        if (d <= dArr[0]) {
            for (int i3 = 0; i3 < length2; i3++) {
                fArr[i3] = (float) this.mY[0][i3];
            }
            return;
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            while (i2 < length2) {
                fArr[i2] = (float) this.mY[i4][i2];
                i2++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            if (d == this.mT[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    fArr[i6] = (float) this.mY[i5][i6];
                }
            }
            double[] dArr2 = this.mT;
            int i7 = i5 + 1;
            if (d < dArr2[i7]) {
                double d2 = (d - dArr2[i5]) / (dArr2[i7] - dArr2[i5]);
                while (i2 < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i2] = (float) ((dArr3[i7][i2] * d2) + ((1.0d - d2) * dArr3[i5][i2]));
                    i2++;
                }
                return;
            }
            i5 = i7;
        }
    }

    public double getSlope(double d, int i2) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i3 = 0;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                d = dArr[i4];
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.mT;
            int i5 = i3 + 1;
            if (d <= dArr2[i5]) {
                double d2 = dArr2[i5] - dArr2[i3];
                double d3 = dArr2[i3];
                double[][] dArr3 = this.mY;
                return (dArr3[i5][i2] - dArr3[i3][i2]) / d2;
            }
            i3 = i5;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    public void getSlope(double d, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i2 = length - 1;
            if (d >= dArr2[i2]) {
                d = dArr2[i2];
            }
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr3 = this.mT;
            int i4 = i3 + 1;
            if (d <= dArr3[i4]) {
                double d2 = dArr3[i4] - dArr3[i3];
                double d3 = dArr3[i3];
                for (int i5 = 0; i5 < length2; i5++) {
                    double[][] dArr4 = this.mY;
                    dArr[i5] = (dArr4[i4][i5] - dArr4[i3][i5]) / d2;
                }
                return;
            }
            i3 = i4;
        }
    }

    public double[] getTimePoints() {
        return this.mT;
    }
}
