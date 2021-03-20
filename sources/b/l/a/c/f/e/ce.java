package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.d;

public final class ce implements Parcelable.Creator<be> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        d dVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                dVar = (d) a.K(parcel, readInt, d.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new be(dVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new be[i2];
    }
}
