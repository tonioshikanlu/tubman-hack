package e.v;

import com.segment.analytics.integrations.BasePayload;
import e.x.b.p;
import e.x.c.i;

public interface f {

    public interface a extends f {

        /* renamed from: e.v.f$a$a  reason: collision with other inner class name */
        public static final class C0144a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                i.e(pVar, "operation");
                return pVar.invoke(r, aVar);
            }

            public static <E extends a> E b(a aVar, b<E> bVar) {
                i.e(bVar, "key");
                if (i.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static f c(a aVar, b<?> bVar) {
                i.e(bVar, "key");
                return i.a(aVar.getKey(), bVar) ? h.f7949h : aVar;
            }

            public static f d(a aVar, f fVar) {
                i.e(fVar, BasePayload.CONTEXT_KEY);
                i.e(fVar, BasePayload.CONTEXT_KEY);
                return fVar == h.f7949h ? aVar : (f) fVar.fold(aVar, g.f7948h);
            }
        }

        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    f minusKey(b<?> bVar);

    f plus(f fVar);
}
