package e.a.a.a.y0.e;

import e.a.a.a.y0.e.h;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.e;
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

public final class f extends h implements q {

    /* renamed from: p  reason: collision with root package name */
    public static final f f8868p;

    /* renamed from: q  reason: collision with root package name */
    public static r<f> f8869q = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f8870h;

    /* renamed from: i  reason: collision with root package name */
    public int f8871i;

    /* renamed from: j  reason: collision with root package name */
    public c f8872j;

    /* renamed from: k  reason: collision with root package name */
    public List<h> f8873k;

    /* renamed from: l  reason: collision with root package name */
    public h f8874l;

    /* renamed from: m  reason: collision with root package name */
    public d f8875m;

    /* renamed from: n  reason: collision with root package name */
    public byte f8876n;

    /* renamed from: o  reason: collision with root package name */
    public int f8877o;

    public static class a extends e.a.a.a.y0.h.b<f> {
        public Object a(e.a.a.a.y0.h.d dVar, e.a.a.a.y0.h.f fVar) {
            return new f(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<f, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f8878i;

        /* renamed from: j  reason: collision with root package name */
        public c f8879j = c.RETURNS_CONSTANT;

        /* renamed from: k  reason: collision with root package name */
        public List<h> f8880k = Collections.emptyList();

        /* renamed from: l  reason: collision with root package name */
        public h f8881l = h.s;

        /* renamed from: m  reason: collision with root package name */
        public d f8882m = d.AT_MOST_ONCE;

        public /* bridge */ /* synthetic */ p.a H(e.a.a.a.y0.h.d dVar, e.a.a.a.y0.h.f fVar) {
            m(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public p e() {
            f k2 = k();
            if (k2.g()) {
                return k2;
            }
            throw new v();
        }

        public /* bridge */ /* synthetic */ a.C0205a h(e.a.a.a.y0.h.d dVar, e.a.a.a.y0.h.f fVar) {
            m(dVar, fVar);
            return this;
        }

        public h.b i() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            l((f) hVar);
            return this;
        }

        public f k() {
            f fVar = new f(this, (a) null);
            int i2 = this.f8878i;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            fVar.f8872j = this.f8879j;
            if ((i2 & 2) == 2) {
                this.f8880k = Collections.unmodifiableList(this.f8880k);
                this.f8878i &= -3;
            }
            fVar.f8873k = this.f8880k;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            fVar.f8874l = this.f8881l;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            fVar.f8875m = this.f8882m;
            fVar.f8871i = i3;
            return fVar;
        }

        public b l(f fVar) {
            h hVar;
            if (fVar == f.f8868p) {
                return this;
            }
            boolean z = true;
            if ((fVar.f8871i & 1) == 1) {
                c cVar = fVar.f8872j;
                Objects.requireNonNull(cVar);
                this.f8878i |= 1;
                this.f8879j = cVar;
            }
            if (!fVar.f8873k.isEmpty()) {
                if (this.f8880k.isEmpty()) {
                    this.f8880k = fVar.f8873k;
                    this.f8878i &= -3;
                } else {
                    if ((this.f8878i & 2) != 2) {
                        this.f8880k = new ArrayList(this.f8880k);
                        this.f8878i |= 2;
                    }
                    this.f8880k.addAll(fVar.f8873k);
                }
            }
            if ((fVar.f8871i & 2) == 2) {
                h hVar2 = fVar.f8874l;
                if ((this.f8878i & 4) == 4 && (hVar = this.f8881l) != h.s) {
                    h.b bVar = new h.b();
                    bVar.l(hVar);
                    bVar.l(hVar2);
                    hVar2 = bVar.k();
                }
                this.f8881l = hVar2;
                this.f8878i |= 4;
            }
            if ((fVar.f8871i & 4) != 4) {
                z = false;
            }
            if (z) {
                d dVar = fVar.f8875m;
                Objects.requireNonNull(dVar);
                this.f8878i |= 8;
                this.f8882m = dVar;
            }
            this.f9236h = this.f9236h.e(fVar.f8870h);
            return this;
        }

        public b m(e.a.a.a.y0.h.d dVar, e.a.a.a.y0.h.f fVar) {
            f fVar2;
            f fVar3 = null;
            try {
                f a = f.f8869q.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                fVar2 = (f) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                fVar3 = fVar2;
            }
            if (fVar3 != null) {
                l(fVar3);
            }
            throw th;
        }
    }

    public enum c implements i.a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f8887h;

        /* access modifiers changed from: public */
        c(int i2) {
            this.f8887h = i2;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i2 == 1) {
                return CALLS;
            }
            if (i2 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        public final int f() {
            return this.f8887h;
        }
    }

    public enum d implements i.a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f8892h;

        /* access modifiers changed from: public */
        d(int i2) {
            this.f8892h = i2;
        }

        public static d d(int i2) {
            if (i2 == 0) {
                return AT_MOST_ONCE;
            }
            if (i2 == 1) {
                return EXACTLY_ONCE;
            }
            if (i2 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        public final int f() {
            return this.f8892h;
        }
    }

    static {
        f fVar = new f();
        f8868p = fVar;
        fVar.f8872j = c.RETURNS_CONSTANT;
        fVar.f8873k = Collections.emptyList();
        fVar.f8874l = h.s;
        fVar.f8875m = d.AT_MOST_ONCE;
    }

    public f() {
        this.f8876n = -1;
        this.f8877o = -1;
        this.f8870h = e.a.a.a.y0.h.c.f9218h;
    }

    public f(e.a.a.a.y0.h.d dVar, e.a.a.a.y0.h.f fVar, a aVar) {
        int l2;
        this.f8876n = -1;
        this.f8877o = -1;
        this.f8872j = c.RETURNS_CONSTANT;
        this.f8873k = Collections.emptyList();
        this.f8874l = h.s;
        this.f8875m = d.AT_MOST_ONCE;
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        l2 = dVar.l();
                        c d2 = c.d(l2);
                        if (d2 != null) {
                            this.f8871i |= 1;
                            this.f8872j = d2;
                        }
                    } else if (o2 == 18) {
                        if (!(z2 & true)) {
                            this.f8873k = new ArrayList();
                            z2 |= true;
                        }
                        this.f8873k.add(dVar.h(h.t, fVar));
                    } else if (o2 == 26) {
                        h.b bVar = null;
                        if ((this.f8871i & 2) == 2) {
                            h hVar = this.f8874l;
                            Objects.requireNonNull(hVar);
                            h.b bVar2 = new h.b();
                            bVar2.l(hVar);
                            bVar = bVar2;
                        }
                        h hVar2 = (h) dVar.h(h.t, fVar);
                        this.f8874l = hVar2;
                        if (bVar != null) {
                            bVar.l(hVar2);
                            this.f8874l = bVar.k();
                        }
                        this.f8871i |= 2;
                    } else if (o2 == 32) {
                        l2 = dVar.l();
                        d d3 = d.d(l2);
                        if (d3 != null) {
                            this.f8871i |= 4;
                            this.f8875m = d3;
                        }
                    } else if (!dVar.r(o2, k2)) {
                    }
                    k2.y(o2);
                    k2.y(l2);
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
                    this.f8873k = Collections.unmodifiableList(this.f8873k);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8870h = D.q();
                    throw th2;
                }
                this.f8870h = D.q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f8873k = Collections.unmodifiableList(this.f8873k);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8870h = D.q();
            throw th3;
        }
        this.f8870h = D.q();
    }

