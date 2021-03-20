package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    public float last_cycle = Float.NaN;
    public long last_time;
    private float[] mCache = new float[3];
    public boolean mContinue = false;
    public CurveFit mCurveFit;
    public int[] mTimePoints = new int[10];
    private String mType;
    public float[][] mValues = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));
    public int mWaveShape = 0;

    public static class AlphaSet extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setAlpha(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends TimeCycleSplineSet {
        public String mAttributeName;
        public float[] mCache;
        public SparseArray<ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;
        public SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        public void setPoint(int i2, float f, float f2, int i3, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i2, ConstraintAttribute constraintAttribute, float f, int i3, float f2) {
            this.mConstraintAttributeList.append(i2, constraintAttribute);
            this.mWaveProperties.append(i2, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i3);
        }

        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            View view2 = view;
            long j3 = j2;
            this.mCurveFit.getPos((double) f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j4 = j3 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(view2, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f4 = (float) ((((((double) j4) * 1.0E-9d) * ((double) f2)) + ((double) this.last_cycle)) % 1.0d);
            this.last_cycle = f4;
            this.last_time = j3;
            float calcWave = calcWave(f4);
            this.mContinue = false;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i2 >= fArr2.length) {
                    break;
                }
                boolean z = this.mContinue;
                float[] fArr3 = this.mTempValues;
                this.mContinue = z | (((double) fArr3[i2]) != ShadowDrawableWrapper.COS_45);
                fArr2[i2] = (fArr3[i2] * calcWave) + f3;
                i2++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view2, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        public void setup(int i2) {
            int size = this.mConstraintAttributeList.size();
            int noOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            int i3 = noOfInterpValues + 2;
            this.mTempValues = new float[i3];
            this.mCache = new float[noOfInterpValues];
            int[] iArr = new int[2];
            iArr[1] = i3;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i4);
                float[] valueAt = this.mWaveProperties.valueAt(i4);
                dArr[i4] = ((double) keyAt) * 0.01d;
                this.mConstraintAttributeList.valueAt(i4).getValuesToInterpolate(this.mTempValues);
                int i5 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i5 >= fArr.length) {
                        break;
                    }
                    dArr2[i4][i5] = (double) fArr[i5];
                    i5++;
                }
                dArr2[i4][noOfInterpValues] = (double) valueAt[0];
                dArr2[i4][noOfInterpValues + 1] = (double) valueAt[1];
            }
            this.mCurveFit = CurveFit.get(i2, dArr, dArr2);
        }
    }

    public static class ElevationSet extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setElevation(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends TimeCycleSplineSet {
        public boolean setPathRotate(View view, KeyCache keyCache, float f, long j2, double d, double d2) {
            view.setRotation(get(f, j2, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.mContinue;
        }

        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class ProgressSet extends TimeCycleSplineSet {
        public boolean mNoMethod = false;

        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(get(f, j2, view, keyCache));
            } else if (this.mNoMethod) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(get(f, j2, view, keyCache))});
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e2);
                    }
                }
            }
            return this.mContinue;
        }
    }

    public static class RotationSet extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setRotation(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationXset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setRotationX(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationYset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setRotationY(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleXset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setScaleX(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleYset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setScaleY(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i2, int i3) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i3;
            iArr2[1] = i2;
            int i4 = 2;
            while (i4 > 0) {
                int i5 = i4 - 1;
                int i6 = iArr2[i5];
                i4 = i5 - 1;
                int i7 = iArr2[i4];
                if (i6 < i7) {
                    int partition = partition(iArr, fArr, i6, i7);
                    int i8 = i4 + 1;
                    iArr2[i4] = partition - 1;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    int i10 = i9 + 1;
                    iArr2[i9] = i7;
                    i4 = i10 + 1;
                    iArr2[i10] = partition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i2, int i3) {
            int i4 = iArr[i3];
            int i5 = i2;
            while (i2 < i3) {
                if (iArr[i2] <= i4) {
                    swap(iArr, fArr, i5, i2);
                    i5++;
                }
                i2++;
            }
            swap(iArr, fArr, i5, i3);
            return i5;
        }

        private static void swap(int[] iArr, float[][] fArr, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float[] fArr2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = fArr2;
        }
    }

    public static class TranslationXset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setTranslationX(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationYset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setTranslationY(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationZset extends TimeCycleSplineSet {
        public boolean setProperty(View view, float f, long j2, KeyCache keyCache) {
            view.setTranslationZ(get(f, j2, view, keyCache));
            return this.mContinue;
        }
    }

    public static TimeCycleSplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static TimeCycleSplineSet makeSpline(String str, long j2) {
        TimeCycleSplineSet timeCycleSplineSet;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals(Key.ROTATION_X)) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(Key.ROTATION_Y)) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(Key.TRANSLATION_X)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(Key.TRANSLATION_Y)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals(Key.TRANSLATION_Z)) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(Key.SCALE_X)) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(Key.SCALE_Y)) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(Key.ELEVATION)) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(Key.TRANSITION_PATH_ROTATE)) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(Key.ALPHA)) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                timeCycleSplineSet = new RotationXset();
                break;
            case 1:
                timeCycleSplineSet = new RotationYset();
                break;
            case 2:
                timeCycleSplineSet = new TranslationXset();
                break;
            case 3:
                timeCycleSplineSet = new TranslationYset();
                break;
            case 4:
                timeCycleSplineSet = new TranslationZset();
                break;
            case 5:
                timeCycleSplineSet = new ProgressSet();
                break;
            case 6:
                timeCycleSplineSet = new ScaleXset();
                break;
            case 7:
                timeCycleSplineSet = new ScaleYset();
                break;
            case 8:
                timeCycleSplineSet = new RotationSet();
                break;
            case 9:
                timeCycleSplineSet = new ElevationSet();
                break;
            case 10:
                timeCycleSplineSet = new PathRotate();
                break;
            case 11:
                timeCycleSplineSet = new AlphaSet();
                break;
            default:
                return null;
        }
        timeCycleSplineSet.setStartTime(j2);
        return timeCycleSplineSet;
    }

    public float calcWave(float f) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f * VAL_2PI);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * VAL_2PI));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * VAL_2PI));
        }
        return 1.0f - abs;
    }

    public float get(float f, long j2, View view, KeyCache keyCache) {
        long j3 = j2;
        View view2 = view;
        KeyCache keyCache2 = keyCache;
        this.mCurveFit.getPos((double) f, this.mCache);
        float[] fArr = this.mCache;
        float f2 = fArr[1];
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache2.getFloatValue(view2, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        float f3 = (float) ((((((double) (j3 - this.last_time)) * 1.0E-9d) * ((double) f2)) + ((double) this.last_cycle)) % 1.0d);
        this.last_cycle = f3;
        keyCache2.setFloatValue(view2, this.mType, 0, f3);
        this.last_time = j3;
        float f4 = this.mCache[0];
        float calcWave = (calcWave(this.last_cycle) * f4) + this.mCache[2];
        this.mContinue = (f4 == 0.0f && i2 == 0) ? false : true;
        return calcWave;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i2, float f, float f2, int i3, float f3) {
        int[] iArr = this.mTimePoints;
        int i4 = this.count;
        iArr[i4] = i2;
        float[][] fArr = this.mValues;
        fArr[i4][0] = f;
        fArr[i4][1] = f2;
        fArr[i4][2] = f3;
        this.mWaveShape = Math.max(this.mWaveShape, i3);
        this.count++;
    }

    public abstract boolean setProperty(View view, float f, long j2, KeyCache keyCache);

    public void setStartTime(long j2) {
        this.last_time = j2;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i2) {
        int i3 = this.count;
        if (i3 == 0) {
            StringBuilder y = a.y("Error no points added to ");
            y.append(this.mType);
            Log.e(TAG, y.toString());
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        double[] dArr = new double[i5];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i5;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i6 = 0;
        for (int i7 = 0; i7 < this.count; i7++) {
            if (i7 > 0) {
                int[] iArr3 = this.mTimePoints;
                if (iArr3[i7] == iArr3[i7 - 1]) {
                }
            }
            dArr[i6] = ((double) this.mTimePoints[i7]) * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[][] fArr = this.mValues;
            dArr3[0] = (double) fArr[i7][0];
            dArr2[i6][1] = (double) fArr[i7][1];
            dArr2[i6][2] = (double) fArr[i7][2];
            i6++;
        }
        this.mCurveFit = CurveFit.get(i2, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.count; i2++) {
            StringBuilder B = a.B(str, "[");
            B.append(this.mTimePoints[i2]);
            B.append(" , ");
            B.append(decimalFormat.format(this.mValues[i2]));
            B.append("] ");
            str = B.toString();
        }
        return str;
    }
}
