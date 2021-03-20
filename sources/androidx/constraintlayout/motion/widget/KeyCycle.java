package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import b.e.a.a.a;
import java.util.HashMap;
import java.util.HashSet;

public class KeyCycle extends Key {
    public static final int KEY_TYPE = 4;
    public static final String NAME = "KeyCycle";
    private static final String TAG = "KeyCycle";
    /* access modifiers changed from: private */
    public float mAlpha = Float.NaN;
    /* access modifiers changed from: private */
    public int mCurveFit = 0;
    /* access modifiers changed from: private */
    public float mElevation = Float.NaN;
    /* access modifiers changed from: private */
    public float mProgress = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotation = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mRotationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleX = Float.NaN;
    /* access modifiers changed from: private */
    public float mScaleY = Float.NaN;
    /* access modifiers changed from: private */
    public String mTransitionEasing = null;
    /* access modifiers changed from: private */
    public float mTransitionPathRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationX = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationY = Float.NaN;
    /* access modifiers changed from: private */
    public float mTranslationZ = Float.NaN;
    /* access modifiers changed from: private */
    public float mWaveOffset = 0.0f;
    /* access modifiers changed from: private */
    public float mWavePeriod = Float.NaN;
    /* access modifiers changed from: private */
    public int mWaveShape = -1;
    /* access modifiers changed from: private */
    public int mWaveVariesBy = -1;

    public static class Loader {
        private static final int ANDROID_ALPHA = 9;
        private static final int ANDROID_ELEVATION = 10;
        private static final int ANDROID_ROTATION = 11;
        private static final int ANDROID_ROTATION_X = 12;
        private static final int ANDROID_ROTATION_Y = 13;
        private static final int ANDROID_SCALE_X = 15;
        private static final int ANDROID_SCALE_Y = 16;
        private static final int ANDROID_TRANSLATION_X = 17;
        private static final int ANDROID_TRANSLATION_Y = 18;
        private static final int ANDROID_TRANSLATION_Z = 19;
        private static final int CURVE_FIT = 4;
        private static final int FRAME_POSITION = 2;
        private static final int PROGRESS = 20;
        private static final int TARGET_ID = 1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 14;
        private static final int WAVE_OFFSET = 7;
        private static final int WAVE_PERIOD = 6;
        private static final int WAVE_SHAPE = 5;
        private static final int WAVE_VARIES_BY = 8;
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            mAttrMap.append(R.styleable.KeyCycle_framePosition, 2);
            mAttrMap.append(R.styleable.KeyCycle_transitionEasing, 3);
            mAttrMap.append(R.styleable.KeyCycle_curveFit, 4);
            mAttrMap.append(R.styleable.KeyCycle_waveShape, 5);
            mAttrMap.append(R.styleable.KeyCycle_wavePeriod, 6);
            mAttrMap.append(R.styleable.KeyCycle_waveOffset, 7);
            mAttrMap.append(R.styleable.KeyCycle_waveVariesBy, 8);
            mAttrMap.append(R.styleable.KeyCycle_android_alpha, 9);
            mAttrMap.append(R.styleable.KeyCycle_android_elevation, 10);
            mAttrMap.append(R.styleable.KeyCycle_android_rotation, 11);
            mAttrMap.append(R.styleable.KeyCycle_android_rotationX, 12);
            mAttrMap.append(R.styleable.KeyCycle_android_rotationY, 13);
            mAttrMap.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            mAttrMap.append(R.styleable.KeyCycle_android_scaleX, 15);
            mAttrMap.append(R.styleable.KeyCycle_android_scaleY, 16);
            mAttrMap.append(R.styleable.KeyCycle_android_translationX, 17);
            mAttrMap.append(R.styleable.KeyCycle_android_translationY, 18);
            mAttrMap.append(R.styleable.KeyCycle_android_translationZ, 19);
            mAttrMap.append(R.styleable.KeyCycle_motionProgress, 20);
        }

        private Loader() {
        }

