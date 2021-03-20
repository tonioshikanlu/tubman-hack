package e.a.a.a.y0.k.b.f0;

import e.a.a.a.y0.b.a0;
import e.a.a.a.y0.b.b1.c;
import e.a.a.a.y0.b.b1.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.c.a.c;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.k.b.d;
import e.a.a.a.y0.k.b.i;
import e.a.a.a.y0.k.b.j;
import e.a.a.a.y0.k.b.k;
import e.a.a.a.y0.k.b.p;
import e.a.a.a.y0.k.b.q;
import e.a.a.a.y0.k.b.t;
import e.a.a.a.y0.l.m;
import e.t.o;
import e.x.b.l;
import e.x.c.g;
import e.x.c.i;
import e.x.c.v;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class b implements e.a.a.a.y0.a.a {

    /* renamed from: b  reason: collision with root package name */
    public final d f9506b = new d();

    public static final /* synthetic */ class a extends g implements l<String, InputStream> {
        public a(d dVar) {
            super(1, dVar);
        }

        public final String D() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        public final String getName() {
            return "loadResource";
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            i.e(str, "p1");
            return ((d) this.f7972i).a(str);
        }

        public final e.a.g u() {
            return v.a(d.class);
        }
    }

    public z a(m mVar, w wVar, Iterable<? extends e.a.a.a.y0.b.b1.b> iterable, c cVar, e.a.a.a.y0.b.b1.a aVar, boolean z) {
        m mVar2 = mVar;
        w wVar2 = wVar;
        Iterable<? extends e.a.a.a.y0.b.b1.b> iterable2 = iterable;
        c cVar2 = cVar;
        e.a.a.a.y0.b.b1.a aVar2 = aVar;
        i.e(mVar2, "storageManager");
        i.e(wVar2, "builtInsModule");
        i.e(iterable2, "classDescriptorFactories");
        i.e(cVar2, "platformDependentDeclarationFilter");
        i.e(aVar2, "additionalClassPartsProvider");
        Set<e.a.a.a.y0.f.b> set = e.a.a.a.y0.a.g.f7646j;
        i.d(set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        a aVar3 = new a(this.f9506b);
        i.e(mVar2, "storageManager");
        i.e(wVar2, "module");
        i.e(set, "packageFqNames");
        i.e(iterable2, "classDescriptorFactories");
        i.e(cVar2, "platformDependentDeclarationFilter");
        i.e(aVar2, "additionalClassPartsProvider");
        i.e(aVar3, "loadResource");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(set, 10));
        for (e.a.a.a.y0.f.b bVar : set) {
            String a2 = a.f9505m.a(bVar);
            InputStream inputStream = (InputStream) aVar3.invoke(a2);
            if (inputStream != null) {
                arrayList.add(c.P0(bVar, mVar2, wVar2, inputStream, z));
            } else {
                throw new IllegalStateException(b.e.a.a.a.m("Resource not found in classpath: ", a2));
            }
        }
        a0 a0Var = r9;
        a0 a0Var2 = new a0(arrayList);
        x xVar = r7;
        x xVar2 = new x(mVar2, wVar2);
        k.a aVar4 = k.a.a;
        e.a.a.a.y0.k.b.m mVar3 = r5;
        e.a.a.a.y0.k.b.m mVar4 = new e.a.a.a.y0.k.b.m(a0Var2);
        a aVar5 = a.f9505m;
        d dVar = new d(wVar2, xVar2, aVar5);
        t.a aVar6 = t.a.a;
        p pVar = p.a;
        j jVar = r0;
        a0 a0Var3 = a0Var2;
        i.d(pVar, "ErrorReporter.DO_NOTHING");
        c.a aVar7 = c.a.a;
        a0 a0Var4 = a0Var3;
        ArrayList arrayList2 = arrayList;
        q.a aVar8 = q.a.a;
        Objects.requireNonNull(e.a.a.a.y0.k.b.i.a);
        e.a.a.a.y0.k.b.i iVar = i.a.a;
        f fVar = aVar5.a;
        e.a.a.a.y0.j.x.b bVar2 = r2;
        e.a.a.a.y0.j.x.b bVar3 = new e.a.a.a.y0.j.x.b(mVar2, o.f7934h);
        j jVar2 = new j(mVar, wVar, aVar4, mVar3, dVar, a0Var, aVar6, pVar, aVar7, aVar8, iterable, xVar, iVar, aVar, cVar, fVar, (e.a.a.a.y0.m.l1.l) null, bVar2, (e) null, 327680);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((c) it.next()).K0(jVar);
        }
        return a0Var4;
    }
}
