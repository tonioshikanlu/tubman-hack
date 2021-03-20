package b.j.a.c.e0;

import b.j.a.c.a0.g;
import b.j.a.c.a0.h;
import b.j.a.c.e0.s;
import b.j.a.c.i;
import b.j.a.c.i0.k;
import b.j.a.c.j0.m;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q extends s implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final p f1941i;

    /* renamed from: j  reason: collision with root package name */
    public static final p f1942j;

    /* renamed from: k  reason: collision with root package name */
    public static final p f1943k;

    /* renamed from: l  reason: collision with root package name */
    public static final p f1944l;

    /* renamed from: h  reason: collision with root package name */
    public final m<i, p> f1945h = new m<>(16, 64);

    static {
        Class<String> cls = String.class;
        k U = k.U(cls);
        int i2 = c.f1897h;
        f1941i = p.i((g<?>) null, U, new b(cls));
        Class cls2 = Boolean.TYPE;
        f1942j = p.i((g<?>) null, k.U(cls2), new b(cls2));
        Class cls3 = Integer.TYPE;
        f1943k = p.i((g<?>) null, k.U(cls3), new b(cls3));
        Class cls4 = Long.TYPE;
        f1944l = p.i((g<?>) null, k.U(cls4), new b(cls4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r5.f2152h;
        r1 = b.j.a.c.j0.g.q(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.e0.p a(b.j.a.c.a0.g<?> r4, b.j.a.c.i r5) {
        /*
            r3 = this;
            boolean r0 = r5.A()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r5.x()
            if (r0 == 0) goto L_0x000d
            goto L_0x0037
        L_0x000d:
            java.lang.Class<?> r0 = r5.f2152h
            java.lang.String r1 = b.j.a.c.j0.g.q(r0)
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "java.lang"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x0025
            java.lang.String r2 = "java.util"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0037
        L_0x0025:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto L_0x0035
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0037
        L_0x0035:
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x0043
            b.j.a.c.e0.b r0 = r3.c(r4, r5, r4)
            b.j.a.c.e0.p r4 = b.j.a.c.e0.p.i(r4, r5, r0)
            return r4
        L_0x0043:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.q.a(b.j.a.c.a0.g, b.j.a.c.i):b.j.a.c.e0.p");
    }

    public p b(i iVar) {
        Class<?> cls = iVar.f2152h;
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return f1942j;
            }
            if (cls == Integer.TYPE) {
                return f1943k;
            }
            if (cls == Long.TYPE) {
                return f1944l;
            }
            return null;
        } else if (cls == String.class) {
            return f1941i;
        } else {
            return null;
        }
    }

    public b c(g<?> gVar, i iVar, s.a aVar) {
        List list;
        int i2 = c.f1897h;
        boolean z = true;
        if (iVar.x()) {
            if (gVar == null || ((h) gVar).a(iVar.f2152h) == null) {
                return new b(iVar.f2152h);
            }
        }
        c cVar = new c(gVar, iVar, aVar);
        Annotation[] annotationArr = b.j.a.c.j0.g.a;
        Class<?> cls = iVar.f2152h;
        if (!(cls == null)) {
            if (cls != Object.class) {
                z = false;
            }
            if (!z) {
                list = new ArrayList(8);
                b.j.a.c.j0.g.b(iVar, (Class<?>) null, list, false);
                List list2 = list;
                return new b(cVar.f1899e, cVar.f, list2, cVar.f1900g, cVar.d(list2), cVar.d, cVar.f1898b, cVar.c, cVar.a.f1609i.f1589k);
            }
        }
        list = Collections.emptyList();
        List list22 = list;
        return new b(cVar.f1899e, cVar.f, list22, cVar.f1900g, cVar.d(list22), cVar.d, cVar.f1898b, cVar.c, cVar.a.f1609i.f1589k);
    }

    public z d(g<?> gVar, i iVar, s.a aVar, boolean z, String str) {
        return new z(gVar, z, iVar, c(gVar, iVar, aVar), str);
    }
}
