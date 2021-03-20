package b.l.a.c.j.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.l.a.c.c.m.n;
import b.l.a.c.f.c.a;
import b.l.a.c.f.c.b;

public final class h implements f, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4410b = "com.google.android.gms.signin.internal.ISignInService";

    public h(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void H0(n nVar, int i2, boolean z) {
        Parcel g2 = g();
        int i3 = b.a;
        g2.writeStrongBinder(nVar == null ? null : nVar.asBinder());
        g2.writeInt(i2);
        g2.writeInt(z ? 1 : 0);
        k(9, g2);
    }

    public final void U(int i2) {
        Parcel g2 = g();
        g2.writeInt(i2);
        k(7, g2);
    }

    public final void V0(j jVar, d dVar) {
        Parcel g2 = g();
        int i2 = b.a;
        g2.writeInt(1);
        jVar.writeToParcel(g2, 0);
        g2.writeStrongBinder((a) dVar);
        k(12, g2);
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4410b);
        return obtain;
    }

    public final void k(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
