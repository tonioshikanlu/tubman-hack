package b.j.a.c;

import b.j.a.b.d;
import b.j.a.b.f;
import b.j.a.b.i;
import b.j.a.b.m;
import b.j.a.c.a0.a;
import b.j.a.c.a0.h;
import b.j.a.c.b0.f;
import b.j.a.c.b0.l;
import b.j.a.c.e0.f0;
import b.j.a.c.e0.q;
import b.j.a.c.e0.s;
import b.j.a.c.e0.v;
import b.j.a.c.f0.b;
import b.j.a.c.f0.e;
import b.j.a.c.h0.j;
import b.j.a.c.h0.p;
import b.j.a.c.i0.k;
import b.j.a.c.i0.n;
import b.j.a.c.j0.g;
import b.j.a.c.j0.w;
import b.j.a.c.j0.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public class r extends m implements Serializable {
    public static final b r;
    public static final a s;

    /* renamed from: h  reason: collision with root package name */
    public final d f2282h;

    /* renamed from: i  reason: collision with root package name */
    public n f2283i;

    /* renamed from: j  reason: collision with root package name */
    public b f2284j;

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.a0.d f2285k;

    /* renamed from: l  reason: collision with root package name */
    public w f2286l;

    /* renamed from: m  reason: collision with root package name */
    public j f2287m;

    /* renamed from: n  reason: collision with root package name */
    public p f2288n;

    /* renamed from: o  reason: collision with root package name */
    public f f2289o;

    /* renamed from: p  reason: collision with root package name */
    public l f2290p;

    /* renamed from: q  reason: collision with root package name */
    public final ConcurrentHashMap<i, j<Object>> f2291q;

    static {
        k.U(l.class);
        v vVar = new v();
        r = vVar;
        s = new a((s) null, vVar, (u) null, n.f2184k, (e) null, y.u, Locale.getDefault(), (TimeZone) null, b.j.a.b.b.f1372b);
    }

    public r() {
        this((d) null, (j) null, (l) null);
    }

    public r(d dVar, j jVar, l lVar) {
        this.f2291q = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (dVar == null) {
            this.f2282h = new q(this);
        } else {
            this.f2282h = dVar;
            if (dVar.e() == null) {
                dVar.f1389m = this;
            }
        }
        this.f2284j = new b.j.a.c.f0.g.l();
        w wVar = new w();
        this.f2283i = n.f2184k;
        f0 f0Var = new f0((s.a) null);
        a aVar = s;
        q qVar = new q();
        aVar = aVar.f1586h != qVar ? new a(qVar, aVar.f1587i, aVar.f1588j, aVar.f1589k, aVar.f1590l, aVar.f1591m, aVar.f1592n, aVar.f1593o, aVar.f1594p) : aVar;
        b.j.a.c.a0.d dVar2 = new b.j.a.c.a0.d();
        this.f2285k = dVar2;
        a aVar2 = aVar;
        f0 f0Var2 = f0Var;
        w wVar2 = wVar;
        b.j.a.c.a0.d dVar3 = dVar2;
        this.f2286l = new w(aVar2, this.f2284j, f0Var2, wVar2, dVar3);
        this.f2289o = new f(aVar2, this.f2284j, f0Var2, wVar2, dVar3);
        Objects.requireNonNull(this.f2282h);
        w wVar3 = this.f2286l;
        p pVar = p.SORT_PROPERTIES_ALPHABETICALLY;
        if (wVar3.o(pVar)) {
            f(pVar, false);
        }
        this.f2287m = new j.a();
        this.f2290p = new l.a(f.f1785o);
        this.f2288n = b.j.a.c.h0.f.f2049k;
    }

    public void a(b.j.a.b.f fVar, Object obj) {
        w wVar = this.f2286l;
        if (wVar.w(x.INDENT_OUTPUT) && fVar.f1399h == null) {
            b.j.a.b.n nVar = wVar.t;
            if (nVar instanceof b.j.a.b.w.f) {
                nVar = (b.j.a.b.n) ((b.j.a.b.w.f) nVar).h();
            }
            fVar.f1399h = nVar;
        }
        if (!wVar.w(x.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            j jVar = this.f2287m;
            p pVar = this.f2288n;
            j.a aVar = (j.a) jVar;
            Objects.requireNonNull(aVar);
            new j.a(aVar, wVar, pVar).Q(fVar, obj);
            if (wVar.w(x.FLUSH_AFTER_WRITE_VALUE)) {
                fVar.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            j jVar2 = this.f2287m;
            p pVar2 = this.f2288n;
            j.a aVar2 = (j.a) jVar2;
            Objects.requireNonNull(aVar2);
            new j.a(aVar2, wVar, pVar2).Q(fVar, obj);
            if (wVar.w(x.FLUSH_AFTER_WRITE_VALUE)) {
                fVar.flush();
            }
            closeable.close();
        } catch (Exception e2) {
            g.g((b.j.a.b.f) null, closeable, e2);
            throw null;
        }
    }

    public final void b(b.j.a.b.f fVar, Object obj) {
        w wVar = this.f2286l;
        Objects.requireNonNull(wVar);
        boolean z = true;
        if (((x.INDENT_OUTPUT.f2319i & wVar.u) != 0) && fVar.f1399h == null) {
            b.j.a.b.n nVar = wVar.t;
            if (nVar instanceof b.j.a.b.w.f) {
                nVar = (b.j.a.b.n) ((b.j.a.b.w.f) nVar).h();
            }
            if (nVar != null) {
                fVar.f1399h = nVar;
            }
        }
        if ((x.WRITE_BIGDECIMAL_AS_PLAIN.f2319i & wVar.u) == 0) {
            z = false;
        }
        int i2 = wVar.w;
        if (i2 != 0 || z) {
            int i3 = wVar.v;
            if (z) {
                int i4 = f.a.WRITE_BIGDECIMAL_AS_PLAIN.f1409i;
                i3 |= i4;
                i2 |= i4;
            }
            fVar.S(i3, i2);
        }
        int i5 = wVar.y;
        if (!wVar.w(x.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                j jVar = this.f2287m;
                p pVar = this.f2288n;
                j.a aVar = (j.a) jVar;
                Objects.requireNonNull(aVar);
                new j.a(aVar, wVar, pVar).Q(fVar, obj);
                fVar.close();
            } catch (Exception e2) {
                Annotation[] annotationArr = g.a;
                fVar.H(f.a.AUTO_CLOSE_JSON_CONTENT);
                try {
                    fVar.close();
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
                g.D(e2);
                g.E(e2);
                throw new RuntimeException(e2);
            }
        } else {
            Closeable closeable = (Closeable) obj;
            try {
                j jVar2 = this.f2287m;
                p pVar2 = this.f2288n;
                j.a aVar2 = (j.a) jVar2;
                Objects.requireNonNull(aVar2);
                new j.a(aVar2, wVar, pVar2).Q(fVar, obj);
                try {
                    closeable.close();
                    fVar.close();
                } catch (Exception e4) {
                    e = e4;
                    closeable = null;
                    g.g(fVar, closeable, e);
                    throw null;
                }
            } catch (Exception e5) {
                e = e5;
                g.g(fVar, closeable, e);
                throw null;
            }
        }
    }

    public j<Object> c(g gVar, i iVar) {
        j<Object> jVar = this.f2291q.get(iVar);
        if (jVar != null) {
            return jVar;
        }
        j<Object> w = gVar.w(iVar);
        if (w != null) {
            this.f2291q.put(iVar, w);
            return w;
        }
        throw new b.j.a.c.c0.b(gVar.f1996m, "Cannot find a deserializer for type " + iVar, iVar);
    }

    public Object d(i iVar, g gVar, f fVar, i iVar2, j<Object> jVar) {
        t tVar = fVar.f1612m;
        if (tVar == null) {
            w wVar = fVar.f1615p;
            Objects.requireNonNull(wVar);
            tVar = wVar.a(iVar2.f2152h, fVar);
        }
        String str = tVar.f2305h;
        b.j.a.b.l g0 = iVar.g0();
        b.j.a.b.l lVar = b.j.a.b.l.START_OBJECT;
        if (g0 == lVar) {
            b.j.a.b.l T0 = iVar.T0();
            b.j.a.b.l lVar2 = b.j.a.b.l.FIELD_NAME;
            if (T0 == lVar2) {
                String e0 = iVar.e0();
                if (str.equals(e0)) {
                    iVar.T0();
                    Object d = jVar.d(iVar, gVar);
                    b.j.a.b.l T02 = iVar.T0();
                    b.j.a.b.l lVar3 = b.j.a.b.l.END_OBJECT;
                    if (T02 == lVar3) {
                        if (fVar.x(h.FAIL_ON_TRAILING_TOKENS)) {
                            e(iVar, gVar, iVar2);
                        }
                        return d;
                    }
                    gVar.a0(iVar2, lVar3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", str, iVar.g0());
                    throw null;
                }
                throw new b.j.a.c.c0.f(gVar.f1996m, gVar.b("Root name '%s' does not match expected ('%s') for type %s", e0, str, iVar2), iVar2);
            }
            gVar.a0(iVar2, lVar2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", str, iVar.g0());
            throw null;
        }
        gVar.a0(iVar2, lVar, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", str, iVar.g0());
        throw null;
    }

    public final void e(i iVar, g gVar, i iVar2) {
        b.j.a.b.l T0 = iVar.T0();
        if (T0 != null) {
            Class<?> A = g.A(iVar2);
            Objects.requireNonNull(gVar);
            throw new b.j.a.c.c0.f(iVar, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{T0, g.y(A)}), A);
        }
    }

    public r f(p pVar, boolean z) {
        h hVar;
        h hVar2;
        w wVar = this.f2286l;
        p[] pVarArr = new p[1];
        if (z) {
            pVarArr[0] = pVar;
            hVar = wVar.t(pVarArr);
        } else {
            pVarArr[0] = pVar;
            hVar = wVar.u(pVarArr);
        }
        this.f2286l = (w) hVar;
        if (z) {
            hVar2 = this.f2289o.t(pVar);
        } else {
            hVar2 = this.f2289o.u(pVar);
        }
        this.f2289o = (f) hVar2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        r11.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T g(java.lang.String r10, java.lang.Class<T> r11) {
        /*
            r9 = this;
            b.j.a.b.d r0 = r9.f2282h
            b.j.a.b.i r10 = r0.d(r10)
            b.j.a.c.i0.n r0 = r9.f2283i
            b.j.a.c.i0.m r1 = b.j.a.c.i0.n.f2185l
            r2 = 0
            b.j.a.c.i r11 = r0.b(r2, r11, r1)
            b.j.a.c.f r0 = r9.f2289o     // Catch:{ all -> 0x0089 }
            int r1 = r0.x     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x001a
            int r0 = r0.w     // Catch:{ all -> 0x0089 }
            r10.V0(r0, r1)     // Catch:{ all -> 0x0089 }
        L_0x001a:
            r0 = r10
            b.j.a.b.q.c r0 = (b.j.a.b.q.c) r0     // Catch:{ all -> 0x0089 }
            b.j.a.b.l r0 = r0.f1459i     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0030
            b.j.a.b.l r0 = r10.T0()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            b.j.a.c.c0.f r0 = new b.j.a.c.c0.f     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "No content to map due to end-of-input"
            r0.<init>((b.j.a.b.i) r10, (java.lang.String) r1, (b.j.a.c.i) r11)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0030:
            b.j.a.c.f r7 = r9.f2289o     // Catch:{ all -> 0x0089 }
            b.j.a.c.b0.l r1 = r9.f2290p     // Catch:{ all -> 0x0089 }
            b.j.a.c.b0.l$a r1 = (b.j.a.c.b0.l.a) r1     // Catch:{ all -> 0x0089 }
            b.j.a.c.b0.l$a r8 = new b.j.a.c.b0.l$a     // Catch:{ all -> 0x0089 }
            r8.<init>(r1, r7, r10)     // Catch:{ all -> 0x0089 }
            b.j.a.b.l r1 = b.j.a.b.l.VALUE_NULL     // Catch:{ all -> 0x0089 }
            if (r0 != r1) goto L_0x0048
            b.j.a.c.j r0 = r9.c(r8, r11)     // Catch:{ all -> 0x0089 }
            java.lang.Object r2 = r0.c(r8)     // Catch:{ all -> 0x0089 }
            goto L_0x007a
        L_0x0048:
            b.j.a.b.l r1 = b.j.a.b.l.END_ARRAY     // Catch:{ all -> 0x0089 }
            if (r0 == r1) goto L_0x007a
            b.j.a.b.l r1 = b.j.a.b.l.END_OBJECT     // Catch:{ all -> 0x0089 }
            if (r0 != r1) goto L_0x0051
            goto L_0x007a
        L_0x0051:
            b.j.a.c.j r6 = r9.c(r8, r11)     // Catch:{ all -> 0x0089 }
            b.j.a.c.t r0 = r7.f1612m     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.e()     // Catch:{ all -> 0x0089 }
            r0 = r0 ^ 1
            goto L_0x0066
        L_0x0060:
            b.j.a.c.h r0 = b.j.a.c.h.UNWRAP_ROOT_VALUE     // Catch:{ all -> 0x0089 }
            boolean r0 = r7.x(r0)     // Catch:{ all -> 0x0089 }
        L_0x0066:
            if (r0 == 0) goto L_0x0072
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1.d(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0076
        L_0x0072:
            java.lang.Object r0 = r6.d(r10, r8)     // Catch:{ all -> 0x0089 }
        L_0x0076:
            r2 = r0
            r8.g0()     // Catch:{ all -> 0x0089 }
        L_0x007a:
            b.j.a.c.h r0 = b.j.a.c.h.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0089 }
            boolean r0 = r7.x(r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0085
            r9.e(r10, r8, r11)     // Catch:{ all -> 0x0089 }
        L_0x0085:
            r10.close()
            return r2
        L_0x0089:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r10 = move-exception
            r11.addSuppressed(r10)
        L_0x0094:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.r.g(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public String h(Object obj) {
        b.j.a.b.s.h hVar = new b.j.a.b.s.h(this.f2282h.b());
        try {
            d dVar = this.f2282h;
            b(dVar.a(hVar, new b.j.a.b.s.b(dVar.b(), hVar, false)), obj);
            String h2 = hVar.f1482h.h();
            hVar.f1482h.p();
            return h2;
        } catch (b.j.a.b.j e2) {
            throw e2;
        } catch (IOException e3) {
            throw new k((Closeable) null, String.format("Unexpected IOException (of type %s): %s", new Object[]{e3.getClass().getName(), g.i(e3)}));
        }
    }
}
