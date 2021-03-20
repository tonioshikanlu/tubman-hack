package e.a.a.a.y0.b.a1;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.f;
import e.g;
import e.x.c.i;
import e.x.c.k;
import java.util.Map;

public final class j implements c {
    public final f a = b.q.a.a.g2(g.PUBLICATION, new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.a.g f7788b;
    public final b c;
    public final Map<d, e.a.a.a.y0.j.t.g<?>> d;

    public static final class a extends k implements e.x.b.a<k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j f7789h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(0);
            this.f7789h = jVar;
        }

        public Object e() {
            j jVar = this.f7789h;
            e i2 = jVar.f7788b.i(jVar.c);
            i.d(i2, "builtIns.getBuiltInClassByFqName(fqName)");
            return i2.s();
        }
    }

    public j(e.a.a.a.y0.a.g gVar, b bVar, Map<d, ? extends e.a.a.a.y0.j.t.g<?>> map) {
        i.e(gVar, "builtIns");
        i.e(bVar, "fqName");
        i.e(map, "allValueArguments");
        this.f7788b = gVar;
        this.c = bVar;
        this.d = map;
    }

    public Map<d, e.a.a.a.y0.j.t.g<?>> a() {
        return this.d;
    }

    public d0 d() {
        return (d0) this.a.getValue();
    }

    public b e() {
        return this.c;
    }

    public m0 w() {
        m0 m0Var = m0.a;
        i.d(m0Var, "SourceElement.NO_SOURCE");
        return m0Var;
    }
}
