package b.l.a.c.i.b;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import b.l.a.c.f.i.zb;
import b.l.a.c.i.b.g8;

public final class h8<T extends Context & g8> {
    public final T a;

    public h8(T t) {
        this.a = t;
    }

    @MainThread
    public final boolean a(Intent intent) {
        if (intent == null) {
            c().f.a("onUnbind called with null intent");
            return true;
        }
        c().f4096n.b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @MainThread
    public final void b(Intent intent) {
        if (intent == null) {
            c().f.a("onRebind called with null intent");
            return;
        }
        c().f4096n.b("onRebind called. action", intent.getAction());
    }

    public final k3 c() {
        return l4.h(this.a, (zb) null, (Long) null).a();
    }
}
