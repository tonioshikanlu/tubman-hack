package n.m0.h;

import e.x.c.i;
import n.b0;
import n.j0;
import o.g;

public final class h extends j0 {

    /* renamed from: i  reason: collision with root package name */
    public final String f10237i;

    /* renamed from: j  reason: collision with root package name */
    public final long f10238j;

    /* renamed from: k  reason: collision with root package name */
    public final g f10239k;

    public h(String str, long j2, g gVar) {
        i.e(gVar, "source");
        this.f10237i = str;
        this.f10238j = j2;
        this.f10239k = gVar;
    }

    public long b() {
        return this.f10238j;
    }

    public b0 e() {
        String str = this.f10237i;
        if (str == null) {
            return null;
        }
        b0.a aVar = b0.f10048e;
        return b0.a.b(str);
    }

    public g q() {
        return this.f10239k;
    }
}
