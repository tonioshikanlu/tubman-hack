package b.l.a.c.i.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.o.a;
import b.l.a.c.c.q.b;
import java.util.List;
import java.util.Objects;

public final class b4 {
    public final l4 a;

    public b4(l4 l4Var) {
        this.a = l4Var;
    }

    @WorkerThread
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.a().f4092j.a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.d().h();
        if (!b()) {
            this.a.a().f4094l.a("Install Referrer Reporter is not available");
            return;
        }
        z3 z3Var = new z3(this, str);
        this.a.d().h();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.a.getPackageManager();
        if (packageManager == null) {
            this.a.a().f4092j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.a().f4094l.a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !b()) {
                this.a.a().f4091i.a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            Intent intent2 = new Intent(intent);
            try {
                a b2 = a.b();
                Context context = this.a.a;
                Objects.requireNonNull(b2);
                context.getClass().getName();
                this.a.a().f4096n.b("Install Referrer Service is", true != b2.c(context, intent2, z3Var, 1) ? "not available" : "available");
            } catch (Exception e2) {
                this.a.a().f.b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }

    public final boolean b() {
        try {
            b.l.a.c.c.q.a a2 = b.a(this.a.a);
            if (a2 == null) {
                this.a.a().f4096n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            this.a.a().f4096n.b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }
}
