package e.a.a.a.y0.b;

import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.v0;
import e.a.l;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j0<T extends i> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ l[] f7826e = {v.c(new q(v.a(j0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final a f = new a((DefaultConstructorMarker) null);
    public final e.a.a.a.y0.l.i a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7827b;
    public final e.x.b.l<f, T> c;
    public final f d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final <T extends i> j0<T> a(e eVar, m mVar, f fVar, e.x.b.l<? super f, ? extends T> lVar) {
            e.x.c.i.e(eVar, "classDescriptor");
            e.x.c.i.e(mVar, "storageManager");
            e.x.c.i.e(fVar, "kotlinTypeRefinerForOwnerModule");
            e.x.c.i.e(lVar, "scopeFactory");
            return new j0(eVar, mVar, lVar, fVar, (DefaultConstructorMarker) null);
        }
    }

    public static final class b extends k implements e.x.b.a<T> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j0 f7828h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ f f7829i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, f fVar) {
            super(0);
            this.f7828h = j0Var;
            this.f7829i = fVar;
        }

        public Object e() {
            return (i) this.f7828h.c.invoke(this.f7829i);
        }
    }

    public j0(e eVar, m mVar, e.x.b.l lVar, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f7827b = eVar;
        this.c = lVar;
        this.d = fVar;
        this.a = mVar.a(new k0(this));
    }

    public final T a(f fVar) {
        e.x.c.i.e(fVar, "kotlinTypeRefiner");
        if (!fVar.c(e.a.a.a.y0.j.v.b.k(this.f7827b))) {
            return (i) b.q.a.a.j1(this.a, f7826e[0]);
        }
        v0 p2 = this.f7827b.p();
        e.x.c.i.d(p2, "classDescriptor.typeConstructor");
        if (!fVar.d(p2)) {
            return (i) b.q.a.a.j1(this.a, f7826e[0]);
        }
        return fVar.b(this.f7827b, new b(this, fVar));
    }
}
