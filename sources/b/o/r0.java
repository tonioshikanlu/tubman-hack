package b.o;

import org.json.JSONObject;

public class r0 implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public o1<Object, r0> f6263h = new o1<>("changed", false);

    /* renamed from: i  reason: collision with root package name */
    public String f6264i;

    /* renamed from: j  reason: collision with root package name */
    public String f6265j;

    public r0(boolean z) {
        String str;
        if (z) {
            String str2 = b3.a;
            this.f6264i = b3.f(str2, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            str = b3.f(str2, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
        } else {
            this.f6264i = i2.n();
            str = o3.a().m();
        }
        this.f6265j = str;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f6264i;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            Object obj2 = this.f6265j;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("emailAddress", obj2);
            jSONObject.put("subscribed", (this.f6264i == null || this.f6265j == null) ? false : true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
