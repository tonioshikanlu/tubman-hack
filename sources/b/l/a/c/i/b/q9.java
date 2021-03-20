package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.List;

public final class q9 implements Parcelable.Creator<p9> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j7 = -2147483648L;
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
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 7:
                    j3 = a.u0(parcel2, readInt);
                    break;
                case 8:
                    str5 = a.L(parcel2, readInt);
                    break;
                case 9:
                    z = a.n0(parcel2, readInt);
                    break;
                case 10:
                    z3 = a.n0(parcel2, readInt);
                    break;
                case 11:
                    j7 = a.u0(parcel2, readInt);
                    break;
                case 12:
                    str6 = a.L(parcel2, readInt);
                    break;
                case 13:
                    j4 = a.u0(parcel2, readInt);
                    break;
                case 14:
                    j5 = a.u0(parcel2, readInt);
                    break;
                case 15:
                    i2 = a.t0(parcel2, readInt);
                    break;
                case 16:
                    z2 = a.n0(parcel2, readInt);
                    break;
                case 18:
                    z4 = a.n0(parcel2, readInt);
                    break;
                case 19:
                    str7 = a.L(parcel2, readInt);
                    break;
                case 21:
                    bool = a.o0(parcel2, readInt);
                    break;
                case 22:
                    j6 = a.u0(parcel2, readInt);
                    break;
                case 23:
                    arrayList = a.M(parcel2, readInt);
                    break;
                case 24:
                    str8 = a.L(parcel2, readInt);
                    break;
                case 25:
                    str9 = a.L(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new p9(str, str2, str3, str4, j2, j3, str5, z, z3, j7, str6, j4, j5, i2, z2, z4, str7, bool, j6, (List<String>) arrayList, str8, str9);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new p9[i2];
    }
}
