package b.j.a.c.i0;

import b.j.a.c.i;
import java.lang.reflect.Array;

public final class a extends l {

    /* renamed from: q  reason: collision with root package name */
    public final i f2157q;
    public final Object r;

    public a(i iVar, m mVar, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), mVar, (i) null, (i[]) null, iVar.f2153i, obj2, obj3, z);
        this.f2157q = iVar;
        this.r = obj;
    }

    public static a U(i iVar, m mVar) {
        return new a(iVar, mVar, Array.newInstance(iVar.f2152h, 0), (Object) null, (Object) null, false);
    }

    public boolean A() {
        return true;
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return null;
    }

    public i L(i iVar) {
        return new a(iVar, this.f2170o, Array.newInstance(iVar.f2152h, 0), this.f2154j, this.f2155k, this.f2156l);
    }

    public i M(Object obj) {
        i iVar = this.f2157q;
        if (obj == iVar.f2155k) {
            return this;
        }
        return new a(iVar.Q(obj), this.f2170o, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public i N(Object obj) {
        i iVar = this.f2157q;
        if (obj == iVar.f2154j) {
            return this;
        }
        return new a(iVar.R(obj), this.f2170o, this.r, this.f2154j, this.f2155k, this.f2156l);
    }

    public i P() {
        return this.f2156l ? this : new a(this.f2157q.P(), this.f2170o, this.r, this.f2154j, this.f2155k, true);
    }

    public i Q(Object obj) {
        if (obj == this.f2155k) {
            return this;
        }
        return new a(this.f2157q, this.f2170o, this.r, this.f2154j, obj, this.f2156l);
    }

    public i R(Object obj) {
        if (obj == this.f2154j) {
            return this;
        }
        return new a(this.f2157q, this.f2170o, this.r, obj, this.f2155k, this.f2156l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f2157q.equals(((a) obj).f2157q);
        }
        return false;
    }

    public i k() {
        return this.f2157q;
    }

    public StringBuilder l(StringBuilder sb) {
        sb.append('[');
        return this.f2157q.l(sb);
    }

    public boolean t() {
        return this.f2157q.t();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("[array type, component type: ");
        y.append(this.f2157q);
        y.append("]");
        return y.toString();
    }

    public boolean u() {
        return super.u() || this.f2157q.u();
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return true;
    }

    public boolean z() {
        return true;
    }
}
