package b.o;

import android.content.ComponentName;
import android.content.Context;
import android.util.Base64;
import b.l.a.c.b.a;
import b.l.d.d;
import b.l.d.l;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class y3 extends x3 {
    public d d;

    public static void d(Context context) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, FirebaseInstanceIdService.class), f2.f(context, "gcm_defaultSenderId", (String) null) == null ? 2 : 1, 1);
        } catch (IllegalArgumentException | NoClassDefFoundError unused) {
        }
    }

    public String b() {
        return "FCM";
    }

    public String c(String str) {
        if (this.d == null) {
            String str2 = i2.P.f6053i.f6044b;
            if (str2 == null) {
                str2 = "1:754795614042:android:c682b8144a8dd52bc1ad63";
            }
            String str3 = str2;
            a.y(str3, "ApplicationId must be set.");
            String str4 = i2.P.f6053i.c;
            if (str4 == null) {
                str4 = new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0));
            }
            String str5 = str4;
            a.y(str5, "ApiKey must be set.");
            String str6 = i2.P.f6053i.a;
            if (str6 == null) {
                str6 = "onesignal-shared-public";
            }
            this.d = d.g(i2.c, new l(str3, str5, (String) null, (String) null, str, (String) null, str6), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
        return FirebaseInstanceId.getInstance(this.d).b(str, "FCM");
    }
}
