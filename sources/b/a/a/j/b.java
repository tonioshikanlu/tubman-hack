package b.a.a.j;

import b.a.a.g.u0;
import b.o.i2;
import b.o.k1;
import e.x.c.i;
import org.json.JSONObject;
import p.a.a.c;

public final class b implements i2.m {
    public void a(k1 k1Var) {
        i.e(k1Var, "notification");
        JSONObject jSONObject = k1Var.a.f6210e;
        String string = jSONObject != null ? jSONObject.getString("event") : null;
        if (string != null && i.a(string, "app.updated")) {
            c.b().g(new u0(true));
        }
    }
}
