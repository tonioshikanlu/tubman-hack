package b.o;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

public class x2 extends CustomTabsServiceConnection {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6354b;

    public x2(@NonNull String str, boolean z) {
        this.a = str;
        this.f6354b = z;
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        customTabsClient.warmup(0);
        CustomTabsSession newSession = customTabsClient.newSession((CustomTabsCallback) null);
        if (newSession != null) {
            Uri parse = Uri.parse(this.a);
            newSession.mayLaunchUrl(parse, (Bundle) null, (List<Bundle>) null);
            if (this.f6354b) {
                CustomTabsIntent build = new CustomTabsIntent.Builder(newSession).build();
                build.intent.setData(parse);
                build.intent.addFlags(268435456);
                i2.c.startActivity(build.intent, build.startAnimationBundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
