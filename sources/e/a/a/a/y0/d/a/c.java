package e.a.a.a.y0.d.a;

import b.q.a.a;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.f.d;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Map;
import java.util.Objects;

public final class c extends k implements l<b, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l0 f8477h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(l0 l0Var) {
        super(1);
        this.f8477h = l0Var;
    }

    public Object invoke(Object obj) {
        i.e((b) obj, "it");
        d dVar = d.f;
        Map<String, d> map = d.c;
        String I = a.I(this.f8477h);
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return Boolean.valueOf(map.containsKey(I));
    }
}
