package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import b.e.a.a.a;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    public int activePointerId;
    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks = new ArrayList<>();
    private int childHeight;
    public int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() {
        private boolean releasedLow(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
        }

        public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
            int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i2, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
        }

        public void onViewDragStateChanged(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.dispatchOnSlide(i3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
            if (java.lang.Math.abs(r7.getTop() - r6.this$0.expandedOffset) < java.lang.Math.abs(r7.getTop() - r6.this$0.halfExpandedOffset)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            if (java.lang.Math.abs(r8 - r6.this$0.halfExpandedOffset) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
            if (java.lang.Math.abs(r8 - r6.this$0.fitToContentsOffset) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
            if (r8 < java.lang.Math.abs(r8 - r9.collapsedOffset)) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
            if (java.lang.Math.abs(r8 - r0) < java.lang.Math.abs(r8 - r6.this$0.collapsedOffset)) goto L_0x00b3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 4
                r3 = 6
                r4 = 3
                if (r1 >= 0) goto L_0x0027
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.fitToContents
                if (r8 == 0) goto L_0x0017
            L_0x0010:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.fitToContentsOffset
            L_0x0014:
                r2 = r4
                goto L_0x00ff
            L_0x0017:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.halfExpandedOffset
                if (r8 <= r0) goto L_0x0024
                r8 = r0
                goto L_0x00b7
            L_0x0024:
                int r8 = r9.expandedOffset
                goto L_0x0014
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.hideable
                if (r5 == 0) goto L_0x007c
                boolean r1 = r1.shouldHide(r7, r9)
                if (r1 == 0) goto L_0x007c
                float r8 = java.lang.Math.abs(r8)
                float r0 = java.lang.Math.abs(r9)
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0045
                r8 = 1140457472(0x43fa0000, float:500.0)
                int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x004b
            L_0x0045:
                boolean r8 = r6.releasedLow(r7)
                if (r8 == 0) goto L_0x0052
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.parentHeight
                r2 = 5
                goto L_0x00ff
            L_0x0052:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.fitToContents
                if (r8 == 0) goto L_0x005b
                goto L_0x0010
            L_0x005b:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.expandedOffset
                int r8 = r8 - r9
                int r8 = java.lang.Math.abs(r8)
                int r9 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.halfExpandedOffset
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
            L_0x0077:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.expandedOffset
                goto L_0x0014
            L_0x007c:
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00b9
                float r8 = java.lang.Math.abs(r8)
                float r9 = java.lang.Math.abs(r9)
                int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r8 <= 0) goto L_0x008d
                goto L_0x00b9
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r8.fitToContents
                if (r8 == 0) goto L_0x009a
            L_0x0095:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.collapsedOffset
                goto L_0x00ff
            L_0x009a:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.halfExpandedOffset
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.collapsedOffset
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
            L_0x00b3:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.halfExpandedOffset
            L_0x00b7:
                r2 = r3
                goto L_0x00ff
            L_0x00b9:
                int r8 = r7.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.fitToContents
                if (r9 == 0) goto L_0x00dc
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.fitToContentsOffset
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.collapsedOffset
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x0010
            L_0x00dc:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.halfExpandedOffset
                if (r8 >= r0) goto L_0x00ed
                int r9 = r9.collapsedOffset
                int r9 = r8 - r9
                int r9 = java.lang.Math.abs(r9)
                if (r8 >= r9) goto L_0x00b3
                goto L_0x0077
            L_0x00ed:
                int r9 = r8 - r0
                int r9 = java.lang.Math.abs(r9)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.collapsedOffset
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r9 >= r8) goto L_0x0095
                goto L_0x00b3
            L_0x00ff:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r0 = 1
                r9.startSettlingAnimation(r7, r2, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(@NonNull View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.state;
            if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
            return weakReference2 != null && weakReference2.get() == view;
        }
    };
    /* access modifiers changed from: private */
    public boolean draggable = true;
    public float elevation = -1.0f;
    private int expandHalfwayActionId = -1;
    public int expandedOffset;
    /* access modifiers changed from: private */
    public boolean fitToContents = true;
    public int fitToContentsOffset;
    /* access modifiers changed from: private */
    public int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio = 0.5f;
    public boolean hideable;
    private boolean ignoreEvents;
    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    @Nullable
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    /* access modifiers changed from: private */
    public MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    @Nullable
    public WeakReference<View> nestedScrollingChildRef;
    public int parentHeight;
    public int parentWidth;
    /* access modifiers changed from: private */
    public int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags = 0;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable = null;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    /* access modifiers changed from: private */
    public boolean skipCollapsed;
    public int state = 4;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings = false;
    @Nullable
    private VelocityTracker velocityTracker;
    @Nullable
    public ViewDragHelper viewDragHelper;
    @Nullable
    public WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f);

        public abstract void onStateChanged(@NonNull View view, int i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @NonNull
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            boolean z = false;
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1 ? true : z;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.state = i2;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = bottomSheetBehavior.peekHeight;
            this.fitToContents = bottomSheetBehavior.fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = bottomSheetBehavior.skipCollapsed;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }
    }

    public class SettleRunnable implements Runnable {
        /* access modifiers changed from: private */
        public boolean isPosted;
        public int targetState;
        private final View view;

        public SettleRunnable(View view2, int i2) {
            this.view = view2;
            this.targetState = i2;
        }

        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                ViewCompat.postOnAnimation(this.view, this);
            }
            this.isPosted = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        int i3 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i3);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, MaterialResources.getColorStateList(context, obtainStyledAttributes, i3));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i4 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            setPeekHeight(i2);
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i5 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        setExpandedOffset((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i5, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(V v, @StringRes int i2, int i3) {
        return ViewCompat.addAccessibilityAction(v, v.getResources().getString(i2), createAccessibilityViewCommandForState(i3));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * ((float) this.parentHeight));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r3.gestureInsetBottom;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int calculatePeekHeight() {
        /*
            r3 = this;
            boolean r0 = r3.peekHeightAuto
            if (r0 == 0) goto L_0x001a
            int r0 = r3.peekHeightMin
            int r1 = r3.parentHeight
            int r2 = r3.parentWidth
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.childHeight
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L_0x001a:
            boolean r0 = r3.gestureInsetBottomIgnored
            if (r0 != 0) goto L_0x002c
            int r0 = r3.gestureInsetBottom
            if (r0 <= 0) goto L_0x002c
            int r1 = r3.peekHeight
            int r2 = r3.peekHeightGestureInsetBuffer
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x002c:
            int r0 = r3.peekHeight
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.calculatePeekHeight():int");
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i2) {
        return new AccessibilityViewCommand() {
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i2);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, (ColorStateList) null);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z, @Nullable ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable2;
            materialShapeDrawable2.initializeElevationOverlay(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.materialShapeDrawable.setTint(typedValue.data);
                return;
            }
            this.materialShapeDrawable.setFillColor(colorStateList);
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 == null) {
            return 0.0f;
        }
        velocityTracker2.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void replaceAccessibilityActionForState(V v, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i2) {
        ViewCompat.replaceAccessibilityAction(v, accessibilityActionCompat, (CharSequence) null, createAccessibilityViewCommandForState(i2));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i2 = this.saveFlags;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.peekHeight = savedState.peekHeight;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.fitToContents = savedState.fitToContents;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.hideable = savedState.hideable;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.skipCollapsed = savedState.skipCollapsed;
            }
        }
    }

    private void setSystemGestureInsets(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() {
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                    int unused = BottomSheetBehavior.this.gestureInsetBottom = windowInsetsCompat.getMandatorySystemGestureInsets().bottom;
                    BottomSheetBehavior.this.updatePeekHeight(false);
                    return windowInsetsCompat;
                }
            });
        }
    }

    private void settleToStatePendingLayout(final int i2) {
        final View view = (View) this.viewRef.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                settleToState(view, i2);
            } else {
                view.post(new Runnable() {
                    public void run() {
                        BottomSheetBehavior.this.settleToState(view, i2);
                    }
                });
            }
        }
    }

    private void updateAccessibilityActions() {
        View view;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            int i2 = this.expandHalfwayActionId;
            if (i2 != -1) {
                ViewCompat.removeAccessibilityAction(view, i2);
            }
            int i3 = 6;
            if (this.state != 6) {
                this.expandHalfwayActionId = addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6);
            }
            if (this.hideable && this.state != 5) {
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
            int i4 = this.state;
            if (i4 == 3) {
                if (this.fitToContents) {
                    i3 = 4;
                }
                accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE;
            } else if (i4 == 4) {
                if (this.fitToContents) {
                    i3 = 3;
                }
                accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND;
            } else if (i4 == 6) {
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
                return;
            } else {
                return;
            }
            replaceAccessibilityActionForState(view, accessibilityActionCompat, i3);
        }
    }

    private void updateDrawableForTargetState(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z = i2 == 3;
            if (this.isShapeExpanded != z) {
                this.isShapeExpanded = z;
                if (this.materialShapeDrawable != null && (valueAnimator = this.interpolatorAnimator) != null) {
                    if (valueAnimator.isRunning()) {
                        this.interpolatorAnimator.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.interpolatorAnimator.setFloatValues(new float[]{1.0f - f, f});
                    this.interpolatorAnimator.start();
                }
            }
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        int intValue;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.importantForAccessibilityMap == null) {
                        this.importantForAccessibilityMap = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.viewRef.get()) {
                        if (z) {
                            this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.updateImportantForAccessibilityOnSiblings) {
                                intValue = 4;
                            }
                        } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                            intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        }
                        ViewCompat.setImportantForAccessibility(childAt, intValue);
                    }
                }
                if (!z) {
                    this.importantForAccessibilityMap = null;
                } else if (this.updateImportantForAccessibilityOnSiblings) {
                    ((View) this.viewRef.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        View view;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (view = (View) this.viewRef.get()) != null) {
                if (z) {
                    settleToStatePendingLayout(this.state);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (!this.callbacks.contains(bottomSheetCallback)) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i2) {
        float f;
        float f2;
        View view = (View) this.viewRef.get();
        if (view != null && !this.callbacks.isEmpty()) {
            int i3 = this.collapsedOffset;
            if (i2 > i3 || i3 == getExpandedOffset()) {
                int i4 = this.collapsedOffset;
                f = (float) (i4 - i2);
                f2 = (float) (this.parentHeight - i4);
            } else {
                int i5 = this.collapsedOffset;
                f = (float) (i5 - i2);
                f2 = (float) (i5 - getExpandedOffset());
            }
            float f3 = f / f2;
            for (int i6 = 0; i6 < this.callbacks.size(); i6++) {
                this.callbacks.get(i6).onSlide(view, f3);
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i2));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r10, @androidx.annotation.NonNull V r11, @androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.draggable
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.reset()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.velocityTracker
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.velocityTracker = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.velocityTracker
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.touchingScrollingChild = r1
            r9.activePointerId = r4
            boolean r11 = r9.ignoreEvents
            if (r11 == 0) goto L_0x007f
            r9.ignoreEvents = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.initialY = r7
            int r7 = r9.state
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.nestedScrollingChildRef
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.initialY
            boolean r7 = r10.isPointInChildBounds(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.activePointerId = r7
            r9.touchingScrollingChild = r2
        L_0x006e:
            int r7 = r9.activePointerId
            if (r7 != r4) goto L_0x007c
            int r4 = r9.initialY
            boolean r11 = r10.isPointInChildBounds(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.ignoreEvents = r11
        L_0x007f:
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto L_0x008e
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.shouldInterceptTouchEvent(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.nestedScrollingChildRef
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.state
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.isPointInChildBounds(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            androidx.customview.widget.ViewDragHelper r10 = r9.viewDragHelper
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.initialY
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            int r11 = r11.getTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = r2
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.ignoreEvents = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i2) {
        int i3;
        MaterialShapeDrawable materialShapeDrawable2;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setSystemGestureInsets(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (materialShapeDrawable2 = this.materialShapeDrawable) != null) {
                ViewCompat.setBackground(v, materialShapeDrawable2);
            }
            MaterialShapeDrawable materialShapeDrawable3 = this.materialShapeDrawable;
            if (materialShapeDrawable3 != null) {
                float f = this.elevation;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                materialShapeDrawable3.setElevation(f);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i2);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        this.fitToContentsOffset = Math.max(0, this.parentHeight - height);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i4 = this.state;
        if (i4 == 3) {
            i3 = getExpandedOffset();
        } else if (i4 == 6) {
            i3 = this.halfExpandedOffset;
        } else if (this.hideable && i4 == 5) {
            i3 = this.parentHeight;
        } else if (i4 == 4) {
            i3 = this.collapsedOffset;
        } else {
            if (i4 == 1 || i4 == 2) {
                ViewCompat.offsetTopAndBottom(v, top - v.getTop());
            }
            this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
            return true;
        }
        ViewCompat.offsetTopAndBottom(v, i3);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.collapsedOffset;
                        if (i6 > i7 && !this.hideable) {
                            iArr[1] = top - i7;
                            ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                            i5 = 4;
                        } else if (this.draggable) {
                            iArr[1] = i3;
                            ViewCompat.offsetTopAndBottom(v, -i3);
                            setStateInternal(1);
                        } else {
                            return;
                        }
                    }
                    dispatchOnSlide(v.getTop());
                    this.lastNestedScrollDy = i3;
                    this.nestedScrolled = true;
                } else if (i6 < getExpandedOffset()) {
                    iArr[1] = top - getExpandedOffset();
                    ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                    i5 = 3;
                } else if (this.draggable) {
                    iArr[1] = i3;
                    ViewCompat.offsetTopAndBottom(v, -i3);
                    setStateInternal(1);
                    dispatchOnSlide(v.getTop());
                    this.lastNestedScrollDy = i3;
                    this.nestedScrolled = true;
                } else {
                    return;
                }
                setStateInternal(i5);
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i3;
                this.nestedScrolled = true;
            }
        }
    }

    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i2, int i3, int i4, int i5, int i6, @NonNull int[] iArr) {
    }

    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i2 = savedState.state;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.state = i2;
    }

    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i2, int i3) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.setStateInternal(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00b1
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L_0x001f
            goto L_0x00b1
        L_0x001f:
            int r3 = r2.lastNestedScrollDy
            r5 = 4
            r6 = 6
            if (r3 <= 0) goto L_0x003c
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L_0x002d
        L_0x0029:
            int r3 = r2.fitToContentsOffset
            goto L_0x00ab
        L_0x002d:
            int r3 = r4.getTop()
            int r5 = r2.halfExpandedOffset
            if (r3 <= r5) goto L_0x0038
            r3 = r5
            goto L_0x00aa
        L_0x0038:
            int r3 = r2.expandedOffset
            goto L_0x00ab
        L_0x003c:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L_0x004e
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L_0x004e
            int r3 = r2.parentHeight
            r0 = 5
            goto L_0x00ab
        L_0x004e:
            int r3 = r2.lastNestedScrollDy
            if (r3 != 0) goto L_0x008b
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L_0x006c
            int r6 = r2.fitToContentsOffset
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x008f
            goto L_0x0029
        L_0x006c:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L_0x007b
            int r5 = r2.collapsedOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r3 >= r5) goto L_0x00a8
            goto L_0x0038
        L_0x007b:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
            goto L_0x00a8
        L_0x008b:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L_0x0093
        L_0x008f:
            int r3 = r2.collapsedOffset
            r0 = r5
            goto L_0x00ab
        L_0x0093:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x008f
        L_0x00a8:
            int r3 = r2.halfExpandedOffset
        L_0x00aa:
            r0 = r6
        L_0x00ab:
            r5 = 0
            r2.startSettlingAnimation(r4, r0, r3, r5)
            r2.nestedScrolled = r5
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 != null) {
            viewDragHelper2.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (this.viewDragHelper != null && actionMasked == 2 && !this.ignoreEvents && Math.abs(((float) this.initialY) - motionEvent.getY()) > ((float) this.viewDragHelper.getTouchSlop())) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i2) {
        if (i2 >= 0) {
            this.expandedOffset = i2;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents != z) {
            this.fitToContents = z;
            if (this.viewRef != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((!this.fitToContents || this.state != 6) ? this.state : 3);
            updateAccessibilityActions();
        }
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i2) {
        setPeekHeight(i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPeekHeight(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L_0x0015
            r3.peekHeightAuto = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.peekHeightAuto
            if (r2 != 0) goto L_0x0017
            int r2 = r3.peekHeight
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r3.peekHeightAuto = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.peekHeight = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.updatePeekHeight(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int, boolean):void");
    }

    public void setSaveFlags(int i2) {
        this.saveFlags = i2;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i2) {
        if (i2 != this.state) {
            if (this.viewRef != null) {
                settleToStatePendingLayout(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.hideable && i2 == 5)) {
                this.state = i2;
            }
        }
    }

    public void setStateInternal(int i2) {
        View view;
        if (this.state != i2) {
            this.state = i2;
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 3) {
                    updateImportantForAccessibility(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    updateImportantForAccessibility(false);
                }
                updateDrawableForTargetState(i2);
                for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
                    this.callbacks.get(i3).onStateChanged(view, i2);
                }
                updateAccessibilityActions();
            }
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void settleToState(@NonNull View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.collapsedOffset;
        } else if (i2 == 6) {
            int i5 = this.halfExpandedOffset;
            if (!this.fitToContents || i5 > (i4 = this.fitToContentsOffset)) {
                i3 = i5;
            } else {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = getExpandedOffset();
        } else if (!this.hideable || i2 != 5) {
            throw new IllegalArgumentException(a.g("Illegal state argument: ", i2));
        } else {
            i3 = this.parentHeight;
        }
        startSettlingAnimation(view, i2, i3, false);
    }

    public boolean shouldHide(@NonNull View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public void startSettlingAnimation(View view, int i2, int i3, boolean z) {
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 != null && (!z ? viewDragHelper2.smoothSlideViewTo(view, view.getLeft(), i3) : viewDragHelper2.settleCapturedViewAt(view.getLeft(), i3))) {
            setStateInternal(2);
            updateDrawableForTargetState(i2);
            if (this.settleRunnable == null) {
                this.settleRunnable = new SettleRunnable(view, i2);
            }
            if (!this.settleRunnable.isPosted) {
                BottomSheetBehavior<V>.SettleRunnable settleRunnable2 = this.settleRunnable;
                settleRunnable2.targetState = i2;
                ViewCompat.postOnAnimation(view, settleRunnable2);
                boolean unused = this.settleRunnable.isPosted = true;
                return;
            }
            this.settleRunnable.targetState = i2;
            return;
        }
        setStateInternal(i2);
    }
}
