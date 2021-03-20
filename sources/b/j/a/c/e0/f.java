package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public final class f extends h implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    public final transient Field f1903j;

    public f(g0 g0Var, Field field, o oVar) {
        super(g0Var, oVar);
        this.f1903j = field;
    }

    public AnnotatedElement b() {
        return this.f1903j;
    }

    public String d() {
        return this.f1903j.getName();
    }

    public Class<?> e() {
        return this.f1903j.getType();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return g.s(obj, f.class) && ((f) obj).f1903j == this.f1903j;
    }

    public i f() {
        return this.f1908h.a(this.f1903j.getGenericType());
    }

    public Class<?> h() {
        return this.f1903j.getDeclaringClass();
    }

    public int hashCode() {
        return this.f1903j.getName().hashCode();
    }

    public Member j() {
        return this.f1903j;
    }

    public Object k(Object obj) {
        try {
            return this.f1903j.get(obj);
        } catch (IllegalAccessException e2) {
            StringBuilder y = a.y("Failed to getValue() for field ");
            y.append(i());
            y.append(": ");
            y.append(e2.getMessage());
            throw new IllegalArgumentException(y.toString(), e2);
        }
    }

    public a m(o oVar) {
        return new f(this.f1908h, this.f1903j, oVar);
    }

    public String toString() {
        StringBuilder y = a.y("[field ");
        y.append(i());
        y.append("]");
        return y.toString();
    }
}
