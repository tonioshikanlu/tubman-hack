package androidx.core.util;

import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0006*\u00020\u0005H\n¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\n¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/util/Size;", "", "component1", "(Landroid/util/Size;)I", "component2", "Landroid/util/SizeF;", "", "(Landroid/util/SizeF;)F", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SizeKt {
    @RequiresApi(21)
    public static final float component1(SizeF sizeF) {
        i.f(sizeF, "$this$component1");
        return sizeF.getWidth();
    }

    @RequiresApi(21)
    public static final int component1(Size size) {
        i.f(size, "$this$component1");
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(SizeF sizeF) {
        i.f(sizeF, "$this$component2");
        return sizeF.getHeight();
    }

    @RequiresApi(21)
    public static final int component2(Size size) {
        i.f(size, "$this$component2");
        return size.getHeight();
    }
}
