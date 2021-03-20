package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import b.l.a.c.h.g.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new e();

    /* renamed from: h  reason: collision with root package name */
    public final LatLng f7310h;

    /* renamed from: i  reason: collision with root package name */
    public final float f7311i;

    /* renamed from: j  reason: collision with root package name */
    public final float f7312j;

    /* renamed from: k  reason: collision with root package name */
    public final float f7313k;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        b.l.a.c.b.a.B(latLng, "null camera target");
        b.l.a.c.b.a.n(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f7310h = latLng;
        this.f7311i = f;
        this.f7312j = f2 + 0.0f;
        this.f7313k = (((double) f3) <= ShadowDrawableWrapper.COS_45 ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f7310h.equals(cameraPosition.f7310h) && Float.floatToIntBits(this.f7311i) == Float.floatToIntBits(cameraPosition.f7311i) && Float.floatToIntBits(this.f7312j) == Float.floatToIntBits(cameraPosition.f7312j) && Float.floatToIntBits(this.f7313k) == Float.floatToIntBits(cameraPosition.f7313k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7310h, Float.valueOf(this.f7311i), Float.valueOf(this.f7312j), Float.valueOf(this.f7313k)});
    }

    public final String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("target", this.f7310h);
        rVar.a("zoom", Float.valueOf(this.f7311i));
        rVar.a("tilt", Float.valueOf(this.f7312j));
        rVar.a("bearing", Float.valueOf(this.f7313k));
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 2, this.f7310h, i2, false);
        float f = this.f7311i;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeFloat(f);
        float f2 = this.f7312j;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeFloat(f2);
        float f3 = this.f7313k;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeFloat(f3);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
