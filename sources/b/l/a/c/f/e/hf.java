package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class hf implements ij<sk> {
    public final /* synthetic */ ei a;

    public hf(ei eiVar) {
        this.a = eiVar;
    }

    public final void a(Object obj) {
        sk skVar = (sk) obj;
        ei eiVar = this.a;
        Objects.requireNonNull(eiVar);
        try {
            eiVar.a.w0(skVar);
        } catch (RemoteException e2) {
            a aVar = eiVar.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending token result.", new Object[0]), e2);
        }
    }

    public final void d(@Nullable String str) {
        this.a.f(b.l.a.c.b.a.T0(str));
    }
}
