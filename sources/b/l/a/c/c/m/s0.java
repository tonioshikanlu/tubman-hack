package b.l.a.c.c.m;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

@Deprecated
public final class s0 extends a {
    public static final Parcelable.Creator<s0> CREATOR = new r0();

    /* renamed from: h  reason: collision with root package name */
    public final int f2810h;

    public s0(int i2) {
        this.f2810h = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2810h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
