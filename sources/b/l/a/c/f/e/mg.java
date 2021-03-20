package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class mg implements ij<jl> {
    public final /* synthetic */ ei a;

    public mg(ei eiVar) {
        this.a = eiVar;
    }

    public final void a(Object obj) {
        ei eiVar = this.a;
        String str = ((jl) obj).f3095h;
        Objects.requireNonNull(eiVar);
        try {
            eiVar.a.n0(str);
        } catch (RemoteException e2) {
            a aVar = eiVar.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending set account info response.", new Object[0]), e2);
        }
    }

    public final void d(@Nullable String str) {
        this.a.f(b.l.a.c.b.a.T0(str));
    }
}
