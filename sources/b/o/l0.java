package b.o;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import b.l.f.x.a.g;
import b.o.c3;
import java.security.SecureRandom;

public class l0 {
    public static boolean a;

    public static void a(String str, String str2, String str3) {
        c3.e eVar;
        if (!a && (eVar = i2.P) != null && !eVar.f6049b && str != null && str2 != null) {
            String str4 = "?app_id=" + str + "&user_id=" + str2;
            if (str3 != null) {
                str4 = a.n(str4, "&ad_id=", str3);
            }
            StringBuilder B = a.B(str4, "&cbs_id=");
            B.append(new SecureRandom().nextInt(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
            a = g.X("https://onesignal.com/android_frame.html" + B.toString(), false);
        }
    }
}
