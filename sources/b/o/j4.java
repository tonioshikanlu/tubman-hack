package b.o;

import b.l.f.x.a.g;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class j4 extends l3 {
    public final /* synthetic */ k4 a;

    public j4(k4 k4Var) {
        this.a = k4Var;
    }

    public void b(String str) {
        JSONObject q2;
        k4.f6171l = true;
        if (str == null || str.isEmpty()) {
            str = "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tags")) {
                synchronized (this.a.a) {
                    k4 k4Var = this.a;
                    JSONObject optJSONObject = k4Var.f6181j.g().a.optJSONObject("tags");
                    JSONObject optJSONObject2 = this.a.n().g().a.optJSONObject("tags");
                    synchronized (k4Var.a) {
                        q2 = g.q(optJSONObject, optJSONObject2, (JSONObject) null, (Set<String>) null);
                    }
                    f4 f4Var = this.a.f6181j;
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("tags");
                    Objects.requireNonNull(f4Var);
                    synchronized (f4.d) {
                        f4Var.c.put("tags", optJSONObject3);
                    }
                    this.a.f6181j.k();
                    this.a.n().i(jSONObject, q2);
                    this.a.n().k();
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
