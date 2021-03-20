package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import java.util.ArrayList;

public final class we implements Parcelable.Creator<ve> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        ArrayList<vk> arrayList = null;
        n0 n0Var = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.L(parcel, readInt);
            } else if (i2 == 2) {
                arrayList = a.O(parcel, readInt, vk.CREATOR);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                n0Var = (n0) a.K(parcel, readInt, n0.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new ve(str, arrayList, n0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new ve[i2];
    }
}
