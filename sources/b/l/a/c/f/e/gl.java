package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class gl implements Parcelable.Creator<fl> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = a.L(parcel2, readInt);
                    break;
                case 2:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 3:
                    z = a.n0(parcel2, readInt);
                    break;
                case 4:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 5:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 6:
                    str4 = a.L(parcel2, readInt);
                    break;
                case 7:
                    z2 = a.n0(parcel2, readInt);
                    break;
                case 8:
                    str5 = a.L(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new fl(str, j2, z, str2, str3, str4, z2, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new fl[i2];
    }
}
