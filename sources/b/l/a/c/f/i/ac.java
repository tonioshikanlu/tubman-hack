package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class ac implements Parcelable.Creator<zb> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 2:
                    j3 = a.u0(parcel2, readInt);
                    break;
                case 3:
                    z = a.n0(parcel2, readInt);
                    break;
                case 4:
                    str = a.L(parcel2, readInt);
                    break;
                case 5:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 6:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 7:
                    bundle = a.J(parcel2, readInt);
                    break;
                case 8:
                    str4 = a.L(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new zb(j2, j3, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zb[i2];
    }
}
