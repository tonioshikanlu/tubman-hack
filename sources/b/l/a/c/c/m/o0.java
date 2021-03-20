package b.l.a.c.c.m;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.c.a0;
import b.l.a.c.f.d.b;
import b.l.a.c.f.d.c;

public final class o0 extends b implements n0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean F0(a0 a0Var, b.l.a.c.d.b bVar) {
        Parcel g2 = g();
        int i2 = c.a;
        boolean z = true;
        g2.writeInt(1);
        a0Var.writeToParcel(g2, 0);
        c.b(g2, bVar);
        Parcel k2 = k(5, g2);
        if (k2.readInt() == 0) {
            z = false;
        }
        k2.recycle();
        return z;
    }
}
