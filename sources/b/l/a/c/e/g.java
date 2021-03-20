package b.l.a.c.e;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.d.b;
import b.l.a.c.f.d.c;

public final class g extends b implements h {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Q0() {
        Parcel k2 = k(6, g());
        int readInt = k2.readInt();
        k2.recycle();
        return readInt;
    }

    public final int X(b.l.a.c.d.b bVar, String str, boolean z) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(z ? 1 : 0);
        Parcel k2 = k(3, g2);
        int readInt = k2.readInt();
        k2.recycle();
        return readInt;
    }

    public final b.l.a.c.d.b f0(b.l.a.c.d.b bVar, String str, int i2) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(i2);
        Parcel k2 = k(4, g2);
        b.l.a.c.d.b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final int q(b.l.a.c.d.b bVar, String str, boolean z) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(z ? 1 : 0);
        Parcel k2 = k(5, g2);
        int readInt = k2.readInt();
        k2.recycle();
        return readInt;
    }

    public final b.l.a.c.d.b y0(b.l.a.c.d.b bVar, String str, int i2) {
        Parcel g2 = g();
        c.b(g2, bVar);
        g2.writeString(str);
        g2.writeInt(i2);
        Parcel k2 = k(2, g2);
        b.l.a.c.d.b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }
}
