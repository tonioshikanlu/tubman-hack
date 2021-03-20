package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class el implements Parcelable.Creator<dl> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        vk vkVar = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.L(parcel, readInt);
            } else if (i2 == 3) {
                str2 = a.L(parcel, readInt);
            } else if (i2 == 4) {
                str3 = a.L(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                vkVar = (vk) a.K(parcel, readInt, vk.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new dl(str, str2, str3, vkVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new dl[i2];
    }
}
