package androidx.constraintlayout.motion.utils;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;

public class HyperSpline {
    public double[][] mCtl;
    public Cubic[][] mCurve;
    public double[] mCurveLength;
    public int mDimensionality;
    public int mPoints;
    public double mTotalLength;

    public static class Cubic {
        public static final double HALF = 0.5d;
        public static final double THIRD = 0.3333333333333333d;
        public double mA;
        public double mB;
        public double mC;
        public double mD;

        public Cubic(double d, double d2, double d3, double d4) {
            this.mA = d;
            this.mB = d2;
            this.mC = d3;
            this.mD = d4;
        }

        public double eval(double d) {
            return (((((this.mD * d) + this.mC) * d) + this.mB) * d) + this.mA;
        }

        public double vel(double d) {
            return (((this.mC * 0.5d) + (this.mD * 0.3333333333333333d * d)) * d) + this.mB;
        }
    }

    public HyperSpline() {
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public static Cubic[] calcNaturalCubic(int i2, double[] dArr) {
        int i3 = i2;
        double[] dArr2 = new double[i3];
        double[] dArr3 = new double[i3];
        double[] dArr4 = new double[i3];
        int i4 = i3 - 1;
        int i5 = 0;
        dArr2[0] = 0.5d;
        int i6 = 1;
        for (int i7 = 1; i7 < i4; i7++) {
            dArr2[i7] = 1.0d / (4.0d - dArr2[i7 - 1]);
        }
        int i8 = i4 - 1;
        dArr2[i4] = 1.0d / (2.0d - dArr2[i8]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i6 < i4) {
            int i9 = i6 + 1;
            int i10 = i6 - 1;
            dArr3[i6] = (((dArr[i9] - dArr[i10]) * 3.0d) - dArr3[i10]) * dArr2[i6];
            i6 = i9;
        }
        dArr3[i4] = (((dArr[i4] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
        dArr4[i4] = dArr3[i4];
        while (i8 >= 0) {
            dArr4[i8] = dArr3[i8] - (dArr2[i8] * dArr4[i8 + 1]);
            i8--;
        }
        Cubic[] cubicArr = new Cubic[i4];
        while (i5 < i4) {
            int i11 = i5 + 1;
            cubicArr[i5] = new Cubic((double) ((float) dArr[i5]), dArr4[i5], (((dArr[i11] - dArr[i5]) * 3.0d) - (dArr4[i5] * 2.0d)) - dArr4[i11], ((dArr[i5] - dArr[i11]) * 2.0d) + dArr4[i5] + dArr4[i11]);
            i5 = i11;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i2;
        Cubic[] cubicArr2 = cubicArr;
        int length = cubicArr2.length;
        double[] dArr = new double[cubicArr2.length];
        double d = ShadowDrawableWrapper.COS_45;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i2 = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i2 < cubicArr2.length) {
                double d5 = dArr[i2];
                double eval = cubicArr2[i2].eval(d2);
                dArr[i2] = eval;
                double d6 = d5 - eval;
                d4 += d6 * d6;
                i2++;
            }
            if (d2 > ShadowDrawableWrapper.COS_45) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i2 < cubicArr2.length) {
            double d7 = dArr[i2];
            double eval2 = cubicArr2[i2].eval(1.0d);
            dArr[i2] = eval2;
            double d8 = d7 - eval2;
            d += d8 * d8;
            i2++;
        }
        return Math.sqrt(d) + d3;
    }

    public double getPos(double d, int i2) {
        double[] dArr;
        double d2 = d * this.mTotalLength;
        int i3 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i3 < dArr.length - 1 && dArr[i3] < d2) {
                d2 -= dArr[i3];
                i3++;
            }
        }
        return this.mCurve[i2][i3].eval(d2 / dArr[i3]);
    }

    public void getPos(double d, double[] dArr) {
        double d2 = d * this.mTotalLength;
        int i2 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i2 < dArr2.length - 1 && dArr2[i2] < d2) {
                d2 -= dArr2[i2];
                i2++;
            }
        }
        for (int i3 = 0; i3 < dArr.length; i3++) {
            dArr[i3] = this.mCurve[i3][i2].eval(d2 / this.mCurveLength[i2]);
        }
    }

    public void getPos(double d, float[] fArr) {
        double d2 = d * this.mTotalLength;
        int i2 = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i2 < dArr.length - 1 && dArr[i2] < d2) {
                d2 -= dArr[i2];
                i2++;
            }
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = (float) this.mCurve[i3][i2].eval(d2 / this.mCurveLength[i2]);
        }
    }

    public void getVelocity(double d, double[] dArr) {
        double d2 = d * this.mTotalLength;
        int i2 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i2 < dArr2.length - 1 && dArr2[i2] < d2) {
                d2 -= dArr2[i2];
                i2++;
            }
        }
        for (int i3 = 0; i3 < dArr.length; i3++) {
            dArr[i3] = this.mCurve[i3][i2].vel(d2 / this.mCurveLength[i2]);
        }
    }

    public void setup(double[][] dArr) {
        int i2;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        this.mCtl = (double[][]) Array.newInstance(double.class, iArr);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int i3 = 0; i3 < this.mDimensionality; i3++) {
            for (int i4 = 0; i4 < this.mPoints; i4++) {
                this.mCtl[i3][i4] = dArr[i4][i3];
            }
        }
        int i5 = 0;
        while (true) {
            i2 = this.mDimensionality;
            if (i5 >= i2) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[][] dArr2 = this.mCtl;
            cubicArr[i5] = calcNaturalCubic(dArr2[i5].length, dArr2[i5]);
            i5++;
        }
        this.mCurveLength = new double[(this.mPoints - 1)];
        this.mTotalLength = ShadowDrawableWrapper.COS_45;
        Cubic[] cubicArr2 = new Cubic[i2];
        for (int i6 = 0; i6 < this.mCurveLength.length; i6++) {
            for (int i7 = 0; i7 < this.mDimensionality; i7++) {
                cubicArr2[i7] = this.mCurve[i7][i6];
            }
            double d = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double approxLength = approxLength(cubicArr2);
            dArr3[i6] = approxLength;
            this.mTotalLength = d + approxLength;
        }
    }
}
