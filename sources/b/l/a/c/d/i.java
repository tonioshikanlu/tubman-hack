package b.l.a.c.d;

import android.os.RemoteException;
import b.l.a.c.d.a;
import b.l.a.c.h.b;
import b.l.a.c.h.g.d;
import java.util.Objects;

public final class i implements a.C0063a {
    public final /* synthetic */ a a;

    public i(a aVar) {
        this.a = aVar;
    }

    public final void a(c cVar) {
        b.a aVar = (b.a) this.a.a;
        Objects.requireNonNull(aVar);
        try {
            aVar.f3865b.onResume();
        } catch (RemoteException e2) {
            throw new d(e2);
        }
    }
}
