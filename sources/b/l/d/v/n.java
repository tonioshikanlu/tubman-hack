package b.l.d.v;

import android.os.Bundle;

public final class n extends m<Void> {
    public n(int i2, Bundle bundle) {
        super(i2, 2, bundle);
    }

    public final boolean c() {
        return true;
    }

    public final void d(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            b(new p(4, "Invalid response to one way request"));
        }
    }
}
