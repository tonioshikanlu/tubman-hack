package b.l.a.c.f.g;

import android.os.Parcel;
import b.l.a.c.c.l.k.d;
import b.l.a.c.c.l.k.e;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public abstract class g extends q implements f {
    public g() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        e<Status> eVar = ((c) this).a;
        Status status = ((d) v.a(parcel, d.CREATOR)).f3455h;
        d dVar = (d) eVar;
        Objects.requireNonNull(dVar);
        dVar.e(status);
        return true;
    }
}
