package b.o;

import org.json.JSONObject;

public class y0 extends JSONObject {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6356b;
    public final /* synthetic */ t0 c;

    public y0(u0 u0Var, String str, String str2, t0 t0Var) {
        boolean z;
        int i2;
        this.a = str;
        this.f6356b = str2;
        this.c = t0Var;
        put("app_id", i2.q());
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
        put("player_id", i2.r());
        put("click_id", str);
        put("variant_id", str2);
        if (t0Var.f6288g) {
            put("first_click", true);
        }
    }
}
