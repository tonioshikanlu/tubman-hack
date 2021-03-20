package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class q extends h.d<q> implements Object {
    public static final q A;
    public static r<q> B = new a();

    /* renamed from: i  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f9032i;

    /* renamed from: j  reason: collision with root package name */
    public int f9033j;

    /* renamed from: k  reason: collision with root package name */
    public List<b> f9034k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9035l;

    /* renamed from: m  reason: collision with root package name */
    public int f9036m;

    /* renamed from: n  reason: collision with root package name */
    public q f9037n;

    /* renamed from: o  reason: collision with root package name */
    public int f9038o;

    /* renamed from: p  reason: collision with root package name */
    public int f9039p;

    /* renamed from: q  reason: collision with root package name */
    public int f9040q;
    public int r;
    public int s;
    public q t;
    public int u;
    public q v;
    public int w;
    public int x;
    public byte y;
    public int z;

    public static class a extends e.a.a.a.y0.h.b<q> {
        public Object a(d dVar, f fVar) {
            return new q(dVar, fVar, (a) null);
        }
    }

    public static final class c extends h.c<q, c> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f9060k;

        /* renamed from: l  reason: collision with root package name */
        public List<b> f9061l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        public boolean f9062m;

        /* renamed from: n  reason: collision with root package name */
        public int f9063n;

        /* renamed from: o  reason: collision with root package name */
        public q f9064o;

        /* renamed from: p  reason: collision with root package name */
        public int f9065p;

        /* renamed from: q  reason: collision with root package name */
        public int f9066q;
        public int r;
        public int s;
        public int t;
        public q u;
        public int v;
        public q w;
        public int x;
        public int y;

        public c() {
            q qVar = q.A;
            this.f9064o = qVar;
            this.u = qVar;
            this.w = qVar;
        }

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public Object clone() {
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        public p e() {
            q l2 = l();
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
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            m((q) hVar);
            return this;
        }

        public q l() {
            q qVar = new q(this, (a) null);
            int i2 = this.f9060k;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.f9061l = Collections.unmodifiableList(this.f9061l);
                this.f9060k &= -2;
            }
            qVar.f9034k = this.f9061l;
            if ((i2 & 2) != 2) {
                i3 = 0;
            }
            qVar.f9035l = this.f9062m;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            qVar.f9036m = this.f9063n;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            qVar.f9037n = this.f9064o;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            qVar.f9038o = this.f9065p;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            qVar.f9039p = this.f9066q;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            qVar.f9040q = this.r;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            qVar.r = this.s;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            qVar.s = this.t;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            qVar.t = this.u;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            qVar.u = this.v;
            if ((i2 & 2048) == 2048) {
                i3 |= 1024;
            }
            qVar.v = this.w;
            if ((i2 & 4096) == 4096) {
                i3 |= 2048;
            }
            qVar.w = this.x;
            if ((i2 & 8192) == 8192) {
                i3 |= 4096;
            }
            qVar.x = this.y;
            qVar.f9033j = i3;
            return qVar;
        }

        public c m(q qVar) {
            q qVar2;
            q qVar3;
            q qVar4;
            q qVar5 = q.A;
            if (qVar == qVar5) {
                return this;
            }
            boolean z = true;
            if (!qVar.f9034k.isEmpty()) {
                if (this.f9061l.isEmpty()) {
                    this.f9061l = qVar.f9034k;
                    this.f9060k &= -2;
                } else {
                    if ((this.f9060k & 1) != 1) {
                        this.f9061l = new ArrayList(this.f9061l);
                        this.f9060k |= 1;
                    }
                    this.f9061l.addAll(qVar.f9034k);
                }
            }
            int i2 = qVar.f9033j;
            if ((i2 & 1) == 1) {
                boolean z2 = qVar.f9035l;
                this.f9060k |= 2;
                this.f9062m = z2;
            }
            if ((i2 & 2) == 2) {
                int i3 = qVar.f9036m;
                this.f9060k |= 4;
                this.f9063n = i3;
            }
            if (qVar.v()) {
                q qVar6 = qVar.f9037n;
                if ((this.f9060k & 8) == 8 && (qVar4 = this.f9064o) != qVar5) {
                    c z3 = q.z(qVar4);
                    z3.m(qVar6);
                    qVar6 = z3.l();
                }
                this.f9064o = qVar6;
                this.f9060k |= 8;
            }
            if ((qVar.f9033j & 8) == 8) {
                int i4 = qVar.f9038o;
                this.f9060k |= 16;
                this.f9065p = i4;
            }
            if (qVar.u()) {
                int i5 = qVar.f9039p;
                this.f9060k |= 32;
                this.f9066q = i5;
            }
            int i6 = qVar.f9033j;
            if ((i6 & 32) == 32) {
                int i7 = qVar.f9040q;
                this.f9060k |= 64;
                this.r = i7;
            }
            if ((i6 & 64) == 64) {
                int i8 = qVar.r;
                this.f9060k |= 128;
                this.s = i8;
            }
            if (qVar.x()) {
                int i9 = qVar.s;
                this.f9060k |= 256;
                this.t = i9;
            }
            if (qVar.w()) {
                q qVar7 = qVar.t;
                if ((this.f9060k & 512) == 512 && (qVar3 = this.u) != qVar5) {
                    c z4 = q.z(qVar3);
                    z4.m(qVar7);
                    qVar7 = z4.l();
                }
                this.u = qVar7;
                this.f9060k |= 512;
            }
            if ((qVar.f9033j & 512) == 512) {
                int i10 = qVar.u;
                this.f9060k |= 1024;
                this.v = i10;
            }
            if (qVar.t()) {
                q qVar8 = qVar.v;
                if ((this.f9060k & 2048) == 2048 && (qVar2 = this.w) != qVar5) {
                    c z5 = q.z(qVar2);
                    z5.m(qVar8);
                    qVar8 = z5.l();
                }
                this.w = qVar8;
                this.f9060k |= 2048;
            }
            int i11 = qVar.f9033j;
            if ((i11 & 2048) == 2048) {
                int i12 = qVar.w;
                this.f9060k |= 4096;
                this.x = i12;
            }
            if ((i11 & 4096) != 4096) {
                z = false;
            }
            if (z) {
                int i13 = qVar.x;
                this.f9060k |= 8192;
                this.y = i13;
            }
            k(qVar);
            this.f9236h = this.f9236h.e(qVar.f9032i);
            return this;
        }

        public c n(d dVar, f fVar) {
            q qVar;
            q qVar2 = null;
            try {
                q a = q.B.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                qVar = (q) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                m(qVar2);
            }
            throw th;
        }
    }

    static {
        q qVar = new q();
        A = qVar;
        qVar.y();
    }

    public q() {
        this.y = -1;
        this.z = -1;
        this.f9032i = e.a.a.a.y0.h.c.f9218h;
    }

    public q(d dVar, f fVar, a aVar) {
        int i2;
        this.y = -1;
        this.z = -1;
        y();
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int o2 = dVar.o();
                c cVar = null;
                switch (o2) {
                    case 0:
                        z2 = true;
                        continue;
                    case 8:
                        this.f9033j |= 4096;
                        this.x = dVar.l();
                        continue;
                    case 18:
                        if (!z3 || !true) {
                            this.f9034k = new ArrayList();
                            z3 |= true;
                        }
                        this.f9034k.add(dVar.h(b.f9042p, fVar));
                        continue;
                    case 24:
                        this.f9033j |= 1;
                        this.f9035l = dVar.e();
                        continue;
                    case 32:
                        this.f9033j |= 2;
                        this.f9036m = dVar.l();
                        continue;
                    case 42:
                        i2 = 4;
                        if ((this.f9033j & 4) == 4) {
                            q qVar = this.f9037n;
                            Objects.requireNonNull(qVar);
                            cVar = z(qVar);
                        }
                        q qVar2 = (q) dVar.h(B, fVar);
                        this.f9037n = qVar2;
                        if (cVar != null) {
                            cVar.m(qVar2);
                            this.f9037n = cVar.l();
                            break;
                        }
                        break;
                    case 48:
                        this.f9033j |= 16;
                        this.f9039p = dVar.l();
                        continue;
                    case 56:
                        this.f9033j |= 32;
                        this.f9040q = dVar.l();
                        continue;
                    case 64:
                        this.f9033j |= 8;
                        this.f9038o = dVar.l();
                        continue;
                    case 72:
                        this.f9033j |= 64;
                        this.r = dVar.l();
                        continue;
                    case 82:
                        i2 = 256;
                        if ((this.f9033j & 256) == 256) {
                            q qVar3 = this.t;
                            Objects.requireNonNull(qVar3);
                            cVar = z(qVar3);
                        }
                        q qVar4 = (q) dVar.h(B, fVar);
                        this.t = qVar4;
                        if (cVar != null) {
                            cVar.m(qVar4);
                            this.t = cVar.l();
                            break;
                        }
                        break;
                    case 88:
                        this.f9033j |= 512;
                        this.u = dVar.l();
                        continue;
                    case 96:
                        this.f9033j |= 128;
                        this.s = dVar.l();
                        continue;
                    case 106:
                        i2 = 1024;
                        if ((this.f9033j & 1024) == 1024) {
                            q qVar5 = this.v;
                            Objects.requireNonNull(qVar5);
                            cVar = z(qVar5);
                        }
                        q qVar6 = (q) dVar.h(B, fVar);
                        this.v = qVar6;
                        if (cVar != null) {
                            cVar.m(qVar6);
                            this.v = cVar.l();
                            break;
                        }
                        break;
                    case 112:
                        this.f9033j |= 2048;
                        this.w = dVar.l();
                        continue;
                    default:
                        if (q(dVar, k2, fVar, o2)) {
                            continue;
                        }
                        z2 = true;
                        continue;
                }
                this.f9033j |= i2;
            } catch (j e2) {
                e2.f9248h = this;
                throw e2;
            } catch (IOException e3) {
                j jVar = new j(e3.getMessage());
                jVar.f9248h = this;
                throw jVar;
            } catch (Throwable th) {
                if (z3 && true) {
                    this.f9034k = Collections.unmodifiableList(this.f9034k);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9032i = D.q();
                    throw th2;
                }
                this.f9032i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        if (z3 && true) {
            this.f9034k = Collections.unmodifiableList(this.f9034k);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9032i = D.q();
            throw th3;
        }
        this.f9032i = D.q();
        this.f9239h.i();
    }

    public static c z(q qVar) {
        c cVar = new c();
        cVar.m(qVar);
        return cVar;
    }

    public int a() {
        int i2 = this.z;
        if (i2 != -1) {
            return i2;
        }
        int c2 = (this.f9033j & 4096) == 4096 ? e.c(1, this.x) + 0 : 0;
        for (int i3 = 0; i3 < this.f9034k.size(); i3++) {
            c2 += e.e(2, this.f9034k.get(i3));
        }
        if ((this.f9033j & 1) == 1) {
            c2 += e.i(3) + 1;
        }
        if ((this.f9033j & 2) == 2) {
            c2 += e.c(4, this.f9036m);
        }
        if ((this.f9033j & 4) == 4) {
            c2 += e.e(5, this.f9037n);
        }
        if ((this.f9033j & 16) == 16) {
            c2 += e.c(6, this.f9039p);
        }
        if ((this.f9033j & 32) == 32) {
            c2 += e.c(7, this.f9040q);
        }
        if ((this.f9033j & 8) == 8) {
            c2 += e.c(8, this.f9038o);
        }
        if ((this.f9033j & 64) == 64) {
            c2 += e.c(9, this.r);
        }
        if ((this.f9033j & 256) == 256) {
            c2 += e.e(10, this.t);
        }
        if ((this.f9033j & 512) == 512) {
            c2 += e.c(11, this.u);
        }
        if ((this.f9033j & 128) == 128) {
            c2 += e.c(12, this.s);
        }
        if ((this.f9033j & 1024) == 1024) {
            c2 += e.e(13, this.v);
        }
        if ((this.f9033j & 2048) == 2048) {
            c2 += e.c(14, this.w);
        }
        int size = this.f9032i.size() + k() + c2;
        this.z = size;
        return size;
    }

    public p b() {
        return A;
    }

    public p.a c() {
        return z(this);
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f9033j & 4096) == 4096) {
            eVar.p(1, this.x);
        }
        for (int i2 = 0; i2 < this.f9034k.size(); i2++) {
            eVar.r(2, this.f9034k.get(i2));
        }
        if ((this.f9033j & 1) == 1) {
            boolean z2 = this.f9035l;
            eVar.y(24);
            eVar.t(z2 ? 1 : 0);
        }
        if ((this.f9033j & 2) == 2) {
            eVar.p(4, this.f9036m);
        }
        if ((this.f9033j & 4) == 4) {
            eVar.r(5, this.f9037n);
        }
        if ((this.f9033j & 16) == 16) {
            eVar.p(6, this.f9039p);
        }
        if ((this.f9033j & 32) == 32) {
            eVar.p(7, this.f9040q);
        }
        if ((this.f9033j & 8) == 8) {
            eVar.p(8, this.f9038o);
        }
        if ((this.f9033j & 64) == 64) {
            eVar.p(9, this.r);
        }
        if ((this.f9033j & 256) == 256) {
            eVar.r(10, this.t);
        }
        if ((this.f9033j & 512) == 512) {
            eVar.p(11, this.u);
        }
        if ((this.f9033j & 128) == 128) {
            eVar.p(12, this.s);
        }
        if ((this.f9033j & 1024) == 1024) {
            eVar.r(13, this.v);
        }
        if ((this.f9033j & 2048) == 2048) {
            eVar.p(14, this.w);
        }
        o2.a(200, eVar);
        eVar.u(this.f9032i);
    }

    public p.a f() {
        return new c();
    }

    public final boolean g() {
        byte b2 = this.y;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f9034k.size(); i2++) {
            if (!this.f9034k.get(i2).g()) {
                this.y = 0;
                return false;
            }
        }
        if (v() && !this.f9037n.g()) {
            this.y = 0;
            return false;
        } else if (w() && !this.t.g()) {
            this.y = 0;
            return false;
        } else if (t() && !this.v.g()) {
            this.y = 0;
            return false;
        } else if (!j()) {
            this.y = 0;
            return false;
        } else {
            this.y = 1;
            return true;
        }
    }

    public boolean t() {
        return (this.f9033j & 1024) == 1024;
    }

    public boolean u() {
        return (this.f9033j & 16) == 16;
    }

    public boolean v() {
        return (this.f9033j & 4) == 4;
    }

    public boolean w() {
        return (this.f9033j & 256) == 256;
    }

    public boolean x() {
        return (this.f9033j & 128) == 128;
    }

    public final void y() {
        this.f9034k = Collections.emptyList();
        this.f9035l = false;
        this.f9036m = 0;
        q qVar = A;
        this.f9037n = qVar;
        this.f9038o = 0;
        this.f9039p = 0;
        this.f9040q = 0;
        this.r = 0;
        this.s = 0;
        this.t = qVar;
        this.u = 0;
        this.v = qVar;
        this.w = 0;
        this.x = 0;
    }

    public static final class b extends h implements e.a.a.a.y0.h.q {

        /* renamed from: o  reason: collision with root package name */
        public static final b f9041o;

        /* renamed from: p  reason: collision with root package name */
        public static r<b> f9042p = new a();

        /* renamed from: h  reason: collision with root package name */
        public final e.a.a.a.y0.h.c f9043h;

        /* renamed from: i  reason: collision with root package name */
        public int f9044i;

        /* renamed from: j  reason: collision with root package name */
        public c f9045j;

        /* renamed from: k  reason: collision with root package name */
        public q f9046k;

        /* renamed from: l  reason: collision with root package name */
        public int f9047l;

        /* renamed from: m  reason: collision with root package name */
        public byte f9048m;

        /* renamed from: n  reason: collision with root package name */
        public int f9049n;

        public static class a extends e.a.a.a.y0.h.b<b> {
            public Object a(d dVar, f fVar) {
                return new b(dVar, fVar, (a) null);
            }
        }

        /* renamed from: e.a.a.a.y0.e.q$b$b  reason: collision with other inner class name */
        public static final class C0201b extends h.b<b, C0201b> implements Object {

            /* renamed from: i  reason: collision with root package name */
            public int f9050i;

            /* renamed from: j  reason: collision with root package name */
            public c f9051j = c.INV;

            /* renamed from: k  reason: collision with root package name */
            public q f9052k = q.A;

            /* renamed from: l  reason: collision with root package name */
            public int f9053l;

            public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
                m(dVar, fVar);
                return this;
            }

            public Object clone() {
                C0201b bVar = new C0201b();
                bVar.l(k());
                return bVar;
            }

            public p e() {
                b k2 = k();
                if (k2.g()) {
                    return k2;
                }
                throw new v();
            }

            public /* bridge */ /* synthetic */ a.C0205a h(d dVar, f fVar) {
                m(dVar, fVar);
                return this;
            }

            public h.b i() {
                C0201b bVar = new C0201b();
                bVar.l(k());
                return bVar;
            }

            public /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((b) hVar);
                return this;
            }

            public b k() {
                b bVar = new b(this, (a) null);
                int i2 = this.f9050i;
                int i3 = 1;
                if ((i2 & 1) != 1) {
                    i3 = 0;
                }
                bVar.f9045j = this.f9051j;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.f9046k = this.f9052k;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                bVar.f9047l = this.f9053l;
                bVar.f9044i = i3;
                return bVar;
            }

            public C0201b l(b bVar) {
                q qVar;
                if (bVar == b.f9041o) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f9044i & 1) == 1) {
                    c cVar = bVar.f9045j;
                    Objects.requireNonNull(cVar);
                    this.f9050i |= 1;
                    this.f9051j = cVar;
                }
                if (bVar.j()) {
                    q qVar2 = bVar.f9046k;
                    if ((this.f9050i & 2) == 2 && (qVar = this.f9052k) != q.A) {
                        qVar2 = b.e.a.a.a.F(qVar, qVar2);
                    }
                    this.f9052k = qVar2;
                    this.f9050i |= 2;
                }
                if ((bVar.f9044i & 4) != 4) {
                    z = false;
                }
                if (z) {
                    int i2 = bVar.f9047l;
                    this.f9050i |= 4;
                    this.f9053l = i2;
                }
                this.f9236h = this.f9236h.e(bVar.f9043h);
                return this;
            }

            public C0201b m(d dVar, f fVar) {
                b bVar;
                b bVar2 = null;
                try {
                    b a = b.f9042p.a(dVar, fVar);
                    if (a != null) {
                        l(a);
                    }
                    return this;
                } catch (j e2) {
                    bVar = (b) e2.f9248h;
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    l(bVar2);
                }
                throw th;
            }
        }

        public enum c implements i.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);
            

            /* renamed from: h  reason: collision with root package name */
            public final int f9059h;

            /* access modifiers changed from: public */
            c(int i2) {
                this.f9059h = i2;
            }

            public static c d(int i2) {
                if (i2 == 0) {
                    return IN;
                }
                if (i2 == 1) {
                    return OUT;
                }
                if (i2 == 2) {
                    return INV;
                }
                if (i2 != 3) {
                    return null;
                }
                return STAR;
            }

            public final int f() {
                return this.f9059h;
            }
        }

        static {
            b bVar = new b();
            f9041o = bVar;
            bVar.f9045j = c.INV;
            bVar.f9046k = q.A;
            bVar.f9047l = 0;
        }

        public b() {
            this.f9048m = -1;
            this.f9049n = -1;
            this.f9043h = e.a.a.a.y0.h.c.f9218h;
        }

        public b(d dVar, f fVar, a aVar) {
            this.f9048m = -1;
            this.f9049n = -1;
            this.f9045j = c.INV;
            this.f9046k = q.A;
            boolean z = false;
            this.f9047l = 0;
            c.b D = e.a.a.a.y0.h.c.D();
            e k2 = e.k(D, 1);
            while (!z) {
                try {
                    int o2 = dVar.o();
                    if (o2 != 0) {
                        if (o2 == 8) {
                            int l2 = dVar.l();
                            c d = c.d(l2);
                            if (d == null) {
                                k2.y(o2);
                                k2.y(l2);
                            } else {
                                this.f9044i |= 1;
                                this.f9045j = d;
                            }
                        } else if (o2 == 18) {
                            c cVar = null;
                            if ((this.f9044i & 2) == 2) {
                                q qVar = this.f9046k;
                                Objects.requireNonNull(qVar);
                                cVar = q.z(qVar);
                            }
                            q qVar2 = (q) dVar.h(q.B, fVar);
                            this.f9046k = qVar2;
                            if (cVar != null) {
                                cVar.m(qVar2);
                                this.f9046k = cVar.l();
                            }
                            this.f9044i |= 2;
                        } else if (o2 == 24) {
                            this.f9044i |= 4;
                            this.f9047l = dVar.l();
                        } else if (!dVar.r(o2, k2)) {
                        }
                    }
                    z = true;
                } catch (j e2) {
                    e2.f9248h = this;
                    throw e2;
                } catch (IOException e3) {
                    j jVar = new j(e3.getMessage());
                    jVar.f9248h = this;
                    throw jVar;
                } catch (Throwable th) {
                    try {
                        k2.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f9043h = D.q();
                        throw th2;
                    }
                    this.f9043h = D.q();
                    throw th;
                }
            }
            try {
                k2.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f9043h = D.q();
                throw th3;
            }
            this.f9043h = D.q();
        }

        public int a() {
            int i2 = this.f9049n;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f9044i & 1) == 1) {
                i3 = 0 + e.b(1, this.f9045j.f9059h);
            }
            if ((this.f9044i & 2) == 2) {
                i3 += e.e(2, this.f9046k);
            }
            if ((this.f9044i & 4) == 4) {
                i3 += e.c(3, this.f9047l);
            }
            int size = this.f9043h.size() + i3;
            this.f9049n = size;
            return size;
        }

        public p.a c() {
            C0201b bVar = new C0201b();
            bVar.l(this);
            return bVar;
        }

        public void d(e eVar) {
            a();
            if ((this.f9044i & 1) == 1) {
                eVar.n(1, this.f9045j.f9059h);
            }
            if ((this.f9044i & 2) == 2) {
                eVar.r(2, this.f9046k);
            }
            if ((this.f9044i & 4) == 4) {
                eVar.p(3, this.f9047l);
            }
            eVar.u(this.f9043h);
        }

        public p.a f() {
            return new C0201b();
        }

        public final boolean g() {
            byte b2 = this.f9048m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!j() || this.f9046k.g()) {
                this.f9048m = 1;
                return true;
            }
            this.f9048m = 0;
            return false;
        }

        public boolean j() {
            return (this.f9044i & 2) == 2;
        }

        public b(h.b bVar, a aVar) {
            super(bVar);
            this.f9048m = -1;
            this.f9049n = -1;
            this.f9043h = bVar.f9236h;
        }
    }

    public q(h.c cVar, a aVar) {
        super(cVar);
        this.y = -1;
        this.z = -1;
        this.f9032i = cVar.f9236h;
    }
}
