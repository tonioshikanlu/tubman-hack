package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.n0;

public final class f0 implements Parcelable.Creator<e0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        j0 j0Var = null;
        c0 c0Var = null;
        n0 n0Var = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                j0Var = (j0) a.K(parcel, readInt, j0.CREATOR);
            } else if (i2 == 2) {
                c0Var = (c0) a.K(parcel, readInt, c0.CREATOR);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                n0Var = (n0) a.K(parcel, readInt, n0.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new e0(j0Var, c0Var, n0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new e0[i2];
    }
}
