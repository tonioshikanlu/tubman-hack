package b.l.a.d.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class g0 implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4661b;

    public g0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f4661b = str;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4661b);
        return obtain;
    }

    public final void k(int i2, Parcel parcel) {
        try {
            this.a.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
