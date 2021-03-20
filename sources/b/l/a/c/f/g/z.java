package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.c;
import b.l.a.c.g.i;
import java.util.List;

public final class z implements Parcelable.Creator<y> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        i iVar = y.f3476l;
        List<c> list = y.f3475k;
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                iVar = (i) a.K(parcel, readInt, i.CREATOR);
            } else if (i2 == 2) {
                list = a.O(parcel, readInt, c.CREATOR);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new y(iVar, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new y[i2];
    }
}
