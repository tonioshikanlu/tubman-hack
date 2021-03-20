package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.a.c.f.e.sk;
import b.l.d.o.n0;
import java.util.ArrayList;

public final class k0 implements Parcelable.Creator<j0> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        sk skVar = null;
        g0 g0Var = null;
        String str = null;
        String str2 = null;
        ArrayList<g0> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        l0 l0Var = null;
        n0 n0Var = null;
        p pVar = null;
        boolean z = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    skVar = (sk) a.K(parcel2, readInt, sk.CREATOR);
                    break;
                case 2:
                    g0Var = (g0) a.K(parcel2, readInt, g0.CREATOR);
                    break;
                case 3:
                    str = a.L(parcel2, readInt);
                    break;
                case 4:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 5:
                    arrayList = a.O(parcel2, readInt, g0.CREATOR);
                    break;
                case 6:
                    arrayList2 = a.M(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 8:
                    bool = a.o0(parcel2, readInt);
                    break;
                case 9:
                    l0Var = (l0) a.K(parcel2, readInt, l0.CREATOR);
                    break;
                case 10:
                    z = a.n0(parcel2, readInt);
                    break;
                case 11:
                    n0Var = (n0) a.K(parcel2, readInt, n0.CREATOR);
                    break;
                case 12:
                    pVar = (p) a.K(parcel2, readInt, p.CREATOR);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new j0(skVar, g0Var, str, str2, arrayList, arrayList2, str3, bool, l0Var, z, n0Var, pVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new j0[i2];
    }
}
