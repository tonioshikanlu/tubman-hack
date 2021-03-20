package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.h.g.g;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new g();

    /* renamed from: h  reason: collision with root package name */
    public final double f7314h;

    /* renamed from: i  reason: collision with root package name */
    public final double f7315i;

    public LatLng(double d, double d2) {
        this.f7315i = (-180.0d > d2 || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.f7314h = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f7314h) == Double.doubleToLongBits(latLng.f7314h) && Double.doubleToLongBits(this.f7315i) == Double.doubleToLongBits(latLng.f7315i);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f7314h);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f7315i);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        double d = this.f7314h;
        double d2 = this.f7315i;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        double d = this.f7314h;
        b.l.a.c.b.a.I1(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f7315i;
        b.l.a.c.b.a.I1(parcel, 3, 8);
        parcel.writeDouble(d2);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
