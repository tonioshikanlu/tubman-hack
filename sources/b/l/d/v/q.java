package b.l.d.v;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import b.l.a.c.b.a;
import b.l.d.d;
import java.util.List;

public final class q {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public String f5334b;
    public String c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5335e = 0;

    public q(Context context) {
        this.a = context;
    }

    public static String a(d dVar) {
        dVar.a();
        String str = dVar.c.f4919e;
        if (str != null) {
            return str;
        }
        dVar.a();
        String str2 = dVar.c.f4918b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized int b() {
        int i2 = this.f5335e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!a.d0()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f5335e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (a.d0()) {
                this.f5335e = 2;
            } else {
                this.f5335e = 1;
            }
            return this.f5335e;
        }
        this.f5335e = 2;
        return 2;
    }

    public final synchronized String c() {
        if (this.f5334b == null) {
            e();
        }
        return this.f5334b;
    }

    public final synchronized int d() {
        PackageInfo f;
        if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
            this.d = f.versionCode;
        }
        return this.d;
    }

    public final synchronized void e() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.f5334b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }

    public final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
