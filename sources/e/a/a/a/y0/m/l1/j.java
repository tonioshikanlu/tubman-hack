package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.y0;
import e.f;
import e.g;
import e.t.o;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class j implements e.a.a.a.y0.j.s.a.b {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final y0 f9709b;
    public e.x.b.a<? extends List<? extends i1>> c;
    public final j d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f9710e;

    public static final class a extends k implements e.x.b.a<List<? extends i1>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j f9711h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(0);
            this.f9711h = jVar;
        }

        public Object e() {
            e.x.b.a<? extends List<? extends i1>> aVar = this.f9711h.c;
            if (aVar != null) {
                return (List) aVar.e();
            }
            return null;
        }
    }

    public static final class b extends k implements e.x.b.a<List<? extends i1>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j f9712h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ f f9713i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, f fVar) {
            super(0);
            this.f9712h = jVar;
            this.f9713i = fVar;
        }

        public Object e() {
            Iterable<i1> iterable = (List) this.f9712h.a.getValue();
            if (iterable == null) {
                iterable = o.f7934h;
            }
            ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
            for (i1 b1 : iterable) {
                arrayList.add(b1.b1(this.f9713i));
            }
            return arrayList;
        }
    }

    public j(y0 y0Var, e.x.b.a<? extends List<? extends i1>> aVar, j jVar, r0 r0Var) {
        i.e(y0Var, "projection");
        this.f9709b = y0Var;
        this.c = aVar;
        this.d = jVar;
        this.f9710e = r0Var;
        this.a = b.q.a.a.g2(g.PUBLICATION, new a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(y0 y0Var, e.x.b.a aVar, j jVar, r0 r0Var, int i2) {
        this(y0Var, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : jVar, (i2 & 8) != 0 ? null : r0Var);
    }

    public boolean b() {
        return false;
    }

    public y0 c() {
        return this.f9709b;
    }

    public h d() {
        return null;
    }

    /* renamed from: e */
    public j a(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        y0 a2 = this.f9709b.a(fVar);
        i.d(a2, "projection.refine(kotlinTypeRefiner)");
        b bVar = this.c != null ? new b(this, fVar) : null;
        j jVar = this.d;
        if (jVar == null) {
            jVar = this;
        }
        return new j(a2, bVar, jVar, this.f9710e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.d;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.d;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    public List<r0> g() {
        return o.f7934h;
    }

    public Collection h() {
        List list = (List) this.a.getValue();
        return list != null ? list : o.f7934h;
    }

    public int hashCode() {
        j jVar = this.d;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("CapturedType(");
        y.append(this.f9709b);
        y.append(')');
        return y.toString();
    }

    public e.a.a.a.y0.a.g v() {
        d0 d2 = this.f9709b.d();
        i.d(d2, "projection.type");
        return c.D(d2);
    }
}
