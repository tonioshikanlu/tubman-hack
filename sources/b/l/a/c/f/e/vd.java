package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class vd extends a {
    public static final Parcelable.Creator<vd> CREATOR = new wd();

    /* renamed from: h  reason: collision with root package name */
    public final sl f3353h;

    public vd(sl slVar) {
        this.f3353h = slVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3353h, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
