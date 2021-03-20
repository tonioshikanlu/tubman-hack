package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;

public class d extends l {

    /* renamed from: q  reason: collision with root package name */
    public final i f2162q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.Class<?> r11, b.j.a.c.i0.m r12, b.j.a.c.i r13, b.j.a.c.i[] r14, b.j.a.c.i r15, java.lang.Object r16, java.lang.Object r17, boolean r18) {
        /*
            r10 = this;
            r0 = r15
            int r6 = r0.f2153i
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.f2162q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.d.<init>(java.lang.Class, b.j.a.c.i0.m, b.j.a.c.i, b.j.a.c.i[], b.j.a.c.i, java.lang.Object, java.lang.Object, boolean):void");
    }

    public boolean A() {
        return true;
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return new d(cls, mVar, iVar, iVarArr, this.f2162q, this.f2154j, this.f2155k, this.f2156l);
    }

    public i L(i iVar) {
        if (this.f2162q == iVar) {
            return this;
        }
        return new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar, this.f2154j, this.f2155k, this.f2156l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f2162q.O(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i O(b.j.a.c.i r3) {
        /*
            r2 = this;
            b.j.a.c.i r0 = super.O(r3)
            b.j.a.c.i r3 = r3.k()
            if (r3 == 0) goto L_0x0018
            b.j.a.c.i r1 = r2.f2162q
            b.j.a.c.i r3 = r1.O(r3)
            b.j.a.c.i r1 = r2.f2162q
            if (r3 == r1) goto L_0x0018
            b.j.a.c.i r0 = r0.L(r3)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.i0.d.O(b.j.a.c.i):b.j.a.c.i");
    }

    public String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2152h.getName());
        if (this.f2162q != null) {
            sb.append('<');
            sb.append(this.f2162q.c());
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: U */
    public d M(Object obj) {
        return new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.Q(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: V */
    public d N(Object obj) {
        return new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.R(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: W */
    public d P() {
        return this.f2156l ? this : new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.P(), this.f2154j, this.f2155k, true);
    }

    /* renamed from: X */
    public d Q(Object obj) {
        return new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: Y */
    public d R(Object obj) {
        return new d(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q, obj, this.f2155k, this.f2156l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2152h == dVar.f2152h && this.f2162q.equals(dVar.f2162q);
    }

    public i k() {
        return this.f2162q;
    }

    public StringBuilder l(StringBuilder sb) {
        l.S(this.f2152h, sb, false);
        sb.append('<');
        this.f2162q.l(sb);
        sb.append(">;");
        return sb;
    }

    public String toString() {
        StringBuilder y = a.y("[collection-like type; class ");
        a.I(this.f2152h, y, ", contains ");
        y.append(this.f2162q);
        y.append("]");
        return y.toString();
    }

    public boolean u() {
        return super.u() || this.f2162q.u();
    }

    public boolean y() {
        return true;
    }
}
