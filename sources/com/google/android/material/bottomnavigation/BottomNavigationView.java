package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;

public class BottomNavigationView extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomNavigationView;
    private static final int MENU_PRESENTER_ID = 1;
    @Nullable
    private ColorStateList itemRippleColor;
    @NonNull
    private final MenuBuilder menu;
    private MenuInflater menuInflater;
    @VisibleForTesting
    @NonNull
    public final BottomNavigationMenuView menuView;
    private final BottomNavigationPresenter presenter;
    /* access modifiers changed from: private */
    public OnNavigationItemReselectedListener reselectedListener;
    /* access modifiers changed from: private */
    public OnNavigationItemSelectedListener selectedListener;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

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
        public Bundle menuPresenterState;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.menuPresenterState);
        }
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomNavigationView(@androidx.annotation.NonNull android.content.Context r16, @androidx.annotation.Nullable android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r2 = r17
            r4 = r18
            int r1 = DEF_STYLE_RES
            r3 = r16
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r3, r2, r4, r1)
            r15.<init>(r1, r2, r4)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r1 = new com.google.android.material.bottomnavigation.BottomNavigationPresenter
            r1.<init>()
            r0.presenter = r1
            android.content.Context r7 = r15.getContext()
            com.google.android.material.bottomnavigation.BottomNavigationMenu r8 = new com.google.android.material.bottomnavigation.BottomNavigationMenu
            r8.<init>(r7)
            r0.menu = r8
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r9 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView
            r9.<init>(r7)
            r0.menuView = r9
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r10.<init>(r3, r3)
            r3 = 17
            r10.gravity = r3
            r9.setLayoutParams(r10)
            r1.setBottomNavigationMenuView(r9)
            r11 = 1
            r1.setId(r11)
            r9.setPresenter(r1)
            r8.addMenuPresenter(r1)
            android.content.Context r3 = r15.getContext()
            r1.initForMenu(r3, r8)
            int[] r3 = com.google.android.material.R.styleable.BottomNavigationView
            int r5 = com.google.android.material.R.style.Widget_Design_BottomNavigationView
            r1 = 2
            int[] r6 = new int[r1]
            int r12 = com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceInactive
            r13 = 0
            r6[r13] = r12
            int r14 = com.google.android.material.R.styleable.BottomNavigationView_itemTextAppearanceActive
            r6[r11] = r14
            r1 = r7
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemIconTint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x006c
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            goto L_0x0073
        L_0x006c:
            r2 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r2 = r9.createDefaultColorStateList(r2)
        L_0x0073:
            r9.setIconTintList(r2)
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemIconSize
            android.content.res.Resources r3 = r15.getResources()
            int r4 = com.google.android.material.R.dimen.design_bottom_navigation_icon_size
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r15.setItemIconSize(r2)
            boolean r2 = r1.hasValue(r12)
            if (r2 == 0) goto L_0x0096
            int r2 = r1.getResourceId(r12, r13)
            r15.setItemTextAppearanceInactive(r2)
        L_0x0096:
            boolean r2 = r1.hasValue(r14)
            if (r2 == 0) goto L_0x00a3
            int r2 = r1.getResourceId(r14, r13)
            r15.setItemTextAppearanceActive(r2)
        L_0x00a3:
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemTextColor
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x00b2
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            r15.setItemTextColor(r2)
        L_0x00b2:
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            if (r2 == 0) goto L_0x00c0
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00c7
        L_0x00c0:
            com.google.android.material.shape.MaterialShapeDrawable r2 = r15.createMaterialShapeDrawableBackground(r7)
            androidx.core.view.ViewCompat.setBackground(r15, r2)
        L_0x00c7:
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_elevation
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x00d7
            int r2 = r1.getDimensionPixelSize(r2, r13)
            float r2 = (float) r2
            r15.setElevation(r2)
        L_0x00d7:
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_backgroundTint
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r7, (androidx.appcompat.widget.TintTypedArray) r1, (int) r2)
            android.graphics.drawable.Drawable r3 = r15.getBackground()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r3, r2)
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_labelVisibilityMode
            r3 = -1
            int r2 = r1.getInteger(r2, r3)
            r15.setLabelVisibilityMode(r2)
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            boolean r2 = r1.getBoolean(r2, r11)
            r15.setItemHorizontalTranslationEnabled(r2)
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemBackground
            int r2 = r1.getResourceId(r2, r13)
            if (r2 == 0) goto L_0x0107
            r9.setItemBackgroundRes(r2)
            goto L_0x0110
        L_0x0107:
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_itemRippleColor
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r7, (androidx.appcompat.widget.TintTypedArray) r1, (int) r2)
            r15.setItemRippleColor(r2)
        L_0x0110:
            int r2 = com.google.android.material.R.styleable.BottomNavigationView_menu
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x011f
            int r2 = r1.getResourceId(r2, r13)
            r15.inflateMenu(r2)
        L_0x011f:
            r1.recycle()
            r15.addView(r9, r10)
            boolean r1 = r15.shouldDrawCompatibilityTopDivider()
            if (r1 == 0) goto L_0x012e
            r15.addCompatibilityTopDivider(r7)
        L_0x012e:
            com.google.android.material.bottomnavigation.BottomNavigationView$1 r1 = new com.google.android.material.bottomnavigation.BottomNavigationView$1
            r1.<init>()
            r8.setCallback(r1)
            r15.applyWindowInsets()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() {
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = windowInsetsCompat.getSystemWindowInsetBottom() + relativePadding.bottom;
                boolean z = true;
                if (ViewCompat.getLayoutDirection(view) != 1) {
                    z = false;
                }
                int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
                relativePadding.start += z ? systemWindowInsetRight : systemWindowInsetLeft;
                int i2 = relativePadding.end;
                if (!z) {
                    systemWindowInsetLeft = systemWindowInsetRight;
                }
                relativePadding.end = i2 + systemWindowInsetLeft;
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
    }

    @NonNull
    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Nullable
    public BadgeDrawable getBadge(int i2) {
        return this.menuView.getBadge(i2);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @Deprecated
    @DrawableRes
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i2) {
        return this.menuView.getOrCreateBadge(i2);
    }

    @IdRes
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i2) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i2, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i2) {
        this.menuView.removeBadge(i2);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.menuView.setItemBackground(drawable);
        this.itemRippleColor = null;
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        this.menuView.setItemBackgroundRes(i2);
        this.itemRippleColor = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.menuView.isItemHorizontalTranslationEnabled() != z) {
            this.menuView.setItemHorizontalTranslationEnabled(z);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i2) {
        this.menuView.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(@DimenRes int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i2, @Nullable View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i2, onTouchListener);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.itemRippleColor != colorStateList) {
            this.itemRippleColor = colorStateList;
            if (colorStateList == null) {
                this.menuView.setItemBackground((Drawable) null);
                return;
            }
            this.menuView.setItemBackground(new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.menuView.getItemBackground() != null) {
            this.menuView.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i2) {
        this.menuView.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i2) {
        this.menuView.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.menuView.getLabelVisibilityMode() != i2) {
            this.menuView.setLabelVisibilityMode(i2);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.reselectedListener = onNavigationItemReselectedListener;
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.selectedListener = onNavigationItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i2) {
        MenuItem findItem = this.menu.findItem(i2);
        if (findItem != null && !this.menu.performItemAction(findItem, this.presenter, 0)) {
            findItem.setChecked(true);
        }
    }
}
