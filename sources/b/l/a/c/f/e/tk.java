package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class tk implements Parcelable.Creator<sk> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        Long l3 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 4) {
                l2 = a.v0(parcel, readInt);
            } else if (i2 == 5) {
                str3 = a.L(parcel, readInt);
            } else if (i2 != 6) {
                a.z0(parcel, readInt);
            } else {
                l3 = a.v0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new sk(str, str2, l2, str3, l3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new sk[i2];
    }
}
