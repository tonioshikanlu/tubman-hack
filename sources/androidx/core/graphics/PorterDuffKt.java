package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "toXfermode", "(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffXfermode;", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "toColorFilter", "(Landroid/graphics/PorterDuff$Mode;I)Landroid/graphics/PorterDuffColorFilter;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PorterDuffKt {
    public static final PorterDuffColorFilter toColorFilter(PorterDuff.Mode mode, int i2) {
        i.f(mode, "$this$toColorFilter");
        return new PorterDuffColorFilter(i2, mode);
    }

    public static final PorterDuffXfermode toXfermode(PorterDuff.Mode mode) {
        i.f(mode, "$this$toXfermode");
        return new PorterDuffXfermode(mode);
    }
}
