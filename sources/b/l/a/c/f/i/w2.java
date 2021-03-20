package b.l.a.c.f.i;

import android.database.ContentObserver;
import android.os.Handler;

public final class w2 extends ContentObserver {
    public final /* synthetic */ x2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var) {
        super((Handler) null);
        this.a = x2Var;
    }

    public final void onChange(boolean z) {
        x2 x2Var = this.a;
        synchronized (x2Var.d) {
            x2Var.f3807e = null;
            o3.f3672h.incrementAndGet();
        }
        synchronized (x2Var) {
            for (y2 a2 : x2Var.f) {
                a2.a();
            }
        }
    }
}
