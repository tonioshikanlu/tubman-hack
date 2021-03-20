package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b\u001a.\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\n¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a>\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\b¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\n¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u001e\u001a\u00020!H\n¢\u0006\u0004\b\u001f\u0010\"¨\u0006#"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Le/r;", "block", "applyCanvas", "(Landroid/graphics/Bitmap;Le/x/b/l;)Landroid/graphics/Bitmap;", "", "x", "y", "get", "(Landroid/graphics/Bitmap;II)I", "color", "set", "(Landroid/graphics/Bitmap;III)V", "width", "height", "", "filter", "scale", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "config", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;", "Landroid/graphics/Point;", "p", "contains", "(Landroid/graphics/Bitmap;Landroid/graphics/Point;)Z", "Landroid/graphics/PointF;", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;)Z", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, l<? super Canvas, r> lVar) {
        i.f(bitmap, "$this$applyCanvas");
        i.f(lVar, "block");
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r3 = r3.y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean contains(android.graphics.Bitmap r2, android.graphics.Point r3) {
        /*
            java.lang.String r0 = "$this$contains"
            e.x.c.i.f(r2, r0)
            java.lang.String r0 = "p"
            e.x.c.i.f(r3, r0)
            int r0 = r3.x
            if (r0 < 0) goto L_0x0020
            int r1 = r2.getWidth()
            if (r0 >= r1) goto L_0x0020
            int r3 = r3.y
            if (r3 < 0) goto L_0x0020
            int r2 = r2.getHeight()
            if (r3 >= r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.BitmapKt.contains(android.graphics.Bitmap, android.graphics.Point):boolean");
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        i.f(bitmap, "$this$contains");
        i.f(pointF, "p");
        float f = pointF.x;
        float f2 = (float) 0;
        if (f < f2 || f >= ((float) bitmap.getWidth())) {
            return false;
        }
        float f3 = pointF.y;
        return f3 >= f2 && f3 < ((float) bitmap.getHeight());
    }

    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config) {
        i.f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        i.b(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    @RequiresApi(26)
    public static final Bitmap createBitmap(int i2, int i3, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        i.f(config, "config");
        i.f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config, z, colorSpace);
        i.b(createBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        i.f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        i.b(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i2, int i3, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            i.b(colorSpace, "ColorSpace.get(ColorSpace.Named.SRGB)");
        }
        i.f(config, "config");
        i.f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config, z, colorSpace);
        i.b(createBitmap, "Bitmap.createBitmap(widt…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static final int get(Bitmap bitmap, int i2, int i3) {
        i.f(bitmap, "$this$get");
        return bitmap.getPixel(i2, i3);
    }

    public static final Bitmap scale(Bitmap bitmap, int i2, int i3, boolean z) {
        i.f(bitmap, "$this$scale");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, z);
        i.b(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z = true;
        }
        i.f(bitmap, "$this$scale");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, z);
        i.b(createScaledBitmap, "Bitmap.createScaledBitma…s, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void set(Bitmap bitmap, int i2, int i3, @ColorInt int i4) {
        i.f(bitmap, "$this$set");
        bitmap.setPixel(i2, i3, i4);
    }
}
