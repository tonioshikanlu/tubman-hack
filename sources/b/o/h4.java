package b.o;

import b.o.i2;
import b.o.o3;
import org.json.JSONException;
import org.json.JSONObject;

public class h4 extends l4 {
    public h4() {
        super(o3.a.EMAIL);
    }

    public void e(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", 11);
            jSONObject.putOpt("device_player_id", i2.r());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void h(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            String str = i2.a;
        }
    }

    public String j() {
        return i2.n();
    }

    public i2.k k() {
        return i2.k.INFO;
    }

    public f4 r(String str, boolean z) {
        return new g4(str, z);
    }

    public void s(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            String str = i2.a;
        }
    }

    public void v() {
        if (!(i2.n() == null && m() == null) && i2.r() != null) {
            l(0).a();
        }
    }

    public void z(String str) {
        r0 r0Var;
        i2.A(str);
        boolean z = false;
        if (i2.c == null) {
            r0Var = null;
        } else {
            if (i2.W == null) {
                r0 r0Var2 = new r0(false);
                i2.W = r0Var2;
                r0Var2.f6263h.f6215b.add(new q0());
            }
            r0Var = i2.W;
        }
        String str2 = r0Var.f6264i;
        if (str != null ? !str.equals(str2) : str2 != null) {
            z = true;
        }
        r0Var.f6264i = str;
        if (z) {
            r0Var.f6263h.a(r0Var);
        }
        try {
            o3.f(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
