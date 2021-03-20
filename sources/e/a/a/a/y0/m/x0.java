package e.a.a.a.y0.m;

import e.a.a.a.y0.b.r0;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class x0 extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9769b = new a((DefaultConstructorMarker) null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static x0 c(a aVar, Map map, boolean z, int i2) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            i.e(map, "map");
            return new w0(map, z);
        }

        public final b1 a(d0 d0Var) {
            i.e(d0Var, "kotlinType");
            return b(d0Var.W0(), d0Var.V0());
        }

        public final b1 b(v0 v0Var, List<? extends y0> list) {
            i.e(v0Var, "typeConstructor");
            i.e(list, "arguments");
            List<r0> g2 = v0Var.g();
            i.d(g2, "typeConstructor.parameters");
            r0 r0Var = (r0) g.A(g2);
            if (r0Var != null ? r0Var.Y() : false) {
                List<r0> g3 = v0Var.g();
                i.d(g3, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(b.q.a.a.C(g3, 10));
                for (r0 r0Var2 : g3) {
                    i.d(r0Var2, "it");
                    arrayList.add(r0Var2.p());
                }
                return c(this, g.X(g.f0(arrayList, list)), false, 2);
            }
            i.e(g2, "parameters");
            i.e(list, "argumentsList");
            Object[] array = g2.toArray(new r0[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] array2 = list.toArray(new y0[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            return new a0((r0[]) array, (y0[]) array2, false);
        }
    }

    public y0 e(d0 d0Var) {
        i.e(d0Var, "key");
        return h(d0Var.W0());
    }

    public abstract y0 h(v0 v0Var);
}
