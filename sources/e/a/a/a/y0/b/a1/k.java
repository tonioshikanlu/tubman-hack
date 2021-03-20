package e.a.a.a.y0.b.a1;

import e.b0.e;
import e.b0.f;
import e.b0.h;
import e.b0.s;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k implements h {

    /* renamed from: h  reason: collision with root package name */
    public final List<h> f7790h;

    public static final class a extends e.x.c.k implements l<h, c> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.f.b f7791h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.a.a.a.y0.f.b bVar) {
            super(1);
            this.f7791h = bVar;
        }

        public Object invoke(Object obj) {
            h hVar = (h) obj;
            i.e(hVar, "it");
            return hVar.i(this.f7791h);
        }
    }

    public static final class b extends e.x.c.k implements l<h, h<? extends c>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f7792h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            h hVar = (h) obj;
            i.e(hVar, "it");
            return g.d(hVar);
        }
    }

    public k(List<? extends h> list) {
        i.e(list, "delegates");
        this.f7790h = list;
    }

    public k(h... hVarArr) {
        i.e(hVarArr, "delegates");
        List<h> g3 = b.q.a.a.g3(hVarArr);
        i.e(g3, "delegates");
        this.f7790h = g3;
    }

    public c i(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        h<R> h2 = s.h(g.d(this.f7790h), new a(bVar));
        i.e(h2, "$this$firstOrNull");
        e.a aVar = (e.a) ((e) h2).iterator();
        return (c) (!aVar.hasNext() ? null : aVar.next());
    }

    public boolean isEmpty() {
        List<h> list = this.f7790h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (h isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<c> iterator() {
        return new f.a((f) s.e(g.d(this.f7790h), b.f7792h));
    }

    public boolean x(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        Iterator it = ((e.t.l) g.d(this.f7790h)).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).x(bVar)) {
                return true;
            }
        }
        return false;
    }
}
