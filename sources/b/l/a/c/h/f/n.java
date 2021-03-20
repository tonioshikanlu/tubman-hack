package b.l.a.c.h.f;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.h.a;
import b.l.a.c.f.h.c;

public final class n extends a implements m {
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.h.f.a e() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.g()
            r1 = 4
            android.os.Parcel r0 = r4.k(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof b.l.a.c.h.f.a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            b.l.a.c.h.f.a r1 = (b.l.a.c.h.f.a) r1
            goto L_0x0025
        L_0x001f:
            b.l.a.c.h.f.i r2 = new b.l.a.c.h.f.i
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.h.f.n.e():b.l.a.c.h.f.a");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.f.h.d i() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.g()
            r1 = 5
            android.os.Parcel r0 = r4.k(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            int r2 = b.l.a.c.f.h.e.a
            if (r1 != 0) goto L_0x0013
            r1 = 0
            goto L_0x0027
        L_0x0013:
            java.lang.String r2 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof b.l.a.c.f.h.d
            if (r3 == 0) goto L_0x0021
            r1 = r2
            b.l.a.c.f.h.d r1 = (b.l.a.c.f.h.d) r1
            goto L_0x0027
        L_0x0021:
            b.l.a.c.f.h.f r2 = new b.l.a.c.f.h.f
            r2.<init>(r1)
            r1 = r2
        L_0x0027:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.h.f.n.i():b.l.a.c.f.h.d");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.h.f.c t0(b.l.a.c.d.b r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.g()
            b.l.a.c.f.h.c.a(r0, r3)
            b.l.a.c.f.h.c.b(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.k(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof b.l.a.c.h.f.c
            if (r1 == 0) goto L_0x0025
            r4 = r0
            b.l.a.c.h.f.c r4 = (b.l.a.c.h.f.c) r4
            goto L_0x002b
        L_0x0025:
            b.l.a.c.h.f.p r0 = new b.l.a.c.h.f.p
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.h.f.n.t0(b.l.a.c.d.b, com.google.android.gms.maps.GoogleMapOptions):b.l.a.c.h.f.c");
    }

    public final void x0(b bVar, int i2) {
        Parcel g2 = g();
        c.a(g2, bVar);
        g2.writeInt(i2);
        n(6, g2);
    }
}
