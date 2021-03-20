package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class r implements Parcelable.Creator<q> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                a.z0(parcel, readInt);
            } else {
                bundle = a.J(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new q(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new q[i2];
    }
}
