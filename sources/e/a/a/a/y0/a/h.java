package e.a.a.a.y0.a;

import e.a.a.a.y0.b.c1.a0;
import e.x.b.a;

public class h implements a<Void> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a0 f7667h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f7668i;

    public h(g gVar, a0 a0Var) {
        this.f7668i = gVar;
        this.f7667h = a0Var;
    }

    public Object e() {
        g gVar = this.f7668i;
        if (gVar.a == null) {
            gVar.a = this.f7667h;
            return null;
        }
        StringBuilder y = b.e.a.a.a.y("Built-ins module is already set: ");
        y.append(this.f7668i.a);
        y.append(" (attempting to reset to ");
        y.append(this.f7667h);
        y.append(")");
        throw new AssertionError(y.toString());
    }
}
