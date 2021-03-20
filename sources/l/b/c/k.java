package l.b.c;

import com.segment.analytics.integrations.BasePayload;
import java.io.Closeable;
import java.util.Objects;
import l.a.b;
import l.a.c;
import l.b.c.a0.a;

public final class k implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public final b f8115h;

    /* renamed from: i  reason: collision with root package name */
    public final o f8116i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8117j;

    public k(o oVar, boolean z, j jVar) {
        this.f8116i = oVar;
        this.f8117j = z;
        b e2 = b.e();
        b.c<o> cVar = a.a;
        b.q.a.a.x(e2, BasePayload.CONTEXT_KEY);
        b.c<o> cVar2 = a.a;
        c.d<K, V> dVar = e2.f8102j.a;
        b c = b.d.a.c(new b(e2, dVar == null ? new c(new c.C0160c(cVar2, oVar)) : new c(dVar.b(cVar2, oVar, cVar2.hashCode(), 0))));
        this.f8115h = c == null ? b.f8099n : c;
    }

    public void close() {
        b.e().q(this.f8115h);
        if (this.f8117j) {
            o oVar = this.f8116i;
            Objects.requireNonNull(oVar);
            oVar.c(l.a);
        }
    }
}
