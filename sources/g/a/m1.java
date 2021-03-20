package g.a;

import b.q.a.a;
import e.r;

public final class m1<T> extends c1<d1> {

    /* renamed from: l  reason: collision with root package name */
    public final h<T> f9964l;

    public m1(d1 d1Var, h<? super T> hVar) {
        super(d1Var);
        this.f9964l = hVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return r.a;
    }

    public void n(Throwable th) {
        Object obj;
        h<T> hVar;
        Object p2 = ((d1) this.f9930k).p();
        if (p2 instanceof r) {
            hVar = this.f9964l;
            obj = a.Z(((r) p2).a);
        } else {
            hVar = this.f9964l;
            obj = e1.a(p2);
        }
        hVar.c(obj);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("ResumeAwaitOnCompletion[");
        y.append(this.f9964l);
        y.append(']');
        return y.toString();
    }
}
