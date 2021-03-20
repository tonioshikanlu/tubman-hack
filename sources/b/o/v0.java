package b.o;

import org.json.JSONObject;

public class v0 extends JSONObject {
    public final /* synthetic */ String a;

    public v0(u0 u0Var, String str) {
        boolean z;
        int i2;
        this.a = str;
        put("app_id", i2.a);
        put("player_id", i2.r());
        put("variant_id", str);
        boolean z2 = false;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            i2 = 2;
        } else {
            if (!f2.n()) {
                if (f2.j()) {
                    if (f2.i() && f2.l()) {
                        z2 = f2.o();
                    }
                }
                if (z2 || (!f2.n() && f2.s("com.huawei.hwid"))) {
                    i2 = 13;
                }
            }
            i2 = 1;
        }
        put("device_type", i2);
        put("first_impression", true);
    }
}
