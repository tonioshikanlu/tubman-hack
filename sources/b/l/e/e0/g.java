package b.l.e.e0;

import b.l.e.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class g {
    public final Map<Type, m<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final b.l.e.e0.a0.b f5428b = b.l.e.e0.a0.b.a;

    public class a implements t<T> {
        public final /* synthetic */ m a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f5429b;

        public a(g gVar, m mVar, Type type) {
            this.a = mVar;
            this.f5429b = type;
        }

        public T a() {
            return this.a.a(this.f5429b);
        }
    }

    public class b implements t<T> {
        public final /* synthetic */ m a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f5430b;

        public b(g gVar, m mVar, Type type) {
            this.a = mVar;
            this.f5430b = type;
        }

        public T a() {
            return this.a.a(this.f5430b);
        }
    }

    public g(Map<Type, m<?>> map) {
        this.a = map;
    }

    public <T> t<T> a(b.l.e.f0.a<T> aVar) {
        h hVar;
        Type type = aVar.f5519b;
        Class<? super T> cls = aVar.a;
        m mVar = this.a.get(type);
        if (mVar != null) {
            return new a(this, mVar, type);
        }
        m mVar2 = this.a.get(cls);
        if (mVar2 != null) {
            return new b(this, mVar2, type);
        }
        t<T> tVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f5428b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            tVar = SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                tVar = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                tVar = new b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                tVar = new c(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a2 = a.a(type2);
                    Class<?> e2 = a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e2)) {
                        tVar = new d(this);
                    }
                }
                tVar = new e(this);
            }
        }
        if (tVar != null) {
            return tVar;
        }
        return new f(this, cls, type);
    }

    public String toString() {
        return this.a.toString();
    }
}
