package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class ld extends a {
    public static final Parcelable.Creator<ld> CREATOR = new md();

    /* renamed from: h  reason: collision with root package name */
    public final String f3119h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final b.l.d.o.a f3120i;

    public ld(String str, @Nullable b.l.d.o.a aVar) {
        this.f3119h = str;
        this.f3120i = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3119h, false);
        b.l.a.c.b.a.J0(parcel, 2, this.f3120i, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
