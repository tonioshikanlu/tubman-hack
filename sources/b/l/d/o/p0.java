package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class p0 implements Parcelable.Creator<d> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str3 = a.L(parcel, readInt);
            } else if (i2 == 4) {
                str4 = a.L(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                z = a.n0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new d(str, str2, str3, str4, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
