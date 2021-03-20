package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import java.util.List;

public final class p9 extends a {
    public static final Parcelable.Creator<p9> CREATOR = new q9();
    @Nullable
    public final List<String> A;
    @Nullable
    public final String B;
    public final String C;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f4218h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f4219i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f4220j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f4221k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4222l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4223m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f4224n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4225o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4226p;

    /* renamed from: q  reason: collision with root package name */
    public final long f4227q;
    @Nullable
    public final String r;
    public final long s;
    public final long t;
    public final int u;
    public final boolean v;
    public final boolean w;
    @Nullable
    public final String x;
    @Nullable
    public final Boolean y;
    public final long z;

    public p9(@Nullable String str, @Nullable String str2, @Nullable String str3, long j2, @Nullable String str4, long j3, long j4, @Nullable String str5, boolean z2, boolean z3, @Nullable String str6, long j5, long j6, int i2, boolean z4, boolean z5, @Nullable String str7, @Nullable Boolean bool, long j7, @Nullable List<String> list, @Nullable String str8, String str9) {
        b.l.a.c.b.a.x(str);
        this.f4218h = str;
        this.f4219i = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f4220j = str3;
        this.f4227q = j2;
        this.f4221k = str4;
        this.f4222l = j3;
        this.f4223m = j4;
        this.f4224n = str5;
        this.f4225o = z2;
        this.f4226p = z3;
        this.r = str6;
        this.s = j5;
        this.t = j6;
        this.u = i2;
        this.v = z4;
        this.w = z5;
        this.x = str7;
        this.y = bool;
        this.z = j7;
        this.A = list;
        this.B = str8;
        this.C = str9;
    }

    public p9(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z2, boolean z3, long j4, @Nullable String str6, long j5, long j6, int i2, boolean z4, boolean z5, @Nullable String str7, @Nullable Boolean bool, long j7, @Nullable List<String> list, @Nullable String str8, String str9) {
        this.f4218h = str;
        this.f4219i = str2;
        this.f4220j = str3;
        this.f4227q = j4;
        this.f4221k = str4;
        this.f4222l = j2;
        this.f4223m = j3;
        this.f4224n = str5;
        this.f4225o = z2;
        this.f4226p = z3;
        this.r = str6;
        this.s = j5;
        this.t = j6;
        this.u = i2;
        this.v = z4;
        this.w = z5;
        this.x = str7;
        this.y = bool;
        this.z = j7;
        this.A = list;
        this.B = str8;
        this.C = str9;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f4218h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f4219i, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f4220j, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f4221k, false);
        long j2 = this.f4222l;
        b.l.a.c.b.a.I1(parcel, 6, 8);
        parcel.writeLong(j2);
        long j3 = this.f4223m;
        b.l.a.c.b.a.I1(parcel, 7, 8);
        parcel.writeLong(j3);
        b.l.a.c.b.a.K0(parcel, 8, this.f4224n, false);
        boolean z2 = this.f4225o;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f4226p;
        b.l.a.c.b.a.I1(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        long j4 = this.f4227q;
        b.l.a.c.b.a.I1(parcel, 11, 8);
        parcel.writeLong(j4);
        b.l.a.c.b.a.K0(parcel, 12, this.r, false);
        long j5 = this.s;
        b.l.a.c.b.a.I1(parcel, 13, 8);
        parcel.writeLong(j5);
        long j6 = this.t;
        b.l.a.c.b.a.I1(parcel, 14, 8);
        parcel.writeLong(j6);
        int i3 = this.u;
        b.l.a.c.b.a.I1(parcel, 15, 4);
        parcel.writeInt(i3);
        boolean z4 = this.v;
        b.l.a.c.b.a.I1(parcel, 16, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.w;
        b.l.a.c.b.a.I1(parcel, 18, 4);
        parcel.writeInt(z5 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 19, this.x, false);
        b.l.a.c.b.a.E0(parcel, 21, this.y, false);
        long j7 = this.z;
        b.l.a.c.b.a.I1(parcel, 22, 8);
        parcel.writeLong(j7);
        b.l.a.c.b.a.L0(parcel, 23, this.A, false);
        b.l.a.c.b.a.K0(parcel, 24, this.B, false);
        b.l.a.c.b.a.K0(parcel, 25, this.C, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
