package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import java.util.Objects;

public final class dg implements ij<Void> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ eg f2916b;

    public dg(eg egVar, ij ijVar) {
        this.f2916b = egVar;
        this.a = ijVar;
    }

    public final void a(Object obj) {
        Void voidR = (Void) obj;
        ei eiVar = this.f2916b.a;
        Objects.requireNonNull(eiVar);
        try {
            eiVar.a.f();
        } catch (RemoteException e2) {
            a aVar = eiVar.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending delete account response.", new Object[0]), e2);
        }
    }

    public final void d(@Nullable String str) {
        this.a.d(str);
    }
}
