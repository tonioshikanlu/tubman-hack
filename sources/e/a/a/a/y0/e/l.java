package e.a.a.a.y0.e;

import e.a.a.a.y0.e.t;
import e.a.a.a.y0.e.w;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l extends h.d<l> implements Object {
    public static final l r;
    public static r<l> s = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8953i;

    /* renamed from: j  reason: collision with root package name */
    public int f8954j;

    /* renamed from: k  reason: collision with root package name */
    public List<i> f8955k;

    /* renamed from: l  reason: collision with root package name */
    public List<n> f8956l;

    /* renamed from: m  reason: collision with root package name */
    public List<r> f8957m;

    /* renamed from: n  reason: collision with root package name */
    public t f8958n;

    /* renamed from: o  reason: collision with root package name */
    public w f8959o;

    /* renamed from: p  reason: collision with root package name */
    public byte f8960p;

    /* renamed from: q  reason: collision with root package name */
    public int f8961q;

    public static class a extends e.a.a.a.y0.h.b<l> {
        public Object a(d dVar, f fVar) {
            return new l(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<l, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8962k;

        /* renamed from: l  reason: collision with root package name */
        public List<i> f8963l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        public List<n> f8964m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        public List<r> f8965n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        public t f8966o = t.f9104n;

        /* renamed from: p  reason: collision with root package name */
        public w f8967p = w.f9158l;

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public p e() {
            l l2 = l();
            if (l2.g()) {
                return l2;
            }
            throw new v();
        }

        public /* bridge */ /* synthetic */ a.C0205a h(d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public h.b i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            m((l) hVar);
            return this;
        }

        public l l() {
            l lVar = new l(this, (a) null);
            int i2 = this.f8962k;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.f8963l = Collections.unmodifiableList(this.f8963l);
                this.f8962k &= -2;
            }
            lVar.f8955k = this.f8963l;
            if ((this.f8962k & 2) == 2) {
                this.f8964m = Collections.unmodifiableList(this.f8964m);
                this.f8962k &= -3;
            }
            lVar.f8956l = this.f8964m;
            if ((this.f8962k & 4) == 4) {
                this.f8965n = Collections.unmodifiableList(this.f8965n);
                this.f8962k &= -5;
            }
            lVar.f8957m = this.f8965n;
            if ((i2 & 8) != 8) {
                i3 = 0;
            }
            lVar.f8958n = this.f8966o;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            lVar.f8959o = this.f8967p;
            lVar.f8954j = i3;
            return lVar;
        }

        public b m(l lVar) {
            w wVar;
            t tVar;
            if (lVar == l.r) {
                return this;
            }
            boolean z = true;
            if (!lVar.f8955k.isEmpty()) {
                if (this.f8963l.isEmpty()) {
                    this.f8963l = lVar.f8955k;
                    this.f8962k &= -2;
                } else {
                    if ((this.f8962k & 1) != 1) {
                        this.f8963l = new ArrayList(this.f8963l);
                        this.f8962k |= 1;
                    }
                    this.f8963l.addAll(lVar.f8955k);
                }
            }
            if (!lVar.f8956l.isEmpty()) {
                if (this.f8964m.isEmpty()) {
                    this.f8964m = lVar.f8956l;
                    this.f8962k &= -3;
                } else {
                    if ((this.f8962k & 2) != 2) {
                        this.f8964m = new ArrayList(this.f8964m);
                        this.f8962k |= 2;
                    }
                    this.f8964m.addAll(lVar.f8956l);
                }
            }
            if (!lVar.f8957m.isEmpty()) {
                if (this.f8965n.isEmpty()) {
                    this.f8965n = lVar.f8957m;
                    this.f8962k &= -5;
                } else {
                    if ((this.f8962k & 4) != 4) {
                        this.f8965n = new ArrayList(this.f8965n);
                        this.f8962k |= 4;
                    }
                    this.f8965n.addAll(lVar.f8957m);
                }
            }
            if ((lVar.f8954j & 1) == 1) {
                t tVar2 = lVar.f8958n;
                if ((this.f8962k & 8) == 8 && (tVar = this.f8966o) != t.f9104n) {
                    t.b j2 = t.j(tVar);
                    j2.l(tVar2);
                    tVar2 = j2.k();
                }
                this.f8966o = tVar2;
                this.f8962k |= 8;
            }
            if ((lVar.f8954j & 2) != 2) {
                z = false;
            }
            if (z) {
                w wVar2 = lVar.f8959o;
                if ((this.f8962k & 16) == 16 && (wVar = this.f8967p) != w.f9158l) {
                    w.b j3 = w.j(wVar);
                    j3.l(wVar2);
                    wVar2 = j3.k();
                }
                this.f8967p = wVar2;
                this.f8962k |= 16;
            }
            k(lVar);
            this.f9236h = this.f9236h.e(lVar.f8953i);
            return this;
        }

        public b n(d dVar, f fVar) {
            l lVar;
            l lVar2 = null;
            try {
                l a = l.s.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                lVar = (l) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                m(lVar2);
            }
            throw th;
        }
    }

    static {
        l lVar = new l();
        r = lVar;
        lVar.t();
    }

    public l() {
        this.f8960p = -1;
        this.f8961q = -1;
        this.f8953i = c.f9218h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: e.a.a.a.y0.e.w$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(e.a.a.a.y0.h.d r10, e.a.a.a.y0.h.f r11, e.a.a.a.y0.e.a r12) {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.f8960p = r12
            r9.f8961q = r12
            r9.t()
            e.a.a.a.y0.h.c$b r12 = e.a.a.a.y0.h.c.D()
            r0 = 1
            e.a.a.a.y0.h.e r1 = e.a.a.a.y0.h.e.k(r12, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 2
            r5 = 4
            if (r2 != 0) goto L_0x0120
            int r6 = r10.o()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r6 == 0) goto L_0x00ce
            r7 = 26
            if (r6 == r7) goto L_0x00b7
            r7 = 34
            if (r6 == r7) goto L_0x00a5
            r7 = 42
            if (r6 == r7) goto L_0x008f
            r7 = 242(0xf2, float:3.39E-43)
            r8 = 0
            if (r6 == r7) goto L_0x0066
            r7 = 258(0x102, float:3.62E-43)
            if (r6 == r7) goto L_0x003d
            boolean r4 = r9.q(r10, r1, r11, r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r4 != 0) goto L_0x0016
            goto L_0x00ce
        L_0x003d:
            int r6 = r9.f8954j     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 & r4
            if (r6 != r4) goto L_0x004b
            e.a.a.a.y0.e.w r6 = r9.f8959o     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.w$b r8 = e.a.a.a.y0.e.w.j(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x004b:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.w> r6 = e.a.a.a.y0.e.w.f9159m     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.h.p r6 = r10.h(r6, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.w r6 = (e.a.a.a.y0.e.w) r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8959o = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r8 == 0) goto L_0x0060
            r8.l(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.w r6 = r8.k()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8959o = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0060:
            int r6 = r9.f8954j     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 | r4
            r9.f8954j = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x0066:
            int r6 = r9.f8954j     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 & r0
            if (r6 != r0) goto L_0x0074
            e.a.a.a.y0.e.t r6 = r9.f8958n     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.t$b r8 = e.a.a.a.y0.e.t.j(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0074:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.t> r6 = e.a.a.a.y0.e.t.f9105o     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.h.p r6 = r10.h(r6, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.t r6 = (e.a.a.a.y0.e.t) r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8958n = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r8 == 0) goto L_0x0089
            r8.l(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.e.t r6 = r8.k()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8958n = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0089:
            int r6 = r9.f8954j     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 | r0
            r9.f8954j = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x008f:
            r6 = r3 & 4
            if (r6 == r5) goto L_0x009c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8957m = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 4
        L_0x009c:
            java.util.List<e.a.a.a.y0.e.r> r6 = r9.f8957m     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.r> r7 = e.a.a.a.y0.e.r.w     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x00a0:
            e.a.a.a.y0.h.p r7 = r10.h(r7, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00c9
        L_0x00a5:
            r6 = r3 & 2
            if (r6 == r4) goto L_0x00b2
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8956l = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 2
        L_0x00b2:
            java.util.List<e.a.a.a.y0.e.n> r6 = r9.f8956l     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.n> r7 = e.a.a.a.y0.e.n.z     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00a0
        L_0x00b7:
            r6 = r3 & 1
            if (r6 == r0) goto L_0x00c4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f8955k = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 1
        L_0x00c4:
            java.util.List<e.a.a.a.y0.e.i> r6 = r9.f8955k     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.i> r7 = e.a.a.a.y0.e.i.z     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00a0
        L_0x00c9:
            r6.add(r7)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x00ce:
            r2 = r0
            goto L_0x0016
        L_0x00d1:
            r10 = move-exception
            goto L_0x00e4
        L_0x00d3:
            r10 = move-exception
            e.a.a.a.y0.h.j r11 = new e.a.a.a.y0.h.j     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00d1 }
            r11.<init>(r10)     // Catch:{ all -> 0x00d1 }
            r11.f9248h = r9     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00e0:
            r10 = move-exception
            r10.f9248h = r9     // Catch:{ all -> 0x00d1 }
            throw r10     // Catch:{ all -> 0x00d1 }
        L_0x00e4:
            r11 = r3 & 1
            if (r11 != r0) goto L_0x00f0
            java.util.List<e.a.a.a.y0.e.i> r11 = r9.f8955k
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f8955k = r11
        L_0x00f0:
            r11 = r3 & 2
            if (r11 != r4) goto L_0x00fc
            java.util.List<e.a.a.a.y0.e.n> r11 = r9.f8956l
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f8956l = r11
        L_0x00fc:
            r11 = r3 & 4
            if (r11 != r5) goto L_0x0108
            java.util.List<e.a.a.a.y0.e.r> r11 = r9.f8957m
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f8957m = r11
        L_0x0108:
            r1.j()     // Catch:{ IOException -> 0x0114, all -> 0x010c }
            goto L_0x0114
        L_0x010c:
            r10 = move-exception
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8953i = r11
            throw r10
        L_0x0114:
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8953i = r11
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r11 = r9.f9239h
            r11.i()
            throw r10
        L_0x0120:
            r10 = r3 & 1
            if (r10 != r0) goto L_0x012c
            java.util.List<e.a.a.a.y0.e.i> r10 = r9.f8955k
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f8955k = r10
        L_0x012c:
            r10 = r3 & 2
            if (r10 != r4) goto L_0x0138
            java.util.List<e.a.a.a.y0.e.n> r10 = r9.f8956l
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f8956l = r10
        L_0x0138:
            r10 = r3 & 4
            if (r10 != r5) goto L_0x0144
            java.util.List<e.a.a.a.y0.e.r> r10 = r9.f8957m
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f8957m = r10
        L_0x0144:
            r1.j()     // Catch:{ IOException -> 0x0150, all -> 0x0148 }
            goto L_0x0150
        L_0x0148:
            r10 = move-exception
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8953i = r11
            throw r10
        L_0x0150:
            e.a.a.a.y0.h.c r10 = r12.q()
            r9.f8953i = r10
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r10 = r9.f9239h
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.l.<init>(e.a.a.a.y0.h.d, e.a.a.a.y0.h.f, e.a.a.a.y0.e.a):void");
    }

    public int a() {
        int i2 = this.f8961q;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f8955k.size(); i4++) {
            i3 += e.e(3, this.f8955k.get(i4));
        }
        for (int i5 = 0; i5 < this.f8956l.size(); i5++) {
            i3 += e.e(4, this.f8956l.get(i5));
        }
        for (int i6 = 0; i6 < this.f8957m.size(); i6++) {
            i3 += e.e(5, this.f8957m.get(i6));
        }
        if ((this.f8954j & 1) == 1) {
            i3 += e.e(30, this.f8958n);
        }
        if ((this.f8954j & 2) == 2) {
            i3 += e.e(32, this.f8959o);
        }
        int size = this.f8953i.size() + k() + i3;
        this.f8961q = size;
        return size;
    }

    public p b() {
        return r;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        for (int i2 = 0; i2 < this.f8955k.size(); i2++) {
            eVar.r(3, this.f8955k.get(i2));
        }
        for (int i3 = 0; i3 < this.f8956l.size(); i3++) {
            eVar.r(4, this.f8956l.get(i3));
        }
        for (int i4 = 0; i4 < this.f8957m.size(); i4++) {
            eVar.r(5, this.f8957m.get(i4));
        }
        if ((this.f8954j & 1) == 1) {
            eVar.r(30, this.f8958n);
        }
        if ((this.f8954j & 2) == 2) {
            eVar.r(32, this.f8959o);
        }
        o2.a(200, eVar);
        eVar.u(this.f8953i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8960p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f8955k.size(); i2++) {
            if (!this.f8955k.get(i2).g()) {
                this.f8960p = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f8956l.size(); i3++) {
            if (!this.f8956l.get(i3).g()) {
                this.f8960p = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f8957m.size(); i4++) {
            if (!this.f8957m.get(i4).g()) {
                this.f8960p = 0;
                return false;
            }
        }
        if (((this.f8954j & 1) == 1) && !this.f8958n.g()) {
            this.f8960p = 0;
            return false;
        } else if (!j()) {
            this.f8960p = 0;
            return false;
        } else {
            this.f8960p = 1;
            return true;
        }
    }

    public final void t() {
        this.f8955k = Collections.emptyList();
        this.f8956l = Collections.emptyList();
        this.f8957m = Collections.emptyList();
        this.f8958n = t.f9104n;
        this.f8959o = w.f9158l;
    }

    public l(h.c cVar, a aVar) {
        super(cVar);
        this.f8960p = -1;
        this.f8961q = -1;
        this.f8953i = cVar.f9236h;
    }
}
