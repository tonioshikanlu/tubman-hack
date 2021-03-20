package b.j.a.c.e0;

import b.j.a.c.i;

public abstract class m extends h {

    /* renamed from: j  reason: collision with root package name */
    public final o[] f1926j;

    public m(g0 g0Var, o oVar, o[] oVarArr) {
        super(g0Var, oVar);
        this.f1926j = oVarArr;
    }

    public m(m mVar, o[] oVarArr) {
        super(mVar);
        this.f1926j = null;
    }

    public abstract Object n();

    public abstract Object o(Object[] objArr);

    public abstract Object q(Object obj);

    public final l r(int i2) {
        i u = u(i2);
        g0 g0Var = this.f1908h;
        o[] oVarArr = this.f1926j;
        return new l(this, u, g0Var, (oVarArr == null || i2 < 0 || i2 >= oVarArr.length) ? null : oVarArr[i2], i2);
    }

    public abstract int t();

    public abstract i u(int i2);

    public abstract Class<?> v(int i2);
}
