package b.l.a.c.h.f;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.h.a;
import b.l.a.c.f.h.c;
import b.l.a.c.f.h.g;
import b.l.a.c.f.h.h;

public final class o extends a implements b {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.h.f.d N() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.g()
            r1 = 25
            android.os.Parcel r0 = r4.k(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof b.l.a.c.h.f.d
            if (r3 == 0) goto L_0x0020
            r1 = r2
            b.l.a.c.h.f.d r1 = (b.l.a.c.h.f.d) r1
            goto L_0x0026
        L_0x0020:
            b.l.a.c.h.f.j r2 = new b.l.a.c.h.f.j
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.h.f.o.N():b.l.a.c.h.f.d");
    }

    public final void P0(g gVar) {
        Parcel g2 = g();
        c.a(g2, gVar);
        n(30, g2);
    }

    public final g a1(b.l.a.c.h.g.c cVar) {
        Parcel g2 = g();
        c.b(g2, cVar);
        Parcel k2 = k(11, g2);
        g k3 = h.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final void p(int i2) {
        Parcel g2 = g();
        g2.writeInt(i2);
        n(16, g2);
    }

    public final void r0(b bVar) {
        Parcel g2 = g();
        c.a(g2, bVar);
        n(4, g2);
    }
}
