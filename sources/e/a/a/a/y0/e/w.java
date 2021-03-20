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

public final class w extends h implements q {

    /* renamed from: l  reason: collision with root package name */
    public static final w f9158l;

    /* renamed from: m  reason: collision with root package name */
    public static r<w> f9159m = new a();

    /* renamed from: h  reason: collision with root package name */
    public final c f9160h;

    /* renamed from: i  reason: collision with root package name */
    public List<v> f9161i;

    /* renamed from: j  reason: collision with root package name */
    public byte f9162j;

    /* renamed from: k  reason: collision with root package name */
    public int f9163k;

    public static class a extends e.a.a.a.y0.h.b<w> {
        public Object a(d dVar, f fVar) {
            return new w(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<w, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f9164i;

        /* renamed from: j  reason: collision with root package name */
        public List<v> f9165j = Collections.emptyList();

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
            w k2 = k();
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
            l((w) hVar);
            return this;
        }

        public w k() {
            w wVar = new w(this, (a) null);
            if ((this.f9164i & 1) == 1) {
                this.f9165j = Collections.unmodifiableList(this.f9165j);
                this.f9164i &= -2;
            }
            wVar.f9161i = this.f9165j;
            return wVar;
        }

        public b l(w wVar) {
            if (wVar == w.f9158l) {
                return this;
            }
            if (!wVar.f9161i.isEmpty()) {
                if (this.f9165j.isEmpty()) {
                    this.f9165j = wVar.f9161i;
                    this.f9164i &= -2;
                } else {
                    if ((this.f9164i & 1) != 1) {
                        this.f9165j = new ArrayList(this.f9165j);
                        this.f9164i |= 1;
                    }
                    this.f9165j.addAll(wVar.f9161i);
                }
            }
            this.f9236h = this.f9236h.e(wVar.f9160h);
            return this;
        }

        public b m(d dVar, f fVar) {
            w wVar;
            w wVar2 = null;
            try {
                w a = w.f9159m.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                wVar = (w) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                l(wVar2);
            }
            throw th;
        }
    }

    static {
        w wVar = new w();
        f9158l = wVar;
        wVar.f9161i = Collections.emptyList();
    }

    public w() {
        this.f9162j = -1;
        this.f9163k = -1;
        this.f9160h = c.f9218h;
    }

    public w(d dVar, f fVar, a aVar) {
        this.f9162j = -1;
        this.f9163k = -1;
        this.f9161i = Collections.emptyList();
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
                            this.f9161i = new ArrayList();
                            z2 |= true;
                        }
                        this.f9161i.add(dVar.h(v.s, fVar));
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
                    this.f9161i = Collections.unmodifiableList(this.f9161i);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9160h = D.q();
                    throw th2;
                }
                this.f9160h = D.q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f9161i = Collections.unmodifiableList(this.f9161i);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9160h = D.q();
            throw th3;
        }
        this.f9160h = D.q();
    }

    public static b j(w wVar) {
        b bVar = new b();
        bVar.l(wVar);
        return bVar;
    }

    public int a() {
        int i2 = this.f9163k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f9161i.size(); i4++) {
            i3 += e.e(1, this.f9161i.get(i4));
        }
        int size = this.f9160h.size() + i3;
        this.f9163k = size;
        return size;
    }

    public p.a c() {
        return j(this);
    }

    public void d(e eVar) {
        a();
        for (int i2 = 0; i2 < this.f9161i.size(); i2++) {
            eVar.r(1, this.f9161i.get(i2));
        }
        eVar.u(this.f9160h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9162j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f9162j = 1;
        return true;
    }

    public b k() {
        return j(this);
    }

    public w(h.b bVar, a aVar) {
        super(bVar);
        this.f9162j = -1;
        this.f9163k = -1;
        this.f9160h = bVar.f9236h;
    }
}
