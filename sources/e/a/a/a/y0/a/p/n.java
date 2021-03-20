package e.a.a.a.y0.a.p;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.d.a.b0.c;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.z.g;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.util.Objects;

public final class n extends k implements a<e> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.a.a.a.y0.d.a.b0.n.e f7764h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f7765i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e.a.a.a.y0.d.a.b0.n.e eVar, e eVar2) {
        super(0);
        this.f7764h = eVar;
        this.f7765i = eVar2;
    }

    public Object e() {
        e.a.a.a.y0.d.a.b0.n.e eVar = this.f7764h;
        g gVar = g.a;
        i.d(gVar, "JavaResolverCache.EMPTY");
        e eVar2 = this.f7765i;
        Objects.requireNonNull(eVar);
        i.e(gVar, "javaResolverCache");
        h hVar = eVar.f8385o;
        c cVar = hVar.c;
        Objects.requireNonNull(cVar);
        i.e(gVar, "javaResolverCache");
        e.a.a.a.y0.d.a.b0.n.e eVar3 = eVar;
        c cVar2 = r2;
        c cVar3 = cVar;
        e eVar4 = eVar2;
        c cVar4 = new c(cVar.a, cVar.f8346b, cVar.c, cVar.d, cVar.f8347e, cVar.f, gVar, cVar.f8349h, cVar.f8350i, cVar.f8351j, cVar3.f8352k, cVar3.f8353l, cVar3.f8354m, cVar3.f8355n, cVar3.f8356o, cVar3.f8357p, cVar3.f8358q, cVar3.r, cVar3.s, cVar3.t, cVar3.u);
        h hVar2 = hVar;
        i.e(hVar2, "$this$replaceComponents");
        c cVar5 = cVar2;
        i.e(cVar5, "components");
        h hVar3 = new h(cVar5, hVar2.d, hVar2.f8367e);
        e.a.a.a.y0.b.k b2 = eVar3.b();
        i.d(b2, "containingDeclaration");
        return new e.a.a.a.y0.d.a.b0.n.e(hVar3, b2, eVar3.B, eVar4);
    }
}
