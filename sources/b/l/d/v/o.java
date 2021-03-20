package b.l.d.v;

import android.os.Bundle;

public final class o extends m<Bundle> {
    public o(int i2, Bundle bundle) {
        super(i2, 1, bundle);
    }

    public final boolean c() {
        return false;
    }

    public final void d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }
}
