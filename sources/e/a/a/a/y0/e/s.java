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
import e.a.a.a.y0.h.r;
import e.a.a.a.y0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class s extends h.d<s> implements Object {
    public static final s t;
    public static r<s> u = new a();

    /* renamed from: i  reason: collision with root package name */
    public final e.a.a.a.y0.h.c f9083i;

    /* renamed from: j  reason: collision with root package name */
    public int f9084j;

    /* renamed from: k  reason: collision with root package name */
    public int f9085k;

    /* renamed from: l  reason: collision with root package name */
    public int f9086l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9087m;

    /* renamed from: n  reason: collision with root package name */
    public c f9088n;

    /* renamed from: o  reason: collision with root package name */
    public List<q> f9089o;

    /* renamed from: p  reason: collision with root package name */
    public List<Integer> f9090p;

    /* renamed from: q  reason: collision with root package name */
    public int f9091q;
    public byte r;
    public int s;

    public static class a extends e.a.a.a.y0.h.b<s> {
        public Object a(d dVar, f fVar) {
            return new s(dVar, fVar, (a) null);
        }
    }

    public static final class b extends h.c<s, b> implements Object {

        /* renamed from: k  reason: collision with root package name */
        public int f9092k;

        /* renamed from: l  reason: collision with root package name */
        public int f9093l;

        /* renamed from: m  reason: collision with root package name */
        public int f9094m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f9095n;

        /* renamed from: o  reason: collision with root package name */
        public c f9096o = c.INV;

        /* renamed from: p  reason: collision with root package name */
        public List<q> f9097p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        public List<Integer> f9098q = Collections.emptyList();

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
            s l2 = l();
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
            m((s) hVar);
            return this;
        }

        public s l() {
            s sVar = new s(this, (a) null);
            int i2 = this.f9092k;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            sVar.f9085k = this.f9093l;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            sVar.f9086l = this.f9094m;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            sVar.f9087m = this.f9095n;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            sVar.f9088n = this.f9096o;
            if ((i2 & 16) == 16) {
                this.f9097p = Collections.unmodifiableList(this.f9097p);
                this.f9092k &= -17;
            }
            sVar.f9089o = this.f9097p;
            if ((this.f9092k & 32) == 32) {
                this.f9098q = Collections.unmodifiableList(this.f9098q);
                this.f9092k &= -33;
            }
            sVar.f9090p = this.f9098q;
            sVar.f9084j = i3;
            return sVar;
        }

        public b m(s sVar) {
            if (sVar == s.t) {
                return this;
            }
            int i2 = sVar.f9084j;
            boolean z = false;
            if ((i2 & 1) == 1) {
                int i3 = sVar.f9085k;
                this.f9092k |= 1;
                this.f9093l = i3;
            }
            if ((i2 & 2) == 2) {
                int i4 = sVar.f9086l;
                this.f9092k = 2 | this.f9092k;
                this.f9094m = i4;
            }
            if ((i2 & 4) == 4) {
                boolean z2 = sVar.f9087m;
                this.f9092k = 4 | this.f9092k;
                this.f9095n = z2;
            }
            if ((i2 & 8) == 8) {
                z = true;
            }
            if (z) {
                c cVar = sVar.f9088n;
                Objects.requireNonNull(cVar);
                this.f9092k = 8 | this.f9092k;
                this.f9096o = cVar;
            }
            if (!sVar.f9089o.isEmpty()) {
                if (this.f9097p.isEmpty()) {
                    this.f9097p = sVar.f9089o;
                    this.f9092k &= -17;
                } else {
                    if ((this.f9092k & 16) != 16) {
                        this.f9097p = new ArrayList(this.f9097p);
                        this.f9092k |= 16;
                    }
                    this.f9097p.addAll(sVar.f9089o);
                }
            }
            if (!sVar.f9090p.isEmpty()) {
                if (this.f9098q.isEmpty()) {
                    this.f9098q = sVar.f9090p;
                    this.f9092k &= -33;
                } else {
                    if ((this.f9092k & 32) != 32) {
                        this.f9098q = new ArrayList(this.f9098q);
                        this.f9092k |= 32;
                    }
                    this.f9098q.addAll(sVar.f9090p);
                }
            }
            k(sVar);
            this.f9236h = this.f9236h.e(sVar.f9083i);
            return this;
        }

        public b n(d dVar, f fVar) {
            s sVar;
            s sVar2 = null;
            try {
                s a = s.u.a(dVar, fVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (j e2) {
                sVar = (s) e2.f9248h;
                throw e2;
            } catch (Throwable th) {
                th = th;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                m(sVar2);
            }
            throw th;
        }
    }

    public enum c implements i.a {
        IN(0),
        OUT(1),
        INV(2);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f9103h;

        /* access modifiers changed from: public */
        c(int i2) {
            this.f9103h = i2;
        }

        public static c d(int i2) {
            if (i2 == 0) {
                return IN;
            }
            if (i2 == 1) {
                return OUT;
            }
            if (i2 != 2) {
                return null;
            }
            return INV;
        }

        public final int f() {
            return this.f9103h;
        }
    }

    static {
        s sVar = new s();
        t = sVar;
        sVar.t();
    }

    public s() {
        this.f9091q = -1;
        this.r = -1;
        this.s = -1;
        this.f9083i = e.a.a.a.y0.h.c.f9218h;
    }

    public s(d dVar, f fVar, a aVar) {
        Object obj;
        List list;
        this.f9091q = -1;
        this.r = -1;
        this.s = -1;
        t();
        c.b D = e.a.a.a.y0.h.c.D();
        e k2 = e.k(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o2 = dVar.o();
                if (o2 != 0) {
                    if (o2 == 8) {
                        this.f9084j |= 1;
                        this.f9085k = dVar.l();
                    } else if (o2 == 16) {
                        this.f9084j |= 2;
                        this.f9086l = dVar.l();
                    } else if (o2 == 24) {
                        this.f9084j |= 4;
                        this.f9087m = dVar.e();
                    } else if (o2 != 32) {
                        if (o2 == 42) {
                            if (!(z2 & true)) {
                                this.f9089o = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f9089o;
                            obj = dVar.h(q.B, fVar);
                        } else if (o2 == 48) {
                            if (!(z2 & true)) {
                                this.f9090p = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f9090p;
                            obj = Integer.valueOf(dVar.l());
                        } else if (o2 == 50) {
                            int d = dVar.d(dVar.l());
                            if (!(z2 & true) && dVar.b() > 0) {
                                this.f9090p = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.f9090p.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.f9229i = d;
                            dVar.p();
                        } else if (!q(dVar, k2, fVar, o2)) {
                        }
                        list.add(obj);
                    } else {
                        int l2 = dVar.l();
                        c d2 = c.d(l2);
                        if (d2 == null) {
                            k2.y(o2);
                            k2.y(l2);
                        } else {
                            this.f9084j |= 8;
                            this.f9088n = d2;
                        }
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
                    this.f9089o = Collections.unmodifiableList(this.f9089o);
                }
                if (z2 & true) {
                    this.f9090p = Collections.unmodifiableList(this.f9090p);
                }
                try {
                    k2.j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f9083i = D.q();
                    throw th2;
                }
                this.f9083i = D.q();
                this.f9239h.i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f9089o = Collections.unmodifiableList(this.f9089o);
        }
        if (z2 & true) {
            this.f9090p = Collections.unmodifiableList(this.f9090p);
        }
        try {
            k2.j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f9083i = D.q();
            throw th3;
        }
        this.f9083i = D.q();
        this.f9239h.i();
    }

    public int a() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int c2 = (this.f9084j & 1) == 1 ? e.c(1, this.f9085k) + 0 : 0;
        if ((this.f9084j & 2) == 2) {
            c2 += e.c(2, this.f9086l);
        }
        if ((this.f9084j & 4) == 4) {
            c2 += e.i(3) + 1;
        }
        if ((this.f9084j & 8) == 8) {
            c2 += e.b(4, this.f9088n.f9103h);
        }
        for (int i3 = 0; i3 < this.f9089o.size(); i3++) {
            c2 += e.e(5, this.f9089o.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f9090p.size(); i5++) {
            i4 += e.d(this.f9090p.get(i5).intValue());
        }
        int i6 = c2 + i4;
        if (!this.f9090p.isEmpty()) {
            i6 = i6 + 1 + e.d(i4);
        }
        this.f9091q = i4;
        int size = this.f9083i.size() + k() + i6;
        this.s = size;
        return size;
    }

    public p b() {
        return t;
    }

    public p.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    public void d(e eVar) {
        a();
        h.d<MessageType>.defpackage.a o2 = o();
        if ((this.f9084j & 1) == 1) {
            eVar.p(1, this.f9085k);
        }
        if ((this.f9084j & 2) == 2) {
            eVar.p(2, this.f9086l);
        }
        if ((this.f9084j & 4) == 4) {
            boolean z = this.f9087m;
            eVar.y(24);
            eVar.t(z ? 1 : 0);
        }
        if ((this.f9084j & 8) == 8) {
            eVar.n(4, this.f9088n.f9103h);
        }
        for (int i2 = 0; i2 < this.f9089o.size(); i2++) {
            eVar.r(5, this.f9089o.get(i2));
        }
        if (this.f9090p.size() > 0) {
            eVar.y(50);
            eVar.y(this.f9091q);
        }
        for (int i3 = 0; i3 < this.f9090p.size(); i3++) {
            eVar.q(this.f9090p.get(i3).intValue());
        }
        o2.a(1000, eVar);
        eVar.u(this.f9083i);
    }

    public p.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.r;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i2 = this.f9084j;
        if (!((i2 & 1) == 1)) {
            this.r = 0;
            return false;
        }
        if (!((i2 & 2) == 2)) {
            this.r = 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f9089o.size(); i3++) {
            if (!this.f9089o.get(i3).g()) {
                this.r = 0;
                return false;
            }
        }
        if (!j()) {
            this.r = 0;
            return false;
        }
        this.r = 1;
        return true;
    }

    public final void t() {
        this.f9085k = 0;
        this.f9086l = 0;
        this.f9087m = false;
        this.f9088n = c.INV;
        this.f9089o = Collections.emptyList();
        this.f9090p = Collections.emptyList();
    }

    public s(h.c cVar, a aVar) {
        super(cVar);
        this.f9091q = -1;
        this.r = -1;
        this.s = -1;
        this.f9083i = cVar.f9236h;
    }
}
