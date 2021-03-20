package b.l.a.c.f.e;

import b.e.a.a.a;
import b.l.a.c.f.e.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class i2<KeyProtoT extends e0> {
    public final Class<KeyProtoT> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, h2<?, KeyProtoT>> f3051b;
    public final Class<?> c;

    @SafeVarargs
    public i2(Class<KeyProtoT> cls, h2<?, KeyProtoT>... h2VarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 <= 0) {
            h2<?, KeyProtoT> h2Var = h2VarArr[i2];
            if (hashMap.containsKey(h2Var.a)) {
                String valueOf = String.valueOf(h2Var.a.getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(h2Var.a, h2Var);
                i2++;
            }
        }
        this.c = h2VarArr[0].a;
        this.f3051b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public abstract g9 b();

    public abstract KeyProtoT c(um umVar);

    public abstract void d(KeyProtoT keyprotot);

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        h2 h2Var = this.f3051b.get(cls);
        if (h2Var != null) {
            return h2Var.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException(a.r(new StringBuilder(String.valueOf(canonicalName).length() + 41), "Requested primitive class ", canonicalName, " not supported."));
    }

    public final Set<Class<?>> f() {
        return this.f3051b.keySet();
    }

    public g2<?, KeyProtoT> g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
