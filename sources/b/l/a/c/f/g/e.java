package b.l.a.c.f.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.common.api.Status;

public final class e implements Parcelable.Creator<d> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        Status status = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                status = (Status) a.K(parcel, readInt, Status.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new d(status);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
