package b.h.a.m.x.c;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.c;
import b.h.a.m.t;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import b.h.a.s.j;

public abstract class f implements t<Bitmap> {
    @NonNull
    public final w<Bitmap> a(@NonNull Context context, @NonNull w<Bitmap> wVar, int i2, int i3) {
        if (j.j(i2, i3)) {
            d dVar = c.b(context).f467h;
            Bitmap bitmap = wVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap c = c(dVar, bitmap, i2, i3);
            return bitmap.equals(c) ? wVar : e.c(c, dVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(@NonNull d dVar, @NonNull Bitmap bitmap, int i2, int i3);
}
