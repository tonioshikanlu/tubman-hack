package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.f.e.sl;

public final class n0 extends w {
    public static final Parcelable.Creator<n0> CREATOR = new o0();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f5003h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f5004i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f5005j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final sl f5006k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final String f5007l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f5008m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final String f5009n;

    public n0(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable sl slVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f5003h = str;
        this.f5004i = str2;
        this.f5005j = str3;
        this.f5006k = slVar;
        this.f5007l = str4;
        this.f5008m = str5;
        this.f5009n = str6;
    }

    public static n0 W(@NonNull sl slVar) {
        a.B(slVar, "Must specify a non-null webSignInCredential");
        return new n0((String) null, (String) null, (String) null, slVar, (String) null, (String) null, (String) null);
    }

    public final c V() {
        return new n0(this.f5003h, this.f5004i, this.f5005j, this.f5006k, this.f5007l, this.f5008m, this.f5009n);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f5003h, false);
        a.K0(parcel, 2, this.f5004i, false);
        a.K0(parcel, 3, this.f5005j, false);
        a.J0(parcel, 4, this.f5006k, i2, false);
        a.K0(parcel, 5, this.f5007l, false);
        a.K0(parcel, 6, this.f5008m, false);
        a.K0(parcel, 7, this.f5009n, false);
        a.H1(parcel, P0);
    }
}
