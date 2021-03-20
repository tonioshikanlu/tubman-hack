package b.l.a.c.f.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.l.b;
import b.l.a.c.k.i;
import com.google.android.gms.common.api.Status;

public class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z;
        if (i2 > 16777215) {
            z = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        f fVar = (f) this;
        if (i2 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i4 = c.a;
        Status status = (Status) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        i iVar = ((k) fVar).a;
        if (status.V()) {
            iVar.a.q(null);
        } else {
            iVar.a.p(new b(status));
        }
        return true;
    }
}
