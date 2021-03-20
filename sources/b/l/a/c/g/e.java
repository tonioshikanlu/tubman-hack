package b.l.a.c.g;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public final class e implements Parcelable.Creator<LocationResult> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        List<Location> list = LocationResult.f7298i;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.z0(parcel, readInt);
            } else {
                list = a.O(parcel, readInt, Location.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
