package b.j.a.c.h0;

import b.j.a.c.h0.s.m;
import b.j.a.c.i;
import b.j.a.c.j0.b0;
import b.j.a.c.n;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class o {
    public final HashMap<b0, n<Object>> a = new HashMap<>(64);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<m> f2052b = new AtomicReference<>();

    public n<Object> a(i iVar) {
        n<Object> nVar;
        synchronized (this) {
            nVar = this.a.get(new b0(iVar, false));
        }
        return nVar;
    }

    public n<Object> b(Class<?> cls) {
        n<Object> nVar;
        synchronized (this) {
            nVar = this.a.get(new b0(cls, false));
        }
        return nVar;
    }
}
