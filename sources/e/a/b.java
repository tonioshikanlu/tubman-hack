package e.a;

import e.x.c.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class b implements GenericArrayType, Type {

    /* renamed from: h  reason: collision with root package name */
    public final Type f7863h;

    public b(Type type) {
        i.e(type, "elementType");
        this.f7863h = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && i.a(this.f7863h, ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f7863h;
    }

    public String getTypeName() {
        return u.a(this.f7863h) + "[]";
    }

    public int hashCode() {
        return this.f7863h.hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
