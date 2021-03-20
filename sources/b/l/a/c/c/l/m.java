package b.l.a.c.c.l;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.common.api.Status;

public final class m implements Parcelable.Creator<Status> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i3 = a.t0(parcel, readInt);
            } else if (i4 == 2) {
                str = a.L(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) a.K(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 1000) {
                a.z0(parcel, readInt);
            } else {
                i2 = a.t0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new Status(i2, i3, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
