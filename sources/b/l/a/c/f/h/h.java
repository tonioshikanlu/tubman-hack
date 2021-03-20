package b.l.a.c.f.h;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h extends b implements g {
    public static g k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new i(iBinder);
    }
}
