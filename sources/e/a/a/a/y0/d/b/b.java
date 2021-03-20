package e.a.a.a.y0.d.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.f.d;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b implements l.d {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f8632b;
    public final /* synthetic */ HashMap c;

    public final class a extends C0181b implements l.e {
        public final /* synthetic */ b d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, o oVar) {
            super(bVar, oVar);
            i.e(oVar, "signature");
            this.d = bVar;
        }

        public l.a c(int i2, e.a.a.a.y0.f.a aVar, m0 m0Var) {
            i.e(aVar, "classId");
            i.e(m0Var, "source");
            o oVar = this.f8633b;
            i.e(oVar, "signature");
            o oVar2 = new o(oVar.a + '@' + i2, (DefaultConstructorMarker) null);
            List list = (List) this.d.f8632b.get(oVar2);
            if (list == null) {
                list = new ArrayList();
                this.d.f8632b.put(oVar2, list);
            }
            return a.k(this.d.a, aVar, m0Var, list);
        }
    }

    /* renamed from: e.a.a.a.y0.d.b.b$b  reason: collision with other inner class name */
    public class C0181b implements l.c {
        public final ArrayList<A> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public final o f8633b;
        public final /* synthetic */ b c;

        public C0181b(b bVar, o oVar) {
            i.e(oVar, "signature");
            this.c = bVar;
            this.f8633b = oVar;
        }

        public l.a a(e.a.a.a.y0.f.a aVar, m0 m0Var) {
            i.e(aVar, "classId");
            i.e(m0Var, "source");
            return a.k(this.c.a, aVar, m0Var, this.a);
        }

        public void b() {
            if (!this.a.isEmpty()) {
                this.c.f8632b.put(this.f8633b, this.a);
            }
        }
    }

    public b(a aVar, HashMap hashMap, HashMap hashMap2) {
        this.a = aVar;
        this.f8632b = hashMap;
        this.c = hashMap2;
    }

    public l.c a(d dVar, String str, Object obj) {
        i.e(dVar, "name");
        i.e(str, "desc");
        String e2 = dVar.e();
        i.d(e2, "name.asString()");
        i.e(e2, "name");
        i.e(str, "desc");
        return new C0181b(this, new o(e2 + '#' + str, (DefaultConstructorMarker) null));
    }

    public l.e b(d dVar, String str) {
        i.e(dVar, "name");
        i.e(str, "desc");
        String e2 = dVar.e();
        i.d(e2, "name.asString()");
        i.e(e2, "name");
        i.e(str, "desc");
        return new a(this, new o(b.e.a.a.a.m(e2, str), (DefaultConstructorMarker) null));
    }
}
