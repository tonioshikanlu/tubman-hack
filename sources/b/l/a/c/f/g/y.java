package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.c;
import b.l.a.c.c.m.v.a;
import b.l.a.c.g.i;
import java.util.Collections;
import java.util.List;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: k  reason: collision with root package name */
    public static final List<c> f3475k = Collections.emptyList();

    /* renamed from: l  reason: collision with root package name */
    public static final i f3476l = new i();

    /* renamed from: h  reason: collision with root package name */
    public i f3477h;

    /* renamed from: i  reason: collision with root package name */
    public List<c> f3478i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public String f3479j;

    public y(i iVar, List<c> list, String str) {
        this.f3477h = iVar;
        this.f3478i = list;
        this.f3479j = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return b.l.a.c.b.a.T(this.f3477h, yVar.f3477h) && b.l.a.c.b.a.T(this.f3478i, yVar.f3478i) && b.l.a.c.b.a.T(this.f3479j, yVar.f3479j);
    }

    public final int hashCode() {
        return this.f3477h.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3477h, i2, false);
        b.l.a.c.b.a.N0(parcel, 2, this.f3478i, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f3479j, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
