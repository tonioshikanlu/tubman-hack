package e.a.a.a.y0.b.d1.b;

import b.e.a.a.a;
import e.a.a.a.y0.d.a.d0.k;
import e.a.a.a.y0.d.a.d0.y;
import e.t.g;
import e.t.o;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class t extends y implements k {
    public final Constructor<?> a;

    public t(Constructor<?> constructor) {
        i.e(constructor, "member");
        this.a = constructor;
    }

    public List<e0> B() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new e0(e0Var));
        }
        return arrayList;
    }

    public List<y> n() {
        Type[] genericParameterTypes = this.a.getGenericParameterTypes();
        i.d(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return o.f7934h;
        }
        Class<?> declaringClass = this.a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) g.i(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                i.d(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) g.i(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            i.d(genericParameterTypes, "realTypes");
            i.d(parameterAnnotations, "realAnnotations");
            return v(genericParameterTypes, parameterAnnotations, this.a.isVarArgs());
        }
        StringBuilder y = a.y("Illegal generic signature: ");
        y.append(this.a);
        throw new IllegalStateException(y.toString());
    }

    public Member t() {
        return this.a;
    }
}
