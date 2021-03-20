package b.l.a.c.f.g;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

public final class j extends a implements i {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final Location d(String str) {
        Parcel g2 = g();
        g2.writeString(str);
        g2 = Parcel.obtain();
        try {
            this.a.transact(21, g2, g2, 0);
            g2.readException();
            g2.recycle();
            return (Location) v.a(g2, Location.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            g2.recycle();
        }
    }

    public final void d1(a0 a0Var) {
        Parcel g2 = g();
        int i2 = v.a;
        g2.writeInt(1);
        a0Var.writeToParcel(g2, 0);
        k(75, g2);
    }

    public final void i0(boolean z) {
        Parcel g2 = g();
        int i2 = v.a;
        g2.writeInt(z ? 1 : 0);
        k(12, g2);
    }

    public final void q0(t tVar) {
        Parcel g2 = g();
        int i2 = v.a;
        g2.writeInt(1);
        tVar.writeToParcel(g2, 0);
        k(59, g2);
    }
}
