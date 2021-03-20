package b.j.a.c.b0.z;

import b.j.a.b.l;
import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.e0.h;
import b.j.a.c.e0.i;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.b;
import b.j.a.c.p;
import b.j.a.c.t;
import java.lang.reflect.Method;

public final class n extends u {
    public final i w;
    public final transient Method x;
    public final boolean y;

    public n(n nVar, j<?> jVar, r rVar) {
        super(nVar, jVar, rVar);
        this.w = nVar.w;
        this.x = nVar.x;
        this.y = p.a(rVar);
    }

    public n(n nVar, t tVar) {
        super(nVar, tVar);
        this.w = nVar.w;
        this.x = nVar.x;
        this.y = nVar.y;
    }

    public n(b.j.a.c.e0.r rVar, b.j.a.c.i iVar, c cVar, b bVar, i iVar2) {
        super(rVar, iVar, cVar, bVar);
        this.w = iVar2;
        this.x = iVar2.f1913k;
        this.y = p.a(this.f1802q);
    }

    public final void B(Object obj, Object obj2) {
        try {
            this.x.invoke(obj, new Object[]{obj2});
        } catch (Exception e2) {
            a((b.j.a.b.i) null, e2, obj2);
            throw null;
        }
    }

    public Object D(Object obj, Object obj2) {
        try {
            Object invoke = this.x.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e2) {
            a((b.j.a.b.i) null, e2, obj2);
            throw null;
        }
    }

    public u G(t tVar) {
        return new n(this, tVar);
    }

    public u H(r rVar) {
        return new n(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new n(this, jVar, this.f1802q);
    }

    public h e() {
        return this.w;
    }

    public void f(b.j.a.b.i iVar, g gVar, Object obj) {
        Object obj2;
        if (!iVar.L0(l.VALUE_NULL)) {
            c cVar = this.f1801p;
            if (cVar == null) {
                obj2 = this.f1800o.d(iVar, gVar);
                if (obj2 == null) {
                    if (this.y) {
                        return;
                    }
                }
            } else {
                obj2 = this.f1800o.f(iVar, gVar, cVar);
            }
            this.x.invoke(obj, new Object[]{obj2});
        } else if (this.y) {
            return;
        }
        obj2 = this.f1802q.c(gVar);
        try {
            this.x.invoke(obj, new Object[]{obj2});
        } catch (Exception e2) {
            a(iVar, e2, obj2);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(b.j.a.b.i r4, b.j.a.c.g r5, java.lang.Object r6) {
        /*
            r3 = this;
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_NULL
            boolean r0 = r4.L0(r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r3.y
            if (r0 == 0) goto L_0x001e
            return r6
        L_0x000d:
            b.j.a.c.f0.c r0 = r3.f1801p
            if (r0 != 0) goto L_0x0025
            b.j.a.c.j<java.lang.Object> r0 = r3.f1800o
            java.lang.Object r0 = r0.d(r4, r5)
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3.y
            if (r0 == 0) goto L_0x001e
            return r6
        L_0x001e:
            b.j.a.c.b0.r r0 = r3.f1802q
            java.lang.Object r0 = r0.c(r5)
            goto L_0x002b
        L_0x0025:
            b.j.a.c.j<java.lang.Object> r1 = r3.f1800o
            java.lang.Object r0 = r1.f(r4, r5, r0)
        L_0x002b:
            java.lang.reflect.Method r5 = r3.x     // Catch:{ Exception -> 0x003c }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003c }
            r2 = 0
            r1[r2] = r0     // Catch:{ Exception -> 0x003c }
            java.lang.Object r4 = r5.invoke(r6, r1)     // Catch:{ Exception -> 0x003c }
            if (r4 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r6 = r4
        L_0x003b:
            return r6
        L_0x003c:
            r5 = move-exception
            r3.a(r4, r5, r0)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.z.n.g(b.j.a.b.i, b.j.a.c.g, java.lang.Object):java.lang.Object");
    }

    public void k(f fVar) {
        this.w.g(fVar.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }
}
