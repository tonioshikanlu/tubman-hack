package b.n.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.i.a.f;
import b.i.a.h;
import b.i.a.i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class g extends h<String> {
    public int d(@NonNull Object obj) {
        try {
            return ((String) obj).getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e2) {
            throw new IOException(e2);
        }
    }

    public f e(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        try {
            return new i().h(new ByteArrayInputStream(((String) obj).getBytes()), true);
        } catch (h e2) {
            throw new i(e2);
        }
    }
}
