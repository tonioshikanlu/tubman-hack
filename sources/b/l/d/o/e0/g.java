package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.v;
import b.l.d.o.y;
import java.util.List;

public final class g extends v {
    public static final Parcelable.Creator<g> CREATOR = new h();
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public String f4965h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public String f4966i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public List<y> f4967j;

    public g() {
    }

    public g(String str, String str2, List<y> list) {
        this.f4965h = str;
        this.f4966i = str2;
        this.f4967j = list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f4965h, false);
        a.K0(parcel, 2, this.f4966i, false);
        a.N0(parcel, 3, this.f4967j, false);
        a.H1(parcel, P0);
    }
}
