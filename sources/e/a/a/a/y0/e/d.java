package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d extends h.d<d> implements Object {

    /* renamed from: p  reason: collision with root package name */
    public static final d f8847p;

    /* renamed from: q  reason: collision with root package name */
    public static r<d> f8848q = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f8849i;

    /* renamed from: j  reason: collision with root package name */
    public int f8850j;

    /* renamed from: k  reason: collision with root package name */
    public int f8851k;

    /* renamed from: l  reason: collision with root package name */
    public List<u> f8852l;

    /* renamed from: m  reason: collision with root package name */
    public List<Integer> f8853m;

    /* renamed from: n  reason: collision with root package name */
    public byte f8854n;

    /* renamed from: o  reason: collision with root package name */
    public int f8855o;

    public static class a extends e.a.a.a.y0.h.b<d> {
        public Object a(e.a.a.a.y0.h.d dVar, f fVar) {
            return new d(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<d, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f8856k;

        /* renamed from: l  reason: collision with root package name */
        public int f8857l = 6;

        /* renamed from: m  reason: collision with root package name */
        public List<u> f8858m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        public List<Integer> f8859n = Collections.emptyList();

        public /* bridge */ /* synthetic */ p.a H(e.a.a.a.y0.h.d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public p e() {
            d l2 = l();
            if (l2.g()) {
                return l2;
            }
            throw new v();
        }

        public /* bridge */ /* synthetic */ a.C0205a h(e.a.a.a.y0.h.d dVar, f fVar) {
            n(dVar, fVar);
            return this;
        }

        public h.b i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            m((d) hVar);
            return this;
        }

        public d l() {
            d dVar = new d(this, (a) null);
            int i2 = this.f8856k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            dVar.f8851k = this.f8857l;
            if ((i2 & 2) == 2) {
                this.f8858m = Collections.unmodifiableList(this.f8858m);
                this.f8856k &= -3;
            }
            dVar.f8852l = this.f8858m;
            if ((this.f8856k & 4) == 4) {
                this.f8859n = Collections.unmodifiableList(this.f8859n);
                this.f8856k &= -5;
            }
            dVar.f8853m = this.f8859n;
            dVar.f8850j = i3;
            return dVar;
        }

        public b m(d dVar) {
            if (dVar == d.f8847p) {
                return this;
            }
            if ((dVar.f8850j & 1) == 1) {
                int i2 = dVar.f8851k;
                this.f8856k = 1 | this.f8856k;
                this.f8857l = i2;
            }
            if (!dVar.f8852l.isEmpty()) {
                if (this.f8858m.isEmpty()) {
                    this.f8858m = dVar.f8852l;
                    this.f8856k &= -3;
                } else {
                    if ((this.f8856k & 2) != 2) {
                        this.f8858m = new ArrayList(this.f8858m);
                        this.f8856k |= 2;
                    }
                    this.f8858m.addAll(dVar.f8852l);
                }
            }
            if (!dVar.f8853m.isEmpty()) {
                if (this.f8859n.isEmpty()) {
                    this.f8859n = dVar.f8853m;
                    this.f8856k &= -5;
                } else {
                    if ((this.f8856k & 4) != 4) {
                        this.f8859n = new ArrayList(this.f8859n);
                        this.f8856k |= 4;
                    }
                    this.f8859n.addAll(dVar.f8853m);
                }
            }
            k(dVar);
            this.f9236h = this.f9236h.e(dVar.f8849i);
            return this;
        }

        public b n(e.a.a.a.y0.h.d dVar, f fVar) {
            d dVar2;
            d dVar3 = null;
            try {
                d a = d.f8848q.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                dVar2 = (d) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                dVar3 = dVar2;
            }
            if (dVar3 != null) {
                m(dVar3);
            }
            throw th;
        }
    }

    static {
        d dVar = new d();
        f8847p = dVar;
        dVar.f8851k = 6;
        dVar.f8852l = Collections.emptyList();
        dVar.f8853m = Collections.emptyList();
    }

    public d() {
        this.f8854n = -1;
        this.f8855o = -1;
        this.f8849i = c.f9218h;
    }

    public d(e.a.a.a.y0.h.d dVar, f fVar, a aVar) {
        Object obj;
        List list;
        this.f8854n = -1;
        this.f8855o = -1;
        this.f8851k = 6;
        this.f8852l = Collections.emptyList();
        this.f8853m = Collections.emptyList();
        c.b D = c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 != 8) {
                        if (o2 == 18) {
                            if (!(z2 & true)) {
                                this.f8852l = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f8852l;
                            obj = dVar.h(u.t, fVar);
                        } else if (o2 == 248) {
                            if (!(z2 & true)) {
                                this.f8853m = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f8853m;
                            obj = Integer.valueOf(dVar.l());
                        } else if (o2 == 250) {
                            int d = dVar.d(dVar.l());
                            if (!(z2 & true) && dVar.b() > 0) {
                                this.f8853m = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.f8853m.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.f9229i = d;
                            dVar.p();
                        } else if (!q(dVar, k2, fVar, o2)) {
                        }
                        list.add(obj);
                    } else {
                        this.f8850j |= 1;
                        this.f8851k = dVar.l();
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
                    this.f8852l = Collections.unmodifiableList(this.f8852l);
                }
                if (z2 & true) {
                    this.f8853m = Collections.unmodifiableList(this.f8853m);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8849i = D.q();
                    throw th2;
                }
                this.f8849i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f8852l = Collections.unmodifiableList(this.f8852l);
        }
        if (z2 & true) {
            this.f8853m = Collections.unmodifiableList(this.f8853m);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8849i = D.q();
            throw th3;
        }
        this.f8849i = D.q();
        this.f9239h.i();
    }

    public int a() {
        int i2 = this.f8855o;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.f8850j & 1) == 1 ? e.c(1, this.f8851k) + 0 : 0;
        for (int i3 = 0; i3 < this.f8852l.size(); i3++) {
            c += e.e(2, this.f8852l.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f8853m.size(); i5++) {
            i4 += e.d(this.f8853m.get(i5).intValue());
        }
        int size = this.f8849i.size() + k() + (this.f8853m.size() * 2) + c + i4;
        this.f8855o = size;
        return size;
    }

    public p b() {
        return f8847p;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f8850j & 1) == 1) {
            eVar.p(1, this.f8851k);
        }
        for (int i2 = 0; i2 < this.f8852l.size(); i2++) {
            eVar.r(2, this.f8852l.get(i2));
        }
        for (int i3 = 0; i3 < this.f8853m.size(); i3++) {
            eVar.p(31, this.f8853m.get(i3).intValue());
        }
        o2.a(19000, eVar);
        eVar.u(this.f8849i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f8854n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f8852l.size(); i2++) {
            if (!this.f8852l.get(i2).g()) {
                this.f8854n = 0;
                return false;
            }
        }
        if (!j()) {
            this.f8854n = 0;
            return false;
        }
        this.f8854n = 1;
        return true;
    }

    public d(h.c cVar, a aVar) {
        super(cVar);
        this.f8854n = -1;
        this.f8855o = -1;
        this.f8849i = cVar.f9236h;
    }
}
