package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new d();

    /* renamed from: h  reason: collision with root package name */
    public int f7290h;

    /* renamed from: i  reason: collision with root package name */
    public long f7291i;

    /* renamed from: j  reason: collision with root package name */
    public long f7292j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7293k;

    /* renamed from: l  reason: collision with root package name */
    public long f7294l;

    /* renamed from: m  reason: collision with root package name */
    public int f7295m;

    /* renamed from: n  reason: collision with root package name */
    public float f7296n;

    /* renamed from: o  reason: collision with root package name */
    public long f7297o;

    public LocationRequest() {
        this.f7290h = 102;
        this.f7291i = 3600000;
        this.f7292j = 600000;
        this.f7293k = false;
        this.f7294l = RecyclerView.FOREVER_NS;
        this.f7295m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7296n = 0.0f;
        this.f7297o = 0;
    }

    public LocationRequest(int i2, long j2, long j3, boolean z, long j4, int i3, float f, long j5) {
        this.f7290h = i2;
        this.f7291i = j2;
        this.f7292j = j3;
        this.f7293k = z;
        this.f7294l = j4;
        this.f7295m = i3;
        this.f7296n = f;
        this.f7297o = j5;
    }

    public static void V(long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f7290h == locationRequest.f7290h) {
            long j2 = this.f7291i;
            long j3 = locationRequest.f7291i;
            if (j2 == j3 && this.f7292j == locationRequest.f7292j && this.f7293k == locationRequest.f7293k && this.f7294l == locationRequest.f7294l && this.f7295m == locationRequest.f7295m && this.f7296n == locationRequest.f7296n) {
                long j4 = this.f7297o;
                if (j4 >= j2) {
                    j2 = j4;
                }
                long j5 = locationRequest.f7297o;
                if (j5 >= j3) {
                    j3 = j5;
                }
                if (j2 == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7290h), Long.valueOf(this.f7291i), Float.valueOf(this.f7296n), Long.valueOf(this.f7297o)});
    }

    public final String toString() {
        StringBuilder y = b.e.a.a.a.y("Request[");
        int i2 = this.f7290h;
        y.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f7290h != 105) {
            y.append(" requested=");
            y.append(this.f7291i);
            y.append("ms");
        }
        y.append(" fastest=");
        y.append(this.f7292j);
        y.append("ms");
        if (this.f7297o > this.f7291i) {
            y.append(" maxWait=");
            y.append(this.f7297o);
            y.append("ms");
        }
        if (this.f7296n > 0.0f) {
            y.append(" smallestDisplacement=");
            y.append(this.f7296n);
            y.append("m");
        }
        long j2 = this.f7294l;
        if (j2 != RecyclerView.FOREVER_NS) {
            y.append(" expireIn=");
            y.append(j2 - SystemClock.elapsedRealtime());
            y.append("ms");
        }
        if (this.f7295m != Integer.MAX_VALUE) {
            y.append(" num=");
            y.append(this.f7295m);
        }
        y.append(']');
        return y.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f7290h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        long j2 = this.f7291i;
        b.l.a.c.b.a.I1(parcel, 2, 8);
        parcel.writeLong(j2);
        long j3 = this.f7292j;
        b.l.a.c.b.a.I1(parcel, 3, 8);
        parcel.writeLong(j3);
        boolean z = this.f7293k;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        long j4 = this.f7294l;
        b.l.a.c.b.a.I1(parcel, 5, 8);
        parcel.writeLong(j4);
        int i4 = this.f7295m;
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeInt(i4);
        float f = this.f7296n;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeFloat(f);
        long j5 = this.f7297o;
        b.l.a.c.b.a.I1(parcel, 8, 8);
        parcel.writeLong(j5);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
