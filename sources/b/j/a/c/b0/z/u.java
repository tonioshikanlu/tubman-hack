package b.j.a.c.b0.z;

import b.j.a.c.b;
import b.j.a.c.b0.x;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class u {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final x f1848b;
    public final HashMap<String, b.j.a.c.b0.u> c;
    public final b.j.a.c.b0.u[] d;

    public static class a extends HashMap<String, b.j.a.c.b0.u> {
        public Object get(Object obj) {
            return (b.j.a.c.b0.u) super.get(((String) obj).toLowerCase());
        }

        public Object put(Object obj, Object obj2) {
            return (b.j.a.c.b0.u) super.put(((String) obj).toLowerCase(), (b.j.a.c.b0.u) obj2);
        }
    }

    public u(g gVar, x xVar, b.j.a.c.b0.u[] uVarArr, boolean z, boolean z2) {
        this.f1848b = xVar;
        this.c = z ? new a() : new HashMap<>();
        int length = uVarArr.length;
        this.a = length;
        this.d = new b.j.a.c.b0.u[length];
        if (z2) {
            f fVar = gVar.f1993j;
            for (b.j.a.c.b0.u uVar : uVarArr) {
                if (!uVar.z()) {
                    List<t> list = uVar.f1950j;
                    if (list == null) {
                        b e2 = fVar.e();
                        list = e2 != null ? e2.F(uVar.e()) : list;
                        list = list == null ? Collections.emptyList() : list;
                        uVar.f1950j = list;
                    }
                    if (!list.isEmpty()) {
                        for (t tVar : list) {
                            this.c.put(tVar.f2305h, uVar);
                        }
                    }
                }
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            b.j.a.c.b0.u uVar2 = uVarArr[i2];
            this.d[i2] = uVar2;
            if (!uVar2.z()) {
                this.c.put(uVar2.f1796k.f2305h, uVar2);
            }
        }
    }

    public static u b(g gVar, x xVar, b.j.a.c.b0.u[] uVarArr, boolean z) {
        int length = uVarArr.length;
        b.j.a.c.b0.u[] uVarArr2 = new b.j.a.c.b0.u[length];
        for (int i2 = 0; i2 < length; i2++) {
            b.j.a.c.b0.u uVar = uVarArr[i2];
            if (!uVar.w()) {
                uVar = uVar.J(gVar.q(uVar.f1797l, uVar));
            }
            uVarArr2[i2] = uVar;
        }
        return new u(gVar, xVar, uVarArr2, z, false);
    }

    public Object a(g gVar, x xVar) {
        x xVar2 = this.f1848b;
        b.j.a.c.b0.u[] uVarArr = this.d;
        Objects.requireNonNull(xVar2);
        if (xVar.f1851e > 0) {
            if (xVar.f1852g != null) {
                int length = xVar.d.length;
                int i2 = 0;
                while (true) {
                    int nextClearBit = xVar.f1852g.nextClearBit(i2);
                    if (nextClearBit >= length) {
                        break;
                    }
                    xVar.d[nextClearBit] = xVar.a(uVarArr[nextClearBit]);
                    i2 = nextClearBit + 1;
                }
            } else {
                int i3 = xVar.f;
                int length2 = xVar.d.length;
                int i4 = 0;
                while (i4 < length2) {
                    if ((i3 & 1) == 0) {
                        xVar.d[i4] = xVar.a(uVarArr[i4]);
                    }
                    i4++;
                    i3 >>= 1;
                }
            }
        }
        if (xVar.f1850b.O(h.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            int i5 = 0;
            while (i5 < uVarArr.length) {
                if (xVar.d[i5] != null) {
                    i5++;
                } else {
                    b.j.a.c.b0.u uVar = uVarArr[i5];
                    xVar.f1850b.X(uVar.f1797l, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_FOR_CREATOR_PARAMETERS` enabled", uVar.f1796k.f2305h, Integer.valueOf(uVarArr[i5].n()));
                    throw null;
                }
            }
        }
        Object q2 = xVar2.q(gVar, xVar.d);
        if (q2 != null) {
            r rVar = xVar.c;
            if (rVar != null) {
                Object obj = xVar.f1854i;
                if (obj != null) {
                    gVar.v(obj, rVar.f1844j, rVar.f1845k).b(q2);
                    b.j.a.c.b0.u uVar2 = xVar.c.f1847m;
                    if (uVar2 != null) {
                        q2 = uVar2.D(q2, xVar.f1854i);
                    }
                } else {
                    Objects.requireNonNull(gVar);
                    gVar.W(rVar.f1847m, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{b.j.a.c.j0.g.f(q2), rVar.f1843i}), new Object[0]);
                    throw null;
                }
            }
            for (w wVar = xVar.f1853h; wVar != null; wVar = wVar.a) {
                wVar.a(q2);
            }
        }
        return q2;
    }

    public b.j.a.c.b0.u c(String str) {
        return this.c.get(str);
    }
}
