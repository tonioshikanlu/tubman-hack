package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.n0;
import com.google.android.gms.common.api.Status;

public final class te extends a {
    public static final Parcelable.Creator<te> CREATOR = new ue();

    /* renamed from: h  reason: collision with root package name */
    public final Status f3313h;

    /* renamed from: i  reason: collision with root package name */
    public final n0 f3314i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3315j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3316k;

    public te(Status status, n0 n0Var, String str, @Nullable String str2) {
        this.f3313h = status;
        this.f3314i = n0Var;
        this.f3315j = str;
        this.f3316k = str2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3313h, i2, false);
        b.l.a.c.b.a.J0(parcel, 2, this.f3314i, i2, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3315j, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f3316k, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
