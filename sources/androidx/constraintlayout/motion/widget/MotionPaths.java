package androidx.constraintlayout.motion.widget;

import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.LinkedHashMap;

public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int OFF_HEIGHT = 4;
    public static final int OFF_PATH_ROTATE = 5;
    public static final int OFF_POSITION = 0;
    public static final int OFF_WIDTH = 3;
    public static final int OFF_X = 1;
    public static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 3;
    public static final String TAG = "MotionPaths";
    public static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    public LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    public float height;
    public int mDrawPath = 0;
    public Easing mKeyFrameEasing;
    public int mMode = 0;
    public int mPathMotionArc = Key.UNSET;
    public float mPathRotate = Float.NaN;
    public float mProgress = Float.NaN;
    public double[] mTempDelta = new double[18];
    public double[] mTempValue = new double[18];
    public float position;
    public float time;
    public float width;
    public float x;
    public float y;

    public MotionPaths() {
    }

    public MotionPaths(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i4 = keyPosition.mPositionType;
        if (i4 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i4 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i2, i3, keyPosition, motionPaths, motionPaths2);
        }
    }

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f6 - f4) * f2) + ((f5 - f3) * f) + f4;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (String next : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(next);
            if (constraintAttribute.getType() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(next, constraintAttribute);
            }
        }
    }

    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        zArr[1] = zArr[1] | diff(this.x, motionPaths.x) | z;
        zArr[2] = z | diff(this.y, motionPaths.y) | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.mPathRotate};
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] < 6) {
                dArr[i2] = (double) fArr[iArr[i3]];
                i2++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f = this.width;
        float f2 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f3 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 3) {
                f = f3;
            } else if (i4 == 4) {
                f2 = f3;
            }
        }
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
    }

    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f5 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f = f5;
            } else if (i4 == 2) {
                f2 = f5;
            } else if (i4 == 3) {
                f3 = f5;
            } else if (i4 == 4) {
                f4 = f5;
            }
        }
        fArr[i2] = (f3 / 2.0f) + f + 0.0f;
        fArr[i2 + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i2) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i2] = (double) constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int noOfInterpValues = constraintAttribute.noOfInterpValues();
        float[] fArr = new float[noOfInterpValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i3 = 0;
        while (i3 < noOfInterpValues) {
            dArr[i2] = (double) fArr[i3];
            i3++;
            i2++;
        }
        return noOfInterpValues;
    }

    public int getCustomDataCount(String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f5 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f = f5;
            } else if (i4 == 2) {
                f2 = f5;
            } else if (i4 == 3) {
                f3 = f5;
            } else if (i4 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i5 = i2 + 1;
        fArr[i2] = f + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f2 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f6 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f2 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f6 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f7 + 0.0f;
        fArr[i10] = f + 0.0f;
        fArr[i10 + 1] = f7 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f2 = Float.isNaN(keyPosition2.mPercentWidth) ? f : keyPosition2.mPercentWidth;
        float f3 = Float.isNaN(keyPosition2.mPercentHeight) ? f : keyPosition2.mPercentHeight;
        float f4 = motionPaths4.width;
        float f5 = motionPaths3.width;
        float f6 = f4 - f5;
        float f7 = motionPaths4.height;
        float f8 = motionPaths3.height;
        float f9 = f7 - f8;
        this.position = this.time;
        float f10 = motionPaths3.x;
        float f11 = motionPaths3.y;
        float f12 = ((f4 / 2.0f) + motionPaths4.x) - ((f5 / 2.0f) + f10);
        float f13 = ((f7 / 2.0f) + motionPaths4.y) - ((f8 / 2.0f) + f11);
        float f14 = f6 * f2;
        float f15 = f14 / 2.0f;
        this.x = (float) ((int) (((f12 * f) + f10) - f15));
        float f16 = (f13 * f) + f11;
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.y = (float) ((int) (f16 - f18));
        this.width = (float) ((int) (f5 + f14));
        this.height = (float) ((int) (f8 + f17));
        KeyPosition keyPosition3 = keyPosition;
        float f19 = Float.isNaN(keyPosition3.mPercentX) ? f : keyPosition3.mPercentX;
        float f20 = 0.0f;
        float f21 = Float.isNaN(keyPosition3.mAltPercentY) ? 0.0f : keyPosition3.mAltPercentY;
        if (!Float.isNaN(keyPosition3.mPercentY)) {
            f = keyPosition3.mPercentY;
        }
        if (!Float.isNaN(keyPosition3.mAltPercentX)) {
            f20 = keyPosition3.mAltPercentX;
        }
        this.mMode = 2;
        MotionPaths motionPaths5 = motionPaths;
        this.x = (float) ((int) (((f20 * f13) + ((f19 * f12) + motionPaths5.x)) - f15));
        this.y = (float) ((int) (((f13 * f) + ((f12 * f21) + motionPaths5.y)) - f18));
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f2 = Float.isNaN(keyPosition2.mPercentWidth) ? f : keyPosition2.mPercentWidth;
        float f3 = Float.isNaN(keyPosition2.mPercentHeight) ? f : keyPosition2.mPercentHeight;
        float f4 = motionPaths4.width - motionPaths3.width;
        float f5 = motionPaths4.height - motionPaths3.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition2.mPercentX)) {
            f = keyPosition2.mPercentX;
        }
        float f6 = motionPaths3.x;
        float f7 = motionPaths3.width;
        float f8 = motionPaths3.y;
        float f9 = motionPaths3.height;
        float f10 = ((motionPaths4.width / 2.0f) + motionPaths4.x) - ((f7 / 2.0f) + f6);
        float f11 = ((motionPaths4.height / 2.0f) + motionPaths4.y) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.x = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.y = (float) ((int) ((f8 + f15) - f17));
        this.width = (float) ((int) (f7 + f13));
        this.height = (float) ((int) (f9 + f16));
        KeyPosition keyPosition3 = keyPosition;
        float f18 = Float.isNaN(keyPosition3.mPercentY) ? 0.0f : keyPosition3.mPercentY;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.mMode = 1;
        MotionPaths motionPaths5 = motionPaths;
        float f21 = (float) ((int) ((motionPaths5.x + f12) - f14));
        this.x = f21;
        float f22 = (float) ((int) ((motionPaths5.y + f15) - f17));
        this.y = f22;
        this.x = f21 + f19;
        this.y = f22 + f20;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    public void initScreen(int i2, int i3, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f2 = Float.isNaN(keyPosition2.mPercentWidth) ? f : keyPosition2.mPercentWidth;
        float f3 = Float.isNaN(keyPosition2.mPercentHeight) ? f : keyPosition2.mPercentHeight;
        float f4 = motionPaths4.width;
        float f5 = motionPaths3.width;
        float f6 = f4 - f5;
        float f7 = motionPaths4.height;
        float f8 = motionPaths3.height;
        float f9 = f7 - f8;
        this.position = this.time;
        float f10 = motionPaths3.x;
        float f11 = motionPaths3.y;
        float f12 = (f4 / 2.0f) + motionPaths4.x;
        float f13 = (f7 / 2.0f) + motionPaths4.y;
        float f14 = f6 * f2;
        this.x = (float) ((int) ((((f12 - ((f5 / 2.0f) + f10)) * f) + f10) - (f14 / 2.0f)));
        float f15 = f9 * f3;
        this.y = (float) ((int) ((((f13 - ((f8 / 2.0f) + f11)) * f) + f11) - (f15 / 2.0f)));
        this.width = (float) ((int) (f5 + f14));
        this.height = (float) ((int) (f8 + f15));
        this.mMode = 3;
        KeyPosition keyPosition3 = keyPosition;
        if (!Float.isNaN(keyPosition3.mPercentX)) {
            this.x = (float) ((int) (keyPosition3.mPercentX * ((float) ((int) (((float) i2) - this.width)))));
        }
        if (!Float.isNaN(keyPosition3.mPercentY)) {
            this.y = (float) ((int) (keyPosition3.mPercentY * ((float) ((int) (((float) i3) - this.height)))));
        }
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f7 = (float) dArr[i2];
            double d = dArr2[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f3 = f7;
            } else if (i3 == 2) {
                f5 = f7;
            } else if (i3 == 3) {
                f4 = f7;
            } else if (i3 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (java.lang.Float.isNaN(Float.NaN) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setView(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            float r3 = r0.x
            float r4 = r0.y
            float r5 = r0.width
            float r6 = r0.height
            int r7 = r2.length
            r8 = 1
            if (r7 == 0) goto L_0x0028
            double[] r7 = r0.mTempValue
            int r7 = r7.length
            int r9 = r2.length
            int r9 = r9 - r8
            r9 = r2[r9]
            if (r7 > r9) goto L_0x0028
            int r7 = r2.length
            int r7 = r7 - r8
            r7 = r2[r7]
            int r7 = r7 + r8
            double[] r9 = new double[r7]
            r0.mTempValue = r9
            double[] r7 = new double[r7]
            r0.mTempDelta = r7
        L_0x0028:
            double[] r7 = r0.mTempValue
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r7, r9)
            r9 = 0
        L_0x0030:
            int r10 = r2.length
            if (r9 >= r10) goto L_0x0046
            double[] r10 = r0.mTempValue
            r11 = r2[r9]
            r12 = r24[r9]
            r10[r11] = r12
            double[] r10 = r0.mTempDelta
            r11 = r2[r9]
            r12 = r25[r9]
            r10[r11] = r12
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0046:
            r10 = 0
            r11 = 2143289344(0x7fc00000, float:NaN)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x004d:
            double[] r7 = r0.mTempValue
            int r9 = r7.length
            if (r10 >= r9) goto L_0x00ac
            r17 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r17)
            r17 = 0
            if (r7 == 0) goto L_0x0068
            if (r26 == 0) goto L_0x0064
            r19 = r26[r10]
            int r7 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0068
        L_0x0064:
            r25 = r3
            r7 = r8
            goto L_0x0096
        L_0x0068:
            if (r26 == 0) goto L_0x006c
            r17 = r26[r10]
        L_0x006c:
            double[] r7 = r0.mTempValue
            r19 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r19)
            if (r7 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            double[] r7 = r0.mTempValue
            r19 = r7[r10]
            double r17 = r19 + r17
        L_0x007d:
            r25 = r3
            r2 = r17
            float r2 = (float) r2
            double[] r3 = r0.mTempDelta
            r8 = r3[r10]
            float r3 = (float) r8
            r7 = 1
            if (r10 == r7) goto L_0x00a6
            r8 = 2
            if (r10 == r8) goto L_0x00a3
            r8 = 3
            if (r10 == r8) goto L_0x00a0
            r8 = 4
            if (r10 == r8) goto L_0x009d
            r3 = 5
            if (r10 == r3) goto L_0x0099
        L_0x0096:
            r3 = r25
            goto L_0x00a8
        L_0x0099:
            r3 = r25
            r11 = r2
            goto L_0x00a8
        L_0x009d:
            r6 = r2
            r15 = r3
            goto L_0x0096
        L_0x00a0:
            r5 = r2
            r13 = r3
            goto L_0x0096
        L_0x00a3:
            r4 = r2
            r14 = r3
            goto L_0x0096
        L_0x00a6:
            r12 = r3
            r3 = r2
        L_0x00a8:
            int r10 = r10 + 1
            r8 = r7
            goto L_0x004d
        L_0x00ac:
            r25 = r3
            r7 = r8
            boolean r2 = java.lang.Float.isNaN(r11)
            if (r2 == 0) goto L_0x00c1
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x00e0
        L_0x00bd:
            r1.setRotation(r2)
            goto L_0x00e0
        L_0x00c1:
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L_0x00ca
            r2 = 0
        L_0x00ca:
            r3 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r3
            float r13 = r13 + r12
            float r15 = r15 / r3
            float r15 = r15 + r14
            double r2 = (double) r2
            double r8 = (double) r11
            double r10 = (double) r15
            double r12 = (double) r13
            double r10 = java.lang.Math.atan2(r10, r12)
            double r10 = java.lang.Math.toDegrees(r10)
            double r10 = r10 + r8
            double r10 = r10 + r2
            float r2 = (float) r10
            goto L_0x00bd
        L_0x00e0:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r25 + r2
            int r8 = (int) r3
            float r4 = r4 + r2
            int r2 = (int) r4
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            int r5 = r3 - r8
            int r6 = r4 - r2
            int r9 = r22.getMeasuredWidth()
            if (r5 != r9) goto L_0x00ff
            int r9 = r22.getMeasuredHeight()
            if (r6 == r9) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r16 = 0
            goto L_0x0101
        L_0x00ff:
            r16 = r7
        L_0x0101:
            if (r16 == 0) goto L_0x0110
            r7 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r1.measure(r5, r6)
        L_0x0110:
            r1.layout(r8, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionPaths.setView(android.view.View, int[], double[], double[], double[]):void");
    }
}
