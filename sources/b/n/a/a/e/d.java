package b.n.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.i.a.f;
import b.i.a.h;
import b.i.a.i;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d extends h<InputStream> {
    public int d(@NonNull Object obj) {
        return ((InputStream) obj).available();
    }

    public f e(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        try {
            return new i().h((InputStream) obj, true);
        } catch (h e2) {
            throw new i(e2);
        }
    }
}
