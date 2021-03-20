package b.j.a.c.b0.a0;

import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.v;
import b.j.a.c.b0.x;
import b.j.a.c.b0.z.y;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@b.j.a.c.z.a
public class f extends g<Collection<Object>> implements i {

    /* renamed from: o  reason: collision with root package name */
    public final j<Object> f1661o;

    /* renamed from: p  reason: collision with root package name */
    public final c f1662p;

    /* renamed from: q  reason: collision with root package name */
    public final x f1663q;
    public final j<Object> r;

    public static final class a extends y.a {
        public final b c;
        public final List<Object> d = new ArrayList();

        public a(b bVar, v vVar, Class<?> cls) {
            super(vVar, cls);
            this.c = bVar;
        }

        public void a(Object obj, Object obj2) {
            b bVar = this.c;
            Iterator<a> it = bVar.c.iterator();
            Collection collection = bVar.f1664b;
            while (it.hasNext()) {
                a next = it.next();
                if (obj.equals(next.a.f1803k.f1855b.f1304j)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.d);
                    return;
                }
                collection = next.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static class b {
        public final Class<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final Collection<Object> f1664b;
        public List<a> c = new ArrayList();

        public b(Class<?> cls, Collection<Object> collection) {
            this.a = cls;
            this.f1664b = collection;
        }

        public void a(Object obj) {
            if (this.c.isEmpty()) {
                this.f1664b.add(obj);
                return;
            }
            List<a> list = this.c;
            list.get(list.size() - 1).d.add(obj);
        }
    }

    public f(b.j.a.c.i iVar, j<Object> jVar, c cVar, x xVar) {
        super(iVar, (r) null, (Boolean) null);
        this.f1661o = jVar;
        this.f1662p = cVar;
        this.f1663q = xVar;
        this.r = null;
    }

    public f(b.j.a.c.i iVar, j<Object> jVar, c cVar, x xVar, j<Object> jVar2, r rVar, Boolean bool) {
        super(iVar, rVar, bool);
        this.f1661o = jVar;
        this.f1662p = cVar;
        this.f1663q = xVar;
        this.r = jVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j a(b.j.a.c.g r9, b.j.a.c.d r10) {
        /*
            r8 = this;
            b.j.a.c.b0.x r0 = r8.f1663q
            r1 = 0
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.j()
            r2 = 1
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0035
            b.j.a.c.b0.x r0 = r8.f1663q
            b.j.a.c.f r5 = r9.f1993j
            b.j.a.c.i r0 = r0.A(r5)
            if (r0 == 0) goto L_0x0019
            goto L_0x0047
        L_0x0019:
            b.j.a.c.i r10 = r8.f1668k
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r10
            b.j.a.c.b0.x r3 = r8.f1663q
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            java.lang.String r2 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r9.l(r10, r0)
            throw r1
        L_0x0035:
            b.j.a.c.b0.x r0 = r8.f1663q
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0069
            b.j.a.c.b0.x r0 = r8.f1663q
            b.j.a.c.f r5 = r9.f1993j
            b.j.a.c.i r0 = r0.x(r5)
            if (r0 == 0) goto L_0x004d
        L_0x0047:
            b.j.a.c.j r0 = r9.q(r0, r10)
            r3 = r0
            goto L_0x006a
        L_0x004d:
            b.j.a.c.i r10 = r8.f1668k
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r10
            b.j.a.c.b0.x r3 = r8.f1663q
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            java.lang.String r2 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r9.l(r10, r0)
            throw r1
        L_0x0069:
            r3 = r1
        L_0x006a:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            b.j.a.a.k$a r2 = b.j.a.a.k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY
            b.j.a.a.k$d r0 = r8.Y(r9, r10, r0)
            if (r0 == 0) goto L_0x0078
            java.lang.Boolean r1 = r0.b(r2)
        L_0x0078:
            r7 = r1
            b.j.a.c.j<java.lang.Object> r0 = r8.f1661o
            b.j.a.c.j r0 = r8.X(r9, r10, r0)
            b.j.a.c.i r1 = r8.f1668k
            b.j.a.c.i r1 = r1.k()
            if (r0 != 0) goto L_0x008c
            b.j.a.c.j r0 = r9.q(r1, r10)
            goto L_0x0090
        L_0x008c:
            b.j.a.c.j r0 = r9.F(r0, r10, r1)
        L_0x0090:
            r4 = r0
            b.j.a.c.f0.c r0 = r8.f1662p
            if (r0 == 0) goto L_0x0099
            b.j.a.c.f0.c r0 = r0.f(r10)
        L_0x0099:
            r5 = r0
            b.j.a.c.b0.r r6 = r8.W(r9, r10, r4)
            java.lang.Boolean r9 = r8.f1670m
            if (r7 != r9) goto L_0x00b5
            b.j.a.c.b0.r r9 = r8.f1669l
            if (r6 != r9) goto L_0x00b5
            b.j.a.c.j<java.lang.Object> r9 = r8.r
            if (r3 != r9) goto L_0x00b5
            b.j.a.c.j<java.lang.Object> r9 = r8.f1661o
            if (r4 != r9) goto L_0x00b5
            b.j.a.c.f0.c r9 = r8.f1662p
            if (r5 == r9) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r9 = r8
            goto L_0x00ba
        L_0x00b5:
            r2 = r8
            b.j.a.c.b0.a0.f r9 = r2.i0(r3, r4, r5, r6, r7)
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.f.a(b.j.a.c.g, b.j.a.c.d):b.j.a.c.j");
    }

    public j<Object> c0() {
        return this.f1661o;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object r2;
        j<Object> jVar = this.r;
        if (jVar != null) {
            r2 = this.f1663q.v(gVar, jVar.d(iVar, gVar));
        } else {
            if (iVar.L0(l.VALUE_STRING)) {
                String x0 = iVar.x0();
                if (x0.length() == 0) {
                    r2 = this.f1663q.r(gVar, x0);
                }
            }
            return e(iVar, gVar, f0(gVar));
        }
        return (Collection) r2;
    }

    public x d0() {
        return this.f1663q;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.c(iVar, gVar);
    }

    public Collection<Object> f0(g gVar) {
        return (Collection) this.f1663q.u(gVar);
    }

    /* renamed from: g0 */
    public Collection<Object> e(b.j.a.b.i iVar, g gVar, Collection<Object> collection) {
        Object obj;
        Object obj2;
        if (!iVar.O0()) {
            return h0(iVar, gVar, collection);
        }
        iVar.Y0(collection);
        j<Object> jVar = this.f1661o;
        boolean z = false;
        if (jVar.k() == null) {
            c cVar = this.f1662p;
            while (true) {
                l T0 = iVar.T0();
                if (T0 == l.END_ARRAY) {
                    return collection;
                }
                try {
                    if (T0 != l.VALUE_NULL) {
                        obj = cVar == null ? jVar.d(iVar, gVar) : jVar.f(iVar, gVar, cVar);
                    } else if (!this.f1671n) {
                        obj = this.f1669l.c(gVar);
                    }
                    collection.add(obj);
                } catch (Exception e2) {
                    if (gVar == null || gVar.O(h.WRAP_EXCEPTIONS)) {
                        z = true;
                    }
                    if (!z) {
                        b.j.a.c.j0.g.E(e2);
                    }
                    throw k.g(e2, collection, collection.size());
                }
            }
        } else if (!iVar.O0()) {
            return h0(iVar, gVar, collection);
        } else {
            iVar.Y0(collection);
            j<Object> jVar2 = this.f1661o;
            c cVar2 = this.f1662p;
            b bVar = new b(this.f1668k.k().f2152h, collection);
            while (true) {
                l T02 = iVar.T0();
                if (T02 == l.END_ARRAY) {
                    return collection;
                }
                try {
                    if (T02 != l.VALUE_NULL) {
                        obj2 = cVar2 == null ? jVar2.d(iVar, gVar) : jVar2.f(iVar, gVar, cVar2);
                    } else if (!this.f1671n) {
                        obj2 = this.f1669l.c(gVar);
                    }
                    bVar.a(obj2);
                } catch (v e3) {
                    a aVar = new a(bVar, e3, bVar.a);
                    bVar.c.add(aVar);
                    e3.f1803k.a(aVar);
                } catch (Exception e4) {
                    if (gVar == null || gVar.O(h.WRAP_EXCEPTIONS)) {
                        z = true;
                    }
                    if (!z) {
                        b.j.a.c.j0.g.E(e4);
                    }
                    throw k.g(e4, collection, collection.size());
                }
            }
        }
    }

    public final Collection<Object> h0(b.j.a.b.i iVar, g gVar, Collection<Object> collection) {
        Object obj;
        Boolean bool = this.f1670m;
        if (bool == Boolean.TRUE || (bool == null && gVar.O(h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            j<Object> jVar = this.f1661o;
            c cVar = this.f1662p;
            try {
                if (iVar.g0() != l.VALUE_NULL) {
                    obj = cVar == null ? jVar.d(iVar, gVar) : jVar.f(iVar, gVar, cVar);
                } else if (this.f1671n) {
                    return collection;
                } else {
                    obj = this.f1669l.c(gVar);
                }
                collection.add(obj);
                return collection;
            } catch (Exception e2) {
                throw k.g(e2, Object.class, collection.size());
            }
        } else {
            gVar.G(this.f1668k.f2152h, iVar);
            throw null;
        }
    }

    public f i0(j<?> jVar, j<?> jVar2, c cVar, r rVar, Boolean bool) {
        return new f(this.f1668k, jVar2, cVar, this.f1663q, jVar, rVar, bool);
    }

    public boolean m() {
        return this.f1661o == null && this.f1662p == null && this.r == null;
    }
}
