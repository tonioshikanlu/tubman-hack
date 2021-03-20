package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class k0 implements Parcelable.Creator<c0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 4) {
                z = a.n0(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                z2 = a.n0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new c0(str, str2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new c0[i2];
    }
}
