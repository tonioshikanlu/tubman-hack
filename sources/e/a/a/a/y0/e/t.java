package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.q;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class t extends h implements q {

    /* renamed from: n  reason: collision with root package name */
    public static final t f9104n;

    /* renamed from: o  reason: collision with root package name */
    public static r<t> f9105o = new a();

    /* renamed from: h  reason: collision with root package name */
    public final c f9106h;

    /* renamed from: i  reason: collision with root package name */
    public int f9107i;

    /* renamed from: j  reason: collision with root package name */
    public List<q> f9108j;

    /* renamed from: k  reason: collision with root package name */
    public int f9109k;

    /* renamed from: l  reason: collision with root package name */
    public byte f9110l;

    /* renamed from: m  reason: collision with root package name */
    public int f9111m;

    public static class a extends e.a.a.a.y0.h.b<t> {
        public Object a(d dVar, f fVar) {
            return new t(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<t, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f9112i;

        /* renamed from: j  reason: collision with root package name */
        public List<q> f9113j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        public int f9114k = -1;

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
            t k2 = k();
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
            l((t) hVar);
            return this;
        }

        public t k() {
            t tVar = new t(this, (a) null);
            int i2 = this.f9112i;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.f9113j = Collections.unmodifiableList(this.f9113j);
                this.f9112i &= -2;
            }
            tVar.f9108j = this.f9113j;
            if ((i2 & 2) != 2) {
                i3 = 0;
            }
            tVar.f9109k = this.f9114k;
            tVar.f9107i = i3;
            return tVar;
        }

        public b l(t tVar) {
            if (tVar == t.f9104n) {
                return this;
            }
            boolean z = true;
            if (!tVar.f9108j.isEmpty()) {
                if (this.f9113j.isEmpty()) {
                    this.f9113j = tVar.f9108j;
                    this.f9112i &= -2;
                } else {
                    if ((this.f9112i & 1) != 1) {
                        this.f9113j = new ArrayList(this.f9113j);
                        this.f9112i |= 1;
                    }
                    this.f9113j.addAll(tVar.f9108j);
                }
            }
            if ((tVar.f9107i & 1) != 1) {
                z = false;
            }
            if (z) {
                int i2 = tVar.f9109k;
                this.f9112i |= 2;
                this.f9114k = i2;
            }
            this.f9236h = this.f9236h.e(tVar.f9106h);
            return this;
        }

        public b m(d dVar, f fVar) {
            t tVar;
            t tVar2 = null;
            try {
                t a = t.f9105o.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                tVar = (t) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                l(tVar2);
            }
            throw th;
        }
    }

    static {
        t tVar = new t();
        f9104n = tVar;
        tVar.f9108j = Collections.emptyList();
        tVar.f9109k = -1;
    }

    public t() {
        this.f9110l = -1;
        this.f9111m = -1;
        this.f9106h = c.f9218h;
    }

    public t(d dVar, f fVar, a aVar) {
        this.f9110l = -1;
        this.f9111m = -1;
        this.f9108j = Collections.emptyList();
        this.f9109k = -1;
        c.b D = c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 10) {
                        if (!z2 || !true) {
                            this.f9108j = new ArrayList();
                            z2 |= true;
                        }
                        this.f9108j.add(dVar.h(q.B, fVar));
                    } else if (o2 == 16) {
                        this.f9107i |= 1;
                        this.f9109k = dVar.l();
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
                    this.f9108j = Collections.unmodifiableList(this.f9108j);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9106h = D.q();
                    throw th2;
                }
                this.f9106h = D.q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f9108j = Collections.unmodifiableList(this.f9108j);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9106h = D.q();
            throw th3;
        }
        this.f9106h = D.q();
    }

    public static b j(t tVar) {
        b bVar = new b();
        bVar.l(tVar);
        return bVar;
    }

    public int a() {
        int i2 = this.f9111m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9108j.size(); i4++) {
            i3 += e.e(1, this.f9108j.get(i4));
        }
        if ((this.f9107i & 1) == 1) {
            i3 += e.c(2, this.f9109k);
        }
        int size = this.f9106h.size() + i3;
        this.f9111m = size;
        return size;
    }

    public p.a c() {
        return j(this);
    }

    public void d(e eVar) {
        a();
        for (int i2 = 0; i2 < this.f9108j.size(); i2++) {
            eVar.r(1, this.f9108j.get(i2));
        }
        if ((this.f9107i & 1) == 1) {
            eVar.p(2, this.f9109k);
        }
        eVar.u(this.f9106h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9110l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f9108j.size(); i2++) {
            if (!this.f9108j.get(i2).g()) {
                this.f9110l = 0;
                return false;
            }
        }
        this.f9110l = 1;
        return true;
    }

    public b k() {
        return j(this);
    }

    public t(h.b bVar, a aVar) {
        super(bVar);
        this.f9110l = -1;
        this.f9111m = -1;
        this.f9106h = bVar.f9236h;
    }
}
