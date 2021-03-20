package b.l.a.c.g;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.location.LocationRequest;

public final class d implements Parcelable.Creator<LocationRequest> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        int i2 = 102;
        long j2 = 3600000;
        long j3 = 600000;
        boolean z = false;
        long j4 = Long.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j5 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.t0(parcel2, readInt);
                    break;
                case 2:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 3:
                    j3 = a.u0(parcel2, readInt);
                    break;
                case 4:
                    z = a.n0(parcel2, readInt);
                    break;
                case 5:
                    j4 = a.u0(parcel2, readInt);
                    break;
                case 6:
                    i3 = a.t0(parcel2, readInt);
                    break;
                case 7:
                    f = a.q0(parcel2, readInt);
                    break;
                case 8:
                    j5 = a.u0(parcel2, readInt);
                    break;
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f, j5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
