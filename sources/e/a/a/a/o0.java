package e.a.a.a;

import e.x.b.a;

public class o0<T> extends p0<T> {

    /* renamed from: i  reason: collision with root package name */
    public final a<T> f7571i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Object f7572j;

    public o0(a<T> aVar) {
        if (aVar != null) {
            this.f7572j = null;
            this.f7571i = aVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
    }

    public T e() {
        T t = p0.f7574h;
        T t2 = this.f7572j;
        if (t2 == null) {
            T e2 = this.f7571i.e();
            if (e2 != null) {
                t = e2;
            }
            this.f7572j = t;
            return e2;
        } else if (t2 == t) {
            return null;
        } else {
            return t2;
        }
    }
}
