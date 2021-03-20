package b.j.a.c;

import b.j.a.b.v.a;
import b.j.a.c.i0.m;
import b.j.a.c.i0.n;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class i extends a implements Serializable, Type {

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f2152h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2153i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2154j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f2155k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2156l;

    public i(Class<?> cls, int i2, Object obj, Object obj2, boolean z) {
        this.f2152h = cls;
        this.f2153i = cls.getName().hashCode() + i2;
        this.f2154j = obj;
        this.f2155k = obj2;
        this.f2156l = z;
    }

    public abstract boolean A();

    public final boolean B() {
        return this.f2152h.isEnum();
    }

    public final boolean D() {
        return Modifier.isFinal(this.f2152h.getModifiers());
    }

    public final boolean E() {
        return this.f2152h.isInterface();
    }

    public final boolean F() {
        return this.f2152h == Object.class;
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        return this.f2152h.isPrimitive();
    }

    public final boolean I(Class<?> cls) {
        Class<?> cls2 = this.f2152h;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean J(Class<?> cls) {
        Class<?> cls2 = this.f2152h;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract i K(Class<?> cls, m mVar, i iVar, i[] iVarArr);

    public abstract i L(i iVar);

    public abstract i M(Object obj);

    public abstract i N(Object obj);

    public i O(i iVar) {
        Object obj = iVar.f2155k;
        i Q = obj != this.f2155k ? Q(obj) : this;
        Object obj2 = iVar.f2154j;
        return obj2 != this.f2154j ? Q.R(obj2) : Q;
    }

    public abstract i P();

    public abstract i Q(Object obj);

    public abstract i R(Object obj);

    public abstract boolean equals(Object obj);

    public abstract i f(int i2);

    public abstract int g();

    public i h(int i2) {
        i f = f(i2);
        return f == null ? n.o() : f;
    }

    public final int hashCode() {
        return this.f2153i;
    }

    public abstract i i(Class<?> cls);

    public abstract m j();

    public i k() {
        return null;
    }

    public abstract StringBuilder l(StringBuilder sb);

    public abstract List<i> m();

    public i n() {
        return null;
    }

    /* renamed from: o */
    public i a() {
        return null;
    }

    public abstract i q();

    public boolean r() {
        return true;
    }

    public boolean t() {
        return g() > 0;
    }

    public abstract String toString();

    public boolean u() {
        return (this.f2155k == null && this.f2154j == null) ? false : true;
    }

    public final boolean v(Class<?> cls) {
        return this.f2152h == cls;
    }

    public boolean w() {
        return Modifier.isAbstract(this.f2152h.getModifiers());
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        if ((this.f2152h.getModifiers() & 1536) == 0) {
            return true;
        }
        return this.f2152h.isPrimitive();
    }
}
