package b.l.a.c.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class j implements Parcelable.Creator<i> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        boolean z = true;
        long j2 = 50;
        float f = 0.0f;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = a.n0(parcel2, readInt);
            } else if (i3 == 2) {
                j2 = a.u0(parcel2, readInt);
            } else if (i3 == 3) {
                f = a.q0(parcel2, readInt);
            } else if (i3 == 4) {
                j3 = a.u0(parcel2, readInt);
            } else if (i3 != 5) {
                a.z0(parcel2, readInt);
            } else {
                i2 = a.t0(parcel2, readInt);
            }
        }
        a.S(parcel2, C0);
        return new i(z, j2, f, j3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new i[i2];
    }
}
