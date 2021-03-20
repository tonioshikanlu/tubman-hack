package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;

public final class g extends f {
    public g(Class<?> cls, m mVar, i iVar, i[] iVarArr, i iVar2, i iVar3, Object obj, Object obj2, boolean z) {
        super(cls, mVar, iVar, iVarArr, iVar2, iVar3, obj, obj2, z);
    }

    public static g b0(Class<?> cls, m mVar, i iVar, i[] iVarArr, i iVar2, i iVar3) {
        return new g(cls, mVar, iVar, iVarArr, iVar2, iVar3, (Object) null, (Object) null, false);
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return new g(cls, mVar, iVar, iVarArr, this.f2163q, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public i L(i iVar) {
        if (this.r == iVar) {
            return this;
        }
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, iVar, this.f2154j, this.f2155k, this.f2156l);
    }

    public f W(i iVar) {
        if (iVar == this.f2163q) {
            return this;
        }
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, iVar, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public f X(Object obj) {
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q.R(obj), this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: c0 */
    public g U(Object obj) {
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r.Q(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: d0 */
    public g V(Object obj) {
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r.R(obj), this.f2154j, this.f2155k, this.f2156l);
    }

    /* renamed from: e0 */
    public g Y() {
        return this.f2156l ? this : new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q.P(), this.r.P(), this.f2154j, this.f2155k, true);
    }

    /* renamed from: f0 */
    public g Z(Object obj) {
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: g0 */
    public g a0(Object obj) {
        return new g(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2163q, this.r, obj, this.f2155k, this.f2156l);
    }

    public String toString() {
        StringBuilder y = a.y("[map type; class ");
        a.I(this.f2152h, y, ", ");
        y.append(this.f2163q);
        y.append(" -> ");
        y.append(this.r);
        y.append("]");
        return y.toString();
    }
}
