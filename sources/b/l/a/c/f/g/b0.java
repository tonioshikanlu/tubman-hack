package b.l.a.c.f.g;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class b0 implements Parcelable.Creator<a0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        y yVar = null;
        int i2 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 == 2) {
                yVar = (y) a.K(parcel, readInt, y.CREATOR);
            } else if (i3 == 3) {
                iBinder = a.s0(parcel, readInt);
            } else if (i3 != 4) {
                a.z0(parcel, readInt);
            } else {
                iBinder2 = a.s0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new a0(i2, yVar, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new a0[i2];
    }
}
