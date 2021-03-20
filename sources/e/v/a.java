package e.v;

import com.segment.analytics.integrations.BasePayload;
import e.v.f;
import e.x.b.p;
import e.x.c.i;

public abstract class a implements f.a {
    private final f.b<?> key;

    public a(f.b<?> bVar) {
        i.e(bVar, "key");
        this.key = bVar;
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return f.a.C0144a.a(this, r, pVar);
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        return f.a.C0144a.b(this, bVar);
    }

    public f.b<?> getKey() {
        return this.key;
    }

    public f minusKey(f.b<?> bVar) {
        i.e(bVar, "key");
        return f.a.C0144a.c(this, bVar);
    }

    public f plus(f fVar) {
        i.e(fVar, BasePayload.CONTEXT_KEY);
        return f.a.C0144a.d(this, fVar);
    }
}
