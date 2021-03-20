package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;
import b.e.a.a.a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int count;
    public CurveFit mCurveFit;
    public int[] mTimePoints = new int[10];
    private String mType;
    public float[] mValues = new float[10];

    public static class AlphaSet extends SplineSet {
        public void setProperty(View view, float f) {
            view.setAlpha(get(f));
        }
    }

    public static class CustomSet extends SplineSet {
        public String mAttributeName;
        public SparseArray<ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        public void setPoint(int i2, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i2, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i2, constraintAttribute);
        }

        public void setProperty(View view, float f) {
            this.mCurveFit.getPos((double) f, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view, this.mTempValues);
        }

        public void setup(int i2) {
            int size = this.mConstraintAttributeList.size();
            int noOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[noOfInterpValues];
            int[] iArr = new int[2];
            iArr[1] = noOfInterpValues;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                dArr[i3] = ((double) this.mConstraintAttributeList.keyAt(i3)) * 0.01d;
                this.mConstraintAttributeList.valueAt(i3).getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
            }
            this.mCurveFit = CurveFit.get(i2, dArr, dArr2);
        }
    }

    public static class ElevationSet extends SplineSet {
        public void setProperty(View view, float f) {
            view.setElevation(get(f));
        }
    }

    public static class PathRotate extends SplineSet {
        public void setPathRotate(View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }

        public void setProperty(View view, float f) {
        }
    }

    public static class PivotXset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setPivotX(get(f));
        }
    }

    public static class PivotYset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setPivotY(get(f));
        }
    }

    public static class ProgressSet extends SplineSet {
        public boolean mNoMethod = false;

        public void setProperty(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f));
            } else if (!this.mNoMethod) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(get(f))});
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.e(SplineSet.TAG, "unable to setProgress", e2);
                    }
                }
            }
        }
    }

    public static class RotationSet extends SplineSet {
        public void setProperty(View view, float f) {
            view.setRotation(get(f));
        }
    }

    public static class RotationXset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setRotationX(get(f));
        }
    }

    public static class RotationYset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setRotationY(get(f));
        }
    }

    public static class ScaleXset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setScaleX(get(f));
        }
    }

    public static class ScaleYset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setScaleY(get(f));
        }
    }

    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[] fArr, int i2, int i3) {
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

        private static int partition(int[] iArr, float[] fArr, int i2, int i3) {
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

        private static void swap(int[] iArr, float[] fArr, int i2, int i3) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i4;
            float f = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f;
        }
    }

    public static class TranslationXset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    public static class TranslationYset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    public static class TranslationZset extends SplineSet {
        public void setProperty(View view, float f) {
            view.setTranslationZ(get(f));
        }
    }

    public static SplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static SplineSet makeSpline(String str) {
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
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(Key.ELEVATION)) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals(Key.TRANSITION_PATH_ROTATE)) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(Key.ALPHA)) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(Key.WAVE_OFFSET)) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new RotationXset();
            case 1:
                return new RotationYset();
            case 2:
                return new TranslationXset();
            case 3:
                return new TranslationYset();
            case 4:
                return new TranslationZset();
            case 5:
                return new ProgressSet();
            case 6:
                return new ScaleXset();
            case 7:
                return new ScaleYset();
            case 8:
                return new AlphaSet();
            case 9:
                return new PivotXset();
            case 10:
                return new PivotYset();
            case 11:
                return new RotationSet();
            case 12:
                return new ElevationSet();
            case 13:
                return new PathRotate();
            case 14:
                return new AlphaSet();
            case 15:
                return new AlphaSet();
            default:
                return null;
        }
    }

    public float get(float f) {
        return (float) this.mCurveFit.getPos((double) f, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        return (float) this.mCurveFit.getSlope((double) f, 0);
    }

    public void setPoint(int i2, float f) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i3 = this.count;
        iArr2[i3] = i2;
        this.mValues[i3] = f;
        this.count = i3 + 1;
    }

    public abstract void setProperty(View view, float f);

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i2) {
        int i3 = this.count;
        if (i3 != 0) {
            Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i3 - 1);
            int i4 = 1;
            for (int i5 = 1; i5 < this.count; i5++) {
                int[] iArr = this.mTimePoints;
                if (iArr[i5 - 1] != iArr[i5]) {
                    i4++;
                }
            }
            double[] dArr = new double[i4];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i4;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i6 = 0;
            for (int i7 = 0; i7 < this.count; i7++) {
                if (i7 > 0) {
                    int[] iArr3 = this.mTimePoints;
                    if (iArr3[i7] == iArr3[i7 - 1]) {
                    }
                }
                dArr[i6] = ((double) this.mTimePoints[i7]) * 0.01d;
                dArr2[i6][0] = (double) this.mValues[i7];
                i6++;
            }
            this.mCurveFit = CurveFit.get(i2, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.count; i2++) {
            StringBuilder B = a.B(str, "[");
            B.append(this.mTimePoints[i2]);
            B.append(" , ");
            B.append(decimalFormat.format((double) this.mValues[i2]));
            B.append("] ");
            str = B.toString();
        }
        return str;
    }
}
