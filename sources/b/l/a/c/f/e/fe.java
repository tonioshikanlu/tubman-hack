package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class fe extends a {
    public static final Parcelable.Creator<fe> CREATOR = new ge();

    /* renamed from: h  reason: collision with root package name */
    public final String f2961h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2962i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f2963j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2964k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2965l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2966m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f2967n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final String f2968o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2969p;

    public fe(String str, String str2, @Nullable String str3, long j2, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, boolean z3) {
        this.f2961h = str;
        this.f2962i = str2;
        this.f2963j = str3;
        this.f2964k = j2;
        this.f2965l = z;
        this.f2966m = z2;
        this.f2967n = str4;
        this.f2968o = str5;
        this.f2969p = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2961h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f2962i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f2963j, false);
        long j2 = this.f2964k;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j2);
        boolean z = this.f2965l;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f2966m;
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 7, this.f2967n, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f2968o, false);
        boolean z3 = this.f2969p;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
