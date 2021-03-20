package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class le extends a {
    public static final Parcelable.Creator<le> CREATOR = new me();

    /* renamed from: h  reason: collision with root package name */
    public final String f3121h;

    public le(String str) {
        this.f3121h = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3121h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
