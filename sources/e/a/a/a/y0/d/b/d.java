package e.a.a.a.y0.d.b;

import e.a.a.a.y0.b.y;
import e.a.a.a.y0.d.b.w.a;
import e.a.a.a.y0.e.a0.b.f;
import e.a.a.a.y0.e.a0.b.h;
import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.l;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.k.b.j;
import e.a.a.a.y0.k.b.r;
import e.t.g;
import e.t.o;
import e.x.c.k;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<a.C0184a> f8640b = b.q.a.a.S2(a.C0184a.CLASS);
    public static final Set<a.C0184a> c = g.M(a.C0184a.FILE_FACADE, a.C0184a.MULTIFILE_CLASS_PART);
    public static final f d = new f(1, 1, 2);

    /* renamed from: e  reason: collision with root package name */
    public static final f f8641e = new f(1, 1, 11);
    public static final f f = new f(1, 1, 13);

    /* renamed from: g  reason: collision with root package name */
    public static final a f8642g = new a((DefaultConstructorMarker) null);
    public j a;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b extends k implements e.x.b.a<Collection<? extends e.a.a.a.y0.f.d>> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f8643h = new b();

        public b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object e() {
            return o.f7934h;
        }
    }

    public final i a(y yVar, l lVar) {
        String[] strArr;
        e.j<e.a.a.a.y0.e.a0.b.g, l> jVar;
        e.x.c.i.e(yVar, "descriptor");
        e.x.c.i.e(lVar, "kotlinClass");
        String[] g2 = g(lVar, c);
        if (g2 == null || (strArr = lVar.a().f8659e) == null) {
            return null;
        }
        try {
            jVar = h.g(g2, strArr);
        } catch (e.a.a.a.y0.h.j e2) {
            throw new IllegalStateException("Could not read data from " + lVar.d(), e2);
        } catch (Throwable th) {
            j jVar2 = this.a;
            if (jVar2 == null) {
                e.x.c.i.m("components");
                throw null;
            } else if (jVar2.d.d() || lVar.a().f8658b.b()) {
                throw th;
            } else {
                jVar = null;
            }
        }
        if (jVar == null) {
            return null;
        }
        e.a.a.a.y0.e.a0.b.g gVar = (e.a.a.a.y0.e.a0.b.g) jVar.f7906h;
        l lVar2 = (l) jVar.f7907i;
        g gVar2 = new g(lVar, lVar2, gVar, c(lVar), e(lVar), d(lVar));
        f fVar = lVar.a().f8658b;
        j jVar3 = this.a;
        if (jVar3 != null) {
            return new e.a.a.a.y0.k.b.g0.i(yVar, lVar2, gVar, fVar, gVar2, jVar3, b.f8643h);
        }
        e.x.c.i.m("components");
        throw null;
    }

    public final j b() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar;
        }
        e.x.c.i.m("components");
        throw null;
    }

    public final r<f> c(l lVar) {
        j jVar = this.a;
        if (jVar == null) {
            e.x.c.i.m("components");
            throw null;
        } else if (jVar.d.d() || lVar.a().f8658b.b()) {
            return null;
        } else {
            return new r<>(lVar.a().f8658b, f.f8767g, lVar.d(), lVar.g());
        }
    }

    public final boolean d(l lVar) {
        j jVar = this.a;
        if (jVar != null) {
            if (jVar.d.b()) {
                int i2 = lVar.a().f8660g;
                if ((i2 & 16) != 0 && (i2 & 32) == 0) {
                    return true;
                }
            }
            return false;
        }
        e.x.c.i.m("components");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (e.x.c.i.a(r7.a().f8658b, d) == false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(e.a.a.a.y0.d.b.l r7) {
        /*
            r6 = this;
            e.a.a.a.y0.k.b.j r0 = r6.a
            r1 = 0
            java.lang.String r2 = "components"
            if (r0 == 0) goto L_0x0062
            e.a.a.a.y0.k.b.k r0 = r0.d
            boolean r0 = r0.f()
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x002e
            e.a.a.a.y0.d.b.w.a r0 = r7.a()
            int r0 = r0.f8660g
            r0 = r0 & 2
            if (r0 == 0) goto L_0x001d
            r0 = r4
            goto L_0x001e
        L_0x001d:
            r0 = r3
        L_0x001e:
            if (r0 != 0) goto L_0x005c
            e.a.a.a.y0.d.b.w.a r0 = r7.a()
            e.a.a.a.y0.e.a0.b.f r0 = r0.f8658b
            e.a.a.a.y0.e.a0.b.f r5 = d
            boolean r0 = e.x.c.i.a(r0, r5)
            if (r0 != 0) goto L_0x005c
        L_0x002e:
            e.a.a.a.y0.k.b.j r0 = r6.a
            if (r0 == 0) goto L_0x005e
            e.a.a.a.y0.k.b.k r0 = r0.d
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0059
            e.a.a.a.y0.d.b.w.a r0 = r7.a()
            int r0 = r0.f8660g
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0046
            r0 = r4
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            if (r0 == 0) goto L_0x0059
            e.a.a.a.y0.d.b.w.a r7 = r7.a()
            e.a.a.a.y0.e.a0.b.f r7 = r7.f8658b
            e.a.a.a.y0.e.a0.b.f r0 = f8641e
            boolean r7 = e.x.c.i.a(r7, r0)
            if (r7 == 0) goto L_0x0059
            r7 = r4
            goto L_0x005a
        L_0x0059:
            r7 = r3
        L_0x005a:
            if (r7 == 0) goto L_0x005d
        L_0x005c:
            r3 = r4
        L_0x005d:
            return r3
        L_0x005e:
            e.x.c.i.m(r2)
            throw r1
        L_0x0062:
            e.x.c.i.m(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.b.d.e(e.a.a.a.y0.d.b.l):boolean");
    }

    public final e.a.a.a.y0.k.b.f f(l lVar) {
        String[] strArr;
        e.j<e.a.a.a.y0.e.a0.b.g, c> jVar;
        e.x.c.i.e(lVar, "kotlinClass");
        String[] g2 = g(lVar, f8640b);
        if (g2 == null || (strArr = lVar.a().f8659e) == null) {
            return null;
        }
        try {
            jVar = h.f(g2, strArr);
        } catch (e.a.a.a.y0.h.j e2) {
            throw new IllegalStateException("Could not read data from " + lVar.d(), e2);
        } catch (Throwable th) {
            j jVar2 = this.a;
            if (jVar2 == null) {
                e.x.c.i.m("components");
                throw null;
            } else if (jVar2.d.d() || lVar.a().f8658b.b()) {
                throw th;
            } else {
                jVar = null;
            }
        }
        if (jVar == null) {
            return null;
        }
        return new e.a.a.a.y0.k.b.f((e.a.a.a.y0.e.a0.b.g) jVar.f7906h, (c) jVar.f7907i, lVar.a().f8658b, new n(lVar, c(lVar), e(lVar), d(lVar)));
    }

    public final String[] g(l lVar, Set<? extends a.C0184a> set) {
        e.a.a.a.y0.d.b.w.a a2 = lVar.a();
        String[] strArr = a2.c;
        if (strArr == null) {
            strArr = a2.d;
        }
        if (strArr == null || !set.contains(a2.a)) {
            return null;
        }
        return strArr;
    }
}
