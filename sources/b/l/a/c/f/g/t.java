package b.l.a.c.f.g;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.n;
import b.l.a.c.g.o;
import b.l.a.c.g.p;
import b.l.a.c.g.q;
import b.l.a.c.g.r;
import b.l.a.c.g.s;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: h  reason: collision with root package name */
    public int f3469h;

    /* renamed from: i  reason: collision with root package name */
    public r f3470i;

    /* renamed from: j  reason: collision with root package name */
    public q f3471j;

    /* renamed from: k  reason: collision with root package name */
    public PendingIntent f3472k;

    /* renamed from: l  reason: collision with root package name */
    public n f3473l;

    /* renamed from: m  reason: collision with root package name */
    public f f3474m;

    public t(int i2, r rVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        q qVar;
        n nVar;
        this.f3469h = i2;
        this.f3470i = rVar;
        f fVar = null;
        if (iBinder == null) {
            qVar = null;
        } else {
            int i3 = r.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qVar = queryLocalInterface instanceof q ? (q) queryLocalInterface : new s(iBinder);
        }
        this.f3471j = qVar;
        this.f3472k = pendingIntent;
        if (iBinder2 == null) {
            nVar = null;
        } else {
            int i4 = o.a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            nVar = queryLocalInterface2 instanceof n ? (n) queryLocalInterface2 : new p(iBinder2);
        }
        this.f3473l = nVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface3 instanceof f ? (f) queryLocalInterface3 : new h(iBinder3);
        }
        this.f3474m = fVar;
    }

    public static t V(q qVar, @Nullable f fVar) {
        return new t(2, (r) null, (q) qVar, (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f3469h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 2, this.f3470i, i2, false);
        q qVar = this.f3471j;
        IBinder iBinder = null;
        b.l.a.c.b.a.H0(parcel, 3, qVar == null ? null : qVar.asBinder(), false);
        b.l.a.c.b.a.J0(parcel, 4, this.f3472k, i2, false);
        n nVar = this.f3473l;
        b.l.a.c.b.a.H0(parcel, 5, nVar == null ? null : nVar.asBinder(), false);
        f fVar = this.f3474m;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        b.l.a.c.b.a.H0(parcel, 6, iBinder, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
