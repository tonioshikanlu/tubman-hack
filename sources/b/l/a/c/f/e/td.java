package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class td extends a {
    public static final Parcelable.Creator<td> CREATOR = new ud();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f3312h;

    public td(@Nullable String str) {
        this.f3312h = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3312h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
