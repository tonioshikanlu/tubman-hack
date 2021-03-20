package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.z.c;
import e.a.a.a.y0.e.z.e;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class y {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9618b;
    public final m0 c;

    public static final class a extends y {
        public final e.a.a.a.y0.f.a d;

        /* renamed from: e  reason: collision with root package name */
        public final c.C0199c f9619e;
        public final boolean f;

        /* renamed from: g  reason: collision with root package name */
        public final e.a.a.a.y0.e.c f9620g;

        /* renamed from: h  reason: collision with root package name */
        public final a f9621h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.a.a.a.y0.e.c cVar, e.a.a.a.y0.e.z.c cVar2, e eVar, m0 m0Var, a aVar) {
            super(cVar2, eVar, m0Var, (DefaultConstructorMarker) null);
            i.e(cVar, "classProto");
            i.e(cVar2, "nameResolver");
            i.e(eVar, "typeTable");
            this.f9620g = cVar;
            this.f9621h = aVar;
            this.d = b.q.a.a.D0(cVar2, cVar.f8825l);
            c.C0199c d2 = e.a.a.a.y0.e.z.b.f9186e.d(cVar.f8824k);
            this.f9619e = d2 == null ? c.C0199c.CLASS : d2;
            this.f = b.e.a.a.a.N(e.a.a.a.y0.e.z.b.f, cVar.f8824k, "Flags.IS_INNER.get(classProto.flags)");
        }

        public e.a.a.a.y0.f.b a() {
            e.a.a.a.y0.f.b b2 = this.d.b();
            i.d(b2, "classId.asSingleFqName()");
            return b2;
        }
    }

    public static final class b extends y {
        public final e.a.a.a.y0.f.b d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e.a.a.a.y0.f.b bVar, e.a.a.a.y0.e.z.c cVar, e eVar, m0 m0Var) {
            super(cVar, eVar, m0Var, (DefaultConstructorMarker) null);
            i.e(bVar, "fqName");
            i.e(cVar, "nameResolver");
            i.e(eVar, "typeTable");
            this.d = bVar;
        }

        public e.a.a.a.y0.f.b a() {
            return this.d;
        }
    }

    public y(e.a.a.a.y0.e.z.c cVar, e eVar, m0 m0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = cVar;
        this.f9618b = eVar;
        this.c = m0Var;
    }

    public abstract e.a.a.a.y0.f.b a();

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
