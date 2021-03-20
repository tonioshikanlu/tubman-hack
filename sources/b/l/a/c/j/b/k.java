package b.l.a.c.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.b;
import b.l.a.c.c.m.t;

public final class k implements Parcelable.Creator<l> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        b bVar = null;
        int i2 = 0;
        t tVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 == 2) {
                bVar = (b) a.K(parcel, readInt, b.CREATOR);
            } else if (i3 != 3) {
                a.z0(parcel, readInt);
            } else {
                tVar = (t) a.K(parcel, readInt, t.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new l(i2, bVar, tVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l[i2];
    }
}
