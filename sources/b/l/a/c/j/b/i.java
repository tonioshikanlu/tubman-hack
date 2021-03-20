package b.l.a.c.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.s;

public final class i implements Parcelable.Creator<j> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        int i2 = 0;
        s sVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 != 2) {
                a.z0(parcel, readInt);
            } else {
                sVar = (s) a.K(parcel, readInt, s.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new j(i2, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new j[i2];
    }
}
