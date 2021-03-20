package e.a.a.a.y0.a.p;

import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.e;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Objects;

public final class r extends k implements l<b, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ k f7767h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(k kVar) {
        super(1);
        this.f7767h = kVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        b bVar = (b) obj;
        i.d(bVar, "overridden");
        if (bVar.i() == b.a.DECLARATION) {
            c cVar = this.f7767h.a;
            e.a.a.a.y0.b.k b2 = bVar.b();
            Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (cVar.h((e) b2)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
