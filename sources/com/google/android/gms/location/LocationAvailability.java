package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.c;
import b.l.a.c.g.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new c();
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public int f7285h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public int f7286i;

    /* renamed from: j  reason: collision with root package name */
    public long f7287j;

    /* renamed from: k  reason: collision with root package name */
    public int f7288k;

    /* renamed from: l  reason: collision with root package name */
    public g[] f7289l;

    public LocationAvailability(int i2, int i3, int i4, long j2, g[] gVarArr) {
        this.f7288k = i2;
        this.f7285h = i3;
        this.f7286i = i4;
        this.f7287j = j2;
        this.f7289l = gVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f7285h == locationAvailability.f7285h && this.f7286i == locationAvailability.f7286i && this.f7287j == locationAvailability.f7287j && this.f7288k == locationAvailability.f7288k && Arrays.equals(this.f7289l, locationAvailability.f7289l);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7288k), Integer.valueOf(this.f7285h), Integer.valueOf(this.f7286i), Long.valueOf(this.f7287j), this.f7289l});
    }

    public final String toString() {
        boolean z = this.f7288k < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f7285h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = this.f7286i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i4);
        long j2 = this.f7287j;
        b.l.a.c.b.a.I1(parcel, 3, 8);
        parcel.writeLong(j2);
        int i5 = this.f7288k;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(i5);
        b.l.a.c.b.a.M0(parcel, 5, this.f7289l, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
