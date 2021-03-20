package b.o;

import b.o.i2;
import com.segment.analytics.AnalyticsContext;
import org.json.JSONException;
import org.json.JSONObject;

public class o4 extends l3 {
    public final /* synthetic */ JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6222b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l4 d;

    public o4(l4 l4Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.d = l4Var;
        this.a = jSONObject;
        this.f6222b = jSONObject2;
        this.c = str;
    }

    public void a(int i2, String str, Throwable th) {
        synchronized (this.d.a) {
            this.d.f6180i = false;
            i2.k kVar = i2.k.WARN;
            i2.a(kVar, "Failed last request. statusCode: " + i2 + "\nresponse: " + str, (Throwable) null);
            if (l4.a(this.d, i2, str, "not a valid device_type")) {
                l4.c(this.d);
            } else {
                l4.d(this.d, i2);
            }
        }
    }

    public void b(String str) {
        String str2;
        i2.k kVar = i2.k.INFO;
        synchronized (this.d.a) {
            l4 l4Var = this.d;
            l4Var.f6180i = false;
            l4Var.f6181j.l(this.a, this.f6222b);
            try {
                i2.a(i2.k.DEBUG, "doCreateOrNewSession:response: " + str, (Throwable) null);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(AnalyticsContext.Device.DEVICE_ID_KEY)) {
                    String optString = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY);
                    this.d.z(optString);
                    str2 = "Device registered, UserId = " + optString;
                } else {
                    str2 = "session sent, UserId = " + this.c;
                }
                i2.a(kVar, str2, (Throwable) null);
                this.d.o().m("session", Boolean.FALSE);
                this.d.o().k();
                if (jSONObject.has("in_app_messages")) {
                    i2.p().v(jSONObject.getJSONArray("in_app_messages"));
                }
                this.d.s(this.f6222b);
            } catch (JSONException e2) {
                i2.a(i2.k.ERROR, "ERROR parsing on_session or create JSON Response.", e2);
            }
        }
    }
}
