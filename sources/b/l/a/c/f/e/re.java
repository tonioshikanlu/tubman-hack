package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class re extends a {
    public static final Parcelable.Creator<re> CREATOR = new se();

    /* renamed from: h  reason: collision with root package name */
    public final String f3253h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3254i;

    /* renamed from: j  reason: collision with root package name */
    public final b.l.d.o.a f3255j;

    public re(String str, String str2, b.l.d.o.a aVar) {
        this.f3253h = str;
        this.f3254i = str2;
        this.f3255j = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3253h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3254i, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f3255j, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
