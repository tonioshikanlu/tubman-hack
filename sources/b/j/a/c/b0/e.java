package b.j.a.c.b0;

import b.e.a.a.a;
import b.j.a.c.b;
import b.j.a.c.b0.z.c0;
import b.j.a.c.b0.z.r;
import b.j.a.c.c;
import b.j.a.c.e0.i;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.p;
import b.j.a.c.t;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class e {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1776b;
    public final c c;
    public final Map<String, u> d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public List<c0> f1777e;
    public HashMap<String, u> f;

    /* renamed from: g  reason: collision with root package name */
    public HashSet<String> f1778g;

    /* renamed from: h  reason: collision with root package name */
    public x f1779h;

    /* renamed from: i  reason: collision with root package name */
    public r f1780i;

    /* renamed from: j  reason: collision with root package name */
    public t f1781j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1782k;

    /* renamed from: l  reason: collision with root package name */
    public i f1783l;

    public e(c cVar, g gVar) {
        this.c = cVar;
        this.f1776b = gVar;
        this.a = gVar.f1993j;
    }

    public Map<String, List<t>> a(Collection<u> collection) {
        b e2 = this.a.e();
        HashMap hashMap = null;
        if (e2 != null) {
            for (u next : collection) {
                List<t> F = e2.F(next.e());
                if (F != null && !F.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next.f1796k.f2305h, F);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    public void b(Collection<u> collection) {
        for (u k2 : collection) {
            k2.k(this.a);
        }
        t tVar = this.f1781j;
        if (tVar != null) {
            tVar.f1789i.g(this.a.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        i iVar = this.f1783l;
        if (iVar != null) {
            iVar.g(this.a.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void c(String str) {
        if (this.f1778g == null) {
            this.f1778g = new HashSet<>();
        }
        this.f1778g.add(str);
    }

    public void d(u uVar) {
        u put = this.d.put(uVar.f1796k.f2305h, uVar);
        if (put != null && put != uVar) {
            StringBuilder y = a.y("Duplicate property '");
            y.append(uVar.f1796k.f2305h);
            y.append("' for ");
            y.append(this.c.a);
            throw new IllegalArgumentException(y.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> e() {
        /*
            r13 = this;
            java.util.Map<java.lang.String, b.j.a.c.b0.u> r0 = r13.d
            java.util.Collection r0 = r0.values()
            r13.b(r0)
            b.j.a.c.f r1 = r13.a
            b.j.a.c.p r2 = b.j.a.c.p.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r1 = r1.o(r2)
            java.util.Map r2 = r13.a(r0)
            b.j.a.c.b0.z.c r3 = new b.j.a.c.b0.z.c
            r3.<init>(r1, r0, r2)
            r3.n()
            b.j.a.c.f r1 = r13.a
            b.j.a.c.p r2 = b.j.a.c.p.DEFAULT_VIEW_INCLUSION
            boolean r1 = r1.o(r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0041
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r0.next()
            b.j.a.c.b0.u r4 = (b.j.a.c.b0.u) r4
            boolean r4 = r4.y()
            if (r4 == 0) goto L_0x002d
            r12 = r2
            goto L_0x0042
        L_0x0041:
            r12 = r1
        L_0x0042:
            b.j.a.c.b0.z.r r0 = r13.f1780i
            if (r0 == 0) goto L_0x0053
            b.j.a.c.b0.z.t r0 = new b.j.a.c.b0.z.t
            b.j.a.c.b0.z.r r1 = r13.f1780i
            b.j.a.c.s r2 = b.j.a.c.s.f2292o
            r0.<init>((b.j.a.c.b0.z.r) r1, (b.j.a.c.s) r2)
            b.j.a.c.b0.z.c r3 = r3.H(r0)
        L_0x0053:
            r8 = r3
            b.j.a.c.b0.c r0 = new b.j.a.c.b0.c
            b.j.a.c.c r7 = r13.c
            java.util.HashMap<java.lang.String, b.j.a.c.b0.u> r9 = r13.f
            java.util.HashSet<java.lang.String> r10 = r13.f1778g
            boolean r11 = r13.f1782k
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.e.e():b.j.a.c.j");
    }
}
