package b.n.a.a.e;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.h.a.m.p;
import b.i.a.f;
import b.i.a.h;
import b.l.f.x.a.g;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Objects;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e extends h<ParcelFileDescriptor> {
    public final b a = new b();

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        b bVar = this.a;
        ((ParcelFileDescriptor) obj).getFileDescriptor();
        Objects.requireNonNull(bVar);
        return true;
    }

    public int d(@NonNull Object obj) {
        return g.C(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    public f e(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        b bVar = this.a;
        FileDescriptor fileDescriptor = ((ParcelFileDescriptor) obj).getFileDescriptor();
        Objects.requireNonNull(bVar);
        try {
            return g.G(fileDescriptor);
        } catch (h | IOException e2) {
            throw new i(e2);
        }
    }
}
