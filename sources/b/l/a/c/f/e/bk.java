package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import b.l.a.c.c.n.a;
import b.l.d.o.b;
import b.l.d.o.d;
import org.json.JSONObject;

public final class bk implements aj {

    /* renamed from: h  reason: collision with root package name */
    public final String f2866h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2867i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final String f2868j;

    static {
        new a(bk.class.getSimpleName(), new String[0]);
    }

    public bk(d dVar, @Nullable String str) {
        String str2 = dVar.f4946h;
        b.l.a.c.b.a.x(str2);
        this.f2866h = str2;
        String str3 = dVar.f4948j;
        b.l.a.c.b.a.x(str3);
        this.f2867i = str3;
        this.f2868j = str;
    }

    public final String a() {
        b bVar;
        String str = this.f2867i;
        int i2 = b.f4939e;
        b.l.a.c.b.a.x(str);
        String str2 = null;
        try {
            bVar = new b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        String str3 = bVar != null ? bVar.f4940b : null;
        if (bVar != null) {
            str2 = bVar.d;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f2866h);
        if (str3 != null) {
            jSONObject.put("oobCode", str3);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str4 = this.f2868j;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
