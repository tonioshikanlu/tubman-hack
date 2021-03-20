package b.j.a.c.i0;

import b.j.a.b.v.a;

public class i extends k {

    /* renamed from: q  reason: collision with root package name */
    public final b.j.a.c.i f2165q;
    public final b.j.a.c.i r;

    /* JADX WARNING: type inference failed for: r17v0, types: [b.j.a.c.i] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(java.lang.Class<?> r12, b.j.a.c.i0.m r13, b.j.a.c.i r14, b.j.a.c.i[] r15, b.j.a.c.i r16, b.j.a.c.i r17, java.lang.Object r18, java.lang.Object r19, boolean r20) {
        /*
            r11 = this;
            r9 = r11
            r10 = r16
            int r5 = r10.f2153i
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f2165q = r10
            if (r17 != 0) goto L_0x0019
            r0 = r9
            goto L_0x001b
        L_0x0019:
            r0 = r17
        L_0x001b:
            r9.r = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.i.<init>(java.lang.Class, b.j.a.c.i0.m, b.j.a.c.i, b.j.a.c.i[], b.j.a.c.i, b.j.a.c.i, java.lang.Object, java.lang.Object, boolean):void");
    }

    public b.j.a.c.i K(Class<?> cls, m mVar, b.j.a.c.i iVar, b.j.a.c.i[] iVarArr) {
        return new i(cls, this.f2170o, iVar, iVarArr, this.f2165q, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public b.j.a.c.i L(b.j.a.c.i iVar) {
        if (this.f2165q == iVar) {
            return this;
        }
        return new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public b.j.a.c.i M(Object obj) {
        b.j.a.c.i iVar = this.f2165q;
        if (obj == iVar.f2155k) {
            return this;
        }
        return new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar.Q(obj), this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public String T() {
        return this.f2152h.getName() + '<' + this.f2165q.c() + '>';
    }

    /* renamed from: Z */
    public i V(Object obj) {
        b.j.a.c.i iVar = this.f2165q;
        if (obj == iVar.f2154j) {
            return this;
        }
        return new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar.R(obj), this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public a a() {
        return this.f2165q;
    }

    /* renamed from: a0 */
    public i W() {
        return this.f2156l ? this : new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2165q.P(), this.r, this.f2154j, this.f2155k, true);
    }

    public boolean b() {
        return true;
    }

    /* renamed from: b0 */
    public i X(Object obj) {
        if (obj == this.f2155k) {
            return this;
        }
        return new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2165q, this.r, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: c0 */
    public i Y(Object obj) {
        if (obj == this.f2154j) {
            return this;
        }
        return new i(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2165q, this.r, obj, this.f2155k, this.f2156l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != i.class) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f2152h != this.f2152h) {
            return false;
        }
        return this.f2165q.equals(iVar.f2165q);
    }

    public b.j.a.c.i k() {
        return this.f2165q;
    }

    public StringBuilder l(StringBuilder sb) {
        l.S(this.f2152h, sb, false);
        sb.append('<');
        StringBuilder l2 = this.f2165q.l(sb);
        l2.append(">;");
        return l2;
    }

    public b.j.a.c.i o() {
        return this.f2165q;
    }

    public boolean r() {
        return true;
    }

    public String toString() {
        StringBuilder x = b.e.a.a.a.x(40, "[reference type, class ");
        x.append(T());
        x.append('<');
        x.append(this.f2165q);
        x.append('>');
        x.append(']');
        return x.toString();
    }
}
