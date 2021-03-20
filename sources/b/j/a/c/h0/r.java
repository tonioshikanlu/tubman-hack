package b.j.a.c.h0;

import b.j.a.a.r;
import b.j.a.b.f;
import b.j.a.c.a0.g;
import b.j.a.c.e0.b;
import b.j.a.c.h0.s.l;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.y;
import java.io.Serializable;

public abstract class r extends c implements Serializable {
    public r() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r0.f1353h;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(b.j.a.c.e0.r r15, b.j.a.c.j0.b r16, b.j.a.c.i r17, b.j.a.c.n<?> r18, b.j.a.c.f0.f r19, b.j.a.c.i r20, b.j.a.a.r.b r21, java.lang.Class<?>[] r22) {
        /*
            r14 = this;
            r0 = r21
            b.j.a.a.r$a r1 = b.j.a.a.r.a.USE_DEFAULTS
            b.j.a.a.r$a r2 = b.j.a.a.r.a.ALWAYS
            b.j.a.c.e0.h r5 = r15.A()
            if (r0 != 0) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            b.j.a.a.r$a r3 = r0.f1353h
            if (r3 == r2) goto L_0x0015
            if (r3 == r1) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r11 = r3
            if (r0 != 0) goto L_0x001d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x001b:
            r12 = r0
            goto L_0x002d
        L_0x001d:
            b.j.a.a.r$a r0 = r0.f1353h
            if (r0 == r2) goto L_0x002b
            b.j.a.a.r$a r2 = b.j.a.a.r.a.NON_NULL
            if (r0 == r2) goto L_0x002b
            if (r0 != r1) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            b.j.a.a.r$a r0 = b.j.a.a.r.a.NON_EMPTY
            goto L_0x001b
        L_0x002b:
            r0 = 0
            goto L_0x001b
        L_0x002d:
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r3 = r14
            r4 = r15
            r6 = r16
            r7 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.r.<init>(b.j.a.c.e0.r, b.j.a.c.j0.b, b.j.a.c.i, b.j.a.c.n, b.j.a.c.f0.f, b.j.a.c.i, b.j.a.a.r$b, java.lang.Class[]):void");
    }

    public void i(Object obj, f fVar, y yVar) {
        Object n2 = n(obj, fVar, yVar);
        if (n2 == null) {
            n<Object> nVar = this.u;
            if (nVar != null) {
                nVar.f(null, fVar, yVar);
            } else {
                fVar.u0();
            }
        } else {
            n<Object> nVar2 = this.t;
            if (nVar2 == null) {
                Class<?> cls = n2.getClass();
                l lVar = this.w;
                n<Object> c = lVar.c(cls);
                nVar2 = c == null ? a(lVar, cls, yVar) : c;
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                if (r.a.NON_EMPTY == obj2) {
                    if (nVar2.d(yVar, n2)) {
                        n<Object> nVar3 = this.u;
                        if (nVar3 != null) {
                            nVar3.f(null, fVar, yVar);
                            return;
                        } else {
                            fVar.u0();
                            return;
                        }
                    }
                } else if (obj2.equals(n2)) {
                    n<Object> nVar4 = this.u;
                    if (nVar4 != null) {
                        nVar4.f(null, fVar, yVar);
                        return;
                    } else {
                        fVar.u0();
                        return;
                    }
                }
            }
            if (n2 == obj) {
                b(yVar, nVar2);
            }
            b.j.a.c.f0.f fVar2 = this.v;
            if (fVar2 == null) {
                nVar2.f(n2, fVar, yVar);
            } else {
                nVar2.g(n2, fVar, yVar, fVar2);
            }
        }
    }

    public void k(Object obj, f fVar, y yVar) {
        Object n2 = n(obj, fVar, yVar);
        if (n2 != null) {
            n<Object> nVar = this.t;
            if (nVar == null) {
                Class<?> cls = n2.getClass();
                l lVar = this.w;
                n<Object> c = lVar.c(cls);
                nVar = c == null ? a(lVar, cls, yVar) : c;
            }
            Object obj2 = this.y;
            if (obj2 != null) {
                if (r.a.NON_EMPTY == obj2) {
                    if (nVar.d(yVar, n2)) {
                        return;
                    }
                } else if (obj2.equals(n2)) {
                    return;
                }
            }
            if (n2 == obj) {
                b(yVar, nVar);
            }
            fVar.s0(this.f2037k);
            b.j.a.c.f0.f fVar2 = this.v;
            if (fVar2 == null) {
                nVar.f(n2, fVar, yVar);
            } else {
                nVar.g(n2, fVar, yVar, fVar2);
            }
        } else if (this.u != null) {
            fVar.s0(this.f2037k);
            this.u.f(null, fVar, yVar);
        }
    }

    public abstract Object n(Object obj, f fVar, y yVar);

    public abstract r o(g<?> gVar, b bVar, b.j.a.c.e0.r rVar, i iVar);
}
