package b.l.a.d.a.e;

import android.os.Bundle;
import android.os.Parcel;

public abstract class m0 extends h0 implements n0 {
    public m0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean g(int i2, Parcel parcel) {
        if (i2 == 2) {
            X0((Bundle) i0.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            z0((Bundle) i0.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
