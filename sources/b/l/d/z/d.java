package b.l.d.z;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;

public final class d {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5408b;
    public final c c;
    public final Bundle d;

    public d(Context context, Bundle bundle, Executor executor) {
        this.a = executor;
        this.f5408b = context;
        this.d = bundle;
        this.c = new c(context, context.getPackageName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03c9 A[SYNTHETIC, Splitter:B:145:0x03c9] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0401 A[SYNTHETIC, Splitter:B:151:0x0401] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0441 A[SYNTHETIC, Splitter:B:162:0x0441] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[SYNTHETIC, Splitter:B:33:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0158 A[SYNTHETIC, Splitter:B:56:0x0158] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r16 = this;
            r1 = r16
            android.os.Bundle r0 = r1.d
            java.lang.String r2 = "gcm.n.noui"
            java.lang.String r0 = b.l.d.z.c.b(r0, r2)
            java.lang.String r2 = "1"
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            android.content.Context r0 = r1.f5408b
            java.lang.String r3 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r3 = 0
            if (r0 != 0) goto L_0x0055
            int r0 = android.os.Process.myPid()
            android.content.Context r4 = r1.f5408b
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 == 0) goto L_0x0055
            java.util.Iterator r4 = r4.iterator()
        L_0x003d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            int r6 = r5.pid
            if (r6 != r0) goto L_0x003d
            int r0 = r5.importance
            r4 = 100
            if (r0 != r4) goto L_0x0055
            r0 = r2
            goto L_0x0056
        L_0x0055:
            r0 = r3
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            return r3
        L_0x0059:
            android.os.Bundle r0 = r1.d
            java.lang.String r4 = "gcm.n.image"
            java.lang.String r0 = b.l.d.z.c.b(r0, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "FirebaseMessaging"
            if (r4 == 0) goto L_0x006b
        L_0x0069:
            r4 = 0
            goto L_0x0090
        L_0x006b:
            b.l.d.z.e r4 = new b.l.d.z.e     // Catch:{ MalformedURLException -> 0x0076 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0076 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0076 }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x0076 }
            goto L_0x0090
        L_0x0076:
            java.lang.String r4 = "Not downloading image, bad URL: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r7 = r0.length()
            if (r7 == 0) goto L_0x0087
            java.lang.String r0 = r4.concat(r0)
            goto L_0x008c
        L_0x0087:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x008c:
            android.util.Log.w(r6, r0)
            goto L_0x0069
        L_0x0090:
            if (r4 == 0) goto L_0x009f
            java.util.concurrent.Executor r0 = r1.a
            b.l.d.z.f r7 = new b.l.d.z.f
            r7.<init>(r4)
            b.l.a.c.k.h r0 = b.l.a.c.b.a.i(r0, r7)
            r4.f5410i = r0
        L_0x009f:
            b.l.d.z.c r7 = r1.c
            android.os.Bundle r8 = r1.d
            androidx.core.app.NotificationCompat$Builder r9 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r0 = r7.a
            java.lang.String r10 = "gcm.n.android_channel_id"
            java.lang.String r10 = b.l.d.z.c.b(r8, r10)
            boolean r11 = b.l.a.c.b.a.d0()
            r12 = 3
            if (r11 != 0) goto L_0x00b5
            goto L_0x00c1
        L_0x00b5:
            android.content.pm.ApplicationInfo r11 = r7.f(r3)     // Catch:{ NameNotFoundException -> 0x00bc }
            int r11 = r11.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00bc }
            goto L_0x00bd
        L_0x00bc:
            r11 = r3
        L_0x00bd:
            r13 = 26
            if (r11 >= r13) goto L_0x00c4
        L_0x00c1:
            r10 = 0
            goto L_0x0143
        L_0x00c4:
            android.content.Context r11 = r7.a
            java.lang.Class<android.app.NotificationManager> r13 = android.app.NotificationManager.class
            java.lang.Object r11 = r11.getSystemService(r13)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L_0x00fe
            android.app.NotificationChannel r13 = r11.getNotificationChannel(r10)
            if (r13 == 0) goto L_0x00db
            goto L_0x0143
        L_0x00db:
            java.lang.String r13 = java.lang.String.valueOf(r10)
            int r13 = r13.length()
            int r13 = r13 + 122
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.lang.String r13 = "Notification Channel requested ("
            r14.append(r13)
            r14.append(r10)
            java.lang.String r10 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            android.util.Log.w(r6, r10)
        L_0x00fe:
            android.os.Bundle r10 = r7.d()
            java.lang.String r13 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r10 = r10.getString(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L_0x0118
            android.app.NotificationChannel r13 = r11.getNotificationChannel(r10)
            if (r13 == 0) goto L_0x0115
            goto L_0x0143
        L_0x0115:
            java.lang.String r10 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            goto L_0x011a
        L_0x0118:
            java.lang.String r10 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
        L_0x011a:
            android.util.Log.w(r6, r10)
            java.lang.String r10 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r13 = r11.getNotificationChannel(r10)
            if (r13 != 0) goto L_0x0143
            android.content.Context r13 = r7.a
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r14 = r7.f5407b
            java.lang.String r15 = "fcm_fallback_notification_channel_label"
            java.lang.String r5 = "string"
            int r5 = r13.getIdentifier(r15, r5, r14)
            android.app.NotificationChannel r13 = new android.app.NotificationChannel
            android.content.Context r14 = r7.a
            java.lang.String r5 = r14.getString(r5)
            r13.<init>(r10, r5, r12)
            r11.createNotificationChannel(r13)
        L_0x0143:
            r9.<init>(r0, r10)
            r9.setAutoCancel(r2)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r7.g(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r10 = "Couldn't get own application info: "
            if (r5 != 0) goto L_0x0158
            goto L_0x0186
        L_0x0158:
            android.content.pm.ApplicationInfo r0 = r7.f(r3)     // Catch:{ NameNotFoundException -> 0x0167 }
            android.content.Context r5 = r7.a     // Catch:{ NameNotFoundException -> 0x0167 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0167 }
            java.lang.CharSequence r0 = r0.loadLabel(r5)     // Catch:{ NameNotFoundException -> 0x0167 }
            goto L_0x0186
        L_0x0167:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            int r5 = r5 + 35
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.e(r6, r0)
            java.lang.String r0 = ""
        L_0x0186:
            r9.setContentTitle(r0)
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r7.g(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x01a4
            r9.setContentText(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r5 = new androidx.core.app.NotificationCompat$BigTextStyle
            r5.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r0 = r5.bigText(r0)
            r9.setStyle(r0)
        L_0x01a4:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x01fc
            android.content.Context r5 = r7.a
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r11 = r7.f5407b
            java.lang.String r13 = "drawable"
            int r11 = r5.getIdentifier(r0, r13, r11)
            if (r11 == 0) goto L_0x01c8
            boolean r13 = r7.e(r11)
            if (r13 == 0) goto L_0x01c8
            goto L_0x0241
        L_0x01c8:
            java.lang.String r11 = r7.f5407b
            java.lang.String r13 = "mipmap"
            int r11 = r5.getIdentifier(r0, r13, r11)
            if (r11 == 0) goto L_0x01d9
            boolean r5 = r7.e(r11)
            if (r5 == 0) goto L_0x01d9
            goto L_0x0241
        L_0x01d9:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r5 = r5 + 61
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            java.lang.String r5 = "Icon resource "
            r11.append(r5)
            r11.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r6, r0)
        L_0x01fc:
            android.os.Bundle r0 = r7.d()
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_icon"
            int r5 = r0.getInt(r5, r3)
            if (r5 == 0) goto L_0x020e
            boolean r0 = r7.e(r5)
            if (r0 != 0) goto L_0x0232
        L_0x020e:
            android.content.pm.ApplicationInfo r0 = r7.f(r3)     // Catch:{ NameNotFoundException -> 0x0215 }
            int r5 = r0.icon     // Catch:{ NameNotFoundException -> 0x0215 }
            goto L_0x0232
        L_0x0215:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r11 = r0.length()
            int r11 = r11 + 35
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r11)
            r13.append(r10)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r6, r0)
        L_0x0232:
            if (r5 == 0) goto L_0x023d
            boolean r0 = r7.e(r5)
            if (r0 != 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r11 = r5
            goto L_0x0241
        L_0x023d:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r11 = r0
        L_0x0241:
            r9.setSmallIcon(r11)
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0256
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
        L_0x0256:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x025e
            r0 = 0
            goto L_0x02ae
        L_0x025e:
            java.lang.String r5 = "default"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x02a9
            android.content.Context r5 = r7.a
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r10 = r7.f5407b
            java.lang.String r11 = "raw"
            int r5 = r5.getIdentifier(r0, r11, r10)
            if (r5 == 0) goto L_0x02a9
            java.lang.String r5 = r7.f5407b
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r10 = r10 + 24
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r11 = r11.length()
            int r11 = r11 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            java.lang.String r11 = "android.resource://"
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = "/raw/"
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x02ae
        L_0x02a9:
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)
        L_0x02ae:
            if (r0 == 0) goto L_0x02b3
            r9.setSound(r0)
        L_0x02b3:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x02cf
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            java.lang.String r0 = r7.f5407b
            r5.setPackage(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            goto L_0x0312
        L_0x02cf:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x02e1
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
        L_0x02e1:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x02ec
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x02ed
        L_0x02ec:
            r0 = 0
        L_0x02ed:
            if (r0 == 0) goto L_0x02ff
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.VIEW"
            r5.<init>(r10)
            java.lang.String r10 = r7.f5407b
            r5.setPackage(r10)
            r5.setData(r0)
            goto L_0x0312
        L_0x02ff:
            android.content.Context r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r5 = r7.f5407b
            android.content.Intent r5 = r0.getLaunchIntentForPackage(r5)
            if (r5 != 0) goto L_0x0312
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r6, r0)
        L_0x0312:
            if (r5 != 0) goto L_0x0317
            r0 = 0
            goto L_0x0399
        L_0x0317:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r8)
            java.util.Set r10 = r0.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0329:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0343
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0329
            java.lang.String r13 = "google.c."
            boolean r11 = r11.startsWith(r13)
            if (r11 == 0) goto L_0x0329
            r10.remove()
            goto L_0x0329
        L_0x0343:
            r5.putExtras(r0)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x034e:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x036e
            java.lang.Object r10 = r0.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "gcm.n."
            boolean r11 = r10.startsWith(r11)
            if (r11 != 0) goto L_0x036a
            java.lang.String r11 = "gcm.notification."
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L_0x034e
        L_0x036a:
            r5.removeExtra(r10)
            goto L_0x034e
        L_0x036e:
            android.content.Context r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r10 = b.l.d.z.c.d
            int r11 = r10.incrementAndGet()
            r13 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r11, r5, r13)
            boolean r5 = b.l.d.z.c.i(r8)
            if (r5 == 0) goto L_0x0399
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r5.<init>(r11)
            b.l.d.z.c.c(r5, r8)
            java.lang.String r11 = "pending_intent"
            r5.putExtra(r11, r0)
            int r0 = r10.incrementAndGet()
            android.app.PendingIntent r0 = r7.a(r0, r5)
        L_0x0399:
            r9.setContentIntent(r0)
            boolean r0 = b.l.d.z.c.i(r8)
            if (r0 != 0) goto L_0x03a4
            r0 = 0
            goto L_0x03b8
        L_0x03a4:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r5 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r0.<init>(r5)
            b.l.d.z.c.c(r0, r8)
            java.util.concurrent.atomic.AtomicInteger r5 = b.l.d.z.c.d
            int r5 = r5.incrementAndGet()
            android.app.PendingIntent r0 = r7.a(r5, r0)
        L_0x03b8:
            if (r0 == 0) goto L_0x03bd
            r9.setDeleteIntent(r0)
        L_0x03bd:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x03f5
            int r5 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x03d2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x03d2 }
            goto L_0x0412
        L_0x03d2:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r5 = r5 + 54
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r5)
            java.lang.String r5 = "Color "
            r10.append(r5)
            r10.append(r0)
            java.lang.String r0 = " not valid. Notification will use default color."
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.w(r6, r0)
        L_0x03f5:
            android.os.Bundle r0 = r7.d()
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r0.getInt(r5, r3)
            if (r0 == 0) goto L_0x0411
            android.content.Context r5 = r7.a     // Catch:{ NotFoundException -> 0x040c }
            int r0 = androidx.core.content.ContextCompat.getColor(r5, r0)     // Catch:{ NotFoundException -> 0x040c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x040c }
            goto L_0x0412
        L_0x040c:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r6, r0)
        L_0x0411:
            r0 = 0
        L_0x0412:
            if (r0 == 0) goto L_0x041b
            int r0 = r0.intValue()
            r9.setColor(r0)
        L_0x041b:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = b.l.d.z.c.b(r8, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0428
            goto L_0x043f
        L_0x0428:
            long r7 = android.os.SystemClock.uptimeMillis()
            r0 = 37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r0 = "FCM-Notification:"
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
        L_0x043f:
            if (r4 == 0) goto L_0x047f
            b.l.a.c.k.h<android.graphics.Bitmap> r5 = r4.f5410i     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r5, r7)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            r7 = 5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            java.lang.Object r5 = b.l.a.c.b.a.c(r5, r7, r10)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            r9.setLargeIcon(r5)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            androidx.core.app.NotificationCompat$BigPictureStyle r7 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            r7.<init>()     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            androidx.core.app.NotificationCompat$BigPictureStyle r5 = r7.bigPicture(r5)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            r7 = 0
            androidx.core.app.NotificationCompat$BigPictureStyle r5 = r5.bigLargeIcon(r7)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            r9.setStyle(r5)     // Catch:{ ExecutionException -> 0x047f, InterruptedException -> 0x0470, TimeoutException -> 0x0467 }
            goto L_0x047f
        L_0x0467:
            java.lang.String r5 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r6, r5)
            r4.close()
            goto L_0x047f
        L_0x0470:
            java.lang.String r5 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r6, r5)
            r4.close()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
        L_0x047f:
            boolean r4 = android.util.Log.isLoggable(r6, r12)
            if (r4 == 0) goto L_0x048a
            java.lang.String r4 = "Showing notification"
            android.util.Log.d(r6, r4)
        L_0x048a:
            android.content.Context r4 = r1.f5408b
            java.lang.String r5 = "notification"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            android.app.Notification r5 = r9.build()
            r4.notify(r0, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.z.d.a():boolean");
    }
}
