package e.a.a.a.y0.m;

import e.x.c.i;
import java.util.Map;

public final class w0 extends x0 {
    public final /* synthetic */ Map c;
    public final /* synthetic */ boolean d;

    public w0(Map map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public boolean a() {
        return this.d;
    }

    public boolean f() {
        return this.c.isEmpty();
    }

    public y0 h(v0 v0Var) {
        i.e(v0Var, "key");
        return (y0) this.c.get(v0Var);
    }
}
