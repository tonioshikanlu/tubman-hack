package b.o;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import b.l.f.x.a.g;
import org.json.JSONObject;

public class k0 {
    public static boolean a(@NonNull Context context, @NonNull JSONObject jSONObject) {
        String J = g.J(jSONObject);
        if (J == null) {
            return false;
        }
        i2.I(context);
        i2.p().i(J);
        return true;
    }

    public static void b(Context context, Intent intent) {
        if (intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId")) {
            i2.E(context);
            if (intent.getBooleanExtra("action_button", false)) {
                NotificationManagerCompat.from(context).cancel(intent.getIntExtra("androidNotificationId", 0));
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            c(context, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r9v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r23, android.content.Intent r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r0 = "onesignalData"
            java.lang.String r3 = "summary"
            java.lang.String r4 = r2.getStringExtra(r3)
            java.lang.String r5 = "dismissed"
            r6 = 0
            boolean r7 = r2.getBooleanExtra(r5, r6)
            java.lang.String r8 = "androidNotificationId"
            if (r7 != 0) goto L_0x0051
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004a }
            java.lang.String r10 = r2.getStringExtra(r0)     // Catch:{ JSONException -> 0x004a }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x004a }
            boolean r10 = a(r1, r9)     // Catch:{ JSONException -> 0x0048 }
            if (r10 == 0) goto L_0x0027
            return
        L_0x0027:
            int r10 = r2.getIntExtra(r8, r6)     // Catch:{ JSONException -> 0x0048 }
            r9.put(r8, r10)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r10 = r9.toString()     // Catch:{ JSONException -> 0x0048 }
            r2.putExtra(r0, r10)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ JSONException -> 0x0048 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0048 }
            r0.<init>()     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r0 = r0.put(r10)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r0 = move-exception
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r9 = 0
        L_0x004c:
            r0.printStackTrace()
            r0 = 0
            goto L_0x0053
        L_0x0051:
            r0 = 0
            r9 = 0
        L_0x0053:
            b.o.z2 r15 = b.o.z2.e(r23)
            r14 = 1
            if (r7 != 0) goto L_0x00c5
            if (r4 == 0) goto L_0x00c5
            java.lang.String r13 = "full_data"
            java.lang.String[] r12 = new java.lang.String[]{r13}
            java.lang.String[] r11 = new java.lang.String[r14]
            r11[r6] = r4
            r6 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = "notification"
            java.lang.String r19 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0"
            r10 = r15
            r20 = r11
            r11 = r18
            r21 = r13
            r13 = r19
            r18 = r9
            r9 = r14
            r14 = r20
            r22 = r15
            r15 = r6
            android.database.Cursor r6 = r10.S(r11, r12, r13, r14, r15, r16, r17)
            int r10 = r6.getCount()
            if (r10 <= r9) goto L_0x00c0
            r6.moveToFirst()
            r10 = r21
        L_0x008f:
            int r11 = r6.getColumnIndex(r10)     // Catch:{ JSONException -> 0x00a1 }
            java.lang.String r11 = r6.getString(r11)     // Catch:{ JSONException -> 0x00a1 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a1 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x00a1 }
            r0.put(r12)     // Catch:{ JSONException -> 0x00a1 }
            r11 = 0
            goto L_0x00b9
        L_0x00a1:
            b.o.i2$k r11 = b.o.i2.k.ERROR
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Could not parse JSON of sub notification in group: "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r13 = 0
            b.o.i2.a(r11, r12, r13)
            r11 = r13
        L_0x00b9:
            boolean r12 = r6.moveToNext()
            if (r12 != 0) goto L_0x008f
            goto L_0x00c1
        L_0x00c0:
            r11 = 0
        L_0x00c1:
            r6.close()
            goto L_0x00cb
        L_0x00c5:
            r18 = r9
            r9 = r14
            r22 = r15
            r11 = 0
        L_0x00cb:
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r6 = "OS_CLEAR_GROUP_SUMMARY_CLICK"
            java.lang.String r10 = "os_group_undefined"
            if (r3 == 0) goto L_0x0117
            boolean r8 = r3.equals(r10)
            if (r8 == 0) goto L_0x00de
            java.lang.String r12 = "group_id IS NULL"
            goto L_0x00e5
        L_0x00de:
            java.lang.String[] r11 = new java.lang.String[r9]
            r12 = 0
            r11[r12] = r3
            java.lang.String r12 = "group_id = ?"
        L_0x00e5:
            if (r7 != 0) goto L_0x0114
            java.lang.String r13 = b.o.i2.a
            java.lang.String r13 = b.o.b3.a
            boolean r13 = b.o.b3.b(r13, r6, r9)
            if (r13 != 0) goto L_0x0114
            r13 = r22
            java.lang.Integer r11 = b.l.f.x.a.g.u(r13, r3, r8)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r14 = " AND android_notification_id = ?"
            java.lang.String r12 = b.e.a.a.a.m(r12, r14)
            if (r8 == 0) goto L_0x010a
            java.lang.String[] r8 = new java.lang.String[r9]
            r14 = 0
            r8[r14] = r11
            r11 = r8
            goto L_0x012c
        L_0x010a:
            r8 = 0
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]
            r14[r8] = r3
            r14[r9] = r11
            r11 = r14
            goto L_0x012c
        L_0x0114:
            r13 = r22
            goto L_0x012c
        L_0x0117:
            r13 = r22
            r11 = 0
            java.lang.String r12 = "android_notification_id = "
            java.lang.StringBuilder r12 = b.e.a.a.a.y(r12)
            int r8 = r2.getIntExtra(r8, r11)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            r11 = 0
        L_0x012c:
            java.lang.String r8 = "notification"
            if (r3 == 0) goto L_0x016f
            java.lang.Integer r14 = b.l.f.x.a.g.D(r13, r3)
            boolean r10 = r3.equals(r10)
            java.lang.Object r15 = r1.getSystemService(r8)
            android.app.NotificationManager r15 = (android.app.NotificationManager) r15
            java.lang.Integer r3 = b.l.f.x.a.g.u(r13, r3, r10)
            if (r3 == 0) goto L_0x016d
            java.lang.String r16 = b.o.i2.a
            r17 = r14
            java.lang.String r14 = b.o.b3.a
            boolean r6 = b.o.b3.b(r14, r6, r9)
            if (r6 == 0) goto L_0x0166
            if (r10 == 0) goto L_0x015a
            r3 = -718463522(0xffffffffd52d1dde, float:-1.18964869E13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            goto L_0x015c
        L_0x015a:
            r14 = r17
        L_0x015c:
            if (r14 == 0) goto L_0x016d
            int r3 = r14.intValue()
            r15.cancel(r3)
            goto L_0x016d
        L_0x0166:
            int r3 = r3.intValue()
            b.o.i2.f(r3)
        L_0x016d:
            r14 = r9
            goto L_0x01ae
        L_0x016f:
            android.service.notification.StatusBarNotification[] r3 = b.l.f.x.a.g.s(r23)
            int r6 = r3.length
            r9 = 0
            r14 = 0
        L_0x0176:
            if (r9 >= r6) goto L_0x0197
            r15 = r3[r9]
            android.app.Notification r16 = r15.getNotification()
            boolean r16 = androidx.core.app.NotificationCompat.isGroupSummary(r16)
            if (r16 != 0) goto L_0x0194
            android.app.Notification r15 = r15.getNotification()
            java.lang.String r15 = r15.getGroup()
            boolean r15 = r10.equals(r15)
            if (r15 == 0) goto L_0x0194
            int r14 = r14 + 1
        L_0x0194:
            int r9 = r9 + 1
            goto L_0x0176
        L_0x0197:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            int r3 = r3.intValue()
            r14 = 1
            if (r3 >= r14) goto L_0x01ae
            java.lang.Object r3 = r1.getSystemService(r8)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            r6 = -718463522(0xffffffffd52d1dde, float:-1.18964869E13)
            r3.cancel(r6)
        L_0x01ae:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            r6 = 0
            boolean r6 = r2.getBooleanExtra(r5, r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            if (r6 == 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            java.lang.String r5 = "opened"
        L_0x01c1:
            r3.put(r5, r9)
            r13.k0(r8, r3, r12, r11)
            b.o.g.b(r13, r1)
            if (r4 != 0) goto L_0x01d7
            java.lang.String r3 = "grp"
            java.lang.String r3 = r2.getStringExtra(r3)
            if (r3 == 0) goto L_0x01d7
            b.l.f.x.a.g.q0(r1, r13, r3, r7)
        L_0x01d7:
            if (r7 != 0) goto L_0x01e7
            java.lang.String r3 = "from_alert"
            r4 = 0
            boolean r2 = r2.getBooleanExtra(r3, r4)
            java.lang.String r3 = b.l.f.x.a.g.w(r18)
            b.o.i2.s(r1, r0, r2, r3)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.k0.c(android.content.Context, android.content.Intent):void");
    }
}
