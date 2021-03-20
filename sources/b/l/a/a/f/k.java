package b.l.a.a.f;

import android.content.Context;
import b.l.a.a.f.c;
import b.l.a.a.f.q.e;
import b.l.a.a.f.q.h.l;
import b.l.a.a.f.q.h.n;
import b.l.a.a.f.q.h.p;
import b.l.a.a.f.s.a;
import java.util.Objects;

public class k implements j {

    /* renamed from: e  reason: collision with root package name */
    public static volatile l f2487e;
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2488b;
    public final e c;
    public final l d;

    public k(a aVar, a aVar2, e eVar, l lVar, p pVar) {
        this.a = aVar;
        this.f2488b = aVar2;
        this.c = eVar;
        this.d = lVar;
        pVar.a.execute(new n(pVar));
    }

    public static k a() {
        l lVar = f2487e;
        if (lVar != null) {
            return ((c) lVar).s.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f2487e == null) {
            synchronized (k.class) {
                if (f2487e == null) {
                    Objects.requireNonNull(context);
                    Class<Context> cls = Context.class;
                    f2487e = new c(context, (c.a) null);
                }
            }
        }
    }
}
