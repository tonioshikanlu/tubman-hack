package b.j.a.c.b0;

import b.j.a.a.i0;
import b.j.a.a.l0;
import b.j.a.b.i;
import b.j.a.c.b0.z.y;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class l extends g implements Serializable {
    public transient LinkedHashMap<i0.a, y> r;
    public List<l0> s;

    public static final class a extends l {
        public a(a aVar, f fVar, i iVar) {
            super(aVar, fVar, iVar);
        }

        public a(o oVar) {
            super(oVar, (n) null);
        }
    }

    public l(l lVar, f fVar, i iVar) {
        super(lVar, fVar, iVar);
    }

    public l(o oVar, n nVar) {
        super(oVar, (n) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<b.j.a.c.o$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: b.j.a.c.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.o Q(b.j.a.c.e0.a r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof b.j.a.c.o
            if (r0 == 0) goto L_0x000b
            b.j.a.c.o r4 = (b.j.a.c.o) r4
            goto L_0x0038
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0056
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<b.j.a.c.o$a> r0 = b.j.a.c.o.a.class
            if (r4 == r0) goto L_0x0055
            boolean r0 = b.j.a.c.j0.g.t(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            java.lang.Class<b.j.a.c.o> r3 = b.j.a.c.o.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0043
            b.j.a.c.f r3 = r2.f1993j
            b.j.a.c.a0.a r3 = r3.f1609i
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.f r3 = r2.f1993j
            boolean r3 = r3.b()
            java.lang.Object r3 = b.j.a.c.j0.g.h(r4, r3)
            r4 = r3
            b.j.a.c.o r4 = (b.j.a.c.o) r4
        L_0x0038:
            boolean r3 = r4 instanceof b.j.a.c.b0.s
            if (r3 == 0) goto L_0x0042
            r3 = r4
            b.j.a.c.b0.s r3 = (b.j.a.c.b0.s) r3
            r3.b(r2)
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = "; expected Class<KeyDeserializer>"
            java.lang.String r4 = b.e.a.a.a.e(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0055:
            return r3
        L_0x0056:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned key deserializer definition of type "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = "; expected type KeyDeserializer or Class<KeyDeserializer> instead"
            java.lang.String r4 = b.e.a.a.a.f(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.l.Q(b.j.a.c.e0.a, java.lang.Object):b.j.a.c.o");
    }

    public void g0() {
        if (this.r != null && O(h.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            v vVar = null;
            for (Map.Entry<i0.a, y> value : this.r.entrySet()) {
                y yVar = (y) value.getValue();
                LinkedList<y.a> linkedList = yVar.c;
                if (linkedList != null && !linkedList.isEmpty()) {
                    if (vVar == null) {
                        vVar = new v(this.f1996m, "Unresolved forward references for: ");
                    }
                    Object obj = yVar.f1855b.f1304j;
                    LinkedList<y.a> linkedList2 = yVar.c;
                    Iterator it = linkedList2 == null ? Collections.emptyList().iterator() : linkedList2.iterator();
                    while (it.hasNext()) {
                        y.a aVar = (y.a) it.next();
                        vVar.f1804l.add(new w(obj, aVar.f1856b, aVar.a.f1434h));
                    }
                }
            }
            if (vVar != null) {
                throw vVar;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<b.j.a.c.j$a>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: b.j.a.c.j<java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<java.lang.Object> o(b.j.a.c.e0.a r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3 = 0
            if (r4 != 0) goto L_0x0004
            return r3
        L_0x0004:
            boolean r0 = r4 instanceof b.j.a.c.j
            if (r0 == 0) goto L_0x000b
            b.j.a.c.j r4 = (b.j.a.c.j) r4
            goto L_0x0038
        L_0x000b:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0056
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<b.j.a.c.j$a> r0 = b.j.a.c.j.a.class
            if (r4 == r0) goto L_0x0055
            boolean r0 = b.j.a.c.j0.g.t(r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0055
        L_0x001c:
            java.lang.Class<b.j.a.c.j> r3 = b.j.a.c.j.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x0043
            b.j.a.c.f r3 = r2.f1993j
            b.j.a.c.a0.a r3 = r3.f1609i
            java.util.Objects.requireNonNull(r3)
            b.j.a.c.f r3 = r2.f1993j
            boolean r3 = r3.b()
            java.lang.Object r3 = b.j.a.c.j0.g.h(r4, r3)
            r4 = r3
            b.j.a.c.j r4 = (b.j.a.c.j) r4
        L_0x0038:
            boolean r3 = r4 instanceof b.j.a.c.b0.s
            if (r3 == 0) goto L_0x0042
            r3 = r4
            b.j.a.c.b0.s r3 = (b.j.a.c.b0.s) r3
            r3.b(r2)
        L_0x0042:
            return r4
        L_0x0043:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = "; expected Class<JsonDeserializer>"
            java.lang.String r4 = b.e.a.a.a.e(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L_0x0055:
            return r3
        L_0x0056:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "AnnotationIntrospector returned deserializer definition of type "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = "; expected type JsonDeserializer or Class<JsonDeserializer> instead"
            java.lang.String r4 = b.e.a.a.a.f(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.l.o(b.j.a.c.e0.a, java.lang.Object):b.j.a.c.j");
    }

    public y v(Object obj, i0<?> i0Var, l0 l0Var) {
        l0 l0Var2 = null;
        if (obj == null) {
            return null;
        }
        i0.a e2 = i0Var.e(obj);
        LinkedHashMap<i0.a, y> linkedHashMap = this.r;
        if (linkedHashMap == null) {
            this.r = new LinkedHashMap<>();
        } else {
            y yVar = linkedHashMap.get(e2);
            if (yVar != null) {
                return yVar;
            }
        }
        List<l0> list = this.s;
        if (list != null) {
            Iterator<l0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l0 next = it.next();
                if (next.b(l0Var)) {
                    l0Var2 = next;
                    break;
                }
            }
        } else {
            this.s = new ArrayList(8);
        }
        if (l0Var2 == null) {
            l0Var2 = l0Var.d(this);
            this.s.add(l0Var2);
        }
        y yVar2 = new y(e2);
        yVar2.d = l0Var2;
        this.r.put(e2, yVar2);
        return yVar2;
    }
}
