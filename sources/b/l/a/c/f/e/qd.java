package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class qd implements Parcelable.Creator<pd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        fl flVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                flVar = (fl) a.K(parcel, readInt, fl.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new pd(flVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new pd[i2];
    }
}
