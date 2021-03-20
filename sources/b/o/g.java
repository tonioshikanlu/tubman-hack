package b.o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import b.o.i2;
import b.o.w4.b;
import b.o.w4.c;

public class g {
    public static int a = -1;

    public static boolean a(Context context) {
        int i2 = a;
        if (i2 != -1) {
            return i2 == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                a = 1;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            a = 0;
            i2.a(i2.k.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e2);
        }
        return a == 1;
    }

    public static void b(y2 y2Var, Context context) {
        if (a(context) && f2.a()) {
            int i2 = 0;
            for (StatusBarNotification c : b.l.f.x.a.g.s(context)) {
                if (!i0.c(c)) {
                    i2++;
                }
            }
            c(i2, context);
        }
    }

    public static void c(int i2, Context context) {
        if (a(context)) {
            try {
                c.a(context, i2);
            } catch (b unused) {
            }
        }
    }
}
