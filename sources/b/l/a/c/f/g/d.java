package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.api.Status;

public final class d extends a implements h {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: h  reason: collision with root package name */
    public final Status f3455h;

    public d(Status status) {
        this.f3455h = status;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3455h, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }

    public final Status y() {
        return this.f3455h;
    }
}
