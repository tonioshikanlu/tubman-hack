package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import java.util.ArrayList;

public final class zj implements Parcelable.Creator<yj> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        ql qlVar = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = a.L(parcel, readInt);
                    break;
                case 3:
                    z = a.n0(parcel, readInt);
                    break;
                case 4:
                    str2 = a.L(parcel, readInt);
                    break;
                case 5:
                    z2 = a.n0(parcel, readInt);
                    break;
                case 6:
                    qlVar = (ql) a.K(parcel, readInt, ql.CREATOR);
                    break;
                case 7:
                    arrayList = a.M(parcel, readInt);
                    break;
                default:
                    a.z0(parcel, readInt);
                    break;
            }
        }
        a.S(parcel, C0);
        return new yj(str, z, str2, z2, qlVar, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new yj[i2];
    }
}
