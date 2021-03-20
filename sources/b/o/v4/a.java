package b.o.v4;

import b.o.b3;
import b.o.j1;
import b.o.u4.f.b;
import b.o.y2;
import b.o.z1;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public class a {
    public j1 a;

    /* renamed from: b  reason: collision with root package name */
    public y2 f6331b;
    public z1 c;

    public a(j1 j1Var, y2 y2Var, z1 z1Var) {
        this.a = j1Var;
        this.f6331b = y2Var;
        this.c = z1Var;
    }

    public final void a(List<b.o.v4.j.a> list, JSONArray jSONArray, b bVar) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    list.add(new b.o.v4.j.a(jSONArray.getString(i2), bVar));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public boolean b() {
        z1 z1Var = this.c;
        Objects.requireNonNull(z1Var);
        String str = b3.a;
        Objects.requireNonNull(this.c);
        Objects.requireNonNull(z1Var);
        return b3.b(str, "PREFS_OS_OUTCOMES_V2", false);
    }
}
