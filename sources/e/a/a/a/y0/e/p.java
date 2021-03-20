package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.m;
import e.a.a.a.y0.h.n;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.q;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;

public final class p extends h implements q {

    /* renamed from: l  reason: collision with root package name */
    public static final p f9024l;

    /* renamed from: m  reason: collision with root package name */
    public static r<p> f9025m = new a();

    /* renamed from: h  reason: collision with root package name */
    public final c f9026h;

    /* renamed from: i  reason: collision with root package name */
    public n f9027i;

    /* renamed from: j  reason: collision with root package name */
    public byte f9028j;

    /* renamed from: k  reason: collision with root package name */
    public int f9029k;

    public static class a extends e.a.a.a.y0.h.b<p> {
        public Object a(d dVar, f fVar) {
            return new p(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<p, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f9030i;

        /* renamed from: j  reason: collision with root package name */
        public n f9031j = m.f9252i;

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            m(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public e.a.a.a.y0.h.p e() {
            p k2 = k();
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

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            l((p) hVar);
            return this;
        }

        public p k() {
            p pVar = new p(this, (a) null);
            if ((this.f9030i & 1) == 1) {
                this.f9031j = this.f9031j.B();
                this.f9030i &= -2;
            }
            pVar.f9027i = this.f9031j;
            return pVar;
        }

        public b l(p pVar) {
            if (pVar == p.f9024l) {
                return this;
            }
            if (!pVar.f9027i.isEmpty()) {
                if (this.f9031j.isEmpty()) {
                    this.f9031j = pVar.f9027i;
                    this.f9030i &= -2;
                } else {
                    if ((this.f9030i & 1) != 1) {
                        this.f9031j = new m(this.f9031j);
                        this.f9030i |= 1;
                    }
                    this.f9031j.addAll(pVar.f9027i);
                }
            }
            this.f9236h = this.f9236h.e(pVar.f9026h);
            return this;
        }

        public b m(d dVar, f fVar) {
            p pVar;
            p pVar2 = null;
            try {
                p a = p.f9025m.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                pVar = (p) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                l(pVar2);
            }
            throw th;
        }
    }

    static {
        p pVar = new p();
        f9024l = pVar;
        pVar.f9027i = m.f9252i;
    }

    public p() {
        this.f9028j = -1;
        this.f9029k = -1;
        this.f9026h = c.f9218h;
    }

    public p(d dVar, f fVar, a aVar) {
        this.f9028j = -1;
        this.f9029k = -1;
        this.f9027i = m.f9252i;
        c.b D = c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 10) {
                        c f = dVar.f();
                        if (!z2 || !true) {
                            this.f9027i = new m();
                            z2 |= true;
                        }
                        this.f9027i.P(f);
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
                if (z2 && true) {
                    this.f9027i = this.f9027i.B();
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9026h = D.q();
                    throw th2;
                }
                this.f9026h = D.q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f9027i = this.f9027i.B();
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9026h = D.q();
            throw th3;
        }
        this.f9026h = D.q();
    }

    public int a() {
        int i2 = this.f9029k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9027i.size(); i4++) {
            i3 += e.a(this.f9027i.u(i4));
        }
        int size = this.f9026h.size() + (this.f9027i.size() * 1) + 0 + i3;
        this.f9029k = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        for (int i2 = 0; i2 < this.f9027i.size(); i2++) {
            c u = this.f9027i.u(i2);
            eVar.y(10);
            eVar.m(u);
        }
        eVar.u(this.f9026h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9028j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f9028j = 1;
        return true;
    }

    public p(h.b bVar, a aVar) {
        super(bVar);
        this.f9028j = -1;
        this.f9029k = -1;
        this.f9026h = bVar.f9236h;
    }
}
