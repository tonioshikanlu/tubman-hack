package b.j.a.c.e0;

import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;

public abstract class h extends a implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final transient g0 f1908h;

    /* renamed from: i  reason: collision with root package name */
    public final transient o f1909i;

    public h(g0 g0Var, o oVar) {
        this.f1908h = g0Var;
        this.f1909i = oVar;
    }

    public h(h hVar) {
        this.f1908h = hVar.f1908h;
        this.f1909i = hVar.f1909i;
    }

    public final <A extends Annotation> A c(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        o oVar = this.f1909i;
        if (oVar == null || (hashMap = oVar.f1934h) == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public final void g(boolean z) {
        Member j2 = j();
        if (j2 != null) {
            g.e(j2, z);
        }
    }

    public abstract Class<?> h();

    public String i() {
        return h().getName() + "#" + d();
    }

    public abstract Member j();

    public abstract Object k(Object obj);

    public final boolean l(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap;
        o oVar = this.f1909i;
        if (oVar == null || (hashMap = oVar.f1934h) == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public abstract a m(o oVar);
}
