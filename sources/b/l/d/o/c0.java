package b.l.d.o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.l.a.c.c.m.v.a;

public class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new k0();

    /* renamed from: h  reason: collision with root package name */
    public String f4941h;

    /* renamed from: i  reason: collision with root package name */
    public String f4942i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4943j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4944k;

    /* renamed from: l  reason: collision with root package name */
    public Uri f4945l;

    public c0(String str, String str2, boolean z, boolean z2) {
        this.f4941h = str;
        this.f4942i = str2;
        this.f4943j = z;
        this.f4944k = z2;
        this.f4945l = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 2, this.f4941h, false);
        b.l.a.c.b.a.K0(parcel, 3, this.f4942i, false);
        boolean z = this.f4943j;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f4944k;
        b.l.a.c.b.a.I1(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
