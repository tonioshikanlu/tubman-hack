package e.a.a.a.y0.e;

import e.a.a.a.y0.e.l;
import e.a.a.a.y0.e.o;
import e.a.a.a.y0.e.p;
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

public final class m extends h.d<m> implements Object {

    /* renamed from: q  reason: collision with root package name */
    public static final m f8968q;
    public static r<m> r = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8969i;

    /* renamed from: j  reason: collision with root package name */
    public int f8970j;

    /* renamed from: k  reason: collision with root package name */
    public p f8971k;

    /* renamed from: l  reason: collision with root package name */
    public o f8972l;

    /* renamed from: m  reason: collision with root package name */
    public l f8973m;

    /* renamed from: n  reason: collision with root package name */
    public List<c> f8974n;

    /* renamed from: o  reason: collision with root package name */
    public byte f8975o;

    /* renamed from: p  reason: collision with root package name */
    public int f8976p;

    public static class a extends e.a.a.a.y0.h.b<m> {
        public Object a(d dVar, f fVar) {
            return new m(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<m, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8977k;

        /* renamed from: l  reason: collision with root package name */
        public p f8978l = p.f9024l;

        /* renamed from: m  reason: collision with root package name */
        public o f8979m = o.f8998l;

        /* renamed from: n  reason: collision with root package name */
        public l f8980n = l.r;

        /* renamed from: o  reason: collision with root package name */
        public List<c> f8981o = Collections.emptyList();

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
            m l2 = l();
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
            m((m) hVar);
            return this;
        }

        public m l() {
            m mVar = new m(this, (a) null);
            int i2 = this.f8977k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            mVar.f8971k = this.f8978l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            mVar.f8972l = this.f8979m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            mVar.f8973m = this.f8980n;
            if ((i2 & 8) == 8) {
                this.f8981o = Collections.unmodifiableList(this.f8981o);
                this.f8977k &= -9;
            }
            mVar.f8974n = this.f8981o;
            mVar.f8970j = i3;
            return mVar;
        }

        public b m(m mVar) {
            l lVar;
            o oVar;
            p pVar;
            if (mVar == m.f8968q) {
                return this;
            }
            boolean z = true;
            if ((mVar.f8970j & 1) == 1) {
                p pVar2 = mVar.f8971k;
                if ((this.f8977k & 1) == 1 && (pVar = this.f8978l) != p.f9024l) {
                    p.b bVar = new p.b();
                    bVar.l(pVar);
                    bVar.l(pVar2);
                    pVar2 = bVar.k();
                }
                this.f8978l = pVar2;
                this.f8977k |= 1;
            }
            if ((mVar.f8970j & 2) == 2) {
                o oVar2 = mVar.f8972l;
                if ((this.f8977k & 2) == 2 && (oVar = this.f8979m) != o.f8998l) {
                    o.b bVar2 = new o.b();
                    bVar2.l(oVar);
                    bVar2.l(oVar2);
                    oVar2 = bVar2.k();
                }
                this.f8979m = oVar2;
                this.f8977k |= 2;
            }
            if ((mVar.f8970j & 4) != 4) {
                z = false;
            }
            if (z) {
                l lVar2 = mVar.f8973m;
                if ((this.f8977k & 4) == 4 && (lVar = this.f8980n) != l.r) {
                    l.b bVar3 = new l.b();
                    bVar3.m(lVar);
                    bVar3.m(lVar2);
                    lVar2 = bVar3.l();
                }
                this.f8980n = lVar2;
                this.f8977k |= 4;
            }
            if (!mVar.f8974n.isEmpty()) {
                if (this.f8981o.isEmpty()) {
                    this.f8981o = mVar.f8974n;
                    this.f8977k &= -9;
                } else {
                    if ((this.f8977k & 8) != 8) {
                        this.f8981o = new ArrayList(this.f8981o);
                        this.f8977k |= 8;
                    }
                    this.f8981o.addAll(mVar.f8974n);
                }
            }
            k(mVar);
            this.f9236h = this.f9236h.e(mVar.f8969i);
            return this;
        }

        public b n(d dVar, f fVar) {
            m mVar;
            m mVar2 = null;
            try {
                m a = m.r.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                mVar = (m) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                m(mVar2);
            }
            throw th;
        }
    }

