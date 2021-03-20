package b.l.a.c.c;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class s implements Parcelable.Creator<d> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                str = a.L(parcel, readInt);
            } else if (i3 == 2) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 != 3) {
                a.z0(parcel, readInt);
            } else {
                j2 = a.u0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new d(str, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
