package b.o.u4;

import androidx.annotation.NonNull;
import b.o.b3;
import b.o.i1;
import b.o.i2;
import b.o.j1;
import b.o.u4.f.a;
import b.o.u4.f.b;
import b.o.u4.f.c;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends a {
    public static final String f = "b.o.u4.d";

    public d(@NonNull c cVar, j1 j1Var) {
        super(cVar, j1Var);
    }

    public void a(@NonNull JSONObject jSONObject, a aVar) {
        if (aVar.f6316b.e()) {
            try {
                jSONObject.put("direct", aVar.f6316b.h());
                jSONObject.put("notification_ids", aVar.c);
            } catch (JSONException e2) {
                Objects.requireNonNull((i1) this.a);
                i2.a(i2.k.ERROR, "Generating notification tracker addSessionData JSONObject ", e2);
            }
        }
    }

    public void b() {
        c cVar = this.f6313b;
        c cVar2 = this.c;
        if (cVar2 == null) {
            cVar2 = c.UNATTRIBUTED;
        }
        Objects.requireNonNull(cVar.a);
        String str = b3.a;
        b3.h(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar2.toString());
        c cVar3 = this.f6313b;
        String str2 = this.f6314e;
        Objects.requireNonNull(cVar3.a);
        b3.h(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str2);
    }

    public int c() {
        Objects.requireNonNull(this.f6313b.a);
        return b3.c(b3.a, "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public b d() {
        return b.NOTIFICATION;
    }

    public String f() {
        return "notification_id";
    }

    public int g() {
        Objects.requireNonNull(this.f6313b.a);
        return b3.c(b3.a, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public JSONArray h() {
        JSONArray jSONArray;
        Objects.requireNonNull(this.f6313b.a);
        String f2 = b3.f(b3.a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        if (f2 == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    public JSONArray i(String str) {
        try {
            return h();
        } catch (JSONException e2) {
            Objects.requireNonNull((i1) this.a);
            i2.a(i2.k.ERROR, "Generating Notification tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    public void k() {
        Objects.requireNonNull(this.f6313b.a);
        String str = b3.a;
        c d = c.d(b3.f(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", c.UNATTRIBUTED.toString()));
        this.c = d;
        if (d.j()) {
            this.d = j();
        } else if (d.h()) {
            Objects.requireNonNull(this.f6313b.a);
            this.f6314e = b3.f(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", (String) null);
        }
        j1 j1Var = this.a;
        StringBuilder y = b.e.a.a.a.y("OneSignal NotificationTracker initInfluencedTypeFromCache: ");
        y.append(toString());
        ((i1) j1Var).a(y.toString());
    }

    public void m(JSONArray jSONArray) {
        Objects.requireNonNull(this.f6313b.a);
        b3.h(b3.a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
