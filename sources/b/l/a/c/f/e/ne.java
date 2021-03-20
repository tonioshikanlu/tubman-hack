package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class ne extends a {
    public static final Parcelable.Creator<ne> CREATOR = new oe();

    /* renamed from: h  reason: collision with root package name */
    public final String f3189h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3190i;

    public ne(String str, String str2) {
        this.f3189h = str;
        this.f3190i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3189h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3190i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
