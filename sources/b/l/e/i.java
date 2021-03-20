package b.l.e;

import b.l.e.g0.a;
import b.l.e.g0.c;
import java.util.concurrent.atomic.AtomicLong;

public class i extends b0<AtomicLong> {
    public final /* synthetic */ b0 a;

    public i(b0 b0Var) {
        this.a = b0Var;
    }

    public Object a(a aVar) {
        return new AtomicLong(((Number) this.a.a(aVar)).longValue());
    }

    public void b(c cVar, Object obj) {
        this.a.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
