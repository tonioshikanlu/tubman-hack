package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.v.c;
import b.l.d.o.n0;
import java.util.List;

public final class e0 implements c {
    public static final Parcelable.Creator<e0> CREATOR = new f0();
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public j0 f4962h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public c0 f4963i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public n0 f4964j;

    public e0(j0 j0Var) {
        this.f4962h = j0Var;
        List<g0> list = j0Var.f4982l;
        this.f4963i = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!TextUtils.isEmpty(list.get(i2).f4975o)) {
                this.f4963i = new c0(list.get(i2).f4969i, list.get(i2).f4975o, j0Var.f4987q);
            }
        }
        if (this.f4963i == null) {
            this.f4963i = new c0(j0Var.f4987q);
        }
        this.f4964j = j0Var.r;
    }

    public e0(@NonNull j0 j0Var, @Nullable c0 c0Var, @Nullable n0 n0Var) {
        this.f4962h = j0Var;
        this.f4963i = c0Var;
        this.f4964j = n0Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.J0(parcel, 1, this.f4962h, i2, false);
        a.J0(parcel, 2, this.f4963i, i2, false);
        a.J0(parcel, 3, this.f4964j, i2, false);
        a.H1(parcel, P0);
    }
}
