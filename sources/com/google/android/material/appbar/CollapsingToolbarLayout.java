package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;

public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_CollapsingToolbar;
    @NonNull
    public final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;
    @Nullable
    private Drawable contentScrim;
    public int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    @Nullable
    public WindowInsetsCompat lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;
    @Nullable
    public Drawable statusBarScrim;
    private final Rect tmpRect;
    @Nullable
    private ViewGroup toolbar;
    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        public int collapseMode = 0;
        public float parallaxMult = 0.5f;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i2) {
            this.collapseMode = i2;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }
    }

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
            int i3;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i2;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.lastInsets;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i5 = layoutParams.collapseMode;
                if (i5 == 1) {
                    i3 = MathUtils.clamp(-i2, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt));
                } else if (i5 != 2) {
                } else {
                    i3 = Math.round(((float) (-i2)) * layoutParams.parallaxMult);
                }
                viewOffsetHelper.setTopAndBottomOffset(i3);
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(((float) Math.abs(i2)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop)));
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.Nullable android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = DEF_STYLE_RES
            android.content.Context r10 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = 1
            r9.refreshToolbar = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.tmpRect = r0
            r6 = -1
            r9.scrimVisibleHeightTrigger = r6
            android.content.Context r0 = r9.getContext()
            com.google.android.material.internal.CollapsingTextHelper r7 = new com.google.android.material.internal.CollapsingTextHelper
            r7.<init>(r9)
            r9.collapsingTextHelper = r7
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
            r7.setTextSizeInterpolator(r1)
            int[] r2 = com.google.android.material.R.styleable.CollapsingToolbarLayout
            r8 = 0
            int[] r5 = new int[r8]
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r12 = r11.getInt(r12, r0)
            r7.setExpandedTextGravity(r12)
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r12 = r11.getInt(r12, r0)
            r7.setCollapsedTextGravity(r12)
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMargin
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.expandedMarginBottom = r12
            r9.expandedMarginEnd = r12
            r9.expandedMarginTop = r12
            r9.expandedMarginStart = r12
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0065
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.expandedMarginStart = r12
        L_0x0065:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0073
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.expandedMarginEnd = r12
        L_0x0073:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0081
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.expandedMarginTop = r12
        L_0x0081:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008f
            int r12 = r11.getDimensionPixelSize(r12, r8)
            r9.expandedMarginBottom = r12
        L_0x008f:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_titleEnabled
            boolean r12 = r11.getBoolean(r12, r10)
            r9.collapsingTitleEnabled = r12
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_title
            java.lang.CharSequence r12 = r11.getText(r12)
            r9.setTitle(r12)
            int r12 = com.google.android.material.R.style.TextAppearance_Design_CollapsingToolbar_Expanded
            r7.setExpandedTextAppearance(r12)
            int r12 = androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title
            r7.setCollapsedTextAppearance(r12)
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00b9
            int r12 = r11.getResourceId(r12, r8)
            r7.setExpandedTextAppearance(r12)
        L_0x00b9:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00c8
            int r12 = r11.getResourceId(r12, r8)
            r7.setCollapsedTextAppearance(r12)
        L_0x00c8:
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r12 = r11.getDimensionPixelSize(r12, r6)
            r9.scrimVisibleHeightTrigger = r12
            int r12 = com.google.android.material.R.styleable.CollapsingToolbarLayout_maxLines
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00df
            int r10 = r11.getInt(r12, r10)
            r7.setMaxLines(r10)
        L_0x00df:
            int r10 = com.google.android.material.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration
            r12 = 600(0x258, float:8.41E-43)
            int r10 = r11.getInt(r10, r12)
            long r0 = (long) r10
            r9.scrimAnimationDuration = r0
            int r10 = com.google.android.material.R.styleable.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setContentScrim(r10)
            int r10 = com.google.android.material.R.styleable.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarScrim(r10)
            int r10 = com.google.android.material.R.styleable.CollapsingToolbarLayout_toolbarId
            int r10 = r11.getResourceId(r10, r6)
            r9.toolbarId = r10
            r11.recycle()
            r9.setWillNotDraw(r8)
            com.google.android.material.appbar.CollapsingToolbarLayout$1 r10 = new com.google.android.material.appbar.CollapsingToolbarLayout$1
            r10.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void animateScrim(int i2) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setDuration(this.scrimAnimationDuration);
            this.scrimAnimator.setInterpolator(i2 > this.scrimAlpha ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setIntValues(new int[]{this.scrimAlpha, i2});
        this.scrimAnimator.start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void ensureToolbar() {
        /*
            r6 = this;
            boolean r0 = r6.refreshToolbar
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.toolbar = r0
            r6.toolbarDirectChild = r0
            int r1 = r6.toolbarId
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.toolbar = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.findDirectChild(r1)
            r6.toolbarDirectChild = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.toolbar
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = r2
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = isToolbar(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.toolbar = r0
        L_0x003e:
            r6.updateDummyView()
            r6.refreshToolbar = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.ensureToolbar():void");
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    public static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        int i2 = R.id.view_offset_helper;
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(i2);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(i2, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            if (view == this.toolbar) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void updateCollapsedBounds(boolean z) {
        int i2;
        int i3;
        int i4;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        int i5 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar2 = (Toolbar) viewGroup;
            i5 = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i2 = toolbar2.getTitleMarginTop();
            i4 = toolbar2.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar3 = (android.widget.Toolbar) viewGroup;
            i5 = toolbar3.getTitleMarginStart();
            i3 = toolbar3.getTitleMarginEnd();
            i2 = toolbar3.getTitleMarginTop();
            i4 = toolbar3.getTitleMarginBottom();
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        CollapsingTextHelper collapsingTextHelper2 = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i6 = rect.left + (z ? i3 : i5);
        int i7 = rect.top + maxOffsetForPinChild + i2;
        int i8 = rect.right;
        if (!z) {
            i5 = i3;
        }
        collapsingTextHelper2.setCollapsedBounds(i6, i7, i8 - i5, (rect.bottom + maxOffsetForPinChild) - i4);
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (this.collapsingTitleEnabled && this.toolbar != null) {
            if (this.dummyView == null) {
                this.dummyView = new View(getContext());
            }
            if (this.dummyView.getParent() == null) {
                this.toolbar.addView(this.dummyView, -1, -1);
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            this.collapsingTextHelper.draw(canvas);
        }
        if (this.statusBarScrim != null && this.scrimAlpha > 0) {
            WindowInsetsCompat windowInsetsCompat = this.lastInsets;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), systemWindowInsetTop - this.currentOffset);
                this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
                this.statusBarScrim.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j2) || z;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper2 = this.collapsingTextHelper;
        if (collapsingTextHelper2 != null) {
            z |= collapsingTextHelper2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.scrimVisibleHeightTrigger;
        if (i2 >= 0) {
            return i2;
        }
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows((View) parent));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            ((AppBarLayout) parent).addOnOffsetChangedListener(this.onOffsetChangedListener);
            ViewCompat.requestApplyInsets(this);
        }
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener2 = this.onOffsetChangedListener;
        if (onOffsetChangedListener2 != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener2);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            getViewOffsetHelper(getChildAt(i7)).onViewLayout();
        }
        if (this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            boolean z2 = true;
            boolean z3 = ViewCompat.isAttachedToWindow(view) && this.dummyView.getVisibility() == 0;
            this.drawCollapsingTitle = z3;
            if (z3) {
                if (ViewCompat.getLayoutDirection(this) != 1) {
                    z2 = false;
                }
                updateCollapsedBounds(z2);
                this.collapsingTextHelper.setExpandedBounds(z2 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i4 - i2) - (z2 ? this.expandedMarginStart : this.expandedMarginEnd), (i5 - i3) - this.expandedMarginBottom);
                this.collapsingTextHelper.recalculate();
            }
        }
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            getViewOffsetHelper(getChildAt(i8)).applyOffsets();
        }
    }

    public void onMeasure(int i2, int i3) {
        ensureToolbar();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (mode == 0 && systemWindowInsetTop > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, BasicMeasure.EXACTLY));
        }
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup != null) {
            View view = this.toolbarDirectChild;
            setMinimumHeight((view == null || view == this) ? getHeightWithMargins(viewGroup) : getHeightWithMargins(view));
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public WindowInsetsCompat onWindowInsetChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setCollapsedTitleGravity(int i2) {
        this.collapsingTextHelper.setCollapsedTextGravity(i2);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i2) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i2);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.contentScrim = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(@DrawableRes int i2) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setExpandedTitleColor(@ColorInt int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.collapsingTextHelper.setExpandedTextGravity(i2);
    }

    public void setExpandedTitleMargin(int i2, int i3, int i4, int i5) {
        this.expandedMarginStart = i2;
        this.expandedMarginTop = i3;
        this.expandedMarginEnd = i4;
        this.expandedMarginBottom = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.expandedMarginBottom = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.expandedMarginEnd = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.expandedMarginStart = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.expandedMarginTop = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i2) {
        this.collapsingTextHelper.setExpandedTextAppearance(i2);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i2) {
        this.collapsingTextHelper.setMaxLines(i2);
    }

    public void setScrimAlpha(int i2) {
        ViewGroup viewGroup;
        if (i2 != this.scrimAlpha) {
            if (!(this.contentScrim == null || (viewGroup = this.toolbar) == null)) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.scrimAlpha = i2;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j2) {
        this.scrimAnimationDuration = j2;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i2) {
        if (this.scrimVisibleHeightTrigger != i2) {
            this.scrimVisibleHeightTrigger = i2;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                animateScrim(i2);
            } else {
                if (!z) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.scrimsAreShown = z;
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarScrim = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarScrim, ViewCompat.getLayoutDirection(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(@DrawableRes int i2) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.statusBarScrim;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.contentScrim.setVisible(z, false);
        }
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim != null || this.statusBarScrim != null) {
            setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
        }
    }

    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }
}
