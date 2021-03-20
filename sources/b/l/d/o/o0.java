package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.f.e.sl;

public final class o0 implements Parcelable.Creator<n0> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        sl slVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = a.L(parcel, readInt);
                    break;
                case 4:
                    slVar = (sl) a.K(parcel, readInt, sl.CREATOR);
                    break;
                case 5:
                    str4 = a.L(parcel, readInt);
                    break;
                case 6:
                    str5 = a.L(parcel, readInt);
                    break;
                case 7:
                    str6 = a.L(parcel, readInt);
                    break;
                default:
                    a.z0(parcel, readInt);
                    break;
            }
        }
        a.S(parcel, C0);
        return new n0(str, str2, str3, slVar, str4, str5, str6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new n0[i2];
    }
}
