package e.v;

import e.v.e;
import e.v.f;
import e.x.b.p;
import e.x.c.i;
import e.x.c.k;

public final class g extends k implements p<f, f.a, f> {

    /* renamed from: h  reason: collision with root package name */
    public static final g f7948h = new g();

    public g() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        c cVar;
        f fVar = (f) obj;
        f.a aVar = (f.a) obj2;
        i.e(fVar, "acc");
        i.e(aVar, "element");
        f minusKey = fVar.minusKey(aVar.getKey());
        h hVar = h.f7949h;
        if (minusKey == hVar) {
            return aVar;
        }
        int i2 = e.d;
        e.a aVar2 = e.a.a;
        e eVar = (e) minusKey.get(aVar2);
        if (eVar == null) {
            cVar = new c(minusKey, aVar);
        } else {
            f minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == hVar) {
                return new c(aVar, eVar);
            }
            cVar = new c(new c(minusKey2, aVar), eVar);
        }
        return cVar;
    }
}
