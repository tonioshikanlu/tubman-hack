package b.l.a.c.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.s;
import b.l.a.c.c.m.v.a;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: h  reason: collision with root package name */
    public final int f4411h;

    /* renamed from: i  reason: collision with root package name */
    public final s f4412i;

    public j(int i2, s sVar) {
        this.f4411h = i2;
        this.f4412i = sVar;
    }

    public j(s sVar) {
        this.f4411h = 1;
        this.f4412i = sVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f4411h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 2, this.f4412i, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
