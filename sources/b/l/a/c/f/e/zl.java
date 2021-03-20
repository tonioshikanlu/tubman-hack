package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class zl implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f3444h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3445i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3446j;

    public zl(String str, String str2, @Nullable String str3) {
        a.x(str);
        this.f3444h = str;
        a.x(str2);
        this.f3445i = str2;
        this.f3446j = str3;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f3444h);
        jSONObject.put("password", this.f3445i);
        jSONObject.put("returnSecureToken", true);
        String str = this.f3446j;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
