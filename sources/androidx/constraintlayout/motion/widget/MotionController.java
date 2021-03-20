package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.VelocityMatrix;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private int MAX_DIMENSION = 4;
    public String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    public String mConstraintTag;
    private int mCurveFitType = -1;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private KeyTrigger[] mKeyTriggers;
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    public float mMotionStagger = Float.NaN;
    private int mPathMotionArc = Key.UNSET;
    private CurveFit[] mSpline;
    public float mStaggerOffset = 0.0f;
    public float mStaggerScale = 1.0f;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    private float[] mValuesBuff = new float[4];
    private float[] mVelocity = new float[1];
    public View mView;

    public MotionController(View view) {
        setView(view);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.mStaggerScale;
            if (((double) f4) != 1.0d) {
                float f5 = this.mStaggerOffset;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f6 = Float.NaN;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f7 = next.time;
                if (f7 < f) {
                    easing = easing2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.time;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) easing.get(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f = 1.0f / ((float) 99);
        double d = ShadowDrawableWrapper.COS_45;
        double d2 = 0.0d;
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < 100) {
            float f3 = ((float) i2) * f;
            double d3 = (double) f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f4 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                float f6 = f;
                if (easing2 != null) {
                    float f7 = next.time;
                    if (f7 < f3) {
                        f5 = f7;
                        easing = easing2;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.time;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (easing != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f9 = f4 - f5;
                d3 = (double) ((((float) easing.get((double) ((f3 - f5) / f9))) * f9) + f5);
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                f2 = (float) (Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])) + ((double) f2));
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
            i2++;
            f = f8;
        }
        return f2;
    }

    private void insertKey(MotionPaths motionPaths) {
        int binarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (binarySearch == 0) {
            StringBuilder y = a.y(" KeyPath positon \"");
            y.append(motionPaths.position);
            y.append("\" outside of range");
            Log.e(TAG, y.toString());
        }
        this.mMotionPaths.add((-binarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((float) ((int) this.mView.getX()), (float) ((int) this.mView.getY()), (float) this.mView.getWidth(), (float) this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i2) {
        int i3 = i2;
        float f = 1.0f / ((float) (i3 - 1));
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            SplineSet splineSet = hashMap.get(Key.TRANSLATION_X);
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            SplineSet splineSet2 = hashMap2.get(Key.TRANSLATION_Y);
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            KeyCycleOscillator keyCycleOscillator = hashMap3.get(Key.TRANSLATION_X);
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            KeyCycleOscillator keyCycleOscillator2 = hashMap4.get(Key.TRANSLATION_Y);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            float f2 = ((float) i4) * f;
            float f3 = this.mStaggerScale;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.mStaggerOffset;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = (f2 - f5) * f3;
                }
            }
            double d = (double) f2;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = next.time;
                    if (f7 < f2) {
                        easing = easing2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) easing.get((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i4 * 2);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().mMode;
                i2++;
            }
        }
        int i3 = 0;
        for (double pos : timePoints) {
            this.mSpline[0].getPos(pos, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().mMode;
                i2++;
            }
        }
        int i3 = 0;
        for (double pos : timePoints) {
            this.mSpline[0].getPos(pos, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    public void buildPath(float[] fArr, int i2) {
        float[] fArr2 = fArr;
        int i3 = i2;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i3 - 1));
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator = null;
        SplineSet splineSet = hashMap == null ? null : hashMap.get(Key.TRANSLATION_X);
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get(Key.TRANSLATION_Y);
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap3 == null ? null : hashMap3.get(Key.TRANSLATION_X);
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            keyCycleOscillator = hashMap4.get(Key.TRANSLATION_Y);
        }
        int i4 = 0;
        while (i4 < i3) {
            float f3 = ((float) i4) * f2;
            float f4 = this.mStaggerScale;
            if (f4 != f) {
                float f5 = this.mStaggerOffset;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = (f3 - f5) * f4;
                }
            }
            double d = (double) f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f7 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    Easing easing3 = easing2;
                    float f8 = next.time;
                    if (f8 < f3) {
                        f7 = f8;
                        easing = easing3;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.time;
                    }
                }
                int i5 = i2;
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f9 = f6 - f7;
                d = (double) ((((float) easing.get((double) ((f3 - f7) / f9))) * f9) + f7);
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i6 = i4 * 2;
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr2, i6);
            if (keyCycleOscillator2 != null) {
                fArr2[i6] = keyCycleOscillator2.get(f3) + fArr2[i6];
            } else if (splineSet != null) {
                fArr2[i6] = splineSet.get(f3) + fArr2[i6];
            }
            if (keyCycleOscillator != null) {
                int i7 = i6 + 1;
                fArr2[i7] = keyCycleOscillator.get(f3) + fArr2[i7];
            } else if (splineSet2 != null) {
                int i8 = i6 + 1;
                fArr2[i8] = splineSet2.get(f3) + fArr2[i8];
            }
            i4++;
            i3 = i2;
            f = 1.0f;
        }
    }

    public void buildRect(float f, float[] fArr, int i2) {
        this.mSpline[0].getPos((double) getAdjustedPosition(f, (float[]) null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
    }

    public void buildRectangles(float[] fArr, int i2) {
        float f = 1.0f / ((float) (i2 - 1));
        for (int i3 = 0; i3 < i2; i3++) {
            this.mSpline[0].getPos((double) getAdjustedPosition(((float) i3) * f, (float[]) null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i3 * 8);
        }
    }

    public int getAttributeValues(String str, float[] fArr, int i2) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = splineSet.get((float) (i3 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    public void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i2 = 0;
        if (curveFitArr != null) {
            double d = (double) adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f4);
                i2++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f5 = motionPaths.x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f6 = f5 - motionPaths2.x;
        float f7 = motionPaths.y - motionPaths2.y;
        fArr[0] = (((motionPaths.width - motionPaths2.width) + f6) * f2) + ((1.0f - f2) * f6);
        fArr[1] = (((motionPaths.height - motionPaths2.height) + f7) * f3) + ((1.0f - f3) * f7);
    }

    public int getDrawPath() {
        int i2 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().mDrawPath);
        }
        return Math.max(i2, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalX() {
        return this.mEndMotionPath.x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.y;
    }

    public MotionPaths getKeyFrame(int i2) {
        return this.mMotionPaths.get(i2);
    }

    public int getKeyFrameInfo(int i2, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i5 = next.mType;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.mFramePosition;
                iArr[i7] = i8;
                this.mSpline[0].getPos((double) (((float) i8) / 100.0f), this.mInterpolateData);
                this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i11 = i10 + 1;
                    iArr[i11] = keyPosition.mPositionType;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(keyPosition.mPercentX);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    public float getKeyFrameParameter(int i2, float f, float f2) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f3 = motionPaths.x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f4 = motionPaths2.x;
        float f5 = f3 - f4;
        float f6 = motionPaths.y;
        float f7 = motionPaths2.y;
        float f8 = f6 - f7;
        float f9 = (motionPaths2.width / 2.0f) + f4;
        float f10 = (motionPaths2.height / 2.0f) + f7;
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f12 * f8) + (f11 * f5);
        if (i2 == 0) {
            return f13 / hypot;
        }
        if (i2 == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i2 == 2) {
            return f11 / f5;
        }
        if (i2 == 3) {
            return f12 / f5;
        }
        if (i2 == 4) {
            return f11 / f8;
        }
        if (i2 != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    public KeyPositionBase getPositionKeyframe(int i2, int i3, float f, float f2) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.x;
        rectF.left = f3;
        float f4 = motionPaths.y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.x;
        rectF2.left = f5;
        float f6 = motionPaths2.y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i2, i3, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public void getPostLayoutDvDp(float f, int i2, int i3, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator = null;
        SplineSet splineSet = hashMap == null ? null : hashMap.get(Key.TRANSLATION_X);
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get(Key.TRANSLATION_Y);
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get(Key.SCALE_X);
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get(Key.SCALE_Y);
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap6 == null ? null : hashMap6.get(Key.TRANSLATION_X);
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = hashMap7 == null ? null : hashMap7.get(Key.TRANSLATION_Y);
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = hashMap9 == null ? null : hashMap9.get(Key.SCALE_X);
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            keyCycleOscillator = hashMap10.get(Key.SCALE_Y);
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator4, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator2, keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator5, keyCycleOscillator, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = (double) adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = (double) getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i4 < dArr2.length) {
                    dArr2[i4] = dArr2[i4] * ((double) f4);
                    i4++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.mStartMotionPath.setDpDt(f5, f6, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f5, f6, i2, i3, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f7 = motionPaths.x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f8 = f7 - motionPaths2.x;
            float f9 = motionPaths.y - motionPaths2.y;
            fArr[0] = (((motionPaths.width - motionPaths2.width) + f8) * f2) + ((1.0f - f2) * f8);
            fArr[1] = (((motionPaths.height - motionPaths2.height) + f9) * f3) + ((1.0f - f3) * f9);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator4, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator2, keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator5, keyCycleOscillator, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i2, i3, fArr);
        }
    }

    public float getStartX() {
        return this.mStartMotionPath.x;
    }

    public float getStartY() {
        return this.mStartMotionPath.y;
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it = this.mKeyList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i4 = next.mFramePosition;
            iArr[i2] = (next.mType * 1000) + i4;
            this.mSpline[0].getPos((double) (((float) i4) / 100.0f), this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: androidx.constraintlayout.motion.widget.TimeCycleSplineSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean interpolate(android.view.View r23, float r24, long r25, androidx.constraintlayout.motion.widget.KeyCache r27) {
        /*
            r22 = this;
            r0 = r22
            r11 = r23
            r1 = 0
            r2 = r24
            float r12 = r0.getAdjustedPosition(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r2 = r0.mAttributesMap
            if (r2 == 0) goto L_0x0027
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0027
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.SplineSet r3 = (androidx.constraintlayout.motion.widget.SplineSet) r3
            r3.setProperty(r11, r12)
            goto L_0x0017
        L_0x0027:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r2 = r0.mTimeCycleAttributesMap
            r13 = 0
            if (r2 == 0) goto L_0x0059
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r13
        L_0x0036:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r7.next()
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r1 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate
            if (r2 == 0) goto L_0x004a
            r8 = r1
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$PathRotate r8 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate) r8
            goto L_0x0036
        L_0x004a:
            r2 = r23
            r3 = r12
            r4 = r25
            r6 = r27
            boolean r1 = r1.setProperty(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0036
        L_0x0057:
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r8 = r1
            r14 = r13
        L_0x005b:
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r0.mSpline
            r15 = 1
            if (r1 == 0) goto L_0x013a
            r1 = r1[r13]
            double r9 = (double) r12
            double[] r2 = r0.mInterpolateData
            r1.getPos((double) r9, (double[]) r2)
            androidx.constraintlayout.motion.utils.CurveFit[] r1 = r0.mSpline
            r1 = r1[r13]
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope((double) r9, (double[]) r2)
            androidx.constraintlayout.motion.utils.CurveFit r1 = r0.mArcSpline
            if (r1 == 0) goto L_0x0084
            double[] r2 = r0.mInterpolateData
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0084
            r1.getPos((double) r9, (double[]) r2)
            androidx.constraintlayout.motion.utils.CurveFit r1 = r0.mArcSpline
            double[] r2 = r0.mInterpolateVelocity
            r1.getSlope((double) r9, (double[]) r2)
        L_0x0084:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            int[] r3 = r0.mInterpolateVariables
            double[] r4 = r0.mInterpolateData
            double[] r5 = r0.mInterpolateVelocity
            r6 = 0
            r2 = r23
            r1.setView(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r1 = r0.mAttributesMap
            if (r1 == 0) goto L_0x00bd
            java.util.Collection r1 = r1.values()
            java.util.Iterator r16 = r1.iterator()
        L_0x009e:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r16.next()
            androidx.constraintlayout.motion.widget.SplineSet r1 = (androidx.constraintlayout.motion.widget.SplineSet) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.SplineSet.PathRotate
            if (r2 == 0) goto L_0x009e
            androidx.constraintlayout.motion.widget.SplineSet$PathRotate r1 = (androidx.constraintlayout.motion.widget.SplineSet.PathRotate) r1
            double[] r2 = r0.mInterpolateVelocity
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.setPathRotate(r2, r3, r4, r6)
            goto L_0x009e
        L_0x00bd:
            if (r8 == 0) goto L_0x00da
            double[] r1 = r0.mInterpolateVelocity
            r16 = r1[r13]
            r18 = r1[r15]
            r1 = r8
            r2 = r23
            r3 = r27
            r4 = r12
            r5 = r25
            r7 = r16
            r20 = r9
            r9 = r18
            boolean r1 = r1.setPathRotate(r2, r3, r4, r5, r7, r9)
            r1 = r1 | r14
            r14 = r1
            goto L_0x00dc
        L_0x00da:
            r20 = r9
        L_0x00dc:
            r1 = r15
        L_0x00dd:
            androidx.constraintlayout.motion.utils.CurveFit[] r2 = r0.mSpline
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0103
            r2 = r2[r1]
            float[] r3 = r0.mValuesBuff
            r4 = r20
            r2.getPos((double) r4, (float[]) r3)
            androidx.constraintlayout.motion.widget.MotionPaths r2 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.attributes
            java.lang.String[] r3 = r0.mAttributeNames
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
            float[] r3 = r0.mValuesBuff
            r2.setInterpolatedValue(r11, r3)
            int r1 = r1 + 1
            goto L_0x00dd
        L_0x0103:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mStartPoint
            int r2 = r1.mVisibilityMode
            if (r2 != 0) goto L_0x0128
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x011d
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r1 = r0.mEndPoint
        L_0x0117:
            int r1 = r1.visibility
            r11.setVisibility(r1)
            goto L_0x0128
        L_0x011d:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r2 = r0.mEndPoint
            int r2 = r2.visibility
            int r1 = r1.visibility
            if (r2 == r1) goto L_0x0128
            r11.setVisibility(r13)
        L_0x0128:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r1 = r0.mKeyTriggers
            if (r1 == 0) goto L_0x0184
            r1 = r13
        L_0x012d:
            androidx.constraintlayout.motion.widget.KeyTrigger[] r2 = r0.mKeyTriggers
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0184
            r2 = r2[r1]
            r2.conditionallyFire(r12, r11)
            int r1 = r1 + 1
            goto L_0x012d
        L_0x013a:
            androidx.constraintlayout.motion.widget.MotionPaths r1 = r0.mStartMotionPath
            float r2 = r1.x
            androidx.constraintlayout.motion.widget.MotionPaths r3 = r0.mEndMotionPath
            float r4 = r3.x
            float r2 = b.e.a.a.a.a(r4, r2, r12, r2)
            float r4 = r1.y
            float r5 = r3.y
            float r4 = b.e.a.a.a.a(r5, r4, r12, r4)
            float r5 = r1.width
            float r6 = r3.width
            float r7 = b.e.a.a.a.a(r6, r5, r12, r5)
            float r1 = r1.height
            float r3 = r3.height
            float r8 = b.e.a.a.a.a(r3, r1, r12, r1)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0174
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0181
        L_0x0174:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
        L_0x0181:
            r11.layout(r10, r9, r2, r4)
        L_0x0184:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r1 = r0.mCycleMap
            if (r1 == 0) goto L_0x01b3
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0190:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01b3
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r1 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet
            if (r2 == 0) goto L_0x01af
            androidx.constraintlayout.motion.widget.KeyCycleOscillator$PathRotateSet r1 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet) r1
            double[] r2 = r0.mInterpolateVelocity
            r4 = r2[r13]
            r6 = r2[r15]
            r2 = r23
            r3 = r12
            r1.setPathRotate(r2, r3, r4, r6)
            goto L_0x0190
        L_0x01af:
            r1.setProperty(r11, r12)
            goto L_0x0190
        L_0x01b3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.interpolate(android.view.View, float, long, androidx.constraintlayout.motion.widget.KeyCache):boolean");
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.x;
        rectF.left = f3;
        float f4 = motionPaths.y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.x;
        rectF2.left = f5;
        float f6 = motionPaths2.y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public void setDrawPath(int i2) {
        this.mStartMotionPath.mDrawPath = i2;
    }

    public void setEndState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds((float) constraintWidget.getX(), (float) constraintWidget.getY(), (float) constraintWidget.getWidth(), (float) constraintWidget.getHeight());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setPathMotionArc(int i2) {
        this.mPathMotionArc = i2;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds((float) constraintWidget.getX(), (float) constraintWidget.getY(), (float) constraintWidget.getWidth(), (float) constraintWidget.getHeight());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: double[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setup(int r17, int r18, float r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.mPathMotionArc
            int r7 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r6 == r7) goto L_0x0027
            androidx.constraintlayout.motion.widget.MotionPaths r7 = r0.mStartMotionPath
            r7.mPathMotionArc = r6
        L_0x0027:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r6 = r0.mStartPoint
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            r6.different(r7, r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r6 = r0.mKeyList
            if (r6 == 0) goto L_0x008c
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L_0x0037:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x008d
            java.lang.Object r8 = r6.next()
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyPosition
            if (r9 == 0) goto L_0x0064
            androidx.constraintlayout.motion.widget.KeyPosition r8 = (androidx.constraintlayout.motion.widget.KeyPosition) r8
            androidx.constraintlayout.motion.widget.MotionPaths r9 = new androidx.constraintlayout.motion.widget.MotionPaths
            androidx.constraintlayout.motion.widget.MotionPaths r14 = r0.mStartMotionPath
            androidx.constraintlayout.motion.widget.MotionPaths r15 = r0.mEndMotionPath
            r10 = r9
            r11 = r17
            r12 = r18
            r13 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0.insertKey(r9)
            int r8 = r8.mCurveFit
            int r9 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r8 == r9) goto L_0x0037
            r0.mCurveFitType = r8
            goto L_0x0037
        L_0x0064:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r9 == 0) goto L_0x006c
            r8.getAttributeNames(r4)
            goto L_0x0037
        L_0x006c:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r9 == 0) goto L_0x0074
            r8.getAttributeNames(r2)
            goto L_0x0037
        L_0x0074:
            boolean r9 = r8 instanceof androidx.constraintlayout.motion.widget.KeyTrigger
            if (r9 == 0) goto L_0x0085
            if (r7 != 0) goto L_0x007f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x007f:
            androidx.constraintlayout.motion.widget.KeyTrigger r8 = (androidx.constraintlayout.motion.widget.KeyTrigger) r8
            r7.add(r8)
            goto L_0x0037
        L_0x0085:
            r8.setInterpolation(r5)
            r8.getAttributeNames(r3)
            goto L_0x0037
        L_0x008c:
            r7 = 0
        L_0x008d:
            r6 = 0
            if (r7 == 0) goto L_0x009a
            androidx.constraintlayout.motion.widget.KeyTrigger[] r8 = new androidx.constraintlayout.motion.widget.KeyTrigger[r6]
            java.lang.Object[] r7 = r7.toArray(r8)
            androidx.constraintlayout.motion.widget.KeyTrigger[] r7 = (androidx.constraintlayout.motion.widget.KeyTrigger[]) r7
            r0.mKeyTriggers = r7
        L_0x009a:
            boolean r7 = r3.isEmpty()
            java.lang.String r8 = ","
            java.lang.String r9 = "CUSTOM,"
            r10 = 1
            if (r7 != 0) goto L_0x016a
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mAttributesMap = r7
            java.util.Iterator r7 = r3.iterator()
        L_0x00b0:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0108
            java.lang.Object r11 = r7.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r11.startsWith(r9)
            if (r12 == 0) goto L_0x00f7
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.lang.String[] r13 = r11.split(r8)
            r10 = r13[r10]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r13 = r0.mKeyList
            java.util.Iterator r13 = r13.iterator()
        L_0x00d3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00f2
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.motion.widget.Key r14 = (androidx.constraintlayout.motion.widget.Key) r14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r14.mCustomConstraints
            if (r15 != 0) goto L_0x00e4
            goto L_0x00d3
        L_0x00e4:
            java.lang.Object r15 = r15.get(r10)
            androidx.constraintlayout.widget.ConstraintAttribute r15 = (androidx.constraintlayout.widget.ConstraintAttribute) r15
            if (r15 == 0) goto L_0x00d3
            int r14 = r14.mFramePosition
            r12.append(r14, r15)
            goto L_0x00d3
        L_0x00f2:
            androidx.constraintlayout.motion.widget.SplineSet r10 = androidx.constraintlayout.motion.widget.SplineSet.makeCustomSpline(r11, r12)
            goto L_0x00fb
        L_0x00f7:
            androidx.constraintlayout.motion.widget.SplineSet r10 = androidx.constraintlayout.motion.widget.SplineSet.makeSpline(r11)
        L_0x00fb:
            if (r10 != 0) goto L_0x00fe
            goto L_0x0106
        L_0x00fe:
            r10.setType(r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r12 = r0.mAttributesMap
            r12.put(r11, r10)
        L_0x0106:
            r10 = 1
            goto L_0x00b0
        L_0x0108:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r7 = r0.mKeyList
            if (r7 == 0) goto L_0x0126
            java.util.Iterator r7 = r7.iterator()
        L_0x0110:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0126
            java.lang.Object r10 = r7.next()
            androidx.constraintlayout.motion.widget.Key r10 = (androidx.constraintlayout.motion.widget.Key) r10
            boolean r11 = r10 instanceof androidx.constraintlayout.motion.widget.KeyAttributes
            if (r11 == 0) goto L_0x0110
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r11 = r0.mAttributesMap
            r10.addValues(r11)
            goto L_0x0110
        L_0x0126:
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mStartPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r10 = r0.mAttributesMap
            r7.addValues(r10, r6)
            androidx.constraintlayout.motion.widget.MotionConstrainedPoint r7 = r0.mEndPoint
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r10 = r0.mAttributesMap
            r11 = 100
            r7.addValues(r10, r11)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r7 = r0.mAttributesMap
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0140:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x016a
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r5.containsKey(r10)
            if (r11 == 0) goto L_0x015d
            java.lang.Object r11 = r5.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x015e
        L_0x015d:
            r11 = r6
        L_0x015e:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r12 = r0.mAttributesMap
            java.lang.Object r10 = r12.get(r10)
            androidx.constraintlayout.motion.widget.SplineSet r10 = (androidx.constraintlayout.motion.widget.SplineSet) r10
            r10.setup(r11)
            goto L_0x0140
        L_0x016a:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0239
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r7 = r0.mTimeCycleAttributesMap
            if (r7 != 0) goto L_0x017b
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.mTimeCycleAttributesMap = r7
        L_0x017b:
            java.util.Iterator r2 = r2.iterator()
        L_0x017f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e5
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r10 = r0.mTimeCycleAttributesMap
            boolean r10 = r10.containsKey(r7)
            if (r10 == 0) goto L_0x0194
            goto L_0x017f
        L_0x0194:
            boolean r10 = r7.startsWith(r9)
            if (r10 == 0) goto L_0x01d3
            android.util.SparseArray r10 = new android.util.SparseArray
            r10.<init>()
            java.lang.String[] r11 = r7.split(r8)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r12 = r0.mKeyList
            java.util.Iterator r12 = r12.iterator()
        L_0x01ac:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01cb
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.Key r13 = (androidx.constraintlayout.motion.widget.Key) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.mCustomConstraints
            if (r14 != 0) goto L_0x01bd
            goto L_0x01ac
        L_0x01bd:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L_0x01ac
            int r13 = r13.mFramePosition
            r10.append(r13, r14)
            goto L_0x01ac
        L_0x01cb:
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r10 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeCustomSpline(r7, r10)
            r12 = r10
            r10 = r20
            goto L_0x01d9
        L_0x01d3:
            r10 = r20
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r12 = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeSpline(r7, r10)
        L_0x01d9:
            if (r12 != 0) goto L_0x01dc
            goto L_0x017f
        L_0x01dc:
            r12.setType(r7)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r13 = r0.mTimeCycleAttributesMap
            r13.put(r7, r12)
            goto L_0x017f
        L_0x01e5:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L_0x0205
            java.util.Iterator r2 = r2.iterator()
        L_0x01ed:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0205
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.motion.widget.Key r7 = (androidx.constraintlayout.motion.widget.Key) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle
            if (r8 == 0) goto L_0x01ed
            androidx.constraintlayout.motion.widget.KeyTimeCycle r7 = (androidx.constraintlayout.motion.widget.KeyTimeCycle) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r8 = r0.mTimeCycleAttributesMap
            r7.addTimeValues(r8)
            goto L_0x01ed
        L_0x0205:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r2 = r0.mTimeCycleAttributesMap
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x020f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0239
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x022c
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x022d
        L_0x022c:
            r8 = r6
        L_0x022d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r10 = r0.mTimeCycleAttributesMap
            java.lang.Object r7 = r10.get(r7)
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r7 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r7
            r7.setup(r8)
            goto L_0x020f
        L_0x0239:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r2 = r0.mMotionPaths
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            androidx.constraintlayout.motion.widget.MotionPaths[] r7 = new androidx.constraintlayout.motion.widget.MotionPaths[r2]
            androidx.constraintlayout.motion.widget.MotionPaths r8 = r0.mStartMotionPath
            r7[r6] = r8
            int r8 = r2 + -1
            androidx.constraintlayout.motion.widget.MotionPaths r10 = r0.mEndMotionPath
            r7[r8] = r10
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x025c
            int r8 = r0.mCurveFitType
            r10 = -1
            if (r8 != r10) goto L_0x025c
            r0.mCurveFitType = r6
        L_0x025c:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> r8 = r0.mMotionPaths
            java.util.Iterator r8 = r8.iterator()
            r10 = 1
        L_0x0263:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0275
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = (androidx.constraintlayout.motion.widget.MotionPaths) r11
            int r12 = r10 + 1
            r7[r10] = r11
            r10 = r12
            goto L_0x0263
        L_0x0275:
            r8 = 18
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            androidx.constraintlayout.motion.widget.MotionPaths r11 = r0.mEndMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0288:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02b7
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            androidx.constraintlayout.motion.widget.MotionPaths r13 = r0.mStartMotionPath
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.attributes
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x0288
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0288
            r10.add(r12)
            goto L_0x0288
        L_0x02b7:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r10.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.mAttributeNames = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.mAttributeInterpCount = r3
            r3 = r6
        L_0x02c7:
            java.lang.String[] r9 = r0.mAttributeNames
            int r10 = r9.length
            if (r3 >= r10) goto L_0x02fb
            r9 = r9[r3]
            int[] r10 = r0.mAttributeInterpCount
            r10[r3] = r6
            r10 = r6
        L_0x02d3:
            if (r10 >= r2) goto L_0x02f8
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.attributes
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x02f5
            int[] r11 = r0.mAttributeInterpCount
            r12 = r11[r3]
            r10 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r10 = r10.attributes
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.widget.ConstraintAttribute r9 = (androidx.constraintlayout.widget.ConstraintAttribute) r9
            int r9 = r9.noOfInterpValues()
            int r9 = r9 + r12
            r11[r3] = r9
            goto L_0x02f8
        L_0x02f5:
            int r10 = r10 + 1
            goto L_0x02d3
        L_0x02f8:
            int r3 = r3 + 1
            goto L_0x02c7
        L_0x02fb:
            r3 = r7[r6]
            int r3 = r3.mPathMotionArc
            int r10 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r3 == r10) goto L_0x0305
            r3 = 1
            goto L_0x0306
        L_0x0305:
            r3 = r6
        L_0x0306:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L_0x030b:
            if (r10 >= r2) goto L_0x031b
            r11 = r7[r10]
            int r12 = r10 + -1
            r12 = r7[r12]
            java.lang.String[] r13 = r0.mAttributeNames
            r11.different(r12, r9, r13, r3)
            int r10 = r10 + 1
            goto L_0x030b
        L_0x031b:
            r3 = 1
            r10 = r6
        L_0x031d:
            if (r3 >= r8) goto L_0x0328
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0325
            int r10 = r10 + 1
        L_0x0325:
            int r3 = r3 + 1
            goto L_0x031d
        L_0x0328:
            int[] r3 = new int[r10]
            r0.mInterpolateVariables = r3
            int r10 = r3.length
            double[] r10 = new double[r10]
            r0.mInterpolateData = r10
            int r3 = r3.length
            double[] r3 = new double[r3]
            r0.mInterpolateVelocity = r3
            r3 = 1
            r10 = r6
        L_0x0338:
            if (r3 >= r8) goto L_0x0348
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0345
            int[] r11 = r0.mInterpolateVariables
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L_0x0345:
            int r3 = r3 + 1
            goto L_0x0338
        L_0x0348:
            int[] r3 = r0.mInterpolateVariables
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = r6
        L_0x035b:
            if (r9 >= r2) goto L_0x0370
            r10 = r7[r9]
            r11 = r3[r9]
            int[] r12 = r0.mInterpolateVariables
            r10.fillStandard(r11, r12)
            r10 = r7[r9]
            float r10 = r10.time
            double r10 = (double) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x035b
        L_0x0370:
            r9 = r6
        L_0x0371:
            int[] r10 = r0.mInterpolateVariables
            int r11 = r10.length
            if (r9 >= r11) goto L_0x03a8
            r10 = r10[r9]
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int r11 = r11.length
            if (r10 >= r11) goto L_0x03a5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.MotionPaths.names
            int[] r12 = r0.mInterpolateVariables
            r12 = r12[r9]
            r11 = r11[r12]
            java.lang.String r12 = " ["
            java.lang.String r10 = b.e.a.a.a.q(r10, r11, r12)
            r11 = r6
        L_0x0391:
            if (r11 >= r2) goto L_0x03a5
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            r12 = r3[r11]
            r13 = r12[r9]
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            int r11 = r11 + 1
            goto L_0x0391
        L_0x03a5:
            int r9 = r9 + 1
            goto L_0x0371
        L_0x03a8:
            java.lang.String[] r9 = r0.mAttributeNames
            int r9 = r9.length
            int r9 = r9 + 1
            androidx.constraintlayout.motion.utils.CurveFit[] r9 = new androidx.constraintlayout.motion.utils.CurveFit[r9]
            r0.mSpline = r9
            r9 = r6
        L_0x03b2:
            java.lang.String[] r10 = r0.mAttributeNames
            int r11 = r10.length
            if (r6 >= r11) goto L_0x041b
            r10 = r10[r6]
            r11 = 0
            r12 = 0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r11
        L_0x03bf:
            if (r9 >= r2) goto L_0x03fe
            r15 = r7[r9]
            boolean r15 = r15.hasCustomData(r10)
            if (r15 == 0) goto L_0x03f5
            if (r14 != 0) goto L_0x03e1
            double[] r13 = new double[r2]
            r14 = r7[r9]
            int r14 = r14.getCustomDataCount(r10)
            int[] r5 = new int[r5]
            r15 = 1
            r5[r15] = r14
            r5[r12] = r2
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r1, r5)
            r14 = r5
            double[][] r14 = (double[][]) r14
        L_0x03e1:
            r5 = r7[r9]
            float r5 = r5.time
            r19 = r4
            double r4 = (double) r5
            r13[r11] = r4
            r4 = r7[r9]
            r5 = r14[r11]
            r12 = 0
            r4.getCustomData(r10, r5, r12)
            int r11 = r11 + 1
            goto L_0x03f7
        L_0x03f5:
            r19 = r4
        L_0x03f7:
            int r9 = r9 + 1
            r5 = 2
            r12 = 0
            r4 = r19
            goto L_0x03bf
        L_0x03fe:
            r19 = r4
            double[] r4 = java.util.Arrays.copyOf(r13, r11)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r14, r11)
            double[][] r5 = (double[][]) r5
            androidx.constraintlayout.motion.utils.CurveFit[] r9 = r0.mSpline
            int r6 = r6 + 1
            int r10 = r0.mCurveFitType
            androidx.constraintlayout.motion.utils.CurveFit r4 = androidx.constraintlayout.motion.utils.CurveFit.get(r10, r4, r5)
            r9[r6] = r4
            r5 = 2
            r9 = 0
            r4 = r19
            goto L_0x03b2
        L_0x041b:
            r19 = r4
            androidx.constraintlayout.motion.utils.CurveFit[] r4 = r0.mSpline
            int r5 = r0.mCurveFitType
            androidx.constraintlayout.motion.utils.CurveFit r3 = androidx.constraintlayout.motion.utils.CurveFit.get(r5, r8, r3)
            r5 = 0
            r4[r5] = r3
            r3 = r7[r5]
            int r3 = r3.mPathMotionArc
            int r4 = androidx.constraintlayout.motion.widget.Key.UNSET
            if (r3 == r4) goto L_0x046f
            int[] r3 = new int[r2]
            double[] r4 = new double[r2]
            r6 = 2
            int[] r8 = new int[r6]
            r9 = 1
            r8[r9] = r6
            r8[r5] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r1 = (double[][]) r1
            r5 = 0
        L_0x0443:
            if (r5 >= r2) goto L_0x0469
            r6 = r7[r5]
            int r6 = r6.mPathMotionArc
            r3[r5] = r6
            r6 = r7[r5]
            float r6 = r6.time
            double r8 = (double) r6
            r4[r5] = r8
            r6 = r1[r5]
            r8 = r7[r5]
            float r8 = r8.x
            double r8 = (double) r8
            r10 = 0
            r6[r10] = r8
            r6 = r1[r5]
            r8 = r7[r5]
            float r8 = r8.y
            double r8 = (double) r8
            r10 = 1
            r6[r10] = r8
            int r5 = r5 + 1
            goto L_0x0443
        L_0x0469:
            androidx.constraintlayout.motion.utils.CurveFit r1 = androidx.constraintlayout.motion.utils.CurveFit.getArc(r3, r4, r1)
            r0.mArcSpline = r1
        L_0x046f:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.mCycleMap = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            if (r2 == 0) goto L_0x04e4
            java.util.Iterator r2 = r19.iterator()
        L_0x0480:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ac
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r4 = androidx.constraintlayout.motion.widget.KeyCycleOscillator.makeSpline(r3)
            if (r4 != 0) goto L_0x0493
            goto L_0x0480
        L_0x0493:
            boolean r5 = r4.variesByPath()
            if (r5 == 0) goto L_0x04a3
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04a3
            float r1 = r16.getPreCycleDistance()
        L_0x04a3:
            r4.setType(r3)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r5 = r0.mCycleMap
            r5.put(r3, r4)
            goto L_0x0480
        L_0x04ac:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> r2 = r0.mKeyList
            java.util.Iterator r2 = r2.iterator()
        L_0x04b2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ca
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.Key r3 = (androidx.constraintlayout.motion.widget.Key) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.KeyCycle
            if (r4 == 0) goto L_0x04b2
            androidx.constraintlayout.motion.widget.KeyCycle r3 = (androidx.constraintlayout.motion.widget.KeyCycle) r3
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r4 = r0.mCycleMap
            r3.addCycleValues(r4)
            goto L_0x04b2
        L_0x04ca:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> r2 = r0.mCycleMap
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04e4
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.KeyCycleOscillator r3 = (androidx.constraintlayout.motion.widget.KeyCycleOscillator) r3
            r3.setup(r1)
            goto L_0x04d4
        L_0x04e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionController.setup(int, int, float, long):void");
    }

    public String toString() {
        StringBuilder y = a.y(" start: x: ");
        y.append(this.mStartMotionPath.x);
        y.append(" y: ");
        y.append(this.mStartMotionPath.y);
        y.append(" end: x: ");
        y.append(this.mEndMotionPath.x);
        y.append(" y: ");
        y.append(this.mEndMotionPath.y);
        return y.toString();
    }
}
