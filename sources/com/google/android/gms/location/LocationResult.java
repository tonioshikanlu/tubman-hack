package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new e();

    /* renamed from: i  reason: collision with root package name */
    public static final List<Location> f7298i = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<Location> f7299h;

    public LocationResult(List<Location> list) {
        this.f7299h = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f7299h.size() != this.f7299h.size()) {
            return false;
        }
        Iterator<Location> it = this.f7299h.iterator();
        for (Location time : locationResult.f7299h) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 17;
        for (Location time : this.f7299h) {
            long time2 = time.getTime();
            i2 = (i2 * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7299h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.N0(parcel, 1, this.f7299h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
