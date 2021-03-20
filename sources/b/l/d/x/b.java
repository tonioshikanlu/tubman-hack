package b.l.d.x;

import b.l.d.x.m.a;
import b.l.d.x.m.c;
import b.l.d.x.m.d;
import java.util.Objects;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final d f5357h;

    public b(d dVar) {
        this.f5357h = dVar;
    }

    public void run() {
        d b2;
        d dVar = this.f5357h;
        Object obj = d.f5360m;
        Objects.requireNonNull(dVar);
        synchronized (d.f5360m) {
            b.l.d.d dVar2 = dVar.a;
            dVar2.a();
            a a = a.a(dVar2.a, "generatefid.lock");
            try {
                b2 = dVar.c.b();
                if (b2.i()) {
                    String f = dVar.f(b2);
                    c cVar = dVar.c;
                    a.b bVar = (a.b) b2.j();
                    bVar.a = f;
                    bVar.b(c.a.UNREGISTERED);
                    b2 = bVar.a();
                    cVar.a(b2);
                }
            } finally {
                if (a != null) {
                    a.b();
                }
            }
        }
        dVar.i(b2);
        dVar.f5366i.execute(new c(dVar, false));
    }
}
