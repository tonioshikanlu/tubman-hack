package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class ic extends a {
    public static final Parcelable.Creator<ic> CREATOR = new jc();

    /* renamed from: h  reason: collision with root package name */
    public final String f3067h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3068i;

    public ic(String str, String str2) {
        this.f3067h = str;
        this.f3068i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3067h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3068i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
