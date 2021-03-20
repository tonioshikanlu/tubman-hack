package e.a.a.a.y0.b.d1.b;

import b.e.a.a.a;
import e.a.a.a.y0.d.a.d0.f;
import e.a.a.a.y0.d.a.d0.v;
import e.x.c.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class h extends d0 implements f {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f8295b;

    public h(Type type) {
        Type type2;
        String str;
        d0 d0Var;
        i.e(type, "reflectType");
        this.f8295b = type;
        if (type instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type).getGenericComponentType();
            str = "genericComponentType";
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    type2 = cls.getComponentType();
                    str = "getComponentType()";
                }
            }
            StringBuilder y = a.y("Not an array type (");
            y.append(type.getClass());
            y.append("): ");
            y.append(type);
            throw new IllegalArgumentException(y.toString());
        }
        i.d(type2, str);
        i.e(type2, "type");
        boolean z = type2 instanceof Class;
        if (z) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                d0Var = new c0(cls2);
                this.a = d0Var;
            }
        }
        d0Var = ((type2 instanceof GenericArrayType) || (z && ((Class) type2).isArray())) ? new h(type2) : type2 instanceof WildcardType ? new g0((WildcardType) type2) : new s(type2);
        this.a = d0Var;
    }

    public Type Q() {
        return this.f8295b;
    }

    public v v() {
        return this.a;
    }
}
