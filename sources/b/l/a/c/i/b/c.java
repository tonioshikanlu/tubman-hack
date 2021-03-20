package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class c implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        g9 g9Var = null;
        String str3 = null;
        s sVar = null;
        s sVar2 = null;
        s sVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = a.L(parcel2, readInt);
                    break;
                case 3:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 4:
                    g9Var = (g9) a.K(parcel2, readInt, g9.CREATOR);
                    break;
                case 5:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 6:
                    z = a.n0(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 8:
                    sVar = (s) a.K(parcel2, readInt, s.CREATOR);
                    break;
                case 9:
                    j3 = a.u0(parcel2, readInt);
                    break;
                case 10:
                    sVar2 = (s) a.K(parcel2, readInt, s.CREATOR);
                    break;
                case 11:
                    j4 = a.u0(parcel2, readInt);
                    break;
                case 12:
                    sVar3 = (s) a.K(parcel2, readInt, s.CREATOR);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new b(str, str2, g9Var, j2, z, str3, sVar, j3, sVar2, j4, sVar3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
