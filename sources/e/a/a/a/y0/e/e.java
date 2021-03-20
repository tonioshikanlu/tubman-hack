package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
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

public final class e extends h implements q {

    /* renamed from: l  reason: collision with root package name */
    public static final e f8860l;

    /* renamed from: m  reason: collision with root package name */
    public static r<e> f8861m = new a();

    /* renamed from: h  reason: collision with root package name */
    public final c f8862h;

    /* renamed from: i  reason: collision with root package name */
    public List<f> f8863i;

    /* renamed from: j  reason: collision with root package name */
    public byte f8864j;

    /* renamed from: k  reason: collision with root package name */
    public int f8865k;

    public static class a extends e.a.a.a.y0.h.b<e> {
        public Object a(d dVar, f fVar) {
            return new e(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<e, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f8866i;

        /* renamed from: j  reason: collision with root package name */
        public List<f> f8867j = Collections.emptyList();

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
            e k2 = k();
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
            l((e) hVar);
            return this;
        }

        public e k() {
            e eVar = new e(this, (a) null);
            if ((this.f8866i & 1) == 1) {
                this.f8867j = Collections.unmodifiableList(this.f8867j);
                this.f8866i &= -2;
            }
            eVar.f8863i = this.f8867j;
            return eVar;
        }

        public b l(e eVar) {
            if (eVar == e.f8860l) {
                return this;
            }
            if (!eVar.f8863i.isEmpty()) {
                if (this.f8867j.isEmpty()) {
                    this.f8867j = eVar.f8863i;
                    this.f8866i &= -2;
                } else {
                    if ((this.f8866i & 1) != 1) {
                        this.f8867j = new ArrayList(this.f8867j);
                        this.f8866i |= 1;
                    }
                    this.f8867j.addAll(eVar.f8863i);
                }
            }
            this.f9236h = this.f9236h.e(eVar.f8862h);
            return this;
        }

        public b m(d dVar, f fVar) {
            e eVar;
            e eVar2 = null;
            try {
                e a = e.f8861m.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                eVar = (e) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                eVar2 = eVar;
            }
            if (eVar2 != null) {
                l(eVar2);
            }
            throw th;
        }
    }

    static {
        e eVar = new e();
        f8860l = eVar;
        eVar.f8863i = Collections.emptyList();
    }

    public e() {
        this.f8864j = -1;
        this.f8865k = -1;
        this.f8862h = c.f9218h;
    }

    public e(d dVar, f fVar, a aVar) {
        this.f8864j = -1;
        this.f8865k = -1;
        this.f8863i = Collections.emptyList();
        c.b D = c.D();
        e.a.a.a.y0.h.e k2 = e.a.a.a.y0.h.e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 10) {
                        if (!z2 || !true) {
                            this.f8863i = new ArrayList();
                            z2 |= true;
                        }
                        this.f8863i.add(dVar.h(f.f8869q, fVar));
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
                    this.f8863i = Collections.unmodifiableList(this.f8863i);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8862h = D.q();
                    throw th2;
                }
                this.f8862h = D.q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f8863i = Collections.unmodifiableList(this.f8863i);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8862h = D.q();
            throw th3;
        }
        this.f8862h = D.q();
    }

    public int a() {
        int i2 = this.f8865k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f8863i.size(); i4++) {
            i3 += e.a.a.a.y0.h.e.e(1, this.f8863i.get(i4));
        }
        int size = this.f8862h.size() + i3;
        this.f8865k = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e.a.a.a.y0.h.e eVar) {
        a();
        for (int i2 = 0; i2 < this.f8863i.size(); i2++) {
            eVar.r(1, this.f8863i.get(i2));
        }
        eVar.u(this.f8862h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8864j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f8863i.size(); i2++) {
            if (!this.f8863i.get(i2).g()) {
                this.f8864j = 0;
                return false;
            }
        }
        this.f8864j = 1;
        return true;
    }

    public e(h.b bVar, a aVar) {
        super(bVar);
        this.f8864j = -1;
        this.f8865k = -1;
        this.f8862h = bVar.f9236h;
    }
}
