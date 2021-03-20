package b.l.a.c.f.h;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.d.b;

public final class f extends a implements d {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final b T0(Bitmap bitmap) {
        Parcel g2 = g();
        c.b(g2, bitmap);
        Parcel k2 = k(6, g2);
        b k3 = b.a.k(k2.readStrongBinder());
        k2.recycle();
        return k3;
    }
}
