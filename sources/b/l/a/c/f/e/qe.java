package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.c0;

public final class qe implements Parcelable.Creator<pe> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        c0 c0Var = null;
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                c0Var = (c0) a.K(parcel, readInt, c0.CREATOR);
            } else if (i2 != 2) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new pe(c0Var, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new pe[i2];
    }
}
