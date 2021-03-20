package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import b.l.d.o.t;
import b.l.d.o.u;
import b.l.d.o.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class e extends u {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: h  reason: collision with root package name */
    public final List<y> f4957h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final g f4958i;

    /* renamed from: j  reason: collision with root package name */
    public final String f4959j;

    /* renamed from: k  reason: collision with root package name */
    public final n0 f4960k;

    /* renamed from: l  reason: collision with root package name */
    public final j0 f4961l;

    public e(List<y> list, g gVar, String str, @Nullable n0 n0Var, @Nullable j0 j0Var) {
        for (t next : list) {
            if (next instanceof y) {
                this.f4957h.add((y) next);
            }
        }
        Objects.requireNonNull(gVar, "null reference");
        this.f4958i = gVar;
        a.x(str);
        this.f4959j = str;
        this.f4960k = n0Var;
        this.f4961l = j0Var;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.N0(parcel, 1, this.f4957h, false);
        a.J0(parcel, 2, this.f4958i, i2, false);
        a.K0(parcel, 3, this.f4959j, false);
        a.J0(parcel, 4, this.f4960k, i2, false);
        a.J0(parcel, 5, this.f4961l, i2, false);
        a.H1(parcel, P0);
    }
}
