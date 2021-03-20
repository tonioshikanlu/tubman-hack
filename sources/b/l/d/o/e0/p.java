package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.y;
import java.util.ArrayList;
import java.util.List;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: h  reason: collision with root package name */
    public final List<y> f4994h;

    public p(List<y> list) {
        this.f4994h = list == null ? new ArrayList<>() : list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.N0(parcel, 1, this.f4994h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
