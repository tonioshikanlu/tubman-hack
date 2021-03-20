package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e0.g;
import b.l.e.e0.t;
import b.l.e.g0.c;
import b.l.e.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class b implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final g f5462h;

    public static final class a<E> extends b0<Collection<E>> {
        public final b0<E> a;

        /* renamed from: b  reason: collision with root package name */
        public final t<? extends Collection<E>> f5463b;

        public a(k kVar, Type type, b0<E> b0Var, t<? extends Collection<E>> tVar) {
            this.a = new n(kVar, b0Var, type);
            this.f5463b = tVar;
        }

        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            Collection collection = (Collection) this.f5463b.a();
            aVar.b();
            while (aVar.Y()) {
                collection.add(this.a.a(aVar));
            }
            aVar.H();
            return collection;
        }

        public void b(c cVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                cVar.Y();
                return;
            }
            cVar.e();
            for (Object b2 : collection) {
                this.a.b(cVar, b2);
            }
            cVar.H();
        }
    }

    public b(g gVar) {
        this.f5462h = gVar;
    }

    public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
        Type type = aVar.f5519b;
        Class<? super T> cls = aVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f = b.l.e.e0.a.f(type, cls, Collection.class);
        if (f instanceof WildcardType) {
            f = ((WildcardType) f).getUpperBounds()[0];
        }
        Class cls2 = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments()[0] : Object.class;
        return new a(kVar, cls2, kVar.e(new b.l.e.f0.a(cls2)), this.f5462h.a(aVar));
    }
}
