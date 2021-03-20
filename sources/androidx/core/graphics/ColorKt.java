package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u0002\u001a\u00020\n*\u00020\nH\n¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0014\u0010\u0004\u001a\u00020\n*\u00020\nH\n¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u0014\u0010\u0005\u001a\u00020\n*\u00020\nH\n¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u0014\u0010\u0006\u001a\u00020\n*\u00020\nH\n¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\nH\b¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\nH\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\n¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u000eH\n¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u000eH\n¢\u0006\u0004\b\u0005\u0010\u0011\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u000eH\n¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u000eH\b¢\u0006\u0004\b\f\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u000eH\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0019H\f¢\u0006\u0004\b\u0017\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0019H\f¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\f¢\u0006\u0004\b\u0017\u0010\u001d\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019H\f¢\u0006\u0004\b\u0017\u0010\u001e\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u001fH\b¢\u0006\u0004\b\u0013\u0010 \"\u0018\u0010\"\u001a\u00020!*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0018\u0010%\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010\u000b\"\u0018\u0010\u0016\u001a\u00020\u0019*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'\"\u0018\u0010*\u001a\u00020\u0001*\u00020\n8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0018\u0010*\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\u0011\"\u0018\u0010,\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u0011\"\u0018\u0010,\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u000b\"\u0018\u0010.\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u0011\"\u0018\u00100\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u0011\"\u0018\u0010.\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u000b\"\u0018\u00100\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u000b\"\u0018\u0010%\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010\u0011\"\u0018\u00101\u001a\u00020!*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010#¨\u00062"}, d2 = {"Landroid/graphics/Color;", "", "component1", "(Landroid/graphics/Color;)F", "component2", "component3", "component4", "c", "plus", "(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;", "", "(I)I", "toColor", "(I)Landroid/graphics/Color;", "", "toColorLong", "(I)J", "(J)F", "(J)Landroid/graphics/Color;", "toColorInt", "(J)I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "convertTo", "(ILandroid/graphics/ColorSpace$Named;)J", "Landroid/graphics/ColorSpace;", "(ILandroid/graphics/ColorSpace;)J", "(JLandroid/graphics/ColorSpace$Named;)J", "(JLandroid/graphics/ColorSpace;)J", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color;", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color;", "", "(Ljava/lang/String;)I", "", "isWideGamut", "(J)Z", "getRed", "red", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "getLuminance", "(I)F", "luminance", "getBlue", "blue", "getAlpha", "alpha", "getGreen", "green", "isSrgb", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ColorKt {
    @RequiresApi(26)
    public static final float component1(long j2) {
        return Color.red(j2);
    }

    @RequiresApi(26)
    public static final float component1(Color color) {
        i.f(color, "$this$component1");
        return color.getComponent(0);
    }

    public static final int component1(@ColorInt int i2) {
        return (i2 >> 24) & 255;
    }

    @RequiresApi(26)
    public static final float component2(long j2) {
        return Color.green(j2);
    }

    @RequiresApi(26)
    public static final float component2(Color color) {
        i.f(color, "$this$component2");
        return color.getComponent(1);
    }

    public static final int component2(@ColorInt int i2) {
        return (i2 >> 16) & 255;
    }

    @RequiresApi(26)
    public static final float component3(long j2) {
        return Color.blue(j2);
    }

    @RequiresApi(26)
    public static final float component3(Color color) {
        i.f(color, "$this$component3");
        return color.getComponent(2);
    }

    public static final int component3(@ColorInt int i2) {
        return (i2 >> 8) & 255;
    }

    @RequiresApi(26)
    public static final float component4(long j2) {
        return Color.alpha(j2);
    }

    @RequiresApi(26)
    public static final float component4(Color color) {
        i.f(color, "$this$component4");
        return color.getComponent(3);
    }

    public static final int component4(@ColorInt int i2) {
        return i2 & 255;
    }

    @RequiresApi(26)
    public static final long convertTo(@ColorInt int i2, ColorSpace.Named named) {
        i.f(named, "colorSpace");
        return Color.convert(i2, ColorSpace.get(named));
    }

    @RequiresApi(26)
    public static final long convertTo(@ColorInt int i2, ColorSpace colorSpace) {
        i.f(colorSpace, "colorSpace");
        return Color.convert(i2, colorSpace);
    }

    @RequiresApi(26)
    public static final long convertTo(long j2, ColorSpace.Named named) {
        i.f(named, "colorSpace");
        return Color.convert(j2, ColorSpace.get(named));
    }

    @RequiresApi(26)
    public static final long convertTo(long j2, ColorSpace colorSpace) {
        i.f(colorSpace, "colorSpace");
        return Color.convert(j2, colorSpace);
    }

    @RequiresApi(26)
    public static final Color convertTo(Color color, ColorSpace.Named named) {
        i.f(color, "$this$convertTo");
        i.f(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        i.b(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @RequiresApi(26)
    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        i.f(color, "$this$convertTo");
        i.f(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        i.b(convert, "convert(colorSpace)");
        return convert;
    }

    @RequiresApi(26)
    public static final float getAlpha(long j2) {
        return Color.alpha(j2);
    }

    public static final int getAlpha(@ColorInt int i2) {
        return (i2 >> 24) & 255;
    }

    @RequiresApi(26)
    public static final float getBlue(long j2) {
        return Color.blue(j2);
    }

    public static final int getBlue(@ColorInt int i2) {
        return i2 & 255;
    }

    @RequiresApi(26)
    public static final ColorSpace getColorSpace(long j2) {
        ColorSpace colorSpace = Color.colorSpace(j2);
        i.b(colorSpace, "Color.colorSpace(this)");
        return colorSpace;
    }

    @RequiresApi(26)
    public static final float getGreen(long j2) {
        return Color.green(j2);
    }

    public static final int getGreen(@ColorInt int i2) {
        return (i2 >> 8) & 255;
    }

    @RequiresApi(26)
    public static final float getLuminance(@ColorInt int i2) {
        return Color.luminance(i2);
    }

    @RequiresApi(26)
    public static final float getLuminance(long j2) {
        return Color.luminance(j2);
    }

    @RequiresApi(26)
    public static final float getRed(long j2) {
        return Color.red(j2);
    }

    public static final int getRed(@ColorInt int i2) {
        return (i2 >> 16) & 255;
    }

    @RequiresApi(26)
    public static final boolean isSrgb(long j2) {
        return Color.isSrgb(j2);
    }

    @RequiresApi(26)
    public static final boolean isWideGamut(long j2) {
        return Color.isWideGamut(j2);
    }

    @RequiresApi(26)
    public static final Color plus(Color color, Color color2) {
        i.f(color, "$this$plus");
        i.f(color2, "c");
        Color compositeColors = ColorUtils.compositeColors(color2, color);
        i.b(compositeColors, "ColorUtils.compositeColors(c, this)");
        return compositeColors;
    }

    @RequiresApi(26)
    public static final Color toColor(@ColorInt int i2) {
        Color valueOf = Color.valueOf(i2);
        i.b(valueOf, "Color.valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    public static final Color toColor(long j2) {
        Color valueOf = Color.valueOf(j2);
        i.b(valueOf, "Color.valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    @ColorInt
    public static final int toColorInt(long j2) {
        return Color.toArgb(j2);
    }

    @ColorInt
    public static final int toColorInt(String str) {
        i.f(str, "$this$toColorInt");
        return Color.parseColor(str);
    }

    @RequiresApi(26)
    public static final long toColorLong(@ColorInt int i2) {
        return Color.pack(i2);
    }
}
