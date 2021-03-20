package n.m0.j;

import e.x.c.i;
import o.h;

public final class c {
    public static final h d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f10270e;
    public static final h f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f10271g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f10272h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f10273i;
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final h f10274b;
    public final h c;

    static {
        h.a aVar = h.f10456l;
        d = aVar.b(":");
        f10270e = aVar.b(":status");
        f = aVar.b(":method");
        f10271g = aVar.b(":path");
        f10272h = aVar.b(":scheme");
        f10273i = aVar.b(":authority");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            e.x.c.i.e(r2, r0)
            java.lang.String r0 = "value"
            e.x.c.i.e(r3, r0)
            o.h$a r0 = o.h.f10456l
            o.h r2 = r0.b(r2)
            o.h r3 = r0.b(r3)
            r1.<init>((o.h) r2, (o.h) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(h hVar, String str) {
        this(hVar, h.f10456l.b(str));
        i.e(hVar, "name");
        i.e(str, "value");
    }

    public c(h hVar, h hVar2) {
        i.e(hVar, "name");
        i.e(hVar2, "value");
        this.f10274b = hVar;
        this.c = hVar2;
        this.a = hVar.l() + 32 + hVar2.l();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f10274b, cVar.f10274b) && i.a(this.c, cVar.c);
    }

    public int hashCode() {
        h hVar = this.f10274b;
        int i2 = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        h hVar2 = this.c;
        if (hVar2 != null) {
            i2 = hVar2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return this.f10274b.y() + ": " + this.c.y();
    }
}
