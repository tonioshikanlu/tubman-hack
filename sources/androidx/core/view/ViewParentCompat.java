package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
        int[] iArr = sTempNestedScrollConsumed;
        if (iArr == null) {
            sTempNestedScrollConsumed = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return sTempNestedScrollConsumed;
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e2) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        onNestedPreScroll(viewParent, view, i2, i3, iArr, 0);
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
            }
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(viewParent, view, i2, i3, i4, i5, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(viewParent, view, i2, i3, i4, i5, i6, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent2).onNestedScroll(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent2 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent2).onNestedScroll(view, i2, i3, i4, i5, i6);
        } else if (i6 == 0) {
            try {
                viewParent.onNestedScroll(view, i2, i3, i4, i5);
            } catch (AbstractMethodError e2) {
                AbstractMethodError abstractMethodError = e2;
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i2) {
        onNestedScrollAccepted(viewParent, view, view2, i2, 0);
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i2, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i2);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e2);
            }
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i2) {
        return onStartNestedScroll(viewParent, view, view2, i2, 0);
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i2, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i2, i3);
        }
        if (i3 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i2);
        } catch (AbstractMethodError e2) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e2);
            return false;
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e2);
            }
        }
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
