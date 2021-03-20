package b.l.a.c.h.g;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.d.b;
import com.google.android.gms.maps.model.LatLng;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new h();

    /* renamed from: h  reason: collision with root package name */
    public LatLng f3871h;

    /* renamed from: i  reason: collision with root package name */
    public String f3872i;

    /* renamed from: j  reason: collision with root package name */
    public String f3873j;

    /* renamed from: k  reason: collision with root package name */
    public a f3874k;

    /* renamed from: l  reason: collision with root package name */
    public float f3875l = 0.5f;

    /* renamed from: m  reason: collision with root package name */
    public float f3876m = 1.0f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3877n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3878o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3879p = false;

    /* renamed from: q  reason: collision with root package name */
    public float f3880q = 0.0f;
    public float r = 0.5f;
    public float s = 0.0f;
    public float t = 1.0f;
    public float u;

    public c() {
    }

    public c(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f3871h = latLng;
        this.f3872i = str;
        this.f3873j = str2;
        this.f3874k = iBinder == null ? null : new a(b.a.k(iBinder));
        this.f3875l = f;
        this.f3876m = f2;
        this.f3877n = z;
        this.f3878o = z2;
        this.f3879p = z3;
        this.f3880q = f3;
        this.r = f4;
        this.s = f5;
        this.t = f6;
        this.u = f7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 2, this.f3871h, i2, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3872i, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f3873j, false);
        a aVar = this.f3874k;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.a.asBinder();
        }
        b.l.a.c.b.a.H0(parcel, 5, iBinder, false);
        float f = this.f3875l;
        b.l.a.c.b.a.I1(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f3876m;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.f3877n;
        b.l.a.c.b.a.I1(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3878o;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f3879p;
        b.l.a.c.b.a.I1(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.f3880q;
        b.l.a.c.b.a.I1(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.r;
        b.l.a.c.b.a.I1(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.s;
        b.l.a.c.b.a.I1(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.t;
        b.l.a.c.b.a.I1(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.u;
        b.l.a.c.b.a.I1(parcel, 15, 4);
        parcel.writeFloat(f7);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
