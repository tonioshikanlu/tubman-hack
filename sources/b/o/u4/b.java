package b.o.u4;

import androidx.annotation.NonNull;
import b.o.b3;
import b.o.i1;
import b.o.i2;
import b.o.j1;
import b.o.u4.f.a;
import b.o.u4.f.c;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends a {
    public static final String f = "b.o.u4.b";

    public b(@NonNull c cVar, j1 j1Var) {
        super(cVar, j1Var);
    }

    public void a(@NonNull JSONObject jSONObject, a aVar) {
    }

    public void b() {
        c cVar = this.c;
        if (cVar == null) {
            cVar = c.UNATTRIBUTED;
        }
        c cVar2 = this.f6313b;
        if (cVar == c.DIRECT) {
            cVar = c.INDIRECT;
        }
        Objects.requireNonNull(cVar2.a);
        b3.h(b3.a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
    }

    public int c() {
        Objects.requireNonNull(this.f6313b.a);
        return b3.c(b3.a, "PREFS_OS_IAM_LIMIT", 10);
    }

    public b.o.u4.f.b d() {
        return b.o.u4.f.b.IAM;
    }

    public String f() {
        return "iam_id";
    }

    public int g() {
        Objects.requireNonNull(this.f6313b.a);
        return b3.c(b3.a, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public JSONArray h() {
        JSONArray jSONArray;
        Objects.requireNonNull(this.f6313b.a);
        String f2 = b3.f(b3.a, "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        if (f2 == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    public JSONArray i(String str) {
        i2.k kVar = i2.k.ERROR;
        try {
            JSONArray h2 = h();
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < h2.length(); i2++) {
                    if (!str.equals(h2.getJSONObject(i2).getString("iam_id"))) {
                        jSONArray.put(h2.getJSONObject(i2));
                    }
                }
                return jSONArray;
            } catch (JSONException e2) {
                Objects.requireNonNull((i1) this.a);
                i2.a(kVar, "Before KITKAT API, Generating tracker lastChannelObjectReceived get JSONObject ", e2);
                return h2;
            }
        } catch (JSONException e3) {
            Objects.requireNonNull((i1) this.a);
            i2.a(kVar, "Generating IAM tracker getLastChannelObjects JSONObject ", e3);
            return new JSONArray();
        }
    }

    public void k() {
        Objects.requireNonNull(this.f6313b.a);
        c d = c.d(b3.f(b3.a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", c.UNATTRIBUTED.toString()));
        this.c = d;
        if (d != null && d.j()) {
            this.d = j();
        }
        j1 j1Var = this.a;
        StringBuilder y = b.e.a.a.a.y("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ");
        y.append(toString());
        ((i1) j1Var).a(y.toString());
    }

    public void m(JSONArray jSONArray) {
        Objects.requireNonNull(this.f6313b.a);
        b3.h(b3.a, "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }
}
