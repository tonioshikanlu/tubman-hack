package b.l.a.c.c;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import java.util.Arrays;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new s();

    /* renamed from: h  reason: collision with root package name */
    public final String f2594h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public final int f2595i;

    /* renamed from: j  reason: collision with root package name */
    public final long f2596j;

    public d(String str, int i2, long j2) {
        this.f2594h = str;
        this.f2595i = i2;
        this.f2596j = j2;
    }

    public d(String str, long j2) {
        this.f2594h = str;
        this.f2596j = j2;
        this.f2595i = -1;
    }

    public long V() {
        long j2 = this.f2596j;
        return j2 == -1 ? (long) this.f2595i : j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f2594h;
            if (((str == null || !str.equals(dVar.f2594h)) && (this.f2594h != null || dVar.f2594h != null)) || V() != dVar.V()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2594h, Long.valueOf(V())});
    }

    public String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("name", this.f2594h);
        rVar.a("version", Long.valueOf(V()));
        return rVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2594h, false);
        int i3 = this.f2595i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i3);
        long V = V();
        b.l.a.c.b.a.I1(parcel, 3, 8);
        parcel.writeLong(V);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
