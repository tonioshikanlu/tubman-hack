package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class fd extends a {
    public static final Parcelable.Creator<fd> CREATOR = new gd();

    /* renamed from: h  reason: collision with root package name */
    public final String f2959h;

    /* renamed from: i  reason: collision with root package name */
    public final sl f2960i;

    public fd(String str, sl slVar) {
        this.f2959h = str;
        this.f2960i = slVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2959h, false);
        b.l.a.c.b.a.J0(parcel, 2, this.f2960i, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
