package b.l.a.c.h.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.h.a;
import b.l.a.c.f.h.c;

public final class p extends a implements c {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final void g1(Bundle bundle) {
        Parcel g2 = g();
        c.b(g2, bundle);
        n(2, g2);
    }

    public final b o0() {
        Parcel k2 = k(8, g());
        b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final void onResume() {
        n(3, g());
    }

    public final void v0(e eVar) {
        Parcel g2 = g();
        c.a(g2, eVar);
        n(9, g2);
    }
}
