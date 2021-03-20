package b.l.a.c.c;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class d0 implements Parcelable.Creator<a0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = a.s0(parcel, readInt);
            } else if (i2 == 3) {
                z = a.n0(parcel, readInt);
            } else if (i2 != 4) {
                a.z0(parcel, readInt);
            } else {
                z2 = a.n0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new a0(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new a0[i2];
    }
}
