package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.i.n;

public final class k extends h<Void> {
    public final /* synthetic */ m c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(m mVar, n<Void> nVar) {
        super(mVar, nVar);
        this.c = mVar;
    }

    public final void e0(Bundle bundle, Bundle bundle2) {
        super.e0(bundle, bundle2);
        if (!this.c.f4578e.compareAndSet(true, false)) {
            m.f.b(5, "Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.c.c();
        }
    }
}
