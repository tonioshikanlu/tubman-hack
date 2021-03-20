package e.a.a.a;

import e.a.w.b;
import e.x.b.a;
import e.x.c.k;
import java.lang.reflect.Field;

public final class z extends k implements a<Object> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x f7861h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(x xVar) {
        super(0);
        this.f7861h = xVar;
    }

    public final Object e() {
        x xVar = this.f7861h;
        Field G = xVar.G();
        x xVar2 = this.f7861h;
        Object B = b.q.a.a.B(xVar2.f7502p, xVar2.D());
        try {
            if (B == c0.f7496q) {
                if (xVar.D().U() == null) {
                    throw new RuntimeException('\'' + xVar + "' is not an extension property and thus getExtensionDelegate() " + "is not going to work, use getDelegate() instead");
                }
            }
            if (G != null) {
                return G.get(B);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new b(e2);
        }
    }
}
