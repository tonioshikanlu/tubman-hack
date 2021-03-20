package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.Parcel;

public abstract class sb extends r implements tb {
    public sb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        ((r9) this).Z((Bundle) o0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
