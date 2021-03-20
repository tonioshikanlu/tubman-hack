package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import b.l.d.o.y;
import java.util.ArrayList;

public final class f implements Parcelable.Creator<e> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        ArrayList<y> arrayList = null;
        g gVar = null;
        String str = null;
        n0 n0Var = null;
        j0 j0Var = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                arrayList = a.O(parcel, readInt, y.CREATOR);
            } else if (i2 == 2) {
                gVar = (g) a.K(parcel, readInt, g.CREATOR);
            } else if (i2 == 3) {
                str = a.L(parcel, readInt);
            } else if (i2 == 4) {
                n0Var = (n0) a.K(parcel, readInt, n0.CREATOR);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                j0Var = (j0) a.K(parcel, readInt, j0.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new e(arrayList, gVar, str, n0Var, j0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new e[i2];
    }
}
