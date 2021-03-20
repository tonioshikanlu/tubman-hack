package b.p.b.a0.j;

import o.h;

public final class l {
    public static final h d = h.j(":status");

    /* renamed from: e  reason: collision with root package name */
    public static final h f6555e = h.j(":method");
    public static final h f = h.j(":path");

    /* renamed from: g  reason: collision with root package name */
    public static final h f6556g = h.j(":scheme");

    /* renamed from: h  reason: collision with root package name */
    public static final h f6557h = h.j(":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final h f6558i = h.j(":host");

    /* renamed from: j  reason: collision with root package name */
    public static final h f6559j = h.j(":version");
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final h f6560b;
    public final int c;

    public l(String str, String str2) {
        this(h.j(str), h.j(str2));
    }

    public l(h hVar, String str) {
        this(hVar, h.j(str));
    }

    public l(h hVar, h hVar2) {
        this.a = hVar;
        this.f6560b = hVar2;
        this.c = hVar.l() + 32 + hVar2.l();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.f6560b.equals(lVar.f6560b);
    }

    public int hashCode() {
        return this.f6560b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.a.y(), this.f6560b.y()});
    }
}
