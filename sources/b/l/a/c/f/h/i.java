package b.l.a.c.f.h;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;

public final class i extends a implements g {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final boolean P(g gVar) {
        Parcel g2 = g();
        c.a(g2, gVar);
        Parcel k2 = k(16, g2);
        boolean z = k2.readInt() != 0;
        k2.recycle();
        return z;
    }

    public final void W(b bVar) {
        Parcel g2 = g();
        c.a(g2, bVar);
        n(29, g2);
    }

    public final void W0(b bVar) {
        Parcel g2 = g();
        c.a(g2, bVar);
        n(18, g2);
    }

    public final int h() {
        Parcel k2 = k(17, g());
        int readInt = k2.readInt();
        k2.recycle();
        return readInt;
    }

    public final b j() {
        Parcel k2 = k(30, g());
        b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }
}
