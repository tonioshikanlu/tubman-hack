package b.o;

import b.e.a.a.a;
import org.json.JSONObject;

public class v {
    public final JSONObject a;

    public v() {
        this.a = new JSONObject();
    }

    public v(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public String toString() {
        StringBuilder y = a.y("ImmutableJSONObject{jsonObject=");
        y.append(this.a);
        y.append('}');
        return y.toString();
    }
}
