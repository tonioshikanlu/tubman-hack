package e.a.a.a.y0.e;

import e.a.a.a.y0.e.q;
import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.d;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class r extends h.d<r> implements Object {
    public static final r v;
    public static e.a.a.a.y0.h.r<r> w = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f9067i;

    /* renamed from: j  reason: collision with root package name */
    public int f9068j;

    /* renamed from: k  reason: collision with root package name */
    public int f9069k;

    /* renamed from: l  reason: collision with root package name */
    public int f9070l;

    /* renamed from: m  reason: collision with root package name */
    public List<s> f9071m;

    /* renamed from: n  reason: collision with root package name */
    public q f9072n;

    /* renamed from: o  reason: collision with root package name */
    public int f9073o;

    /* renamed from: p  reason: collision with root package name */
    public q f9074p;

    /* renamed from: q  reason: collision with root package name */
    public int f9075q;
    public List<b> r;
    public List<Integer> s;
    public byte t;
    public int u;

    public static class a extends e.a.a.a.y0.h.b<r> {
        public Object a(d dVar, f fVar) {
            return new r(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<r, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f9076k;

        /* renamed from: l  reason: collision with root package name */
        public int f9077l = 6;

        /* renamed from: m  reason: collision with root package name */
        public int f9078m;

        /* renamed from: n  reason: collision with root package name */
        public List<s> f9079n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        public q f9080o;

        /* renamed from: p  reason: collision with root package name */
        public int f9081p;

        /* renamed from: q  reason: collision with root package name */
        public q f9082q;
        public int r;
        public List<b> s;
        public List<Integer> t;

        public b() {
            q qVar = q.A;
            this.f9080o = qVar;
            this.f9082q = qVar;
            this.s = Collections.emptyList();
            this.t = Collections.emptyList();
        }

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
            r l2 = l();
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
            m((r) hVar);
            return this;
        }

        public r l() {
            r rVar = new r(this, (a) null);
            int i2 = this.f9076k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            rVar.f9069k = this.f9077l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            rVar.f9070l = this.f9078m;
            if ((i2 & 4) == 4) {
                this.f9079n = Collections.unmodifiableList(this.f9079n);
                this.f9076k &= -5;
            }
            rVar.f9071m = this.f9079n;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            rVar.f9072n = this.f9080o;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            rVar.f9073o = this.f9081p;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            rVar.f9074p = this.f9082q;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            rVar.f9075q = this.r;
            if ((this.f9076k & 128) == 128) {
                this.s = Collections.unmodifiableList(this.s);
                this.f9076k &= -129;
            }
            rVar.r = this.s;
            if ((this.f9076k & 256) == 256) {
                this.t = Collections.unmodifiableList(this.t);
                this.f9076k &= -257;
            }
            rVar.s = this.t;
            rVar.f9068j = i3;
            return rVar;
        }

        public b m(r rVar) {
            q qVar;
            q qVar2;
            if (rVar == r.v) {
                return this;
            }
            int i2 = rVar.f9068j;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = rVar.f9069k;
                this.f9076k |= 1;
                this.f9077l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = rVar.f9070l;
                this.f9076k = 2 | this.f9076k;
                this.f9078m = i4;
            }
            if (!rVar.f9071m.isEmpty()) {
                if (this.f9079n.isEmpty()) {
                    this.f9079n = rVar.f9071m;
                    this.f9076k &= -5;
                } else {
                    if ((this.f9076k & 4) != 4) {
                        this.f9079n = new ArrayList(this.f9079n);
                        this.f9076k |= 4;
                    }
                    this.f9079n.addAll(rVar.f9071m);
                }
            }
            if (rVar.u()) {
                q qVar3 = rVar.f9072n;
                if ((this.f9076k & 8) == 8 && (qVar2 = this.f9080o) != q.A) {
                    qVar3 = b.e.a.a.a.F(qVar2, qVar3);
                }
                this.f9080o = qVar3;
                this.f9076k |= 8;
            }
            if ((rVar.f9068j & 8) == 8) {
                int i5 = rVar.f9073o;
                this.f9076k |= 16;
                this.f9081p = i5;
            }
            if (rVar.t()) {
                q qVar4 = rVar.f9074p;
                if ((this.f9076k & 32) == 32 && (qVar = this.f9082q) != q.A) {
                    qVar4 = b.e.a.a.a.F(qVar, qVar4);
                }
                this.f9082q = qVar4;
                this.f9076k |= 32;
            }
            if ((rVar.f9068j & 32) == 32) {
                z = true;
            }
            if (z) {
                int i6 = rVar.f9075q;
                this.f9076k |= 64;
                this.r = i6;
            }
            if (!rVar.r.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = rVar.r;
                    this.f9076k &= -129;
                } else {
                    if ((this.f9076k & 128) != 128) {
                        this.s = new ArrayList(this.s);
                        this.f9076k |= 128;
                    }
                    this.s.addAll(rVar.r);
                }
            }
            if (!rVar.s.isEmpty()) {
                if (this.t.isEmpty()) {
                    this.t = rVar.s;
                    this.f9076k &= -257;
                } else {
                    if ((this.f9076k & 256) != 256) {
                        this.t = new ArrayList(this.t);
                        this.f9076k |= 256;
                    }
                    this.t.addAll(rVar.s);
                }
            }
            k(rVar);
            this.f9236h = this.f9236h.e(rVar.f9067i);
            return this;
        }

        public b n(d dVar, f fVar) {
            r rVar;
            r rVar2 = null;
            try {
                r a = r.w.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                rVar = (r) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                m(rVar2);
            }
            throw th;
        }
    }

    static {
        r rVar = new r();
        v = rVar;
        rVar.v();
    }

    public r() {
        this.t = -1;
        this.u = -1;
        this.f9067i = c.f9218h;
    }

    public r(d dVar, f fVar, a aVar) {
        Object obj;
        List list;
        e.a.a.a.y0.h.r rVar;
        this.t = -1;
        this.u = -1;
        v();
        c.b D = c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                q.c cVar = null;
                switch (o2) {
                    case 0:
                        z = true;
                        continue;
                    case 8:
                        this.f9068j |= 1;
                        this.f9069k = dVar.l();
                        continue;
                    case 16:
                        this.f9068j |= 2;
                        this.f9070l = dVar.l();
                        continue;
                    case 26:
                        if (!(z2 & true)) {
                            this.f9071m = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f9071m;
                        rVar = s.u;
                        break;
                    case 34:
                        if ((this.f9068j & 4) == 4) {
                            q qVar = this.f9072n;
                            Objects.requireNonNull(qVar);
                            cVar = q.z(qVar);
                        }
                        q qVar2 = (q) dVar.h(q.B, fVar);
                        this.f9072n = qVar2;
                        if (cVar != null) {
                            cVar.m(qVar2);
                            this.f9072n = cVar.l();
                        }
                        this.f9068j |= 4;
                        continue;
                    case 40:
                        this.f9068j |= 8;
                        this.f9073o = dVar.l();
                        continue;
                    case 50:
                        if ((this.f9068j & 16) == 16) {
                            q qVar3 = this.f9074p;
                            Objects.requireNonNull(qVar3);
                            cVar = q.z(qVar3);
                        }
                        q qVar4 = (q) dVar.h(q.B, fVar);
                        this.f9074p = qVar4;
                        if (cVar != null) {
                            cVar.m(qVar4);
                            this.f9074p = cVar.l();
                        }
                        this.f9068j |= 16;
                        continue;
                    case 56:
                        this.f9068j |= 32;
                        this.f9075q = dVar.l();
                        continue;
                    case 66:
                        if (!(z2 & true)) {
                            this.r = new ArrayList();
                            z2 |= true;
                        }
                        list = this.r;
                        rVar = b.f8772o;
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.s = new ArrayList();
                            z2 |= true;
                        }
                        list = this.s;
                        obj = Integer.valueOf(dVar.l());
                        break;
                    case 250:
                        int d = dVar.d(dVar.l());
                        if (!(z2 & true) && dVar.b() > 0) {
                            this.s = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.b() > 0) {
                            this.s.add(Integer.valueOf(dVar.l()));
                        }
                        dVar.f9229i = d;
                        dVar.p();
                        continue;
                    default:
                        if (q(dVar, k2, fVar, o2)) {
                            continue;
                        }
                        z = true;
                        continue;
                }
                obj = dVar.h(rVar, fVar);
                list.add(obj);
            } catch (j e2) {
                e2.f9248h = this;
                throw e2;
            } catch (IOException e3) {
                j jVar = new j(e3.getMessage());
                jVar.f9248h = this;
                throw jVar;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f9071m = Collections.unmodifiableList(this.f9071m);
                }
                if (z2 & true) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if (z2 & true) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9067i = D.q();
                    throw th2;
                }
                this.f9067i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f9071m = Collections.unmodifiableList(this.f9071m);
        }
        if (z2 & true) {
            this.r = Collections.unmodifiableList(this.r);
        }
        if (z2 & true) {
            this.s = Collections.unmodifiableList(this.s);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9067i = D.q();
            throw th3;
        }
        this.f9067i = D.q();
        this.f9239h.i();
    }

    public int a() {
        int i2 = this.u;
        if (i2 != -1) {
            return i2;
        }
        int c = (this.f9068j & 1) == 1 ? e.c(1, this.f9069k) + 0 : 0;
        if ((this.f9068j & 2) == 2) {
            c += e.c(2, this.f9070l);
        }
        for (int i3 = 0; i3 < this.f9071m.size(); i3++) {
            c += e.e(3, this.f9071m.get(i3));
        }
        if ((this.f9068j & 4) == 4) {
            c += e.e(4, this.f9072n);
        }
        if ((this.f9068j & 8) == 8) {
            c += e.c(5, this.f9073o);
        }
        if ((this.f9068j & 16) == 16) {
            c += e.e(6, this.f9074p);
        }
        if ((this.f9068j & 32) == 32) {
            c += e.c(7, this.f9075q);
        }
        for (int i4 = 0; i4 < this.r.size(); i4++) {
            c += e.e(8, this.r.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.s.size(); i6++) {
            i5 += e.d(this.s.get(i6).intValue());
        }
        int size = this.f9067i.size() + k() + (this.s.size() * 2) + c + i5;
        this.u = size;
        return size;
    }

    public p b() {
        return v;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f9068j & 1) == 1) {
            eVar.p(1, this.f9069k);
        }
        if ((this.f9068j & 2) == 2) {
            eVar.p(2, this.f9070l);
        }
        for (int i2 = 0; i2 < this.f9071m.size(); i2++) {
            eVar.r(3, this.f9071m.get(i2));
        }
        if ((this.f9068j & 4) == 4) {
            eVar.r(4, this.f9072n);
        }
        if ((this.f9068j & 8) == 8) {
            eVar.p(5, this.f9073o);
        }
        if ((this.f9068j & 16) == 16) {
            eVar.r(6, this.f9074p);
        }
        if ((this.f9068j & 32) == 32) {
            eVar.p(7, this.f9075q);
        }
        for (int i3 = 0; i3 < this.r.size(); i3++) {
            eVar.r(8, this.r.get(i3));
        }
        for (int i4 = 0; i4 < this.s.size(); i4++) {
            eVar.p(31, this.s.get(i4).intValue());
        }
        o2.a(200, eVar);
        eVar.u(this.f9067i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.t;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f9068j & 2) == 2)) {
            this.t = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f9071m.size(); i2++) {
            if (!this.f9071m.get(i2).g()) {
                this.t = 0;
                return false;
            }
        }
        if (u() && !this.f9072n.g()) {
            this.t = 0;
            return false;
        } else if (!t() || this.f9074p.g()) {
            for (int i3 = 0; i3 < this.r.size(); i3++) {
                if (!this.r.get(i3).g()) {
                    this.t = 0;
                    return false;
                }
            }
            if (!j()) {
                this.t = 0;
                return false;
            }
            this.t = 1;
            return true;
        } else {
            this.t = 0;
            return false;
        }
    }

    public boolean t() {
        return (this.f9068j & 16) == 16;
    }

    public boolean u() {
        return (this.f9068j & 4) == 4;
    }

    public final void v() {
        this.f9069k = 6;
        this.f9070l = 0;
        this.f9071m = Collections.emptyList();
        q qVar = q.A;
        this.f9072n = qVar;
        this.f9073o = 0;
        this.f9074p = qVar;
        this.f9075q = 0;
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
    }

    public r(h.c cVar, a aVar) {
        super(cVar);
        this.t = -1;
        this.u = -1;
        this.f9067i = cVar.f9236h;
    }
}
