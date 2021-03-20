package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.y;
import e.a.a.a.y0.b.z;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.x.c.i;

public final class m implements g {
    public final z a;

    public m(z zVar) {
        i.e(zVar, "packageFragmentProvider");
        this.a = zVar;
    }

    public f a(a aVar) {
        f a2;
        i.e(aVar, "classId");
        z zVar = this.a;
        b h2 = aVar.h();
        i.d(h2, "classId.packageFqName");
        for (y next : zVar.a(h2)) {
            if ((next instanceof n) && (a2 = ((n) next).w0().a(aVar)) != null) {
                return a2;
            }
        }
        return null;
    }
}
