package b.o;

import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

public class a2 {
    public OSSubscriptionState a;

    /* renamed from: b  reason: collision with root package name */
    public OSSubscriptionState f6011b;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f6011b.b());
            jSONObject.put("to", this.a.b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
