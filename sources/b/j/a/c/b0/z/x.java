package b.j.a.c.b0.z;

import b.j.a.b.i;
import b.j.a.c.b0.t;
import b.j.a.c.b0.u;
import b.j.a.c.b0.z.w;
import b.j.a.c.g;
import b.j.a.c.h;
import java.util.BitSet;

public class x {
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1850b;
    public final r c;
    public final Object[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f1851e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final BitSet f1852g;

    /* renamed from: h  reason: collision with root package name */
    public w f1853h;

    /* renamed from: i  reason: collision with root package name */
    public Object f1854i;

    public x(i iVar, g gVar, int i2, r rVar) {
        this.a = iVar;
        this.f1850b = gVar;
        this.f1851e = i2;
        this.c = rVar;
        this.d = new Object[i2];
        this.f1852g = i2 < 32 ? null : new BitSet();
    }

    public Object a(u uVar) {
        if (uVar.q() == null) {
            Boolean bool = uVar.f1948h.f2295h;
            if (bool != null && bool.booleanValue()) {
                this.f1850b.W(uVar, "Missing required creator property '%s' (index %d)", uVar.f1796k.f2305h, Integer.valueOf(uVar.n()));
                throw null;
            } else if (!this.f1850b.O(h.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
                return uVar.u().c(this.f1850b);
            } else {
                this.f1850b.W(uVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", uVar.f1796k.f2305h, Integer.valueOf(uVar.n()));
                throw null;
            }
        } else {
            this.f1850b.r(uVar.q(), uVar, (Object) null);
            throw null;
        }
    }

    public boolean b(u uVar, Object obj) {
        int n2 = uVar.n();
        this.d[n2] = obj;
        BitSet bitSet = this.f1852g;
        if (bitSet == null) {
            int i2 = this.f;
            int i3 = (1 << n2) | i2;
            if (i2 != i3) {
                this.f = i3;
                int i4 = this.f1851e - 1;
                this.f1851e = i4;
                if (i4 <= 0) {
                    return this.c == null || this.f1854i != null;
                }
            }
        } else if (!bitSet.get(n2)) {
            this.f1852g.set(n2);
            this.f1851e--;
        }
        return false;
    }

    public void c(t tVar, String str, Object obj) {
        this.f1853h = new w.a(this.f1853h, obj, tVar, str);
    }

    public boolean d(String str) {
        r rVar = this.c;
        if (rVar == null || !str.equals(rVar.f1843i.f2305h)) {
            return false;
        }
        this.f1854i = this.c.c(this.a, this.f1850b);
        return true;
    }
}
