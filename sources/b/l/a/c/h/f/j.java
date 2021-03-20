package b.l.a.c.h.f;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.f.h.a;
import b.l.a.c.f.h.c;

public final class j extends a implements d {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    public final void Y(boolean z) {
        Parcel g2 = g();
        int i2 = c.a;
        g2.writeInt(z ? 1 : 0);
        n(8, g2);
    }
}
