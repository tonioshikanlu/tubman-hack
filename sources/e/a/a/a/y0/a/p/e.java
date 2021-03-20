package e.a.a.a.y0.a.p;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.b1.b;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.l;
import e.x.c.q;
import e.x.c.v;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e implements b {
    public static final /* synthetic */ l[] d = {v.c(new q(v.a(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final e.a.a.a.y0.f.b f7723e = g.f;
    public static final d f;

    /* renamed from: g  reason: collision with root package name */
    public static final e.a.a.a.y0.f.a f7724g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f7725h = new a((DefaultConstructorMarker) null);
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7726b;
    public final e.x.b.l<w, k> c;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        g.d dVar = g.f7647k;
        d h2 = dVar.c.h();
        e.x.c.i.d(h2, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        f = h2;
        e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(dVar.c.i());
        e.x.c.i.d(l2, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        f7724g = l2;
    }

    public e(m mVar, w wVar, e.x.b.l lVar, int i2) {
        d dVar = (i2 & 4) != 0 ? d.f7722h : null;
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(wVar, "moduleDescriptor");
        e.x.c.i.e(dVar, "computeContainingDeclaration");
        this.f7726b = wVar;
        this.c = dVar;
        this.a = mVar.a(new f(this, mVar));
    }

    public Collection<e.a.a.a.y0.b.e> a(e.a.a.a.y0.f.b bVar) {
        e.x.c.i.e(bVar, "packageFqName");
        return e.x.c.i.a(bVar, f7723e) ? b.q.a.a.S2((e.a.a.a.y0.b.c1.k) b.q.a.a.j1(this.a, d[0])) : e.t.q.f7936h;
    }

    public boolean b(e.a.a.a.y0.f.b bVar, d dVar) {
        e.x.c.i.e(bVar, "packageFqName");
        e.x.c.i.e(dVar, "name");
        return e.x.c.i.a(dVar, f) && e.x.c.i.a(bVar, f7723e);
    }

    public e.a.a.a.y0.b.e c(e.a.a.a.y0.f.a aVar) {
        e.x.c.i.e(aVar, "classId");
        if (e.x.c.i.a(aVar, f7724g)) {
            return (e.a.a.a.y0.b.c1.k) b.q.a.a.j1(this.a, d[0]);
        }
        return null;
    }
}
