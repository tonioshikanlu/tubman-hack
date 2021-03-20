package b.j.a.c.j0;

import b.j.a.b.g;
import b.j.a.b.k;

public class a0 extends k {
    public final k c;
    public final g d;

    /* renamed from: e  reason: collision with root package name */
    public String f2199e;
    public Object f;

    public a0() {
        super(0, -1);
        this.c = null;
        this.d = g.f1410m;
    }

    public a0(k kVar, g gVar) {
        super(kVar);
        this.c = kVar.c();
        this.f2199e = kVar.a();
        this.f = kVar.b();
        this.d = gVar;
    }

    public a0(a0 a0Var, int i2, int i3) {
        super(i2, i3);
        this.c = a0Var;
        this.d = a0Var.d;
    }

    public String a() {
        return this.f2199e;
    }

    public Object b() {
        return this.f;
    }

    public k c() {
        return this.c;
    }

    public void g(Object obj) {
        this.f = obj;
    }
}
