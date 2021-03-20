package b.l.a.c.g;

import android.location.Location;
import android.os.Parcel;
import b.l.a.c.f.g.n;
import b.l.a.c.f.g.o;
import b.l.a.c.f.g.q;
import b.l.a.c.f.g.v;

public abstract class r extends q implements q {
    public static final /* synthetic */ int a = 0;

    public r() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        Location location = (Location) v.a(parcel, Location.CREATOR);
        n nVar = (n) this;
        synchronized (nVar) {
            nVar.f3460b.a(new o(location));
        }
        return true;
    }
}
