package b.o.v4;

import b.o.i1;
import b.o.i2;
import b.o.j1;
import b.o.t2;
import b.o.v4.j.b;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends d {
    public g(j1 j1Var, a aVar, b bVar) {
        super(j1Var, aVar, bVar);
    }

    public void a(String str, int i2, b bVar, t2 t2Var) {
        try {
            JSONObject a = bVar.a();
            a.put("app_id", str);
            a.put("device_type", i2);
            this.c.a(a, t2Var);
        } catch (JSONException e2) {
            Objects.requireNonNull((i1) this.a);
            i2.a(i2.k.ERROR, "Generating indirect outcome:JSON Failed.", e2);
        }
    }
}
