package b.l.a.c.c.m;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new w();

    /* renamed from: h  reason: collision with root package name */
    public final int f2765h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f2766i;

    public c(int i2, @Nullable String str) {
        this.f2765h = i2;
        this.f2766i = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            return cVar.f2765h == this.f2765h && b.l.a.c.b.a.T(cVar.f2766i, this.f2766i);
        }
    }

    public int hashCode() {
        return this.f2765h;
    }

    public String toString() {
        int i2 = this.f2765h;
        String str = this.f2766i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2765h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.K0(parcel, 2, this.f2766i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
