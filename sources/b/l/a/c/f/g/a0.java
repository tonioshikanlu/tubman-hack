package b.l.a.c.f.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.k;
import b.l.a.c.g.l;
import b.l.a.c.g.m;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: h  reason: collision with root package name */
    public int f3451h;

    /* renamed from: i  reason: collision with root package name */
    public y f3452i;

    /* renamed from: j  reason: collision with root package name */
    public k f3453j;

    /* renamed from: k  reason: collision with root package name */
    public f f3454k;

    public a0(int i2, y yVar, IBinder iBinder, IBinder iBinder2) {
        k kVar;
        this.f3451h = i2;
        this.f3452i = yVar;
        f fVar = null;
        if (iBinder == null) {
            kVar = null;
        } else {
            int i3 = l.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new m(iBinder);
        }
        this.f3453j = kVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface2 instanceof f ? (f) queryLocalInterface2 : new h(iBinder2);
        }
        this.f3454k = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f3451h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 2, this.f3452i, i2, false);
        k kVar = this.f3453j;
        IBinder iBinder = null;
        b.l.a.c.b.a.H0(parcel, 3, kVar == null ? null : kVar.asBinder(), false);
        f fVar = this.f3454k;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        b.l.a.c.b.a.H0(parcel, 4, iBinder, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
