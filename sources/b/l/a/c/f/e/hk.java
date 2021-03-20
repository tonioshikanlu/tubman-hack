package b.l.a.c.f.e;

import b.l.a.c.b.a;
import org.json.JSONObject;

public final class hk implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3047h;

    public hk(String str) {
        a.x(str);
        this.f3047h = str;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", "refresh_token");
        jSONObject.put("refreshToken", this.f3047h);
        return jSONObject.toString();
    }
}
