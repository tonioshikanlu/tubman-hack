package b.l.a.c.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class f implements Parcelable.Creator<LatLngBounds> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                latLng = (LatLng) a.K(parcel, readInt, LatLng.CREATOR);
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                latLng2 = (LatLng) a.K(parcel, readInt, LatLng.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LatLngBounds[i2];
    }
}
