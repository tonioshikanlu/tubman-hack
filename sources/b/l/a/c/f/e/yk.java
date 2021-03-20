package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;

public final class yk extends a {
    public static final Parcelable.Creator<yk> CREATOR = new zk();

    /* renamed from: h  reason: collision with root package name */
    public String f3419h;

    /* renamed from: i  reason: collision with root package name */
    public String f3420i;

    /* renamed from: j  reason: collision with root package name */
    public String f3421j;

    /* renamed from: k  reason: collision with root package name */
    public String f3422k;

    /* renamed from: l  reason: collision with root package name */
    public String f3423l;

    /* renamed from: m  reason: collision with root package name */
    public String f3424m;

    /* renamed from: n  reason: collision with root package name */
    public String f3425n;

    public yk() {
    }

    public yk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f3419h = str;
        this.f3420i = str2;
        this.f3421j = str3;
        this.f3422k = str4;
        this.f3423l = str5;
        this.f3424m = str6;
        this.f3425n = str7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3419h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3420i, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f3421j, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f3422k, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f3423l, false);
        b.l.a.c.b.a.K0(parcel, 7, this.f3424m, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f3425n, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
