package b.j.a.c.f0.g;

import b.j.a.a.c0;
import b.j.a.b.l;
import b.j.a.c.b0.m;
import b.j.a.c.c0.e;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.n;
import b.j.a.c.j0.z;
import java.util.Objects;

public class f extends a {

    /* renamed from: p  reason: collision with root package name */
    public final c0.a f1976p;

    public f(f fVar, d dVar) {
        super(fVar, dVar);
        this.f1976p = fVar.f1976p;
    }

    public f(i iVar, b.j.a.c.f0.d dVar, String str, boolean z, i iVar2, c0.a aVar) {
        super(iVar, dVar, str, z, iVar2);
        this.f1976p = aVar;
    }

    public Object b(b.j.a.b.i iVar, g gVar) {
        if (iVar.g0() == l.START_ARRAY) {
            return o(iVar, gVar);
        }
        return d(iVar, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(b.j.a.b.i r5, b.j.a.c.g r6) {
        /*
            r4 = this;
            boolean r0 = r5.e()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r5.C0()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r4.k(r5, r6, r0)
            return r5
        L_0x0011:
            b.j.a.b.l r0 = r5.g0()
            b.j.a.b.l r1 = b.j.a.b.l.START_OBJECT
            r2 = 0
            if (r0 != r1) goto L_0x001b
            goto L_0x007c
        L_0x001b:
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            if (r0 == r1) goto L_0x0024
            java.lang.Object r5 = r4.r(r5, r6, r2)
            return r5
        L_0x0024:
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            if (r0 != r1) goto L_0x0081
            java.lang.String r0 = r5.e0()
            r5.T0()
            java.lang.String r3 = r4.f1984l
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x006a
            java.lang.String r0 = r5.x0()
            b.j.a.c.j r1 = r4.m(r6, r0)
            boolean r3 = r4.f1985m
            if (r3 == 0) goto L_0x0054
            if (r2 != 0) goto L_0x004a
            b.j.a.c.j0.z r2 = new b.j.a.c.j0.z
            r2.<init>((b.j.a.b.i) r5, (b.j.a.c.g) r6)
        L_0x004a:
            java.lang.String r3 = r5.e0()
            r2.t0(r3)
            r2.Q0(r0)
        L_0x0054:
            if (r2 == 0) goto L_0x0062
            r5.q()
            r0 = 0
            b.j.a.b.i r2 = r2.e1(r5)
            b.j.a.b.w.i r5 = b.j.a.b.w.i.c1(r0, r2, r5)
        L_0x0062:
            r5.T0()
            java.lang.Object r5 = r1.d(r5, r6)
            return r5
        L_0x006a:
            if (r2 != 0) goto L_0x0071
            b.j.a.c.j0.z r2 = new b.j.a.c.j0.z
            r2.<init>((b.j.a.b.i) r5, (b.j.a.c.g) r6)
        L_0x0071:
            b.j.a.b.t.e r3 = r2.v
            r3.o(r0)
            r2.V0(r1, r0)
            r2.g1(r5)
        L_0x007c:
            b.j.a.b.l r0 = r5.T0()
            goto L_0x0024
        L_0x0081:
            java.lang.Object r5 = r4.r(r5, r6, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.f0.g.f.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
    }

    public c f(d dVar) {
        return dVar == this.f1982j ? this : new f(this, dVar);
    }

    public c0.a j() {
        return this.f1976p;
    }

    public Object r(b.j.a.b.i iVar, g gVar, z zVar) {
        j<Object> l2 = l(gVar);
        if (l2 == null) {
            Object a = c.a(iVar, gVar, this.f1981i);
            if (a != null) {
                return a;
            }
            if (iVar.O0()) {
                return o(iVar, gVar);
            }
            if (iVar.L0(l.VALUE_STRING) && gVar.O(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.x0().trim().isEmpty()) {
                return null;
            }
            String format = String.format("missing type id property '%s'", new Object[]{this.f1984l});
            d dVar = this.f1982j;
            if (dVar != null) {
                format = String.format("%s (for POJO property '%s')", new Object[]{format, dVar.getName()});
            }
            i iVar2 = this.f1981i;
            for (n nVar = gVar.f1993j.t; nVar != null; nVar = nVar.f2227b) {
                Objects.requireNonNull((m) nVar.a);
            }
            throw new e(gVar.f1996m, gVar.a(String.format("Missing type id when trying to resolve subtype of %s", new Object[]{iVar2}), format), iVar2, (String) null);
        }
        if (zVar != null) {
            zVar.r0();
            iVar = zVar.e1(iVar);
            iVar.T0();
        }
        return l2.d(iVar, gVar);
    }
}
