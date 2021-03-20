package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import java.io.PrintStream;
import java.util.HashMap;

public class DesignTool implements ProxyInterface {
    private static final boolean DEBUG = false;
    private static final String TAG = "DesignTool";
    public static final HashMap<Pair<Integer, Integer>, String> allAttributes;
    public static final HashMap<String, String> allMargins;
    private String mLastEndState = null;
    private int mLastEndStateId = -1;
    private String mLastStartState = null;
    private int mLastStartStateId = -1;
    private final MotionLayout mMotionLayout;
    private MotionScene mSceneCache;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        allAttributes = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        allMargins = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    private static void Connect(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3, int i4) {
        String str = allAttributes.get(Pair.create(Integer.valueOf(i3), Integer.valueOf(i4)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            int i5 = 0;
            String str3 = allMargins.get(str);
            if (str3 != null) {
                i5 = GetPxFromDp(i2, hashMap.get(str3));
            }
            int parseInt = Integer.parseInt(str2);
            ConstraintSet constraintSet2 = constraintSet;
            constraintSet2.connect(view.getId(), i3, parseInt, i4, i5);
        }
    }

    private static int GetPxFromDp(int i2, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) (((float) (Integer.valueOf(str.substring(0, indexOf)).intValue() * i2)) / 160.0f);
    }

