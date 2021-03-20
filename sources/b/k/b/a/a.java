package b.k.b.a;

import e.r;
import e.x.b.l;

public final class a implements b.k.b.a.d.a<b.k.b.a.c.a> {
    public final /* synthetic */ b a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2367b;

    public a(b bVar, int i2) {
        this.a = bVar;
        this.f2367b = i2;
    }

    public void onResult(Object obj) {
        b.k.b.a.c.a aVar = (b.k.b.a.c.a) obj;
        if (aVar != null) {
            b bVar = this.a;
            bVar.a = aVar;
            l<? super b.k.b.a.c.a, r> lVar = bVar.c;
            if (lVar != null) {
                r invoke = lVar.invoke(aVar);
            }
            this.a.a(this.f2367b);
        }
    }
}
