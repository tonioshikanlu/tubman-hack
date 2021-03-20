package e.a.a.a.y0.e;

import e.a.a.a.y0.e.q;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.q;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class h extends e.a.a.a.y0.h.h implements q {
    public static final h s;
    public static r<h> t = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f8902h;

    /* renamed from: i  reason: collision with root package name */
    public int f8903i;

    /* renamed from: j  reason: collision with root package name */
    public int f8904j;

    /* renamed from: k  reason: collision with root package name */
    public int f8905k;

    /* renamed from: l  reason: collision with root package name */
    public c f8906l;

    /* renamed from: m  reason: collision with root package name */
    public q f8907m;

    /* renamed from: n  reason: collision with root package name */
    public int f8908n;

    /* renamed from: o  reason: collision with root package name */
    public List<h> f8909o;

    /* renamed from: p  reason: collision with root package name */
    public List<h> f8910p;

    /* renamed from: q  reason: collision with root package name */
    public byte f8911q;
    public int r;

    public static class a extends e.a.a.a.y0.h.b<h> {
        public Object a(d dVar, f fVar) {
            return new h(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<h, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f8912i;

        /* renamed from: j  reason: collision with root package name */
        public int f8913j;

        /* renamed from: k  reason: collision with root package name */
        public int f8914k;

        /* renamed from: l  reason: collision with root package name */
        public c f8915l = c.TRUE;

        /* renamed from: m  reason: collision with root package name */
        public q f8916m = q.A;

        /* renamed from: n  reason: collision with root package name */
        public int f8917n;

        /* renamed from: o  reason: collision with root package name */
        public List<h> f8918o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        public List<h> f8919p = Collections.emptyList();

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            m(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public p e() {
            h k2 = k();
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
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public /* bridge */ /* synthetic */ h.b j(e.a.a.a.y0.h.h hVar) {
            l((h) hVar);
            return this;
        }

        public h k() {
            h hVar = new h(this, (a) null);
            int i2 = this.f8912i;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            hVar.f8904j = this.f8913j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            hVar.f8905k = this.f8914k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            hVar.f8906l = this.f8915l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            hVar.f8907m = this.f8916m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            hVar.f8908n = this.f8917n;
            if ((i2 & 32) == 32) {
                this.f8918o = Collections.unmodifiableList(this.f8918o);
                this.f8912i &= -33;
            }
            hVar.f8909o = this.f8918o;
            if ((this.f8912i & 64) == 64) {
                this.f8919p = Collections.unmodifiableList(this.f8919p);
                this.f8912i &= -65;
            }
            hVar.f8910p = this.f8919p;
            hVar.f8903i = i3;
            return hVar;
        }

        public b l(h hVar) {
            q qVar;
            if (hVar == h.s) {
                return this;
            }
            int i2 = hVar.f8903i;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = hVar.f8904j;
                this.f8912i |= 1;
                this.f8913j = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = hVar.f8905k;
                this.f8912i = 2 | this.f8912i;
                this.f8914k = i4;
            }
            if ((i2 & 4) == 4) {
                c cVar = hVar.f8906l;
                Objects.requireNonNull(cVar);
                this.f8912i = 4 | this.f8912i;
                this.f8915l = cVar;
            }
            if ((hVar.f8903i & 8) == 8) {
                q qVar2 = hVar.f8907m;
                if ((this.f8912i & 8) == 8 && (qVar = this.f8916m) != q.A) {
                    qVar2 = b.e.a.a.a.F(qVar, qVar2);
                }
                this.f8916m = qVar2;
                this.f8912i |= 8;
            }
            if ((hVar.f8903i & 16) == 16) {
                z = true;
            }
            if (z) {
                int i5 = hVar.f8908n;
                this.f8912i = 16 | this.f8912i;
                this.f8917n = i5;
            }
            if (!hVar.f8909o.isEmpty()) {
                if (this.f8918o.isEmpty()) {
                    this.f8918o = hVar.f8909o;
                    this.f8912i &= -33;
                } else {
                    if ((this.f8912i & 32) != 32) {
                        this.f8918o = new ArrayList(this.f8918o);
                        this.f8912i |= 32;
                    }
                    this.f8918o.addAll(hVar.f8909o);
                }
            }
            if (!hVar.f8910p.isEmpty()) {
                if (this.f8919p.isEmpty()) {
                    this.f8919p = hVar.f8910p;
                    this.f8912i &= -65;
                } else {
                    if ((this.f8912i & 64) != 64) {
                        this.f8919p = new ArrayList(this.f8919p);
                        this.f8912i |= 64;
                    }
                    this.f8919p.addAll(hVar.f8910p);
                }
            }
            this.f9236h = this.f9236h.e(hVar.f8902h);
            return this;
        }

        public b m(d dVar, f fVar) {
            h hVar;
            h hVar2 = null;
            try {
                h a = h.t.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                hVar = (h) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                l(hVar2);
            }
            throw th;
        }
    }

    public enum c implements i.a {
        TRUE(0),
        FALSE(1),
        NULL(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f8924h;

        /* access modifiers changed from: public */
        c(int i2) {
            this.f8924h = i2;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return TRUE;
            }
            if (i2 == 1) {
                return FALSE;
            }
            if (i2 != 2) {
                return null;
            }
            return NULL;
        }

        public final int f() {
            return this.f8924h;
        }
    }

    static {
        h hVar = new h();
        s = hVar;
        hVar.j();
    }

    public h() {
        this.f8911q = -1;
        this.r = -1;
        this.f8902h = e.a.a.a.y0.h.c.f9218h;
    }

    public h(d dVar, f fVar, a aVar) {
        List<h> list;
        r<h> rVar;
        this.f8911q = -1;
        this.r = -1;
        j();
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f8903i |= 1;
                        this.f8904j = dVar.l();
                    } else if (o2 == 16) {
                        this.f8903i |= 2;
                        this.f8905k = dVar.l();
                    } else if (o2 == 24) {
                        int l2 = dVar.l();
                        c d = c.d(l2);
                        if (d == null) {
                            k2.y(o2);
                            k2.y(l2);
                        } else {
                            this.f8903i |= 4;
                            this.f8906l = d;
                        }
                    } else if (o2 == 34) {
                        q.c cVar = null;
                        if ((this.f8903i & 8) == 8) {
                            q qVar = this.f8907m;
                            Objects.requireNonNull(qVar);
                            cVar = q.z(qVar);
                        }
                        q qVar2 = (q) dVar.h(q.B, fVar);
                        this.f8907m = qVar2;
                        if (cVar != null) {
                            cVar.m(qVar2);
                            this.f8907m = cVar.l();
                        }
                        this.f8903i |= 8;
                    } else if (o2 != 40) {
                        if (o2 == 50) {
                            if (!(z2 & true)) {
                                this.f8909o = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f8909o;
                            rVar = t;
                        } else if (o2 == 58) {
                            if (!(z2 & true)) {
                                this.f8910p = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f8910p;
                            rVar = t;
                        } else if (!dVar.r(o2, k2)) {
                        }
                        list.add(dVar.h(rVar, fVar));
                    } else {
                        this.f8903i |= 16;
                        this.f8908n = dVar.l();
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
                if (z2 & true) {
                    this.f8909o = Collections.unmodifiableList(this.f8909o);
                }
                if (z2 & true) {
                    this.f8910p = Collections.unmodifiableList(this.f8910p);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8902h = D.q();
                    throw th2;
                }
                this.f8902h = D.q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f8909o = Collections.unmodifiableList(this.f8909o);
        }
        if (z2 & true) {
            this.f8910p = Collections.unmodifiableList(this.f8910p);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8902h = D.q();
            throw th3;
        }
        this.f8902h = D.q();
    }

    public int a() {
        int i2 = this.r;
        if (i2 != -1) {
            return i2;
        }
        int c2 = (this.f8903i & 1) == 1 ? e.c(1, this.f8904j) + 0 : 0;
        if ((this.f8903i & 2) == 2) {
            c2 += e.c(2, this.f8905k);
        }
        if ((this.f8903i & 4) == 4) {
            c2 += e.b(3, this.f8906l.f8924h);
        }
        if ((this.f8903i & 8) == 8) {
            c2 += e.e(4, this.f8907m);
        }
        if ((this.f8903i & 16) == 16) {
            c2 += e.c(5, this.f8908n);
        }
        for (int i3 = 0; i3 < this.f8909o.size(); i3++) {
            c2 += e.e(6, this.f8909o.get(i3));
        }
        for (int i4 = 0; i4 < this.f8910p.size(); i4++) {
            c2 += e.e(7, this.f8910p.get(i4));
        }
        int size = this.f8902h.size() + c2;
        this.r = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        if ((this.f8903i & 1) == 1) {
            eVar.p(1, this.f8904j);
        }
        if ((this.f8903i & 2) == 2) {
            eVar.p(2, this.f8905k);
        }
        if ((this.f8903i & 4) == 4) {
            eVar.n(3, this.f8906l.f8924h);
        }
        if ((this.f8903i & 8) == 8) {
            eVar.r(4, this.f8907m);
        }
        if ((this.f8903i & 16) == 16) {
            eVar.p(5, this.f8908n);
        }
        for (int i2 = 0; i2 < this.f8909o.size(); i2++) {
            eVar.r(6, this.f8909o.get(i2));
        }
        for (int i3 = 0; i3 < this.f8910p.size(); i3++) {
            eVar.r(7, this.f8910p.get(i3));
        }
        eVar.u(this.f8902h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8911q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f8903i & 8) == 8) || this.f8907m.g()) {
            for (int i2 = 0; i2 < this.f8909o.size(); i2++) {
                if (!this.f8909o.get(i2).g()) {
                    this.f8911q = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f8910p.size(); i3++) {
                if (!this.f8910p.get(i3).g()) {
                    this.f8911q = 0;
                    return false;
                }
            }
            this.f8911q = 1;
            return true;
        }
        this.f8911q = 0;
        return false;
    }

    public final void j() {
        this.f8904j = 0;
        this.f8905k = 0;
        this.f8906l = c.TRUE;
        this.f8907m = q.A;
        this.f8908n = 0;
        this.f8909o = Collections.emptyList();
        this.f8910p = Collections.emptyList();
    }

    public h(h.b bVar, a aVar) {
        super(bVar);
        this.f8911q = -1;
        this.r = -1;
        this.f8902h = bVar.f9236h;
    }
}
