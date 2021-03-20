package b.l.a.c.c.m;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.d;

public final class d0 implements Parcelable.Creator<c0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        Bundle bundle = null;
        int i2 = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                bundle = a.J(parcel, readInt);
            } else if (i3 == 2) {
                dVarArr = (d[]) a.N(parcel, readInt, d.CREATOR);
            } else if (i3 != 3) {
                a.z0(parcel, readInt);
            } else {
                i2 = a.t0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new c0(bundle, dVarArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c0[i2];
    }
}
