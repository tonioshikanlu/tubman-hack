package b.l.a.c.f.i;

import android.database.ContentObserver;
import android.os.Handler;

public final class b3 extends ContentObserver {
    public b3() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        o3.f3672h.incrementAndGet();
    }
}