    public int a() {
        int i2 = this.f8877o;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f8871i & 1) == 1 ? e.b(1, this.f8872j.f8887h) + 0 : 0;
        for (int i3 = 0; i3 < this.f8873k.size(); i3++) {
            b2 += e.e(2, this.f8873k.get(i3));
        }
        if ((this.f8871i & 2) == 2) {
            b2 += e.e(3, this.f8874l);
        }
        if ((this.f8871i & 4) == 4) {
            b2 += e.b(4, this.f8875m.f8892h);
        }
        int size = this.f8870h.size() + b2;
        this.f8877o = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        if ((this.f8871i & 1) == 1) {
            eVar.n(1, this.f8872j.f8887h);
        }
        for (int i2 = 0; i2 < this.f8873k.size(); i2++) {
            eVar.r(2, this.f8873k.get(i2));
        }
        if ((this.f8871i & 2) == 2) {
            eVar.r(3, this.f8874l);
        }
        if ((this.f8871i & 4) == 4) {
            eVar.n(4, this.f8875m.f8892h);
        }
        eVar.u(this.f8870h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8876n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f8873k.size(); i2++) {
            if (!this.f8873k.get(i2).g()) {
                this.f8876n = 0;
                return false;
            }
        }
        if (!((this.f8871i & 2) == 2) || this.f8874l.g()) {
            this.f8876n = 1;
            return true;
        }
        this.f8876n = 0;
        return false;
    }

    public f(h.b bVar, a aVar) {
        super(bVar);
        this.f8876n = -1;
        this.f8877o = -1;
        this.f8870h = bVar.f9236h;
    }
}
