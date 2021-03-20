package b.l.a.a.f.q.h;

import android.content.Context;
import b.a.a.n.f;
import b.l.a.a.f.h;
import b.l.a.a.f.n.a;
import b.l.a.a.f.n.e;
import b.l.a.a.f.n.g;
import b.l.a.a.f.n.m;
import b.l.a.a.f.q.i.c;
import b.l.a.a.f.r.b;
import b.l.a.a.f.s.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class l {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2533b;
    public final c c;
    public final r d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2534e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2535g;

    public l(Context context, e eVar, c cVar, r rVar, Executor executor, b bVar, a aVar) {
        this.a = context;
        this.f2533b = eVar;
        this.c = cVar;
        this.d = rVar;
        this.f2534e = executor;
        this.f = bVar;
        this.f2535g = aVar;
    }

    public void a(h hVar, int i2) {
        g b2;
        m mVar = this.f2533b.get(hVar.b());
        Iterable<b.l.a.a.f.q.i.h> iterable = (Iterable) this.f.b(new h(this, hVar));
        if (iterable.iterator().hasNext()) {
            if (mVar == null) {
                f.c("Uploader", "Unknown backend for %s, deleting event batch for it...", hVar);
                b2 = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (b.l.a.a.f.q.i.h a2 : iterable) {
                    arrayList.add(a2.a());
                }
                byte[] c2 = hVar.c();
                if (1 != 0) {
                    b2 = mVar.b(new b.l.a.a.f.n.a(arrayList, c2, (a.C0055a) null));
                } else {
                    throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", ""));
                }
            }
            this.f.b(new i(this, b2, iterable, hVar, i2));
        }
    }
}
