package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;

public final class e extends d {
    public e(Class<?> cls, m mVar, i iVar, i[] iVarArr, i iVar2, Object obj, Object obj2, boolean z) {
        super(cls, mVar, iVar, iVarArr, iVar2, obj, obj2, z);
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return new e(cls, mVar, iVar, iVarArr, this.f2162q, this.f2154j, this.f2155k, this.f2156l);
    }

    public i L(i iVar) {
        if (this.f2162q == iVar) {
            return this;
        }
        return new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar, this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: Z */
    public e U(Object obj) {
        return new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.Q(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: a0 */
    public e V(Object obj) {
        return new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.R(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: b0 */
    public e W() {
        return this.f2156l ? this : new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q.P(), this.f2154j, this.f2155k, true);
    }

    /* renamed from: c0 */
    public e X(Object obj) {
        return new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: d0 */
    public e Y(Object obj) {
        return new e(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2162q, obj, this.f2155k, this.f2156l);
    }

    public String toString() {
        StringBuilder y = a.y("[collection type; class ");
        a.I(this.f2152h, y, ", contains ");
        y.append(this.f2162q);
        y.append("]");
        return y.toString();
    }
}
