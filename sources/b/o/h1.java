package b.o;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import org.json.JSONArray;
import org.json.JSONObject;

public class h1 {
    public JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f6109b;

    public h1(@NonNull JSONObject jSONObject) {
        JSONArray jSONArray = null;
        this.a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f6109b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : jSONArray;
    }

    public String toString() {
        StringBuilder y = a.y("OSInAppMessageTag{adds=");
        y.append(this.a);
        y.append(", removes=");
        y.append(this.f6109b);
        y.append('}');
        return y.toString();
    }
}
