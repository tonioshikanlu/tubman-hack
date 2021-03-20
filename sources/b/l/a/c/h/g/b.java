package b.l.a.c.h.g;

import android.os.RemoteException;
import b.l.a.c.f.h.g;
import java.util.Objects;

public final class b {
    public final g a;

    public b(g gVar) {
        Objects.requireNonNull(gVar, "null reference");
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        try {
            return this.a.P(((b) obj).a);
        } catch (RemoteException e2) {
            throw new d(e2);
        }
    }

    public final int hashCode() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            throw new d(e2);
        }
    }
}
