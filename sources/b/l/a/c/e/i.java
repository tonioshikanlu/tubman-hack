package b.l.a.c.e;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.d.b;
import b.l.a.c.f.d.c;

public final class i extends b implements j {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final b.l.a.c.d.b R(b.l.a.c.d.b bVar, String str, int i2, b.l.a.c.d.b bVar2) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(i2);
        c.b(g2, bVar2);
        Parcel k2 = k(2, g2);
        b.l.a.c.d.b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final b.l.a.c.d.b V(b.l.a.c.d.b bVar, String str, int i2, b.l.a.c.d.b bVar2) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(i2);
        c.b(g2, bVar2);
        Parcel k2 = k(3, g2);
        b.l.a.c.d.b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }
}
