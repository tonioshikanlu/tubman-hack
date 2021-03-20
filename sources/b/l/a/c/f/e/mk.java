package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.n0;
import java.util.ArrayList;

public final class mk implements Parcelable.Creator<lk> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        al alVar = null;
        String str5 = null;
        String str6 = null;
        n0 n0Var = null;
        ArrayList<vk> arrayList = null;
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
                    z = a.n0(parcel2, readInt);
                    break;
                case 5:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 6:
                    str4 = a.L(parcel2, readInt);
                    break;
                case 7:
                    alVar = (al) a.K(parcel2, readInt, al.CREATOR);
                    break;
                case 8:
                    str5 = a.L(parcel2, readInt);
                    break;
                case 9:
                    str6 = a.L(parcel2, readInt);
                    break;
                case 10:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 11:
                    j3 = a.u0(parcel2, readInt);
                    break;
                case 12:
                    z2 = a.n0(parcel2, readInt);
                    break;
                case 13:
                    n0Var = (n0) a.K(parcel2, readInt, n0.CREATOR);
                    break;
                case 14:
                    arrayList = a.O(parcel2, readInt, vk.CREATOR);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new lk(str, str2, z, str3, str4, alVar, str5, str6, j2, j3, z2, n0Var, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new lk[i2];
    }
}
