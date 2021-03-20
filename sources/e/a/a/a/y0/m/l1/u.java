package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.l1.l;
import e.x.b.p;
import e.x.c.g;
import e.x.c.i;
import e.x.c.v;
import java.util.Objects;

public final /* synthetic */ class u extends g implements p<d0, d0, Boolean> {
    public u(s sVar) {
        super(2, sVar);
    }

    public final String D() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        d0 d0Var2 = (d0) obj2;
        i.e(d0Var, "p1");
        i.e(d0Var2, "p2");
        Objects.requireNonNull((s) this.f7972i);
        Objects.requireNonNull(l.f9715b);
        m mVar = l.a.a;
        return Boolean.valueOf(mVar.d(d0Var, d0Var2) && !mVar.d(d0Var2, d0Var));
    }

    public final e.a.g u() {
        return v.a(s.class);
    }
}
