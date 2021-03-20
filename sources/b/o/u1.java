package b.o;

import org.json.JSONObject;

public class u1 {
    public t1 a;

    /* renamed from: b  reason: collision with root package name */
    public t1 f6311b;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f6311b.b());
            jSONObject.put("to", this.a.b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
