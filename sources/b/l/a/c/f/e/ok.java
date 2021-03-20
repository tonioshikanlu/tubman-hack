package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import java.util.ArrayList;

public final class ok implements Parcelable.Creator<nk> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        ArrayList<lk> arrayList = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                a.z0(parcel, readInt);
            } else {
                arrayList = a.O(parcel, readInt, lk.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new nk(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new nk[i2];
    }
}
