package b.l.a.c.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class r implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i4 == 2) {
                i3 = a.t0(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) a.K(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                a.z0(parcel, readInt);
            } else {
                str = a.L(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new b(i2, i3, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
