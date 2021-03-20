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
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.Objects;

public final class u extends h.d<u> implements Object {
    public static final u s;
    public static r<u> t = new a();

    /* renamed from: i  reason: collision with root package name */
    public final c f9115i;

    /* renamed from: j  reason: collision with root package name */
    public int f9116j;

    /* renamed from: k  reason: collision with root package name */
    public int f9117k;

    /* renamed from: l  reason: collision with root package name */
    public int f9118l;

    /* renamed from: m  reason: collision with root package name */
    public q f9119m;

    /* renamed from: n  reason: collision with root package name */
    public int f9120n;

    /* renamed from: o  reason: collision with root package name */
    public q f9121o;

    /* renamed from: p  reason: collision with root package name */
    public int f9122p;

    /* renamed from: q  reason: collision with root package name */
    public byte f9123q;
    public int r;

    public static class a extends e.a.a.a.y0.h.b<u> {
        public Object a(d dVar, f fVar) {
            return new u(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<u, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f9124k;

        /* renamed from: l  reason: collision with root package name */
        public int f9125l;

        /* renamed from: m  reason: collision with root package name */
        public int f9126m;

        /* renamed from: n  reason: collision with root package name */
        public q f9127n;

        /* renamed from: o  reason: collision with root package name */
        public int f9128o;

        /* renamed from: p  reason: collision with root package name */
        public q f9129p;

        /* renamed from: q  reason: collision with root package name */
        public int f9130q;

        public b() {
            q qVar = q.A;
            this.f9127n = qVar;
            this.f9129p = qVar;
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
            u l2 = l();
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
            m((u) hVar);
            return this;
        }

        public u l() {
            u uVar = new u(this, (a) null);
            int i2 = this.f9124k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            uVar.f9117k = this.f9125l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            uVar.f9118l = this.f9126m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            uVar.f9119m = this.f9127n;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            uVar.f9120n = this.f9128o;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            uVar.f9121o = this.f9129p;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            uVar.f9122p = this.f9130q;
            uVar.f9116j = i3;
            return uVar;
        }

        public b m(u uVar) {
            q qVar;
            q qVar2;
            if (uVar == u.s) {
                return this;
            }
            int i2 = uVar.f9116j;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = uVar.f9117k;
                this.f9124k |= 1;
                this.f9125l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = uVar.f9118l;
                this.f9124k = 2 | this.f9124k;
                this.f9126m = i4;
            }
            if (uVar.t()) {
                q qVar3 = uVar.f9119m;
                if ((this.f9124k & 4) == 4 && (qVar2 = this.f9127n) != q.A) {
                    qVar3 = b.e.a.a.a.F(qVar2, qVar3);
                }
                this.f9127n = qVar3;
                this.f9124k |= 4;
            }
            if ((uVar.f9116j & 8) == 8) {
                int i5 = uVar.f9120n;
                this.f9124k = 8 | this.f9124k;
                this.f9128o = i5;
            }
            if (uVar.u()) {
                q qVar4 = uVar.f9121o;
                if ((this.f9124k & 16) == 16 && (qVar = this.f9129p) != q.A) {
                    qVar4 = b.e.a.a.a.F(qVar, qVar4);
                }
                this.f9129p = qVar4;
                this.f9124k |= 16;
            }
            if ((uVar.f9116j & 32) == 32) {
                z = true;
            }
            if (z) {
                int i6 = uVar.f9122p;
                this.f9124k = 32 | this.f9124k;
                this.f9130q = i6;
            }
            k(uVar);
            this.f9236h = this.f9236h.e(uVar.f9115i);
            return this;
        }

        public b n(d dVar, f fVar) {
            u uVar;
            u uVar2 = null;
            try {
                u a = u.t.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                uVar = (u) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                m(uVar2);
            }
            throw th;
        }
    }

    static {
        u uVar = new u();
        s = uVar;
        uVar.f9117k = 0;
        uVar.f9118l = 0;
        q qVar = q.A;
        uVar.f9119m = qVar;
        uVar.f9120n = 0;
        uVar.f9121o = qVar;
        uVar.f9122p = 0;
    }

    public u() {
        this.f9123q = -1;
        this.r = -1;
        this.f9115i = c.f9218h;
    }

