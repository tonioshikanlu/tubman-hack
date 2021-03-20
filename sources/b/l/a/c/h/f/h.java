package b.l.a.c.h.f;

import android.os.Parcel;
import b.l.a.c.f.h.b;
import b.l.a.c.f.h.c;
import b.l.a.c.h.j;

public abstract class h extends b implements g {
    public h() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        boolean a = ((j) this).a.a(new b.l.a.c.h.g.b(b.l.a.c.f.h.h.k(parcel.readStrongBinder())));
        parcel2.writeNoException();
        int i4 = c.a;
        parcel2.writeInt(a ? 1 : 0);
        return true;
    }
}
