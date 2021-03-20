package b.l.a.c.c.l;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.common.api.Scope;

public final class l implements Parcelable.Creator<Scope> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 != 2) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new Scope(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Scope[i2];
    }
}
