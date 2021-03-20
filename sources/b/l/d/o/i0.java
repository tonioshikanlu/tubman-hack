package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class i0 implements Parcelable.Creator<z> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new z(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new z[i2];
    }
}
