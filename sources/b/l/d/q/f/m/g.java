package b.l.d.q.f.m;

import b.l.d.q.f.g.l0;
import b.l.d.q.f.m.j.e;
import org.json.JSONObject;

public class g {
    public final l0 a;

    public g(l0 l0Var) {
        this.a = l0Var;
    }

    public e a(JSONObject jSONObject) {
        return (jSONObject.getInt("settings_version") != 3 ? new b() : new i()).a(this.a, jSONObject);
    }
}
