package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import com.segment.analytics.AnalyticsContext;
import org.json.JSONObject;

public final class vl implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3361h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final String f3362i;

    public vl(String str, @Nullable String str2) {
        a.x(str);
        this.f3361h = str;
        this.f3362i = str2;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsContext.Device.DEVICE_TOKEN_KEY, this.f3361h);
        jSONObject.put("returnSecureToken", true);
        String str = this.f3362i;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
