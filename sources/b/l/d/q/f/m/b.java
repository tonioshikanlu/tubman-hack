package b.l.d.q.f.m;

import androidx.core.app.NotificationCompat;
import b.l.d.q.f.g.l0;
import b.l.d.q.f.m.j.a;
import b.l.d.q.f.m.j.c;
import b.l.d.q.f.m.j.e;
import java.util.Objects;
import org.json.JSONObject;

public class b implements h {
    public static long b(l0 l0Var, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(l0Var);
        return (j2 * 1000) + System.currentTimeMillis();
    }

    public e a(l0 l0Var, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        return new e(b(l0Var, (long) optInt2, jSONObject2), new a(jSONObject3.getString(NotificationCompat.CATEGORY_STATUS), jSONObject3.getString("url"), jSONObject3.getString("reports_url"), jSONObject3.getString("ndk_reports_url"), jSONObject3.optBoolean("update_required", false)), new c(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), new b.l.d.q.f.m.j.b(jSONObject2.getJSONObject("features").optBoolean("collect_reports", true)), optInt, optInt2);
    }
}
