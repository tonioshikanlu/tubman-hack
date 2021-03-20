package b.l.a.c.h.f;

import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;
import b.l.a.c.f.h.a;
import b.l.a.c.f.h.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class i extends a implements a {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final b N0(LatLng latLng, float f) {
        Parcel g2 = g();
        c.b(g2, latLng);
        g2.writeFloat(f);
        Parcel k2 = k(9, g2);
        b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }

    public final b v(LatLngBounds latLngBounds, int i2) {
        Parcel g2 = g();
        c.b(g2, latLngBounds);
        g2.writeInt(i2);
        Parcel k2 = k(10, g2);
        b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }
}
