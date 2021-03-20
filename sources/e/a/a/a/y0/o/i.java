package e.a.a.a.y0.o;

import b.q.a.a;
import e.f;
import e.t.p;
import java.util.Map;

public final class i {
    public static final i f;
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9816b;
    public final k c;
    public final Map<String, k> d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9817e;

    static {
        k kVar = k.WARN;
        p pVar = p.f7935h;
        new i(kVar, (k) null, pVar, false, 8);
        k kVar2 = k.IGNORE;
        p pVar2 = pVar;
        f = new i(kVar2, kVar2, pVar2, false, 8);
        k kVar3 = k.STRICT;
        new i(kVar3, kVar3, pVar2, false, 8);
    }

    public i(k kVar, k kVar2, Map map, boolean z, int i2) {
        z = (i2 & 8) != 0 ? true : z;
        e.x.c.i.e(kVar, "global");
        e.x.c.i.e(map, "user");
        this.f9816b = kVar;
        this.c = kVar2;
        this.d = map;
        this.f9817e = z;
        this.a = a.h2(new h(this));
    }

    public final boolean a() {
        return this == f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e.x.c.i.a(this.f9816b, iVar.f9816b) && e.x.c.i.a(this.c, iVar.c) && e.x.c.i.a(this.d, iVar.d) && this.f9817e == iVar.f9817e;
    }

    public int hashCode() {
        k kVar = this.f9816b;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.c;
        int hashCode2 = (hashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        Map<String, k> map = this.d;
        if (map != null) {
            i2 = map.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f9817e;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Jsr305State(global=");
        y.append(this.f9816b);
        y.append(", migration=");
        y.append(this.c);
        y.append(", user=");
        y.append(this.d);
        y.append(", enableCompatqualCheckerFrameworkAnnotations=");
        return b.e.a.a.a.s(y, this.f9817e, ")");
    }
}
