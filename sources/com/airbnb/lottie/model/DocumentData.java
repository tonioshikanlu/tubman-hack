package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {
    public final float baselineShift;
    @ColorInt
    public final int color;
    public final String fontName;
    public final Justification justification;
    public final float lineHeight;
    public final float size;
    @ColorInt
    public final int strokeColor;
    public final boolean strokeOverFill;
    public final float strokeWidth;
    public final String text;
    public final int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification2, int i2, float f2, float f3, @ColorInt int i3, @ColorInt int i4, float f4, boolean z) {
        this.text = str;
        this.fontName = str2;
        this.size = f;
        this.justification = justification2;
        this.tracking = i2;
        this.lineHeight = f2;
        this.baselineShift = f3;
        this.color = i3;
        this.strokeColor = i4;
        this.strokeWidth = f4;
        this.strokeOverFill = z;
    }

    public int hashCode() {
        int hashCode = this.fontName.hashCode();
        int ordinal = ((this.justification.ordinal() + (((int) (((float) ((hashCode + (this.text.hashCode() * 31)) * 31)) + this.size)) * 31)) * 31) + this.tracking;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.lineHeight);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.color;
    }
}
