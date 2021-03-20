package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class m1 extends a implements h3 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle M0(Bundle bundle) {
        Parcel g2 = g();
        o0.b(g2, bundle);
        Parcel n2 = n(1, g2);
        Bundle bundle2 = (Bundle) o0.a(n2, Bundle.CREATOR);
        n2.recycle();
        return bundle2;
    }
}
