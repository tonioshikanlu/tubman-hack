package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.y;
import java.util.ArrayList;

public final class h implements Parcelable.Creator<g> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        ArrayList<y> arrayList = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                str2 = a.L(parcel, readInt);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                arrayList = a.O(parcel, readInt, y.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new g(str, str2, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new g[i2];
    }
}
