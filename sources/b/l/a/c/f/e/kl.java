package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import org.json.JSONObject;

public final class kl implements aj {

    /* renamed from: h  reason: collision with root package name */
    public String f3110h;

    /* renamed from: i  reason: collision with root package name */
    public String f3111i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f3112j;

    public kl(@Nullable String str) {
        this.f3112j = str;
    }

    public kl(String str, String str2, @Nullable String str3) {
        a.x(str);
        this.f3110h = str;
        a.x(str2);
        this.f3111i = str2;
        this.f3112j = str3;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f3110h;
        if (str != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
        }
        String str2 = this.f3111i;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f3112j;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
