package b.l.a.c.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import java.util.Arrays;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: h  reason: collision with root package name */
    public final int f3854h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3855i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3856j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3857k;

    public g(int i2, int i3, long j2, long j3) {
        this.f3854h = i2;
        this.f3855i = i3;
        this.f3856j = j2;
        this.f3857k = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            return this.f3854h == gVar.f3854h && this.f3855i == gVar.f3855i && this.f3856j == gVar.f3856j && this.f3857k == gVar.f3857k;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3855i), Integer.valueOf(this.f3854h), Long.valueOf(this.f3857k), Long.valueOf(this.f3856j)});
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f3854h + " Cell status: " + this.f3855i + " elapsed time NS: " + this.f3857k + " system time ms: " + this.f3856j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f3854h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = this.f3855i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i4);
        long j2 = this.f3856j;
        b.l.a.c.b.a.I1(parcel, 3, 8);
        parcel.writeLong(j2);
        long j3 = this.f3857k;
        b.l.a.c.b.a.I1(parcel, 4, 8);
        parcel.writeLong(j3);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
