package e.a.a.a.y0.d.a.z;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.a;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.j;
import e.x.c.i;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

public final class c {
    public static final b a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f8603b;
    public static final b c;
    public static final b d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f8604e;
    public static final d f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f8605g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f8606h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map<b, b> f8607i;

    /* renamed from: j  reason: collision with root package name */
    public static final Map<b, b> f8608j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f8609k = new c();

    static {
        b bVar = new b(Target.class.getCanonicalName());
        a = bVar;
        b bVar2 = new b(Retention.class.getCanonicalName());
        f8603b = bVar2;
        b bVar3 = new b(Deprecated.class.getCanonicalName());
        c = bVar3;
        b bVar4 = new b(Documented.class.getCanonicalName());
        d = bVar4;
        b bVar5 = new b("java.lang.annotation.Repeatable");
        f8604e = bVar5;
        d l2 = d.l("message");
        i.d(l2, "Name.identifier(\"message\")");
        f = l2;
        d l3 = d.l("allowedTargets");
        i.d(l3, "Name.identifier(\"allowedTargets\")");
        f8605g = l3;
        d l4 = d.l("value");
        i.d(l4, "Name.identifier(\"value\")");
        f8606h = l4;
        g.d dVar = g.f7647k;
        f8607i = e.t.g.E(new j(dVar.z, bVar), new j(dVar.C, bVar2), new j(dVar.D, bVar5), new j(dVar.E, bVar4));
        f8608j = e.t.g.E(new j(bVar, dVar.z), new j(bVar2, dVar.C), new j(bVar3, dVar.t), new j(bVar5, dVar.D), new j(bVar4, dVar.E));
    }

    public final e.a.a.a.y0.b.a1.c a(b bVar, e.a.a.a.y0.d.a.d0.d dVar, h hVar) {
        a i2;
        a i3;
        i.e(bVar, "kotlinName");
        i.e(dVar, "annotationOwner");
        i.e(hVar, "c");
        if (i.a(bVar, g.f7647k.t) && ((i3 = dVar.i(c)) != null || dVar.u())) {
            return new e(i3, hVar);
        }
        b bVar2 = f8607i.get(bVar);
        if (bVar2 == null || (i2 = dVar.i(bVar2)) == null) {
            return null;
        }
        return f8609k.b(i2, hVar);
    }

    public final e.a.a.a.y0.b.a1.c b(a aVar, h hVar) {
        i.e(aVar, "annotation");
        i.e(hVar, "c");
        e.a.a.a.y0.f.a g2 = aVar.g();
        if (i.a(g2, e.a.a.a.y0.f.a.l(a))) {
            return new i(aVar, hVar);
        }
        if (i.a(g2, e.a.a.a.y0.f.a.l(f8603b))) {
            return new h(aVar, hVar);
        }
        if (i.a(g2, e.a.a.a.y0.f.a.l(f8604e))) {
            b bVar = g.f7647k.D;
            i.d(bVar, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new b(hVar, aVar, bVar);
        } else if (i.a(g2, e.a.a.a.y0.f.a.l(d))) {
            b bVar2 = g.f7647k.E;
            i.d(bVar2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new b(hVar, aVar, bVar2);
        } else if (i.a(g2, e.a.a.a.y0.f.a.l(c))) {
            return null;
        } else {
            return new e.a.a.a.y0.d.a.b0.n.d(hVar, aVar);
        }
    }
}
