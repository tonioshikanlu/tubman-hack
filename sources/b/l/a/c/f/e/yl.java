package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class yl implements Parcelable.Creator<wl> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 4) {
                j2 = a.u0(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                z = a.n0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new wl(str, str2, j2, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new wl[i2];
    }
}
