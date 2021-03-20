package b.o;

import b.l.f.x.a.g;
import b.o.c0;
import b.o.l4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class o3 {
    public static HashMap<a, l4> a = new HashMap<>();

    public enum a {
        PUSH,
        EMAIL
    }

    public static h4 a() {
        HashMap<a, l4> hashMap = a;
        a aVar = a.EMAIL;
        if (!hashMap.containsKey(aVar) || a.get(aVar) == null) {
            a.put(aVar, new h4());
        }
        return (h4) a.get(aVar);
    }

    public static k4 b() {
        HashMap<a, l4> hashMap = a;
        a aVar = a.PUSH;
        if (!hashMap.containsKey(aVar) || a.get(aVar) == null) {
            a.put(aVar, new k4());
        }
        return (k4) a.get(aVar);
    }

    public static String c() {
        return b().m();
    }

    public static l4.b d(boolean z) {
        l4.b bVar;
        JSONObject jSONObject;
        k4 b2 = b();
        Objects.requireNonNull(b2);
        if (z) {
            String r = i2.r();
            String q2 = i2.q();
            g.U("players/" + r + "?app_id=" + q2, (String) null, (JSONObject) null, new j4(b2), 60000, "CACHE_KEY_GET_TAGS");
        }
        synchronized (b2.a) {
            boolean z2 = k4.f6171l;
            v g2 = b2.f6182k.g();
            if (!g2.a.has("tags")) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject optJSONObject = g2.a.optJSONObject("tags");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object obj = optJSONObject.get(next);
                        if (!"".equals(obj)) {
                            jSONObject2.put(next, obj);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject = jSONObject2;
            }
            bVar = new l4.b(z2, jSONObject);
        }
        return bVar;
    }

    public static void e(c0.d dVar) {
        b().A(dVar);
        a().A(dVar);
    }

    public static void f(JSONObject jSONObject) {
        k4 b2 = b();
        Objects.requireNonNull(b2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            b2.o().d(jSONObject2, (Set<String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            f4 o2 = b2.o();
            Objects.requireNonNull(o2);
            synchronized (f4.d) {
                JSONObject jSONObject4 = o2.f6099b;
                g.q(jSONObject4, jSONObject3, jSONObject4, (Set<String>) null);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }
}
