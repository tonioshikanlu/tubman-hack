package b.o;

import android.content.Context;
import org.json.JSONObject;

public class t1 implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public o1<Object, t1> f6294h = new o1<>("changed", false);

    /* renamed from: i  reason: collision with root package name */
    public boolean f6295i;

    public t1(boolean z) {
        if (z) {
            this.f6295i = b3.b(b3.a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            a();
        }
    }

    public void a() {
        Context context = i2.c;
        boolean a = f2.a();
        boolean z = this.f6295i != a;
        this.f6295i = a;
        if (z) {
            this.f6294h.a(this);
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f6295i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        return b().toString();
    }
}
