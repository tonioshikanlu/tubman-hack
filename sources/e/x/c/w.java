package e.x.c;

import e.a.e;
import e.a.g;
import e.a.h;
import e.a.j;
import e.a.m;

public class w {
    public h a(g gVar) {
        return gVar;
    }

    public e b(Class cls) {
        return new d(cls);
    }

    public g c(Class cls, String str) {
        return new o(cls, str);
    }

    public j d(l lVar) {
        return lVar;
    }

    public m e(p pVar) {
        return pVar;
    }

    public String f(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(k kVar) {
        return f(kVar);
    }
}
