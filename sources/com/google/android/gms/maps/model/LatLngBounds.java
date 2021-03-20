package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import b.l.a.c.h.g.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new f();

    /* renamed from: h  reason: collision with root package name */
    public final LatLng f7316h;

    /* renamed from: i  reason: collision with root package name */
    public final LatLng f7317i;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        b.l.a.c.b.a.B(latLng, "null southwest");
        b.l.a.c.b.a.B(latLng2, "null northeast");
        double d = latLng2.f7314h;
        double d2 = latLng.f7314h;
        b.l.a.c.b.a.n(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f7314h));
        this.f7316h = latLng;
        this.f7317i = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f7316h.equals(latLngBounds.f7316h) && this.f7317i.equals(latLngBounds.f7317i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7316h, this.f7317i});
    }

    public final String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("southwest", this.f7316h);
        rVar.a("northeast", this.f7317i);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 2, this.f7316h, i2, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f7317i, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
