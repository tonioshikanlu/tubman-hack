package e.a.a.a.y0.e;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.c;
import e.a.a.a.y0.h.e;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.j;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.q;
import e.a.a.a.y0.h.r;
import java.io.IOException;
import java.util.Objects;

public final class v extends h implements q {
    public static final v r;
    public static r<v> s = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f9131h;

    /* renamed from: i  reason: collision with root package name */
    public int f9132i;

    /* renamed from: j  reason: collision with root package name */
    public int f9133j;

    /* renamed from: k  reason: collision with root package name */
    public int f9134k;

    /* renamed from: l  reason: collision with root package name */
    public c f9135l;

    /* renamed from: m  reason: collision with root package name */
    public int f9136m;

    /* renamed from: n  reason: collision with root package name */
    public int f9137n;

    /* renamed from: o  reason: collision with root package name */
    public d f9138o;

    /* renamed from: p  reason: collision with root package name */
    public byte f9139p;

    /* renamed from: q  reason: collision with root package name */
    public int f9140q;

    public static class a extends e.a.a.a.y0.h.b<v> {
        public Object a(e.a.a.a.y0.h.d dVar, f fVar) {
            return new v(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.b<v, b> implements Object {

        /* renamed from: i  reason: collision with root package name */
        public int f9141i;

        /* renamed from: j  reason: collision with root package name */
        public int f9142j;

        /* renamed from: k  reason: collision with root package name */
        public int f9143k;

        /* renamed from: l  reason: collision with root package name */
        public c f9144l = c.ERROR;

        /* renamed from: m  reason: collision with root package name */
        public int f9145m;

        /* renamed from: n  reason: collision with root package name */
        public int f9146n;

        /* renamed from: o  reason: collision with root package name */
        public d f9147o = d.LANGUAGE_VERSION;

        public /* bridge */ /* synthetic */ p.a H(e.a.a.a.y0.h.d dVar, f fVar) {
            m(dVar, fVar);
            return this;
        }

        public Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public p e() {
            v k2 = k();
            if (k2.g()) {
                return k2;
            }
            throw new e.a.a.a.y0.h.v();
        }

        public /* bridge */ /* synthetic */ a.C0205a h(e.a.a.a.y0.h.d dVar, f fVar) {
            m(dVar, fVar);
            return this;
        }

        public h.b i() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        public /* bridge */ /* synthetic */ h.b j(h hVar) {
            l((v) hVar);
            return this;
        }

        public v k() {
            v vVar = new v(this, (a) null);
            int i2 = this.f9141i;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            vVar.f9133j = this.f9142j;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            vVar.f9134k = this.f9143k;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            vVar.f9135l = this.f9144l;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            vVar.f9136m = this.f9145m;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            vVar.f9137n = this.f9146n;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            vVar.f9138o = this.f9147o;
            vVar.f9132i = i3;
            return vVar;
        }

        public b l(v vVar) {
            if (vVar == v.r) {
                return this;
            }
            int i2 = vVar.f9132i;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = vVar.f9133j;
                this.f9141i |= 1;
                this.f9142j = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = vVar.f9134k;
                this.f9141i = 2 | this.f9141i;
                this.f9143k = i4;
            }
            if ((i2 & 4) == 4) {
                c cVar = vVar.f9135l;
                Objects.requireNonNull(cVar);
                this.f9141i = 4 | this.f9141i;
                this.f9144l = cVar;
            }
            int i5 = vVar.f9132i;
            if ((i5 & 8) == 8) {
                int i6 = vVar.f9136m;
                this.f9141i = 8 | this.f9141i;
                this.f9145m = i6;
            }
            if ((i5 & 16) == 16) {
                int i7 = vVar.f9137n;
                this.f9141i = 16 | this.f9141i;
                this.f9146n = i7;
            }
            if ((i5 & 32) == 32) {
                z = true;
            }
            if (z) {
                d dVar = vVar.f9138o;
                Objects.requireNonNull(dVar);
                this.f9141i = 32 | this.f9141i;
                this.f9147o = dVar;
            }
            this.f9236h = this.f9236h.e(vVar.f9131h);
            return this;
        }

        public b m(e.a.a.a.y0.h.d dVar, f fVar) {
            v vVar;
            v vVar2 = null;
            try {
                v a = v.s.a(dVar, fVar);
                if (a != null) {
                    l(a);
                }
                return this;
            } catch (j e2) {
                vVar = (v) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                l(vVar2);
            }
            throw th;
        }
    }

    public enum c implements i.a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f9152h;

        /* access modifiers changed from: public */
        c(int i2) {
            this.f9152h = i2;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return WARNING;
            }
            if (i2 == 1) {
                return ERROR;
            }
            if (i2 != 2) {
                return null;
            }
            return HIDDEN;
        }

