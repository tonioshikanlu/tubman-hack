package b.j.a.c.i0;

import b.e.a.a.a;
import b.j.a.c.i;

public class k extends l {
    public k(Class<?> cls) {
        this(cls, m.f2173n, (i) null, (i[]) null, (Object) null, (Object) null, false);
    }

    public k(Class<?> cls, m mVar, i iVar, i[] iVarArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, mVar, iVar, iVarArr, i2, obj, obj2, z);
    }

    public k(Class<?> cls, m mVar, i iVar, i[] iVarArr, Object obj, Object obj2, boolean z) {
        super(cls, mVar, iVar, iVarArr, 0, obj, obj2, z);
    }

    public static k U(Class<?> cls) {
        return new k(cls, (m) null, (i) null, (i[]) null, (Object) null, (Object) null, false);
    }

    public boolean A() {
        return false;
    }

    public i K(Class<?> cls, m mVar, i iVar, i[] iVarArr) {
        return null;
    }

    public i L(i iVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    public i M(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public String T() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2152h.getName());
        int length = this.f2170o.f2175i.length;
        if (length > 0) {
            sb.append('<');
            for (int i2 = 0; i2 < length; i2++) {
                i f = f(i2);
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(f.c());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    /* renamed from: V */
    public k N(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    /* renamed from: W */
    public k P() {
        return this.f2156l ? this : new k(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2154j, this.f2155k, true);
    }

    /* renamed from: X */
    public k Q(Object obj) {
        if (this.f2155k == obj) {
            return this;
        }
        return new k(this.f2152h, this.f2170o, this.f2168m, this.f2169n, this.f2154j, obj, this.f2156l);
    }

    /* renamed from: Y */
    public k R(Object obj) {
        if (obj == this.f2154j) {
            return this;
        }
        return new k(this.f2152h, this.f2170o, this.f2168m, this.f2169n, obj, this.f2155k, this.f2156l);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f2152h != this.f2152h) {
            return false;
        }
        return this.f2170o.equals(kVar.f2170o);
    }

    public StringBuilder l(StringBuilder sb) {
        l.S(this.f2152h, sb, false);
        int length = this.f2170o.f2175i.length;
        if (length > 0) {
            sb.append('<');
            for (int i2 = 0; i2 < length; i2++) {
                sb = f(i2).l(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    public boolean r() {
        return false;
    }

    public String toString() {
        StringBuilder x = a.x(40, "[simple type, class ");
        x.append(T());
        x.append(']');
        return x.toString();
    }
}
