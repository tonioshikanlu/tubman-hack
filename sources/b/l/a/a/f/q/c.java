package b.l.a.a.f.q;

import b.l.a.a.f.h;
import b.l.a.a.f.k;
import b.l.a.a.f.n.e;
import b.l.a.a.f.q.h.r;
import b.l.a.a.f.r.b;
import b.l.d.q.f.l.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c implements e {
    public static final Logger f = Logger.getLogger(k.class.getName());
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f2509b;
    public final e c;
    public final b.l.a.a.f.q.i.c d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2510e;

    public c(Executor executor, e eVar, r rVar, b.l.a.a.f.q.i.c cVar, b bVar) {
        this.f2509b = executor;
        this.c = eVar;
        this.a = rVar;
        this.d = cVar;
        this.f2510e = bVar;
    }

    public void a(h hVar, b.l.a.a.f.e eVar, a aVar) {
        this.f2509b.execute(new a(this, hVar, aVar, eVar));
    }
}
