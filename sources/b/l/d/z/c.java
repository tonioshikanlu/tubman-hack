package b.l.d.z;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {
    public static final AtomicInteger d = new AtomicInteger((int) SystemClock.elapsedRealtime());
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5407b;
    public Bundle c;

    public c(Context context, String str) {
        this.a = context;
        this.f5407b = str;
    }

    public static String b(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static void c(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public static boolean h(Bundle bundle) {
        return "1".equals(b(bundle, "gcm.n.e")) || b(bundle, "gcm.n.icon") != null;
    }

    public static boolean i(Bundle bundle) {
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public final PendingIntent a(int i2, Intent intent) {
        return PendingIntent.getBroadcast(this.a, i2, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.a, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), BasicMeasure.EXACTLY);
    }

    public final synchronized Bundle d() {
        Bundle bundle;
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            return bundle2;
        }
        try {
            ApplicationInfo f = f(128);
            if (!(f == null || (bundle = f.metaData) == null)) {
                this.c = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public final boolean e(int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.a.getResources().getDrawable(i2, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    public final ApplicationInfo f(int i2) {
        return this.a.getPackageManager().getApplicationInfo(this.f5407b, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d2 A[SYNTHETIC, Splitter:B:20:0x00d2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g(android.os.Bundle r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = b(r14, r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r0 = "_loc_key"
            java.lang.String r1 = r15.concat(r0)
            java.lang.String r1 = b(r14, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001e
            goto L_0x0108
        L_0x001e:
            android.content.Context r2 = r13.a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r4 = r13.f5407b
            java.lang.String r5 = "string"
            int r1 = r2.getIdentifier(r1, r5, r4)
            java.lang.String r4 = " Default value will be used."
            r5 = 6
            java.lang.String r6 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0066
            java.lang.String r14 = r15.concat(r0)
            java.lang.String r14 = r14.substring(r5)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            int r0 = r0 + 49
            int r1 = r15.length()
            int r1 = r1 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " resource not found: "
            r0.append(r14)
            r0.append(r15)
            r0.append(r4)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r6, r14)
            goto L_0x0108
        L_0x0066:
            java.lang.String r0 = "_loc_args"
            java.lang.String r7 = r15.concat(r0)
            java.lang.String r14 = b(r14, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r8 = ": "
            if (r7 == 0) goto L_0x0079
            goto L_0x00ca
        L_0x0079:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0090 }
            r7.<init>(r14)     // Catch:{ JSONException -> 0x0090 }
            int r9 = r7.length()     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x0090 }
            r11 = 0
        L_0x0085:
            if (r11 >= r9) goto L_0x00cb
            java.lang.Object r12 = r7.opt(r11)     // Catch:{ JSONException -> 0x0090 }
            r10[r11] = r12     // Catch:{ JSONException -> 0x0090 }
            int r11 = r11 + 1
            goto L_0x0085
        L_0x0090:
            java.lang.String r0 = r15.concat(r0)
            java.lang.String r0 = r0.substring(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r5 = r5 + 41
            java.lang.String r7 = java.lang.String.valueOf(r14)
            int r7 = r7.length()
            int r7 = r7 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            java.lang.String r7 = "Malformed "
            r5.append(r7)
            r5.append(r0)
            r5.append(r8)
            r5.append(r14)
            java.lang.String r14 = "  Default value will be used."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r6, r14)
        L_0x00ca:
            r10 = r3
        L_0x00cb:
            if (r10 != 0) goto L_0x00d2
            java.lang.String r3 = r2.getString(r1)
            goto L_0x0108
        L_0x00d2:
            java.lang.String r3 = r2.getString(r1, r10)     // Catch:{ MissingFormatArgumentException -> 0x00d7 }
            goto L_0x0108
        L_0x00d7:
            r14 = move-exception
            java.lang.String r0 = java.util.Arrays.toString(r10)
            int r1 = r15.length()
            int r1 = r1 + 58
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = "Missing format argument for "
            r1.append(r2)
            r1.append(r15)
            r1.append(r8)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r15 = r1.toString()
            android.util.Log.w(r6, r15, r14)
        L_0x0108:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.z.c.g(android.os.Bundle, java.lang.String):java.lang.String");
    }
}
