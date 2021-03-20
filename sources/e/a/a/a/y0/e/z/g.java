package e.a.a.a.y0.e.z;

import e.a.a.a.y0.e.v;
import e.a.a.a.y0.e.w;
import e.t.o;
import e.x.c.i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f9204b = new g(o.f7934h);
    public static final a c = new a((DefaultConstructorMarker) null);
    public final List<v> a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final g a(w wVar) {
            i.e(wVar, "table");
            if (wVar.f9161i.size() == 0) {
                g gVar = g.f9204b;
                return g.f9204b;
            }
            List<v> list = wVar.f9161i;
            i.d(list, "table.requirementList");
            return new g(list, (DefaultConstructorMarker) null);
        }
    }

    public g(List<v> list) {
        this.a = list;
    }

    public g(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = list;
    }
}
