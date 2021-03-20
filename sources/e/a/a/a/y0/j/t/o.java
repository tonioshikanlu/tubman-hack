package e.a.a.a.y0.j.t;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.a1;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.k0;
import e.t.g;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class o extends k implements a<List<k0>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q f9416h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(q qVar) {
        super(0);
        this.f9416h = qVar;
    }

    public Object e() {
        boolean z = true;
        e j2 = this.f9416h.v().j("Comparable");
        i.d(j2, "builtIns.comparable");
        k0 s = j2.s();
        i.d(s, "builtIns.comparable.defaultType");
        List F = g.F(b.q.a.a.F2(s, b.q.a.a.l2(new a1(j1.IN_VARIANCE, this.f9416h.d)), (h) null, 2));
        q qVar = this.f9416h;
        w wVar = qVar.f9418b;
        i.e(wVar, "$this$allSignedLiteralTypes");
        k0[] k0VarArr = new k0[4];
        k0VarArr[0] = wVar.v().n();
        e.a.a.a.y0.a.g v = wVar.v();
        Objects.requireNonNull(v);
        k0 u = v.u(e.a.a.a.y0.a.i.LONG);
        if (u != null) {
            k0VarArr[1] = u;
            e.a.a.a.y0.a.g v2 = wVar.v();
            Objects.requireNonNull(v2);
            k0 u2 = v2.u(e.a.a.a.y0.a.i.BYTE);
            if (u2 != null) {
                k0VarArr[2] = u2;
                e.a.a.a.y0.a.g v3 = wVar.v();
                Objects.requireNonNull(v3);
                k0 u3 = v3.u(e.a.a.a.y0.a.i.SHORT);
                if (u3 != null) {
                    k0VarArr[3] = u3;
                    List B = g.B(k0VarArr);
                    if (!B.isEmpty()) {
                        Iterator it = B.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (!(!qVar.c.contains((d0) it.next()))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        k0 s2 = this.f9416h.v().j("Number").s();
                        if (s2 != null) {
                            F.add(s2);
                        } else {
                            e.a.a.a.y0.a.g.a(57);
                            throw null;
                        }
                    }
                    return F;
                }
                e.a.a.a.y0.a.g.a(59);
                throw null;
            }
            e.a.a.a.y0.a.g.a(58);
            throw null;
        }
        e.a.a.a.y0.a.g.a(61);
        throw null;
    }
}
