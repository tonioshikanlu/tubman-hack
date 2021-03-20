package e.a.a.a.y0.b.d1.b;

import b.e.a.a.a;
import e.a.a.a.y0.d.a.d0.i;
import e.a.a.a.y0.d.a.d0.j;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.f.b;
import e.t.o;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class s extends d0 implements j {
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f8305b;

    public s(Type type) {
        i iVar;
        e.x.c.i.e(type, "reflectType");
        this.f8305b = type;
        if (type instanceof Class) {
            iVar = new q((Class) type);
        } else if (type instanceof TypeVariable) {
            iVar = new e0((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new q((Class) rawType);
        } else {
            StringBuilder y = a.y("Not a classifier type (");
            y.append(type.getClass());
            y.append("): ");
            y.append(type);
            throw new IllegalStateException(y.toString());
        }
        this.a = iVar;
    }

    public String C() {
        return this.f8305b.toString();
    }

    public boolean O() {
        Type type = this.f8305b;
        if (!(type instanceof Class)) {
            return false;
        }
        return (((Class) type).getTypeParameters().length == 0) ^ true;
    }

    public String P() {
        StringBuilder y = a.y("Type not found: ");
        y.append(this.f8305b);
        throw new UnsupportedOperationException(y.toString());
    }

    public Type Q() {
        return this.f8305b;
    }

    public i b() {
        return this.a;
    }

    public e.a.a.a.y0.d.a.d0.a i(b bVar) {
        e.x.c.i.e(bVar, "fqName");
        return null;
    }

    public Collection<e.a.a.a.y0.d.a.d0.a> k() {
        return o.f7934h;
    }

    public boolean u() {
        return false;
    }

    public List<v> y() {
        Object obj;
        List<Type> d = b.d(this.f8305b);
        ArrayList arrayList = new ArrayList(b.q.a.a.C(d, 10));
        for (Type type : d) {
            e.x.c.i.e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    obj = new c0(cls);
                    arrayList.add(obj);
                }
            }
            obj = ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new h(type) : type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
            arrayList.add(obj);
        }
        return arrayList;
    }
}
