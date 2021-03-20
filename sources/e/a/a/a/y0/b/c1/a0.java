package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.t;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.g.a;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.l.g;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.l1.n;
import e.f;
import e.t.o;
import e.t.p;
import e.t.q;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a0 extends m implements w {

    /* renamed from: j  reason: collision with root package name */
    public final Map<w.a<?>, Object> f8155j;

    /* renamed from: k  reason: collision with root package name */
    public w f8156k;

    /* renamed from: l  reason: collision with root package name */
    public z f8157l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8158m;

    /* renamed from: n  reason: collision with root package name */
    public final g<b, b0> f8159n;

    /* renamed from: o  reason: collision with root package name */
    public final f f8160o;

    /* renamed from: p  reason: collision with root package name */
    public final m f8161p;

    /* renamed from: q  reason: collision with root package name */
    public final e.a.a.a.y0.a.g f8162q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(d dVar, m mVar, e.a.a.a.y0.a.g gVar, a aVar, Map map, d dVar2, int i2) {
        super(h.a.a, dVar);
        p pVar = (i2 & 16) != 0 ? p.f7935h : null;
        i.e(dVar, "moduleName");
        i.e(mVar, "storageManager");
        i.e(gVar, "builtIns");
        i.e(pVar, "capabilities");
        Objects.requireNonNull(h.f7785e);
        this.f8161p = mVar;
        this.f8162q = gVar;
        if (dVar.f9211i) {
            Map<w.a<?>, Object> b0 = e.t.g.b0(pVar);
            this.f8155j = b0;
            b0.put(e.a.a.a.y0.m.l1.g.a, new n(null));
            this.f8158m = true;
            this.f8159n = mVar.h(new z(this));
            this.f8160o = b.q.a.a.h2(new y(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + dVar);
    }

    public <T> T E0(w.a<T> aVar) {
        i.e(aVar, "capability");
        T t = this.f8155j.get(aVar);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public boolean I(w wVar) {
        i.e(wVar, "targetModule");
        if (i.a(this, wVar)) {
            return true;
        }
        w wVar2 = this.f8156k;
        i.c(wVar2);
        return e.t.g.e(wVar2.a(), wVar) || i0().contains(wVar) || wVar.i0().contains(this);
    }

    public final void K0(a0... a0VarArr) {
        i.e(a0VarArr, "descriptors");
        List g3 = b.q.a.a.g3(a0VarArr);
        i.e(g3, "descriptors");
        q qVar = q.f7936h;
        i.e(g3, "descriptors");
        i.e(qVar, "friends");
        x xVar = new x(g3, qVar, o.f7934h);
        i.e(xVar, "dependencies");
        this.f8156k = xVar;
    }

    public k b() {
        return null;
    }

    public List<w> i0() {
        w wVar = this.f8156k;
        if (wVar != null) {
            return wVar.c();
        }
        StringBuilder y = b.e.a.a.a.y("Dependencies of module ");
        y.append(w0());
        y.append(" were not set");
        throw new AssertionError(y.toString());
    }

    public void j0() {
        if (!this.f8158m) {
            throw new t("Accessing invalid module descriptor " + this);
        }
    }

    public <R, D> R l0(e.a.a.a.y0.b.m<R, D> mVar, D d) {
        i.e(mVar, "visitor");
        i.e(mVar, "visitor");
        return mVar.g(this, d);
    }

    public b0 o0(b bVar) {
        i.e(bVar, "fqName");
        j0();
        return (b0) ((e.m) this.f8159n).invoke(bVar);
    }

    public e.a.a.a.y0.a.g v() {
        return this.f8162q;
    }

    public final String w0() {
        String str = getName().f9210h;
        i.d(str, "name.toString()");
        return str;
    }

    public Collection<b> y(b bVar, l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        j0();
        j0();
        return ((l) this.f8160o.getValue()).y(bVar, lVar);
    }
}
