package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class je extends a {
    public static final Parcelable.Creator<je> CREATOR = new ke();

    /* renamed from: h  reason: collision with root package name */
    public final String f3087h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3088i;

    public je(String str, String str2) {
        this.f3087h = str;
        this.f3088i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3087h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3088i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
