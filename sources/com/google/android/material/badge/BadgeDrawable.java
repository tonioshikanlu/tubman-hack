package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    @StyleRes
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;
    @AttrRes
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    @Nullable
    private WeakReference<View> anchorViewRef;
    @NonNull
    private final Rect badgeBounds = new Rect();
    private float badgeCenterX;
    private float badgeCenterY;
    private final float badgeRadius;
    private final float badgeWidePadding;
    private final float badgeWithTextRadius;
    @NonNull
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    @Nullable
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    @NonNull
    private final SavedState savedState;
    @NonNull
    private final MaterialShapeDrawable shapeDrawable = new MaterialShapeDrawable();
    @NonNull
    private final TextDrawableHelper textDrawableHelper;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @NonNull
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        /* access modifiers changed from: private */
        public int alpha = 255;
        /* access modifiers changed from: private */
        @ColorInt
        public int backgroundColor;
        /* access modifiers changed from: private */
        public int badgeGravity;
        /* access modifiers changed from: private */
        @ColorInt
        public int badgeTextColor;
        /* access modifiers changed from: private */
        @StringRes
        public int contentDescriptionExceedsMaxBadgeNumberRes;
        /* access modifiers changed from: private */
        @Nullable
        public CharSequence contentDescriptionNumberless;
        /* access modifiers changed from: private */
        @PluralsRes
        public int contentDescriptionQuantityStrings;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)
        public int horizontalOffset;
        /* access modifiers changed from: private */
        public boolean isVisible;
        /* access modifiers changed from: private */
        public int maxCharacterCount;
        /* access modifiers changed from: private */
        public int number = -1;
        /* access modifiers changed from: private */
        @Dimension(unit = 1)
        public int verticalOffset;

        public SavedState(@NonNull Context context) {
            this.badgeTextColor = new TextAppearance(context, R.style.TextAppearance_MaterialComponents_Badge).textColor.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.contentDescriptionQuantityStrings = R.plurals.mtrl_badge_content_description;
            this.contentDescriptionExceedsMaxBadgeNumberRes = R.string.mtrl_exceed_max_badge_number_content_description;
            this.isVisible = true;
        }

        public SavedState(@NonNull Parcel parcel) {
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffset = parcel.readInt();
            this.verticalOffset = parcel.readInt();
            this.isVisible = parcel.readInt() != 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffset);
            parcel.writeInt(this.verticalOffset);
            parcel.writeInt(this.isVisible ? 1 : 0);
        }
    }

    private BadgeDrawable(@NonNull Context context) {
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        Resources resources = context.getResources();
        this.badgeRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.badgeWidePadding = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.badgeWithTextRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        TextDrawableHelper textDrawableHelper2 = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper2;
        textDrawableHelper2.getTextPaint().setTextAlign(Paint.Align.CENTER);
        this.savedState = new SavedState(context);
        setTextAppearanceResource(R.style.TextAppearance_MaterialComponents_Badge);
    }

    private void calculateCenterAndBounds(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
        float f;
        int access$500 = this.savedState.badgeGravity;
        this.badgeCenterY = (access$500 == 8388691 || access$500 == 8388693) ? (float) (rect.bottom - this.savedState.verticalOffset) : (float) (this.savedState.verticalOffset + rect.top);
        if (getNumber() <= 9) {
            f = !hasNumber() ? this.badgeRadius : this.badgeWithTextRadius;
            this.cornerRadius = f;
            this.halfBadgeHeight = f;
        } else {
            float f2 = this.badgeWithTextRadius;
            this.cornerRadius = f2;
            this.halfBadgeHeight = f2;
            f = (this.textDrawableHelper.getTextWidth(getBadgeText()) / 2.0f) + this.badgeWidePadding;
        }
        this.halfBadgeWidth = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hasNumber() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int access$5002 = this.savedState.badgeGravity;
        this.badgeCenterX = (access$5002 == 8388659 || access$5002 == 8388691 ? ViewCompat.getLayoutDirection(view) != 0 : ViewCompat.getLayoutDirection(view) == 0) ? ((((float) rect.right) + this.halfBadgeWidth) - ((float) dimensionPixelSize)) - ((float) this.savedState.horizontalOffset) : (((float) rect.left) - this.halfBadgeWidth) + ((float) dimensionPixelSize) + ((float) this.savedState.horizontalOffset);
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return createFromAttributes(context, (AttributeSet) null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    @NonNull
    private static BadgeDrawable createFromAttributes(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.loadDefaultStateFromAttributes(context, attributeSet, i2, i3);
        return badgeDrawable;
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i2) {
        AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i2, "badge");
        int styleAttribute = parseDrawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = DEFAULT_STYLE;
        }
        return createFromAttributes(context, parseDrawableXml, DEFAULT_THEME_ATTR, styleAttribute);
    }

    @NonNull
    public static BadgeDrawable createFromSavedState(@NonNull Context context, @NonNull SavedState savedState2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.restoreFromSavedState(savedState2);
        return badgeDrawable;
    }

    private void drawText(Canvas canvas) {
        Rect rect = new Rect();
        String badgeText = getBadgeText();
        this.textDrawableHelper.getTextPaint().getTextBounds(badgeText, 0, badgeText.length(), rect);
        canvas.drawText(badgeText, this.badgeCenterX, this.badgeCenterY + ((float) (rect.height() / 2)), this.textDrawableHelper.getTextPaint());
    }

    @NonNull
    private String getBadgeText() {
        if (getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance().format((long) getNumber());
        }
        Context context = (Context) this.contextRef.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX});
    }

    private void loadDefaultStateFromAttributes(Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i2, i3, new int[0]);
        setMaxCharacterCount(obtainStyledAttributes.getInt(R.styleable.Badge_maxCharacterCount, 4));
        int i4 = R.styleable.Badge_number;
        if (obtainStyledAttributes.hasValue(i4)) {
            setNumber(obtainStyledAttributes.getInt(i4, 0));
        }
        setBackgroundColor(readColorFromAttributes(context, obtainStyledAttributes, R.styleable.Badge_backgroundColor));
        int i5 = R.styleable.Badge_badgeTextColor;
        if (obtainStyledAttributes.hasValue(i5)) {
            setBadgeTextColor(readColorFromAttributes(context, obtainStyledAttributes, i5));
        }
        setBadgeGravity(obtainStyledAttributes.getInt(R.styleable.Badge_badgeGravity, TOP_END));
        setHorizontalOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0));
        setVerticalOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0));
        obtainStyledAttributes.recycle();
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
        return MaterialResources.getColorStateList(context, typedArray, i2).getDefaultColor();
    }

    private void restoreFromSavedState(@NonNull SavedState savedState2) {
        setMaxCharacterCount(savedState2.maxCharacterCount);
        if (savedState2.number != -1) {
            setNumber(savedState2.number);
        }
        setBackgroundColor(savedState2.backgroundColor);
        setBadgeTextColor(savedState2.badgeTextColor);
        setBadgeGravity(savedState2.badgeGravity);
        setHorizontalOffset(savedState2.horizontalOffset);
        setVerticalOffset(savedState2.verticalOffset);
        setVisible(savedState2.isVisible);
    }

    private void setTextAppearance(@Nullable TextAppearance textAppearance) {
        Context context;
        if (this.textDrawableHelper.getTextAppearance() != textAppearance && (context = (Context) this.contextRef.get()) != null) {
            this.textDrawableHelper.setTextAppearance(textAppearance, context);
            updateCenterAndBounds();
        }
    }

    private void setTextAppearanceResource(@StyleRes int i2) {
        Context context = (Context) this.contextRef.get();
        if (context != null) {
            setTextAppearance(new TextAppearance(context, i2));
        }
    }

    private void tryWrapAnchorInCompatParent(final View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                final FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() {
                    public void run() {
                        BadgeDrawable.this.updateBadgeCoordinates(view, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = (Context) this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.badgeBounds);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || BadgeUtils.USE_COMPAT_PARENT) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            calculateCenterAndBounds(context, rect2, view);
            BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
            this.shapeDrawable.setCornerSize(this.cornerRadius);
            if (!rect.equals(this.badgeBounds)) {
                this.shapeDrawable.setBounds(this.badgeBounds);
            }
        }
    }

    private void updateMaxBadgeNumber() {
        this.maxBadgeNumber = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
    }

    public void clearNumber() {
        int unused = this.savedState.number = -1;
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.shapeDrawable.draw(canvas);
            if (hasNumber()) {
                drawText(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.savedState.alpha;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.savedState.badgeGravity;
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!hasNumber()) {
            return this.savedState.contentDescriptionNumberless;
        }
        if (this.savedState.contentDescriptionQuantityStrings <= 0 || (context = (Context) this.contextRef.get()) == null) {
            return null;
        }
        if (getNumber() <= this.maxBadgeNumber) {
            return context.getResources().getQuantityString(this.savedState.contentDescriptionQuantityStrings, getNumber(), new Object[]{Integer.valueOf(getNumber())});
        }
        return context.getString(this.savedState.contentDescriptionExceedsMaxBadgeNumberRes, new Object[]{Integer.valueOf(this.maxBadgeNumber)});
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.savedState.horizontalOffset;
    }

    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getMaxCharacterCount() {
        return this.savedState.maxCharacterCount;
    }

    public int getNumber() {
        if (!hasNumber()) {
            return 0;
        }
        return this.savedState.number;
    }

    public int getOpacity() {
        return -3;
    }

    @NonNull
    public SavedState getSavedState() {
        return this.savedState;
    }

    public int getVerticalOffset() {
        return this.savedState.verticalOffset;
    }

    public boolean hasNumber() {
        return this.savedState.number != -1;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAlpha(int i2) {
        int unused = this.savedState.alpha = i2;
        this.textDrawableHelper.getTextPaint().setAlpha(i2);
        invalidateSelf();
    }

    public void setBackgroundColor(@ColorInt int i2) {
        int unused = this.savedState.backgroundColor = i2;
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    public void setBadgeGravity(int i2) {
        if (this.savedState.badgeGravity != i2) {
            int unused = this.savedState.badgeGravity = i2;
            WeakReference<View> weakReference = this.anchorViewRef;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.anchorViewRef.get();
                WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
                updateBadgeCoordinates(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
    }

    public void setBadgeTextColor(@ColorInt int i2) {
        int unused = this.savedState.badgeTextColor = i2;
        if (this.textDrawableHelper.getTextPaint().getColor() != i2) {
            this.textDrawableHelper.getTextPaint().setColor(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i2) {
        int unused = this.savedState.contentDescriptionExceedsMaxBadgeNumberRes = i2;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        CharSequence unused = this.savedState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i2) {
        int unused = this.savedState.contentDescriptionQuantityStrings = i2;
    }

    public void setHorizontalOffset(int i2) {
        int unused = this.savedState.horizontalOffset = i2;
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i2) {
        if (this.savedState.maxCharacterCount != i2) {
            int unused = this.savedState.maxCharacterCount = i2;
            updateMaxBadgeNumber();
            this.textDrawableHelper.setTextWidthDirty(true);
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setNumber(int i2) {
        int max = Math.max(0, i2);
        if (this.savedState.number != max) {
            int unused = this.savedState.number = max;
            this.textDrawableHelper.setTextWidthDirty(true);
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setVerticalOffset(int i2) {
        int unused = this.savedState.verticalOffset = i2;
        updateCenterAndBounds();
    }

    public void setVisible(boolean z) {
        setVisible(z, false);
        boolean unused = this.savedState.isVisible = z;
        if (BadgeUtils.USE_COMPAT_PARENT && getCustomBadgeParent() != null && !z) {
            ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
        }
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        boolean z = BadgeUtils.USE_COMPAT_PARENT;
        if (!z || frameLayout != null) {
            this.customBadgeParentRef = new WeakReference<>(frameLayout);
        } else {
            tryWrapAnchorInCompatParent(view);
        }
        if (!z) {
            updateAnchorParentToNotClip(view);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }
}
