package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class ef implements ij<yj> {
    public final /* synthetic */ ei a;

    public ef(ei eiVar) {
        this.a = eiVar;
    }

    public final void a(Object obj) {
        yj yjVar = (yj) obj;
        ei eiVar = this.a;
        Objects.requireNonNull(eiVar);
        try {
            eiVar.a.H(yjVar);
        } catch (RemoteException e2) {
            a aVar = eiVar.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending create auth uri response.", new Object[0]), e2);
        }
    }

    public final void d(@Nullable String str) {
        this.a.f(b.l.a.c.b.a.T0(str));
    }
}
