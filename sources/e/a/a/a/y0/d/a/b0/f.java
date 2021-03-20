package e.a.a.a.y0.d.a.b0;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.d.a.d0.d;
import e.a.a.a.y0.f.b;
import e.b0.e;
import e.b0.r;
import e.b0.s;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Iterator;

public final class f implements h {

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.l.h<e.a.a.a.y0.d.a.d0.a, c> f8359h;

    /* renamed from: i  reason: collision with root package name */
    public final h f8360i;

    /* renamed from: j  reason: collision with root package name */
    public final d f8361j;

    public static final class a extends k implements l<e.a.a.a.y0.d.a.d0.a, c> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ f f8362h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f8362h = fVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.d.a.d0.a aVar = (e.a.a.a.y0.d.a.d0.a) obj;
            i.e(aVar, "annotation");
            return e.a.a.a.y0.d.a.z.c.f8609k.b(aVar, this.f8362h.f8360i);
        }
    }

    public f(h hVar, d dVar) {
        i.e(hVar, "c");
        i.e(dVar, "annotationOwner");
        this.f8360i = hVar;
        this.f8361j = dVar;
        this.f8359h = hVar.c.a.i(new a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.f8359h.invoke(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.b.a1.c i(e.a.a.a.y0.f.b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "fqName"
            e.x.c.i.e(r4, r0)
            e.a.a.a.y0.d.a.d0.d r0 = r3.f8361j
            e.a.a.a.y0.d.a.d0.a r0 = r0.i(r4)
            if (r0 == 0) goto L_0x0018
            e.a.a.a.y0.l.h<e.a.a.a.y0.d.a.d0.a, e.a.a.a.y0.b.a1.c> r1 = r3.f8359h
            java.lang.Object r0 = r1.invoke(r0)
            e.a.a.a.y0.b.a1.c r0 = (e.a.a.a.y0.b.a1.c) r0
            if (r0 == 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            e.a.a.a.y0.d.a.z.c r0 = e.a.a.a.y0.d.a.z.c.f8609k
            e.a.a.a.y0.d.a.d0.d r1 = r3.f8361j
            e.a.a.a.y0.d.a.b0.h r2 = r3.f8360i
            e.a.a.a.y0.b.a1.c r0 = r0.a(r4, r1, r2)
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.f.i(e.a.a.a.y0.f.b):e.a.a.a.y0.b.a1.c");
    }

    public boolean isEmpty() {
        return this.f8361j.k().isEmpty() && !this.f8361j.u();
    }

    public Iterator<c> iterator() {
        e.b0.h<c> g2 = s.g(g.d(this.f8361j.k()), this.f8359h);
        e.a.a.a.y0.d.a.z.c cVar = e.a.a.a.y0.d.a.z.c.f8609k;
        b bVar = e.a.a.a.y0.a.g.f7647k.t;
        i.d(bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        e.b0.h<c> i2 = s.i(g2, cVar.a(bVar, this.f8361j, this.f8360i));
        i.e(i2, "$this$filterNotNull");
        return new e.a((e) s.d(i2, r.f9867h));
    }

    public boolean x(b bVar) {
        i.e(bVar, "fqName");
        return b.q.a.a.n1(this, bVar);
    }
}
