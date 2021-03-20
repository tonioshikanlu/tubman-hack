package b.o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import b.l.f.x.a.g;
import b.o.i2;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class f0 {
    public static final Pattern a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0146  */
    @androidx.annotation.RequiresApi(api = 26)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r9, android.app.NotificationManager r10, org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "chnl"
            java.lang.Object r0 = r11.opt(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            goto L_0x0015
        L_0x0012:
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0015:
            java.lang.String r0 = "id"
            java.lang.String r2 = "fcm_fallback_notification_channel"
            java.lang.String r0 = r1.optString(r0, r2)
            java.lang.String r3 = "miscellaneous"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            java.lang.String r0 = "langs"
            boolean r3 = r1.has(r0)
            if (r3 == 0) goto L_0x0042
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.lang.String r3 = b.o.f2.b()
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0042
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            java.lang.String r3 = "nm"
            java.lang.String r4 = "Miscellaneous"
            java.lang.String r3 = r0.optString(r3, r4)
            r4 = 6
            java.lang.String r5 = "pri"
            int r4 = r11.optInt(r5, r4)
            r5 = 5
            r6 = 9
            r7 = 0
            r8 = 1
            if (r4 <= r6) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            r6 = 7
            if (r4 <= r6) goto L_0x005f
            r5 = 4
            goto L_0x006d
        L_0x005f:
            r6 = 3
            if (r4 <= r5) goto L_0x0064
            r5 = r6
            goto L_0x006d
        L_0x0064:
            if (r4 <= r6) goto L_0x0068
            r5 = 2
            goto L_0x006d
        L_0x0068:
            if (r4 <= r8) goto L_0x006c
            r5 = r8
            goto L_0x006d
        L_0x006c:
            r5 = r7
        L_0x006d:
            android.app.NotificationChannel r4 = new android.app.NotificationChannel
            r4.<init>(r2, r3, r5)
            java.lang.String r3 = "dscr"
            r5 = 0
            java.lang.String r3 = r0.optString(r3, r5)
            r4.setDescription(r3)
            java.lang.String r3 = "grp_id"
            boolean r6 = r1.has(r3)
            if (r6 == 0) goto L_0x0099
            java.lang.String r1 = r1.optString(r3)
            java.lang.String r3 = "grp_nm"
            java.lang.String r0 = r0.optString(r3)
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r1, r0)
            r10.createNotificationChannelGroup(r3)
            r4.setGroup(r1)
        L_0x0099:
            java.lang.String r0 = "ledc"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = r11.optString(r0)
            java.util.regex.Pattern r1 = a
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x00ba
            b.o.i2$k r0 = b.o.i2.k.WARN
            java.lang.String r1 = "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)"
            b.o.i2.a(r0, r1, r5)
            java.lang.String r0 = "FFFFFFFF"
        L_0x00ba:
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ all -> 0x00c9 }
            r3 = 16
            r1.<init>(r0, r3)     // Catch:{ all -> 0x00c9 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x00c9 }
            r4.setLightColor(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00d1
        L_0x00c9:
            r0 = move-exception
            b.o.i2$k r1 = b.o.i2.k.ERROR
            java.lang.String r3 = "Couldn't convert ARGB Hex value to BigInteger:"
            b.o.i2.a(r1, r3, r0)
        L_0x00d1:
            java.lang.String r0 = "led"
            int r0 = r11.optInt(r0, r8)
            if (r0 != r8) goto L_0x00db
            r0 = r8
            goto L_0x00dc
        L_0x00db:
            r0 = r7
        L_0x00dc:
            r4.enableLights(r0)
            java.lang.String r0 = "vib_pt"
            boolean r0 = r11.has(r0)
            if (r0 == 0) goto L_0x00f0
            long[] r0 = b.o.f2.t(r11)
            if (r0 == 0) goto L_0x00f0
            r4.setVibrationPattern(r0)
        L_0x00f0:
            java.lang.String r0 = "vib"
            int r0 = r11.optInt(r0, r8)
            if (r0 != r8) goto L_0x00fa
            r0 = r8
            goto L_0x00fb
        L_0x00fa:
            r0 = r7
        L_0x00fb:
            r4.enableVibration(r0)
            java.lang.String r0 = "sound"
            boolean r1 = r11.has(r0)
            if (r1 == 0) goto L_0x0127
            java.lang.String r0 = r11.optString(r0, r5)
            android.net.Uri r9 = b.o.f2.g(r9, r0)
            if (r9 == 0) goto L_0x0114
            r4.setSound(r9, r5)
            goto L_0x0127
        L_0x0114:
            java.lang.String r9 = "null"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0124
            java.lang.String r9 = "nil"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0127
        L_0x0124:
            r4.setSound(r5, r5)
        L_0x0127:
            java.lang.String r9 = "vis"
            int r9 = r11.optInt(r9, r7)
            r4.setLockscreenVisibility(r9)
            java.lang.String r9 = "bdg"
            int r9 = r11.optInt(r9, r8)
            if (r9 != r8) goto L_0x013a
            r9 = r8
            goto L_0x013b
        L_0x013a:
            r9 = r7
        L_0x013b:
            r4.setShowBadge(r9)
            java.lang.String r9 = "bdnd"
            int r9 = r11.optInt(r9, r7)
            if (r9 != r8) goto L_0x0147
            r7 = r8
        L_0x0147:
            r4.setBypassDnd(r7)
            b.o.i2$k r9 = b.o.i2.k.VERBOSE
            java.lang.String r11 = "Creating notification channel with channel:\n"
            java.lang.StringBuilder r11 = b.e.a.a.a.y(r11)
            java.lang.String r0 = r4.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            b.o.i2.a(r9, r11, r5)
            r10.createNotificationChannel(r4)     // Catch:{ IllegalArgumentException -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0168:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.f0.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    public static String b(h0 h0Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context = h0Var.a;
        JSONObject jSONObject = h0Var.f6106b;
        NotificationManager v = g.v(context);
        if (h0Var.c) {
            v.createNotificationChannel(new NotificationChannel("restored_OS_notifications", "Restored", 2));
            return "restored_OS_notifications";
        }
        if (jSONObject.has("oth_chnl")) {
            String optString = jSONObject.optString("oth_chnl");
            if (v.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!jSONObject.has("chnl")) {
            NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            v.createNotificationChannel(notificationChannel);
            return "fcm_fallback_notification_channel";
        }
        try {
            return a(context, v, jSONObject);
        } catch (JSONException e2) {
            i2.a(i2.k.ERROR, "Could not create notification channel due to JSON payload error!", e2);
            return "fcm_fallback_notification_channel";
        }
    }
}
