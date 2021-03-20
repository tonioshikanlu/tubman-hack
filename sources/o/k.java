package o;

import e.x.c.i;

public abstract class k implements z {

    /* renamed from: h  reason: collision with root package name */
    public final z f10464h;

    public k(z zVar) {
        i.e(zVar, "delegate");
        this.f10464h = zVar;
    }

    public long T(e eVar, long j2) {
        i.e(eVar, "sink");
        return this.f10464h.T(eVar, j2);
    }

    public void close() {
        this.f10464h.close();
    }

    public a0 f() {
        return this.f10464h.f();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f10464h + ')';
    }
}
