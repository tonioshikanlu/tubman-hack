package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class od implements Parcelable.Creator<nd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        b.l.d.o.a aVar = null;
        String str2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                aVar = (b.l.d.o.a) a.K(parcel, readInt, b.l.d.o.a.CREATOR);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                str2 = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new nd(str, aVar, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new nd[i2];
    }
}
