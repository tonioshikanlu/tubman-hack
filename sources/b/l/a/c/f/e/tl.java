package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class tl implements Parcelable.Creator<sl> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
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
                    str3 = a.L(parcel2, readInt);
                    break;
                case 5:
                    str4 = a.L(parcel2, readInt);
                    break;
                case 6:
                    str5 = a.L(parcel2, readInt);
                    break;
                case 7:
                    str6 = a.L(parcel2, readInt);
                    break;
                case 8:
                    str7 = a.L(parcel2, readInt);
                    break;
                case 9:
                    str8 = a.L(parcel2, readInt);
                    break;
                case 10:
                    z = a.n0(parcel2, readInt);
                    break;
                case 11:
                    z2 = a.n0(parcel2, readInt);
                    break;
                case 12:
                    str9 = a.L(parcel2, readInt);
                    break;
                case 13:
                    str10 = a.L(parcel2, readInt);
                    break;
                case 14:
                    str11 = a.L(parcel2, readInt);
                    break;
                case 15:
                    str12 = a.L(parcel2, readInt);
                    break;
                case 16:
                    z3 = a.n0(parcel2, readInt);
                    break;
                case 17:
                    str13 = a.L(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new sl(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new sl[i2];
    }
}
