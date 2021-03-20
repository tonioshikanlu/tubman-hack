package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.c;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: o  reason: collision with root package name */
    public static final List<c> f3461o = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public LocationRequest f3462h;

    /* renamed from: i  reason: collision with root package name */
    public List<c> f3463i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public String f3464j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3465k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3466l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3467m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public String f3468n;

    public r(LocationRequest locationRequest, List<c> list, @Nullable String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f3462h = locationRequest;
        this.f3463i = list;
        this.f3464j = str;
        this.f3465k = z;
        this.f3466l = z2;
        this.f3467m = z3;
        this.f3468n = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return b.l.a.c.b.a.T(this.f3462h, rVar.f3462h) && b.l.a.c.b.a.T(this.f3463i, rVar.f3463i) && b.l.a.c.b.a.T(this.f3464j, rVar.f3464j) && this.f3465k == rVar.f3465k && this.f3466l == rVar.f3466l && this.f3467m == rVar.f3467m && b.l.a.c.b.a.T(this.f3468n, rVar.f3468n);
    }

    public final int hashCode() {
        return this.f3462h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3462h);
        if (this.f3464j != null) {
            sb.append(" tag=");
            sb.append(this.f3464j);
        }
        if (this.f3468n != null) {
            sb.append(" moduleId=");
            sb.append(this.f3468n);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f3465k);
        sb.append(" clients=");
        sb.append(this.f3463i);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f3466l);
        if (this.f3467m) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.J0(parcel, 1, this.f3462h, i2, false);
        b.l.a.c.b.a.N0(parcel, 5, this.f3463i, false);
        b.l.a.c.b.a.K0(parcel, 6, this.f3464j, false);
        boolean z = this.f3465k;
        b.l.a.c.b.a.I1(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3466l;
        b.l.a.c.b.a.I1(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f3467m;
        b.l.a.c.b.a.I1(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        b.l.a.c.b.a.K0(parcel, 10, this.f3468n, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
