package b.l.a.c.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class h implements Parcelable.Creator<g> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        long j2 = -1;
        long j3 = -1;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i4 == 2) {
                i3 = a.t0(parcel, readInt);
            } else if (i4 == 3) {
                j2 = a.u0(parcel, readInt);
            } else if (i4 != 4) {
                a.z0(parcel, readInt);
            } else {
                j3 = a.u0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new g(i2, i3, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new g[i2];
    }
}
