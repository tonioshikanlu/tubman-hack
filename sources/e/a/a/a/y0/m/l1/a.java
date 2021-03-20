package e.a.a.a.y0.m.l1;

import com.segment.analytics.integrations.BasePayload;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.j1;
import e.a.a.a.y0.m.n1.h;
import e.x.c.i;
import java.util.Objects;

public final class a extends g.a.C0223a {
    public final /* synthetic */ c a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1 f9698b;

    public a(c cVar, d1 d1Var) {
        this.a = cVar;
        this.f9698b = d1Var;
    }

    public h a(g gVar, e.a.a.a.y0.m.n1.g gVar2) {
        i.e(gVar, BasePayload.CONTEXT_KEY);
        i.e(gVar2, "type");
        c cVar = this.a;
        d1 d1Var = this.f9698b;
        h n2 = cVar.n(gVar2);
        Objects.requireNonNull(n2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        d0 i2 = d1Var.i((d0) n2, j1.INVARIANT);
        i.d(i2, "substitutor.safeSubstitu…ANT\n                    )");
        h a2 = cVar.a(i2);
        i.c(a2);
        return a2;
    }
}
