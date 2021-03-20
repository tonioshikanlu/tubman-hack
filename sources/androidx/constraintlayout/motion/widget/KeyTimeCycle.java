package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import b.e.a.a.a;
import java.util.HashMap;
import java.util.HashSet;

public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    public static final String NAME = "KeyTimeCycle";
    private static final String TAG = "KeyTimeCycle";
    /* access modifiers changed from: private */
    public float mAlpha = Float.NaN;
    /* access modifiers changed from: private */
    public int mCurveFit = -1;
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
    public String mTransitionEasing;
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
    public int mWaveShape = 0;

    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        private Loader() {
        }

        public static void read(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (mAttrMap.get(index)) {
                    case 1:
                        float unused = keyTimeCycle.mAlpha = typedArray.getFloat(index, keyTimeCycle.mAlpha);
                        break;
                    case 2:
                        float unused2 = keyTimeCycle.mElevation = typedArray.getDimension(index, keyTimeCycle.mElevation);
                        break;
                    case 4:
                        float unused3 = keyTimeCycle.mRotation = typedArray.getFloat(index, keyTimeCycle.mRotation);
                        break;
                    case 5:
                        float unused4 = keyTimeCycle.mRotationX = typedArray.getFloat(index, keyTimeCycle.mRotationX);
                        break;
                    case 6:
                        float unused5 = keyTimeCycle.mRotationY = typedArray.getFloat(index, keyTimeCycle.mRotationY);
                        break;
                    case 7:
                        float unused6 = keyTimeCycle.mScaleX = typedArray.getFloat(index, keyTimeCycle.mScaleX);
                        break;
                    case 8:
                        float unused7 = keyTimeCycle.mTransitionPathRotate = typedArray.getFloat(index, keyTimeCycle.mTransitionPathRotate);
                        break;
                    case 9:
                        String unused8 = keyTimeCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.IS_IN_EDIT_MODE) {
                            if (typedArray.peekValue(index).type != 3) {
                                keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                            keyTimeCycle.mTargetId = resourceId;
                            if (resourceId != -1) {
                                break;
                            }
                        }
                        keyTimeCycle.mTargetString = typedArray.getString(index);
                        break;
                    case 12:
                        keyTimeCycle.mFramePosition = typedArray.getInt(index, keyTimeCycle.mFramePosition);
                        break;
                    case 13:
                        int unused9 = keyTimeCycle.mCurveFit = typedArray.getInteger(index, keyTimeCycle.mCurveFit);
                        break;
                    case 14:
                        float unused10 = keyTimeCycle.mScaleY = typedArray.getFloat(index, keyTimeCycle.mScaleY);
                        break;
                    case 15:
                        float unused11 = keyTimeCycle.mTranslationX = typedArray.getDimension(index, keyTimeCycle.mTranslationX);
                        break;
                    case 16:
                        float unused12 = keyTimeCycle.mTranslationY = typedArray.getDimension(index, keyTimeCycle.mTranslationY);
                        break;
                    case 17:
                        float unused13 = keyTimeCycle.mTranslationZ = typedArray.getDimension(index, keyTimeCycle.mTranslationZ);
                        break;
                    case 18:
                        float unused14 = keyTimeCycle.mProgress = typedArray.getFloat(index, keyTimeCycle.mProgress);
                        break;
                    case 19:
                        int unused15 = keyTimeCycle.mWaveShape = typedArray.getInt(index, keyTimeCycle.mWaveShape);
                        break;
                    case 20:
                        float unused16 = keyTimeCycle.mWavePeriod = typedArray.getFloat(index, keyTimeCycle.mWavePeriod);
                        break;
                    case 21:
                        float unused17 = keyTimeCycle.mWaveOffset = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, keyTimeCycle.mWaveOffset) : typedArray.getFloat(index, keyTimeCycle.mWaveOffset);
                        break;
                    default:
                        StringBuilder y = a.y("unused attribute 0x");
                        y.append(Integer.toHexString(index));
                        y.append("   ");
                        y.append(mAttrMap.get(index));
                        Log.e("KeyTimeCycle", y.toString());
                        break;
                }
            }
        }
    }

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1.equals(androidx.constraintlayout.motion.widget.Key.SCALE_Y) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        r3.setPoint(r4, r5, r10.mWavePeriod, r10.mWaveShape, r10.mWaveOffset);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet r3 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.mCustomConstraints
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet$CustomSet r4 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.CustomSet) r4
            int r5 = r10.mFramePosition
            float r7 = r10.mWavePeriod
            int r8 = r10.mWaveShape
            float r9 = r10.mWaveOffset
            r4.setPoint((int) r5, (androidx.constraintlayout.widget.ConstraintAttribute) r6, (float) r7, (int) r8, (float) r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00cb;
                case -1249320805: goto L_0x00c0;
                case -1225497657: goto L_0x00b5;
                case -1225497656: goto L_0x00aa;
                case -1225497655: goto L_0x009f;
                case -1001078227: goto L_0x0094;
                case -908189618: goto L_0x0089;
                case -908189617: goto L_0x0080;
                case -40300674: goto L_0x0074;
                case -4379043: goto L_0x0067;
                case 37232917: goto L_0x005a;
                case 92909918: goto L_0x004d;
                default: goto L_0x004a;
            }
        L_0x004a:
            r4 = r2
            goto L_0x00d6
        L_0x004d:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0056
            goto L_0x004a
        L_0x0056:
            r4 = 11
            goto L_0x00d6
        L_0x005a:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0063
            goto L_0x004a
        L_0x0063:
            r4 = 10
            goto L_0x00d6
        L_0x0067:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0070
            goto L_0x004a
        L_0x0070:
            r4 = 9
            goto L_0x00d6
        L_0x0074:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x007d
            goto L_0x004a
        L_0x007d:
            r4 = 8
            goto L_0x00d6
        L_0x0080:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d6
            goto L_0x004a
        L_0x0089:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0092
            goto L_0x004a
        L_0x0092:
            r4 = 6
            goto L_0x00d6
        L_0x0094:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009d
            goto L_0x004a
        L_0x009d:
            r4 = 5
            goto L_0x00d6
        L_0x009f:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a8
            goto L_0x004a
        L_0x00a8:
            r4 = 4
            goto L_0x00d6
        L_0x00aa:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b3
            goto L_0x004a
        L_0x00b3:
            r4 = 3
            goto L_0x00d6
        L_0x00b5:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00be
            goto L_0x004a
        L_0x00be:
            r4 = 2
            goto L_0x00d6
        L_0x00c0:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c9
            goto L_0x004a
        L_0x00c9:
            r4 = 1
            goto L_0x00d6
        L_0x00cb:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d5
            goto L_0x004a
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x0182;
                case 2: goto L_0x0175;
                case 3: goto L_0x0168;
                case 4: goto L_0x015b;
                case 5: goto L_0x014e;
                case 6: goto L_0x0141;
                case 7: goto L_0x0134;
                case 8: goto L_0x0127;
                case 9: goto L_0x011a;
                case 10: goto L_0x010d;
                case 11: goto L_0x00f6;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f6:
            float r1 = r10.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mAlpha
        L_0x0102:
            float r6 = r10.mWavePeriod
            int r7 = r10.mWaveShape
            float r8 = r10.mWaveOffset
            r3.setPoint(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x010d:
            float r1 = r10.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTransitionPathRotate
            goto L_0x0102
        L_0x011a:
            float r1 = r10.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mElevation
            goto L_0x0102
        L_0x0127:
            float r1 = r10.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotation
            goto L_0x0102
        L_0x0134:
            float r1 = r10.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleY
            goto L_0x0102
        L_0x0141:
            float r1 = r10.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mScaleX
            goto L_0x0102
        L_0x014e:
            float r1 = r10.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mProgress
            goto L_0x0102
        L_0x015b:
            float r1 = r10.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationZ
            goto L_0x0102
        L_0x0168:
            float r1 = r10.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationY
            goto L_0x0102
        L_0x0175:
            float r1 = r10.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mTranslationX
            goto L_0x0102
        L_0x0182:
            float r1 = r10.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationY
            goto L_0x0102
        L_0x0190:
            float r1 = r10.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.mFramePosition
            float r5 = r10.mRotationX
            goto L_0x0102
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTimeCycle.addTimeValues(java.util.HashMap):void");
    }

    public void addValues(HashMap<String, SplineSet> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
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
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add(Key.TRANSLATION_X);
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add(Key.TRANSLATION_Y);
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add(Key.TRANSLATION_Z);
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add(Key.TRANSITION_PATH_ROTATE);
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add(Key.SCALE_X);
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add(Key.SCALE_Y);
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String str : this.mCustomConstraints.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (this.mCurveFit != -1) {
            if (!Float.isNaN(this.mAlpha)) {
                hashMap.put(Key.ALPHA, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mElevation)) {
                hashMap.put(Key.ELEVATION, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotation)) {
                hashMap.put(Key.ROTATION, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationX)) {
                hashMap.put(Key.ROTATION_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationY)) {
                hashMap.put(Key.ROTATION_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationX)) {
                hashMap.put(Key.TRANSLATION_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationY)) {
                hashMap.put(Key.TRANSLATION_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationZ)) {
                hashMap.put(Key.TRANSLATION_Z, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTransitionPathRotate)) {
                hashMap.put(Key.TRANSITION_PATH_ROTATE, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put(Key.SCALE_X, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put(Key.SCALE_Y, Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mProgress)) {
                hashMap.put("progress", Integer.valueOf(this.mCurveFit));
            }
            if (this.mCustomConstraints.size() > 0) {
                for (String m2 : this.mCustomConstraints.keySet()) {
                    hashMap.put(a.m("CUSTOM,", m2), Integer.valueOf(this.mCurveFit));
                }
            }
        }
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
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 12;
                    break;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    c = 13;
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
                this.mCurveFit = toInt(obj);
                return;
            case 13:
                this.mTranslationZ = toFloat(obj);
                return;
            default:
                return;
        }
    }
}
