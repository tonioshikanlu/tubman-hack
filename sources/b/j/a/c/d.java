package b.j.a.c;

import b.j.a.a.k;
import b.j.a.a.r;
import b.j.a.c.a0.g;
import b.j.a.c.e0.h;
import b.j.a.c.j0.s;
import java.io.Serializable;

public interface d extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final k.d f1863b = new k.d("", k.c.ANY, "", "", k.b.c, (Boolean) null);

    public static class a implements d, Serializable {

        /* renamed from: h  reason: collision with root package name */
        public final t f1864h;

        /* renamed from: i  reason: collision with root package name */
        public final i f1865i;

        /* renamed from: j  reason: collision with root package name */
        public final t f1866j;

        /* renamed from: k  reason: collision with root package name */
        public final s f1867k;

        /* renamed from: l  reason: collision with root package name */
        public final h f1868l;

        public a(t tVar, i iVar, t tVar2, h hVar, s sVar) {
            this.f1864h = tVar;
            this.f1865i = iVar;
            this.f1866j = tVar2;
            this.f1867k = sVar;
            this.f1868l = hVar;
        }

        public i d() {
            return this.f1865i;
        }

        public h e() {
            return this.f1868l;
        }

        public String getName() {
            return this.f1864h.f2305h;
        }

        public t h() {
            return this.f1864h;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r2 = r2.m((r0 = r1.f1868l));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.j.a.a.k.d j(b.j.a.c.a0.g<?> r2, java.lang.Class<?> r3) {
            /*
                r1 = this;
                r0 = r2
                b.j.a.c.a0.h r0 = (b.j.a.c.a0.h) r0
                b.j.a.c.a0.d r0 = r0.f1616q
                r0.a(r3)
                b.j.a.a.k$d r3 = b.j.a.c.a0.g.f1607j
                b.j.a.c.b r2 = r2.e()
                if (r2 == 0) goto L_0x0021
                b.j.a.c.e0.h r0 = r1.f1868l
                if (r0 != 0) goto L_0x0015
                goto L_0x0021
            L_0x0015:
                b.j.a.a.k$d r2 = r2.m(r0)
                if (r2 != 0) goto L_0x001c
                return r3
            L_0x001c:
                b.j.a.a.k$d r2 = r3.f(r2)
                return r2
            L_0x0021:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.d.a.j(b.j.a.c.a0.g, java.lang.Class):b.j.a.a.k$d");
        }

        public s l() {
            return this.f1867k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
            r2 = r2.K((r0 = r1.f1868l));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.j.a.a.r.b m(b.j.a.c.a0.g<?> r2, java.lang.Class<?> r3) {
            /*
                r1 = this;
                b.j.a.c.i r0 = r1.f1865i
                java.lang.Class<?> r0 = r0.f2152h
                b.j.a.a.r$b r3 = r2.g(r3, r0)
                b.j.a.c.b r2 = r2.e()
                if (r2 == 0) goto L_0x001f
                b.j.a.c.e0.h r0 = r1.f1868l
                if (r0 != 0) goto L_0x0013
                goto L_0x001f
            L_0x0013:
                b.j.a.a.r$b r2 = r2.K(r0)
                if (r2 != 0) goto L_0x001a
                return r3
            L_0x001a:
                b.j.a.a.r$b r2 = r3.a(r2)
                return r2
            L_0x001f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.d.a.m(b.j.a.c.a0.g, java.lang.Class):b.j.a.a.r$b");
        }
    }

    static {
        r.b bVar = r.b.f1352l;
        r.b bVar2 = r.b.f1352l;
    }

    i d();

    h e();

    String getName();

    t h();

    k.d j(g<?> gVar, Class<?> cls);

    s l();

    r.b m(g<?> gVar, Class<?> cls);
}
