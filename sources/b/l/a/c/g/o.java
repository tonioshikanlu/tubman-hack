package b.l.a.c.g;

import android.os.Parcel;
import b.l.a.c.f.g.q;
import b.l.a.c.f.g.v;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class o extends q implements n {
    public static final /* synthetic */ int a = 0;

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            LocationResult locationResult = (LocationResult) v.a(parcel, LocationResult.CREATOR);
            throw null;
        } else if (i2 != 2) {
            return false;
        } else {
            LocationAvailability locationAvailability = (LocationAvailability) v.a(parcel, LocationAvailability.CREATOR);
            throw null;
        }
    }
}
