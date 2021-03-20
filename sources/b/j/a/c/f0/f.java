package b.j.a.c.f0;

import b.j.a.a.c0;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.b.w.m;
import b.j.a.c.d;

public abstract class f {
    public abstract f a(d dVar);

    public abstract String b();

    public abstract c0.a c();

    public b d(Object obj, l lVar) {
        b.a aVar;
        b.a aVar2;
        b bVar = new b(obj, lVar);
        int ordinal = c().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aVar2 = b.a.WRAPPER_OBJECT;
            } else if (ordinal == 2) {
                aVar2 = b.a.WRAPPER_ARRAY;
            } else if (ordinal == 3) {
                aVar = b.a.PARENT_PROPERTY;
            } else if (ordinal == 4) {
                aVar = b.a.PAYLOAD_PROPERTY;
            } else {
                m.a();
                throw null;
            }
            bVar.f1540e = aVar2;
            return bVar;
        }
        aVar = b.a.METADATA_PROPERTY;
        bVar.f1540e = aVar;
        bVar.d = b();
        return bVar;
    }

    public abstract b e(b.j.a.b.f fVar, b bVar);

    public abstract b f(b.j.a.b.f fVar, b bVar);
}
