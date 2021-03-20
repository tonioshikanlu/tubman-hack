package androidx.core.view;

import android.view.ViewGroup;

public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
    }

    public static int getLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    public static int getMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean isMarginRelative(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.resolveLayoutDirection(i2);
    }

    public static void setLayoutDirection(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setLayoutDirection(i2);
    }

    public static void setMarginEnd(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setMarginEnd(i2);
    }

    public static void setMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        marginLayoutParams.setMarginStart(i2);
    }
}
