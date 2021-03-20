package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class bd extends a {
    public static final Parcelable.Creator<bd> CREATOR = new cd();

    /* renamed from: h  reason: collision with root package name */
    public final String f2859h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f2860i;

    public bd(String str, @Nullable String str2) {
        this.f2859h = str;
        this.f2860i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2859h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f2860i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
