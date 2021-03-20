package b.l.a.c.f.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class d implements b, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2835b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean A0(boolean z) {
        Parcel g2 = g();
        int i2 = a.a;
        boolean z2 = true;
        g2.writeInt(1);
        Parcel k2 = k(2, g2);
        if (k2.readInt() == 0) {
            z2 = false;
        }
        k2.recycle();
        return z2;
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final boolean c() {
        Parcel k2 = k(6, g());
        int i2 = a.a;
        boolean z = k2.readInt() != 0;
        k2.recycle();
        return z;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2835b);
        return obtain;
    }

    public final String getId() {
        Parcel k2 = k(1, g());
        String readString = k2.readString();
        k2.recycle();
        return readString;
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
