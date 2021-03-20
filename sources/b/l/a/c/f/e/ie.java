package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.y;

public final class ie implements Parcelable.Creator<he> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        y yVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    yVar = (y) a.K(parcel2, readInt, y.CREATOR);
                    break;
                case 2:
                    str = a.L(parcel2, readInt);
                    break;
                case 3:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 4:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 5:
                    z = a.n0(parcel2, readInt);
                    break;
                case 6:
                    z2 = a.n0(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 8:
                    str4 = a.L(parcel2, readInt);
                    break;
                case 9:
                    z3 = a.n0(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new he(yVar, str, str2, j2, z, z2, str3, str4, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new he[i2];
    }
}
