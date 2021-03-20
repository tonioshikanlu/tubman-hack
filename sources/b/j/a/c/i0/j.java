package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;

public class j extends l {

    /* renamed from: q  reason: collision with root package name */
    public i f2166q;

    public j(Class<?> cls, m mVar) {
        super(cls, mVar, (i) null, (i[]) null, 0, (Object) null, (Object) null, false);
    }

    public boolean A() {
        return false;
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return null;
    }

    public i L(i iVar) {
        return this;
    }

    public i M(Object obj) {
        return this;
    }

    public i N(Object obj) {
        return this;
    }

    public i P() {
        return this;
    }

    public i Q(Object obj) {
        return this;
    }

    public i R(Object obj) {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Class<?> cls = obj.getClass();
        Class<j> cls2 = j.class;
        return false;
    }

    public StringBuilder l(StringBuilder sb) {
        return this.f2166q.l(sb);
    }

    public i q() {
        i iVar = this.f2166q;
        return iVar != null ? iVar.q() : this.f2168m;
    }

    public String toString() {
        String str;
        StringBuilder x = a.x(40, "[recursive type; ");
        i iVar = this.f2166q;
        if (iVar == null) {
            str = "UNRESOLVED";
        } else {
            str = iVar.f2152h.getName();
        }
        x.append(str);
        return x.toString();
    }
}
