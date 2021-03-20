package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.x;

public final class xc extends a {
    public static final Parcelable.Creator<xc> CREATOR = new yc();

    /* renamed from: h  reason: collision with root package name */
    public final x f3397h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3398i;

    public xc(x xVar, String str) {
        this.f3397h = xVar;
        this.f3398i = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3397h, i2, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3398i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
