package e.a;

import e.x.b.l;
import e.x.c.h;
import e.x.c.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class r implements ParameterizedType, Type {

    /* renamed from: h  reason: collision with root package name */
    public final Type[] f7873h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f7874i;

    /* renamed from: j  reason: collision with root package name */
    public final Type f7875j;

    public static final /* synthetic */ class a extends h implements l<Type, String> {

        /* renamed from: q  reason: collision with root package name */
        public static final a f7876q = new a();

        public a() {
            super(1, u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        public Object invoke(Object obj) {
            Type type = (Type) obj;
            i.e(type, "p1");
            return u.a(type);
        }
    }

    public r(Class<?> cls, Type type, List<? extends Type> list) {
        i.e(cls, "rawType");
        i.e(list, "typeArguments");
        this.f7874i = cls;
        this.f7875j = type;
        Object[] array = list.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f7873h = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return i.a(this.f7874i, parameterizedType.getRawType()) && i.a(this.f7875j, parameterizedType.getOwnerType()) && Arrays.equals(this.f7873h, parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f7873h;
    }

    public Type getOwnerType() {
        return this.f7875j;
    }

    public Type getRawType() {
        return this.f7874i;
    }

    public String getTypeName() {
        String str;
        StringBuilder sb = new StringBuilder();
        Type type = this.f7875j;
        if (type != null) {
            sb.append(u.a(type));
            sb.append("$");
            str = this.f7874i.getSimpleName();
        } else {
            str = u.a(this.f7874i);
        }
        sb.append(str);
        Type[] typeArr = this.f7873h;
        if (!(typeArr.length == 0)) {
            b.q.a.a.d2(typeArr, sb, ", ", "<", ">", -1, "...", a.f7876q);
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f7874i.hashCode();
        Type type = this.f7875j;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f7873h);
    }

    public String toString() {
        return getTypeName();
    }
}
