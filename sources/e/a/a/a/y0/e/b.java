package e.a.a.a.y0.e;

import com.google.android.material.shadow.ShadowDrawableWrapper;
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

public final class b extends h implements q {

    /* renamed from: n  reason: collision with root package name */
    public static final b f8771n;

    /* renamed from: o  reason: collision with root package name */
    public static r<b> f8772o = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f8773h;

    /* renamed from: i  reason: collision with root package name */
    public int f8774i;

    /* renamed from: j  reason: collision with root package name */
    public int f8775j;

    /* renamed from: k  reason: collision with root package name */
    public List<C0195b> f8776k;

    /* renamed from: l  reason: collision with root package name */
    public byte f8777l;

    /* renamed from: m  reason: collision with root package name */
    public int f8778m;

    public static class a extends e.a.a.a.y0.h.b<b> {
        public Object a(d dVar, f fVar) {
            return new b(dVar, fVar, (a) null);
        }
    }

    public static final class c extends h.b<b, c> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f8819i;

        /* renamed from: j  reason: collision with root package name */
        public int f8820j;

        /* renamed from: k  reason: collision with root package name */
        public List<C0195b> f8821k = Collections.emptyList();

        public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
            m(dVar, fVar);
            return this;
        }

        public Object clone() {
            c cVar = new c();
            cVar.l(k());
            return cVar;
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
            c cVar = new c();
            cVar.l(k());
            return cVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            l((b) hVar);
            return this;
        }

        public b k() {
            b bVar = new b(this, (a) null);
            int i2 = this.f8819i;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            bVar.f8775j = this.f8820j;
            if ((i2 & 2) == 2) {
                this.f8821k = Collections.unmodifiableList(this.f8821k);
                this.f8819i &= -3;
            }
            bVar.f8776k = this.f8821k;
            bVar.f8774i = i3;
            return bVar;
        }

        public c l(b bVar) {
            if (bVar == b.f8771n) {
                return this;
            }
            if ((bVar.f8774i & 1) == 1) {
                int i2 = bVar.f8775j;
                this.f8819i = 1 | this.f8819i;
                this.f8820j = i2;
            }
            if (!bVar.f8776k.isEmpty()) {
                if (this.f8821k.isEmpty()) {
                    this.f8821k = bVar.f8776k;
                    this.f8819i &= -3;
                } else {
                    if ((this.f8819i & 2) != 2) {
                        this.f8821k = new ArrayList(this.f8821k);
                        this.f8819i |= 2;
                    }
                    this.f8821k.addAll(bVar.f8776k);
                }
            }
            this.f9236h = this.f9236h.e(bVar.f8773h);
            return this;
        }

        public c m(d dVar, f fVar) {
            b bVar;
            b bVar2 = null;
            try {
                b a = b.f8772o.a(dVar, fVar);
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

    static {
        b bVar = new b();
        f8771n = bVar;
        bVar.f8775j = 0;
        bVar.f8776k = Collections.emptyList();
    }

    public b() {
        this.f8777l = -1;
        this.f8778m = -1;
        this.f8773h = e.a.a.a.y0.h.c.f9218h;
    }

    public b(d dVar, f fVar, a aVar) {
        this.f8777l = -1;
        this.f8778m = -1;
        boolean z = false;
        this.f8775j = 0;
        this.f8776k = Collections.emptyList();
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f8774i |= 1;
                        this.f8775j = dVar.l();
                    } else if (o2 == 18) {
                        if (!(z2 & true)) {
                            this.f8776k = new ArrayList();
                            z2 |= true;
                        }
                        this.f8776k.add(dVar.h(C0195b.f8780o, fVar));
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
                if (z2 & true) {
                    this.f8776k = Collections.unmodifiableList(this.f8776k);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8773h = D.q();
                    throw th2;
                }
                this.f8773h = D.q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f8776k = Collections.unmodifiableList(this.f8776k);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8773h = D.q();
            throw th3;
        }
        this.f8773h = D.q();
    }

    public int a() {
        int i2 = this.f8778m;
        if (i2 != -1) {
            return i2;
        }
        int c2 = (this.f8774i & 1) == 1 ? e.c(1, this.f8775j) + 0 : 0;
        for (int i3 = 0; i3 < this.f8776k.size(); i3++) {
            c2 += e.e(2, this.f8776k.get(i3));
        }
        int size = this.f8773h.size() + c2;
        this.f8778m = size;
        return size;
    }

    public p.a c() {
        c cVar = new c();
        cVar.l(this);
        return cVar;
    }

    public void d(e eVar) {
        a();
        if ((this.f8774i & 1) == 1) {
            eVar.p(1, this.f8775j);
        }
        for (int i2 = 0; i2 < this.f8776k.size(); i2++) {
            eVar.r(2, this.f8776k.get(i2));
        }
        eVar.u(this.f8773h);
    }

    public p.a f() {
        return new c();
    }

    public final boolean g() {
        byte b2 = this.f8777l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f8774i & 1) == 1)) {
            this.f8777l = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f8776k.size(); i2++) {
            if (!this.f8776k.get(i2).g()) {
                this.f8777l = 0;
                return false;
            }
        }
        this.f8777l = 1;
        return true;
    }

    public b(h.b bVar, a aVar) {
        super(bVar);
        this.f8777l = -1;
        this.f8778m = -1;
        this.f8773h = bVar.f9236h;
    }

    /* renamed from: e.a.a.a.y0.e.b$b  reason: collision with other inner class name */
    public static final class C0195b extends h implements q {

        /* renamed from: n  reason: collision with root package name */
        public static final C0195b f8779n;

        /* renamed from: o  reason: collision with root package name */
        public static r<C0195b> f8780o = new a();

        /* renamed from: h  reason: collision with root package name */
        public final e.a.a.a.y0.h.c f8781h;

        /* renamed from: i  reason: collision with root package name */
        public int f8782i;

        /* renamed from: j  reason: collision with root package name */
        public int f8783j;

        /* renamed from: k  reason: collision with root package name */
        public c f8784k;

        /* renamed from: l  reason: collision with root package name */
        public byte f8785l;

        /* renamed from: m  reason: collision with root package name */
        public int f8786m;

        /* renamed from: e.a.a.a.y0.e.b$b$a */
        public static class a extends e.a.a.a.y0.h.b<C0195b> {
            public Object a(d dVar, f fVar) {
                return new C0195b(dVar, fVar, (a) null);
            }
        }

        /* renamed from: e.a.a.a.y0.e.b$b$b  reason: collision with other inner class name */
        public static final class C0196b extends h.b<C0195b, C0196b> implements Object {

            /* renamed from: i  reason: collision with root package name */
            public int f8787i;

            /* renamed from: j  reason: collision with root package name */
            public int f8788j;

            /* renamed from: k  reason: collision with root package name */
            public c f8789k = c.w;

            public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
                m(dVar, fVar);
                return this;
            }

            public Object clone() {
                C0196b bVar = new C0196b();
                bVar.l(k());
                return bVar;
            }

            public p e() {
                C0195b k2 = k();
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
                C0196b bVar = new C0196b();
                bVar.l(k());
                return bVar;
            }

            public /* bridge */ /* synthetic */ h.b j(h hVar) {
                l((C0195b) hVar);
                return this;
            }

            public C0195b k() {
                C0195b bVar = new C0195b(this, (a) null);
                int i2 = this.f8787i;
                int i3 = 1;
                if ((i2 & 1) != 1) {
                    i3 = 0;
                }
                bVar.f8783j = this.f8788j;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.f8784k = this.f8789k;
                bVar.f8782i = i3;
                return bVar;
            }

            public C0196b l(C0195b bVar) {
                c cVar;
                if (bVar == C0195b.f8779n) {
                    return this;
                }
                int i2 = bVar.f8782i;
                boolean z = false;
                if ((i2 & 1) == 1) {
                    int i3 = bVar.f8783j;
                    this.f8787i |= 1;
                    this.f8788j = i3;
                }
                if ((i2 & 2) == 2) {
                    z = true;
                }
                if (z) {
                    c cVar2 = bVar.f8784k;
                    if ((this.f8787i & 2) == 2 && (cVar = this.f8789k) != c.w) {
                        c.C0197b bVar2 = new c.C0197b();
                        bVar2.l(cVar);
                        bVar2.l(cVar2);
                        cVar2 = bVar2.k();
                    }
                    this.f8789k = cVar2;
                    this.f8787i |= 2;
                }
                this.f9236h = this.f9236h.e(bVar.f8781h);
                return this;
            }

            public C0196b m(d dVar, f fVar) {
                C0195b bVar;
                C0195b bVar2 = null;
                try {
                    C0195b a = C0195b.f8780o.a(dVar, fVar);
                    if (a != null) {
                        l(a);
                    }
                    return this;
                } catch (j e2) {
                    bVar = (C0195b) e2.f9248h;
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

        static {
            C0195b bVar = new C0195b();
            f8779n = bVar;
            bVar.f8783j = 0;
            bVar.f8784k = c.w;
        }

        public C0195b() {
            this.f8785l = -1;
            this.f8786m = -1;
            this.f8781h = e.a.a.a.y0.h.c.f9218h;
        }

        public C0195b(d dVar, f fVar, a aVar) {
            this.f8785l = -1;
            this.f8786m = -1;
            boolean z = false;
            this.f8783j = 0;
            this.f8784k = c.w;
            c.b D = e.a.a.a.y0.h.c.D();
            e k2 = e.k(D, 1);
            while (!z) {
                try {
                    int o2 = dVar.o();
                    if (o2 != 0) {
                        if (o2 == 8) {
                            this.f8782i |= 1;
                            this.f8783j = dVar.l();
                        } else if (o2 == 18) {
                            c.C0197b bVar = null;
                            if ((this.f8782i & 2) == 2) {
                                c cVar = this.f8784k;
                                Objects.requireNonNull(cVar);
                                c.C0197b bVar2 = new c.C0197b();
                                bVar2.l(cVar);
                                bVar = bVar2;
                            }
                            c cVar2 = (c) dVar.h(c.x, fVar);
                            this.f8784k = cVar2;
                            if (bVar != null) {
                                bVar.l(cVar2);
                                this.f8784k = bVar.k();
                            }
                            this.f8782i |= 2;
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
                        this.f8781h = D.q();
                        throw th2;
                    }
                    this.f8781h = D.q();
                    throw th;
                }
            }
            try {
                k2.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f8781h = D.q();
                throw th3;
            }
            this.f8781h = D.q();
        }

        public int a() {
            int i2 = this.f8786m;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f8782i & 1) == 1) {
                i3 = 0 + e.c(1, this.f8783j);
            }
            if ((this.f8782i & 2) == 2) {
                i3 += e.e(2, this.f8784k);
            }
            int size = this.f8781h.size() + i3;
            this.f8786m = size;
            return size;
        }

        public p.a c() {
            C0196b bVar = new C0196b();
            bVar.l(this);
            return bVar;
        }

        public void d(e eVar) {
            a();
            if ((this.f8782i & 1) == 1) {
                eVar.p(1, this.f8783j);
            }
            if ((this.f8782i & 2) == 2) {
                eVar.r(2, this.f8784k);
            }
            eVar.u(this.f8781h);
        }

        public p.a f() {
            return new C0196b();
        }

        public final boolean g() {
            byte b2 = this.f8785l;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            int i2 = this.f8782i;
            if (!((i2 & 1) == 1)) {
                this.f8785l = 0;
                return false;
            }
            if (!((i2 & 2) == 2)) {
                this.f8785l = 0;
                return false;
            } else if (!this.f8784k.g()) {
                this.f8785l = 0;
                return false;
            } else {
                this.f8785l = 1;
                return true;
            }
        }

        public C0195b(h.b bVar, a aVar) {
            super(bVar);
            this.f8785l = -1;
            this.f8786m = -1;
            this.f8781h = bVar.f9236h;
        }

        /* renamed from: e.a.a.a.y0.e.b$b$c */
        public static final class c extends h implements q {
            public static final c w;
            public static r<c> x = new a();

            /* renamed from: h  reason: collision with root package name */
            public final e.a.a.a.y0.h.c f8790h;

            /* renamed from: i  reason: collision with root package name */
            public int f8791i;

            /* renamed from: j  reason: collision with root package name */
            public C0198c f8792j;

            /* renamed from: k  reason: collision with root package name */
            public long f8793k;

            /* renamed from: l  reason: collision with root package name */
            public float f8794l;

            /* renamed from: m  reason: collision with root package name */
            public double f8795m;

            /* renamed from: n  reason: collision with root package name */
            public int f8796n;

            /* renamed from: o  reason: collision with root package name */
            public int f8797o;

            /* renamed from: p  reason: collision with root package name */
            public int f8798p;

            /* renamed from: q  reason: collision with root package name */
            public b f8799q;
            public List<c> r;
            public int s;
            public int t;
            public byte u;
            public int v;

            /* renamed from: e.a.a.a.y0.e.b$b$c$a */
            public static class a extends e.a.a.a.y0.h.b<c> {
                public Object a(d dVar, f fVar) {
                    return new c(dVar, fVar, (a) null);
                }
            }

            /* renamed from: e.a.a.a.y0.e.b$b$c$b  reason: collision with other inner class name */
            public static final class C0197b extends h.b<c, C0197b> implements Object {

                /* renamed from: i  reason: collision with root package name */
                public int f8800i;

                /* renamed from: j  reason: collision with root package name */
                public C0198c f8801j = C0198c.BYTE;

                /* renamed from: k  reason: collision with root package name */
                public long f8802k;

                /* renamed from: l  reason: collision with root package name */
                public float f8803l;

                /* renamed from: m  reason: collision with root package name */
                public double f8804m;

                /* renamed from: n  reason: collision with root package name */
                public int f8805n;

                /* renamed from: o  reason: collision with root package name */
                public int f8806o;

                /* renamed from: p  reason: collision with root package name */
                public int f8807p;

                /* renamed from: q  reason: collision with root package name */
                public b f8808q = b.f8771n;
                public List<c> r = Collections.emptyList();
                public int s;
                public int t;

                public /* bridge */ /* synthetic */ p.a H(d dVar, f fVar) {
                    m(dVar, fVar);
                    return this;
                }

                public Object clone() {
                    C0197b bVar = new C0197b();
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
                    C0197b bVar = new C0197b();
                    bVar.l(k());
                    return bVar;
                }

                public /* bridge */ /* synthetic */ h.b j(h hVar) {
                    l((c) hVar);
                    return this;
                }

                public c k() {
                    c cVar = new c(this, (a) null);
                    int i2 = this.f8800i;
                    int i3 = 1;
                    if ((i2 & 1) != 1) {
                        i3 = 0;
                    }
                    cVar.f8792j = this.f8801j;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.f8793k = this.f8802k;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.f8794l = this.f8803l;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.f8795m = this.f8804m;
                    if ((i2 & 16) == 16) {
                        i3 |= 16;
                    }
                    cVar.f8796n = this.f8805n;
                    if ((i2 & 32) == 32) {
                        i3 |= 32;
                    }
                    cVar.f8797o = this.f8806o;
                    if ((i2 & 64) == 64) {
                        i3 |= 64;
                    }
                    cVar.f8798p = this.f8807p;
                    if ((i2 & 128) == 128) {
                        i3 |= 128;
                    }
                    cVar.f8799q = this.f8808q;
                    if ((i2 & 256) == 256) {
                        this.r = Collections.unmodifiableList(this.r);
                        this.f8800i &= -257;
                    }
                    cVar.r = this.r;
                    if ((i2 & 512) == 512) {
                        i3 |= 256;
                    }
                    cVar.s = this.s;
                    if ((i2 & 1024) == 1024) {
                        i3 |= 512;
                    }
                    cVar.t = this.t;
                    cVar.f8791i = i3;
                    return cVar;
                }

                public C0197b l(c cVar) {
                    b bVar;
                    if (cVar == c.w) {
                        return this;
                    }
                    boolean z = true;
                    if ((cVar.f8791i & 1) == 1) {
                        C0198c cVar2 = cVar.f8792j;
                        Objects.requireNonNull(cVar2);
                        this.f8800i |= 1;
                        this.f8801j = cVar2;
                    }
                    int i2 = cVar.f8791i;
                    if ((i2 & 2) == 2) {
                        long j2 = cVar.f8793k;
                        this.f8800i |= 2;
                        this.f8802k = j2;
                    }
                    if ((i2 & 4) == 4) {
                        float f = cVar.f8794l;
                        this.f8800i = 4 | this.f8800i;
                        this.f8803l = f;
                    }
                    if ((i2 & 8) == 8) {
                        double d = cVar.f8795m;
                        this.f8800i |= 8;
                        this.f8804m = d;
                    }
                    if ((i2 & 16) == 16) {
                        int i3 = cVar.f8796n;
                        this.f8800i = 16 | this.f8800i;
                        this.f8805n = i3;
                    }
                    if ((i2 & 32) == 32) {
                        int i4 = cVar.f8797o;
                        this.f8800i = 32 | this.f8800i;
                        this.f8806o = i4;
                    }
                    if ((i2 & 64) == 64) {
                        int i5 = cVar.f8798p;
                        this.f8800i = 64 | this.f8800i;
                        this.f8807p = i5;
                    }
                    if ((i2 & 128) == 128) {
                        b bVar2 = cVar.f8799q;
                        if ((this.f8800i & 128) == 128 && (bVar = this.f8808q) != b.f8771n) {
                            c cVar3 = new c();
                            cVar3.l(bVar);
                            cVar3.l(bVar2);
                            bVar2 = cVar3.k();
                        }
                        this.f8808q = bVar2;
                        this.f8800i |= 128;
                    }
                    if (!cVar.r.isEmpty()) {
                        if (this.r.isEmpty()) {
                            this.r = cVar.r;
                            this.f8800i &= -257;
                        } else {
                            if ((this.f8800i & 256) != 256) {
                                this.r = new ArrayList(this.r);
                                this.f8800i |= 256;
                            }
                            this.r.addAll(cVar.r);
                        }
                    }
                    int i6 = cVar.f8791i;
                    if ((i6 & 256) == 256) {
                        int i7 = cVar.s;
                        this.f8800i |= 512;
                        this.s = i7;
                    }
                    if ((i6 & 512) != 512) {
                        z = false;
                    }
                    if (z) {
                        int i8 = cVar.t;
                        this.f8800i |= 1024;
                        this.t = i8;
                    }
                    this.f9236h = this.f9236h.e(cVar.f8790h);
                    return this;
                }

                public C0197b m(d dVar, f fVar) {
                    c cVar;
                    c cVar2 = null;
                    try {
                        c a = c.x.a(dVar, fVar);
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

            /* renamed from: e.a.a.a.y0.e.b$b$c$c  reason: collision with other inner class name */
            public enum C0198c implements i.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);
                

                /* renamed from: h  reason: collision with root package name */
                public final int f8818h;

                /* access modifiers changed from: public */
                C0198c(int i2) {
                    this.f8818h = i2;
                }

                public static C0198c d(int i2) {
                    switch (i2) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                public final int f() {
                    return this.f8818h;
                }
            }

            static {
                c cVar = new c();
                w = cVar;
                cVar.j();
            }

            public c() {
                this.u = -1;
                this.v = -1;
                this.f8790h = e.a.a.a.y0.h.c.f9218h;
            }

            public c(d dVar, f fVar, a aVar) {
                this.u = -1;
                this.v = -1;
                j();
                c.b D = e.a.a.a.y0.h.c.D();
                e k2 = e.k(D, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int o2 = dVar.o();
                        switch (o2) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int l2 = dVar.l();
                                C0198c d = C0198c.d(l2);
                                if (d != null) {
                                    this.f8791i |= 1;
                                    this.f8792j = d;
                                    break;
                                } else {
                                    k2.y(o2);
                                    k2.y(l2);
                                    break;
                                }
                            case 16:
                                this.f8791i |= 2;
                                long m2 = dVar.m();
                                this.f8793k = (-(m2 & 1)) ^ (m2 >>> 1);
                                break;
                            case 29:
                                this.f8791i |= 4;
                                this.f8794l = Float.intBitsToFloat(dVar.j());
                                break;
                            case 33:
                                this.f8791i |= 8;
                                this.f8795m = Double.longBitsToDouble(dVar.k());
                                break;
                            case 40:
                                this.f8791i |= 16;
                                this.f8796n = dVar.l();
                                break;
                            case 48:
                                this.f8791i |= 32;
                                this.f8797o = dVar.l();
                                break;
                            case 56:
                                this.f8791i |= 64;
                                this.f8798p = dVar.l();
                                break;
                            case 66:
                                c cVar = null;
                                if ((this.f8791i & 128) == 128) {
                                    b bVar = this.f8799q;
                                    Objects.requireNonNull(bVar);
                                    c cVar2 = new c();
                                    cVar2.l(bVar);
                                    cVar = cVar2;
                                }
                                b bVar2 = (b) dVar.h(b.f8772o, fVar);
                                this.f8799q = bVar2;
                                if (cVar != null) {
                                    cVar.l(bVar2);
                                    this.f8799q = cVar.k();
                                }
                                this.f8791i |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.r = new ArrayList();
                                    z2 |= true;
                                }
                                this.r.add(dVar.h(x, fVar));
                                break;
                            case 80:
                                this.f8791i |= 512;
                                this.t = dVar.l();
                                break;
                            case 88:
                                this.f8791i |= 256;
                                this.s = dVar.l();
                                break;
                            default:
                                if (dVar.r(o2, k2)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (j e2) {
                        e2.f9248h = this;
                        throw e2;
                    } catch (IOException e3) {
                        j jVar = new j(e3.getMessage());
                        jVar.f9248h = this;
                        throw jVar;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.r = Collections.unmodifiableList(this.r);
                        }
                        try {
                            k2.j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f8790h = D.q();
                            throw th2;
                        }
                        this.f8790h = D.q();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                try {
                    k2.j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f8790h = D.q();
                    throw th3;
                }
                this.f8790h = D.q();
            }

            public int a() {
                int i2 = this.v;
                if (i2 != -1) {
                    return i2;
                }
                int b2 = (this.f8791i & 1) == 1 ? e.b(1, this.f8792j.f8818h) + 0 : 0;
                if ((this.f8791i & 2) == 2) {
                    long j2 = this.f8793k;
                    b2 += e.h((j2 >> 63) ^ (j2 << 1)) + e.i(2);
                }
                if ((this.f8791i & 4) == 4) {
                    b2 += e.i(3) + 4;
                }
                if ((this.f8791i & 8) == 8) {
                    b2 += e.i(4) + 8;
                }
                if ((this.f8791i & 16) == 16) {
                    b2 += e.c(5, this.f8796n);
                }
                if ((this.f8791i & 32) == 32) {
                    b2 += e.c(6, this.f8797o);
                }
                if ((this.f8791i & 64) == 64) {
                    b2 += e.c(7, this.f8798p);
                }
                if ((this.f8791i & 128) == 128) {
                    b2 += e.e(8, this.f8799q);
                }
                for (int i3 = 0; i3 < this.r.size(); i3++) {
                    b2 += e.e(9, this.r.get(i3));
                }
                if ((this.f8791i & 512) == 512) {
                    b2 += e.c(10, this.t);
                }
                if ((this.f8791i & 256) == 256) {
                    b2 += e.c(11, this.s);
                }
                int size = this.f8790h.size() + b2;
                this.v = size;
                return size;
            }

            public p.a c() {
                C0197b bVar = new C0197b();
                bVar.l(this);
                return bVar;
            }

            public void d(e eVar) {
                a();
                if ((this.f8791i & 1) == 1) {
                    eVar.n(1, this.f8792j.f8818h);
                }
                if ((this.f8791i & 2) == 2) {
                    long j2 = this.f8793k;
                    eVar.y(16);
                    eVar.z((j2 << 1) ^ (j2 >> 63));
                }
                if ((this.f8791i & 4) == 4) {
                    float f = this.f8794l;
                    eVar.y(29);
                    eVar.w(Float.floatToRawIntBits(f));
                }
                if ((this.f8791i & 8) == 8) {
                    double d = this.f8795m;
                    eVar.y(33);
                    eVar.x(Double.doubleToRawLongBits(d));
                }
                if ((this.f8791i & 16) == 16) {
                    eVar.p(5, this.f8796n);
                }
                if ((this.f8791i & 32) == 32) {
                    eVar.p(6, this.f8797o);
                }
                if ((this.f8791i & 64) == 64) {
                    eVar.p(7, this.f8798p);
                }
                if ((this.f8791i & 128) == 128) {
                    eVar.r(8, this.f8799q);
                }
                for (int i2 = 0; i2 < this.r.size(); i2++) {
                    eVar.r(9, this.r.get(i2));
                }
                if ((this.f8791i & 512) == 512) {
                    eVar.p(10, this.t);
                }
                if ((this.f8791i & 256) == 256) {
                    eVar.p(11, this.s);
                }
                eVar.u(this.f8790h);
            }

            public p.a f() {
                return new C0197b();
            }

            public final boolean g() {
                byte b2 = this.u;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                if (!((this.f8791i & 128) == 128) || this.f8799q.g()) {
                    for (int i2 = 0; i2 < this.r.size(); i2++) {
                        if (!this.r.get(i2).g()) {
                            this.u = 0;
                            return false;
                        }
                    }
                    this.u = 1;
                    return true;
                }
                this.u = 0;
                return false;
            }

            public final void j() {
                this.f8792j = C0198c.BYTE;
                this.f8793k = 0;
                this.f8794l = 0.0f;
                this.f8795m = ShadowDrawableWrapper.COS_45;
                this.f8796n = 0;
                this.f8797o = 0;
                this.f8798p = 0;
                this.f8799q = b.f8771n;
                this.r = Collections.emptyList();
                this.s = 0;
                this.t = 0;
            }

            public c(h.b bVar, a aVar) {
                super(bVar);
                this.u = -1;
                this.v = -1;
                this.f8790h = bVar.f9236h;
            }
        }
    }
}
