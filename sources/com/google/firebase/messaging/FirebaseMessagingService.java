package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import b.l.d.d;
import b.l.d.v.e0;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends e0 {

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<String> f7359m = new ArrayDeque(10);

    public final boolean b(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!a.y0(intent)) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            d c = d.c();
            c.a();
            b.l.d.n.a.a aVar = (b.l.d.n.a.a) c.d.a(b.l.d.n.a.a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (aVar != null) {
                String stringExtra = intent.getStringExtra("google.c.a.c_id");
                aVar.a("fcm", "_ln", stringExtra);
                Bundle bundle = new Bundle();
                bundle.putString("source", "Firebase");
                bundle.putString(AnimationStrength.MEDIUM, "notification");
                bundle.putString("campaign", stringExtra);
                aVar.c("fcm", "_cmp", bundle);
            } else {
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
        a.l1("_no", intent);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r0.equals("deleted_messages") == false) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x005a
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0029
            boolean r0 = b.l.a.c.b.a.y0(r9)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "_nd"
            b.l.a.c.b.a.l1(r0, r9)
            return
        L_0x0029:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "token"
            r9.getStringExtra(r0)
            r8.f()
            return
        L_0x003a:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Unknown intent action: "
            java.lang.String r9 = r9.getAction()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x0051
            java.lang.String r9 = r1.concat(r9)
            goto L_0x0056
        L_0x0051:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x0056:
            android.util.Log.d(r0, r9)
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r9.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x006c
            r1 = 0
            b.l.a.c.k.h r1 = b.l.a.c.b.a.X(r1)
            goto L_0x008b
        L_0x006c:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "google.message_id"
            r1.putString(r2, r0)
            b.l.d.v.f r2 = b.l.d.v.f.b(r8)
            b.l.d.v.n r3 = new b.l.d.v.n
            monitor-enter(r2)
            int r4 = r2.d     // Catch:{ all -> 0x01c7 }
            int r5 = r4 + 1
            r2.d = r5     // Catch:{ all -> 0x01c7 }
            monitor-exit(r2)
            r3.<init>(r4, r1)
            b.l.a.c.k.h r1 = r2.a(r3)
        L_0x008b:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r4 = 3
            r5 = 1
            if (r2 == 0) goto L_0x0095
            goto L_0x00d0
        L_0x0095:
            java.util.Queue<java.lang.String> r2 = f7359m
            boolean r6 = r2.contains(r0)
            if (r6 == 0) goto L_0x00c2
            java.lang.String r2 = "FirebaseMessaging"
            boolean r2 = android.util.Log.isLoggable(r2, r4)
            if (r2 == 0) goto L_0x00c0
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r6 = "Received duplicate message: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r7 = r0.length()
            if (r7 == 0) goto L_0x00b8
            java.lang.String r0 = r6.concat(r0)
            goto L_0x00bd
        L_0x00b8:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6)
        L_0x00bd:
            android.util.Log.d(r2, r0)
        L_0x00c0:
            r0 = r5
            goto L_0x00d1
        L_0x00c2:
            int r6 = r2.size()
            r7 = 10
            if (r6 < r7) goto L_0x00cd
            r2.remove()
        L_0x00cd:
            r2.add(r0)
        L_0x00d0:
            r0 = r3
        L_0x00d1:
            if (r0 != 0) goto L_0x0199
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "gcm"
        L_0x00dd:
            r2 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -2062414158: goto L_0x0108;
                case 102161: goto L_0x00fd;
                case 814694033: goto L_0x00f2;
                case 814800675: goto L_0x00e7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            r3 = r2
            goto L_0x0111
        L_0x00e7:
            java.lang.String r3 = "send_event"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00f0
            goto L_0x00e5
        L_0x00f0:
            r3 = r4
            goto L_0x0111
        L_0x00f2:
            java.lang.String r3 = "send_error"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x00fb
            goto L_0x00e5
        L_0x00fb:
            r3 = 2
            goto L_0x0111
        L_0x00fd:
            java.lang.String r3 = "gcm"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0106
            goto L_0x00e5
        L_0x0106:
            r3 = r5
            goto L_0x0111
        L_0x0108:
            java.lang.String r4 = "deleted_messages"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0111
            goto L_0x00e5
        L_0x0111:
            switch(r3) {
                case 0: goto L_0x0199;
                case 1: goto L_0x0151;
                case 2: goto L_0x0135;
                case 3: goto L_0x012c;
                default: goto L_0x0114;
            }
        L_0x0114:
            java.lang.String r9 = "FirebaseMessaging"
            java.lang.String r2 = "Received message with unknown type: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0123
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0128
        L_0x0123:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0128:
            android.util.Log.w(r9, r0)
            goto L_0x0199
        L_0x012c:
            java.lang.String r0 = "google.message_id"
            r9.getStringExtra(r0)
            r8.e()
            goto L_0x0199
        L_0x0135:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r9.getStringExtra(r0)
            if (r0 != 0) goto L_0x0142
            java.lang.String r0 = "message_id"
            r9.getStringExtra(r0)
        L_0x0142:
            b.l.d.z.b r0 = new b.l.d.z.b
            java.lang.String r2 = "error"
            java.lang.String r9 = r9.getStringExtra(r2)
            r0.<init>(r9)
            r8.g()
            goto L_0x0199
        L_0x0151:
            boolean r0 = b.l.a.c.b.a.y0(r9)
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "_nr"
            b.l.a.c.b.a.l1(r0, r9)
        L_0x015c:
            android.os.Bundle r0 = r9.getExtras()
            if (r0 != 0) goto L_0x0167
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0167:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r0.remove(r2)
            boolean r2 = b.l.d.z.c.h(r0)
            if (r2 == 0) goto L_0x0196
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            b.l.d.z.d r3 = new b.l.d.z.d
            r3.<init>(r8, r0, r2)
            boolean r0 = r3.a()     // Catch:{ all -> 0x0191 }
            r2.shutdown()
            if (r0 == 0) goto L_0x0185
            goto L_0x0199
        L_0x0185:
            boolean r0 = b.l.a.c.b.a.y0(r9)
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = "_nf"
            b.l.a.c.b.a.l1(r0, r9)
            goto L_0x0196
        L_0x0191:
            r9 = move-exception
            r2.shutdown()
            throw r9
        L_0x0196:
            r8.d()
        L_0x0199:
            r2 = 1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x01a5, InterruptedException -> 0x01a3, TimeoutException -> 0x01a1 }
            b.l.a.c.b.a.c(r1, r2, r9)     // Catch:{ ExecutionException -> 0x01a5, InterruptedException -> 0x01a3, TimeoutException -> 0x01a1 }
            return
        L_0x01a1:
            r9 = move-exception
            goto L_0x01a6
        L_0x01a3:
            r9 = move-exception
            goto L_0x01a6
        L_0x01a5:
            r9 = move-exception
        L_0x01a6:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            int r1 = r1 + 20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Message ack failed: "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.w(r0, r9)
            return
        L_0x01c7:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    @WorkerThread
    public void d() {
    }

    @WorkerThread
    public void e() {
    }

    @WorkerThread
    public void f() {
    }

    @WorkerThread
    public void g() {
    }
}
