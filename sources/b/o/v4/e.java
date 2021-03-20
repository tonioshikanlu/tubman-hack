package b.o.v4;

import b.o.i1;
import b.o.i2;
import b.o.j1;
import b.o.q3;
import b.o.t2;
import b.o.v4.j.b;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends d {
    public e(j1 j1Var, a aVar, b bVar) {
        super(j1Var, aVar, bVar);
    }

    public void a(String str, int i2, b bVar, t2 t2Var) {
        i2.k kVar = i2.k.ERROR;
        q3 a = q3.a(bVar);
        int ordinal = a.a.ordinal();
        if (ordinal == 0) {
            try {
                JSONObject b2 = a.b();
                b2.put("app_id", str);
                b2.put("device_type", i2);
                b2.put("direct", true);
                this.c.a(b2, t2Var);
            } catch (JSONException e2) {
                Objects.requireNonNull((i1) this.a);
                i2.a(kVar, "Generating direct outcome:JSON Failed.", e2);
            }
        } else if (ordinal == 1) {
            try {
                JSONObject b3 = a.b();
                b3.put("app_id", str);
                b3.put("device_type", i2);
                b3.put("direct", false);
                this.c.a(b3, t2Var);
            } catch (JSONException e3) {
                Objects.requireNonNull((i1) this.a);
                i2.a(kVar, "Generating indirect outcome:JSON Failed.", e3);
            }
        } else if (ordinal == 2) {
            try {
                JSONObject b4 = a.b();
                b4.put("app_id", str);
                b4.put("device_type", i2);
                this.c.a(b4, t2Var);
            } catch (JSONException e4) {
                Objects.requireNonNull((i1) this.a);
                i2.a(kVar, "Generating unattributed outcome:JSON Failed.", e4);
            }
        }
    }
}
