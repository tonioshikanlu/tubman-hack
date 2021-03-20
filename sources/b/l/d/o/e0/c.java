package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class c implements Parcelable.Creator<l0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                j2 = a.u0(parcel, readInt);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                j3 = a.u0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new l0(j2, j3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new l0[i2];
    }
}
