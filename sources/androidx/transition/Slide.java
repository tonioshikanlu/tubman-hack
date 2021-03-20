package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final String PROPNAME_SCREEN_POSITION = "android:slide:screenPosition";
    private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
    private static final CalculateSlide sCalculateBottom = new CalculateSlideVertical() {
        public float getGoneY(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };
    private static final CalculateSlide sCalculateEnd = new CalculateSlideHorizontal() {
        public float getGoneX(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    };
    private static final CalculateSlide sCalculateLeft = new CalculateSlideHorizontal() {
        public float getGoneX(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final CalculateSlide sCalculateRight = new CalculateSlideHorizontal() {
        public float getGoneX(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final CalculateSlide sCalculateStart = new CalculateSlideHorizontal() {
        public float getGoneX(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    };
    private static final CalculateSlide sCalculateTop = new CalculateSlideVertical() {
        public float getGoneY(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };
    private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    private CalculateSlide mSlideCalculator = sCalculateBottom;
    private int mSlideEdge = 80;

    public interface CalculateSlide {
        float getGoneX(ViewGroup viewGroup, View view);

        float getGoneY(ViewGroup viewGroup, View view);
    }

    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        public float getGoneY(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class CalculateSlideVertical implements CalculateSlide {
        private CalculateSlideVertical() {
        }

        public float getGoneX(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public Slide() {
        setSlideEdge(80);
    }

    public Slide(int i2) {
        setSlideEdge(i2);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.SLIDE);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }

    private void captureValues(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put(PROPNAME_SCREEN_POSITION, iArr);
    }

    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        captureValues(transitionValues);
    }

    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        captureValues(transitionValues);
    }

    public int getSlideEdge() {
        return this.mSlideEdge;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get(PROPNAME_SCREEN_POSITION);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.createAnimation(view, transitionValues2, iArr[0], iArr[1], this.mSlideCalculator.getGoneX(viewGroup, view), this.mSlideCalculator.getGoneY(viewGroup, view), translationX, translationY, sDecelerate, this);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get(PROPNAME_SCREEN_POSITION);
        return TranslationAnimationCreator.createAnimation(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.mSlideCalculator.getGoneX(viewGroup, view), this.mSlideCalculator.getGoneY(viewGroup, view), sAccelerate, this);
    }

    public void setSlideEdge(int i2) {
        CalculateSlide calculateSlide;
        if (i2 == 3) {
            calculateSlide = sCalculateLeft;
        } else if (i2 == 5) {
            calculateSlide = sCalculateRight;
        } else if (i2 == 48) {
            calculateSlide = sCalculateTop;
        } else if (i2 == 80) {
            calculateSlide = sCalculateBottom;
        } else if (i2 == 8388611) {
            calculateSlide = sCalculateStart;
        } else if (i2 == 8388613) {
            calculateSlide = sCalculateEnd;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.mSlideCalculator = calculateSlide;
        this.mSlideEdge = i2;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.setSide(i2);
        setPropagation(sidePropagation);
    }
}
