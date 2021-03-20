package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class g0 implements Parcelable.Creator<x> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = a.L(parcel, readInt);
                    break;
                case 2:
                    str2 = a.L(parcel, readInt);
                    break;
                case 3:
                    z = a.n0(parcel, readInt);
                    break;
                case 4:
                    str3 = a.L(parcel, readInt);
                    break;
                case 5:
                    z2 = a.n0(parcel, readInt);
                    break;
                case 6:
                    str4 = a.L(parcel, readInt);
                    break;
                case 7:
                    str5 = a.L(parcel, readInt);
                    break;
                default:
                    a.z0(parcel, readInt);
                    break;
            }
        }
        a.S(parcel, C0);
        return new x(str, str2, z, str3, z2, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new x[i2];
    }
}
