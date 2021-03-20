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
import e.a.a.a.y0.h.q;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class o extends h implements q {

    /* renamed from: l  reason: collision with root package name */
    public static final o f8998l;

    /* renamed from: m  reason: collision with root package name */
    public static r<o> f8999m = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f9000h;

    /* renamed from: i  reason: collision with root package name */
    public List<c> f9001i;

    /* renamed from: j  reason: collision with root package name */
    public byte f9002j;

    /* renamed from: k  reason: collision with root package name */
    public int f9003k;

    public static class a extends e.a.a.a.y0.h.b<o> {
        public Object a(d dVar, f fVar) {
            return new o(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<o, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f9004i;

        /* renamed from: j  reason: collision with root package name */
        public List<c> f9005j = Collections.emptyList();

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
            o k2 = k();
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
            l((o) hVar);
            return this;
        }

        public o k() {
            o oVar = new o(this, (a) null);
            if ((this.f9004i & 1) == 1) {
                this.f9005j = Collections.unmodifiableList(this.f9005j);
                this.f9004i &= -2;
            }
            oVar.f9001i = this.f9005j;
            return oVar;
        }

        public b l(o oVar) {
            if (oVar == o.f8998l) {
                return this;
            }
            if (!oVar.f9001i.isEmpty()) {
                if (this.f9005j.isEmpty()) {
                    this.f9005j = oVar.f9001i;
                    this.f9004i &= -2;
                } else {
                    if ((this.f9004i & 1) != 1) {
                        this.f9005j = new ArrayList(this.f9005j);
                        this.f9004i |= 1;
                    }
                    this.f9005j.addAll(oVar.f9001i);
                }
            }
            this.f9236h = this.f9236h.e(oVar.f9000h);
            return this;
        }

        public b m(d dVar, f fVar) {
            o oVar;
            o oVar2 = null;
            try {
                o a = o.f8999m.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                oVar = (o) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                l(oVar2);
            }
            throw th;
        }
    }

    static {
        o oVar = new o();
        f8998l = oVar;
        oVar.f9001i = Collections.emptyList();
    }

    public o() {
        this.f9002j = -1;
        this.f9003k = -1;
        this.f9000h = e.a.a.a.y0.h.c.f9218h;
    }

    public o(d dVar, f fVar, a aVar) {
        this.f9002j = -1;
        this.f9003k = -1;
        this.f9001i = Collections.emptyList();
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 10) {
                        if (!z2 || !true) {
                            this.f9001i = new ArrayList();
                            z2 |= true;
                        }
                        this.f9001i.add(dVar.h(c.f9007p, fVar));
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
                    this.f9001i = Collections.unmodifiableList(this.f9001i);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9000h = D.q();
                    throw th2;
                }
                this.f9000h = D.q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f9001i = Collections.unmodifiableList(this.f9001i);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9000h = D.q();
            throw th3;
        }
        this.f9000h = D.q();
    }

    public int a() {
        int i2 = this.f9003k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9001i.size(); i4++) {
            i3 += e.e(1, this.f9001i.get(i4));
        }
        int size = this.f9000h.size() + i3;
        this.f9003k = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        for (int i2 = 0; i2 < this.f9001i.size(); i2++) {
            eVar.r(1, this.f9001i.get(i2));
        }
        eVar.u(this.f9000h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9002j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f9001i.size(); i2++) {
            if (!this.f9001i.get(i2).g()) {
                this.f9002j = 0;
                return false;
            }
        }
        this.f9002j = 1;
        return true;
    }

    public o(h.b bVar, a aVar) {
        super(bVar);
        this.f9002j = -1;
        this.f9003k = -1;
        this.f9000h = bVar.f9236h;
    }

    public static final class c extends h implements q {

        /* renamed from: o  reason: collision with root package name */
        public static final c f9006o;

        /* renamed from: p  reason: collision with root package name */
        public static r<c> f9007p = new a();

        /* renamed from: h  reason: collision with root package name */
        public final e.a.a.a.y0.h.c f9008h;

        /* renamed from: i  reason: collision with root package name */
        public int f9009i;

        /* renamed from: j  reason: collision with root package name */
        public int f9010j;

        /* renamed from: k  reason: collision with root package name */
        public int f9011k;

        /* renamed from: l  reason: collision with root package name */
        public C0200c f9012l;

        /* renamed from: m  reason: collision with root package name */
        public byte f9013m;

        /* renamed from: n  reason: collision with root package name */
        public int f9014n;

        public static class a extends e.a.a.a.y0.h.b<c> {
            public Object a(d dVar, f fVar) {
                return new c(dVar, fVar, (a) null);
            }
        }

        public static final class b extends h.b<c, b> implements Object {

            /* renamed from: i  reason: collision with root package name */
            public int f9015i;

            /* renamed from: j  reason: collision with root package name */
            public int f9016j = -1;

            /* renamed from: k  reason: collision with root package name */
            public int f9017k;

            /* renamed from: l  reason: collision with root package name */
            public C0200c f9018l = C0200c.PACKAGE;

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
                c k2 = k();
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
                l((c) hVar);
                return this;
            }

            public c k() {
                c cVar = new c(this, (a) null);
                int i2 = this.f9015i;
                int i3 = 1;
                if ((i2 & 1) != 1) {
                    i3 = 0;
                }
                cVar.f9010j = this.f9016j;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                cVar.f9011k = this.f9017k;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                cVar.f9012l = this.f9018l;
                cVar.f9009i = i3;
                return cVar;
            }

            public b l(c cVar) {
                if (cVar == c.f9006o) {
                    return this;
                }
                int i2 = cVar.f9009i;
                boolean z = false;
                if ((i2 & 1) == 1) {
                    int i3 = cVar.f9010j;
                    this.f9015i |= 1;
                    this.f9016j = i3;
                }
                if ((i2 & 2) == 2) {
                    int i4 = cVar.f9011k;
                    this.f9015i = 2 | this.f9015i;
                    this.f9017k = i4;
                }
                if ((i2 & 4) == 4) {
                    z = true;
                }
                if (z) {
                    C0200c cVar2 = cVar.f9012l;
                    Objects.requireNonNull(cVar2);
                    this.f9015i = 4 | this.f9015i;
                    this.f9018l = cVar2;
                }
                this.f9236h = this.f9236h.e(cVar.f9008h);
                return this;
            }

            public b m(d dVar, f fVar) {
                c cVar;
                c cVar2 = null;
                try {
                    c a = c.f9007p.a(dVar, fVar);
                    if (a != null) {
                        l(a);
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
                    l(cVar2);
                }
                throw th;
            }
        }

        /* renamed from: e.a.a.a.y0.e.o$c$c  reason: collision with other inner class name */
        public enum C0200c implements i.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);
            

            /* renamed from: h  reason: collision with root package name */
            public final int f9023h;

            /* access modifiers changed from: public */
            C0200c(int i2) {
                this.f9023h = i2;
            }

            public static C0200c d(int i2) {
                if (i2 == 0) {
                    return CLASS;
                }
                if (i2 == 1) {
                    return PACKAGE;
                }
                if (i2 != 2) {
                    return null;
                }
                return LOCAL;
            }

            public final int f() {
                return this.f9023h;
            }
        }

        static {
            c cVar = new c();
            f9006o = cVar;
            cVar.f9010j = -1;
            cVar.f9011k = 0;
            cVar.f9012l = C0200c.PACKAGE;
        }

        public c() {
            this.f9013m = -1;
            this.f9014n = -1;
            this.f9008h = e.a.a.a.y0.h.c.f9218h;
        }

        public c(d dVar, f fVar, a aVar) {
            this.f9013m = -1;
            this.f9014n = -1;
            this.f9010j = -1;
            boolean z = false;
            this.f9011k = 0;
            this.f9012l = C0200c.PACKAGE;
            c.b D = e.a.a.a.y0.h.c.D();
            e k2 = e.k(D, 1);
            while (!z) {
                try {
                    int o2 = dVar.o();
                    if (o2 != 0) {
                        if (o2 == 8) {
                            this.f9009i |= 1;
                            this.f9010j = dVar.l();
                        } else if (o2 == 16) {
                            this.f9009i |= 2;
                            this.f9011k = dVar.l();
                        } else if (o2 == 24) {
                            int l2 = dVar.l();
                            C0200c d = C0200c.d(l2);
                            if (d == null) {
                                k2.y(o2);
                                k2.y(l2);
                            } else {
                                this.f9009i |= 4;
                                this.f9012l = d;
                            }
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
                        this.f9008h = D.q();
                        throw th2;
                    }
                    this.f9008h = D.q();
                    throw th;
                }
            }
            try {
                k2.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f9008h = D.q();
                throw th3;
            }
            this.f9008h = D.q();
        }

        public int a() {
            int i2 = this.f9014n;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f9009i & 1) == 1) {
                i3 = 0 + e.c(1, this.f9010j);
            }
            if ((this.f9009i & 2) == 2) {
                i3 += e.c(2, this.f9011k);
            }
            if ((this.f9009i & 4) == 4) {
                i3 += e.b(3, this.f9012l.f9023h);
            }
            int size = this.f9008h.size() + i3;
            this.f9014n = size;
            return size;
        }

        public p.a c() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        public void d(e eVar) {
            a();
            if ((this.f9009i & 1) == 1) {
                eVar.p(1, this.f9010j);
            }
            if ((this.f9009i & 2) == 2) {
                eVar.p(2, this.f9011k);
            }
            if ((this.f9009i & 4) == 4) {
                eVar.n(3, this.f9012l.f9023h);
            }
            eVar.u(this.f9008h);
        }

        public p.a f() {
            return new b();
        }

        public final boolean g() {
            byte b2 = this.f9013m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!((this.f9009i & 2) == 2)) {
                this.f9013m = 0;
                return false;
            }
            this.f9013m = 1;
            return true;
        }

        public c(h.b bVar, a aVar) {
            super(bVar);
            this.f9013m = -1;
            this.f9014n = -1;
            this.f9008h = bVar.f9236h;
        }
    }
}
