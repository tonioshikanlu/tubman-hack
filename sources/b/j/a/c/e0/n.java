package b.j.a.c.e0;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class n {

    /* renamed from: b  reason: collision with root package name */
    public static final b.j.a.c.j0.b f1927b = new c();
    public final Object a;

    public static class a extends n {
        public static final a c = new a((Object) null);

        public a(Object obj) {
            super((Object) null);
        }

        public n a(Annotation annotation) {
            return new e(this.a, annotation.annotationType(), annotation);
        }

        public o b() {
            return new o();
        }

        public b.j.a.c.j0.b c() {
            return n.f1927b;
        }

        public boolean d(Annotation annotation) {
            return false;
        }
    }

    public static class b extends n {
        public final HashMap<Class<?>, Annotation> c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        public n a(Annotation annotation) {
            this.c.put(annotation.annotationType(), annotation);
            return this;
        }

        public o b() {
            o oVar = new o();
            for (Annotation next : this.c.values()) {
                if (oVar.f1934h == null) {
                    oVar.f1934h = new HashMap<>();
                }
                Annotation put = oVar.f1934h.put(next.annotationType(), next);
                if (put != null) {
                    boolean equals = put.equals(next);
                }
            }
            return oVar;
        }

        public b.j.a.c.j0.b c() {
            if (this.c.size() != 2) {
                return new o(this.c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.c.entrySet().iterator();
            Map.Entry next = it.next();
            Map.Entry next2 = it.next();
            return new f((Class) next.getKey(), (Annotation) next.getValue(), (Class) next2.getKey(), (Annotation) next2.getValue());
        }

        public boolean d(Annotation annotation) {
            return this.c.containsKey(annotation.annotationType());
        }
    }

    public static class c implements b.j.a.c.j0.b, Serializable {
        public <A extends Annotation> A a(Class<A> cls) {
            return null;
        }

        public int size() {
            return 0;
        }
    }

    public static class d implements b.j.a.c.j0.b, Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f1928h;

        /* renamed from: i  reason: collision with root package name */
        public final Annotation f1929i;

        public d(Class<?> cls, Annotation annotation) {
            this.f1928h = cls;
            this.f1929i = annotation;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.f1928h == cls) {
                return this.f1929i;
            }
            return null;
        }

        public int size() {
            return 1;
        }
    }

    public static class e extends n {
        public Class<?> c;
        public Annotation d;

        public e(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.c = cls;
            this.d = annotation;
        }

        public n a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.c;
            if (cls != annotationType) {
                return new b(this.a, cls, this.d, annotationType, annotation);
            }
            this.d = annotation;
            return this;
        }

        public o b() {
            Class<?> cls = this.c;
            Annotation annotation = this.d;
            HashMap hashMap = new HashMap(4);
            hashMap.put(cls, annotation);
            return new o(hashMap);
        }

        public b.j.a.c.j0.b c() {
            return new d(this.c, this.d);
        }

        public boolean d(Annotation annotation) {
            return annotation.annotationType() == this.c;
        }
    }

    public static class f implements b.j.a.c.j0.b, Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f1930h;

        /* renamed from: i  reason: collision with root package name */
        public final Class<?> f1931i;

        /* renamed from: j  reason: collision with root package name */
        public final Annotation f1932j;

        /* renamed from: k  reason: collision with root package name */
        public final Annotation f1933k;

        public f(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.f1930h = cls;
            this.f1932j = annotation;
            this.f1931i = cls2;
            this.f1933k = annotation2;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.f1930h == cls) {
                return this.f1932j;
            }
            if (this.f1931i == cls) {
                return this.f1933k;
            }
            return null;
        }

        public int size() {
            return 2;
        }
    }

    public n(Object obj) {
        this.a = obj;
    }

    public abstract n a(Annotation annotation);

    public abstract o b();

    public abstract b.j.a.c.j0.b c();

    public abstract boolean d(Annotation annotation);
}
