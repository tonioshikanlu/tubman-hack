package b.j.a.b.t;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.b.k;

public class e extends k {
    public final e c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public e f1511e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public Object f1512g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1513h;

    public e(int i2, e eVar, b bVar) {
        this.a = i2;
        this.c = eVar;
        this.d = bVar;
        this.f1435b = -1;
    }

    public e(int i2, e eVar, b bVar, Object obj) {
        this.a = i2;
        this.c = eVar;
        this.d = bVar;
        this.f1435b = -1;
        this.f1512g = obj;
    }

    public static e m(b bVar) {
        return new e(0, (e) null, bVar);
    }

    public final String a() {
        return this.f;
    }

    public Object b() {
        return this.f1512g;
    }

    public k c() {
        return this.c;
    }

    public void g(Object obj) {
        this.f1512g = obj;
    }

    public e i() {
        this.f1512g = null;
        return this.c;
    }

    public e j() {
        e eVar = this.f1511e;
        if (eVar == null) {
            b bVar = this.d;
            e eVar2 = new e(1, this, bVar == null ? null : bVar.a());
            this.f1511e = eVar2;
            return eVar2;
        }
        eVar.n(1);
        return eVar;
    }

    public e k() {
        e eVar = this.f1511e;
        if (eVar == null) {
            b bVar = this.d;
            e eVar2 = new e(2, this, bVar == null ? null : bVar.a());
            this.f1511e = eVar2;
            return eVar2;
        }
        eVar.n(2);
        return eVar;
    }

    public e l(Object obj) {
        e eVar = this.f1511e;
        b bVar = null;
        if (eVar == null) {
            b bVar2 = this.d;
            if (bVar2 != null) {
                bVar = bVar2.a();
            }
            e eVar2 = new e(2, this, bVar, obj);
            this.f1511e = eVar2;
            return eVar2;
        }
        eVar.a = 2;
        eVar.f1435b = -1;
        eVar.f = null;
        eVar.f1513h = false;
        eVar.f1512g = obj;
        b bVar3 = eVar.d;
        if (bVar3 != null) {
            bVar3.c();
        }
        return eVar;
    }

    public e n(int i2) {
        this.a = i2;
        this.f1435b = -1;
        this.f = null;
        this.f1513h = false;
        this.f1512g = null;
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
        return this;
    }

    public int o(String str) {
        if (this.a != 2 || this.f1513h) {
            return 4;
        }
        this.f1513h = true;
        this.f = str;
        b bVar = this.d;
        if (bVar != null && bVar.b(str)) {
            Object obj = bVar.a;
            throw new b.j.a.b.e(a.n("Duplicate field '", str, "'"), obj instanceof f ? (f) obj : null);
        } else if (this.f1435b < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int p() {
        int i2 = this.a;
        if (i2 == 2) {
            if (!this.f1513h) {
                return 5;
            }
            this.f1513h = false;
            this.f1435b++;
            return 2;
        } else if (i2 == 1) {
            int i3 = this.f1435b;
            this.f1435b = i3 + 1;
            return i3 < 0 ? 0 : 1;
        } else {
            int i4 = this.f1435b + 1;
            this.f1435b = i4;
            return i4 == 0 ? 0 : 3;
        }
    }
}
