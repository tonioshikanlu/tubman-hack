package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import com.google.android.gms.common.api.Status;

public final class ue implements Parcelable.Creator<te> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        Status status = null;
        n0 n0Var = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                status = (Status) a.K(parcel, readInt, Status.CREATOR);
            } else if (i2 == 2) {
                n0Var = (n0) a.K(parcel, readInt, n0.CREATOR);
            } else if (i2 == 3) {
                str = a.L(parcel, readInt);
            } else if (i2 != 4) {
                a.z0(parcel, readInt);
            } else {
                str2 = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new te(status, n0Var, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new te[i2];
    }
}
