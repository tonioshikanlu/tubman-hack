package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class rb extends a implements tb {
    public rb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void Z(Bundle bundle) {
        Parcel g2 = g();
        o0.b(g2, bundle);
        k(1, g2);
    }
}
