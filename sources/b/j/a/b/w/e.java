package b.j.a.b.w;

import b.j.a.b.f;
import b.j.a.b.n;
import b.j.a.b.o;
import b.j.a.b.s.i;
import java.io.Serializable;
import java.util.Objects;

public class e implements n, f<e>, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final i f1560o = new i(" ");

    /* renamed from: h  reason: collision with root package name */
    public b f1561h = a.f1568h;

    /* renamed from: i  reason: collision with root package name */
    public b f1562i = d.f1556l;

    /* renamed from: j  reason: collision with root package name */
    public final o f1563j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1564k = true;

    /* renamed from: l  reason: collision with root package name */
    public transient int f1565l;

    /* renamed from: m  reason: collision with root package name */
    public j f1566m;

    /* renamed from: n  reason: collision with root package name */
    public String f1567n;

    public static class a extends c {

        /* renamed from: h  reason: collision with root package name */
        public static final a f1568h = new a();

        public boolean l() {
            return true;
        }

        public void m(f fVar, int i2) {
            fVar.F0(' ');
        }
    }

    public interface b {
        boolean l();

        void m(f fVar, int i2);
    }

    public static class c implements b, Serializable {
    }

    public e() {
        i iVar = f1560o;
        this.f1563j = iVar;
        this.f1566m = n.a;
        this.f1567n = " : ";
    }

    public void a(f fVar) {
        fVar.F0('{');
        if (!this.f1562i.l()) {
            this.f1565l++;
        }
    }

    public void b(f fVar) {
        this.f1561h.m(fVar, this.f1565l);
    }

    public void c(f fVar) {
        o oVar = this.f1563j;
        if (oVar != null) {
            fVar.G0(oVar);
        }
    }

    public void d(f fVar) {
        Objects.requireNonNull(this.f1566m);
        fVar.F0(',');
        this.f1561h.m(fVar, this.f1565l);
    }

    public void e(f fVar) {
        Objects.requireNonNull(this.f1566m);
        fVar.F0(',');
        this.f1562i.m(fVar, this.f1565l);
    }

    public void f(f fVar, int i2) {
        if (!this.f1561h.l()) {
            this.f1565l--;
        }
        if (i2 > 0) {
            this.f1561h.m(fVar, this.f1565l);
        } else {
            fVar.F0(' ');
        }
        fVar.F0(']');
    }

    public void g(f fVar) {
        this.f1562i.m(fVar, this.f1565l);
    }

    public Object h() {
        if (e.class == e.class) {
            return new e(this);
        }
        throw new IllegalStateException(b.e.a.a.a.e(e.class, b.e.a.a.a.y("Failed `createInstance()`: "), " does not override method; it has to"));
    }

    public void i(f fVar) {
        if (this.f1564k) {
            fVar.H0(this.f1567n);
            return;
        }
        Objects.requireNonNull(this.f1566m);
        fVar.F0(':');
    }

    public void j(f fVar, int i2) {
        if (!this.f1562i.l()) {
            this.f1565l--;
        }
        if (i2 > 0) {
            this.f1562i.m(fVar, this.f1565l);
        } else {
            fVar.F0(' ');
        }
        fVar.F0('}');
    }

    public void k(f fVar) {
        if (!this.f1561h.l()) {
            this.f1565l++;
        }
        fVar.F0('[');
    }

    public e(e eVar) {
        o oVar = eVar.f1563j;
        this.f1561h = eVar.f1561h;
        this.f1562i = eVar.f1562i;
        this.f1564k = eVar.f1564k;
        this.f1565l = eVar.f1565l;
        this.f1566m = eVar.f1566m;
        this.f1567n = eVar.f1567n;
        this.f1563j = oVar;
    }
}
