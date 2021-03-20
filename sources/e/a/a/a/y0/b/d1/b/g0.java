package e.a.a.a.y0.b.d1.b;

import b.q.a.a;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.d.a.d0.z;
import e.x.c.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class g0 extends d0 implements z {
    public final WildcardType a;

    public g0(WildcardType wildcardType) {
        i.e(wildcardType, "reflectType");
        this.a = wildcardType;
    }

    public boolean H() {
        Type[] upperBounds = this.a.getUpperBounds();
        i.d(upperBounds, "reflectType.upperBounds");
        return !i.a((Type) a.q0(upperBounds), Object.class);
    }

    public Type Q() {
        return this.a;
    }

    public v t() {
        v hVar;
        c0 c0Var;
        Type[] upperBounds = this.a.getUpperBounds();
        Type[] lowerBounds = this.a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder y = b.e.a.a.a.y("Wildcard types with many bounds are not yet supported: ");
            y.append(this.a);
            throw new UnsupportedOperationException(y.toString());
        }
        if (lowerBounds.length == 1) {
            i.d(lowerBounds, "lowerBounds");
            Object U2 = a.U2(lowerBounds);
            i.d(U2, "lowerBounds.single()");
            Type type = (Type) U2;
            i.e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c0Var = new c0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                hVar = new h(type);
                return hVar;
            }
            hVar = type instanceof WildcardType ? new g0((WildcardType) type) : new s(type);
            return hVar;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            i.d(upperBounds, "upperBounds");
            Type type2 = (Type) a.U2(upperBounds);
            if (!(!i.a(type2, Object.class))) {
                return null;
            }
            i.d(type2, "ub");
            i.e(type2, "type");
            boolean z2 = type2 instanceof Class;
            if (z2) {
                Class cls2 = (Class) type2;
                if (cls2.isPrimitive()) {
                    c0Var = new c0(cls2);
                }
            }
            if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                hVar = new h(type2);
                return hVar;
            }
            hVar = type2 instanceof WildcardType ? new g0((WildcardType) type2) : new s(type2);
            return hVar;
        }
        return c0Var;
    }
}
