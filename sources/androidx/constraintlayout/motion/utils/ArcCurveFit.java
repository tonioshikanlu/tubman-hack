package androidx.constraintlayout.motion.utils;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    public Arc[] mArcs;
    private final double[] mTime;

    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        public boolean linear = false;
        public double mArcDistance;
        public double mArcVelocity;
        public double mEllipseA;
        public double mEllipseB;
        public double mEllipseCenterX;
        public double mEllipseCenterY;
        public double[] mLut;
        public double mOneOverDeltaTime;
        public double mTime1;
        public double mTime2;
        public double mTmpCosAngle;
        public double mTmpSinAngle;
        public boolean mVertical;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        public Arc(int i2, double d, double d2, double d3, double d4, double d5, double d6) {
            int i3 = i2;
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            boolean z = false;
            int i4 = 1;
            this.mVertical = i3 == 1 ? true : z;
            this.mTime1 = d7;
            this.mTime2 = d8;
            this.mOneOverDeltaTime = 1.0d / (d8 - d7);
            if (3 == i3) {
                this.linear = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (this.linear || Math.abs(d13) < EPSILON || Math.abs(d14) < EPSILON) {
                this.linear = true;
                this.mX1 = d9;
                this.mX2 = d11;
                this.mY1 = d10;
                this.mY2 = d6;
                double hypot = Math.hypot(d14, d13);
                this.mArcDistance = hypot;
                this.mArcVelocity = hypot * this.mOneOverDeltaTime;
                double d15 = this.mTime2;
                double d16 = this.mTime1;
                this.mEllipseCenterX = d13 / (d15 - d16);
                this.mEllipseCenterY = d14 / (d15 - d16);
                return;
            }
            this.mLut = new double[101];
            boolean z2 = this.mVertical;
            this.mEllipseA = d13 * ((double) (z2 ? -1 : 1));
            this.mEllipseB = d14 * ((double) (!z2 ? -1 : i4));
            this.mEllipseCenterX = z2 ? d11 : d9;
            this.mEllipseCenterY = z2 ? d10 : d6;
            buildTable(d3, d4, d5, d6);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i2 = 0;
            double d8 = ShadowDrawableWrapper.COS_45;
            double d9 = ShadowDrawableWrapper.COS_45;
            double d10 = ShadowDrawableWrapper.COS_45;
            while (true) {
                double[] dArr = ourPercent;
                if (i2 >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i2 > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    ourPercent[i2] = d5;
                } else {
                    d5 = d11;
                }
                i2++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.mArcDistance = d13;
            int i3 = 0;
            while (true) {
                double[] dArr2 = ourPercent;
                if (i3 >= dArr2.length) {
                    break;
                }
                dArr2[i3] = dArr2[i3] / d13;
                i3++;
            }
            int i4 = 0;
            while (true) {
                double[] dArr3 = this.mLut;
                if (i4 < dArr3.length) {
                    double length = ((double) i4) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(ourPercent, length);
                    if (binarySearch >= 0) {
                        this.mLut[i4] = (double) (binarySearch / (ourPercent.length - 1));
                    } else if (binarySearch == -1) {
                        this.mLut[i4] = 0.0d;
                    } else {
                        int i5 = -binarySearch;
                        int i6 = i5 - 2;
                        double[] dArr4 = ourPercent;
                        this.mLut[i4] = (((length - dArr4[i6]) / (dArr4[i5 - 1] - dArr4[i6])) + ((double) i6)) / ((double) (dArr4.length - 1));
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }

        public double getDX() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d = -d;
            }
            return d * hypot;
        }

        public double getDY() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double d2 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, d2);
            return this.mVertical ? (-d2) * hypot : d2 * hypot;
        }

        public double getLinearDX(double d) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mX1;
            return ((this.mX2 - d3) * d2) + d3;
        }

        public double getLinearY(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mY1;
            return ((this.mY2 - d3) * d2) + d3;
        }

        public double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        public double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        public double lookup(double d) {
            if (d <= ShadowDrawableWrapper.COS_45) {
                return ShadowDrawableWrapper.COS_45;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d * ((double) (dArr.length - 1));
            int i2 = (int) length;
            double d2 = length - ((double) i2);
            return ((dArr[i2 + 1] - dArr[i2]) * d2) + dArr[i2];
        }

        public void setPoint(double d) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d : d - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r5 == 1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.mTime = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = new androidx.constraintlayout.motion.utils.ArcCurveFit.Arc[r2]
            r0.mArcs = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L_0x0014:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0051
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L_0x002d
            if (r8 == r3) goto L_0x002a
            if (r8 == r10) goto L_0x0028
            if (r8 == r9) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            if (r5 != r3) goto L_0x002a
        L_0x0028:
            r5 = r10
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            r6 = r5
            goto L_0x002e
        L_0x002d:
            r6 = r9
        L_0x002e:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc r22 = new androidx.constraintlayout.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r8 = r27[r4]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r8 = r27[r23]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0014
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    public double getPos(double d, int i2) {
        Arc[] arcArr = this.mArcs;
        int i3 = 0;
        if (d < arcArr[0].mTime1) {
            d = arcArr[0].mTime1;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i3 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d > arcArr2[i3].mTime2) {
                i3++;
            } else if (arcArr2[i3].linear) {
                return i2 == 0 ? arcArr2[i3].getLinearX(d) : arcArr2[i3].getLinearY(d);
            } else {
                arcArr2[i3].setPoint(d);
                Arc[] arcArr3 = this.mArcs;
                return i2 == 0 ? arcArr3[i3].getX() : arcArr3[i3].getY();
            }
        }
    }

    public void getPos(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        if (d < arcArr[0].mTime1) {
            d = arcArr[0].mTime1;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return;
            }
            if (d > arcArr2[i2].mTime2) {
                i2++;
            } else if (arcArr2[i2].linear) {
                dArr[0] = arcArr2[i2].getLinearX(d);
                dArr[1] = this.mArcs[i2].getLinearY(d);
                return;
            } else {
                arcArr2[i2].setPoint(d);
                dArr[0] = this.mArcs[i2].getX();
                dArr[1] = this.mArcs[i2].getY();
                return;
            }
        }
    }

    public void getPos(double d, float[] fArr) {
        Arc[] arcArr = this.mArcs;
        if (d < arcArr[0].mTime1) {
            d = arcArr[0].mTime1;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return;
            }
            if (d > arcArr2[i2].mTime2) {
                i2++;
            } else if (arcArr2[i2].linear) {
                fArr[0] = (float) arcArr2[i2].getLinearX(d);
                fArr[1] = (float) this.mArcs[i2].getLinearY(d);
                return;
            } else {
                arcArr2[i2].setPoint(d);
                fArr[0] = (float) this.mArcs[i2].getX();
                fArr[1] = (float) this.mArcs[i2].getY();
                return;
            }
        }
    }

    public double getSlope(double d, int i2) {
        Arc[] arcArr = this.mArcs;
        int i3 = 0;
        if (d < arcArr[0].mTime1) {
            d = arcArr[0].mTime1;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i3 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d > arcArr2[i3].mTime2) {
                i3++;
            } else if (arcArr2[i3].linear) {
                return i2 == 0 ? arcArr2[i3].getLinearDX(d) : arcArr2[i3].getLinearDY(d);
            } else {
                arcArr2[i3].setPoint(d);
                Arc[] arcArr3 = this.mArcs;
                return i2 == 0 ? arcArr3[i3].getDX() : arcArr3[i3].getDY();
            }
        }
    }

    public void getSlope(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        if (d < arcArr[0].mTime1) {
            d = arcArr[0].mTime1;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return;
            }
            if (d > arcArr2[i2].mTime2) {
                i2++;
            } else if (arcArr2[i2].linear) {
                dArr[0] = arcArr2[i2].getLinearDX(d);
                dArr[1] = this.mArcs[i2].getLinearDY(d);
                return;
            } else {
                arcArr2[i2].setPoint(d);
                dArr[0] = this.mArcs[i2].getDX();
                dArr[1] = this.mArcs[i2].getDY();
                return;
            }
        }
    }

    public double[] getTimePoints() {
        return this.mTime;
    }
}
