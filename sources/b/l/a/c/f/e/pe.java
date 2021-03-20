package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.c0;

public final class pe extends a {
    public static final Parcelable.Creator<pe> CREATOR = new qe();

    /* renamed from: h  reason: collision with root package name */
    public final c0 f3227h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3228i;

    public pe(c0 c0Var, String str) {
        this.f3227h = c0Var;
        this.f3228i = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3227h, i2, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3228i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
