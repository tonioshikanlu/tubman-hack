package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.j.j;
import e.a.a.a.y0.j.l;
import e.r;
import e.x.c.i;
import java.util.ArrayList;

public final class f extends j {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9454b;

    public f(e eVar, ArrayList arrayList) {
        this.a = eVar;
        this.f9454b = arrayList;
    }

    public void a(b bVar) {
        i.e(bVar, "fakeOverride");
        l.r(bVar, (e.x.b.l<b, r>) null);
        this.f9454b.add(bVar);
    }

    public void e(b bVar, b bVar2) {
        i.e(bVar, "fromSuper");
        i.e(bVar2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.a.c + ": " + bVar + " vs " + bVar2).toString());
    }
}
