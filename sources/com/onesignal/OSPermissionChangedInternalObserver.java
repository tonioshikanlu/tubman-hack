package com.onesignal;

import b.o.b3;
import b.o.f2;
import b.o.g;
import b.o.i2;
import b.o.k4;
import b.o.o1;
import b.o.o3;
import b.o.t1;
import b.o.u1;
import java.util.Objects;
import org.json.JSONException;

public class OSPermissionChangedInternalObserver {
    public static void a(t1 t1Var) {
        if (!t1Var.f6295i) {
            g.c(0, i2.c);
        }
        boolean a = i2.H.d ? f2.a() : true;
        k4 b2 = o3.b();
        Objects.requireNonNull(b2);
        try {
            b2.o().m("androidPermission", Boolean.valueOf(a));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void changed(t1 t1Var) {
        a(t1Var);
        u1 u1Var = new u1();
        u1Var.f6311b = i2.R;
        u1Var.a = (t1) t1Var.clone();
        if (i2.S == null) {
            i2.S = new o1<>("onOSPermissionChanged", true);
        }
        if (i2.S.a(u1Var)) {
            t1 t1Var2 = (t1) t1Var.clone();
            i2.R = t1Var2;
            Objects.requireNonNull(t1Var2);
            b3.i(b3.a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", t1Var2.f6295i);
        }
    }
}
