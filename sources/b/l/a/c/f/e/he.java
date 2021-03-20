package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.y;

public final class he extends a {
    public static final Parcelable.Creator<he> CREATOR = new ie();

    /* renamed from: h  reason: collision with root package name */
    public final y f3025h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3026i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3027j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3028k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3029l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3030m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f3031n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final String f3032o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3033p;

    public he(y yVar, String str, @Nullable String str2, long j2, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3) {
        this.f3025h = yVar;
        this.f3026i = str;
        this.f3027j = str2;
        this.f3028k = j2;
        this.f3029l = z;
        this.f3030m = z2;
        this.f3031n = str3;
        this.f3032o = str4;
        this.f3033p = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3025h, i2, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3026i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3027j, false);
        long j2 = this.f3028k;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j2);
        boolean z = this.f3029l;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3030m;
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 7, this.f3031n, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f3032o, false);
        boolean z3 = this.f3033p;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
