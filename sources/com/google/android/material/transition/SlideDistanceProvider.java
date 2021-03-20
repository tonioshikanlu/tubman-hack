package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import b.e.a.a.a;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    @Px
    private int slideDistance = -1;
    private int slideEdge;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i2) {
        this.slideEdge = i2;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i2, @Px int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return createTranslationXAnimator(view2, ((float) i3) + translationX, translationX, translationX);
        }
        if (i2 == 5) {
            return createTranslationXAnimator(view2, translationX - ((float) i3), translationX, translationX);
        }
        if (i2 == 48) {
            return createTranslationYAnimator(view2, translationY - ((float) i3), translationY, translationY);
        }
        if (i2 == 80) {
            return createTranslationYAnimator(view2, ((float) i3) + translationY, translationY, translationY);
        }
        if (i2 == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? ((float) i3) + translationX : translationX - ((float) i3), translationX, translationX);
        } else if (i2 == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - ((float) i3) : ((float) i3) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException(a.g("Invalid slide direction: ", i2));
        }
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i2, @Px int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - ((float) i3), translationX);
        }
        if (i2 == 5) {
            return createTranslationXAnimator(view2, translationX, ((float) i3) + translationX, translationX);
        }
        if (i2 == 48) {
            return createTranslationYAnimator(view2, translationY, ((float) i3) + translationY, translationY);
        }
        if (i2 == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - ((float) i3), translationY);
        }
        if (i2 == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - ((float) i3) : ((float) i3) + translationX, translationX);
        } else if (i2 == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? ((float) i3) + translationX : translationX - ((float) i3), translationX);
        } else {
            throw new IllegalArgumentException(a.g("Invalid slide direction: ", i2));
        }
    }

    private static Animator createTranslationXAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i2 = this.slideDistance;
        return i2 != -1 ? i2 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@Px int i2) {
        if (i2 >= 0) {
            this.slideDistance = i2;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i2) {
        this.slideEdge = i2;
    }
}
