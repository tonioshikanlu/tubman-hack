package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class gc extends a {
    public static final Parcelable.Creator<gc> CREATOR = new hc();

    /* renamed from: h  reason: collision with root package name */
    public final String f3014h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f3015i;

    public gc(String str, @Nullable String str2) {
        this.f3014h = str;
        this.f3015i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3014h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3015i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