        public final int f() {
            return this.f9152h;
        }
    }

    public enum d implements i.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f9157h;

        /* access modifiers changed from: public */
        d(int i2) {
            this.f9157h = i2;
        }

        public static d d(int i2) {
            if (i2 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i2 == 1) {
                return COMPILER_VERSION;
            }
            if (i2 != 2) {
                return null;
            }
            return API_VERSION;
        }

        public final int f() {
            return this.f9157h;
        }
    }

    static {
        v vVar = new v();
        r = vVar;
        vVar.f9133j = 0;
        vVar.f9134k = 0;
        vVar.f9135l = c.ERROR;
        vVar.f9136m = 0;
        vVar.f9137n = 0;
        vVar.f9138o = d.LANGUAGE_VERSION;
    }

    public v() {
        this.f9139p = -1;
        this.f9140q = -1;
        this.f9131h = e.a.a.a.y0.h.c.f9218h;
    }

    public v(e.a.a.a.y0.h.d dVar, f fVar, a aVar) {
        int l2;
        this.f9139p = -1;
        this.f9140q = -1;
        boolean z = false;
        this.f9133j = 0;
        this.f9134k = 0;
        this.f9135l = c.ERROR;
        this.f9136m = 0;
        this.f9137n = 0;
        this.f9138o = d.LANGUAGE_VERSION;
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f9132i |= 1;
                        this.f9133j = dVar.l();
                    } else if (o2 != 16) {
                        if (o2 == 24) {
                            l2 = dVar.l();
                            c d2 = c.d(l2);
                            if (d2 != null) {
                                this.f9132i |= 4;
                                this.f9135l = d2;
                            }
                        } else if (o2 == 32) {
                            this.f9132i |= 8;
                            this.f9136m = dVar.l();
                        } else if (o2 == 40) {
                            this.f9132i |= 16;
                            this.f9137n = dVar.l();
                        } else if (o2 == 48) {
                            l2 = dVar.l();
                            d d3 = d.d(l2);
                            if (d3 != null) {
                                this.f9132i |= 32;
                                this.f9138o = d3;
                            }
                        } else if (!dVar.r(o2, k2)) {
                        }
                        k2.y(o2);
                        k2.y(l2);
                    } else {
                        this.f9132i |= 2;
                        this.f9134k = dVar.l();
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
                    this.f9131h = D.q();
                    throw th2;
                }
                this.f9131h = D.q();
                throw th;
            }
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9131h = D.q();
            throw th3;
        }
        this.f9131h = D.q();
    }

    public int a() {
        int i2 = this.f9140q;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f9132i & 1) == 1) {
            i3 = 0 + e.c(1, this.f9133j);
        }
        if ((this.f9132i & 2) == 2) {
            i3 += e.c(2, this.f9134k);
        }
        if ((this.f9132i & 4) == 4) {
            i3 += e.b(3, this.f9135l.f9152h);
        }
        if ((this.f9132i & 8) == 8) {
            i3 += e.c(4, this.f9136m);
        }
        if ((this.f9132i & 16) == 16) {
            i3 += e.c(5, this.f9137n);
        }
        if ((this.f9132i & 32) == 32) {
            i3 += e.b(6, this.f9138o.f9157h);
        }
        int size = this.f9131h.size() + i3;
        this.f9140q = size;
        return size;
    }

    public p.a c() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        if ((this.f9132i & 1) == 1) {
            eVar.p(1, this.f9133j);
        }
        if ((this.f9132i & 2) == 2) {
            eVar.p(2, this.f9134k);
        }
        if ((this.f9132i & 4) == 4) {
            eVar.n(3, this.f9135l.f9152h);
        }
        if ((this.f9132i & 8) == 8) {
            eVar.p(4, this.f9136m);
        }
        if ((this.f9132i & 16) == 16) {
            eVar.p(5, this.f9137n);
        }
        if ((this.f9132i & 32) == 32) {
            eVar.n(6, this.f9138o.f9157h);
        }
        eVar.u(this.f9131h);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.f9139p;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f9139p = 1;
        return true;
    }

    public v(h.b bVar, a aVar) {
        super(bVar);
        this.f9139p = -1;
        this.f9140q = -1;
        this.f9131h = bVar.f9236h;
    }
}
