package b.l.a.c.c.m;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.b;
import b.l.a.c.c.m.n;
import b.l.a.c.c.m.v.a;

public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new b0();

    /* renamed from: h  reason: collision with root package name */
    public final int f2811h;

    /* renamed from: i  reason: collision with root package name */
    public IBinder f2812i;

    /* renamed from: j  reason: collision with root package name */
    public b f2813j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2814k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2815l;

    public t(int i2, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.f2811h = i2;
        this.f2812i = iBinder;
        this.f2813j = bVar;
        this.f2814k = z;
        this.f2815l = z2;
    }

    public n V() {
        return n.a.k(this.f2812i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2813j.equals(tVar.f2813j) && V().equals(tVar.V());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2811h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.H0(parcel, 2, this.f2812i, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f2813j, i2, false);
        boolean z = this.f2814k;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f2815l;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
