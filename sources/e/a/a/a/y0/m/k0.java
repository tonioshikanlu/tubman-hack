package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.a1.e;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.i;
import e.t.g;
import e.x.b.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k0 extends i1 implements h, i {
    public k0() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: d1 */
    public abstract k0 a1(boolean z);

    public abstract k0 e1(e.a.a.a.y0.b.a1.h hVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (c s : k()) {
            String[] strArr = {"[", e.a.a.a.y0.i.c.s(e.a.a.a.y0.i.c.f9317b, s, (e) null, 2, (Object) null), "] "};
            e.x.c.i.e(sb, "$this$append");
            e.x.c.i.e(strArr, "value");
            for (int i2 = 0; i2 < 3; i2++) {
                sb.append(strArr[i2]);
            }
        }
        sb.append(W0());
        if (!V0().isEmpty()) {
            g.v(V0(), sb, ", ", "<", ">", 0, (CharSequence) null, (l) null, 112);
        }
        if (X0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        e.x.c.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
