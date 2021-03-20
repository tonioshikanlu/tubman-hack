package b.l.d.o.e0;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import b.l.d.o.y;
import java.util.ArrayList;

public final class q implements Parcelable.Creator<p> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        ArrayList<y> arrayList = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                arrayList = a.O(parcel, readInt, y.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new p(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new p[i2];
    }
}
