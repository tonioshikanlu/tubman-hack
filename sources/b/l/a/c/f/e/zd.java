package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class zd extends a {
    public static final Parcelable.Creator<zd> CREATOR = new ae();

    /* renamed from: h  reason: collision with root package name */
    public final String f3438h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3439i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3440j;

    public zd(String str, String str2, @Nullable String str3) {
        this.f3438h = str;
        this.f3439i = str2;
        this.f3440j = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3438h, false);
        b.l.a.c.b.a.K0(parcel, 2, this.f3439i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3440j, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
