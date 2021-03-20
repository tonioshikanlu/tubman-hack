package b.j.a.c.e0;

import b.j.a.c.a0.g;
import b.j.a.c.a0.h;
import b.j.a.c.b;
import b.j.a.c.e0.n;
import b.j.a.c.e0.s;
import b.j.a.c.i;
import b.j.a.c.i0.m;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

public class c {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f1897h = 0;
    public final g<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1898b;
    public final s.a c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1899e;
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f1900g;

    public c(g<?> gVar, i iVar, s.a aVar) {
        this.a = gVar;
        this.f1899e = iVar;
        Class<?> cls = iVar.f2152h;
        this.f = cls;
        this.c = aVar;
        this.d = iVar.j();
        this.f1898b = gVar.n() ? gVar.e() : null;
        this.f1900g = ((h) gVar).a(cls);
    }

    public static b e(g<?> gVar, Class<?> cls) {
        if (cls.isArray()) {
            if (gVar == null || ((h) gVar).a(cls) == null) {
                return new b(cls);
            }
        }
        c cVar = new c(gVar, cls, (s.a) gVar);
        List emptyList = Collections.emptyList();
        Class<?> cls2 = cVar.f;
        Class<?> cls3 = cVar.f1900g;
        b.j.a.c.j0.b d2 = cVar.d(emptyList);
        m mVar = cVar.d;
        b bVar = cVar.f1898b;
        g<?> gVar2 = cVar.a;
        return new b((i) null, cls2, emptyList, cls3, d2, mVar, bVar, gVar2, gVar2.f1609i.f1589k);
    }

    public final n a(n nVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!nVar.d(annotation)) {
                    nVar = nVar.a(annotation);
                    if (this.f1898b.k0(annotation)) {
                        nVar = c(nVar, annotation);
                    }
                }
            }
        }
        return nVar;
    }

    public final n b(n nVar, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            nVar = a(nVar, b.j.a.c.j0.g.j(cls2));
            for (Class<?> j2 : b.j.a.c.j0.g.l(cls2, cls, false)) {
                nVar = a(nVar, b.j.a.c.j0.g.j(j2));
            }
        }
        return nVar;
    }

    public final n c(n nVar, Annotation annotation) {
        for (Annotation annotation2 : b.j.a.c.j0.g.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !nVar.d(annotation2)) {
                nVar = nVar.a(annotation2);
                if (this.f1898b.k0(annotation2)) {
                    nVar = c(nVar, annotation2);
                }
            }
        }
        return nVar;
    }

    public final b.j.a.c.j0.b d(List<i> list) {
        Class<Object> cls = Object.class;
        if (this.f1898b == null) {
            return n.f1927b;
        }
        n nVar = n.a.c;
        Class<?> cls2 = this.f1900g;
        if (cls2 != null) {
            nVar = b(nVar, this.f, cls2);
        }
        n a2 = a(nVar, b.j.a.c.j0.g.j(this.f));
        for (i next : list) {
            s.a aVar = this.c;
            if (aVar != null) {
                Class<?> cls3 = next.f2152h;
                a2 = b(a2, cls3, aVar.a(cls3));
            }
            a2 = a(a2, b.j.a.c.j0.g.j(next.f2152h));
        }
        s.a aVar2 = this.c;
        if (aVar2 != null) {
            a2 = b(a2, cls, aVar2.a(cls));
        }
        return a2.c();
    }

    public c(g<?> gVar, Class<?> cls, s.a aVar) {
        this.a = gVar;
        b bVar = null;
        this.f1899e = null;
        this.f = cls;
        this.c = aVar;
        this.d = m.f2173n;
        if (gVar == null) {
            this.f1898b = null;
            this.f1900g = null;
            return;
        }
        this.f1898b = gVar.n() ? gVar.e() : bVar;
        this.f1900g = ((h) gVar).a(cls);
    }
}