    static {
        m mVar = new m();
        f8968q = mVar;
        mVar.f8971k = p.f9024l;
        mVar.f8972l = o.f8998l;
        mVar.f8973m = l.r;
        mVar.f8974n = Collections.emptyList();
    }

    public m() {
        this.f8975o = -1;
        this.f8976p = -1;
        this.f8969i = c.f9218h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: e.a.a.a.y0.e.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: e.a.a.a.y0.e.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: e.a.a.a.y0.e.l$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(e.a.a.a.y0.h.d r9, e.a.a.a.y0.h.f r10, e.a.a.a.y0.e.a r11) {
        /*
            r8 = this;
            r8.<init>()
            r11 = -1
            r8.f8975o = r11
            r8.f8976p = r11
            e.a.a.a.y0.e.p r11 = e.a.a.a.y0.e.p.f9024l
            r8.f8971k = r11
            e.a.a.a.y0.e.o r11 = e.a.a.a.y0.e.o.f8998l
            r8.f8972l = r11
            e.a.a.a.y0.e.l r11 = e.a.a.a.y0.e.l.r
            r8.f8973m = r11
            java.util.List r11 = java.util.Collections.emptyList()
            r8.f8974n = r11
            e.a.a.a.y0.h.c$b r11 = e.a.a.a.y0.h.c.D()
            r0 = 1
            e.a.a.a.y0.h.e r1 = e.a.a.a.y0.h.e.k(r11, r0)
            r2 = 0
            r3 = r2
        L_0x0025:
            r4 = 8
            if (r2 != 0) goto L_0x0122
            int r5 = r9.o()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r5 == 0) goto L_0x00e8
            r6 = 10
            r7 = 0
            if (r5 == r6) goto L_0x00ba
            r6 = 18
            if (r5 == r6) goto L_0x008c
            r6 = 26
            if (r5 == r6) goto L_0x0061
            r6 = 34
            if (r5 == r6) goto L_0x0048
            boolean r4 = r8.q(r9, r1, r10, r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r4 != 0) goto L_0x0025
            goto L_0x00e8
        L_0x0048:
            r5 = r3 & 8
            if (r5 == r4) goto L_0x0055
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8974n = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r3 = r3 | 8
        L_0x0055:
            java.util.List<e.a.a.a.y0.e.c> r5 = r8.f8974n     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.c> r6 = e.a.a.a.y0.e.c.G     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.h.p r6 = r9.h(r6, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5.add(r6)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x0061:
            int r5 = r8.f8970j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r6 = 4
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0074
            e.a.a.a.y0.e.l r5 = r8.f8973m     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.l$b r7 = new e.a.a.a.y0.e.l$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.m(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x0074:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.l> r5 = e.a.a.a.y0.e.l.s     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.h.p r5 = r9.h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.l r5 = (e.a.a.a.y0.e.l) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8973m = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x0089
            r7.m(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.l r5 = r7.l()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8973m = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x0089:
            int r5 = r8.f8970j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x00b5
        L_0x008c:
            int r5 = r8.f8970j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r6 = 2
            r5 = r5 & r6
            if (r5 != r6) goto L_0x009f
            e.a.a.a.y0.e.o r5 = r8.f8972l     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.o$b r7 = new e.a.a.a.y0.e.o$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x009f:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.o> r5 = e.a.a.a.y0.e.o.f8999m     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.h.p r5 = r9.h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.o r5 = (e.a.a.a.y0.e.o) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8972l = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x0089
            r7.l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.o r5 = r7.k()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8972l = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0089
        L_0x00b5:
            r5 = r5 | r6
            r8.f8970j = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x00ba:
            int r5 = r8.f8970j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00cc
            e.a.a.a.y0.e.p r5 = r8.f8971k     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.p$b r7 = new e.a.a.a.y0.e.p$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x00cc:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.p> r5 = e.a.a.a.y0.e.p.f9025m     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.h.p r5 = r9.h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.p r5 = (e.a.a.a.y0.e.p) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8971k = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x00e1
            r7.l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            e.a.a.a.y0.e.p r5 = r7.k()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f8971k = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x00e1:
            int r5 = r8.f8970j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5 = r5 | r0
            r8.f8970j = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x00e8:
            r2 = r0
            goto L_0x0025
        L_0x00eb:
            r9 = move-exception
            goto L_0x00fe
        L_0x00ed:
            r9 = move-exception
            e.a.a.a.y0.h.j r10 = new e.a.a.a.y0.h.j     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00eb }
            r10.<init>(r9)     // Catch:{ all -> 0x00eb }
            r10.f9248h = r8     // Catch:{ all -> 0x00eb }
            throw r10     // Catch:{ all -> 0x00eb }
        L_0x00fa:
            r9 = move-exception
            r9.f9248h = r8     // Catch:{ all -> 0x00eb }
            throw r9     // Catch:{ all -> 0x00eb }
        L_0x00fe:
            r10 = r3 & 8
            if (r10 != r4) goto L_0x010a
            java.util.List<e.a.a.a.y0.e.c> r10 = r8.f8974n
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r8.f8974n = r10
        L_0x010a:
            r1.j()     // Catch:{ IOException -> 0x0116, all -> 0x010e }
            goto L_0x0116
        L_0x010e:
            r9 = move-exception
            e.a.a.a.y0.h.c r10 = r11.q()
            r8.f8969i = r10
            throw r9
        L_0x0116:
            e.a.a.a.y0.h.c r10 = r11.q()
            r8.f8969i = r10
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r10 = r8.f9239h
            r10.i()
            throw r9
        L_0x0122:
            r9 = r3 & 8
            if (r9 != r4) goto L_0x012e
            java.util.List<e.a.a.a.y0.e.c> r9 = r8.f8974n
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r8.f8974n = r9
        L_0x012e:
            r1.j()     // Catch:{ IOException -> 0x013a, all -> 0x0132 }
            goto L_0x013a
        L_0x0132:
            r9 = move-exception
            e.a.a.a.y0.h.c r10 = r11.q()
            r8.f8969i = r10
            throw r9
        L_0x013a:
            e.a.a.a.y0.h.c r9 = r11.q()
            r8.f8969i = r9
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r9 = r8.f9239h
            r9.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.m.<init>(e.a.a.a.y0.h.d, e.a.a.a.y0.h.f, e.a.a.a.y0.e.a):void");
    }

    public int a() {
        int i2 = this.f8976p;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f8970j & 1) == 1 ? e.e(1, this.f8971k) + 0 : 0;
        if ((this.f8970j & 2) == 2) {
            e2 += e.e(2, this.f8972l);
        }
        if ((this.f8970j & 4) == 4) {
            e2 += e.e(3, this.f8973m);
        }
        for (int i3 = 0; i3 < this.f8974n.size(); i3++) {
            e2 += e.e(4, this.f8974n.get(i3));
        }
        int size = this.f8969i.size() + k() + e2;
        this.f8976p = size;
        return size;
    }

    public e.a.a.a.y0.h.p b() {
        return f8968q;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8970j & 1) == 1) {
            eVar.r(1, this.f8971k);
        }
        if ((this.f8970j & 2) == 2) {
            eVar.r(2, this.f8972l);
        }
        if ((this.f8970j & 4) == 4) {
            eVar.r(3, this.f8973m);
        }
        for (int i2 = 0; i2 < this.f8974n.size(); i2++) {
            eVar.r(4, this.f8974n.get(i2));
        }
        o2.a(200, eVar);
        eVar.u(this.f8969i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8975o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f8970j & 2) == 2) || this.f8972l.g()) {
            if (!((this.f8970j & 4) == 4) || this.f8973m.g()) {
                for (int i2 = 0; i2 < this.f8974n.size(); i2++) {
                    if (!this.f8974n.get(i2).g()) {
                        this.f8975o = 0;
                        return false;
                    }
                }
                if (!j()) {
                    this.f8975o = 0;
                    return false;
                }
                this.f8975o = 1;
                return true;
            }
            this.f8975o = 0;
            return false;
        }
        this.f8975o = 0;
        return false;
    }

    public m(h.c cVar, a aVar) {
        super(cVar);
        this.f8975o = -1;
        this.f8976p = -1;
        this.f8969i = cVar.f9236h;
    }
}
