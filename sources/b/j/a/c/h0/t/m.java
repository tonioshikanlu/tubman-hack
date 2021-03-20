package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.b.f;
import b.j.a.c.h0.i;
import b.j.a.c.j0.l;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;

@a
public class m extends r0<Enum<?>> implements i {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f2124l = 0;

    /* renamed from: j  reason: collision with root package name */
    public final l f2125j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f2126k;

    public m(l lVar, Boolean bool) {
        super(lVar.f2223h, false);
        this.f2125j = lVar;
        this.f2126k = bool;
    }

    public static Boolean q(Class<?> cls, k.d dVar, boolean z, Boolean bool) {
        k.c cVar = dVar == null ? null : dVar.f1327i;
        if (cVar == null || cVar == k.c.ANY || cVar == k.c.SCALAR) {
            return bool;
        }
        if (cVar == k.c.STRING || cVar == k.c.NATURAL) {
            return Boolean.FALSE;
        }
        if (cVar.d() || cVar == k.c.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = cVar;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = q(r2.f2137h, r3, false, r2.f2126k);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r3, b.j.a.c.d r4) {
        /*
            r2 = this;
            java.lang.Class<T> r0 = r2.f2137h
            b.j.a.a.k$d r3 = r2.l(r3, r4, r0)
            if (r3 == 0) goto L_0x001d
            java.lang.Class<T> r4 = r2.f2137h
            r0 = 0
            java.lang.Boolean r1 = r2.f2126k
            java.lang.Boolean r3 = q(r4, r3, r0, r1)
            java.lang.Boolean r4 = r2.f2126k
            if (r3 == r4) goto L_0x001d
            b.j.a.c.h0.t.m r4 = new b.j.a.c.h0.t.m
            b.j.a.c.j0.l r0 = r2.f2125j
            r4.<init>(r0, r3)
            return r4
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.m.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public void f(Object obj, f fVar, y yVar) {
        Enum enumR = (Enum) obj;
        Boolean bool = this.f2126k;
        if (bool != null ? bool.booleanValue() : yVar.K(x.WRITE_ENUMS_USING_INDEX)) {
            fVar.x0(enumR.ordinal());
        } else if (yVar.K(x.WRITE_ENUMS_USING_TO_STRING)) {
            fVar.Q0(enumR.toString());
        } else {
            fVar.P0(this.f2125j.f2224i[enumR.ordinal()]);
        }
    }
}
