package e.a.a.a.y0.k.b;

import e.a.a.a.y0.a.p.j;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.k.b.f0.c;
import e.a.a.a.y0.l.h;
import e.a.a.a.y0.l.m;
import e.t.g;
import e.t.q;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class a implements z {
    public j a;

    /* renamed from: b  reason: collision with root package name */
    public final h<b, y> f9480b;
    public final m c;
    public final s d;

    /* renamed from: e  reason: collision with root package name */
    public final w f9481e;

    /* renamed from: e.a.a.a.y0.k.b.a$a  reason: collision with other inner class name */
    public static final class C0216a extends k implements l<b, y> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f9482h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0216a(a aVar) {
            super(1);
            this.f9482h = aVar;
        }

        public Object invoke(Object obj) {
            b bVar = (b) obj;
            i.e(bVar, "fqName");
            j jVar = (j) this.f9482h;
            Objects.requireNonNull(jVar);
            i.e(bVar, "fqName");
            InputStream b2 = jVar.d.b(bVar);
            c P0 = b2 != null ? c.P0(bVar, jVar.c, jVar.f9481e, b2, false) : null;
            if (P0 == null) {
                return null;
            }
            j jVar2 = this.f9482h.a;
            if (jVar2 != null) {
                P0.K0(jVar2);
                return P0;
            }
            i.m("components");
            throw null;
        }
    }

    public a(m mVar, s sVar, w wVar) {
        i.e(mVar, "storageManager");
        i.e(sVar, "finder");
        i.e(wVar, "moduleDescriptor");
        this.c = mVar;
        this.d = sVar;
        this.f9481e = wVar;
        this.f9480b = mVar.i(new C0216a(this));
    }

    public List<y> a(b bVar) {
        i.e(bVar, "fqName");
        return g.C(this.f9480b.invoke(bVar));
    }

    public Collection<b> y(b bVar, l<? super d, Boolean> lVar) {
        i.e(bVar, "fqName");
        i.e(lVar, "nameFilter");
        return q.f7936h;
    }
}
