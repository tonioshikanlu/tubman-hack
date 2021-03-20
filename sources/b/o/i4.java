package b.o;

import org.json.JSONException;

public class i4 extends f4 {
    public i4(String str, boolean z) {
        super(str, z);
    }

    public void a() {
        try {
            Integer valueOf = Integer.valueOf(q());
            synchronized (f4.d) {
                this.c.put("notification_types", valueOf);
            }
        } catch (JSONException unused) {
        }
    }

    public f4 j(String str) {
        return new i4(str, false);
    }

    public final int q() {
        int optInt = e().a.optInt("subscribableStatus", 1);
        if (optInt < -2) {
            return optInt;
        }
        if (!e().a.optBoolean("androidPermission", true)) {
            return 0;
        }
        return !e().a.optBoolean("userSubscribePref", true) ? -2 : 1;
    }
}
