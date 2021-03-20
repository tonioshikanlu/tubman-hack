package e.a.a.a.x0;

import b.q.a.a;
import e.a.a.a.l0;
import e.a.l;
import e.f;
import e.x.c.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public final class d implements InvocationHandler {
    public final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f7623b;
    public final /* synthetic */ f c;
    public final /* synthetic */ b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f7624e;

    public d(Class cls, f fVar, l lVar, f fVar2, l lVar2, b bVar, Map map) {
        this.a = cls;
        this.f7623b = fVar;
        this.c = fVar2;
        this.d = bVar;
        this.f7624e = map;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        f fVar;
        i.d(method, "method");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return this.a;
                    }
                } else if (name.equals("hashCode")) {
                    fVar = this.c;
                }
            } else if (name.equals("toString")) {
                fVar = this.f7623b;
            }
            return fVar.getValue();
        }
        if (i.a(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.d.a(a.U2(objArr)));
        }
        if (this.f7624e.containsKey(name)) {
            return this.f7624e.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(a.g3(objArr));
        sb.append(')');
        throw new l0(sb.toString());
    }
}
