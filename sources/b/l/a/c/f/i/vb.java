package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.Parcel;

public abstract class vb extends r implements wb {
    public vb() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            ((w) this).b0(parcel.readString(), parcel.readString(), (Bundle) o0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int e2 = ((w) this).e();
            parcel2.writeNoException();
            parcel2.writeInt(e2);
        }
        return true;
    }
}
