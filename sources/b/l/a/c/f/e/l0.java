package b.l.a.c.f.e;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class l0 {
    public static final l0 c = new l0();
    public final p0 a = new w();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, o0<?>> f3118b = new ConcurrentHashMap();

    public final <T> o0<T> a(Class<T> cls) {
        a0 a0Var;
        gn<?> gnVar;
        c1<?, ?> c1Var;
        s sVar;
        i0 i0Var;
        a0 a0Var2;
        c1<?, ?> c1Var2;
        s sVar2;
        i0 i0Var2;
        h0 h0Var;
        Class<?> cls2;
        Charset charset = j.a;
        Objects.requireNonNull(cls, "messageType");
        o0<T> o0Var = (o0) this.f3118b.get(cls);
        if (o0Var == null) {
            w wVar = (w) this.a;
            Objects.requireNonNull(wVar);
            Class<e> cls3 = e.class;
            Class<?> cls4 = q0.a;
            if (cls3.isAssignableFrom(cls) || (cls2 = q0.a) == null || cls2.isAssignableFrom(cls)) {
                c0 b2 = wVar.a.b(cls);
                boolean a2 = b2.a();
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                if (a2) {
                    if (isAssignableFrom) {
                        c1<?, ?> c1Var3 = q0.d;
                        gn<?> gnVar2 = in.a;
                        h0Var = new h0(c1Var3, in.a, b2.b());
                    } else {
                        c1<?, ?> c1Var4 = q0.f3240b;
                        gn<?> gnVar3 = in.f3082b;
                        if (gnVar3 != null) {
                            h0Var = new h0(c1Var4, gnVar3, b2.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    o0Var = h0Var;
                } else {
                    boolean z = false;
                    gn<?> gnVar4 = null;
                    if (isAssignableFrom) {
                        if (b2.c() == 1) {
                            z = true;
                        }
                        if (z) {
                            i0Var2 = j0.f3084b;
                            sVar2 = s.f3266b;
                            c1Var2 = q0.d;
                            gn<?> gnVar5 = in.a;
                            gnVar4 = in.a;
                        } else {
                            i0Var2 = j0.f3084b;
                            sVar2 = s.f3266b;
                            c1Var2 = q0.d;
                        }
                        a0Var2 = b0.f2857b;
                    } else {
                        if (b2.c() == 1) {
                            z = true;
                        }
                        if (z) {
                            i0 i0Var3 = j0.a;
                            s sVar3 = s.a;
                            c1<?, ?> c1Var5 = q0.f3240b;
                            gn<?> gnVar6 = in.f3082b;
                            if (gnVar6 != null) {
                                a0Var = b0.a;
                                gnVar = gnVar6;
                                i0Var = i0Var3;
                                c1Var = c1Var5;
                                sVar = sVar3;
                                o0Var = g0.F(b2, i0Var, sVar, c1Var, gnVar, a0Var);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            i0Var2 = j0.a;
                            sVar2 = s.a;
                            c1Var2 = q0.c;
                            a0Var2 = b0.a;
                        }
                    }
                    a0Var = a0Var2;
                    gnVar = gnVar4;
                    sVar = sVar2;
                    c1Var = c1Var2;
                    i0Var = i0Var2;
                    o0Var = g0.F(b2, i0Var, sVar, c1Var, gnVar, a0Var);
                }
                o0<T> putIfAbsent = this.f3118b.putIfAbsent(cls, o0Var);
                return putIfAbsent == null ? o0Var : putIfAbsent;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
