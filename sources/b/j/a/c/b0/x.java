package b.j.a.c.b0;

import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.i;

public abstract class x {

    public static class a extends x {
        public final Class<?> a;

        public a(i iVar) {
            this.a = iVar.f2152h;
        }

        public a(Class<?> cls) {
            this.a = cls;
        }

        public Class<?> E() {
            return this.a;
        }
    }

    public i A(f fVar) {
        return null;
    }

    public u[] B(f fVar) {
        return null;
    }

    public l D() {
        return null;
    }

    public Class<?> E() {
        return Object.class;
    }

    public Object a(g gVar, String str) {
        if (b()) {
            String trim = str.trim();
            if ("true".equals(trim)) {
                return l(gVar, true);
            }
            if ("false".equals(trim)) {
                return l(gVar, false);
            }
        }
        if (str.length() == 0 && gVar.O(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return null;
        }
        gVar.D(E(), this, gVar.f1996m, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return y() != null;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return i() || j() || h() || f() || g() || d() || e() || c() || b();
    }

    public Object l(g gVar, boolean z) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z));
        throw null;
    }

    public Object m(g gVar, double d) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d));
        throw null;
    }

    public Object n(g gVar, int i2) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i2));
        throw null;
    }

    public Object o(g gVar, long j2) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j2));
        throw null;
    }

    public Object q(g gVar, Object[] objArr) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no creator with arguments specified", new Object[0]);
        throw null;
    }

    public Object r(g gVar, String str) {
        return a(gVar, str);
    }

    public Object t(g gVar, Object obj) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no array delegate creator specified", new Object[0]);
        throw null;
    }

    public Object u(g gVar) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no default no-arguments constructor found", new Object[0]);
        throw null;
    }

    public Object v(g gVar, Object obj) {
        gVar.D(E(), this, (b.j.a.b.i) null, "no delegate creator specified", new Object[0]);
        throw null;
    }

    public m w() {
        return null;
    }

    public i x(f fVar) {
        return null;
    }

    public m y() {
        return null;
    }

    public m z() {
        return null;
    }
}
