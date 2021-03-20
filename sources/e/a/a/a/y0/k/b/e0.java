package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.e.q;
import e.b0.s;
import e.x.b.l;
import e.x.c.g;
import e.x.c.i;
import e.x.c.k;
import e.x.c.v;
import java.util.ArrayList;
import java.util.List;

public final class e0 extends k implements l<Integer, e> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c0 f9499h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q f9500i;

    public static final /* synthetic */ class a extends g implements l<e.a.a.a.y0.f.a, e.a.a.a.y0.f.a> {

        /* renamed from: q  reason: collision with root package name */
        public static final a f9501q = new a();

        public a() {
            super(1);
        }

        public final String D() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.f.a aVar = (e.a.a.a.y0.f.a) obj;
            i.e(aVar, "p1");
            return aVar.g();
        }

        public final e.a.g u() {
            return v.a(e.a.a.a.y0.f.a.class);
        }
    }

    public static final class b extends k implements l<q, q> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e0 f9502h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var) {
            super(1);
            this.f9502h = e0Var;
        }

        public Object invoke(Object obj) {
            q qVar = (q) obj;
            i.e(qVar, "it");
            return b.q.a.a.u2(qVar, this.f9502h.f9499h.d.f);
        }
    }

    public static final class c extends k implements l<q, Integer> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f9503h = new c();

        public c() {
            super(1);
        }

        public Object invoke(Object obj) {
            q qVar = (q) obj;
            i.e(qVar, "it");
            return Integer.valueOf(qVar.f9034k.size());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, q qVar) {
        super(1);
        this.f9499h = c0Var;
        this.f9500i = qVar;
    }

    public final e a(int i2) {
        e.a.a.a.y0.f.a D0 = b.q.a.a.D0(this.f9499h.d.d, i2);
        List k2 = s.k(s.g(e.a.a.a.y0.m.o1.c.B(this.f9500i, new b(this)), c.f9503h));
        int a2 = s.a(e.a.a.a.y0.m.o1.c.B(D0, a.f9501q));
        while (true) {
            ArrayList arrayList = (ArrayList) k2;
            if (arrayList.size() >= a2) {
                return this.f9499h.d.c.f9578m.a(D0, k2);
            }
            arrayList.add(0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
