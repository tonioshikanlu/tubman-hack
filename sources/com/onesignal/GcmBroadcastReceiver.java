package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.f.x.a.g;
import b.o.h;
import b.o.i;
import b.o.j;
import com.segment.analytics.integrations.BasePayload;

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {
    public static h a(Bundle bundle, h hVar) {
        hVar.a("json_payload", g.f(bundle).toString());
        hVar.c(BasePayload.TIMESTAMP_KEY, Long.valueOf(System.currentTimeMillis() / 1000));
        return hVar;
    }

    @TargetApi(21)
    public static void b(Context context, Bundle bundle) {
        j jVar = new j();
        a(bundle, jVar);
        Intent intent = new Intent(context, GcmIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", jVar.a);
        int i2 = GcmIntentJobService.f7381o;
        JobIntentService.a(context, new ComponentName(context, GcmIntentJobService.class), 123890, intent, false);
    }

    public static void c(Context context, Bundle bundle) {
        ComponentName componentName = new ComponentName(context.getPackageName(), GcmIntentService.class.getName());
        i iVar = new i();
        a(bundle, iVar);
        WakefulBroadcastReceiver.startWakefulService(context, new Intent().replaceExtras(iVar.a).setComponent(componentName));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r7 = r7.getStringExtra("message_type");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            android.os.Bundle r0 = r7.getExtras()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "from"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "google.com/iid"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
            goto L_0x00dd
        L_0x0016:
            b.o.i2.E(r6)
            java.lang.String r1 = r7.getAction()
            java.lang.String r2 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "message_type"
            java.lang.String r7 = r7.getStringExtra(r1)
            if (r7 == 0) goto L_0x0037
            java.lang.String r1 = "gcm"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x0039
        L_0x0037:
            r7 = r2
            goto L_0x003a
        L_0x0039:
            r7 = r3
        L_0x003a:
            r1 = 0
            if (r7 != 0) goto L_0x003e
            goto L_0x0096
        L_0x003e:
            b.o.e0 r7 = b.l.f.x.a.g.c0(r6, r0)
            boolean r4 = r7.a()
            if (r4 == 0) goto L_0x0049
            goto L_0x0095
        L_0x0049:
            java.lang.String r4 = "licon"
            boolean r4 = b.l.f.x.a.g.L(r0, r4)
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "bicon"
            boolean r4 = b.l.f.x.a.g.L(r0, r4)
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "bg_img"
            java.lang.String r4 = r0.getString(r4, r1)
            if (r4 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r4 = r3
            goto L_0x0065
        L_0x0064:
            r4 = r2
        L_0x0065:
            if (r4 != 0) goto L_0x0073
            b.o.j r2 = new b.o.j
            r2.<init>()
            a(r0, r2)
            b.l.f.x.a.g.b(r6, r2, r1)
            goto L_0x0095
        L_0x0073:
            java.lang.String r1 = "pri"
            java.lang.String r4 = "0"
            java.lang.String r1 = r0.getString(r1, r4)
            int r1 = java.lang.Integer.parseInt(r1)
            r4 = 9
            if (r1 <= r4) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r2 = r3
        L_0x0085:
            if (r2 != 0) goto L_0x008e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            c(r6, r0)     // Catch:{ IllegalStateException -> 0x0092 }
            goto L_0x0095
        L_0x0092:
            b(r6, r0)
        L_0x0095:
            r1 = r7
        L_0x0096:
            r6 = -1
            if (r1 != 0) goto L_0x00a3
            boolean r7 = r5.isOrderedBroadcast()
            if (r7 == 0) goto L_0x00a2
            r5.setResultCode(r6)
        L_0x00a2:
            return
        L_0x00a3:
            boolean r7 = r1.c
            if (r7 != 0) goto L_0x00d1
            boolean r7 = r1.f6082b
            if (r7 == 0) goto L_0x00ac
            goto L_0x00d1
        L_0x00ac:
            boolean r7 = r1.a
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = b.o.b3.a
            java.lang.String r0 = "OS_FILTER_OTHER_GCM_RECEIVERS"
            boolean r7 = b.o.b3.b(r7, r0, r3)
            if (r7 == 0) goto L_0x00c7
            boolean r7 = r5.isOrderedBroadcast()
            if (r7 == 0) goto L_0x00c6
            r5.abortBroadcast()
            r5.setResultCode(r6)
        L_0x00c6:
            return
        L_0x00c7:
            boolean r7 = r5.isOrderedBroadcast()
            if (r7 == 0) goto L_0x00d0
            r5.setResultCode(r6)
        L_0x00d0:
            return
        L_0x00d1:
            boolean r7 = r5.isOrderedBroadcast()
            if (r7 == 0) goto L_0x00dd
            r5.abortBroadcast()
            r5.setResultCode(r6)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GcmBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