    public u(d dVar, f fVar, a aVar) {
        this.f9123q = -1;
        this.r = -1;
        boolean z = false;
        this.f9117k = 0;
        this.f9118l = 0;
        q qVar = q.A;
        this.f9119m = qVar;
        this.f9120n = 0;
        this.f9121o = qVar;
        this.f9122p = 0;
        c.b D = c.D();
        e k2 = e.k(D, 1);
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f9116j |= 1;
                        this.f9117k = dVar.l();
                    } else if (o2 != 16) {
                        q.c cVar = null;
                        if (o2 == 26) {
                            if ((this.f9116j & 4) == 4) {
                                q qVar2 = this.f9119m;
                                Objects.requireNonNull(qVar2);
                                cVar = q.z(qVar2);
                            }
                            q qVar3 = (q) dVar.h(q.B, fVar);
                            this.f9119m = qVar3;
                            if (cVar != null) {
                                cVar.m(qVar3);
                                this.f9119m = cVar.l();
                            }
                            this.f9116j |= 4;
                        } else if (o2 == 34) {
                            if ((this.f9116j & 16) == 16) {
                                q qVar4 = this.f9121o;
                                Objects.requireNonNull(qVar4);
                                cVar = q.z(qVar4);
                            }
                            q qVar5 = (q) dVar.h(q.B, fVar);
                            this.f9121o = qVar5;
                            if (cVar != null) {
                                cVar.m(qVar5);
                                this.f9121o = cVar.l();
                            }
                            this.f9116j |= 16;
                        } else if (o2 == 40) {
                            this.f9116j |= 8;
                            this.f9120n = dVar.l();
                        } else if (o2 == 48) {
                            this.f9116j |= 32;
                            this.f9122p = dVar.l();
                        } else if (!q(dVar, k2, fVar, o2)) {
                        }
                    } else {
                        this.f9116j |= 2;
                        this.f9118l = dVar.l();
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
                    this.f9115i = D.q();
                    throw th2;
                }
                this.f9115i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9115i = D.q();
            throw th3;
        }
        this.f9115i = D.q();
        this.f9239h.i();
    }

    public int a() {
        int i2 = this.r;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f9116j & 1) == 1) {
            i3 = 0 + e.c(1, this.f9117k);
        }
        if ((this.f9116j & 2) == 2) {
            i3 += e.c(2, this.f9118l);
        }
        if ((this.f9116j & 4) == 4) {
            i3 += e.e(3, this.f9119m);
        }
        if ((this.f9116j & 16) == 16) {
            i3 += e.e(4, this.f9121o);
        }
        if ((this.f9116j & 8) == 8) {
            i3 += e.c(5, this.f9120n);
        }
        if ((this.f9116j & 32) == 32) {
            i3 += e.c(6, this.f9122p);
        }
        int size = this.f9115i.size() + k() + i3;
        this.r = size;
        return size;
    }

    public p b() {
        return s;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f9116j & 1) == 1) {
            eVar.p(1, this.f9117k);
        }
        if ((this.f9116j & 2) == 2) {
            eVar.p(2, this.f9118l);
        }
        if ((this.f9116j & 4) == 4) {
            eVar.r(3, this.f9119m);
        }
        if ((this.f9116j & 16) == 16) {
            eVar.r(4, this.f9121o);
        }
        if ((this.f9116j & 8) == 8) {
            eVar.p(5, this.f9120n);
        }
        if ((this.f9116j & 32) == 32) {
            eVar.p(6, this.f9122p);
        }
        o2.a(200, eVar);
        eVar.u(this.f9115i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9123q;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f9116j & 2) == 2)) {
            this.f9123q = 0;
            return false;
        } else if (t() && !this.f9119m.g()) {
            this.f9123q = 0;
            return false;
        } else if (u() && !this.f9121o.g()) {
            this.f9123q = 0;
            return false;
        } else if (!j()) {
            this.f9123q = 0;
            return false;
        } else {
            this.f9123q = 1;
            return true;
        }
    }

    public boolean t() {
        return (this.f9116j & 4) == 4;
    }

    public boolean u() {
        return (this.f9116j & 16) == 16;
    }

    public u(h.c cVar, a aVar) {
        super(cVar);
        this.f9123q = -1;
        this.r = -1;
        this.f9115i = cVar.f9236h;
    }
}
