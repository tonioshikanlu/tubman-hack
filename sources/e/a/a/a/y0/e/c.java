package e.a.a.a.y0.e;

import e.a.a.a.y0.e.t;
import e.a.a.a.y0.e.w;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends h.d<c> implements Object {
    public static final c F;
    public static r<c> G = new a();
    public t A;
    public List<Integer> B;
    public w C;
    public byte D;
    public int E;

    /* renamed from: i  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f8822i;

    /* renamed from: j  reason: collision with root package name */
    public int f8823j;

    /* renamed from: k  reason: collision with root package name */
    public int f8824k;

    /* renamed from: l  reason: collision with root package name */
    public int f8825l;

    /* renamed from: m  reason: collision with root package name */
    public int f8826m;

    /* renamed from: n  reason: collision with root package name */
    public List<s> f8827n;

    /* renamed from: o  reason: collision with root package name */
    public List<q> f8828o;

    /* renamed from: p  reason: collision with root package name */
    public List<Integer> f8829p;

    /* renamed from: q  reason: collision with root package name */
    public int f8830q;
    public List<Integer> r;
    public int s;
    public List<d> t;
    public List<i> u;
    public List<n> v;
    public List<r> w;
    public List<g> x;
    public List<Integer> y;
    public int z;

    public static class a extends e.a.a.a.y0.h.b<c> {
        public Object a(d dVar, f fVar) {
            return new c(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<c, b> implements Object {
        public w A = w.f9158l;

        /* renamed from: k  reason: collision with root package name */
        public int f8831k;

        /* renamed from: l  reason: collision with root package name */
        public int f8832l = 6;

        /* renamed from: m  reason: collision with root package name */
        public int f8833m;

        /* renamed from: n  reason: collision with root package name */
        public int f8834n;

        /* renamed from: o  reason: collision with root package name */
        public List<s> f8835o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        public List<q> f8836p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        public List<Integer> f8837q = Collections.emptyList();
        public List<Integer> r = Collections.emptyList();
        public List<d> s = Collections.emptyList();
        public List<i> t = Collections.emptyList();
        public List<n> u = Collections.emptyList();
        public List<r> v = Collections.emptyList();
        public List<g> w = Collections.emptyList();
        public List<Integer> x = Collections.emptyList();
        public t y = t.f9104n;
        public List<Integer> z = Collections.emptyList();

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.j(l());
            return bVar;
        }

        public p e() {
            c l2 = l();
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
            bVar.j(l());
            return bVar;
        }

        public c l() {
            c cVar = new c(this, (a) null);
            int i2 = this.f8831k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            cVar.f8824k = this.f8832l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            cVar.f8825l = this.f8833m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            cVar.f8826m = this.f8834n;
            if ((i2 & 8) == 8) {
                this.f8835o = Collections.unmodifiableList(this.f8835o);
                this.f8831k &= -9;
            }
            cVar.f8827n = this.f8835o;
            if ((this.f8831k & 16) == 16) {
                this.f8836p = Collections.unmodifiableList(this.f8836p);
                this.f8831k &= -17;
            }
            cVar.f8828o = this.f8836p;
            if ((this.f8831k & 32) == 32) {
                this.f8837q = Collections.unmodifiableList(this.f8837q);
                this.f8831k &= -33;
            }
            cVar.f8829p = this.f8837q;
            if ((this.f8831k & 64) == 64) {
                this.r = Collections.unmodifiableList(this.r);
                this.f8831k &= -65;
            }
            cVar.r = this.r;
            if ((this.f8831k & 128) == 128) {
                this.s = Collections.unmodifiableList(this.s);
                this.f8831k &= -129;
            }
            cVar.t = this.s;
            if ((this.f8831k & 256) == 256) {
                this.t = Collections.unmodifiableList(this.t);
                this.f8831k &= -257;
            }
            cVar.u = this.t;
            if ((this.f8831k & 512) == 512) {
                this.u = Collections.unmodifiableList(this.u);
                this.f8831k &= -513;
            }
            cVar.v = this.u;
            if ((this.f8831k & 1024) == 1024) {
                this.v = Collections.unmodifiableList(this.v);
                this.f8831k &= -1025;
            }
            cVar.w = this.v;
            if ((this.f8831k & 2048) == 2048) {
                this.w = Collections.unmodifiableList(this.w);
                this.f8831k &= -2049;
            }
            cVar.x = this.w;
            if ((this.f8831k & 4096) == 4096) {
                this.x = Collections.unmodifiableList(this.x);
                this.f8831k &= -4097;
            }
            cVar.y = this.x;
            if ((i2 & 8192) == 8192) {
                i3 |= 8;
            }
            cVar.A = this.y;
            if ((this.f8831k & 16384) == 16384) {
                this.z = Collections.unmodifiableList(this.z);
                this.f8831k &= -16385;
            }
            cVar.B = this.z;
            if ((i2 & 32768) == 32768) {
                i3 |= 16;
            }
            cVar.C = this.A;
            cVar.f8823j = i3;
            return cVar;
        }

        /* renamed from: m */
        public b j(c cVar) {
            w wVar;
            t tVar;
            if (cVar == c.F) {
                return this;
            }
            int i2 = cVar.f8823j;
            boolean z2 = false;
            if ((i2 & 1) == 1) {
                int i3 = cVar.f8824k;
                this.f8831k |= 1;
                this.f8832l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = cVar.f8825l;
                this.f8831k = 2 | this.f8831k;
                this.f8833m = i4;
            }
            if ((i2 & 4) == 4) {
                int i5 = cVar.f8826m;
                this.f8831k = 4 | this.f8831k;
                this.f8834n = i5;
            }
            if (!cVar.f8827n.isEmpty()) {
                if (this.f8835o.isEmpty()) {
                    this.f8835o = cVar.f8827n;
                    this.f8831k &= -9;
                } else {
                    if ((this.f8831k & 8) != 8) {
                        this.f8835o = new ArrayList(this.f8835o);
                        this.f8831k |= 8;
                    }
                    this.f8835o.addAll(cVar.f8827n);
                }
            }
            if (!cVar.f8828o.isEmpty()) {
                if (this.f8836p.isEmpty()) {
                    this.f8836p = cVar.f8828o;
                    this.f8831k &= -17;
                } else {
                    if ((this.f8831k & 16) != 16) {
                        this.f8836p = new ArrayList(this.f8836p);
                        this.f8831k |= 16;
                    }
                    this.f8836p.addAll(cVar.f8828o);
                }
            }
            if (!cVar.f8829p.isEmpty()) {
                if (this.f8837q.isEmpty()) {
                    this.f8837q = cVar.f8829p;
                    this.f8831k &= -33;
                } else {
                    if ((this.f8831k & 32) != 32) {
                        this.f8837q = new ArrayList(this.f8837q);
                        this.f8831k |= 32;
                    }
                    this.f8837q.addAll(cVar.f8829p);
                }
            }
            if (!cVar.r.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = cVar.r;
                    this.f8831k &= -65;
                } else {
                    if ((this.f8831k & 64) != 64) {
                        this.r = new ArrayList(this.r);
                        this.f8831k |= 64;
                    }
                    this.r.addAll(cVar.r);
                }
            }
            if (!cVar.t.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = cVar.t;
                    this.f8831k &= -129;
                } else {
                    if ((this.f8831k & 128) != 128) {
                        this.s = new ArrayList(this.s);
                        this.f8831k |= 128;
                    }
                    this.s.addAll(cVar.t);
                }
            }
            if (!cVar.u.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = cVar.u;
                    this.f8831k &= -257;
                } else {
                    if ((this.f8831k & 256) != 256) {
                        this.t = new ArrayList(this.t);
                        this.f8831k |= 256;
                    }
                    this.t.addAll(cVar.u);
                }
            }
            if (!cVar.v.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = cVar.v;
                    this.f8831k &= -513;
                } else {
                    if ((this.f8831k & 512) != 512) {
                        this.u = new ArrayList(this.u);
                        this.f8831k |= 512;
                    }
                    this.u.addAll(cVar.v);
                }
            }
            if (!cVar.w.isEmpty()) {
                if (this.v.isEmpty()) {
                    this.v = cVar.w;
                    this.f8831k &= -1025;
                } else {
                    if ((this.f8831k & 1024) != 1024) {
                        this.v = new ArrayList(this.v);
                        this.f8831k |= 1024;
                    }
                    this.v.addAll(cVar.w);
                }
            }
            if (!cVar.x.isEmpty()) {
                if (this.w.isEmpty()) {
                    this.w = cVar.x;
                    this.f8831k &= -2049;
                } else {
                    if ((this.f8831k & 2048) != 2048) {
                        this.w = new ArrayList(this.w);
                        this.f8831k |= 2048;
                    }
                    this.w.addAll(cVar.x);
                }
            }
            if (!cVar.y.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = cVar.y;
                    this.f8831k &= -4097;
                } else {
                    if ((this.f8831k & 4096) != 4096) {
                        this.x = new ArrayList(this.x);
                        this.f8831k |= 4096;
                    }
                    this.x.addAll(cVar.y);
                }
            }
            if ((cVar.f8823j & 8) == 8) {
                t tVar2 = cVar.A;
                if ((this.f8831k & 8192) == 8192 && (tVar = this.y) != t.f9104n) {
                    t.b j2 = t.j(tVar);
                    j2.l(tVar2);
                    tVar2 = j2.k();
                }
                this.y = tVar2;
                this.f8831k |= 8192;
            }
            if (!cVar.B.isEmpty()) {
                if (this.z.isEmpty()) {
                    this.z = cVar.B;
                    this.f8831k &= -16385;
                } else {
                    if ((this.f8831k & 16384) != 16384) {
                        this.z = new ArrayList(this.z);
                        this.f8831k |= 16384;
                    }
                    this.z.addAll(cVar.B);
                }
            }
            if ((cVar.f8823j & 16) == 16) {
                z2 = true;
            }
            if (z2) {
                w wVar2 = cVar.C;
                if ((this.f8831k & 32768) == 32768 && (wVar = this.A) != w.f9158l) {
                    w.b j3 = w.j(wVar);
                    j3.l(wVar2);
                    wVar2 = j3.k();
                }
                this.A = wVar2;
                this.f8831k |= 32768;
            }
            k(cVar);
            this.f9236h = this.f9236h.e(cVar.f8822i);
            return this;
        }

        public b n(d dVar, f fVar) {
            c cVar;
            c cVar2 = null;
            try {
                c a = c.G.a(dVar, fVar);
                if (a != null) {
                    j(a);
                }
                return this;
            } catch (j e2) {
                cVar = (c) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                cVar2 = cVar;
            }
            if (cVar2 != null) {
                j(cVar2);
            }
            throw th;
        }
    }

    /* renamed from: e.a.a.a.y0.e.c$c  reason: collision with other inner class name */
    public enum C0199c implements i.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        OBJECT(5),
        COMPANION_OBJECT(6);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f8846h;

        /* access modifiers changed from: public */
        C0199c(int i2) {
            this.f8846h = i2;
        }

        public final int f() {
            return this.f8846h;
        }
    }

    static {
        c cVar = new c();
        F = cVar;
        cVar.t();
    }

    public c() {
        this.f8830q = -1;
        this.s = -1;
        this.z = -1;
        this.D = -1;
        this.E = -1;
        this.f8822i = e.a.a.a.y0.h.c.f9218h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: e.a.a.a.y0.e.w$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: e.a.a.a.y0.e.t$b} */
    /* JADX WARNING: type inference failed for: r16v5, types: [e.a.a.a.y0.e.w$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025f, code lost:
        r4.add(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0262, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0275, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0276, code lost:
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r12 = java.lang.Integer.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0137, code lost:
        r12 = r0.h(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0244, code lost:
        r0.c(r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(e.a.a.a.y0.h.d r18, e.a.a.a.y0.h.f r19, e.a.a.a.y0.e.a r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r17.<init>()
            r3 = -1
            r1.f8830q = r3
            r1.s = r3
            r1.z = r3
            r1.D = r3
            r1.E = r3
            r17.t()
            e.a.a.a.y0.h.c$b r3 = e.a.a.a.y0.h.c.D()
            r4 = 1
            e.a.a.a.y0.h.e r5 = e.a.a.a.y0.h.e.k(r3, r4)
            r6 = 0
            r7 = r6
        L_0x0022:
            r8 = 8
            r9 = 512(0x200, float:7.175E-43)
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 2048(0x800, float:2.87E-42)
            r14 = 4096(0x1000, float:5.74E-42)
            r15 = 16384(0x4000, float:2.2959E-41)
            r4 = 16
            if (r6 != 0) goto L_0x0333
            int r13 = r18.o()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r16 = 0
            switch(r13) {
                case 0: goto L_0x0271;
                case 8: goto L_0x0264;
                case 16: goto L_0x0248;
                case 18: goto L_0x0213;
                case 24: goto L_0x0206;
                case 32: goto L_0x01f9;
                case 42: goto L_0x01e6;
                case 50: goto L_0x01d1;
                case 56: goto L_0x01ba;
                case 58: goto L_0x0189;
                case 66: goto L_0x0175;
                case 74: goto L_0x0161;
                case 82: goto L_0x014f;
                case 90: goto L_0x013d;
                case 106: goto L_0x0126;
                case 128: goto L_0x0112;
                case 130: goto L_0x00e3;
                case 242: goto L_0x00ba;
                case 248: goto L_0x00a1;
                case 250: goto L_0x006b;
                case 258: goto L_0x0042;
                default: goto L_0x003b;
            }     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x003b:
            r12 = 1
            boolean r4 = r1.q(r0, r5, r2, r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0273
        L_0x0042:
            int r13 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r13 = r13 & r4
            if (r13 != r4) goto L_0x004d
            e.a.a.a.y0.e.w r13 = r1.C     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.w$b r16 = r13.k()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x004d:
            r13 = r16
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.w> r12 = e.a.a.a.y0.e.w.f9159m     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.p r12 = r0.h(r12, r2)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.w r12 = (e.a.a.a.y0.e.w) r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.C = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r13 == 0) goto L_0x0064
            r13.l(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.w r12 = r13.k()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.C = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x0064:
            int r12 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12 = r12 | r4
            r1.f8823j = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x006b:
            int r12 = r18.l()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r12 = r0.d(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == r15) goto L_0x0086
            int r13 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r13 <= 0) goto L_0x0086
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r13.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.B = r13     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x0086:
            int r13 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r13 <= 0) goto L_0x009c
            java.util.List<java.lang.Integer> r13 = r1.B     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r16 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r13.add(r4)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4 = 16
            goto L_0x0086
        L_0x009c:
            r0.c(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x00a1:
            r4 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r4 == r15) goto L_0x00ae
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.B = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x00ae:
            java.util.List<java.lang.Integer> r4 = r1.B     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r12 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x00b4:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x025f
        L_0x00ba:
            int r4 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4 = r4 & r8
            if (r4 != r8) goto L_0x00c5
            e.a.a.a.y0.e.t r4 = r1.A     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.t$b r16 = r4.k()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x00c5:
            r4 = r16
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.t> r12 = e.a.a.a.y0.e.t.f9105o     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.p r12 = r0.h(r12, r2)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.t r12 = (e.a.a.a.y0.e.t) r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.A = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r4 == 0) goto L_0x00dc
            r4.l(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.e.t r4 = r4.k()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.A = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x00dc:
            int r4 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4 = r4 | r8
            r1.f8823j = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x00e3:
            int r4 = r18.l()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r0.d(r4)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12 = r7 & 4096(0x1000, float:5.74E-42)
            if (r12 == r14) goto L_0x00fe
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x00fe
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.y = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x00fe:
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x0244
            java.util.List<java.lang.Integer> r12 = r1.y     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r13 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.add(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x00fe
        L_0x0112:
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 == r14) goto L_0x011f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.y = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x011f:
            java.util.List<java.lang.Integer> r4 = r1.y     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r12 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x00b4
        L_0x0126:
            r4 = r7 & 2048(0x800, float:2.87E-42)
            if (r4 == r11) goto L_0x0133
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.x = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L_0x0133:
            java.util.List<e.a.a.a.y0.e.g> r4 = r1.x     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.g> r12 = e.a.a.a.y0.e.g.f8894o     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x0137:
            e.a.a.a.y0.h.p r12 = r0.h(r12, r2)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x025f
        L_0x013d:
            r4 = r7 & 1024(0x400, float:1.435E-42)
            if (r4 == r10) goto L_0x014a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.w = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L_0x014a:
            java.util.List<e.a.a.a.y0.e.r> r4 = r1.w     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.r> r12 = e.a.a.a.y0.e.r.w     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x014f:
            r4 = r7 & 512(0x200, float:7.175E-43)
            if (r4 == r9) goto L_0x015c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.v = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 512(0x200, float:7.175E-43)
        L_0x015c:
            java.util.List<e.a.a.a.y0.e.n> r4 = r1.v     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.n> r12 = e.a.a.a.y0.e.n.z     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x0161:
            r4 = r7 & 256(0x100, float:3.59E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r4 == r12) goto L_0x0170
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.u = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 256(0x100, float:3.59E-43)
        L_0x0170:
            java.util.List<e.a.a.a.y0.e.i> r4 = r1.u     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.i> r12 = e.a.a.a.y0.e.i.z     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x0175:
            r4 = r7 & 128(0x80, float:1.794E-43)
            r12 = 128(0x80, float:1.794E-43)
            if (r4 == r12) goto L_0x0184
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.t = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 128(0x80, float:1.794E-43)
        L_0x0184:
            java.util.List<e.a.a.a.y0.e.d> r4 = r1.t     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.d> r12 = e.a.a.a.y0.e.d.f8848q     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x0189:
            int r4 = r18.l()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r0.d(r4)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12 = r7 & 64
            r13 = 64
            if (r12 == r13) goto L_0x01a6
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x01a6
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.r = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 64
        L_0x01a6:
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x0244
            java.util.List<java.lang.Integer> r12 = r1.r     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r13 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.add(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x01a6
        L_0x01ba:
            r4 = r7 & 64
            r12 = 64
            if (r4 == r12) goto L_0x01c9
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.r = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 64
        L_0x01c9:
            java.util.List<java.lang.Integer> r4 = r1.r     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r12 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x00b4
        L_0x01d1:
            r4 = r7 & 16
            r12 = 16
            if (r4 == r12) goto L_0x01e0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8828o = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 16
        L_0x01e0:
            java.util.List<e.a.a.a.y0.e.q> r4 = r1.f8828o     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.q> r12 = e.a.a.a.y0.e.q.B     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x01e6:
            r4 = r7 & 8
            if (r4 == r8) goto L_0x01f3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8827n = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 8
        L_0x01f3:
            java.util.List<e.a.a.a.y0.e.s> r4 = r1.f8827n     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            e.a.a.a.y0.h.r<e.a.a.a.y0.e.s> r12 = e.a.a.a.y0.e.s.u     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0137
        L_0x01f9:
            int r4 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4 = r4 | 4
            r1.f8823j = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8826m = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x0206:
            int r4 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4 = r4 | 2
            r1.f8823j = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8825l = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x0213:
            int r4 = r18.l()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r0.d(r4)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12 = r7 & 32
            r13 = 32
            if (r12 == r13) goto L_0x0230
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x0230
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8829p = r12     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 32
        L_0x0230:
            int r12 = r18.b()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            if (r12 <= 0) goto L_0x0244
            java.util.List<java.lang.Integer> r12 = r1.f8829p     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r13 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12.add(r13)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0230
        L_0x0244:
            r0.c(r4)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0262
        L_0x0248:
            r4 = r7 & 32
            r12 = 32
            if (r4 == r12) goto L_0x0257
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r4.<init>()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8829p = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r7 = r7 | 32
        L_0x0257:
            java.util.List<java.lang.Integer> r4 = r1.f8829p     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r12 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x00b4
        L_0x025f:
            r4.add(r12)     // Catch:{ j -> 0x0289, IOException -> 0x027b }
        L_0x0262:
            r12 = 1
            goto L_0x0276
        L_0x0264:
            int r4 = r1.f8823j     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r12 = 1
            r4 = r4 | r12
            r1.f8823j = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            int r4 = r18.g()     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            r1.f8824k = r4     // Catch:{ j -> 0x0289, IOException -> 0x027b }
            goto L_0x0276
        L_0x0271:
            r12 = 1
            goto L_0x0275
        L_0x0273:
            if (r4 != 0) goto L_0x0276
        L_0x0275:
            r6 = r12
        L_0x0276:
            r4 = r12
            goto L_0x0022
        L_0x0279:
            r0 = move-exception
            goto L_0x028e
        L_0x027b:
            r0 = move-exception
            e.a.a.a.y0.h.j r2 = new e.a.a.a.y0.h.j     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0279 }
            r2.<init>(r0)     // Catch:{ all -> 0x0279 }
            r2.c(r1)     // Catch:{ all -> 0x0279 }
            throw r2     // Catch:{ all -> 0x0279 }
        L_0x0289:
            r0 = move-exception
            r0.c(r1)     // Catch:{ all -> 0x0279 }
            throw r0     // Catch:{ all -> 0x0279 }
        L_0x028e:
            r2 = r7 & 32
            r4 = 32
            if (r2 != r4) goto L_0x029c
            java.util.List<java.lang.Integer> r2 = r1.f8829p
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f8829p = r2
        L_0x029c:
            r2 = r7 & 8
            if (r2 != r8) goto L_0x02a8
            java.util.List<e.a.a.a.y0.e.s> r2 = r1.f8827n
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f8827n = r2
        L_0x02a8:
            r2 = r7 & 16
            r4 = 16
            if (r2 != r4) goto L_0x02b6
            java.util.List<e.a.a.a.y0.e.q> r2 = r1.f8828o
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f8828o = r2
        L_0x02b6:
            r2 = r7 & 64
            r4 = 64
            if (r2 != r4) goto L_0x02c4
            java.util.List<java.lang.Integer> r2 = r1.r
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.r = r2
        L_0x02c4:
            r2 = r7 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 != r4) goto L_0x02d2
            java.util.List<e.a.a.a.y0.e.d> r2 = r1.t
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.t = r2
        L_0x02d2:
            r2 = r7 & 256(0x100, float:3.59E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != r4) goto L_0x02e0
            java.util.List<e.a.a.a.y0.e.i> r2 = r1.u
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.u = r2
        L_0x02e0:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 != r9) goto L_0x02ec
            java.util.List<e.a.a.a.y0.e.n> r2 = r1.v
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.v = r2
        L_0x02ec:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 != r10) goto L_0x02f8
            java.util.List<e.a.a.a.y0.e.r> r2 = r1.w
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.w = r2
        L_0x02f8:
            r2 = r7 & 2048(0x800, float:2.87E-42)
            if (r2 != r11) goto L_0x0304
            java.util.List<e.a.a.a.y0.e.g> r2 = r1.x
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.x = r2
        L_0x0304:
            r2 = r7 & 4096(0x1000, float:5.74E-42)
            if (r2 != r14) goto L_0x0310
            java.util.List<java.lang.Integer> r2 = r1.y
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.y = r2
        L_0x0310:
            r2 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r2 != r15) goto L_0x031c
            java.util.List<java.lang.Integer> r2 = r1.B
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.B = r2
        L_0x031c:
            r5.j()     // Catch:{ IOException -> 0x0329, all -> 0x0320 }
            goto L_0x0329
        L_0x0320:
            r0 = move-exception
            r2 = r0
            e.a.a.a.y0.h.c r0 = r3.q()
            r1.f8822i = r0
            throw r2
        L_0x0329:
            e.a.a.a.y0.h.c r2 = r3.q()
            r1.f8822i = r2
            r17.n()
            throw r0
        L_0x0333:
            r0 = r7 & 32
            r2 = 32
            if (r0 != r2) goto L_0x0341
            java.util.List<java.lang.Integer> r0 = r1.f8829p
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f8829p = r0
        L_0x0341:
            r0 = r7 & 8
            if (r0 != r8) goto L_0x034d
            java.util.List<e.a.a.a.y0.e.s> r0 = r1.f8827n
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f8827n = r0
        L_0x034d:
            r0 = r7 & 16
            r2 = 16
            if (r0 != r2) goto L_0x035b
            java.util.List<e.a.a.a.y0.e.q> r0 = r1.f8828o
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f8828o = r0
        L_0x035b:
            r0 = r7 & 64
            r2 = 64
            if (r0 != r2) goto L_0x0369
            java.util.List<java.lang.Integer> r0 = r1.r
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.r = r0
        L_0x0369:
            r0 = r7 & 128(0x80, float:1.794E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 != r2) goto L_0x0377
            java.util.List<e.a.a.a.y0.e.d> r0 = r1.t
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.t = r0
        L_0x0377:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x0385
            java.util.List<e.a.a.a.y0.e.i> r0 = r1.u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.u = r0
        L_0x0385:
            r0 = r7 & 512(0x200, float:7.175E-43)
            if (r0 != r9) goto L_0x0391
            java.util.List<e.a.a.a.y0.e.n> r0 = r1.v
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.v = r0
        L_0x0391:
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 != r10) goto L_0x039d
            java.util.List<e.a.a.a.y0.e.r> r0 = r1.w
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.w = r0
        L_0x039d:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 != r11) goto L_0x03a9
            java.util.List<e.a.a.a.y0.e.g> r0 = r1.x
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.x = r0
        L_0x03a9:
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 != r14) goto L_0x03b5
            java.util.List<java.lang.Integer> r0 = r1.y
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.y = r0
        L_0x03b5:
            r0 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r0 != r15) goto L_0x03c1
            java.util.List<java.lang.Integer> r0 = r1.B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.B = r0
        L_0x03c1:
            r5.j()     // Catch:{ IOException -> 0x03ce, all -> 0x03c5 }
            goto L_0x03ce
        L_0x03c5:
            r0 = move-exception
            r2 = r0
            e.a.a.a.y0.h.c r0 = r3.q()
            r1.f8822i = r0
            throw r2
        L_0x03ce:
            e.a.a.a.y0.h.c r0 = r3.q()
            r1.f8822i = r0
            r17.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.c.<init>(e.a.a.a.y0.h.d, e.a.a.a.y0.h.f, e.a.a.a.y0.e.a):void");
    }

    public int a() {
        int i2 = this.E;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.f8823j & 1) == 1 ? e.c(1, this.f8824k) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f8829p.size(); i4++) {
            i3 += e.d(this.f8829p.get(i4).intValue());
        }
        int i5 = c + i3;
        if (!this.f8829p.isEmpty()) {
            i5 = i5 + 1 + e.d(i3);
        }
        this.f8830q = i3;
        if ((this.f8823j & 2) == 2) {
            i5 += e.c(3, this.f8825l);
        }
        if ((this.f8823j & 4) == 4) {
            i5 += e.c(4, this.f8826m);
        }
        for (int i6 = 0; i6 < this.f8827n.size(); i6++) {
            i5 += e.e(5, this.f8827n.get(i6));
        }
        for (int i7 = 0; i7 < this.f8828o.size(); i7++) {
            i5 += e.e(6, this.f8828o.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.r.size(); i9++) {
            i8 += e.d(this.r.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!this.r.isEmpty()) {
            i10 = i10 + 1 + e.d(i8);
        }
        this.s = i8;
        for (int i11 = 0; i11 < this.t.size(); i11++) {
            i10 += e.e(8, this.t.get(i11));
        }
        for (int i12 = 0; i12 < this.u.size(); i12++) {
            i10 += e.e(9, this.u.get(i12));
        }
        for (int i13 = 0; i13 < this.v.size(); i13++) {
            i10 += e.e(10, this.v.get(i13));
        }
        for (int i14 = 0; i14 < this.w.size(); i14++) {
            i10 += e.e(11, this.w.get(i14));
        }
        for (int i15 = 0; i15 < this.x.size(); i15++) {
            i10 += e.e(13, this.x.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.y.size(); i17++) {
            i16 += e.d(this.y.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!this.y.isEmpty()) {
            i18 = i18 + 2 + e.d(i16);
        }
        this.z = i16;
        if ((this.f8823j & 8) == 8) {
            i18 += e.e(30, this.A);
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.B.size(); i20++) {
            i19 += e.d(this.B.get(i20).intValue());
        }
        int size = (this.B.size() * 2) + i18 + i19;
        if ((this.f8823j & 16) == 16) {
            size += e.e(32, this.C);
        }
        int size2 = this.f8822i.size() + k() + size;
        this.E = size2;
        return size2;
    }

    public p b() {
        return F;
    }

    public p.a c() {
        b bVar = new b();
        bVar.j(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8823j & 1) == 1) {
            eVar.p(1, this.f8824k);
        }
        if (this.f8829p.size() > 0) {
            eVar.y(18);
            eVar.y(this.f8830q);
        }
        for (int i2 = 0; i2 < this.f8829p.size(); i2++) {
            eVar.q(this.f8829p.get(i2).intValue());
        }
        if ((this.f8823j & 2) == 2) {
            eVar.p(3, this.f8825l);
        }
        if ((this.f8823j & 4) == 4) {
            eVar.p(4, this.f8826m);
        }
        for (int i3 = 0; i3 < this.f8827n.size(); i3++) {
            eVar.r(5, this.f8827n.get(i3));
        }
        for (int i4 = 0; i4 < this.f8828o.size(); i4++) {
            eVar.r(6, this.f8828o.get(i4));
        }
        if (this.r.size() > 0) {
            eVar.y(58);
            eVar.y(this.s);
        }
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            eVar.q(this.r.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.t.size(); i6++) {
            eVar.r(8, this.t.get(i6));
        }
        for (int i7 = 0; i7 < this.u.size(); i7++) {
            eVar.r(9, this.u.get(i7));
        }
        for (int i8 = 0; i8 < this.v.size(); i8++) {
            eVar.r(10, this.v.get(i8));
        }
        for (int i9 = 0; i9 < this.w.size(); i9++) {
            eVar.r(11, this.w.get(i9));
        }
        for (int i10 = 0; i10 < this.x.size(); i10++) {
            eVar.r(13, this.x.get(i10));
        }
        if (this.y.size() > 0) {
            eVar.y(130);
            eVar.y(this.z);
        }
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            eVar.q(this.y.get(i11).intValue());
        }
        if ((this.f8823j & 8) == 8) {
            eVar.r(30, this.A);
        }
        for (int i12 = 0; i12 < this.B.size(); i12++) {
            eVar.p(31, this.B.get(i12).intValue());
        }
        if ((this.f8823j & 16) == 16) {
            eVar.r(32, this.C);
        }
        o2.a(19000, eVar);
        eVar.u(this.f8822i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.D;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f8823j & 2) == 2)) {
            this.D = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f8827n.size(); i2++) {
            if (!this.f8827n.get(i2).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f8828o.size(); i3++) {
            if (!this.f8828o.get(i3).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            if (!this.t.get(i4).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.u.size(); i5++) {
            if (!this.u.get(i5).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.v.size(); i6++) {
            if (!this.v.get(i6).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.w.size(); i7++) {
            if (!this.w.get(i7).g()) {
                this.D = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.x.size(); i8++) {
            if (!this.x.get(i8).g()) {
                this.D = 0;
                return false;
            }
        }
        if (((this.f8823j & 8) == 8) && !this.A.g()) {
            this.D = 0;
            return false;
        } else if (!j()) {
            this.D = 0;
            return false;
        } else {
            this.D = 1;
            return true;
        }
    }

    public final void t() {
        this.f8824k = 6;
        this.f8825l = 0;
        this.f8826m = 0;
        this.f8827n = Collections.emptyList();
        this.f8828o = Collections.emptyList();
        this.f8829p = Collections.emptyList();
        this.r = Collections.emptyList();
        this.t = Collections.emptyList();
        this.u = Collections.emptyList();
        this.v = Collections.emptyList();
        this.w = Collections.emptyList();
        this.x = Collections.emptyList();
        this.y = Collections.emptyList();
        this.A = t.f9104n;
        this.B = Collections.emptyList();
        this.C = w.f9158l;
    }

    public c(h.c cVar, a aVar) {
        super(cVar);
        this.f8830q = -1;
        this.s = -1;
        this.z = -1;
        this.D = -1;
        this.E = -1;
        this.f8822i = cVar.f9236h;
    }
}