        /* access modifiers changed from: private */
        public static void read(KeyCycle keyCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (mAttrMap.get(index)) {
                    case 1:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                keyCycle.mTargetId = typedArray.getResourceId(index, keyCycle.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyCycle.mTargetId);
                            keyCycle.mTargetId = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        keyCycle.mTargetString = typedArray.getString(index);
                        break;
                    case 2:
                        keyCycle.mFramePosition = typedArray.getInt(index, keyCycle.mFramePosition);
                        break;
                    case 3:
                        String unused = keyCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = keyCycle.mCurveFit = typedArray.getInteger(index, keyCycle.mCurveFit);
                        break;
                    case 5:
                        int unused3 = keyCycle.mWaveShape = typedArray.getInt(index, keyCycle.mWaveShape);
                        break;
                    case 6:
                        float unused4 = keyCycle.mWavePeriod = typedArray.getFloat(index, keyCycle.mWavePeriod);
                        break;
                    case 7:
                        float unused5 = keyCycle.mWaveOffset = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, keyCycle.mWaveOffset) : typedArray.getFloat(index, keyCycle.mWaveOffset);
                        break;
                    case 8:
                        int unused6 = keyCycle.mWaveVariesBy = typedArray.getInt(index, keyCycle.mWaveVariesBy);
                        break;
                    case 9:
                        float unused7 = keyCycle.mAlpha = typedArray.getFloat(index, keyCycle.mAlpha);
                        break;
                    case 10:
                        float unused8 = keyCycle.mElevation = typedArray.getDimension(index, keyCycle.mElevation);
                        break;
                    case 11:
                        float unused9 = keyCycle.mRotation = typedArray.getFloat(index, keyCycle.mRotation);
                        break;
                    case 12:
                        float unused10 = keyCycle.mRotationX = typedArray.getFloat(index, keyCycle.mRotationX);
                        break;
                    case 13:
                        float unused11 = keyCycle.mRotationY = typedArray.getFloat(index, keyCycle.mRotationY);
                        break;
                    case 14:
                        float unused12 = keyCycle.mTransitionPathRotate = typedArray.getFloat(index, keyCycle.mTransitionPathRotate);
                        break;
                    case 15:
                        float unused13 = keyCycle.mScaleX = typedArray.getFloat(index, keyCycle.mScaleX);
                        break;
                    case 16:
                        float unused14 = keyCycle.mScaleY = typedArray.getFloat(index, keyCycle.mScaleY);
                        break;
                    case 17:
                        float unused15 = keyCycle.mTranslationX = typedArray.getDimension(index, keyCycle.mTranslationX);
                        break;
                    case 18:
                        float unused16 = keyCycle.mTranslationY = typedArray.getDimension(index, keyCycle.mTranslationY);
                        break;
                    case 19:
                        float unused17 = keyCycle.mTranslationZ = typedArray.getDimension(index, keyCycle.mTranslationZ);
                        break;
                    case 20:
                        float unused18 = keyCycle.mProgress = typedArray.getFloat(index, keyCycle.mProgress);
                        break;
                    default:
                        StringBuilder y = a.y("unused attribute 0x");
                        y.append(Integer.toHexString(index));
                        y.append("   ");
                        y.append(mAttrMap.get(index));
                        Log.e("KeyCycle", y.toString());
                        break;
                }
            }
        }
    }

    public KeyCycle() {
        this.mType = 4;
        this.mCustomConstraints = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
        HashMap<String, KeyCycleOscillator> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith(Key.CUSTOM)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(next.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE) {
                    hashMap2.get(next).setPoint(this.mFramePosition, this.mWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(next);
                if (!Float.isNaN(value)) {
                    hashMap2.get(next).setPoint(this.mFramePosition, this.mWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, value);
                }
            }
        }
    }

    public void addValues(HashMap<String, SplineSet> hashMap) {
        float f;
        int i2;
        StringBuilder y = a.y("add ");
        y.append(hashMap.size());
        y.append(" values");
        Debug.logStack("KeyCycle", y.toString(), 2);
        for (String next : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(next);
            next.hashCode();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -1249320806:
                    if (next.equals(Key.ROTATION_X)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (next.equals(Key.ROTATION_Y)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (next.equals(Key.TRANSLATION_X)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals(Key.TRANSLATION_Y)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals(Key.TRANSLATION_Z)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals(Key.SCALE_X)) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals(Key.SCALE_Y)) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals(Key.ROTATION)) {
                        c = 8;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals(Key.ELEVATION)) {
                        c = 9;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals(Key.TRANSITION_PATH_ROTATE)) {
                        c = 10;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals(Key.ALPHA)) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (next.equals(Key.WAVE_OFFSET)) {
                        c = 12;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i2 = this.mFramePosition;
                    f = this.mRotationX;
                    break;
                case 1:
                    i2 = this.mFramePosition;
                    f = this.mRotationY;
                    break;
                case 2:
                    i2 = this.mFramePosition;
                    f = this.mTranslationX;
                    break;
                case 3:
                    i2 = this.mFramePosition;
                    f = this.mTranslationY;
                    break;
                case 4:
                    i2 = this.mFramePosition;
                    f = this.mTranslationZ;
                    break;
                case 5:
                    i2 = this.mFramePosition;
                    f = this.mProgress;
                    break;
                case 6:
                    i2 = this.mFramePosition;
                    f = this.mScaleX;
                    break;
                case 7:
                    i2 = this.mFramePosition;
                    f = this.mScaleY;
                    break;
                case 8:
                    i2 = this.mFramePosition;
                    f = this.mRotation;
                    break;
                case 9:
                    i2 = this.mFramePosition;
                    f = this.mElevation;
                    break;
                case 10:
                    i2 = this.mFramePosition;
                    f = this.mTransitionPathRotate;
                    break;
                case 11:
                    i2 = this.mFramePosition;
                    f = this.mAlpha;
                    break;
                case 12:
                    i2 = this.mFramePosition;
                    f = this.mWaveOffset;
                    break;
                default:
                    Log.v("KeyCycle", "WARNING KeyCycle UNKNOWN  " + next);
                    continue;
            }
            splineSet.setPoint(i2, f);
        }
    }

    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add(Key.ALPHA);
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add(Key.ELEVATION);
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add(Key.ROTATION_X);
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add(Key.ROTATION_Y);
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add(Key.SCALE_X);
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add(Key.SCALE_Y);
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add(Key.TRANSITION_PATH_ROTATE);
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add(Key.TRANSLATION_X);
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add(Key.TRANSLATION_Y);
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add(Key.TRANSLATION_Z);
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String str : this.mCustomConstraints.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public float getValue(String str) {
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
            case 156108012:
                if (str.equals(Key.WAVE_OFFSET)) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.mRotationX;
            case 1:
                return this.mRotationY;
            case 2:
                return this.mTranslationX;
            case 3:
                return this.mTranslationY;
            case 4:
                return this.mTranslationZ;
            case 5:
                return this.mProgress;
            case 6:
                return this.mScaleX;
            case 7:
                return this.mScaleY;
            case 8:
                return this.mRotation;
            case 9:
                return this.mElevation;
            case 10:
                return this.mTransitionPathRotate;
            case 11:
                return this.mAlpha;
            case 12:
                return this.mWaveOffset;
            default:
                Log.v("KeyCycle", "WARNING! KeyCycle UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }

    public void setValue(String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals(Key.ROTATION_X)) {
                    c = 1;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(Key.ROTATION_Y)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(Key.TRANSLATION_X)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(Key.TRANSLATION_Y)) {
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
            case 156108012:
                if (str.equals(Key.WAVE_OFFSET)) {
                    c = 12;
                    break;
                }
                break;
            case 184161818:
                if (str.equals(Key.WAVE_PERIOD)) {
                    c = 13;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 14;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mTransitionEasing = obj.toString();
                return;
            case 1:
                this.mRotationX = toFloat(obj);
                return;
            case 2:
                this.mRotationY = toFloat(obj);
                return;
            case 3:
                this.mTranslationX = toFloat(obj);
                return;
            case 4:
                this.mTranslationY = toFloat(obj);
                return;
            case 5:
                this.mProgress = toFloat(obj);
                return;
            case 6:
                this.mScaleX = toFloat(obj);
                return;
            case 7:
                this.mScaleY = toFloat(obj);
                return;
            case 8:
                this.mRotation = toFloat(obj);
                return;
            case 9:
                this.mElevation = toFloat(obj);
                return;
            case 10:
                this.mTransitionPathRotate = toFloat(obj);
                return;
            case 11:
                this.mAlpha = toFloat(obj);
                return;
            case 12:
                this.mWaveOffset = toFloat(obj);
                return;
            case 13:
                this.mWavePeriod = toFloat(obj);
                return;
            case 14:
                this.mCurveFit = toInt(obj);
                return;
            case 15:
                this.mTranslationZ = toFloat(obj);
                return;
            default:
                return;
        }
    }
}
