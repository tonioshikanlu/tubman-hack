package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class md implements Parcelable.Creator<ld> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        b.l.d.o.a aVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                aVar = (b.l.d.o.a) a.K(parcel, readInt, b.l.d.o.a.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new ld(str, aVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new ld[i2];
    }
}
