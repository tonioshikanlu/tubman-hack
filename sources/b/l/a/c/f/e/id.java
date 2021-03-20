package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.x;

public final class id implements Parcelable.Creator<hd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        x xVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                xVar = (x) a.K(parcel, readInt, x.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new hd(str, xVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new hd[i2];
    }
}
