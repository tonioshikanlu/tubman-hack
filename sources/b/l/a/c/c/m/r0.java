package b.l.a.c.c.m;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class r0 implements Parcelable.Creator<s0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                i2 = a.t0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new s0(i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s0[i2];
    }
}
