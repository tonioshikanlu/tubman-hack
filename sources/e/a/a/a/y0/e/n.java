package e.a.a.a.y0.e;

import e.a.a.a.y0.e.u;
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

public final class n extends h.d<n> implements Object {
    public static final n y;
    public static r<n> z = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8982i;

    /* renamed from: j  reason: collision with root package name */
    public int f8983j;

    /* renamed from: k  reason: collision with root package name */
    public int f8984k;

    /* renamed from: l  reason: collision with root package name */
    public int f8985l;

    /* renamed from: m  reason: collision with root package name */
    public int f8986m;

    /* renamed from: n  reason: collision with root package name */
    public q f8987n;

    /* renamed from: o  reason: collision with root package name */
    public int f8988o;

    /* renamed from: p  reason: collision with root package name */
    public List<s> f8989p;

    /* renamed from: q  reason: collision with root package name */
    public q f8990q;
    public int r;
    public u s;
    public int t;
    public int u;
    public List<Integer> v;
    public byte w;
    public int x;

    public static class a extends e.a.a.a.y0.h.b<n> {
        public Object a(d dVar, f fVar) {
            return new n(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<n, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8991k;

        /* renamed from: l  reason: collision with root package name */
        public int f8992l = 518;

        /* renamed from: m  reason: collision with root package name */
        public int f8993m = 2054;

        /* renamed from: n  reason: collision with root package name */
        public int f8994n;

        /* renamed from: o  reason: collision with root package name */
        public q f8995o;

        /* renamed from: p  reason: collision with root package name */
        public int f8996p;

        /* renamed from: q  reason: collision with root package name */
        public List<s> f8997q;
        public q r;
        public int s;
        public u t;
        public int u;
        public int v;
        public List<Integer> w;

        public b() {
            q qVar = q.A;
            this.f8995o = qVar;
            this.f8997q = Collections.emptyList();
            this.r = qVar;
            this.t = u.s;
            this.w = Collections.emptyList();
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
            n l2 = l();
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
            m((n) hVar);
            return this;
        }

        public n l() {
            n nVar = new n(this, (a) null);
            int i2 = this.f8991k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            nVar.f8984k = this.f8992l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            nVar.f8985l = this.f8993m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            nVar.f8986m = this.f8994n;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            nVar.f8987n = this.f8995o;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            nVar.f8988o = this.f8996p;
            if ((i2 & 32) == 32) {
                this.f8997q = Collections.unmodifiableList(this.f8997q);
                this.f8991k &= -33;
            }
            nVar.f8989p = this.f8997q;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            nVar.f8990q = this.r;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            nVar.r = this.s;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            nVar.s = this.t;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            nVar.t = this.u;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            nVar.u = this.v;
            if ((this.f8991k & 2048) == 2048) {
                this.w = Collections.unmodifiableList(this.w);
                this.f8991k &= -2049;
            }
            nVar.v = this.w;
            nVar.f8983j = i3;
            return nVar;
        }

        public b m(n nVar) {
            u uVar;
            q qVar;
            q qVar2;
            if (nVar == n.y) {
                return this;
            }
            int i2 = nVar.f8983j;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = nVar.f8984k;
                this.f8991k |= 1;
                this.f8992l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = nVar.f8985l;
                this.f8991k = 2 | this.f8991k;
                this.f8993m = i4;
            }
            if ((i2 & 4) == 4) {
                int i5 = nVar.f8986m;
                this.f8991k = 4 | this.f8991k;
                this.f8994n = i5;
            }
            if (nVar.v()) {
                q qVar3 = nVar.f8987n;
                if ((this.f8991k & 8) == 8 && (qVar2 = this.f8995o) != q.A) {
                    qVar3 = b.e.a.a.a.F(qVar2, qVar3);
                }
                this.f8995o = qVar3;
                this.f8991k |= 8;
            }
            if ((nVar.f8983j & 16) == 16) {
                int i6 = nVar.f8988o;
                this.f8991k = 16 | this.f8991k;
                this.f8996p = i6;
            }
            if (!nVar.f8989p.isEmpty()) {
                if (this.f8997q.isEmpty()) {
                    this.f8997q = nVar.f8989p;
                    this.f8991k &= -33;
                } else {
                    if ((this.f8991k & 32) != 32) {
                        this.f8997q = new ArrayList(this.f8997q);
                        this.f8991k |= 32;
                    }
                    this.f8997q.addAll(nVar.f8989p);
                }
            }
            if (nVar.t()) {
                q qVar4 = nVar.f8990q;
                if ((this.f8991k & 64) == 64 && (qVar = this.r) != q.A) {
                    qVar4 = b.e.a.a.a.F(qVar, qVar4);
                }
                this.r = qVar4;
                this.f8991k |= 64;
            }
            if (nVar.u()) {
                int i7 = nVar.r;
                this.f8991k |= 128;
                this.s = i7;
            }
            if ((nVar.f8983j & 128) == 128) {
                u uVar2 = nVar.s;
                if ((this.f8991k & 256) == 256 && (uVar = this.t) != u.s) {
                    u.b bVar = new u.b();
                    bVar.m(uVar);
                    bVar.m(uVar2);
                    uVar2 = bVar.l();
                }
                this.t = uVar2;
                this.f8991k |= 256;
            }
            int i8 = nVar.f8983j;
            if ((i8 & 256) == 256) {
                int i9 = nVar.t;
                this.f8991k |= 512;
                this.u = i9;
            }
            if ((i8 & 512) == 512) {
                z = true;
            }
            if (z) {
                int i10 = nVar.u;
                this.f8991k |= 1024;
                this.v = i10;
            }
            if (!nVar.v.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = nVar.v;
                    this.f8991k &= -2049;
                } else {
                    if ((this.f8991k & 2048) != 2048) {
                        this.w = new ArrayList(this.w);
                        this.f8991k |= 2048;
                    }
                    this.w.addAll(nVar.v);
                }
            }
            k(nVar);
            this.f9236h = this.f9236h.e(nVar.f8982i);
            return this;
        }

