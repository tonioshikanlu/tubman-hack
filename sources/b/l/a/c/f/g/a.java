package b.l.a.c.f.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3450b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f3450b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3450b);
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
