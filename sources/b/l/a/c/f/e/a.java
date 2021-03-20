package b.l.a.c.f.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2839b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f2839b = str;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void g(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void k(int i2, Parcel parcel) {
        try {
            this.a.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2839b);
        return obtain;
    }
}
