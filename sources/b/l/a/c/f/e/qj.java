package b.l.a.c.f.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b.l.a.c.c.n.a;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class qj extends BroadcastReceiver {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ sj f3243b;

    public qj(sj sjVar, String str) {
        this.f3243b = sjVar;
        this.a = str;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        String c;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f7263i == 0) {
                String str2 = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                rj rjVar = this.f3243b.c.get(this.a);
                if (rjVar == null) {
                    a aVar = sj.d;
                    str = aVar.a;
                    c = aVar.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str2);
                    String group = matcher.find() ? matcher.group() : null;
                    rjVar.f3259e = group;
                    if (group == null) {
                        a aVar2 = sj.d;
                        str = aVar2.a;
                        c = aVar2.c("Unable to extract verification code.", new Object[0]);
                    } else if (!b.l.a.c.b.a.M1(rjVar.d)) {
                        sj.f(this.f3243b, this.a);
                    }
                }
                Log.e(str, c);
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
