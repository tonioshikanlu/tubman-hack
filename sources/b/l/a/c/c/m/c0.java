package b.l.a.c.c.m;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.d;
import b.l.a.c.c.m.v.a;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: h  reason: collision with root package name */
    public Bundle f2767h;

    /* renamed from: i  reason: collision with root package name */
    public d[] f2768i;

    /* renamed from: j  reason: collision with root package name */
    public int f2769j;

    public c0() {
    }

    public c0(Bundle bundle, d[] dVarArr, int i2) {
        this.f2767h = bundle;
        this.f2768i = dVarArr;
        this.f2769j = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.F0(parcel, 1, this.f2767h, false);
        b.l.a.c.b.a.M0(parcel, 2, this.f2768i, i2, false);
        int i3 = this.f2769j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
