package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class kk implements Parcelable.Creator<jk> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        nk nkVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                a.z0(parcel, readInt);
            } else {
                nkVar = (nk) a.K(parcel, readInt, nk.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new jk(nkVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new jk[i2];
    }
}
