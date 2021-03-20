package b.l.a.c.c.l.k;

import android.util.Log;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.k.g;
import b.l.a.c.c.m.n;

public final class z0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f2743h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g.b f2744i;

    public z0(g.b bVar, b bVar2) {
        this.f2744i = bVar;
        this.f2743h = bVar2;
    }

    public final void run() {
        b bVar;
        n nVar;
        g.b bVar2 = this.f2744i;
        g.a aVar = g.this.f2646g.get(bVar2.f2659b);
        if (aVar != null) {
            if (this.f2743h.W()) {
                g.b bVar3 = this.f2744i;
                bVar3.f2660e = true;
                if (bVar3.a.t()) {
                    g.b bVar4 = this.f2744i;
                    if (bVar4.f2660e && (nVar = bVar4.c) != null) {
                        bVar4.a.j(nVar, bVar4.d);
                        return;
                    }
                    return;
                }
                try {
                    a.f fVar = this.f2744i.a;
                    fVar.j((n) null, fVar.i());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    bVar = new b(10);
                }
            } else {
                bVar = this.f2743h;
                aVar.n(bVar);
            }
        }
    }
}
