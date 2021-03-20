package b.l.a.c.f.e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class p2 extends Binder implements IInterface {
    public p2(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    public boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }

    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        return g(i2, parcel, parcel2, i3);
    }
}
