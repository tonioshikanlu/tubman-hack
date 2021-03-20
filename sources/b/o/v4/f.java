package b.o.v4;

import b.l.f.x.a.g;
import b.o.m3;
import b.o.n3;
import b.o.r2;
import b.o.t2;
import java.util.Objects;
import org.json.JSONObject;

public class f extends b {
    public f(r2 r2Var) {
        super(r2Var);
    }

    public void a(JSONObject jSONObject, t2 t2Var) {
        n3 n3Var = (n3) this.a;
        Objects.requireNonNull(n3Var);
        g.a0("outcomes/measure", jSONObject, new m3(n3Var, t2Var));
    }
}
