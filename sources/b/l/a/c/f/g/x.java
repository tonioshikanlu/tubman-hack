package b.l.a.c.f.g;

import android.os.IInterface;

public final class x {
    public final /* synthetic */ w a;

    public x(w wVar) {
        this.a = wVar;
    }

    public final void a() {
        if (!this.a.a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface b() {
        return (i) this.a.B();
    }
}
