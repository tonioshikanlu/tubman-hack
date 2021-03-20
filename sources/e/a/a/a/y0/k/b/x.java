package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.m;
import e.a.a.a.y0.f.a;
import e.x.b.l;
import e.x.c.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class x implements g {
    public final Map<a, c> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.a.a.a.y0.e.z.c f9617b;
    public final e.a.a.a.y0.e.z.a c;
    public final l<a, m0> d;

    public x(m mVar, e.a.a.a.y0.e.z.c cVar, e.a.a.a.y0.e.z.a aVar, l<? super a, ? extends m0> lVar) {
        i.e(mVar, "proto");
        i.e(cVar, "nameResolver");
        i.e(aVar, "metadataVersion");
        i.e(lVar, "classSource");
        this.f9617b = cVar;
        this.c = aVar;
        this.d = lVar;
        List<c> list = mVar.f8974n;
        i.d(list, "proto.class_List");
        int q2 = b.q.a.a.q2(b.q.a.a.C(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(q2 < 16 ? 16 : q2);
        for (T next : list) {
            c cVar2 = (c) next;
            e.a.a.a.y0.e.z.c cVar3 = this.f9617b;
            i.d(cVar2, "klass");
            linkedHashMap.put(b.q.a.a.D0(cVar3, cVar2.f8825l), next);
        }
        this.a = linkedHashMap;
    }

    public f a(a aVar) {
        i.e(aVar, "classId");
        c cVar = this.a.get(aVar);
        if (cVar != null) {
            return new f(this.f9617b, cVar, this.c, this.d.invoke(aVar));
        }
        return null;
    }
}
