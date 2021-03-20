package b.l.a.c.f.i;

import java.util.Collections;
import java.util.List;

public final class d6 extends f6 {
    public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(Object obj, long j2) {
        Object obj2;
        List list = (List) y7.q(obj, j2);
        if (list instanceof c6) {
            obj2 = ((c6) list).f();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof w6) || !(list instanceof v5)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                v5 v5Var = (v5) list;
                if (v5Var.a()) {
                    v5Var.b();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        y7.f3819e.s(obj, j2, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: b.l.a.c.f.i.b6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: b.l.a.c.f.i.b6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: b.l.a.c.f.i.b6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = b.l.a.c.f.i.y7.q(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = b.l.a.c.f.i.y7.q(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r1 instanceof b.l.a.c.f.i.c6
            if (r2 == 0) goto L_0x0020
            b.l.a.c.f.i.b6 r1 = new b.l.a.c.f.i.b6
            r1.<init>((int) r0)
            goto L_0x0069
        L_0x0020:
            boolean r2 = r1 instanceof b.l.a.c.f.i.w6
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof b.l.a.c.f.i.v5
            if (r2 == 0) goto L_0x0030
            b.l.a.c.f.i.v5 r1 = (b.l.a.c.f.i.v5) r1
            b.l.a.c.f.i.v5 r0 = r1.h(r0)
        L_0x002e:
            r1 = r0
            goto L_0x0069
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L_0x0069
        L_0x0036:
            java.lang.Class<?> r2 = c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0051
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004f:
            r1 = r2
            goto L_0x0069
        L_0x0051:
            boolean r2 = r1 instanceof b.l.a.c.f.i.s7
            if (r2 == 0) goto L_0x006f
            b.l.a.c.f.i.b6 r2 = new b.l.a.c.f.i.b6
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            b.l.a.c.f.i.s7 r1 = (b.l.a.c.f.i.s7) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x004f
        L_0x0069:
            b.l.a.c.f.i.x7 r0 = b.l.a.c.f.i.y7.f3819e
            r0.s(r5, r7, r1)
            goto L_0x008a
        L_0x006f:
            boolean r2 = r1 instanceof b.l.a.c.f.i.w6
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof b.l.a.c.f.i.v5
            if (r2 == 0) goto L_0x008a
            r2 = r1
            b.l.a.c.f.i.v5 r2 = (b.l.a.c.f.i.v5) r2
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            b.l.a.c.f.i.v5 r0 = r2.h(r1)
            goto L_0x002e
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            b.l.a.c.f.i.x7 r0 = b.l.a.c.f.i.y7.f3819e
            r0.s(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.d6.b(java.lang.Object, java.lang.Object, long):void");
    }
}
