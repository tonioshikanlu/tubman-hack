package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.y;
import b.j.a.c.z.a;
import java.util.Iterator;

@a
public class r extends b<Iterable<?>> {
    public r(r rVar, d dVar, f fVar, n<?> nVar, Boolean bool) {
        super((b<?>) rVar, dVar, fVar, nVar, bool);
    }

    public r(i iVar, boolean z, f fVar) {
        super((Class<?>) Iterable.class, iVar, z, fVar, (n<Object>) null);
    }

    public boolean d(y yVar, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.lang.Object r3, b.j.a.b.f r4, b.j.a.c.y r5) {
        /*
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Boolean r0 = r2.f2086m
            if (r0 != 0) goto L_0x000e
            b.j.a.c.x r0 = b.j.a.c.x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            boolean r0 = r5.K(r0)
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            java.lang.Boolean r0 = r2.f2086m
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L_0x0032
        L_0x0014:
            if (r3 == 0) goto L_0x002b
            java.util.Iterator r0 = r3.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x002b
            r0.next()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0032
            r2.u(r3, r4, r5)
            goto L_0x003b
        L_0x0032:
            r4.L0()
            r2.u(r3, r4, r5)
            r4.q0()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.r.f(java.lang.Object, b.j.a.b.f, b.j.a.c.y):void");
    }

    public h<?> q(f fVar) {
        return new r(this, this.f2084k, fVar, this.f2088o, this.f2086m);
    }

    public b v(d dVar, f fVar, n nVar, Boolean bool) {
        return new r(this, dVar, fVar, nVar, bool);
    }

    /* renamed from: w */
    public void u(Iterable<?> iterable, b.j.a.b.f fVar, y yVar) {
        n<Object> nVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            f fVar2 = this.f2087n;
            Class<?> cls = null;
            n<Object> nVar2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    yVar.t(fVar);
                } else {
                    n<Object> nVar3 = this.f2088o;
                    if (nVar3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            nVar2 = yVar.A(cls2, this.f2084k);
                            cls = cls2;
                        }
                        nVar = nVar2;
                    } else {
                        n<Object> nVar4 = nVar3;
                        nVar = nVar2;
                        nVar2 = nVar4;
                    }
                    if (fVar2 == null) {
                        nVar2.f(next, fVar, yVar);
                    } else {
                        nVar2.g(next, fVar, yVar, fVar2);
                    }
                    nVar2 = nVar;
                }
            } while (it.hasNext());
        }
    }
}
