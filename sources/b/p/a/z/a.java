package b.p.a.z;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;

public final class a<T> extends l<T> {
    public final l<T> a;

    public a(l<T> lVar) {
        this.a = lVar;
    }

    public T a(q qVar) {
        if (qVar.g0() != q.b.NULL) {
            return this.a.a(qVar);
        }
        qVar.Y();
        return null;
    }

    public void e(u uVar, T t) {
        if (t == null) {
            uVar.S();
        } else {
            this.a.e(uVar, t);
        }
    }

    public String toString() {
        return this.a + ".nullSafe()";
    }
}
