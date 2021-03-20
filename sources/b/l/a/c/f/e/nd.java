package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public final class nd extends a {
    public static final Parcelable.Creator<nd> CREATOR = new od();

    /* renamed from: h  reason: collision with root package name */
    public final String f3186h;

    /* renamed from: i  reason: collision with root package name */
    public final b.l.d.o.a f3187i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3188j;

    public nd(String str, b.l.d.o.a aVar, @Nullable String str2) {
        this.f3186h = str;
        this.f3187i = aVar;
        this.f3188j = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3186h, false);
        b.l.a.c.b.a.J0(parcel, 2, this.f3187i, i2, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3188j, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
