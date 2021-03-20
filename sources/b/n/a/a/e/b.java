package b.n.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.i.a.f;
import b.i.a.h;
import b.l.f.x.a.g;
import java.io.FileDescriptor;
import java.io.IOException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b extends h<FileDescriptor> {
    public int d(@NonNull Object obj) {
        return g.C((FileDescriptor) obj);
    }

    public f e(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        try {
            return g.G((FileDescriptor) obj);
        } catch (h | IOException e2) {
            throw new i(e2);
        }
    }
}
