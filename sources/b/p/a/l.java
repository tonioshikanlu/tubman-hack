package b.p.a;

import b.p.a.q;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import o.e;

public abstract class l<T> {

    public interface a {
        l<?> a(Type type, Set<? extends Annotation> set, x xVar);
    }

    public abstract T a(q qVar);

    public final T b(String str) {
        e eVar = new e();
        eVar.y0(str);
        r rVar = new r(eVar);
        T a2 = a(rVar);
        if (rVar.g0() == q.b.END_DOCUMENT) {
            return a2;
        }
        throw new n("JSON document was not fully consumed.");
    }

    public final l<T> c() {
        return this instanceof b.p.a.z.a ? this : new b.p.a.z.a(this);
    }

    public final String d(T t) {
        e eVar = new e();
        try {
            e(new s(eVar), t);
            return eVar.m0();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract void e(u uVar, T t);
}
