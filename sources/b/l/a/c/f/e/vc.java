package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.x;

public final class vc extends a {
    public static final Parcelable.Creator<vc> CREATOR = new wc();

    /* renamed from: h  reason: collision with root package name */
    public final x f3350h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3351i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3352j;

    public vc(x xVar, String str, String str2) {
        this.f3350h = xVar;
        this.f3351i = str;
        this.f3352j = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3350h, i2, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3351i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3352j, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
