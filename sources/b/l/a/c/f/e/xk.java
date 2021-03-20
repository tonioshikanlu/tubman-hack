package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class xk implements Parcelable.Creator<vk> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str3 = a.L(parcel, readInt);
            } else if (i2 != 4) {
                a.z0(parcel, readInt);
            } else {
                j2 = a.u0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new vk(str, str2, str3, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new vk[i2];
    }
}
