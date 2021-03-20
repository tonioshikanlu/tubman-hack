package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public String f3911h;

    /* renamed from: i  reason: collision with root package name */
    public String f3912i;

    /* renamed from: j  reason: collision with root package name */
    public g9 f3913j;

    /* renamed from: k  reason: collision with root package name */
    public long f3914k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3915l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f3916m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final s f3917n;

    /* renamed from: o  reason: collision with root package name */
    public long f3918o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    public s f3919p;

    /* renamed from: q  reason: collision with root package name */
    public final long f3920q;
    @Nullable
    public final s r;

    public b(b bVar) {
        this.f3911h = bVar.f3911h;
        this.f3912i = bVar.f3912i;
        this.f3913j = bVar.f3913j;
        this.f3914k = bVar.f3914k;
        this.f3915l = bVar.f3915l;
        this.f3916m = bVar.f3916m;
        this.f3917n = bVar.f3917n;
        this.f3918o = bVar.f3918o;
        this.f3919p = bVar.f3919p;
        this.f3920q = bVar.f3920q;
        this.r = bVar.r;
    }

    public b(@Nullable String str, String str2, g9 g9Var, long j2, boolean z, @Nullable String str3, @Nullable s sVar, long j3, @Nullable s sVar2, long j4, @Nullable s sVar3) {
        this.f3911h = str;
        this.f3912i = str2;
        this.f3913j = g9Var;
        this.f3914k = j2;
        this.f3915l = z;
        this.f3916m = str3;
        this.f3917n = sVar;
        this.f3918o = j3;
        this.f3919p = sVar2;
        this.f3920q = j4;
        this.r = sVar3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f3911h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3912i, false);
        b.l.a.c.b.a.J0(parcel, 4, this.f3913j, i2, false);
        long j2 = this.f3914k;
        b.l.a.c.b.a.I1(parcel, 5, 8);
        parcel.writeLong(j2);
        boolean z = this.f3915l;
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 7, this.f3916m, false);
        b.l.a.c.b.a.J0(parcel, 8, this.f3917n, i2, false);
        long j3 = this.f3918o;
        b.l.a.c.b.a.I1(parcel, 9, 8);
        parcel.writeLong(j3);
        b.l.a.c.b.a.J0(parcel, 10, this.f3919p, i2, false);
        long j4 = this.f3920q;
        b.l.a.c.b.a.I1(parcel, 11, 8);
        parcel.writeLong(j4);
        b.l.a.c.b.a.J0(parcel, 12, this.r, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
