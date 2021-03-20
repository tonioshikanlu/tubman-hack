package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class zk implements Parcelable.Creator<yk> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
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
                case 2:
                    str = a.L(parcel, readInt);
                    break;
                case 3:
                    str2 = a.L(parcel, readInt);
                    break;
                case 4:
                    str3 = a.L(parcel, readInt);
                    break;
                case 5:
                    str4 = a.L(parcel, readInt);
                    break;
                case 6:
                    str5 = a.L(parcel, readInt);
                    break;
                case 7:
                    str6 = a.L(parcel, readInt);
                    break;
                case 8:
                    str7 = a.L(parcel, readInt);
                    break;
                default:
                    a.z0(parcel, readInt);
                    break;
            }
        }
        a.S(parcel, C0);
        return new yk(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new yk[i2];
    }
}
