package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class gg implements ij<qk> {
    public final /* synthetic */ ei a;

    public gg(ei eiVar) {
        this.a = eiVar;
    }

    public final void a(Object obj) {
        qk qkVar = (qk) obj;
        ei eiVar = this.a;
        Objects.requireNonNull(eiVar);
        try {
            eiVar.a.h();
        } catch (RemoteException e2) {
            a aVar = eiVar.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending email verification response.", new Object[0]), e2);
        }
    }

    public final void d(String str) {
        this.a.f(b.l.a.c.b.a.T0(str));
    }
}
