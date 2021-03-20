package e.a.a.a.y0.b.d1.b;

import b.q.a.a;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.d.a.d0.a0;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.j;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.b0.s;
import e.t.o;
import e.x.c.i;
import e.x.c.x;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class q extends u implements f, a0, g {
    public final Class<?> a;

    public q(Class<?> cls) {
        i.e(cls, "klass");
        this.a = cls;
    }

    public List<e0> B() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new e0(e0Var));
        }
        return arrayList;
    }

    public boolean E() {
        return this.a.isAnnotation();
    }

    public boolean F() {
        return this.a.isInterface();
    }

    public a0 G() {
        return null;
    }

    public Collection I() {
        Class[] declaredClasses = this.a.getDeclaredClasses();
        i.d(declaredClasses, "klass.declaredClasses");
        return s.j(s.h(s.d(a.s(declaredClasses), m.f8300h), n.f8301h));
    }

    public Collection K() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        i.d(declaredMethods, "klass.declaredMethods");
        return s.j(s.g(s.c(a.s(declaredMethods), new o(this)), p.f8303q));
    }

    public boolean L() {
        return false;
    }

    public boolean c() {
        return Modifier.isAbstract(x());
    }

    public b e() {
        b b2 = b.b(this.a).b();
        i.d(b2, "klass.classId.asSingleFqName()");
        return b2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && i.a(this.a, ((q) obj).a);
    }

    public d getName() {
        d l2 = d.l(this.a.getSimpleName());
        i.d(l2, "Name.identifier(klass.simpleName)");
        return l2;
    }

    public z0 getVisibility() {
        return a.m1(this);
    }

    public Collection<j> h() {
        Type type = Object.class;
        if (i.a(this.a, type)) {
            return o.f7934h;
        }
        x xVar = new x(2);
        Type genericSuperclass = this.a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        xVar.a.add(type);
        Type[] genericInterfaces = this.a.getGenericInterfaces();
        i.d(genericInterfaces, "klass.genericInterfaces");
        xVar.a(genericInterfaces);
        List<Type> B = e.t.g.B((Type[]) xVar.a.toArray(new Type[xVar.b()]));
        ArrayList arrayList = new ArrayList(a.C(B, 10));
        for (Type sVar : B) {
            arrayList.add(new s(sVar));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public e.a.a.a.y0.d.a.d0.a i(b bVar) {
        i.e(bVar, "fqName");
        return a.j0(this, bVar);
    }

    public boolean isStatic() {
        return Modifier.isStatic(x());
    }

    public Collection k() {
        return a.v0(this);
    }

    public AnnotatedElement m() {
        return this.a;
    }

    public g p() {
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public Collection r() {
        Constructor[] declaredConstructors = this.a.getDeclaredConstructors();
        i.d(declaredConstructors, "klass.declaredConstructors");
        return s.j(s.g(s.d(a.s(declaredConstructors), i.f8296q), j.f8297q));
    }

    public boolean s() {
        return this.a.isEnum();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(q.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public Collection w() {
        Field[] declaredFields = this.a.getDeclaredFields();
        i.d(declaredFields, "klass.declaredFields");
        return s.j(s.g(s.d(a.s(declaredFields), k.f8298q), l.f8299q));
    }

    public int x() {
        return this.a.getModifiers();
    }

    public boolean z() {
        return Modifier.isFinal(x());
    }
}
