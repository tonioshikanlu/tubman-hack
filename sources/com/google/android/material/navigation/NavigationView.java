package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = R.style.Widget_Design_NavigationView;
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    public OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    /* access modifiers changed from: private */
    public final NavigationMenuPresenter presenter;
    /* access modifiers changed from: private */
    public final int[] tmpLocation;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
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
        @Nullable
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.menuState);
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.internal.NavigationMenuPresenter r11 = new com.google.android.material.internal.NavigationMenuPresenter
            r11.<init>()
            r10.presenter = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.tmpLocation = r0
            android.content.Context r7 = r10.getContext()
            com.google.android.material.internal.NavigationMenu r8 = new com.google.android.material.internal.NavigationMenu
            r8.<init>(r7)
            r10.menu = r8
            int[] r2 = com.google.android.material.R.styleable.NavigationView
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            androidx.appcompat.widget.TintTypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.R.styleable.NavigationView_android_background
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            androidx.core.view.ViewCompat.setBackground(r10, r1)
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0072
        L_0x004a:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r12 = com.google.android.material.shape.ShapeAppearanceModel.builder((android.content.Context) r7, (android.util.AttributeSet) r12, (int) r13, (int) r6)
            com.google.android.material.shape.ShapeAppearanceModel r12 = r12.build()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>((com.google.android.material.shape.ShapeAppearanceModel) r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006c
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.setFillColor(r12)
        L_0x006c:
            r1.initializeElevationOverlay(r7)
            androidx.core.view.ViewCompat.setBackground(r10, r1)
        L_0x0072:
            int r12 = com.google.android.material.R.styleable.NavigationView_elevation
            boolean r13 = r0.hasValue(r12)
            if (r13 == 0) goto L_0x0082
            int r12 = r0.getDimensionPixelSize(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L_0x0082:
            int r12 = com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows
            boolean r12 = r0.getBoolean(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = com.google.android.material.R.styleable.NavigationView_android_maxWidth
            int r12 = r0.getDimensionPixelSize(r12, r9)
            r10.maxWidth = r12
            int r12 = com.google.android.material.R.styleable.NavigationView_itemIconTint
            boolean r13 = r0.hasValue(r12)
            if (r13 == 0) goto L_0x00a0
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)
            goto L_0x00a7
        L_0x00a0:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.createDefaultColorStateList(r12)
        L_0x00a7:
            int r13 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance
            boolean r1 = r0.hasValue(r13)
            r2 = 1
            if (r1 == 0) goto L_0x00b6
            int r13 = r0.getResourceId(r13, r9)
            r1 = r2
            goto L_0x00b8
        L_0x00b6:
            r13 = r9
            r1 = r13
        L_0x00b8:
            int r3 = com.google.android.material.R.styleable.NavigationView_itemIconSize
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L_0x00c7
            int r3 = r0.getDimensionPixelSize(r3, r9)
            r10.setItemIconSize(r3)
        L_0x00c7:
            r3 = 0
            int r4 = com.google.android.material.R.styleable.NavigationView_itemTextColor
            boolean r5 = r0.hasValue(r4)
            if (r5 == 0) goto L_0x00d4
            android.content.res.ColorStateList r3 = r0.getColorStateList(r4)
        L_0x00d4:
            if (r1 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.createDefaultColorStateList(r3)
        L_0x00df:
            int r4 = com.google.android.material.R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            if (r4 != 0) goto L_0x00f1
            boolean r5 = r10.hasShapeAppearance(r0)
            if (r5 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r4 = r10.createDefaultItemBackground(r0)
        L_0x00f1:
            int r5 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding
            boolean r6 = r0.hasValue(r5)
            if (r6 == 0) goto L_0x0100
            int r5 = r0.getDimensionPixelSize(r5, r9)
            r11.setItemHorizontalPadding(r5)
        L_0x0100:
            int r5 = com.google.android.material.R.styleable.NavigationView_itemIconPadding
            int r5 = r0.getDimensionPixelSize(r5, r9)
            int r6 = com.google.android.material.R.styleable.NavigationView_itemMaxLines
            int r6 = r0.getInt(r6, r2)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$1 r6 = new com.google.android.material.navigation.NavigationView$1
            r6.<init>()
            r8.setCallback(r6)
            r11.setId(r2)
            r11.initForMenu(r7, r8)
            r11.setItemIconTintList(r12)
            int r12 = r10.getOverScrollMode()
            r11.setOverScrollMode(r12)
            if (r1 == 0) goto L_0x012c
            r11.setItemTextAppearance(r13)
        L_0x012c:
            r11.setItemTextColor(r3)
            r11.setItemBackground(r4)
            r11.setItemIconPadding(r5)
            r8.addMenuPresenter(r11)
            androidx.appcompat.view.menu.MenuView r11 = r11.getMenuView(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = com.google.android.material.R.styleable.NavigationView_menu
            boolean r12 = r0.hasValue(r11)
            if (r12 == 0) goto L_0x0150
            int r11 = r0.getResourceId(r11, r9)
            r10.inflateMenu(r11)
        L_0x0150:
            int r11 = com.google.android.material.R.styleable.NavigationView_headerLayout
            boolean r12 = r0.hasValue(r11)
            if (r12 == 0) goto L_0x015f
            int r11 = r0.getResourceId(r11, r9)
            r10.inflateHeaderView(r11)
        L_0x015f:
            r0.recycle()
            r10.setupInsetScrimsListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    @NonNull
    private final Drawable createDefaultItemBackground(@NonNull TintTypedArray tintTypedArray) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable(materialShapeDrawable, tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z = true;
                boolean z2 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z2);
                NavigationView.this.setDrawTopInsetForeground(z2);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    boolean z3 = activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                    boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView2 = NavigationView.this;
                    if (!z3 || !z4) {
                        z = false;
                    }
                    navigationView2.setDrawBottomInsetForeground(z);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i2) {
        return this.presenter.getHeaderView(i2);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(@LayoutRes int i2) {
        return this.presenter.inflateHeaderView(i2);
    }

    public void inflateMenu(int i2) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i2, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = this.maxWidth;
            }
            super.onMeasure(i2, i3);
        }
        i4 = Math.min(View.MeasureSpec.getSize(i2), this.maxWidth);
        i2 = View.MeasureSpec.makeMeasureSpec(i4, BasicMeasure.EXACTLY);
        super.onMeasure(i2, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setCheckedItem(@IdRes int i2) {
        MenuItem findItem = this.menu.findItem(i2);
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setItemHorizontalPadding(@Dimension int i2) {
        this.presenter.setItemHorizontalPadding(i2);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i2) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(@Dimension int i2) {
        this.presenter.setItemIconPadding(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(@Dimension int i2) {
        this.presenter.setItemIconSize(i2);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.presenter.setItemMaxLines(i2);
    }

    public void setItemTextAppearance(@StyleRes int i2) {
        this.presenter.setItemTextAppearance(i2);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i2);
        }
    }
}
