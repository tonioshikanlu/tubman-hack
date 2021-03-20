package b.o.v4.j;

import androidx.annotation.Nullable;
import b.e.a.a.a;
import org.json.JSONArray;

public class d {
    @Nullable
    public JSONArray a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f6337b;

    public d() {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        this.a = jSONArray;
        this.f6337b = jSONArray2;
    }

    public String toString() {
        StringBuilder y = a.y("OSOutcomeSourceBody{notificationIds=");
        y.append(this.a);
        y.append(", inAppMessagesIds=");
        y.append(this.f6337b);
        y.append('}');
        return y.toString();
    }
}
