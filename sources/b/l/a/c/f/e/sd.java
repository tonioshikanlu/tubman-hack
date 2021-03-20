package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class sd implements Parcelable.Creator<rd> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new rd(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new rd[i2];
    }
}
