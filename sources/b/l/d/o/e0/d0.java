package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class d0 implements Parcelable.Creator<c0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                str2 = a.L(parcel, readInt);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                z = a.n0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new c0(str, str2, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new c0[i2];
    }
}
