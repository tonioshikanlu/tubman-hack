package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.x;

public final class de extends a {
    public static final Parcelable.Creator<de> CREATOR = new ee();

    /* renamed from: h  reason: collision with root package name */
    public final x f2911h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f2912i;

    public de(x xVar, @Nullable String str) {
        this.f2911h = xVar;
        this.f2912i = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f2911h, i2, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f2912i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
