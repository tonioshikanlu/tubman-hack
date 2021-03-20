package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class t implements Parcelable.Creator<s> {
    public static void a(s sVar, Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 2, sVar.f4248h, false);
        a.J0(parcel, 3, sVar.f4249i, i2, false);
        a.K0(parcel, 4, sVar.f4250j, false);
        long j2 = sVar.f4251k;
        a.I1(parcel, 5, 8);
        parcel.writeLong(j2);
        a.H1(parcel, P0);
    }

    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        q qVar = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 == 3) {
                qVar = (q) a.K(parcel, readInt, q.CREATOR);
            } else if (i2 == 4) {
                str2 = a.L(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                j2 = a.u0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new s(str, qVar, str2, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
