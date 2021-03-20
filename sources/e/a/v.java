package e.a;

import e.x.c.i;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v implements WildcardType, Type {

    /* renamed from: j  reason: collision with root package name */
    public static final v f7879j = new v((Type) null, (Type) null);

    /* renamed from: k  reason: collision with root package name */
    public static final a f7880k = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final Type f7881h;

    /* renamed from: i  reason: collision with root package name */
    public final Type f7882i;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public v(Type type, Type type2) {
        this.f7881h = type;
        this.f7882i = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    public Type[] getLowerBounds() {
        Type type = this.f7882i;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        Type type;
        StringBuilder sb;
        if (this.f7882i != null) {
            sb = b.e.a.a.a.y("? super ");
            type = this.f7882i;
        } else {
            Type type2 = this.f7881h;
            if (type2 == null || !(!i.a(type2, Object.class))) {
                return "?";
            }
            sb = b.e.a.a.a.y("? extends ");
            type = this.f7881h;
        }
        sb.append(u.a(type));
        return sb.toString();
    }

    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f7881h;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
