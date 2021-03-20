package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class nk extends a {
    public static final Parcelable.Creator<nk> CREATOR = new ok();

    /* renamed from: h  reason: collision with root package name */
    public final List<lk> f3196h;

    public nk() {
        this.f3196h = new ArrayList();
    }

    public nk(List<lk> list) {
        this.f3196h = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.N0(parcel, 2, this.f3196h, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
