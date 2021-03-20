package b.l.a.c.f.i;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class x6 {
    public static final x6 c = new x6();
    public final b7 a = new j6();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, a7<?>> f3808b = new ConcurrentHashMap();

    public final <T> a7<T> a(Class<T> cls) {
        m6 m6Var;
        d5<?> d5Var;
        n7<?, ?> n7Var;
        f6 f6Var;
        u6 u6Var;
        m6 m6Var2;
        n7<?, ?> n7Var2;
        f6 f6Var2;
        u6 u6Var2;
        t6 t6Var;
        Class<?> cls2;
        Charset charset = w5.a;
        Objects.requireNonNull(cls, "messageType");
        a7<T> a7Var = (a7) this.f3808b.get(cls);
        if (a7Var == null) {
            j6 j6Var = (j6) this.a;
            Objects.requireNonNull(j6Var);
            Class<p5> cls3 = p5.class;
            Class<?> cls4 = c7.a;
            if (cls3.isAssignableFrom(cls) || (cls2 = c7.a) == null || cls2.isAssignableFrom(cls)) {
                o6 b2 = j6Var.a.b(cls);
                boolean a2 = b2.a();
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                if (a2) {
                    if (isAssignableFrom) {
                        n7<?, ?> n7Var3 = c7.d;
                        d5<?> d5Var2 = f5.a;
                        t6Var = new t6(n7Var3, f5.a, b2.b());
                    } else {
                        n7<?, ?> n7Var4 = c7.f3509b;
                        d5<?> d5Var3 = f5.f3551b;
                        if (d5Var3 != null) {
                            t6Var = new t6(n7Var4, d5Var3, b2.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    a7Var = t6Var;
                } else {
                    boolean z = false;
                    d5<?> d5Var4 = null;
                    if (isAssignableFrom) {
                        if (b2.c() == 1) {
                            z = true;
                        }
                        if (z) {
                            u6Var2 = v6.f3783b;
                            f6Var2 = f6.f3552b;
                            n7Var2 = c7.d;
                            d5<?> d5Var5 = f5.a;
                            d5Var4 = f5.a;
                        } else {
                            u6Var2 = v6.f3783b;
                            f6Var2 = f6.f3552b;
                            n7Var2 = c7.d;
                        }
                        m6Var2 = n6.f3665b;
                    } else {
                        if (b2.c() == 1) {
                            z = true;
                        }
                        if (z) {
                            u6 u6Var3 = v6.a;
                            f6 f6Var3 = f6.a;
                            n7<?, ?> n7Var5 = c7.f3509b;
                            d5<?> d5Var6 = f5.f3551b;
                            if (d5Var6 != null) {
                                m6Var = n6.a;
                                d5Var = d5Var6;
                                u6Var = u6Var3;
                                n7Var = n7Var5;
                                f6Var = f6Var3;
                                a7Var = s6.B(b2, u6Var, f6Var, n7Var, d5Var, m6Var);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            u6Var2 = v6.a;
                            f6Var2 = f6.a;
                            n7Var2 = c7.c;
                            m6Var2 = n6.a;
                        }
                    }
                    m6Var = m6Var2;
                    d5Var = d5Var4;
                    f6Var = f6Var2;
                    n7Var = n7Var2;
                    u6Var = u6Var2;
                    a7Var = s6.B(b2, u6Var, f6Var, n7Var, d5Var, m6Var);
                }
                a7<T> putIfAbsent = this.f3808b.putIfAbsent(cls, a7Var);
                return putIfAbsent == null ? a7Var : putIfAbsent;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
