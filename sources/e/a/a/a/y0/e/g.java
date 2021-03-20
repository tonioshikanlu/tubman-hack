package e.a.a.a.y0.e;

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
import java.io.IOException;

public final class g extends h.d<g> implements Object {

    /* renamed from: n  reason: collision with root package name */
    public static final g f8893n;

    /* renamed from: o  reason: collision with root package name */
    public static r<g> f8894o = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8895i;

    /* renamed from: j  reason: collision with root package name */
    public int f8896j;

    /* renamed from: k  reason: collision with root package name */
    public int f8897k;

    /* renamed from: l  reason: collision with root package name */
    public byte f8898l;

    /* renamed from: m  reason: collision with root package name */
    public int f8899m;

    public static class a extends e.a.a.a.y0.h.b<g> {
        public Object a(d dVar, f fVar) {
            return new g(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<g, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8900k;

        /* renamed from: l  reason: collision with root package name */
        public int f8901l;

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
            g l2 = l();
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
            m((g) hVar);
            return this;
        }

        public g l() {
            g gVar = new g(this, (a) null);
            int i2 = 1;
            if ((this.f8900k & 1) != 1) {
                i2 = 0;
            }
            gVar.f8897k = this.f8901l;
            gVar.f8896j = i2;
            return gVar;
        }

        public b m(g gVar) {
            if (gVar == g.f8893n) {
                return this;
            }
            if ((gVar.f8896j & 1) == 1) {
                int i2 = gVar.f8897k;
                this.f8900k = 1 | this.f8900k;
                this.f8901l = i2;
            }
            k(gVar);
            this.f9236h = this.f9236h.e(gVar.f8895i);
            return this;
        }

        public b n(d dVar, f fVar) {
            g gVar;
            g gVar2 = null;
            try {
                g a = g.f8894o.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                gVar = (g) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                m(gVar2);
            }
            throw th;
        }
    }

    static {
        g gVar = new g();
        f8893n = gVar;
        gVar.f8897k = 0;
    }

    public g() {
        this.f8898l = -1;
        this.f8899m = -1;
        this.f8895i = c.f9218h;
    }

    public g(d dVar, f fVar, a aVar) {
        this.f8898l = -1;
        this.f8899m = -1;
        boolean z = false;
        this.f8897k = 0;
        c.b D = c.D();
        e k2 = e.k(D, 1);
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f8896j |= 1;
                        this.f8897k = dVar.l();
                    } else if (!q(dVar, k2, fVar, o2)) {
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
                    this.f8895i = D.q();
                    throw th2;
                }
                this.f8895i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8895i = D.q();
            throw th3;
        }
        this.f8895i = D.q();
        this.f9239h.i();
    }

    public int a() {
        int i2 = this.f8899m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f8896j & 1) == 1) {
            i3 = 0 + e.c(1, this.f8897k);
        }
        int size = this.f8895i.size() + k() + i3;
        this.f8899m = size;
        return size;
    }

    public p b() {
        return f8893n;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8896j & 1) == 1) {
            eVar.p(1, this.f8897k);
        }
        o2.a(200, eVar);
        eVar.u(this.f8895i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8898l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!j()) {
            this.f8898l = 0;
            return false;
        }
        this.f8898l = 1;
        return true;
    }

    public g(h.c cVar, a aVar) {
        super(cVar);
        this.f8898l = -1;
        this.f8899m = -1;
        this.f8895i = cVar.f9236h;
    }
}
