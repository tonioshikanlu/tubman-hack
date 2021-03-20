package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class i extends m implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final transient Method f1913k;

    /* renamed from: l  reason: collision with root package name */
    public Class<?>[] f1914l;

    public i(g0 g0Var, Method method, o oVar, o[] oVarArr) {
        super(g0Var, oVar, oVarArr);
        if (method != null) {
            this.f1913k = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public AnnotatedElement b() {
        return this.f1913k;
    }

    public String d() {
        return this.f1913k.getName();
    }

    public Class<?> e() {
        return this.f1913k.getReturnType();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return g.s(obj, i.class) && ((i) obj).f1913k == this.f1913k;
    }

    public b.j.a.c.i f() {
        return this.f1908h.a(this.f1913k.getGenericReturnType());
    }

    public Class<?> h() {
        return this.f1913k.getDeclaringClass();
    }

    public int hashCode() {
        return this.f1913k.getName().hashCode();
    }

    public String i() {
        return String.format("%s(%d params)", new Object[]{super.i(), Integer.valueOf(t())});
    }

    public Member j() {
        return this.f1913k;
    }

    public Object k(Object obj) {
        try {
            return this.f1913k.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            StringBuilder y = a.y("Failed to getValue() with method ");
            y.append(i());
            y.append(": ");
            y.append(e2.getMessage());
            throw new IllegalArgumentException(y.toString(), e2);
        }
    }

    public a m(o oVar) {
        return new i(this.f1908h, this.f1913k, oVar, this.f1926j);
    }

    public final Object n() {
        return this.f1913k.invoke((Object) null, new Object[0]);
    }

    public final Object o(Object[] objArr) {
        return this.f1913k.invoke((Object) null, objArr);
    }

    public final Object q(Object obj) {
        return this.f1913k.invoke((Object) null, new Object[]{obj});
    }

    public int t() {
        if (this.f1914l == null) {
            this.f1914l = this.f1913k.getParameterTypes();
        }
        return this.f1914l.length;
    }

    public String toString() {
        StringBuilder y = a.y("[method ");
        y.append(i());
        y.append("]");
        return y.toString();
    }

    public b.j.a.c.i u(int i2) {
        Type[] genericParameterTypes = this.f1913k.getGenericParameterTypes();
        if (i2 >= genericParameterTypes.length) {
            return null;
        }
        return this.f1908h.a(genericParameterTypes[i2]);
    }

    public Class<?> v(int i2) {
        if (this.f1914l == null) {
            this.f1914l = this.f1913k.getParameterTypes();
        }
        Class<?>[] clsArr = this.f1914l;
        if (i2 >= clsArr.length) {
            return null;
        }
        return clsArr[i2];
    }

    public Class<?> w() {
        return this.f1913k.getReturnType();
    }
}
