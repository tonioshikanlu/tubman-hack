package b.l.a.c.c.m;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.d.b;

public final class k0 extends b implements j0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final b.l.a.c.d.b b() {
        Parcel k2 = k(1, g());
        b.l.a.c.d.b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final int c() {
        Parcel k2 = k(2, g());
        int readInt = k2.readInt();
        k2.recycle();
        return readInt;
    }
}
