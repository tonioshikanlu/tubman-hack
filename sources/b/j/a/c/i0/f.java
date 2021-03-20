package b.j.a.c.i0;

import b.j.a.c.i;

public class f extends l {

    /* renamed from: q  reason: collision with root package name */
    public final i f2163q;
    public final i r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.Class<?> r13, b.j.a.c.i0.m r14, b.j.a.c.i r15, b.j.a.c.i[] r16, b.j.a.c.i r17, b.j.a.c.i r18, java.lang.Object r19, java.lang.Object r20, boolean r21) {
        /*
            r12 = this;
            r9 = r12
            r10 = r17
            r11 = r18
            int r0 = r10.f2153i
            int r1 = r11.f2153i
            r5 = r0 ^ r1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f2163q = r10
            r9.r = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.f.<init>(java.lang.Class, b.j.a.c.i0.m, b.j.a.c.i, b.j.a.c.i[], b.j.a.c.i, b.j.a.c.i, java.lang.Object, java.lang.Object, boolean):void");
    }

    public boolean A() {
        return true;
    }

    public boolean G() {
        return true;
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return new f(cls, mVar, iVar, iVarArr, this.f2163q, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public i L(i iVar) {
        if (this.r == iVar) {
            return this;
        }
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, iVar, this.f2154j, this.f2155k, this.f2156l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = r3.r.O(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i O(b.j.a.c.i r4) {
        /*
            r3 = this;
            b.j.a.c.i r0 = super.O(r4)
            b.j.a.c.i r1 = r4.n()
            boolean r2 = r0 instanceof b.j.a.c.i0.f
            if (r2 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            b.j.a.c.i r2 = r3.f2163q
            b.j.a.c.i r1 = r2.O(r1)
            b.j.a.c.i r2 = r3.f2163q
            if (r1 == r2) goto L_0x001e
            b.j.a.c.i0.f r0 = (b.j.a.c.i0.f) r0
            b.j.a.c.i0.f r0 = r0.W(r1)
        L_0x001e:
            b.j.a.c.i r4 = r4.k()
            if (r4 == 0) goto L_0x0032
            b.j.a.c.i r1 = r3.r
            b.j.a.c.i r4 = r1.O(r4)
            b.j.a.c.i r1 = r3.r
            if (r4 == r1) goto L_0x0032
            b.j.a.c.i r0 = r0.L(r4)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.f.O(b.j.a.c.i):b.j.a.c.i");
    }

    public String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2152h.getName());
        if (this.f2163q != null) {
            sb.append('<');
            sb.append(this.f2163q.c());
            sb.append(',');
            sb.append(this.r.c());
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: U */
    public f M(Object obj) {
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r.Q(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: V */
    public f N(Object obj) {
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r.R(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    public f W(i iVar) {
        if (iVar == this.f2163q) {
            return this;
        }
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public f X(Object obj) {
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q.R(obj), this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: Y */
    public f P() {
        return this.f2156l ? this : new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r.P(), this.f2154j, this.f2155k, true);
    }

    /* renamed from: Z */
    public f Q(Object obj) {
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: a0 */
    public f R(Object obj) {
        return new f(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r, obj, this.f2155k, this.f2156l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2152h == fVar.f2152h && this.f2163q.equals(fVar.f2163q) && this.r.equals(fVar.r);
    }

    public i k() {
        return this.r;
    }

    public StringBuilder l(StringBuilder sb) {
        l.S(this.f2152h, sb, false);
        sb.append('<');
        this.f2163q.l(sb);
        this.r.l(sb);
        sb.append(">;");
        return sb;
    }

    public i n() {
        return this.f2163q;
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this.f2152h.getName(), this.f2163q, this.r});
    }

    public boolean u() {
        return super.u() || this.r.u() || this.f2163q.u();
    }
}
