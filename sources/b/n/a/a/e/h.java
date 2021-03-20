package b.n.a.a.e;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.i.a.f;
import b.l.f.x.a.g;
import b.n.a.a.d;
import java.io.IOException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class h<T> implements r<T, f> {
    public static int[] c(@NonNull f fVar, int i2, int i3) {
        int[] iArr = {i2, i3};
        if (i2 == Integer.MIN_VALUE && i3 == Integer.MIN_VALUE) {
            iArr[0] = Math.round(fVar.d());
            iArr[1] = Math.round(fVar.c());
        } else if (i2 == Integer.MIN_VALUE) {
            iArr[0] = Math.round(fVar.a() * ((float) i3));
        } else if (i3 == Integer.MIN_VALUE) {
            iArr[1] = Math.round(((float) i2) / fVar.a());
        }
        return iArr;
    }

    @Nullable
    public w<f> a(@NonNull T t, int i2, int i3, @NonNull p pVar) {
        try {
            int d = d(t);
            f e2 = e(t, i2, i3, pVar);
            g.p(e2);
            int[] c = c(e2, i2, i3);
            return new d(e2, c[0], c[1], d);
        } catch (i e3) {
            throw new IOException("Cannot load SVG", e3);
        }
    }

    public boolean b(@NonNull T t, @NonNull p pVar) {
        return true;
    }

    @IntRange(from = 0)
    public abstract int d(@NonNull T t);

    public abstract f e(@NonNull T t, int i2, int i3, @NonNull p pVar);
}
