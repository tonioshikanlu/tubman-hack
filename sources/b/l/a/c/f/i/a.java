package b.l.a.c.f.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3481b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f3481b = str;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3481b);
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

    public final Parcel n(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
