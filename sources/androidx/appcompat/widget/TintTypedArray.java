package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TintTypedArray {
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i2, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean getBoolean(int i2, boolean z) {
        return this.mWrapped.getBoolean(i2, z);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return this.mWrapped.getChangingConfigurations();
    }

    public int getColor(int i2, int i3) {
        return this.mWrapped.getColor(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r2.mContext, (r0 = r2.mWrapped.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList getColorStateList(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.mContext
            android.content.res.ColorStateList r0 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.TintTypedArray.getColorStateList(int):android.content.res.ColorStateList");
    }

    public float getDimension(int i2, float f) {
        return this.mWrapped.getDimension(i2, f);
    }

    public int getDimensionPixelOffset(int i2, int i3) {
        return this.mWrapped.getDimensionPixelOffset(i2, i3);
    }

    public int getDimensionPixelSize(int i2, int i3) {
        return this.mWrapped.getDimensionPixelSize(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.mWrapped.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getDrawable(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.mWrapped
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.mWrapped
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.mContext
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.mWrapped
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.TintTypedArray.getDrawable(int):android.graphics.drawable.Drawable");
    }

    public Drawable getDrawableIfKnown(int i2) {
        int resourceId;
        if (!this.mWrapped.hasValue(i2) || (resourceId = this.mWrapped.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
    }

    public float getFloat(int i2, float f) {
        return this.mWrapped.getFloat(i2, f);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int i2, int i3, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.mWrapped.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, i3, fontCallback);
    }

    public float getFraction(int i2, int i3, int i4, float f) {
        return this.mWrapped.getFraction(i2, i3, i4, f);
    }

    public int getIndex(int i2) {
        return this.mWrapped.getIndex(i2);
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getInt(int i2, int i3) {
        return this.mWrapped.getInt(i2, i3);
    }

    public int getInteger(int i2, int i3) {
        return this.mWrapped.getInteger(i2, i3);
    }

    public int getLayoutDimension(int i2, int i3) {
        return this.mWrapped.getLayoutDimension(i2, i3);
    }

    public int getLayoutDimension(int i2, String str) {
        return this.mWrapped.getLayoutDimension(i2, str);
    }

    public String getNonResourceString(int i2) {
        return this.mWrapped.getNonResourceString(i2);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public int getResourceId(int i2, int i3) {
        return this.mWrapped.getResourceId(i2, i3);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public String getString(int i2) {
        return this.mWrapped.getString(i2);
    }

    public CharSequence getText(int i2) {
        return this.mWrapped.getText(i2);
    }

    public CharSequence[] getTextArray(int i2) {
        return this.mWrapped.getTextArray(i2);
    }

    public int getType(int i2) {
        return this.mWrapped.getType(i2);
    }

    public boolean getValue(int i2, TypedValue typedValue) {
        return this.mWrapped.getValue(i2, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }

    public boolean hasValue(int i2) {
        return this.mWrapped.hasValue(i2);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public TypedValue peekValue(int i2) {
        return this.mWrapped.peekValue(i2);
    }

    public void recycle() {
        this.mWrapped.recycle();
    }
}
