package b.j.a.c.f0.g;

import b.j.a.a.c0;
import b.j.a.c.a0.g;
import b.j.a.c.f0.a;
import b.j.a.c.f0.d;
import b.j.a.c.f0.e;
import b.j.a.c.f0.f;
import b.j.a.c.i;
import b.j.a.c.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class m implements e<m> {
    public c0.b a;

    /* renamed from: b  reason: collision with root package name */
    public c0.a f1977b;
    public String c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public Class<?> f1978e;
    public d f;

    public e a(boolean z) {
        this.d = z;
        return this;
    }

    public e b(Class cls) {
        this.f1978e = cls;
        return this;
    }

    public f c(w wVar, i iVar, Collection<a> collection) {
        if (this.a == c0.b.NONE || iVar.H()) {
            return null;
        }
        d i2 = i(wVar, iVar, collection, true, false);
        int ordinal = this.f1977b.ordinal();
        if (ordinal == 0) {
            return new g(i2, (b.j.a.c.d) null, this.c);
        }
        if (ordinal == 1) {
            return new i(i2, (b.j.a.c.d) null);
        }
        if (ordinal == 2) {
            return new b(i2, (b.j.a.c.d) null);
        }
        if (ordinal == 3) {
            return new e(i2, (b.j.a.c.d) null, this.c);
        }
        if (ordinal == 4) {
            return new c(i2, (b.j.a.c.d) null, this.c);
        }
        StringBuilder y = b.e.a.a.a.y("Do not know how to construct standard type serializer for inclusion type: ");
        y.append(this.f1977b);
        throw new IllegalStateException(y.toString());
    }

    public e d(c0.a aVar) {
        if (aVar != null) {
            this.f1977b = aVar;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    public Class<?> e() {
        return this.f1978e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r16.w() == false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.f0.c f(b.j.a.c.f r15, b.j.a.c.i r16, java.util.Collection<b.j.a.c.f0.a> r17) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            r8 = r16
            b.j.a.a.c0$b r0 = r6.a
            b.j.a.a.c0$b r1 = b.j.a.a.c0.b.NONE
            r9 = 0
            if (r0 != r1) goto L_0x000c
            return r9
        L_0x000c:
            boolean r0 = r16.H()
            if (r0 == 0) goto L_0x0013
            return r9
        L_0x0013:
            r4 = 0
            r5 = 1
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            b.j.a.c.f0.d r2 = r0.i(r1, r2, r3, r4, r5)
            java.lang.Class<?> r0 = r6.f1978e
            r1 = 1
            if (r0 != 0) goto L_0x0033
            b.j.a.c.p r0 = b.j.a.c.p.USE_BASE_TYPE_AS_DEFAULT_IMPL
            boolean r0 = r15.o(r0)
            if (r0 == 0) goto L_0x0058
            boolean r0 = r16.w()
            if (r0 != 0) goto L_0x0058
            goto L_0x0045
        L_0x0033:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r0 == r3) goto L_0x005a
            java.lang.Class<b.j.a.c.z.j> r3 = b.j.a.c.z.j.class
            if (r0 != r3) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            java.lang.Class<?> r3 = r8.f2152h
            if (r3 != r0) goto L_0x0042
            r3 = r1
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            if (r3 == 0) goto L_0x0047
        L_0x0045:
            r12 = r8
            goto L_0x0065
        L_0x0047:
            boolean r0 = r8.J(r0)
            if (r0 == 0) goto L_0x0058
            b.j.a.c.a0.a r0 = r7.f1609i
            b.j.a.c.i0.n r0 = r0.f1589k
            java.lang.Class<?> r3 = r6.f1978e
            b.j.a.c.i r0 = r0.k(r8, r3)
            goto L_0x0064
        L_0x0058:
            r12 = r9
            goto L_0x0065
        L_0x005a:
            b.j.a.c.a0.a r3 = r7.f1609i
            b.j.a.c.i0.n r3 = r3.f1589k
            b.j.a.c.i0.m r4 = b.j.a.c.i0.n.f2185l
            b.j.a.c.i r0 = r3.b(r9, r0, r4)
        L_0x0064:
            r12 = r0
        L_0x0065:
            b.j.a.a.c0$a r0 = r6.f1977b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00b8
            if (r0 == r1) goto L_0x00aa
            r1 = 2
            if (r0 == r1) goto L_0x009c
            r1 = 3
            if (r0 == r1) goto L_0x008e
            r1 = 4
            if (r0 != r1) goto L_0x0079
            goto L_0x00b8
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not know how to construct standard type serializer for inclusion type: "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            b.j.a.a.c0$a r2 = r6.f1977b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            b.j.a.c.f0.g.d r7 = new b.j.a.c.f0.g.d
            java.lang.String r3 = r6.c
            boolean r4 = r6.d
            r0 = r7
            r1 = r16
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L_0x009c:
            b.j.a.c.f0.g.a r7 = new b.j.a.c.f0.g.a
            java.lang.String r3 = r6.c
            boolean r4 = r6.d
            r0 = r7
            r1 = r16
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L_0x00aa:
            b.j.a.c.f0.g.h r7 = new b.j.a.c.f0.g.h
            java.lang.String r3 = r6.c
            boolean r4 = r6.d
            r0 = r7
            r1 = r16
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        L_0x00b8:
            b.j.a.c.f0.g.f r0 = new b.j.a.c.f0.g.f
            java.lang.String r10 = r6.c
            boolean r11 = r6.d
            b.j.a.a.c0$a r13 = r6.f1977b
            r7 = r0
            r8 = r16
            r9 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.f0.g.m.f(b.j.a.c.f, b.j.a.c.i, java.util.Collection):b.j.a.c.f0.c");
    }

    public e g(c0.b bVar, d dVar) {
        if (bVar != null) {
            this.a = bVar;
            this.f = dVar;
            this.c = bVar.f1283h;
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public e h(String str) {
        if (str == null || str.length() == 0) {
            str = this.a.f1283h;
        }
        this.c = str;
        return this;
    }

    public d i(g<?> gVar, i iVar, Collection<a> collection, boolean z, boolean z2) {
        String str;
        i iVar2;
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        c0.b bVar = this.a;
        if (bVar != null) {
            int ordinal = bVar.ordinal();
            HashMap hashMap = null;
            if (ordinal == 0) {
                return null;
            }
            if (ordinal == 1) {
                return new j(iVar, gVar.f1609i.f1589k);
            }
            if (ordinal == 2) {
                return new k(iVar, gVar.f1609i.f1589k);
            }
            if (ordinal != 3) {
                StringBuilder y = b.e.a.a.a.y("Do not know how to construct standard type id resolver for idType: ");
                y.append(this.a);
                throw new IllegalStateException(y.toString());
            } else if (z != z2) {
                Map hashMap2 = z ? new HashMap() : null;
                if (z2) {
                    hashMap = new HashMap();
                    hashMap2 = new TreeMap();
                }
                if (collection != null) {
                    for (a next : collection) {
                        Class<?> cls = next.f1973h;
                        if (next.a()) {
                            str = next.f1975j;
                        } else {
                            str = q.g(cls);
                        }
                        if (z) {
                            hashMap2.put(cls.getName(), str);
                        }
                        if (z2 && ((iVar2 = (i) hashMap.get(str)) == null || !cls.isAssignableFrom(iVar2.f2152h))) {
                            hashMap.put(str, gVar.d(cls));
                        }
                    }
                }
                return new q(gVar, iVar, hashMap2, hashMap);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
    }
}
