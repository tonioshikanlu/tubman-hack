package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import b.l.a.c.h.h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new h();

    /* renamed from: h  reason: collision with root package name */
    public Boolean f7300h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f7301i;

    /* renamed from: j  reason: collision with root package name */
    public int f7302j = -1;

    /* renamed from: k  reason: collision with root package name */
    public CameraPosition f7303k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f7304l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f7305m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f7306n;

    /* renamed from: o  reason: collision with root package name */
    public Boolean f7307o;

    /* renamed from: p  reason: collision with root package name */
    public Boolean f7308p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f7309q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public Float u = null;
    public Float v = null;
    public LatLngBounds w = null;
    public Boolean x;

    public GoogleMapOptions(byte b2, byte b3, int i2, CameraPosition cameraPosition, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, Float f, Float f2, LatLngBounds latLngBounds, byte b13) {
        this.f7300h = b.l.a.c.b.a.X0(b2);
        this.f7301i = b.l.a.c.b.a.X0(b3);
        this.f7302j = i2;
        this.f7303k = cameraPosition;
        this.f7304l = b.l.a.c.b.a.X0(b4);
        this.f7305m = b.l.a.c.b.a.X0(b5);
        this.f7306n = b.l.a.c.b.a.X0(b6);
        this.f7307o = b.l.a.c.b.a.X0(b7);
        this.f7308p = b.l.a.c.b.a.X0(b8);
        this.f7309q = b.l.a.c.b.a.X0(b9);
        this.r = b.l.a.c.b.a.X0(b10);
        this.s = b.l.a.c.b.a.X0(b11);
        this.t = b.l.a.c.b.a.X0(b12);
        this.u = f;
        this.v = f2;
        this.w = latLngBounds;
        this.x = b.l.a.c.b.a.X0(b13);
    }

    public final String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("MapType", Integer.valueOf(this.f7302j));
        rVar.a("LiteMode", this.r);
        rVar.a("Camera", this.f7303k);
        rVar.a("CompassEnabled", this.f7305m);
        rVar.a("ZoomControlsEnabled", this.f7304l);
        rVar.a("ScrollGesturesEnabled", this.f7306n);
        rVar.a("ZoomGesturesEnabled", this.f7307o);
        rVar.a("TiltGesturesEnabled", this.f7308p);
        rVar.a("RotateGesturesEnabled", this.f7309q);
        rVar.a("ScrollGesturesEnabledDuringRotateOrZoom", this.x);
        rVar.a("MapToolbarEnabled", this.s);
        rVar.a("AmbientEnabled", this.t);
        rVar.a("MinZoomPreference", this.u);
        rVar.a("MaxZoomPreference", this.v);
        rVar.a("LatLngBoundsForCameraTarget", this.w);
        rVar.a("ZOrderOnTop", this.f7300h);
        rVar.a("UseViewLifecycleInFragment", this.f7301i);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        byte O0 = b.l.a.c.b.a.O0(this.f7300h);
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(O0);
        byte O02 = b.l.a.c.b.a.O0(this.f7301i);
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(O02);
        int i3 = this.f7302j;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 5, this.f7303k, i2, false);
        byte O03 = b.l.a.c.b.a.O0(this.f7304l);
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeInt(O03);
        byte O04 = b.l.a.c.b.a.O0(this.f7305m);
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeInt(O04);
        byte O05 = b.l.a.c.b.a.O0(this.f7306n);
        b.l.a.c.b.a.I1(parcel, 8, 4);
        parcel.writeInt(O05);
        byte O06 = b.l.a.c.b.a.O0(this.f7307o);
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(O06);
        byte O07 = b.l.a.c.b.a.O0(this.f7308p);
        b.l.a.c.b.a.I1(parcel, 10, 4);
        parcel.writeInt(O07);
        byte O08 = b.l.a.c.b.a.O0(this.f7309q);
        b.l.a.c.b.a.I1(parcel, 11, 4);
        parcel.writeInt(O08);
        byte O09 = b.l.a.c.b.a.O0(this.r);
        b.l.a.c.b.a.I1(parcel, 12, 4);
        parcel.writeInt(O09);
        byte O010 = b.l.a.c.b.a.O0(this.s);
        b.l.a.c.b.a.I1(parcel, 14, 4);
        parcel.writeInt(O010);
        byte O011 = b.l.a.c.b.a.O0(this.t);
        b.l.a.c.b.a.I1(parcel, 15, 4);
        parcel.writeInt(O011);
        b.l.a.c.b.a.G0(parcel, 16, this.u, false);
        b.l.a.c.b.a.G0(parcel, 17, this.v, false);
        b.l.a.c.b.a.J0(parcel, 18, this.w, i2, false);
        byte O012 = b.l.a.c.b.a.O0(this.x);
        b.l.a.c.b.a.I1(parcel, 19, 4);
        parcel.writeInt(O012);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
