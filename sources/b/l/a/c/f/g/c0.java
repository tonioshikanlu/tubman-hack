package b.l.a.c.f.g;

import android.location.Location;
import b.l.a.c.b.a;
import b.l.a.c.g.b;
import com.google.android.gms.common.api.GoogleApiClient;

public final class c0 {
    public final Location a(GoogleApiClient googleApiClient) {
        boolean z = true;
        a.k(true, "GoogleApiClient parameter is required.");
        p pVar = (p) googleApiClient.e(b.a);
        if (pVar == null) {
            z = false;
        }
        a.G(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        try {
            k kVar = pVar.F;
            kVar.a.a();
            return ((i) kVar.a.b()).d(kVar.f3458b.getPackageName());
        } catch (Exception unused) {
            return null;
        }
    }
}
