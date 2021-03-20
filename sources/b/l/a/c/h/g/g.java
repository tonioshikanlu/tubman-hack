package b.l.a.c.h.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.shadow.ShadowDrawableWrapper;

public final class g implements Parcelable.Creator<LatLng> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        double d = ShadowDrawableWrapper.COS_45;
        double d2 = 0.0d;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                a.g1(parcel, readInt, 8);
                d = parcel.readDouble();
            } else if (i2 != 3) {
                a.z0(parcel, readInt);
            } else {
                a.g1(parcel, readInt, 8);
                d2 = parcel.readDouble();
            }
        }
        a.S(parcel, C0);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LatLng[i2];
    }
}
