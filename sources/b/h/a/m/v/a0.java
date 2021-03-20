package b.h.a.m.v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.m;
import b.h.a.m.u.d;
import b.h.a.m.v.g;
import b.h.a.m.w.n;

public class a0 implements d.a<Object> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ n.a f623h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b0 f624i;

    public a0(b0 b0Var, n.a aVar) {
        this.f624i = b0Var;
        this.f623h = aVar;
    }

    public void c(@NonNull Exception exc) {
        b0 b0Var = this.f624i;
        n.a<?> aVar = this.f623h;
        n.a<?> aVar2 = b0Var.f631m;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f624i;
            n.a aVar3 = this.f623h;
            g.a aVar4 = b0Var2.f627i;
            e eVar = b0Var2.f632n;
            d<Data> dVar = aVar3.c;
            aVar4.e(eVar, exc, dVar, dVar.e());
        }
    }

    public void d(@Nullable Object obj) {
        b0 b0Var = this.f624i;
        n.a<?> aVar = this.f623h;
        n.a<?> aVar2 = b0Var.f631m;
        if (aVar2 != null && aVar2 == aVar) {
            b0 b0Var2 = this.f624i;
            n.a aVar3 = this.f623h;
            k kVar = b0Var2.f626h.f689p;
            if (obj == null || !kVar.c(aVar3.c.e())) {
                g.a aVar4 = b0Var2.f627i;
                m mVar = aVar3.a;
                d<Data> dVar = aVar3.c;
                aVar4.h(mVar, obj, dVar, dVar.e(), b0Var2.f632n);
                return;
            }
            b0Var2.f630l = obj;
            b0Var2.f627i.d();
        }
    }
}
