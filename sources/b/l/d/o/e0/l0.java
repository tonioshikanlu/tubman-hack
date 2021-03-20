package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.v.c;

public final class l0 implements c {
    public static final Parcelable.Creator<l0> CREATOR = new c();

    /* renamed from: h  reason: collision with root package name */
    public final long f4992h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4993i;

    public l0(long j2, long j3) {
        this.f4992h = j2;
        this.f4993i = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        long j2 = this.f4992h;
        a.I1(parcel, 1, 8);
        parcel.writeLong(j2);
        long j3 = this.f4993i;
        a.I1(parcel, 2, 8);
        parcel.writeLong(j3);
        a.H1(parcel, P0);
    }
}
