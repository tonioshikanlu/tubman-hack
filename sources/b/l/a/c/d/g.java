package b.l.a.c.d;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import b.l.a.c.d.a;
import b.l.a.c.h.b;
import b.l.a.c.h.f.k;
import b.l.a.c.h.g.d;
import java.util.Objects;

public final class g implements a.C0063a {
    public final /* synthetic */ Bundle a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f2832b;

    public g(a aVar, Bundle bundle) {
        this.f2832b = aVar;
        this.a = bundle;
    }

    public final void a(c cVar) {
        T t = this.f2832b.a;
        Bundle bundle = this.a;
        b.a aVar = (b.a) t;
        Objects.requireNonNull(aVar);
        try {
            Bundle bundle2 = new Bundle();
            k.b(bundle, bundle2);
            aVar.f3865b.g1(bundle2);
            k.b(bundle2, bundle);
            aVar.c = (View) d.n(aVar.f3865b.o0());
            aVar.a.removeAllViews();
            aVar.a.addView(aVar.c);
        } catch (RemoteException e2) {
            throw new d(e2);
        }
    }
}
