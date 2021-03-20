package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.x;

public final class wc implements Parcelable.Creator<vc> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        x xVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                xVar = (x) a.K(parcel, readInt, x.CREATOR);
            } else if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                str2 = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new vc(xVar, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new vc[i2];
    }
}
