package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.e.m;
import e.a.a.a.y0.e.p;
import e.a.a.a.y0.e.z.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.k.b.g0.f;
import e.x.b.l;
import e.x.c.k;
import java.util.Collection;

public abstract class o extends n {

    /* renamed from: n  reason: collision with root package name */
    public final d f9589n;

    /* renamed from: o  reason: collision with root package name */
    public final x f9590o;

    /* renamed from: p  reason: collision with root package name */
    public m f9591p;

    /* renamed from: q  reason: collision with root package name */
    public i f9592q;
    public final e.a.a.a.y0.e.z.a r;
    public final f s = null;

    public static final class a extends k implements l<e.a.a.a.y0.f.a, m0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ o f9593h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(1);
            this.f9593h = oVar;
        }

        public Object invoke(Object obj) {
            e.x.c.i.e((e.a.a.a.y0.f.a) obj, "it");
            f fVar = this.f9593h.s;
            if (fVar != null) {
                return fVar;
            }
            m0 m0Var = m0.a;
            e.x.c.i.d(m0Var, "SourceElement.NO_SOURCE");
            return m0Var;
        }
    }

    public static final class b extends k implements e.x.b.a<Collection<? extends e.a.a.a.y0.f.d>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ o f9594h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(o oVar) {
            super(0);
            this.f9594h = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0013 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e() {
            /*
                r5 = this;
                e.a.a.a.y0.k.b.o r0 = r5.f9594h
                e.a.a.a.y0.k.b.x r0 = r0.f9590o
                java.util.Map<e.a.a.a.y0.f.a, e.a.a.a.y0.e.c> r0 = r0.a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0013:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0039
                java.lang.Object r2 = r0.next()
                r3 = r2
                e.a.a.a.y0.f.a r3 = (e.a.a.a.y0.f.a) r3
                boolean r4 = r3.k()
                if (r4 != 0) goto L_0x0032
                e.a.a.a.y0.k.b.h r4 = e.a.a.a.y0.k.b.h.d
                java.util.Set<e.a.a.a.y0.f.a> r4 = e.a.a.a.y0.k.b.h.c
                boolean r3 = r4.contains(r3)
                if (r3 != 0) goto L_0x0032
                r3 = 1
                goto L_0x0033
            L_0x0032:
                r3 = 0
            L_0x0033:
                if (r3 == 0) goto L_0x0013
                r1.add(r2)
                goto L_0x0013
            L_0x0039:
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = b.q.a.a.C(r1, r2)
                r0.<init>(r2)
                java.util.Iterator r1 = r1.iterator()
            L_0x0048:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x005c
                java.lang.Object r2 = r1.next()
                e.a.a.a.y0.f.a r2 = (e.a.a.a.y0.f.a) r2
                e.a.a.a.y0.f.d r2 = r2.j()
                r0.add(r2)
                goto L_0x0048
            L_0x005c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.o.b.e():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(e.a.a.a.y0.f.b bVar, e.a.a.a.y0.l.m mVar, w wVar, m mVar2, e.a.a.a.y0.e.z.a aVar, f fVar) {
        super(bVar, mVar, wVar);
        e.x.c.i.e(bVar, "fqName");
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(wVar, "module");
        e.x.c.i.e(mVar2, "proto");
        e.x.c.i.e(aVar, "metadataVersion");
        this.r = aVar;
        p pVar = mVar2.f8971k;
        e.x.c.i.d(pVar, "proto.strings");
        e.a.a.a.y0.e.o oVar = mVar2.f8972l;
        e.x.c.i.d(oVar, "proto.qualifiedNames");
        d dVar = new d(pVar, oVar);
        this.f9589n = dVar;
        this.f9590o = new x(mVar2, dVar, aVar, new a(this));
        this.f9591p = mVar2;
    }

    public void K0(j jVar) {
        e.x.c.i.e(jVar, "components");
        m mVar = this.f9591p;
        if (mVar != null) {
            this.f9591p = null;
            e.a.a.a.y0.e.l lVar = mVar.f8973m;
            e.x.c.i.d(lVar, "proto.`package`");
            this.f9592q = new e.a.a.a.y0.k.b.g0.i(this, lVar, this.f9589n, this.r, this.s, jVar, new b(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    public g w0() {
        return this.f9590o;
    }

    public i z() {
        i iVar = this.f9592q;
        if (iVar != null) {
            return iVar;
        }
        e.x.c.i.m("_memberScope");
        throw null;
    }
}
