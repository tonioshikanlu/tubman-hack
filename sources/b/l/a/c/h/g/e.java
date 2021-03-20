package b.l.a.c.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class e implements Parcelable.Creator<CameraPosition> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        LatLng latLng = null;
        float f3 = 0.0f;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                latLng = (LatLng) a.K(parcel, readInt, LatLng.CREATOR);
            } else if (i2 == 3) {
                f = a.q0(parcel, readInt);
            } else if (i2 == 4) {
                f3 = a.q0(parcel, readInt);
            } else if (i2 != 5) {
                a.z0(parcel, readInt);
            } else {
                f2 = a.q0(parcel, readInt);
            }
        }
        a.S(parcel, C0);
        return new CameraPosition(latLng, f, f3, f2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new CameraPosition[i2];
    }
}
