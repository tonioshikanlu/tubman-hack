package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class gd implements Parcelable.Creator<fd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        sl slVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                slVar = (sl) a.K(parcel, readInt, sl.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new fd(str, slVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new fd[i2];
    }
}
