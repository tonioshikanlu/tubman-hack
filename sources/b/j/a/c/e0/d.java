package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class d extends m {

    /* renamed from: k  reason: collision with root package name */
    public final Constructor<?> f1901k;

    public d(g0 g0Var, Constructor<?> constructor, o oVar, o[] oVarArr) {
        super(g0Var, oVar, oVarArr);
        if (constructor != null) {
            this.f1901k = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public AnnotatedElement b() {
        return this.f1901k;
    }

    public String d() {
        return this.f1901k.getName();
    }

    public Class<?> e() {
        return this.f1901k.getDeclaringClass();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return g.s(obj, d.class) && ((d) obj).f1901k == this.f1901k;
    }

    public i f() {
        return this.f1908h.a(e());
    }

    public Class<?> h() {
        return this.f1901k.getDeclaringClass();
    }

    public int hashCode() {
        return this.f1901k.getName().hashCode();
    }

    public Member j() {
        return this.f1901k;
    }

    public Object k(Object obj) {
        StringBuilder y = a.y("Cannot call getValue() on constructor of ");
        y.append(h().getName());
        throw new UnsupportedOperationException(y.toString());
    }

    public a m(o oVar) {
        return new d(this.f1908h, this.f1901k, oVar, this.f1926j);
    }

    public final Object n() {
        return this.f1901k.newInstance(new Object[0]);
    }

    public final Object o(Object[] objArr) {
        return this.f1901k.newInstance(objArr);
    }

    public final Object q(Object obj) {
        return this.f1901k.newInstance(new Object[]{obj});
    }

    public int t() {
        return this.f1901k.getParameterTypes().length;
    }

    public String toString() {
        StringBuilder y = a.y("[constructor for ");
        y.append(d());
        y.append(", annotations: ");
        y.append(this.f1909i);
        y.append("]");
        return y.toString();
    }

    public i u(int i2) {
        Type[] genericParameterTypes = this.f1901k.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this.f1908h.a(genericParameterTypes[i2]);
    }

    public Class<?> v(int i2) {
        Class<?>[] parameterTypes = this.f1901k.getParameterTypes();
        if (i2 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i2];
    }
}