        public b n(d dVar, f fVar) {
            n nVar;
            n nVar2 = null;
            try {
                n a = n.z.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                nVar = (n) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                m(nVar2);
            }
            throw th;
        }
    }

    static {
        n nVar = new n();
        y = nVar;
        nVar.w();
    }

    public n() {
        this.w = -1;
        this.x = -1;
        this.f8982i = c.f9218h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: e.a.a.a.y0.e.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: e.a.a.a.y0.e.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: e.a.a.a.y0.e.u$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0126, code lost:
        r6.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0151, code lost:
        r9.f8983j |= r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(e.a.a.a.y0.h.d r10, e.a.a.a.y0.h.f r11, e.a.a.a.y0.e.a r12) {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.w = r12
            r9.x = r12
            r9.w()
            e.a.a.a.y0.h.c$b r12 = e.a.a.a.y0.h.c.D()
            r0 = 1
            e.a.a.a.y0.h.e r1 = e.a.a.a.y0.h.e.k(r12, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 32
            r5 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x01ba
            int r6 = r10.o()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7 = 0
            switch(r6) {
                case 0: goto L_0x0174;
                case 8: goto L_0x0164;
                case 16: goto L_0x0156;
                case 26: goto L_0x012b;
                case 34: goto L_0x0111;
                case 42: goto L_0x00e7;
                case 50: goto L_0x00bb;
                case 56: goto L_0x00ad;
                case 64: goto L_0x009f;
                case 72: goto L_0x0091;
                case 80: goto L_0x0084;
                case 88: goto L_0x0078;
                case 248: goto L_0x005f;
                case 250: goto L_0x002a;
                default: goto L_0x0024;
            }     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x0024:
            boolean r4 = r9.q(r10, r1, r11, r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0172
        L_0x002a:
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.d(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == r5) goto L_0x0045
            int r7 = r10.b()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            if (r7 <= 0) goto L_0x0045
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7.<init>()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.v = r7     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L_0x0045:
            int r7 = r10.b()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            if (r7 <= 0) goto L_0x0059
            java.util.List<java.lang.Integer> r7 = r9.v     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r8 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7.add(r8)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0045
        L_0x0059:
            r10.f9229i = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r10.p()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x005f:
            r6 = r3 & 2048(0x800, float:2.87E-42)
            if (r6 == r5) goto L_0x006c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6.<init>()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.v = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L_0x006c:
            java.util.List<java.lang.Integer> r6 = r9.v     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r7 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0126
        L_0x0078:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | r0
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8984k = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0084:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 64
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.r = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0091:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 16
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8988o = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x009f:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.u = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x00ad:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 256(0x100, float:3.59E-43)
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.t = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x00bb:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r8 = 128(0x80, float:1.794E-43)
            r6 = r6 & r8
            if (r6 != r8) goto L_0x00cf
            e.a.a.a.y0.e.u r6 = r9.s     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.u$b r7 = new e.a.a.a.y0.e.u$b     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7.<init>()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r7.m(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x00cf:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.u> r6 = e.a.a.a.y0.e.u.t     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.h.p r6 = r10.h(r6, r11)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.u r6 = (e.a.a.a.y0.e.u) r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.s = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            if (r7 == 0) goto L_0x00e4
            r7.m(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.u r6 = r7.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.s = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x00e4:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0151
        L_0x00e7:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 & r4
            if (r6 != r4) goto L_0x00f5
            e.a.a.a.y0.e.q r6 = r9.f8990q     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q$c r7 = e.a.a.a.y0.e.q.z(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x00f5:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.q> r6 = e.a.a.a.y0.e.q.B     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.h.p r6 = r10.h(r6, r11)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q r6 = (e.a.a.a.y0.e.q) r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8990q = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            if (r7 == 0) goto L_0x010a
            r7.m(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q r6 = r7.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8990q = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x010a:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | r4
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0111:
            r6 = r3 & 32
            if (r6 == r4) goto L_0x011e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6.<init>()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8989p = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r3 = r3 | 32
        L_0x011e:
            java.util.List<e.a.a.a.y0.e.s> r6 = r9.f8989p     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.s> r7 = e.a.a.a.y0.e.s.u     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.h.p r7 = r10.h(r7, r11)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x0126:
            r6.add(r7)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x012b:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r8 = 8
            r6 = r6 & r8
            if (r6 != r8) goto L_0x013b
            e.a.a.a.y0.e.q r6 = r9.f8987n     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q$c r7 = e.a.a.a.y0.e.q.z(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
        L_0x013b:
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.q> r6 = e.a.a.a.y0.e.q.B     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.h.p r6 = r10.h(r6, r11)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q r6 = (e.a.a.a.y0.e.q) r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8987n = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            if (r7 == 0) goto L_0x00e4
            r7.m(r6)     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            e.a.a.a.y0.e.q r6 = r7.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8987n = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x00e4
        L_0x0151:
            r6 = r6 | r8
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0156:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 4
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8986m = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0164:
            int r6 = r9.f8983j     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r6 = r6 | 2
            r9.f8983j = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            int r6 = r10.l()     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            r9.f8985l = r6     // Catch:{ j -> 0x0186, IOException -> 0x0179 }
            goto L_0x0016
        L_0x0172:
            if (r4 != 0) goto L_0x0016
        L_0x0174:
            r2 = r0
            goto L_0x0016
        L_0x0177:
            r10 = move-exception
            goto L_0x018a
        L_0x0179:
            r10 = move-exception
            e.a.a.a.y0.h.j r11 = new e.a.a.a.y0.h.j     // Catch:{ all -> 0x0177 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0177 }
            r11.<init>(r10)     // Catch:{ all -> 0x0177 }
            r11.f9248h = r9     // Catch:{ all -> 0x0177 }
            throw r11     // Catch:{ all -> 0x0177 }
        L_0x0186:
            r10 = move-exception
            r10.f9248h = r9     // Catch:{ all -> 0x0177 }
            throw r10     // Catch:{ all -> 0x0177 }
        L_0x018a:
            r11 = r3 & 32
            if (r11 != r4) goto L_0x0196
            java.util.List<e.a.a.a.y0.e.s> r11 = r9.f8989p
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f8989p = r11
        L_0x0196:
            r11 = r3 & 2048(0x800, float:2.87E-42)
            if (r11 != r5) goto L_0x01a2
            java.util.List<java.lang.Integer> r11 = r9.v
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.v = r11
        L_0x01a2:
            r1.j()     // Catch:{ IOException -> 0x01ae, all -> 0x01a6 }
            goto L_0x01ae
        L_0x01a6:
            r10 = move-exception
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8982i = r11
            throw r10
        L_0x01ae:
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8982i = r11
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r11 = r9.f9239h
            r11.i()
            throw r10
        L_0x01ba:
            r10 = r3 & 32
            if (r10 != r4) goto L_0x01c6
            java.util.List<e.a.a.a.y0.e.s> r10 = r9.f8989p
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f8989p = r10
        L_0x01c6:
            r10 = r3 & 2048(0x800, float:2.87E-42)
            if (r10 != r5) goto L_0x01d2
            java.util.List<java.lang.Integer> r10 = r9.v
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.v = r10
        L_0x01d2:
            r1.j()     // Catch:{ IOException -> 0x01de, all -> 0x01d6 }
            goto L_0x01de
        L_0x01d6:
            r10 = move-exception
            e.a.a.a.y0.h.c r11 = r12.q()
            r9.f8982i = r11
            throw r10
        L_0x01de:
            e.a.a.a.y0.h.c r10 = r12.q()
            r9.f8982i = r10
            e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r10 = r9.f9239h
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.n.<init>(e.a.a.a.y0.h.d, e.a.a.a.y0.h.f, e.a.a.a.y0.e.a):void");
    }

    public int a() {
        int i2 = this.x;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.f8983j & 2) == 2 ? e.c(1, this.f8985l) + 0 : 0;
        if ((this.f8983j & 4) == 4) {
            c += e.c(2, this.f8986m);
        }
        if ((this.f8983j & 8) == 8) {
            c += e.e(3, this.f8987n);
        }
        for (int i3 = 0; i3 < this.f8989p.size(); i3++) {
            c += e.e(4, this.f8989p.get(i3));
        }
        if ((this.f8983j & 32) == 32) {
            c += e.e(5, this.f8990q);
        }
        if ((this.f8983j & 128) == 128) {
            c += e.e(6, this.s);
        }
        if ((this.f8983j & 256) == 256) {
            c += e.c(7, this.t);
        }
        if ((this.f8983j & 512) == 512) {
            c += e.c(8, this.u);
        }
        if ((this.f8983j & 16) == 16) {
            c += e.c(9, this.f8988o);
        }
        if ((this.f8983j & 64) == 64) {
            c += e.c(10, this.r);
        }
        if ((this.f8983j & 1) == 1) {
            c += e.c(11, this.f8984k);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.v.size(); i5++) {
            i4 += e.d(this.v.get(i5).intValue());
        }
        int size = this.f8982i.size() + k() + (this.v.size() * 2) + c + i4;
        this.x = size;
        return size;
    }

    public p b() {
        return y;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8983j & 2) == 2) {
            eVar.p(1, this.f8985l);
        }
        if ((this.f8983j & 4) == 4) {
            eVar.p(2, this.f8986m);
        }
        if ((this.f8983j & 8) == 8) {
            eVar.r(3, this.f8987n);
        }
        for (int i2 = 0; i2 < this.f8989p.size(); i2++) {
            eVar.r(4, this.f8989p.get(i2));
        }
        if ((this.f8983j & 32) == 32) {
            eVar.r(5, this.f8990q);
        }
        if ((this.f8983j & 128) == 128) {
            eVar.r(6, this.s);
        }
        if ((this.f8983j & 256) == 256) {
            eVar.p(7, this.t);
        }
        if ((this.f8983j & 512) == 512) {
            eVar.p(8, this.u);
        }
        if ((this.f8983j & 16) == 16) {
            eVar.p(9, this.f8988o);
        }
        if ((this.f8983j & 64) == 64) {
            eVar.p(10, this.r);
        }
        if ((this.f8983j & 1) == 1) {
            eVar.p(11, this.f8984k);
        }
        for (int i3 = 0; i3 < this.v.size(); i3++) {
            eVar.p(31, this.v.get(i3).intValue());
        }
        o2.a(19000, eVar);
        eVar.u(this.f8982i);
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
        if (!((this.f8983j & 4) == 4)) {
            this.w = 0;
            return false;
        } else if (!v() || this.f8987n.g()) {
            for (int i2 = 0; i2 < this.f8989p.size(); i2++) {
                if (!this.f8989p.get(i2).g()) {
                    this.w = 0;
                    return false;
                }
            }
            if (!t() || this.f8990q.g()) {
                if (((this.f8983j & 128) == 128) && !this.s.g()) {
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
    }

    public boolean t() {
        return (this.f8983j & 32) == 32;
    }

    public boolean u() {
        return (this.f8983j & 64) == 64;
    }

    public boolean v() {
        return (this.f8983j & 8) == 8;
    }

    public final void w() {
        this.f8984k = 518;
        this.f8985l = 2054;
        this.f8986m = 0;
        q qVar = q.A;
        this.f8987n = qVar;
        this.f8988o = 0;
        this.f8989p = Collections.emptyList();
        this.f8990q = qVar;
        this.r = 0;
        this.s = u.s;
        this.t = 0;
        this.u = 0;
        this.v = Collections.emptyList();
    }

    public n(h.c cVar, a aVar) {
        super(cVar);
        this.w = -1;
        this.x = -1;
        this.f8982i = cVar.f9236h;
    }
}
