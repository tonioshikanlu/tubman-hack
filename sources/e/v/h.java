package e.v;

import com.segment.analytics.integrations.BasePayload;
import e.v.f;
import e.x.b.p;
import e.x.c.i;
import java.io.Serializable;

public final class h implements f, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final h f7949h = new h();

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return r;
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public f minusKey(f.b<?> bVar) {
        i.e(bVar, "key");
        return this;
    }

    public f plus(f fVar) {
        i.e(fVar, BasePayload.CONTEXT_KEY);
        return fVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
