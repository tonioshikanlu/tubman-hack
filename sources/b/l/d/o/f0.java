package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class f0 implements Parcelable.Creator<s> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                str2 = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new s(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
