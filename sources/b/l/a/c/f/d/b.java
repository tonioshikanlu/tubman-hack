package b.l.a.c.f.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2838b;

    public b(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f2838b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2838b);
        return obtain;
    }

    public final Parcel k(int i2, Parcel parcel) {
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
