package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.n;
import e.a.a.a.y0.d.a.d0.v;
import e.x.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class w extends y implements n {
    public final Field a;

    public w(Field field) {
        i.e(field, "member");
        this.a = field;
    }

    public boolean A() {
        return this.a.isEnumConstant();
    }

    public boolean M() {
        return false;
    }

    public v d() {
        Type genericType = this.a.getGenericType();
        i.d(genericType, "member.genericType");
        i.e(genericType, "type");
        boolean z = genericType instanceof Class;
        if (z) {
            Class cls = (Class) genericType;
            if (cls.isPrimitive()) {
                return new c0(cls);
            }
        }
        return ((genericType instanceof GenericArrayType) || (z && ((Class) genericType).isArray())) ? new h(genericType) : genericType instanceof WildcardType ? new g0((WildcardType) genericType) : new s(genericType);
    }

    public Member t() {
        return this.a;
    }
}
