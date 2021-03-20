package g.a;

public class b1 extends d1 implements p {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9926i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var) {
        super(true);
        d1 d1Var;
        boolean z = true;
        t(y0Var);
        k kVar = (k) this._parentHandle;
        l lVar = (l) (!(kVar instanceof l) ? null : kVar);
        if (lVar != null && (d1Var = (d1) lVar.f9930k) != null) {
            while (true) {
                if (!d1Var.m()) {
                    k kVar2 = (k) d1Var._parentHandle;
                    l lVar2 = (l) (!(kVar2 instanceof l) ? null : kVar2);
                    if (lVar2 != null) {
                        d1Var = (d1) lVar2.f9930k;
                        if (d1Var == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.f9926i = z;
    }

    public boolean m() {
        return this.f9926i;
    }

    public boolean n() {
        return true;
    }
}
