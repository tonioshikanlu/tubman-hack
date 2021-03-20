package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.b;
import e.a.a.a.y0.d.a.d0.q;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.d.a.d0.y;
import e.a.a.a.y0.f.d;
import e.a.e;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public final class z extends y implements q {
    public final Method a;

    public z(Method method) {
        i.e(method, "member");
        this.a = method;
    }

    public List<e0> B() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        i.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new e0(e0Var));
        }
        return arrayList;
    }

    public b H() {
        Object defaultValue = this.a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        i.e(defaultValue, "value");
        Class<?> cls = defaultValue.getClass();
        List<e<? extends Object>> list = b.a;
        i.e(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
        return Enum.class.isAssignableFrom(cls) ? new v((d) null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new e((d) null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new g((d) null, (Object[]) defaultValue) : defaultValue instanceof Class ? new r((d) null, (Class) defaultValue) : new x((d) null, defaultValue);
    }

    public boolean J() {
        return H() != null;
    }

    public v f() {
        Type genericReturnType = this.a.getGenericReturnType();
        i.d(genericReturnType, "member.genericReturnType");
        i.e(genericReturnType, "type");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new c0(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new h(genericReturnType) : genericReturnType instanceof WildcardType ? new g0((WildcardType) genericReturnType) : new s(genericReturnType);
    }

    public List<y> n() {
        Type[] genericParameterTypes = this.a.getGenericParameterTypes();
        i.d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.a.getParameterAnnotations();
        i.d(parameterAnnotations, "member.parameterAnnotations");
        return v(genericParameterTypes, parameterAnnotations, this.a.isVarArgs());
    }

    public Member t() {
        return this.a;
    }
}
