package b.l.a.c.f.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class d implements e, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2837b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void G(g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2837b);
        int i2 = c.a;
        obtain.writeStrongBinder((a) gVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
