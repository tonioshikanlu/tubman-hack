package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class dd extends a {
    public static final Parcelable.Creator<dd> CREATOR = new ed();

    /* renamed from: h  reason: collision with root package name */
    public final String f2908h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2909i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2910j;

    public dd(String str, String str2, String str3) {
        this.f2908h = str;
        this.f2909i = str2;
        this.f2910j = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2908h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f2909i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f2910j, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
