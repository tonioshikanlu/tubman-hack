package e.a.a.a.y0.e;

import e.a.a.a.y0.e.e;
import e.a.a.a.y0.e.t;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i extends h.d<i> implements Object {
    public static final i y;
    public static r<i> z = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8925i;

    /* renamed from: j  reason: collision with root package name */
    public int f8926j;

    /* renamed from: k  reason: collision with root package name */
    public int f8927k;

    /* renamed from: l  reason: collision with root package name */
    public int f8928l;

    /* renamed from: m  reason: collision with root package name */
    public int f8929m;

    /* renamed from: n  reason: collision with root package name */
    public q f8930n;

    /* renamed from: o  reason: collision with root package name */
    public int f8931o;

    /* renamed from: p  reason: collision with root package name */
    public List<s> f8932p;

    /* renamed from: q  reason: collision with root package name */
    public q f8933q;
    public int r;
    public List<u> s;
    public t t;
    public List<Integer> u;
    public e v;
    public byte w;
    public int x;

    public static class a extends e.a.a.a.y0.h.b<i> {
        public Object a(d dVar, f fVar) {
            return new i(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<i, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8934k;

        /* renamed from: l  reason: collision with root package name */
        public int f8935l = 6;

        /* renamed from: m  reason: collision with root package name */
        public int f8936m = 6;

        /* renamed from: n  reason: collision with root package name */
        public int f8937n;

        /* renamed from: o  reason: collision with root package name */
        public q f8938o;

        /* renamed from: p  reason: collision with root package name */
        public int f8939p;

        /* renamed from: q  reason: collision with root package name */
        public List<s> f8940q;
        public q r;
        public int s;
        public List<u> t;
        public t u;
        public List<Integer> v;
        public e w;

        public b() {
            q qVar = q.A;
            this.f8938o = qVar;
            this.f8940q = Collections.emptyList();
            this.r = qVar;
            this.t = Collections.emptyList();
            this.u = t.f9104n;
            this.v = Collections.emptyList();
            this.w = e.f8860l;
        }

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
            i l2 = l();
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
            m((i) hVar);
            return this;
        }

        public i l() {
            i iVar = new i(this, (a) null);
            int i2 = this.f8934k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            iVar.f8927k = this.f8935l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            iVar.f8928l = this.f8936m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            iVar.f8929m = this.f8937n;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            iVar.f8930n = this.f8938o;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            iVar.f8931o = this.f8939p;
            if ((i2 & 32) == 32) {
                this.f8940q = Collections.unmodifiableList(this.f8940q);
                this.f8934k &= -33;
            }
            iVar.f8932p = this.f8940q;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            iVar.f8933q = this.r;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            iVar.r = this.s;
            if ((this.f8934k & 256) == 256) {
                this.t = Collections.unmodifiableList(this.t);
                this.f8934k &= -257;
            }
            iVar.s = this.t;
            if ((i2 & 512) == 512) {
                i3 |= 128;
            }
            iVar.t = this.u;
            if ((this.f8934k & 1024) == 1024) {
                this.v = Collections.unmodifiableList(this.v);
                this.f8934k &= -1025;
            }
            iVar.u = this.v;
            if ((i2 & 2048) == 2048) {
                i3 |= 256;
            }
            iVar.v = this.w;
            iVar.f8926j = i3;
            return iVar;
        }

        public b m(i iVar) {
            e eVar;
            t tVar;
            q qVar;
            q qVar2;
            if (iVar == i.y) {
                return this;
            }
            int i2 = iVar.f8926j;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = iVar.f8927k;
                this.f8934k |= 1;
                this.f8935l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = iVar.f8928l;
                this.f8934k = 2 | this.f8934k;
                this.f8936m = i4;
            }
            if ((i2 & 4) == 4) {
                int i5 = iVar.f8929m;
                this.f8934k = 4 | this.f8934k;
                this.f8937n = i5;
            }
            if (iVar.v()) {
                q qVar3 = iVar.f8930n;
                if ((this.f8934k & 8) == 8 && (qVar2 = this.f8938o) != q.A) {
                    qVar3 = b.e.a.a.a.F(qVar2, qVar3);
                }
                this.f8938o = qVar3;
                this.f8934k |= 8;
            }
            if ((iVar.f8926j & 16) == 16) {
                int i6 = iVar.f8931o;
                this.f8934k = 16 | this.f8934k;
                this.f8939p = i6;
            }
            if (!iVar.f8932p.isEmpty()) {
                if (this.f8940q.isEmpty()) {
                    this.f8940q = iVar.f8932p;
                    this.f8934k &= -33;
                } else {
                    if ((this.f8934k & 32) != 32) {
                        this.f8940q = new ArrayList(this.f8940q);
                        this.f8934k |= 32;
                    }
                    this.f8940q.addAll(iVar.f8932p);
                }
            }
            if (iVar.t()) {
                q qVar4 = iVar.f8933q;
                if ((this.f8934k & 64) == 64 && (qVar = this.r) != q.A) {
                    qVar4 = b.e.a.a.a.F(qVar, qVar4);
                }
                this.r = qVar4;
                this.f8934k |= 64;
            }
            if (iVar.u()) {
                int i7 = iVar.r;
                this.f8934k |= 128;
                this.s = i7;
            }
            if (!iVar.s.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = iVar.s;
                    this.f8934k &= -257;
                } else {
                    if ((this.f8934k & 256) != 256) {
                        this.t = new ArrayList(this.t);
                        this.f8934k |= 256;
                    }
                    this.t.addAll(iVar.s);
                }
            }
            if ((iVar.f8926j & 128) == 128) {
                t tVar2 = iVar.t;
                if ((this.f8934k & 512) == 512 && (tVar = this.u) != t.f9104n) {
                    t.b j2 = t.j(tVar);
                    j2.l(tVar2);
                    tVar2 = j2.k();
                }
                this.u = tVar2;
                this.f8934k |= 512;
            }
            if (!iVar.u.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = iVar.u;
                    this.f8934k &= -1025;
                } else {
                    if ((this.f8934k & 1024) != 1024) {
                        this.v = new ArrayList(this.v);
                        this.f8934k |= 1024;
                    }
                    this.v.addAll(iVar.u);
                }
            }
            if ((iVar.f8926j & 256) == 256) {
                z = true;
            }
            if (z) {
                e eVar2 = iVar.v;
                if ((this.f8934k & 2048) == 2048 && (eVar = this.w) != e.f8860l) {
                    e.b bVar = new e.b();
                    bVar.l(eVar);
                    bVar.l(eVar2);
                    eVar2 = bVar.k();
                }
                this.w = eVar2;
                this.f8934k |= 2048;
            }
            k(iVar);
            this.f9236h = this.f9236h.e(iVar.f8925i);
            return this;
        }

        public b n(d dVar, f fVar) {
            i iVar;
            i iVar2 = null;
            try {
                i a = i.z.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                iVar = (i) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                iVar2 = iVar;
            }
            if (iVar2 != null) {
                m(iVar2);
            }
            throw th;
        }
    }

    static {
        i iVar = new i();
        y = iVar;
        iVar.w();
    }

    public i() {
        this.w = -1;
        this.x = -1;
        this.f8925i = c.f9218h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: e.a.a.a.y0.e.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: e.a.a.a.y0.e.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: e.a.a.a.y0.e.e$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        r8 = r11.h(r8, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014b, code lost:
        r7.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0177, code lost:
        r10.f8926j |= r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(e.a.a.a.y0.h.d r11, e.a.a.a.y0.h.f r12, e.a.a.a.y0.e.a r13) {
        /*
            r10 = this;
            r10.<init>()
            r13 = -1
            r10.w = r13
            r10.x = r13
            r10.w()
            e.a.a.a.y0.h.c$b r13 = e.a.a.a.y0.h.c.D()
            r0 = 1
            e.a.a.a.y0.h.e r1 = e.a.a.a.y0.h.e.k(r13, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 32
            r5 = 256(0x100, float:3.59E-43)
            r6 = 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x01ec
            int r7 = r11.o()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8 = 0
            switch(r7) {
                case 0: goto L_0x019a;
                case 8: goto L_0x018a;
                case 16: goto L_0x017c;
                case 26: goto L_0x0150;
                case 34: goto L_0x0139;
                case 42: goto L_0x010f;
                case 50: goto L_0x00f9;
                case 56: goto L_0x00eb;
                case 64: goto L_0x00dd;
                case 72: goto L_0x00d0;
                case 242: goto L_0x00a7;
                case 248: goto L_0x008e;
                case 250: goto L_0x0059;
                case 258: goto L_0x002c;
                default: goto L_0x0026;
            }     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x0026:
            boolean r4 = r10.q(r11, r1, r12, r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0198
        L_0x002c:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 & r5
            if (r7 != r5) goto L_0x003e
            e.a.a.a.y0.e.e r7 = r10.v     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.util.Objects.requireNonNull(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.e$b r8 = new e.a.a.a.y0.e.e$b     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8.<init>()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8.l(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x003e:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.e> r7 = e.a.a.a.y0.e.e.f8861m     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.p r7 = r11.h(r7, r12)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.e r7 = (e.a.a.a.y0.e.e) r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.v = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 == 0) goto L_0x0053
            r8.l(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.e r7 = r8.k()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.v = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x0053:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | r5
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x0059:
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.d(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8 = r3 & 1024(0x400, float:1.435E-42)
            if (r8 == r6) goto L_0x0074
            int r8 = r11.b()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 <= 0) goto L_0x0074
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8.<init>()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.u = r8     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x0074:
            int r8 = r11.b()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 <= 0) goto L_0x0088
            java.util.List<java.lang.Integer> r8 = r10.u     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r9 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r8.add(r9)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0074
        L_0x0088:
            r11.f9229i = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r11.p()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x008e:
            r7 = r3 & 1024(0x400, float:1.435E-42)
            if (r7 == r6) goto L_0x009b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7.<init>()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.u = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x009b:
            java.util.List<java.lang.Integer> r7 = r10.u     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r8 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x014b
        L_0x00a7:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r9 = 128(0x80, float:1.794E-43)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x00b7
            e.a.a.a.y0.e.t r7 = r10.t     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.util.Objects.requireNonNull(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.t$b r8 = e.a.a.a.y0.e.t.j(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x00b7:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.t> r7 = e.a.a.a.y0.e.t.f9105o     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.p r7 = r11.h(r7, r12)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.t r7 = (e.a.a.a.y0.e.t) r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.t = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 == 0) goto L_0x00cc
            r8.l(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.t r7 = r8.k()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.t = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x00cc:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0177
        L_0x00d0:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | r0
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8927k = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x00dd:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | 64
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.r = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x00eb:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | 16
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8931o = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x00f9:
            r7 = r3 & 256(0x100, float:3.59E-43)
            if (r7 == r5) goto L_0x0106
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7.<init>()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.s = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x0106:
            java.util.List<e.a.a.a.y0.e.u> r7 = r10.s     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.u> r8 = e.a.a.a.y0.e.u.t     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x010a:
            e.a.a.a.y0.h.p r8 = r11.h(r8, r12)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x014b
        L_0x010f:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 & r4
            if (r7 != r4) goto L_0x011d
            e.a.a.a.y0.e.q r7 = r10.f8933q     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.util.Objects.requireNonNull(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q$c r8 = e.a.a.a.y0.e.q.z(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x011d:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.q> r7 = e.a.a.a.y0.e.q.B     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.p r7 = r11.h(r7, r12)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q r7 = (e.a.a.a.y0.e.q) r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8933q = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 == 0) goto L_0x0132
            r8.m(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q r7 = r8.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8933q = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x0132:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | r4
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x0139:
            r7 = r3 & 32
            if (r7 == r4) goto L_0x0146
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7.<init>()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8932p = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r3 = r3 | 32
        L_0x0146:
            java.util.List<e.a.a.a.y0.e.s> r7 = r10.f8932p     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.s> r8 = e.a.a.a.y0.e.s.u     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x010a
        L_0x014b:
            r7.add(r8)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x0150:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r9 = 8
            r7 = r7 & r9
            if (r7 != r9) goto L_0x0160
            e.a.a.a.y0.e.q r7 = r10.f8930n     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            java.util.Objects.requireNonNull(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q$c r8 = e.a.a.a.y0.e.q.z(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
        L_0x0160:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.q> r7 = e.a.a.a.y0.e.q.B     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.h.p r7 = r11.h(r7, r12)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q r7 = (e.a.a.a.y0.e.q) r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8930n = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            if (r8 == 0) goto L_0x00cc
            r8.m(r7)     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            e.a.a.a.y0.e.q r7 = r8.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8930n = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x00cc
        L_0x0177:
            r7 = r7 | r9
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x017c:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | 4
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8929m = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x018a:
            int r7 = r10.f8926j     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r7 = r7 | 2
            r10.f8926j = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            int r7 = r11.l()     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            r10.f8928l = r7     // Catch:{ j -> 0x01ac, IOException -> 0x019f }
            goto L_0x0016
        L_0x0198:
            if (r4 != 0) goto L_0x0016
        L_0x019a:
            r2 = r0
            goto L_0x0016
        L_0x019d:
            r11 = move-exception
            goto L_0x01b0
        L_0x019f:
            r11 = move-exception
            e.a.a.a.y0.h.j r12 = new e.a.a.a.y0.h.j     // Catch:{ all -> 0x019d }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x019d }
            r12.<init>(r11)     // Catch:{ all -> 0x019d }
            r12.f9248h = r10     // Catch:{ all -> 0x019d }
            throw r12     // Catch:{ all -> 0x019d }
        L_0x01ac:
            r11 = move-exception
            r11.f9248h = r10     // Catch:{ all -> 0x019d }
            throw r11     // Catch:{ all -> 0x019d }
        L_0x01b0:
            r12 = r3 & 32
            if (r12 != r4) goto L_0x01bc
            java.util.List<e.a.a.a.y0.e.s> r12 = r10.f8932p
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f8932p = r12
        L_0x01bc:
            r12 = r3 & 256(0x100, float:3.59E-43)
            if (r12 != r5) goto L_0x01c8
            java.util.List<e.a.a.a.y0.e.u> r12 = r10.s
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.s = r12
        L_0x01c8:
            r12 = r3 & 1024(0x400, float:1.435E-42)
            if (r12 != r6) goto L_0x01d4
            java.util.List<java.lang.Integer> r12 = r10.u
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.u = r12
        L_0x01d4:
            r1.j()     // Catch:{ IOException -> 0x01e0, all -> 0x01d8 }
            goto L_0x01e0
        L_0x01d8:
            r11 = move-exception
            e.a.a.a.y0.h.c r12 = r13.q()
            r10.f8925i = r12
            throw r11
        L_0x01e0:
            e.a.a.a.y0.h.c r12 = r13.q()
            r10.f8925i = r12
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r12 = r10.f9239h
            r12.i()
            throw r11
        L_0x01ec:
            r11 = r3 & 32
            if (r11 != r4) goto L_0x01f8
            java.util.List<e.a.a.a.y0.e.s> r11 = r10.f8932p
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f8932p = r11
        L_0x01f8:
            r11 = r3 & 256(0x100, float:3.59E-43)
            if (r11 != r5) goto L_0x0204
            java.util.List<e.a.a.a.y0.e.u> r11 = r10.s
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.s = r11
        L_0x0204:
            r11 = r3 & 1024(0x400, float:1.435E-42)
            if (r11 != r6) goto L_0x0210
            java.util.List<java.lang.Integer> r11 = r10.u
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.u = r11
        L_0x0210:
            r1.j()     // Catch:{ IOException -> 0x021c, all -> 0x0214 }
            goto L_0x021c
        L_0x0214:
            r11 = move-exception
            e.a.a.a.y0.h.c r12 = r13.q()
            r10.f8925i = r12
            throw r11
        L_0x021c:
            e.a.a.a.y0.h.c r11 = r13.q()
            r10.f8925i = r11
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r11 = r10.f9239h
            r11.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.i.<init>(e.a.a.a.y0.h.d, e.a.a.a.y0.h.f, e.a.a.a.y0.e.a):void");
    }

    public int a() {
        int i2 = this.x;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.f8926j & 2) == 2 ? e.a.a.a.y0.h.e.c(1, this.f8928l) + 0 : 0;
        if ((this.f8926j & 4) == 4) {
            c += e.a.a.a.y0.h.e.c(2, this.f8929m);
        }
        if ((this.f8926j & 8) == 8) {
            c += e.a.a.a.y0.h.e.e(3, this.f8930n);
        }
        for (int i3 = 0; i3 < this.f8932p.size(); i3++) {
            c += e.a.a.a.y0.h.e.e(4, this.f8932p.get(i3));
        }
        if ((this.f8926j & 32) == 32) {
            c += e.a.a.a.y0.h.e.e(5, this.f8933q);
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            c += e.a.a.a.y0.h.e.e(6, this.s.get(i4));
        }
        if ((this.f8926j & 16) == 16) {
            c += e.a.a.a.y0.h.e.c(7, this.f8931o);
        }
        if ((this.f8926j & 64) == 64) {
            c += e.a.a.a.y0.h.e.c(8, this.r);
        }
        if ((this.f8926j & 1) == 1) {
            c += e.a.a.a.y0.h.e.c(9, this.f8927k);
        }
        if ((this.f8926j & 128) == 128) {
            c += e.a.a.a.y0.h.e.e(30, this.t);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.u.size(); i6++) {
            i5 += e.a.a.a.y0.h.e.d(this.u.get(i6).intValue());
        }
        int size = (this.u.size() * 2) + c + i5;
        if ((this.f8926j & 256) == 256) {
            size += e.a.a.a.y0.h.e.e(32, this.v);
        }
        int size2 = this.f8925i.size() + k() + size;
        this.x = size2;
        return size2;
    }

    public p b() {
        return y;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e.a.a.a.y0.h.e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8926j & 2) == 2) {
            eVar.p(1, this.f8928l);
        }
        if ((this.f8926j & 4) == 4) {
            eVar.p(2, this.f8929m);
        }
        if ((this.f8926j & 8) == 8) {
            eVar.r(3, this.f8930n);
        }
        for (int i2 = 0; i2 < this.f8932p.size(); i2++) {
            eVar.r(4, this.f8932p.get(i2));
        }
        if ((this.f8926j & 32) == 32) {
            eVar.r(5, this.f8933q);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            eVar.r(6, this.s.get(i3));
        }
        if ((this.f8926j & 16) == 16) {
            eVar.p(7, this.f8931o);
        }
        if ((this.f8926j & 64) == 64) {
            eVar.p(8, this.r);
        }
        if ((this.f8926j & 1) == 1) {
            eVar.p(9, this.f8927k);
        }
        if ((this.f8926j & 128) == 128) {
            eVar.r(30, this.t);
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            eVar.p(31, this.u.get(i4).intValue());
        }
        if ((this.f8926j & 256) == 256) {
            eVar.r(32, this.v);
        }
        o2.a(19000, eVar);
        eVar.u(this.f8925i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.w;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f8926j & 4) == 4)) {
            this.w = 0;
            return false;
        } else if (!v() || this.f8930n.g()) {
            for (int i2 = 0; i2 < this.f8932p.size(); i2++) {
                if (!this.f8932p.get(i2).g()) {
                    this.w = 0;
                    return false;
                }
            }
            if (!t() || this.f8933q.g()) {
                for (int i3 = 0; i3 < this.s.size(); i3++) {
                    if (!this.s.get(i3).g()) {
                        this.w = 0;
                        return false;
                    }
                }
                if (!((this.f8926j & 128) == 128) || this.t.g()) {
                    if (((this.f8926j & 256) == 256) && !this.v.g()) {
                        this.w = 0;
                        return false;
                    } else if (!j()) {
                        this.w = 0;
                        return false;
                    } else {
                        this.w = 1;
                        return true;
                    }
                } else {
                    this.w = 0;
                    return false;
                }
            } else {
                this.w = 0;
                return false;
            }
        } else {
            this.w = 0;
            return false;
        }
    }

    public boolean t() {
        return (this.f8926j & 32) == 32;
    }

    public boolean u() {
        return (this.f8926j & 64) == 64;
    }

    public boolean v() {
        return (this.f8926j & 8) == 8;
    }

    public final void w() {
        this.f8927k = 6;
        this.f8928l = 6;
        this.f8929m = 0;
        q qVar = q.A;
        this.f8930n = qVar;
        this.f8931o = 0;
        this.f8932p = Collections.emptyList();
        this.f8933q = qVar;
        this.r = 0;
        this.s = Collections.emptyList();
        this.t = t.f9104n;
        this.u = Collections.emptyList();
        this.v = e.f8860l;
    }

    public i(h.c cVar, a aVar) {
        super(cVar);
        this.w = -1;
        this.x = -1;
        this.f8925i = cVar.f9236h;
    }
}
