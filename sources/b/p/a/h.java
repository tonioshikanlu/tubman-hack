package b.p.a;

import b.l.f.x.a.g;
import b.p.a.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class h<C extends Collection<T>, T> extends l<C> {

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f6383b = new a();
    public final l<T> a;

    public class a implements l.a {
        public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
            l iVar;
            Class<?> B = g.B(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (B == List.class || B == Collection.class) {
                iVar = new i(xVar.b(g.j(type, Collection.class)));
            } else if (B != Set.class) {
                return null;
            } else {
                iVar = new j(xVar.b(g.j(type, Collection.class)));
            }
            return iVar.c();
        }
    }

    public h(l lVar, a aVar) {
        this.a = lVar;
    }

    /* renamed from: f */
    public C a(q qVar) {
        C g2 = g();
        qVar.b();
        while (qVar.N()) {
            g2.add(this.a.a(qVar));
        }
        qVar.q();
        return g2;
    }

    public abstract C g();

    /* renamed from: h */
    public void e(u uVar, C c) {
        uVar.b();
        for (Object e2 : c) {
            this.a.e(uVar, e2);
        }
        uVar.z();
    }

    public String toString() {
        return this.a + ".collection()";
    }
}
