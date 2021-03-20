package androidx.constraintlayout.motion.utils;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;

public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        Class<double> cls = double.class;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        int i2 = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i2;
        double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr2);
        for (int i3 = 0; i3 < length2; i3++) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 + 1;
                dArr5[i4][i3] = (dArr4[i5][i3] - dArr4[i4][i3]) / (dArr3[i5] - dArr3[i4]);
                if (i4 == 0) {
                    dArr6[i4][i3] = dArr5[i4][i3];
                } else {
                    dArr6[i4][i3] = (dArr5[i4 - 1][i3] + dArr5[i4][i3]) * 0.5d;
                }
                i4 = i5;
            }
            dArr6[i2][i3] = dArr5[length - 2][i3];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                if (dArr5[i6][i7] == ShadowDrawableWrapper.COS_45) {
                    dArr6[i6][i7] = 0.0d;
                    dArr6[i6 + 1][i7] = 0.0d;
                } else {
                    double d = dArr6[i6][i7] / dArr5[i6][i7];
                    int i8 = i6 + 1;
                    double d2 = dArr6[i8][i7] / dArr5[i6][i7];
                    double hypot = Math.hypot(d, d2);
                    if (hypot > 9.0d) {
                        double d3 = 3.0d / hypot;
                        dArr6[i6][i7] = d * d3 * dArr5[i6][i7];
                        dArr6[i8][i7] = d3 * d2 * dArr5[i6][i7];
                    }
                }
            }
        }
        this.mT = dArr3;
        this.mY = dArr4;
        this.mTangent = dArr6;
    }

    private static double diff(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d10 = 3.0d * d;
        double d11 = d10 * d5 * d7;
        return (d * d5) + (((d11 + (((d10 * d6) * d7) + ((d9 + ((d8 * d4) + ((-6.0d * d7) * d4))) - (d8 * d3)))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    private static double interpolate(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d9 * d4;
        double d11 = d * d6;
        double d12 = d11 * d8;
        double d13 = d * d5;
        return (d13 * d2) + ((((d8 * d13) + (d12 + (((((d8 * 2.0d) * d3) + (d10 + ((-2.0d * d8) * d4))) - (d9 * d3)) + d3))) - (d11 * d7)) - (((2.0d * d) * d5) * d7));
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
                double d2 = dArr2[i5] - dArr2[i3];
                double d3 = (d - dArr2[i3]) / d2;
                double[][] dArr3 = this.mY;
                double d4 = dArr3[i3][i2];
                double d5 = dArr3[i5][i2];
                double[][] dArr4 = this.mTangent;
                return interpolate(d2, d3, d4, d5, dArr4[i3][i2], dArr4[i5][i2]);
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
                double d2 = dArr3[i7] - dArr3[i5];
                double d3 = (d - dArr3[i5]) / d2;
                while (i2 < length2) {
                    double[][] dArr4 = this.mY;
                    double d4 = dArr4[i5][i2];
                    double d5 = dArr4[i7][i2];
                    double[][] dArr5 = this.mTangent;
                    dArr[i2] = interpolate(d2, d3, d4, d5, dArr5[i5][i2], dArr5[i7][i2]);
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
                double d2 = dArr2[i7] - dArr2[i5];
                double d3 = (d - dArr2[i5]) / d2;
                while (i2 < length2) {
                    double[][] dArr3 = this.mY;
                    double d4 = dArr3[i5][i2];
                    double d5 = dArr3[i7][i2];
                    double[][] dArr4 = this.mTangent;
                    fArr[i2] = (float) interpolate(d2, d3, d4, d5, dArr4[i5][i2], dArr4[i7][i2]);
                    i2++;
                }
                return;
            }
            i5 = i7;
        }
    }

    public double getSlope(double d, int i2) {
        double d2;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i3 = 0;
        if (d < dArr[0]) {
            d2 = dArr[0];
        } else {
            int i4 = length - 1;
            d2 = d >= dArr[i4] ? dArr[i4] : d;
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.mT;
            int i5 = i3 + 1;
            if (d2 <= dArr2[i5]) {
                double d3 = dArr2[i5] - dArr2[i3];
                double[][] dArr3 = this.mY;
                double d4 = dArr3[i3][i2];
                double d5 = dArr3[i5][i2];
                double[][] dArr4 = this.mTangent;
                return diff(d3, (d2 - dArr2[i3]) / d3, d4, d5, dArr4[i3][i2], dArr4[i5][i2]) / d3;
            }
            i3 = i5;
        }
        return ShadowDrawableWrapper.COS_45;
    }

    public void getSlope(double d, double[] dArr) {
        double d2;
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (d <= dArr2[0]) {
            d2 = dArr2[0];
        } else {
            int i2 = length - 1;
            d2 = d >= dArr2[i2] ? dArr2[i2] : d;
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr3 = this.mT;
            int i4 = i3 + 1;
            if (d2 <= dArr3[i4]) {
                double d3 = dArr3[i4] - dArr3[i3];
                double d4 = (d2 - dArr3[i3]) / d3;
                for (int i5 = 0; i5 < length2; i5++) {
                    double[][] dArr4 = this.mY;
                    double d5 = dArr4[i3][i5];
                    double d6 = dArr4[i4][i5];
                    double[][] dArr5 = this.mTangent;
                    dArr[i5] = diff(d3, d4, d5, d6, dArr5[i3][i5], dArr5[i4][i5]) / d3;
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
