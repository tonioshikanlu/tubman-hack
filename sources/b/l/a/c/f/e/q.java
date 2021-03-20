package b.l.a.c.f.e;

import java.util.Collections;
import java.util.List;

public final class q extends s {
    public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: b.l.a.c.f.e.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: b.l.a.c.f.e.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: b.l.a.c.f.e.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L> java.util.List<L> d(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = b.l.a.c.f.e.n1.q(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0031
            boolean r1 = r0 instanceof b.l.a.c.f.e.p
            if (r1 == 0) goto L_0x0016
            b.l.a.c.f.e.o r0 = new b.l.a.c.f.e.o
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof b.l.a.c.f.e.k0
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof b.l.a.c.f.e.i
            if (r1 == 0) goto L_0x0026
            b.l.a.c.f.e.i r0 = (b.l.a.c.f.e.i) r0
            b.l.a.c.f.e.i r6 = r0.h(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            b.l.a.c.f.e.m1 r6 = b.l.a.c.f.e.n1.f3182e
            r6.s(r3, r4, r0)
            goto L_0x008a
        L_0x0031:
            java.lang.Class<?> r1 = c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x0051
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x004a:
            b.l.a.c.f.e.m1 r6 = b.l.a.c.f.e.n1.f3182e
            r6.s(r3, r4, r1)
            r0 = r1
            goto L_0x008a
        L_0x0051:
            boolean r1 = r0 instanceof b.l.a.c.f.e.h1
            if (r1 == 0) goto L_0x0069
            b.l.a.c.f.e.o r1 = new b.l.a.c.f.e.o
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            b.l.a.c.f.e.h1 r0 = (b.l.a.c.f.e.h1) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            goto L_0x004a
        L_0x0069:
            boolean r1 = r0 instanceof b.l.a.c.f.e.k0
            if (r1 == 0) goto L_0x008a
            boolean r1 = r0 instanceof b.l.a.c.f.e.i
            if (r1 == 0) goto L_0x008a
            r1 = r0
            b.l.a.c.f.e.i r1 = (b.l.a.c.f.e.i) r1
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x007b
            goto L_0x008a
        L_0x007b:
            int r0 = r0.size()
            int r0 = r0 + r6
            b.l.a.c.f.e.i r6 = r1.h(r0)
            b.l.a.c.f.e.m1 r0 = b.l.a.c.f.e.n1.f3182e
            r0.s(r3, r4, r6)
            return r6
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.q.d(java.lang.Object, long, int):java.util.List");
    }

    public final <L> List<L> a(Object obj, long j2) {
        return d(obj, j2, 10);
    }

    public final void b(Object obj, long j2) {
        Object obj2;
        List list = (List) n1.q(obj, j2);
        if (list instanceof p) {
            obj2 = ((p) list).f();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof k0) || !(list instanceof i)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                i iVar = (i) list;
                if (iVar.a()) {
                    iVar.b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        n1.f3182e.s(obj, j2, obj2);
    }

    public final <E> void c(Object obj, Object obj2, long j2) {
        List list = (List) n1.q(obj2, j2);
        List d = d(obj, j2, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        n1.f3182e.s(obj, j2, list);
    }
}
