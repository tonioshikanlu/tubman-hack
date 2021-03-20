package b.l.a.c.j.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.b;
import b.l.a.c.c.m.t;
import b.l.a.c.c.m.v.a;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: h  reason: collision with root package name */
    public final int f4413h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4414i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final t f4415j;

    public l() {
        b bVar = new b(8, (PendingIntent) null);
        this.f4413h = 1;
        this.f4414i = bVar;
        this.f4415j = null;
    }

    public l(int i2, b bVar, @Nullable t tVar) {
        this.f4413h = i2;
        this.f4414i = bVar;
        this.f4415j = tVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f4413h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 2, this.f4414i, i2, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f4415j, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
