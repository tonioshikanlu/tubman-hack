package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.m.d0;
import e.x.b.p;
import e.x.c.g;
import e.x.c.i;

public final /* synthetic */ class v extends g implements p<d0, d0, Boolean> {
    public v(m mVar) {
        super(2, mVar);
    }

    public final String D() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final String getName() {
        return "equalTypes";
    }

    public Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        d0 d0Var2 = (d0) obj2;
        i.e(d0Var, "p1");
        i.e(d0Var2, "p2");
        return Boolean.valueOf(((m) this.f7972i).b(d0Var, d0Var2));
    }

    public final e.a.g u() {
        return e.x.c.v.a(m.class);
    }
}
