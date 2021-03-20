package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

public class ViewUtils {
    public static final Property<View, Rect> CLIP_BOUNDS = new Property<View, Rect>(Rect.class, "clipBounds") {
        public Rect get(View view) {
            return ViewCompat.getClipBounds(view);
        }

        public void set(View view, Rect rect) {
            ViewCompat.setClipBounds(view, rect);
        }
    };
    private static final ViewUtilsBase IMPL = (Build.VERSION.SDK_INT >= 29 ? new ViewUtilsApi29() : new ViewUtilsApi23());
    private static final String TAG = "ViewUtils";
    public static final Property<View, Float> TRANSITION_ALPHA = new Property<View, Float>(Float.class, "translationAlpha") {
        public Float get(View view) {
            return Float.valueOf(ViewUtils.getTransitionAlpha(view));
        }

        public void set(View view, Float f) {
            ViewUtils.setTransitionAlpha(view, f.floatValue());
        }
    };

    private ViewUtils() {
    }

    public static void clearNonTransitionAlpha(@NonNull View view) {
        IMPL.clearNonTransitionAlpha(view);
    }

    public static ViewOverlayImpl getOverlay(@NonNull View view) {
        return new ViewOverlayApi18(view);
    }

    public static float getTransitionAlpha(@NonNull View view) {
        return IMPL.getTransitionAlpha(view);
    }

    public static WindowIdImpl getWindowId(@NonNull View view) {
        return new WindowIdApi18(view);
    }

    public static void saveNonTransitionAlpha(@NonNull View view) {
        IMPL.saveNonTransitionAlpha(view);
    }

    public static void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        IMPL.setAnimationMatrix(view, matrix);
    }

    public static void setLeftTopRightBottom(@NonNull View view, int i2, int i3, int i4, int i5) {
        IMPL.setLeftTopRightBottom(view, i2, i3, i4, i5);
    }

    public static void setTransitionAlpha(@NonNull View view, float f) {
        IMPL.setTransitionAlpha(view, f);
    }

    public static void setTransitionVisibility(@NonNull View view, int i2) {
        IMPL.setTransitionVisibility(view, i2);
    }

    public static void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToGlobal(view, matrix);
    }

    public static void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToLocal(view, matrix);
    }
}
