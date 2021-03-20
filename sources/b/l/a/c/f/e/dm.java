package b.l.a.c.f.e;

import b.l.a.c.b.a;
import org.json.JSONObject;

public final class dm implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f2932h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2933i;

    public dm(String str, String str2) {
        a.x(str);
        this.f2932h = str;
        a.x(str2);
        this.f2933i = str2;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f2932h);
        jSONObject.put("mfaEnrollmentId", this.f2933i);
        return jSONObject.toString();
    }
}
