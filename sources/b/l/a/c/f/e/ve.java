package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.d.o.n0;
import java.util.List;

public final class ve extends a {
    public static final Parcelable.Creator<ve> CREATOR = new we();

    /* renamed from: h  reason: collision with root package name */
    public final String f3354h;

    /* renamed from: i  reason: collision with root package name */
    public final List<vk> f3355i;

    /* renamed from: j  reason: collision with root package name */
    public final n0 f3356j;

    public ve(String str, List<vk> list, @Nullable n0 n0Var) {
        this.f3354h = str;
        this.f3355i = list;
        this.f3356j = n0Var;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f3354h, false);
        b.l.a.c.b.a.N0(parcel, 2, this.f3355i, false);
        b.l.a.c.b.a.J0(parcel, 3, this.f3356j, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
