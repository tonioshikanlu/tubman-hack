package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

public class Explode extends Visibility {
    private static final String PROPNAME_SCREEN_BOUNDS = "android:explode:screenBounds";
    private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
    private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    private int[] mTempLoc = new int[2];

    public Explode() {
        setPropagation(new CircularPropagation());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setPropagation(new CircularPropagation());
    }

    private static float calculateDistance(float f, float f2) {
        return (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
    }

    private static float calculateMaxDistance(View view, int i2, int i3) {
        return calculateDistance((float) Math.max(i2, view.getWidth() - i2), (float) Math.max(i3, view.getHeight() - i3));
    }

    private void calculateOut(View view, Rect rect, int[] iArr) {
        int i2;
        int i3;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            i3 = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i4;
            i2 = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i5;
        } else {
            i3 = epicenter.centerX();
            i2 = epicenter.centerY();
        }
        float centerX = (float) (rect.centerX() - i3);
        float centerY = (float) (rect.centerY() - i2);
        if (centerX == 0.0f && centerY == 0.0f) {
            float random = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerX = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = random;
        }
        float calculateDistance = calculateDistance(centerX, centerY);
        float calculateMaxDistance = calculateMaxDistance(view, i3 - i4, i2 - i5);
        iArr[0] = Math.round((centerX / calculateDistance) * calculateMaxDistance);
        iArr[1] = Math.round(calculateMaxDistance * (centerY / calculateDistance));
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        view.getLocationOnScreen(this.mTempLoc);
        int[] iArr = this.mTempLoc;
        int i2 = iArr[0];
        int i3 = iArr[1];
        transitionValues.values.put(PROPNAME_SCREEN_BOUNDS, new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3));
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.values.get(PROPNAME_SCREEN_BOUNDS);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, sDecelerate, this);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_SCREEN_BOUNDS);
        int i2 = rect.left;
        int i3 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        calculateOut(viewGroup, rect, this.mTempLoc);
        int[] iArr2 = this.mTempLoc;
        return TranslationAnimationCreator.createAnimation(view, transitionValues, i2, i3, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), sAccelerate, this);
    }
}
