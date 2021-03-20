package b.j.a.c.h0;

import b.j.a.a.r;
import b.j.a.c.b;
import b.j.a.c.c;
import b.j.a.c.e0.a;
import b.j.a.c.i;
import b.j.a.c.w;
import b.j.a.c.z.f;

public class k {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2050b;
    public final b c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public final r.b f2051e;
    public final boolean f;

    public k(w wVar, c cVar) {
        r.b bVar;
        this.a = wVar;
        this.f2050b = cVar;
        r.b bVar2 = r.b.f1352l;
        r.b bVar3 = r.b.f1352l;
        r.b e2 = cVar.e(bVar3);
        wVar.j(cVar.a.f2152h, bVar3);
        bVar3 = e2 != null ? e2.a(bVar3) : bVar3;
        r.b bVar4 = wVar.f1616q.f1595h;
        if (bVar4 == null) {
            bVar = bVar3;
        } else {
            bVar = bVar4.a(bVar3);
        }
        this.f2051e = bVar;
        this.f = bVar3.f1353h == r.a.NON_DEFAULT;
        this.c = wVar.e();
    }

    public i a(a aVar, boolean z, i iVar) {
        i o0 = this.c.o0(this.a, aVar, iVar);
        boolean z2 = true;
        if (o0 != iVar) {
            Class<?> cls = o0.f2152h;
            Class<?> cls2 = iVar.f2152h;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                StringBuilder y = b.e.a.a.a.y("Illegal concrete-type annotation for method '");
                y.append(aVar.d());
                y.append("': class ");
                y.append(cls.getName());
                y.append(" not a super-type of (declared) class ");
                throw new IllegalArgumentException(b.e.a.a.a.d(cls2, y));
            }
            iVar = o0;
            z = true;
        }
        f.b T = this.c.T(aVar);
        if (!(T == null || T == f.b.DEFAULT_TYPING)) {
            if (T != f.b.STATIC) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            return iVar.P();
        }
        return null;
    }
}
