package b.l.a.c.c.m;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.f.d.b;
import b.l.a.c.f.d.c;

public final class l0 extends b implements o {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void k1(int i2, IBinder iBinder, Bundle bundle) {
        Parcel g2 = g();
        g2.writeInt(i2);
        g2.writeStrongBinder(iBinder);
        int i3 = c.a;
        g2.writeInt(0);
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(1, g2, obtain, 0);
            obtain.readException();
        } finally {
            g2.recycle();
            obtain.recycle();
        }
    }
}
