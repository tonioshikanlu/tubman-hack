package b.l.a.a.f.q;

import b.l.a.a.f.e;
import b.l.a.a.f.h;
import b.l.a.a.f.n.m;
import java.util.logging.Logger;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final c f2504h;

    /* renamed from: i  reason: collision with root package name */
    public final h f2505i;

    /* renamed from: j  reason: collision with root package name */
    public final b.l.d.q.f.l.a f2506j;

    /* renamed from: k  reason: collision with root package name */
    public final e f2507k;

    public a(c cVar, h hVar, b.l.d.q.f.l.a aVar, e eVar) {
        this.f2504h = cVar;
        this.f2505i = hVar;
        this.f2506j = aVar;
        this.f2507k = eVar;
    }

    public void run() {
        c cVar = this.f2504h;
        h hVar = this.f2505i;
        b.l.d.q.f.l.a aVar = this.f2506j;
        e eVar = this.f2507k;
        Logger logger = c.f;
        try {
            m mVar = cVar.c.get(hVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{hVar.b()});
                c.f.warning(format);
                aVar.a(new IllegalArgumentException(format));
                return;
            }
            cVar.f2510e.b(new b(cVar, hVar, mVar.a(eVar)));
            aVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger2 = c.f;
            StringBuilder y = b.e.a.a.a.y("Error scheduling event ");
            y.append(e2.getMessage());
            logger2.warning(y.toString());
            aVar.a(e2);
        }
    }
}
