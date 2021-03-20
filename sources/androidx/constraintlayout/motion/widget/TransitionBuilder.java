package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;

public class TransitionBuilder {
    private static final String TAG = "TransitionBuilder";

    public static MotionScene.Transition buildTransition(MotionScene motionScene, int i2, int i3, ConstraintSet constraintSet, int i4, ConstraintSet constraintSet2) {
        MotionScene.Transition transition = new MotionScene.Transition(i2, motionScene, i3, i4);
        updateConstraintSetInMotionScene(motionScene, transition, constraintSet, constraintSet2);
        return transition;
    }

    private static void updateConstraintSetInMotionScene(MotionScene motionScene, MotionScene.Transition transition, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
    }

    public static void validate(MotionLayout motionLayout) {
        MotionScene motionScene = motionLayout.mScene;
        if (motionScene == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        } else if (!motionScene.validateLayout(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        } else if (motionScene.mCurrentTransition == null || motionScene.getDefinedTransitions().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