    private static void SetAbsolutePositions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), GetPxFromDp(i2, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), GetPxFromDp(i2, str2));
        }
    }

    private static void SetBias(ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i2) {
        String str = hashMap.get(i2 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str == null) {
            return;
        }
        if (i2 == 0) {
            constraintSet.setHorizontalBias(view.getId(), Float.parseFloat(str));
        } else if (i2 == 1) {
            constraintSet.setVerticalBias(view.getId(), Float.parseFloat(str));
        }
    }

    private static void SetDimensions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3) {
        String str = hashMap.get(i3 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int i4 = -2;
            if (!str.equalsIgnoreCase("wrap_content")) {
                i4 = GetPxFromDp(i2, str);
            }
            int id = view.getId();
            if (i3 == 0) {
                constraintSet.constrainWidth(id, i4);
            } else {
                constraintSet.constrainHeight(id, i4);
            }
        }
    }

    public int designAccess(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4) {
        MotionController motionController;
        View view = (View) obj;
        if (i2 != 0) {
            MotionLayout motionLayout = this.mMotionLayout;
            if (motionLayout.mScene == null || view == null || (motionController = motionLayout.mFrameArrayList.get(view)) == null) {
                return -1;
            }
        } else {
            motionController = null;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            int duration = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildPath(fArr2, duration);
            return duration;
        } else if (i2 == 2) {
            int duration2 = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildKeyFrames(fArr2, (int[]) null);
            return duration2;
        } else if (i2 != 3) {
            return -1;
        } else {
            int duration3 = this.mMotionLayout.mScene.getDuration() / 16;
            return motionController.getAttributeValues(str, fArr2, i4);
        }
    }

    public void disableAutoTransition(boolean z) {
        this.mMotionLayout.disableAutoTransition(z);
    }

    public void dumpConstraintSet(String str) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + lookUpConstraintId + ")");
        try {
            this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId).dump(this.mMotionLayout.mScene, new int[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene == null) {
            return -1;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildKeyFrames(fArr, (int[]) null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i2) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            return -1;
        }
        MotionController motionController = motionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildPath(fArr, i2);
        return i2;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene != null) {
            int duration = motionScene.getDuration() / 16;
            MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
            if (motionController != null) {
                motionController.buildRectangles(fArr, duration);
            }
        }
    }

    public String getEndState() {
        int endState = this.mMotionLayout.getEndState();
        if (this.mLastEndStateId == endState) {
            return this.mLastEndState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(endState);
        if (constraintSetNames != null) {
            this.mLastEndState = constraintSetNames;
            this.mLastEndStateId = endState;
        }
        return constraintSetNames;
    }

    public int getKeyFrameInfo(Object obj, int i2, int[] iArr) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i2, iArr);
    }

    public float getKeyFramePosition(Object obj, int i2, float f, float f2) {
        return this.mMotionLayout.mFrameArrayList.get((View) obj).getKeyFrameParameter(i2, f, f2);
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getkeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i2, int i3, int i4) {
        MotionLayout motionLayout = this.mMotionLayout;
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getKeyFrame(motionLayout.getContext(), i2, i3, i4);
    }

    public Object getKeyframe(Object obj, int i2, int i3) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.mMotionLayout;
        return motionLayout.mScene.getKeyFrame(motionLayout.getContext(), i2, id, i3);
    }

    public Object getKeyframeAtLocation(Object obj, float f, float f2) {
        MotionController motionController;
        View view = (View) obj;
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            return -1;
        }
        if (view == null || (motionController = motionLayout.mFrameArrayList.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return motionController.getPositionKeyframe(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (!(obj instanceof KeyPositionBase)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.mMotionLayout.mFrameArrayList.get(view).positionKeyframe(view, (KeyPositionBase) obj, f, f2, strArr, fArr);
        this.mMotionLayout.rebuildScene();
        this.mMotionLayout.mInTransition = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        return this.mMotionLayout.getProgress();
    }

    public String getStartState() {
        int startState = this.mMotionLayout.getStartState();
        if (this.mLastStartStateId == startState) {
            return this.mLastStartState;
        }
        String constraintSetNames = this.mMotionLayout.getConstraintSetNames(startState);
        if (constraintSetNames != null) {
            this.mLastStartState = constraintSetNames;
            this.mLastStartStateId = startState;
        }
        return this.mMotionLayout.getConstraintSetNames(startState);
    }

    public String getState() {
        if (!(this.mLastStartState == null || this.mLastEndState == null)) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.mLastStartState;
            }
            if (progress >= 0.99f) {
                return this.mLastEndState;
            }
        }
        return this.mLastStartState;
    }

    public long getTransitionTimeMs() {
        return this.mMotionLayout.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return (this.mLastStartState == null || this.mLastEndState == null) ? false : true;
    }

    public void setAttributes(int i2, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int lookUpConstraintId = this.mMotionLayout.lookUpConstraintId(str);
        ConstraintSet constraintSet = this.mMotionLayout.mScene.getConstraintSet(lookUpConstraintId);
        if (constraintSet != null) {
            constraintSet.clear(view.getId());
            SetDimensions(i2, constraintSet, view, hashMap, 0);
            SetDimensions(i2, constraintSet, view, hashMap, 1);
            int i3 = i2;
            ConstraintSet constraintSet2 = constraintSet;
            View view2 = view;
            HashMap hashMap2 = hashMap;
            Connect(i3, constraintSet2, view2, hashMap2, 6, 6);
            Connect(i3, constraintSet2, view2, hashMap2, 6, 7);
            Connect(i3, constraintSet2, view2, hashMap2, 7, 7);
            Connect(i3, constraintSet2, view2, hashMap2, 7, 6);
            Connect(i3, constraintSet2, view2, hashMap2, 1, 1);
            Connect(i3, constraintSet2, view2, hashMap2, 1, 2);
            Connect(i3, constraintSet2, view2, hashMap2, 2, 2);
            Connect(i3, constraintSet2, view2, hashMap2, 2, 1);
            Connect(i3, constraintSet2, view2, hashMap2, 3, 3);
            Connect(i3, constraintSet2, view2, hashMap2, 3, 4);
            Connect(i3, constraintSet2, view2, hashMap2, 4, 3);
            Connect(i3, constraintSet2, view2, hashMap2, 4, 4);
            Connect(i3, constraintSet2, view2, hashMap2, 5, 5);
            SetBias(constraintSet, view, hashMap, 0);
            SetBias(constraintSet, view, hashMap, 1);
            SetAbsolutePositions(i2, constraintSet, view, hashMap);
            this.mMotionLayout.updateState(lookUpConstraintId, constraintSet);
            this.mMotionLayout.requestLayout();
        }
    }

    public void setKeyFrame(Object obj, int i2, String str, Object obj2) {
        MotionScene motionScene = this.mMotionLayout.mScene;
        if (motionScene != null) {
            motionScene.setKeyframe((View) obj, i2, str, obj2);
            MotionLayout motionLayout = this.mMotionLayout;
            motionLayout.mTransitionGoalPosition = ((float) i2) / 100.0f;
            motionLayout.mTransitionLastPosition = 0.0f;
            motionLayout.rebuildScene();
            this.mMotionLayout.evaluate(true);
        }
    }

    public boolean setKeyFramePosition(Object obj, int i2, int i3, float f, float f2) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            return false;
        }
        MotionController motionController = motionLayout.mFrameArrayList.get(obj);
        MotionLayout motionLayout2 = this.mMotionLayout;
        int i4 = (int) (motionLayout2.mTransitionPosition * 100.0f);
        if (motionController == null) {
            return false;
        }
        View view = (View) obj;
        if (!motionLayout2.mScene.hasKeyFramePosition(view, i4)) {
            return false;
        }
        float keyFrameParameter = motionController.getKeyFrameParameter(2, f, f2);
        float keyFrameParameter2 = motionController.getKeyFrameParameter(5, f, f2);
        this.mMotionLayout.mScene.setKeyframe(view, i4, "motion:percentX", Float.valueOf(keyFrameParameter));
        this.mMotionLayout.mScene.setKeyframe(view, i4, "motion:percentY", Float.valueOf(keyFrameParameter2));
        this.mMotionLayout.rebuildScene();
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.invalidate();
        return true;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
        }
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.mLastStartState != str) {
            this.mLastStartState = str;
            this.mLastEndState = null;
            MotionLayout motionLayout = this.mMotionLayout;
            if (motionLayout.mScene == null) {
                motionLayout.mScene = this.mSceneCache;
            }
            int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
            this.mLastStartStateId = lookUpConstraintId;
            if (lookUpConstraintId != 0) {
                if (lookUpConstraintId == this.mMotionLayout.getStartState()) {
                    this.mMotionLayout.setProgress(0.0f);
                } else {
                    if (lookUpConstraintId != this.mMotionLayout.getEndState()) {
                        this.mMotionLayout.transitionToState(lookUpConstraintId);
                    }
                    this.mMotionLayout.setProgress(1.0f);
                }
            }
            this.mMotionLayout.requestLayout();
        }
    }

    public void setToolPosition(float f) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        motionLayout.setProgress(f);
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.requestLayout();
        this.mMotionLayout.invalidate();
    }

    public void setTransition(String str, String str2) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout.mScene == null) {
            motionLayout.mScene = this.mSceneCache;
        }
        int lookUpConstraintId = motionLayout.lookUpConstraintId(str);
        int lookUpConstraintId2 = this.mMotionLayout.lookUpConstraintId(str2);
        this.mMotionLayout.setTransition(lookUpConstraintId, lookUpConstraintId2);
        this.mLastStartStateId = lookUpConstraintId;
        this.mLastEndStateId = lookUpConstraintId2;
        this.mLastStartState = str;
        this.mLastEndState = str2;
    }

    public void setViewDebug(Object obj, int i2) {
        MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController != null) {
            motionController.setDrawPath(i2);
            this.mMotionLayout.invalidate();
        }
    }
}
