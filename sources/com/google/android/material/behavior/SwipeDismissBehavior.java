package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    public float alphaEndSwipeDistance = 0.5f;
    public float alphaStartSwipeDistance = 0.0f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() {
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@NonNull View view, float f) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 != 0) {
                boolean z = ViewCompat.getLayoutDirection(view) == 1;
                int i3 = SwipeDismissBehavior.this.swipeDirection;
                if (i3 == 2) {
                    return true;
                }
                if (i3 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i2 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i3 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i2 <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.originalCapturedViewLeft;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int clampViewPositionHorizontal(@androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = r0
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.swipeDirection
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.originalCapturedViewLeft
                goto L_0x0037
            L_0x001c:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.originalCapturedViewLeft
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.clamp((int) r5, (int) r4, (int) r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        public void onViewCaptured(@NonNull View view, int i2) {
            this.activePointerId = i2;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i2) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i2);
            }
        }

        public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.alphaStartSwipeDistance) + ((float) this.originalCapturedViewLeft);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.alphaEndSwipeDistance) + ((float) this.originalCapturedViewLeft);
            float f = (float) i2;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
            boolean z;
            int i2;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                int left = view.getLeft();
                int i3 = this.originalCapturedViewLeft;
                i2 = left < i3 ? i3 - width : i3 + width;
                z = true;
            } else {
                i2 = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i2, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(view, z));
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        public boolean tryCaptureView(View view, int i2) {
            int i3 = this.activePointerId;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };
    public float dragDismissThreshold = 0.5f;
    private boolean interceptingEvents;
    public OnDismissListener listener;
    private float sensitivity = 0.0f;
    private boolean sensitivitySet;
    public int swipeDirection = 2;
    public ViewDragHelper viewDragHelper;

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i2);
    }

    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view2, boolean z) {
            this.view = view2;
            this.dismiss = z;
        }

        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.viewDragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else if (this.dismiss && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int clamp(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback) : ViewDragHelper.create(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (canSwipeDismissView(view)) {
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, (CharSequence) null, new AccessibilityViewCommand() {
                public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                    boolean z = false;
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view)) {
                        return false;
                    }
                    boolean z2 = ViewCompat.getLayoutDirection(view) == 1;
                    int i2 = SwipeDismissBehavior.this.swipeDirection;
                    if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                        z = true;
                    }
                    int width = view.getWidth();
                    if (z) {
                        width = -width;
                    }
                    ViewCompat.offsetLeftAndRight(view, width);
                    view.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 != null) {
            return viewDragHelper2.getViewDragState();
        }
        return 0;
    }

    @VisibleForTesting
    @Nullable
    public OnDismissListener getListener() {
        return this.listener;
    }

    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!z) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i2);
        if (ViewCompat.getImportantForAccessibility(v) == 0) {
            ViewCompat.setImportantForAccessibility(v, 1);
            updateAccessibilityActions(v);
        }
        return onLayoutChild;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 == null) {
            return false;
        }
        viewDragHelper2.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(@Nullable OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i2) {
        this.swipeDirection = i2;
    }
}
