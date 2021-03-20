package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class wd implements Parcelable.Creator<vd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        sl slVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                slVar = (sl) a.K(parcel, readInt, sl.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new vd(slVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new vd[i2];
    }
}
