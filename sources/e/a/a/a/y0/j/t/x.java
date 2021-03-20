package e.a.a.a.y0.j.t;

import b.e.a.a.a;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.c.i;

public final class x extends g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        i.e(str, "value");
    }

    public d0 a(w wVar) {
        i.e(wVar, "module");
        k0 w = wVar.v().w();
        i.d(w, "module.builtIns.stringType");
        return w;
    }

    public String toString() {
        return a.p(a.v('\"'), (String) this.a, '\"');
    }
}
