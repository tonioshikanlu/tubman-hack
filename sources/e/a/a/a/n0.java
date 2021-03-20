package e.a.a.a;

import e.x.b.a;
import java.lang.ref.SoftReference;

public class n0<T> extends p0<T> implements a<T> {

    /* renamed from: i  reason: collision with root package name */
    public final a<T> f7568i;

    /* renamed from: j  reason: collision with root package name */
    public volatile SoftReference<Object> f7569j;

    public n0(T t, a<T> aVar) {
        if (aVar != null) {
            this.f7569j = null;
            this.f7568i = aVar;
            if (t != null) {
                this.f7569j = new SoftReference<>(t);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
    }

    public T e() {
        T t;
        T t2 = p0.f7574h;
        SoftReference<Object> softReference = this.f7569j;
        if (softReference == null || (t = softReference.get()) == null) {
            T e2 = this.f7568i.e();
            if (e2 != null) {
                t2 = e2;
            }
            this.f7569j = new SoftReference<>(t2);
            return e2;
        } else if (t == t2) {
            return null;
        } else {
            return t;
        }
    }
}
