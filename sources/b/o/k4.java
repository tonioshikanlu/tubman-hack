package b.o;

import androidx.core.app.NotificationCompat;
import b.o.i2;
import b.o.o3;
import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

public class k4 extends l4 {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f6171l;

    public k4() {
        super(o3.a.PUSH);
    }

    public void e(JSONObject jSONObject) {
    }

    public void h(JSONObject jSONObject) {
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            String str = i2.a;
        }
    }

    public String j() {
        return i2.r();
    }

    public i2.k k() {
        return i2.k.ERROR;
    }

    public f4 r(String str, boolean z) {
        return new i4(str, z);
    }

    public void s(JSONObject jSONObject) {
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            String str = i2.a;
        }
        if (jSONObject.has("identifier")) {
            String str2 = i2.a;
        }
    }

    public void v() {
        l(0).a();
    }

    public void z(String str) {
        i2.d = str;
        if (i2.c != null) {
            b3.h(b3.a, "GT_PLAYER_ID", i2.d);
        }
        synchronized (i2.K) {
            if (i2.K.size() != 0) {
                new Thread(new j2(), "OS_GETTAGS_CALLBACK").start();
            }
        }
        OSSubscriptionState m2 = i2.m(i2.c);
        boolean z = true;
        String str2 = m2.f7392k;
        if (str != null ? str.equals(str2) : str2 == null) {
            z = false;
        }
        m2.f7392k = str;
        if (z) {
            m2.f7389h.a(m2);
        }
        i2.j jVar = i2.X;
        if (jVar != null) {
            i2.B(jVar.a, jVar.f6141b, jVar.c);
            i2.X = null;
        }
        o3.a().v();
        l0.a(i2.a, str, d.a);
    }
}
