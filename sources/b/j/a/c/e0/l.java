package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

public final class l extends h {

    /* renamed from: j  reason: collision with root package name */
    public final m f1923j;

    /* renamed from: k  reason: collision with root package name */
    public final i f1924k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1925l;

    public l(m mVar, i iVar, g0 g0Var, o oVar, int i2) {
        super(g0Var, oVar);
        this.f1923j = mVar;
        this.f1924k = iVar;
        this.f1925l = i2;
    }

    public AnnotatedElement b() {
        return null;
    }

    public String d() {
        return "";
    }

    public Class<?> e() {
        return this.f1924k.f2152h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!g.s(obj, l.class)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f1923j.equals(this.f1923j) && lVar.f1925l == this.f1925l;
    }

    public i f() {
        return this.f1924k;
    }

    public Class<?> h() {
        return this.f1923j.h();
    }

    public int hashCode() {
        return this.f1923j.hashCode() + this.f1925l;
    }

    public Member j() {
        return this.f1923j.j();
    }

    public Object k(Object obj) {
        StringBuilder y = a.y("Cannot call getValue() on constructor parameter of ");
        y.append(h().getName());
        throw new UnsupportedOperationException(y.toString());
    }

    public a m(o oVar) {
        if (oVar == this.f1909i) {
            return this;
        }
        m mVar = this.f1923j;
        int i2 = this.f1925l;
        mVar.f1926j[i2] = oVar;
        return mVar.r(i2);
    }

    public String toString() {
        StringBuilder y = a.y("[parameter #");
        y.append(this.f1925l);
        y.append(", annotations: ");
        y.append(this.f1909i);
        y.append("]");
        return y.toString();
    }
}
