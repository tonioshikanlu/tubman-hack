package e.a.a.a.y0.a;

import b.q.a.a;
import e.a.a.a.y0.a.g;
import e.a.a.a.y0.a.o.a;
import e.a.a.a.y0.a.o.b;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.a1.j;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.t.x;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.m.y0;
import e.t.g;
import e.t.p;
import e.x.c.i;
import java.util.ArrayList;
import java.util.List;

public final class f {
    public static final k0 a(g gVar, h hVar, d0 d0Var, List<? extends d0> list, List<d> list2, d0 d0Var2, boolean z) {
        e eVar;
        h hVar2;
        d dVar;
        g gVar2 = gVar;
        h hVar3 = hVar;
        List<? extends d0> list3 = list;
        List<d> list4 = list2;
        d0 d0Var3 = d0Var2;
        i.e(gVar2, "builtIns");
        i.e(hVar3, "annotations");
        i.e(list3, "parameterTypes");
        i.e(d0Var3, "returnType");
        i.e(list3, "parameterTypes");
        i.e(d0Var3, "returnType");
        i.e(gVar2, "builtIns");
        int i2 = 0;
        ArrayList arrayList = new ArrayList(list.size() + (d0Var != null ? 1 : 0) + 1);
        c.e(arrayList, d0Var != null ? c.j(d0Var) : null);
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                d0 d0Var4 = (d0) next;
                if (list4 == null || (dVar = list4.get(i2)) == null || dVar.f9211i) {
                    dVar = null;
                }
                if (dVar != null) {
                    b bVar = g.f7647k.x;
                    i.d(bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
                    d l2 = d.l("name");
                    String e2 = dVar.e();
                    i.d(e2, "name.asString()");
                    d0Var4 = c.Y(d0Var4, h.f7785e.a(g.H(d0Var4.k(), new j(gVar2, bVar, a.r2(new e.j(l2, new x(e2)))))));
                }
                arrayList.add(c.j(d0Var4));
                i2 = i3;
            } else {
                g.S();
                throw null;
            }
        }
        arrayList.add(c.j(d0Var2));
        int size = list.size();
        if (d0Var != null) {
            size++;
        }
        i.e(gVar2, "builtIns");
        if (z) {
            eVar = gVar2.x(size);
        } else {
            eVar = gVar2.j(g.m(size));
        }
        i.d(eVar, "if (isSuspendFunction) b…tFunction(parameterCount)");
        if (d0Var != null) {
            i.e(hVar3, "$this$withExtensionFunctionAnnotation");
            i.e(gVar2, "builtIns");
            g.d dVar2 = g.f7647k;
            b bVar2 = dVar2.w;
            i.d(bVar2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (!hVar3.x(bVar2)) {
                h.a aVar = h.f7785e;
                b bVar3 = dVar2.w;
                i.d(bVar3, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                hVar2 = aVar.a(e.t.g.H(hVar3, new j(gVar2, bVar3, p.f7935h)));
                return e0.e(hVar2, eVar, arrayList);
            }
        }
        hVar2 = hVar3;
        return e0.e(hVar2, eVar, arrayList);
    }

    public static final d b(d0 d0Var) {
        String str;
        i.e(d0Var, "$this$extractParameterNameFromFunctionTypeArgument");
        h k2 = d0Var.k();
        b bVar = g.f7647k.x;
        i.d(bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
        e.a.a.a.y0.b.a1.c i2 = k2.i(bVar);
        if (i2 != null) {
            Object P = e.t.g.P(i2.a().values());
            if (!(P instanceof x)) {
                P = null;
            }
            x xVar = (x) P;
            if (!(xVar == null || (str = (String) xVar.a) == null)) {
                if (!d.m(str)) {
                    str = null;
                }
                if (str != null) {
                    return d.l(str);
                }
            }
        }
        return null;
    }

    public static final b.c c(k kVar) {
        i.e(kVar, "$this$getFunctionalClassKind");
        if (!(kVar instanceof e) || !g.N(kVar)) {
            return null;
        }
        e.a.a.a.y0.f.c i2 = e.a.a.a.y0.j.v.b.i(kVar);
        if (!i2.f() || i2.e()) {
            return null;
        }
        a.C0137a aVar = e.a.a.a.y0.a.o.a.c;
        String e2 = i2.h().e();
        i.d(e2, "shortName().asString()");
        e.a.a.a.y0.f.b e3 = i2.i().e();
        i.d(e3, "toSafe().parent()");
        i.e(e2, "className");
        i.e(e3, "packageFqName");
        a.b a = aVar.a(e2, e3);
        if (a != null) {
            return a.a;
        }
        return null;
    }

    public static final d0 d(d0 d0Var) {
        i.e(d0Var, "$this$getReceiverTypeFromFunctionType");
        g(d0Var);
        if (i(d0Var)) {
            return ((y0) e.t.g.o(d0Var.V0())).d();
        }
        return null;
    }

    public static final d0 e(d0 d0Var) {
        i.e(d0Var, "$this$getReturnTypeFromFunctionType");
        g(d0Var);
        d0 d = ((y0) e.t.g.z(d0Var.V0())).d();
        i.d(d, "arguments.last().type");
        return d;
    }

    public static final List<y0> f(d0 d0Var) {
        i.e(d0Var, "$this$getValueParameterTypesFromFunctionType");
        g(d0Var);
        List<y0> V0 = d0Var.V0();
        i.e(d0Var, "$this$isBuiltinExtensionFunctionalType");
        return V0.subList((!g(d0Var) || !i(d0Var)) ? 0 : 1, V0.size() - 1);
    }

    public static final boolean g(d0 d0Var) {
        i.e(d0Var, "$this$isBuiltinFunctionalType");
        e.a.a.a.y0.b.h d = d0Var.W0().d();
        if (d == null) {
            return false;
        }
        i.e(d, "$this$isBuiltinFunctionalClassDescriptor");
        b.c c = c(d);
        return c == b.c.Function || c == b.c.SuspendFunction;
    }

    public static final boolean h(d0 d0Var) {
        i.e(d0Var, "$this$isSuspendFunctionType");
        e.a.a.a.y0.b.h d = d0Var.W0().d();
        return (d != null ? c(d) : null) == b.c.SuspendFunction;
    }

    public static final boolean i(d0 d0Var) {
        h k2 = d0Var.k();
        e.a.a.a.y0.f.b bVar = g.f7647k.w;
        i.d(bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return k2.i(bVar) != null;
    }
}
