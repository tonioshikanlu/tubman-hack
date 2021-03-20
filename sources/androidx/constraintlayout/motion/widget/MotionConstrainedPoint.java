package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    public static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    private float alpha = 1.0f;
    private boolean applyElevation = false;
    public LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    private float elevation = 0.0f;
    private float height;
    private int mDrawPath = 0;
    private Easing mKeyFrameEasing;
    public int mMode = 0;
    private float mPathRotate = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mProgress = Float.NaN;
    public double[] mTempDelta = new double[18];
    public double[] mTempValue = new double[18];
    public int mVisibilityMode = 0;
    private float position;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    public int visibility;
    private float width;
    private float x;
    private float y;

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015d, code lost:
        r2.setPoint(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0179, code lost:
        r2.setPoint(r9, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0204
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            androidx.constraintlayout.motion.widget.SplineSet r2 = (androidx.constraintlayout.motion.widget.SplineSet) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00c9;
                case -1249320805: goto L_0x00be;
                case -1225497657: goto L_0x00b3;
                case -1225497656: goto L_0x00a8;
                case -1225497655: goto L_0x009d;
                case -1001078227: goto L_0x0092;
                case -908189618: goto L_0x0087;
                case -908189617: goto L_0x007c;
                case -760884510: goto L_0x006e;
                case -760884509: goto L_0x0060;
                case -40300674: goto L_0x0052;
                case -4379043: goto L_0x0044;
                case 37232917: goto L_0x0036;
                case 92909918: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00d3
        L_0x0028:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00d3
        L_0x0032:
            r3 = 13
            goto L_0x00d3
        L_0x0036:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00d3
        L_0x0040:
            r3 = 12
            goto L_0x00d3
        L_0x0044:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00d3
        L_0x004e:
            r3 = 11
            goto L_0x00d3
        L_0x0052:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00d3
        L_0x005c:
            r3 = 10
            goto L_0x00d3
        L_0x0060:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00d3
        L_0x006a:
            r3 = 9
            goto L_0x00d3
        L_0x006e:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x00d3
        L_0x0078:
            r3 = 8
            goto L_0x00d3
        L_0x007c:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0085
            goto L_0x00d3
        L_0x0085:
            r3 = 7
            goto L_0x00d3
        L_0x0087:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0090
            goto L_0x00d3
        L_0x0090:
            r3 = 6
            goto L_0x00d3
        L_0x0092:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r3 = 5
            goto L_0x00d3
        L_0x009d:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r3 = 4
            goto L_0x00d3
        L_0x00a8:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00d3
        L_0x00b1:
            r3 = 3
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00bc:
            r3 = 2
            goto L_0x00d3
        L_0x00be:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            r3 = r5
            goto L_0x00d3
        L_0x00c9:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01de;
                case 3: goto L_0x01d2;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01ae;
                case 7: goto L_0x01a2;
                case 8: goto L_0x0196;
                case 9: goto L_0x018a;
                case 10: goto L_0x017e;
                case 11: goto L_0x016e;
                case 12: goto L_0x0162;
                case 13: goto L_0x0152;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r7.attributes
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x012e
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r7.attributes
            java.lang.Object r3 = r5.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r3 = (androidx.constraintlayout.widget.ConstraintAttribute) r3
            boolean r5 = r2 instanceof androidx.constraintlayout.motion.widget.SplineSet.CustomSet
            if (r5 == 0) goto L_0x0106
            androidx.constraintlayout.motion.widget.SplineSet$CustomSet r2 = (androidx.constraintlayout.motion.widget.SplineSet.CustomSet) r2
            r2.setPoint((int) r9, (androidx.constraintlayout.widget.ConstraintAttribute) r3)
            goto L_0x0008
        L_0x0106:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " splineSet not a CustomSet frame = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", value"
            r5.append(r1)
            float r1 = r3.getValueToInterpolate()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
        L_0x0129:
            android.util.Log.e(r4, r1)
            goto L_0x0008
        L_0x012e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNKNOWN customName "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x0129
        L_0x0140:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x0129
        L_0x0152:
            float r1 = r7.alpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            float r4 = r7.alpha
        L_0x015d:
            r2.setPoint(r9, r4)
            goto L_0x0008
        L_0x0162:
            float r1 = r7.mPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x016b
            goto L_0x0179
        L_0x016b:
            float r6 = r7.mPathRotate
            goto L_0x0179
        L_0x016e:
            float r1 = r7.elevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0177
            goto L_0x0179
        L_0x0177:
            float r6 = r7.elevation
        L_0x0179:
            r2.setPoint(r9, r6)
            goto L_0x0008
        L_0x017e:
            float r1 = r7.rotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0187
            goto L_0x0179
        L_0x0187:
            float r6 = r7.rotation
            goto L_0x0179
        L_0x018a:
            float r1 = r7.mPivotY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0193
            goto L_0x0179
        L_0x0193:
            float r6 = r7.mPivotY
            goto L_0x0179
        L_0x0196:
            float r1 = r7.mPivotX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x019f
            goto L_0x0179
        L_0x019f:
            float r6 = r7.mPivotX
            goto L_0x0179
        L_0x01a2:
            float r1 = r7.scaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01ab
            goto L_0x015d
        L_0x01ab:
            float r4 = r7.scaleY
            goto L_0x015d
        L_0x01ae:
            float r1 = r7.scaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b7
            goto L_0x015d
        L_0x01b7:
            float r4 = r7.scaleX
            goto L_0x015d
        L_0x01ba:
            float r1 = r7.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c3
            goto L_0x0179
        L_0x01c3:
            float r6 = r7.mProgress
            goto L_0x0179
        L_0x01c6:
            float r1 = r7.translationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01cf
            goto L_0x0179
        L_0x01cf:
            float r6 = r7.translationZ
            goto L_0x0179
        L_0x01d2:
            float r1 = r7.translationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01db
            goto L_0x0179
        L_0x01db:
            float r6 = r7.translationY
            goto L_0x0179
        L_0x01de:
            float r1 = r7.translationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01e7
            goto L_0x0179
        L_0x01e7:
            float r6 = r7.translationX
            goto L_0x0179
        L_0x01ea:
            float r1 = r7.rotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01f3
            goto L_0x0179
        L_0x01f3:
            float r6 = r7.rotationY
            goto L_0x0179
        L_0x01f6:
            float r1 = r7.rotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0200
            goto L_0x0179
        L_0x0200:
            float r6 = r7.rotationX
            goto L_0x0179
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionConstrainedPoint.addValues(java.util.HashMap, int):void");
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        this.elevation = view.getElevation();
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        this.translationZ = view.getTranslationZ();
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i2 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i2;
        int i3 = propertySet.visibility;
        this.visibility = i3;
        this.alpha = (i3 == 0 || i2 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.applyElevation = transform.applyElevation;
        this.elevation = transform.elevation;
        this.rotation = transform.rotation;
        this.rotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.scaleX = transform.scaleX;
        this.scaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.translationX = transform.translationX;
        this.translationY = transform.translationY;
        this.translationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
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

    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add(Key.ALPHA);
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add(Key.ELEVATION);
        }
        int i2 = this.visibility;
        int i3 = motionConstrainedPoint.visibility;
        if (i2 != i3 && this.mVisibilityMode == 0 && (i2 == 0 || i3 == 0)) {
            hashSet.add(Key.ALPHA);
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add(Key.TRANSITION_PATH_ROTATE);
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add(Key.ROTATION_X);
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add(Key.ROTATION_Y);
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add(Key.SCALE_X);
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add(Key.SCALE_Y);
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add(Key.TRANSLATION_X);
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add(Key.TRANSLATION_Y);
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add(Key.TRANSLATION_Z);
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.x, motionConstrainedPoint.x);
        zArr[2] = zArr[2] | diff(this.y, motionConstrainedPoint.y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] < 18) {
                dArr[i2] = (double) fArr[iArr[i3]];
                i2++;
            }
        }
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

    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        applyParameters(view);
    }

    public void setState(ConstraintWidget constraintWidget, ConstraintSet constraintSet, int i2) {
        setBounds((float) constraintWidget.getX(), (float) constraintWidget.getY(), (float) constraintWidget.getWidth(), (float) constraintWidget.getHeight());
        applyParameters(constraintSet.getParameters(i2));
    }
}
