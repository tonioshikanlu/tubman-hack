package b.l.a.c.j.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class b implements Parcelable.Creator<c> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i4 == 2) {
                i3 = a.t0(parcel, readInt);
            } else if (i4 != 3) {
                a.z0(parcel, readInt);
            } else {
                intent = (Intent) a.K(parcel, readInt, Intent.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new c(i2, i3, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
