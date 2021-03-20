package b.j.a.b.t;

import b.e.a.a.a;
import b.j.a.b.h;
import b.j.a.b.i;
import b.j.a.b.k;

public final class d extends k {
    public final d c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public d f1507e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public Object f1508g;

    /* renamed from: h  reason: collision with root package name */
    public int f1509h;

    /* renamed from: i  reason: collision with root package name */
    public int f1510i;

    public d(d dVar, b bVar, int i2, int i3, int i4) {
        this.c = dVar;
        this.d = bVar;
        this.a = i2;
        this.f1509h = i3;
        this.f1510i = i4;
        this.f1435b = -1;
    }

    public String a() {
        return this.f;
    }

    public Object b() {
        return this.f1508g;
    }

    public k c() {
        return this.c;
    }

    public void g(Object obj) {
        this.f1508g = obj;
    }

    public d i() {
        this.f1508g = null;
        return this.c;
    }

    public d j(int i2, int i3) {
        d dVar = this.f1507e;
        if (dVar == null) {
            b bVar = this.d;
            dVar = new d(this, bVar == null ? null : bVar.a(), 1, i2, i3);
            this.f1507e = dVar;
        } else {
            dVar.m(1, i2, i3);
        }
        return dVar;
    }

    public d k(int i2, int i3) {
        d dVar = this.f1507e;
        if (dVar == null) {
            b bVar = this.d;
            d dVar2 = new d(this, bVar == null ? null : bVar.a(), 2, i2, i3);
            this.f1507e = dVar2;
            return dVar2;
        }
        dVar.m(2, i2, i3);
        return dVar;
    }

    public boolean l() {
        int i2 = this.f1435b + 1;
        this.f1435b = i2;
        return this.a != 0 && i2 > 0;
    }

    public void m(int i2, int i3, int i4) {
        this.a = i2;
        this.f1435b = -1;
        this.f1509h = i3;
        this.f1510i = i4;
        this.f = null;
        this.f1508g = null;
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void n(String str) {
        this.f = str;
        b bVar = this.d;
        if (bVar != null && bVar.b(str)) {
            Object obj = bVar.a;
            throw new h(obj instanceof i ? (i) obj : null, a.n("Duplicate field '", str, "'"));
        }
    }
}
