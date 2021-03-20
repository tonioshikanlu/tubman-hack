package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import java.util.ArrayList;

public final class rl implements Parcelable.Creator<ql> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        int i2 = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i3 != 2) {
                a.z0(parcel, readInt);
            } else {
                arrayList = a.M(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new ql(i2, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new ql[i2];
    }
}
