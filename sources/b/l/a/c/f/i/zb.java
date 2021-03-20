package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class zb extends a {
    public static final Parcelable.Creator<zb> CREATOR = new ac();

    /* renamed from: h  reason: collision with root package name */
    public final long f3845h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3846i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3847j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f3848k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f3849l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f3850m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f3851n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final String f3852o;

    public zb(long j2, long j3, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Bundle bundle, @Nullable String str4) {
        this.f3845h = j2;
        this.f3846i = j3;
        this.f3847j = z;
        this.f3848k = str;
        this.f3849l = str2;
        this.f3850m = str3;
        this.f3851n = bundle;
        this.f3852o = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        long j2 = this.f3845h;
        b.l.a.c.b.a.I1(parcel, 1, 8);
        parcel.writeLong(j2);
        long j3 = this.f3846i;
        b.l.a.c.b.a.I1(parcel, 2, 8);
        parcel.writeLong(j3);
        boolean z = this.f3847j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 4, this.f3848k, false);
        b.l.a.c.b.a.K0(parcel, 5, this.f3849l, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f3850m, false);
        b.l.a.c.b.a.F0(parcel, 7, this.f3851n, false);
        b.l.a.c.b.a.K0(parcel, 8, this.f3852o, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
