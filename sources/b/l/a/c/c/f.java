package b.l.a.c.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.m.g0;
import b.l.a.c.c.q.b;
import com.segment.analytics.AnalyticsContext;

public class f {
    public static final int a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f2599b = new f();

    static {
        boolean z = i.a;
    }

    @Nullable
    public Intent a(Context context, int i2, @Nullable String str) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !a.i0(context)) {
                StringBuilder y = b.e.a.a.a.y("gcore_");
                y.append(a);
                y.append("-");
                if (!TextUtils.isEmpty(str)) {
                    y.append(str);
                }
                y.append("-");
                if (context != null) {
                    y.append(context.getPackageName());
                }
                y.append("-");
                if (context != null) {
                    try {
                        y.append(b.a(context).b(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb = y.toString();
                int i3 = g0.a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(AnalyticsContext.Device.DEVICE_ID_KEY, "com.google.android.gms");
                if (!TextUtils.isEmpty(sb)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i4 = g0.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i2 != 3) {
            return null;
        } else {
            int i5 = g0.a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public int b(Context context, int i2) {
        int b2 = i.b(context, i2);
        if (i.c(context, b2)) {
            return 18;
        }
        return b2;
    }

    public boolean c(int i2) {
        boolean z = i.a;
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }
}
