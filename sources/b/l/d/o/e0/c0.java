package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.v.c;
import java.util.Map;

public final class c0 implements c {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: h  reason: collision with root package name */
    public final String f4953h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4954i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Object> f4955j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4956k;

    public c0(String str, String str2, boolean z) {
        a.x(str);
        a.x(str2);
        this.f4953h = str;
        this.f4954i = str2;
        this.f4955j = o.b(str2);
        this.f4956k = z;
    }

    public c0(boolean z) {
        this.f4956k = z;
        this.f4954i = null;
        this.f4953h = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f4953h, false);
        a.K0(parcel, 2, this.f4954i, false);
        boolean z = this.f4956k;
        a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        a.H1(parcel, P0);
    }
}
