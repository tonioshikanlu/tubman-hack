package e.a.a.a;

import e.a.a.a.y0.a.h;
import e.a.a.a.y0.a.p.g;
import e.a.a.a.y0.b.b1.a;
import e.a.a.a.y0.b.b1.c;
import e.a.a.a.y0.b.c1.a0;
import e.a.a.a.y0.b.d1.a.f;
import e.a.a.a.y0.b.d1.a.i;
import e.a.a.a.y0.b.d1.b.b;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.c.a.c;
import e.a.a.a.y0.d.a.b0.d;
import e.a.a.a.y0.d.a.b0.l;
import e.a.a.a.y0.d.a.o;
import e.a.a.a.y0.d.a.z.f;
import e.a.a.a.y0.d.a.z.j;
import e.a.a.a.y0.d.b.p;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.k.b.i;
import e.a.a.a.y0.k.b.k;
import e.a.a.a.y0.k.b.t;
import e.a.a.a.y0.l.e;
import e.a.a.a.y0.m.l1.l;
import e.a.a.a.y0.m.l1.m;
import e.r;
import e.t.o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m0 {
    public static final ConcurrentMap<w0, WeakReference<i>> a = new ConcurrentHashMap();

    public static final i a(Class<?> cls) {
        a aVar;
        c cVar;
        e.x.c.i.e(cls, "$this$getOrCreateModule");
        ClassLoader e2 = b.e(cls);
        w0 w0Var = new w0(e2);
        ConcurrentMap<w0, WeakReference<i>> concurrentMap = a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(w0Var);
        if (weakReference != null) {
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                e.x.c.i.d(iVar, "it");
                return iVar;
            }
            concurrentMap.remove(w0Var, weakReference);
        }
        o oVar = o.f7934h;
        e.x.c.i.e(e2, "classLoader");
        e eVar = r14;
        e eVar2 = new e("RuntimeModuleData");
        g gVar = new g(eVar2, g.a.FROM_DEPENDENCIES);
        a0 a0Var = r4;
        d n2 = d.n("<runtime module for " + e2 + '>');
        e.x.c.i.d(n2, "Name.special(\"<runtime module for $classLoader>\")");
        a0 a0Var2 = new a0(n2, eVar2, gVar, (e.a.a.a.y0.g.a) null, (Map) null, (d) null, 56);
        gVar.d.b(new h(gVar, a0Var2));
        e.x.c.i.e(a0Var2, "moduleDescriptor");
        gVar.f7730m = a0Var2;
        gVar.f7731n = true;
        a0 a0Var3 = a0Var2;
        f fVar = r10;
        f fVar2 = new f(e2);
        e.a.a.a.y0.d.b.d dVar = r8;
        e.a.a.a.y0.d.b.d dVar2 = new e.a.a.a.y0.d.b.d();
        l lVar = r7;
        l lVar2 = new l();
        x xVar = new x(eVar2, a0Var3);
        p.a aVar2 = p.a.a;
        p.a aVar3 = aVar2;
        e.x.c.i.e(e2, "classLoader");
        e.x.c.i.e(a0Var3, "module");
        e.x.c.i.e(eVar2, "storageManager");
        w0 w0Var2 = w0Var;
        e.x.c.i.e(xVar, "notFoundClasses");
        e.x.c.i.e(fVar2, "reflectKotlinClassFinder");
        e.x.c.i.e(dVar2, "deserializedDescriptorResolver");
        g gVar2 = gVar;
        e.x.c.i.e(lVar2, "singleModuleClassResolver");
        e.x.c.i.e(aVar2, "packagePartProvider");
        e.a.a.a.y0.d.a.a aVar4 = r5;
        e.a.a.a.y0.o.i iVar2 = e.a.a.a.y0.o.i.f;
        e.a.a.a.y0.d.a.a aVar5 = new e.a.a.a.y0.d.a.a(eVar2, iVar2);
        l lVar3 = lVar2;
        g gVar3 = gVar2;
        e.a.a.a.y0.d.b.d dVar3 = dVar2;
        f fVar3 = fVar2;
        e eVar3 = eVar2;
        e.a.a.a.y0.b.d1.a.d dVar4 = r8;
        e.a.a.a.y0.b.d1.a.d dVar5 = new e.a.a.a.y0.b.d1.a.d(e2);
        j jVar = j.a;
        j jVar2 = jVar;
        e.x.c.i.d(jVar, "SignaturePropagator.DO_NOTHING");
        e.a.a.a.y0.b.d1.a.h hVar = e.a.a.a.y0.b.d1.a.h.f8285b;
        e.a.a.a.y0.d.a.z.g gVar4 = e.a.a.a.y0.d.a.z.g.a;
        e.a.a.a.y0.d.a.z.g gVar5 = gVar4;
        e.a.a.a.y0.b.d1.a.h hVar2 = hVar;
        e.x.c.i.d(gVar4, "JavaResolverCache.EMPTY");
        f.a aVar6 = f.a.a;
        e.a.a.a.y0.d.a.z.g gVar6 = gVar4;
        e.a.a.a.y0.j.x.b bVar = r8;
        e.a.a.a.y0.j.x.b bVar2 = new e.a.a.a.y0.j.x.b(eVar3, oVar);
        e.a.a.a.y0.b.d1.a.j jVar3 = e.a.a.a.y0.b.d1.a.j.a;
        p0.a aVar7 = p0.a.a;
        c.a aVar8 = c.a.a;
        String str = "JavaResolverCache.EMPTY";
        e.a.a.a.y0.a.j jVar4 = r0;
        e.a.a.a.y0.a.j jVar5 = new e.a.a.a.y0.a.j(a0Var3, xVar);
        e.a.a.a.y0.d.a.e0.l lVar4 = r0;
        e.a.a.a.y0.d.a.e0.l lVar5 = new e.a.a.a.y0.d.a.e0.l(aVar5, iVar2);
        o.a aVar9 = o.a.a;
        d.a aVar10 = d.a.a;
        Objects.requireNonNull(e.a.a.a.y0.m.l1.l.f9715b);
        m mVar = l.a.a;
        e.a.a.a.y0.d.a.b0.g gVar7 = new e.a.a.a.y0.d.a.b0.g(new e.a.a.a.y0.d.a.b0.c(eVar, dVar4, fVar, dVar, jVar2, hVar, gVar5, aVar6, bVar, jVar3, lVar, aVar3, aVar7, aVar8, a0Var, jVar4, aVar4, lVar4, aVar9, aVar10, mVar));
        e.x.c.i.e(a0Var3, "module");
        e.x.c.i.e(eVar3, "storageManager");
        e.x.c.i.e(xVar, "notFoundClasses");
        e.x.c.i.e(gVar7, "lazyJavaPackageFragmentProvider");
        e.a.a.a.y0.b.d1.a.f fVar4 = fVar3;
        e.x.c.i.e(fVar4, "reflectKotlinClassFinder");
        e.a.a.a.y0.d.b.d dVar6 = dVar3;
        e.x.c.i.e(dVar6, "deserializedDescriptorResolver");
        e.a.a.a.y0.d.b.e eVar4 = new e.a.a.a.y0.d.b.e(fVar4, dVar6);
        e.a.a.a.y0.d.b.c cVar2 = new e.a.a.a.y0.d.b.c(a0Var3, xVar, eVar3, fVar4);
        k.a aVar11 = k.a.a;
        Objects.requireNonNull(e.a.a.a.y0.k.b.i.a);
        e.a.a.a.y0.k.b.i iVar3 = i.a.a;
        e.x.c.i.e(eVar3, "storageManager");
        e.x.c.i.e(a0Var3, "moduleDescriptor");
        e.x.c.i.e(aVar11, "configuration");
        e.x.c.i.e(eVar4, "classDataFinder");
        e.x.c.i.e(cVar2, "annotationAndConstantLoader");
        e.x.c.i.e(gVar7, "packageFragmentProvider");
        e.x.c.i.e(xVar, "notFoundClasses");
        e.a.a.a.y0.b.d1.a.h hVar3 = hVar2;
        e.x.c.i.e(hVar3, "errorReporter");
        e.x.c.i.e(aVar8, "lookupTracker");
        e.x.c.i.e(iVar3, "contractDeserializer");
        e.x.c.i.e(mVar, "kotlinTypeChecker");
        e.a.a.a.y0.a.g v = a0Var3.v();
        e.a.a.a.y0.a.g gVar8 = v;
        if (!(v instanceof g)) {
            gVar8 = null;
        }
        g gVar9 = (g) gVar8;
        t.a aVar12 = t.a.a;
        e.a.a.a.y0.d.b.f fVar5 = e.a.a.a.y0.d.b.f.a;
        if (gVar9 == null || (aVar = gVar9.P()) == null) {
            aVar = a.C0141a.a;
        }
        if (gVar9 == null || (cVar = gVar9.P()) == null) {
            cVar = c.b.a;
        }
        e.a.a.a.y0.b.b1.c cVar3 = cVar;
        e.a.a.a.y0.e.a0.b.h hVar4 = e.a.a.a.y0.e.a0.b.h.f8770b;
        e.a.a.a.y0.h.f fVar6 = e.a.a.a.y0.e.a0.b.h.a;
        e.a.a.a.y0.j.x.b bVar3 = r1;
        e.a.a.a.y0.j.x.b bVar4 = new e.a.a.a.y0.j.x.b(eVar3, oVar);
        e.a.a.a.y0.k.b.j jVar6 = r5;
        x xVar2 = xVar;
        e.a.a.a.y0.b.d1.a.f fVar7 = fVar4;
        e.a.a.a.y0.d.a.b0.l lVar6 = lVar3;
        c.a aVar13 = aVar8;
        e.a.a.a.y0.d.a.z.g gVar10 = gVar6;
        a0 a0Var4 = a0Var3;
        e.a.a.a.y0.d.b.e eVar5 = eVar4;
        e eVar6 = eVar3;
        e.a.a.a.y0.d.b.c cVar4 = cVar2;
        e.a.a.a.y0.b.d1.a.h hVar5 = hVar3;
        e.a.a.a.y0.d.a.b0.g gVar11 = gVar7;
        e.a.a.a.y0.d.a.b0.g gVar12 = gVar7;
        e.a.a.a.y0.d.b.d dVar7 = dVar6;
        e.a.a.a.y0.k.b.j jVar7 = new e.a.a.a.y0.k.b.j(eVar3, a0Var3, aVar11, eVar5, cVar4, gVar11, aVar12, hVar5, aVar13, fVar5, oVar, xVar2, iVar3, aVar, cVar3, fVar6, mVar, bVar3, (e.a.a.a.y0.b.b1.e) null, 262144);
        dVar7.a = jVar6;
        e.x.c.i.d(gVar10, str);
        e.a.a.a.y0.j.w.a aVar14 = new e.a.a.a.y0.j.w.a(gVar12, gVar10);
        e.x.c.i.e(aVar14, "<set-?>");
        lVar3.a = aVar14;
        ClassLoader classLoader = r.class.getClassLoader();
        e.x.c.i.d(classLoader, "stdlibClassLoader");
        e.a.a.a.y0.b.d1.a.f fVar8 = new e.a.a.a.y0.b.d1.a.f(classLoader);
        e.a.a.a.y0.a.p.k P = gVar3.P();
        e.a.a.a.y0.a.p.k P2 = gVar3.P();
        e eVar7 = eVar6;
        e.a.a.a.y0.j.x.b bVar5 = new e.a.a.a.y0.j.x.b(eVar7, oVar);
        e.a.a.a.y0.d.b.d dVar8 = dVar7;
        e.a.a.a.y0.a.p.j jVar8 = new e.a.a.a.y0.a.p.j(eVar7, fVar8, a0Var4, xVar2, P, P2, aVar11, mVar, bVar5);
        a0 a0Var5 = a0Var4;
        a0Var5.K0(a0Var5);
        e.a.a.a.y0.b.c1.l lVar7 = new e.a.a.a.y0.b.c1.l(e.t.g.B(aVar14.a, jVar8));
        e.x.c.i.e(lVar7, "providerForModuleContent");
        a0Var5.f8157l = lVar7;
        e.a.a.a.y0.b.d1.a.i iVar4 = new e.a.a.a.y0.b.d1.a.i(jVar6, new e.a.a.a.y0.b.d1.a.a(dVar8, fVar7), (DefaultConstructorMarker) null);
        while (true) {
            ConcurrentMap<w0, WeakReference<e.a.a.a.y0.b.d1.a.i>> concurrentMap2 = a;
            w0 w0Var3 = w0Var2;
            WeakReference putIfAbsent = concurrentMap2.putIfAbsent(w0Var3, new WeakReference(iVar4));
            if (putIfAbsent == null) {
                return iVar4;
            }
            e.a.a.a.y0.b.d1.a.i iVar5 = (e.a.a.a.y0.b.d1.a.i) putIfAbsent.get();
            if (iVar5 != null) {
                return iVar5;
            }
            concurrentMap2.remove(w0Var3, putIfAbsent);
            w0Var2 = w0Var3;
        }
    }
}
