package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.d;

public final class be extends a {
    public static final Parcelable.Creator<be> CREATOR = new ce();

    /* renamed from: h  reason: collision with root package name */
    public final d f2861h;

    public be(d dVar) {
        this.f2861h = dVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f2861h, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
