package b.l.a.c.h;

import android.os.RemoteException;
import b.l.a.c.f.h.g;
import b.l.a.c.h.f.b;
import b.l.a.c.h.g.c;
import b.l.a.c.h.g.d;
import java.util.Objects;

public final class a {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public e f3863b;

    /* renamed from: b.l.a.c.h.a$a  reason: collision with other inner class name */
    public interface C0065a {
        boolean a(b.l.a.c.h.g.b bVar);
    }

    public a(b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        this.a = bVar;
    }

    public final b.l.a.c.h.g.b a(c cVar) {
        try {
            g a1 = this.a.a1(cVar);
            if (a1 != null) {
                return new b.l.a.c.h.g.b(a1);
            }
            return null;
        } catch (RemoteException e2) {
            throw new d(e2);
        }
    }
}
