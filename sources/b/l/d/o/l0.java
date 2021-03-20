package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class l0 implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str4 = a.L(parcel, readInt);
                    break;
                case 5:
                    z = a.n0(parcel, readInt);
                    break;
                case 6:
                    str5 = a.L(parcel, readInt);
                    break;
                case 7:
                    z2 = a.n0(parcel, readInt);
                    break;
                case 8:
                    str6 = a.L(parcel, readInt);
                    break;
                case 9:
                    i2 = a.t0(parcel, readInt);
                    break;
                case 10:
                    str7 = a.L(parcel, readInt);
                    break;
                default:
                    a.z0(parcel, readInt);
                    break;
            }
        }
        a.S(parcel, C0);
        return new a(str, str2, str3, str4, z, str5, z2, str6, i2, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new a[i2];
    }
}
