package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.a;
import e.a.a.a.y0.d.a.d0.b;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.f.d;
import e.a.e;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c extends u implements a {
    public final Annotation a;

    public c(Annotation annotation) {
        i.e(annotation, "annotation");
        this.a = annotation;
    }

    public Collection<b> a() {
        Method[] declaredMethods = b.q.a.a.L0(b.q.a.a.t0(this.a)).getDeclaredMethods();
        i.d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object invoke = method.invoke(this.a, new Object[0]);
            i.d(invoke, "method.invoke(annotation)");
            i.d(method, "method");
            d l2 = d.l(method.getName());
            i.e(invoke, "value");
            Class<?> cls = invoke.getClass();
            List<e<? extends Object>> list = b.a;
            i.e(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new v(l2, (Enum) invoke) : invoke instanceof Annotation ? new e(l2, (Annotation) invoke) : invoke instanceof Object[] ? new g(l2, (Object[]) invoke) : invoke instanceof Class ? new r(l2, (Class) invoke) : new x(l2, invoke));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(this.a, ((c) obj).a);
    }

    public e.a.a.a.y0.f.a g() {
        return b.b(b.q.a.a.L0(b.q.a.a.t0(this.a)));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean j() {
        return false;
    }

    public g o() {
        return new q(b.q.a.a.L0(b.q.a.a.t0(this.a)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(c.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
