package b.l.d.v;

import android.util.Pair;
import b.l.a.c.k.a;
import b.l.a.c.k.h;

public final /* synthetic */ class u implements a {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final Pair f5343b;

    public u(t tVar, Pair pair) {
        this.a = tVar;
        this.f5343b = pair;
    }

    public final Object a(h hVar) {
        t tVar = this.a;
        Pair pair = this.f5343b;
        synchronized (tVar) {
            tVar.f5340b.remove(pair);
        }
        return hVar;
    }
}
