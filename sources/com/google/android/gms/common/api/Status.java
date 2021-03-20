package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.l.h;
import b.l.a.c.c.l.m;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends a implements h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new m();

    /* renamed from: l  reason: collision with root package name */
    public static final Status f7258l = new Status(0);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f7259m = new Status(8);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f7260n = new Status(15);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f7261o = new Status(16);

    /* renamed from: h  reason: collision with root package name */
    public final int f7262h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7263i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f7264j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final PendingIntent f7265k;

    public Status(int i2) {
        this(1, i2, (String) null, (PendingIntent) null);
    }

    public Status(int i2, int i3, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.f7262h = i2;
        this.f7263i = i3;
        this.f7264j = str;
        this.f7265k = pendingIntent;
    }

    public Status(int i2, @Nullable String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public final boolean V() {
        return this.f7263i <= 0;
    }

    public final String W() {
        String str = this.f7264j;
        return str != null ? str : b.l.a.c.b.a.Z(this.f7263i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7262h == status.f7262h && this.f7263i == status.f7263i && b.l.a.c.b.a.T(this.f7264j, status.f7264j) && b.l.a.c.b.a.T(this.f7265k, status.f7265k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7262h), Integer.valueOf(this.f7263i), this.f7264j, this.f7265k});
    }

    public final String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("statusCode", W());
        rVar.a("resolution", this.f7265k);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f7263i;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.K0(parcel, 2, this.f7264j, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f7265k, i2, false);
        int i4 = this.f7262h;
        b.l.a.c.b.a.I1(parcel, 1000, 4);
        parcel.writeInt(i4);
        b.l.a.c.b.a.H1(parcel, P0);
    }

    public final Status y() {
        return this;
    }
}
