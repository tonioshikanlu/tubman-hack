package com.google.android.play.core.assetpacks;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import b.l.a.d.a.b.c2;
import b.l.a.d.a.b.d0;
import b.l.a.d.a.b.e1;
import b.l.a.d.a.e.f;
import java.util.Objects;

public class ExtractionForegroundService extends Service {

    /* renamed from: h  reason: collision with root package name */
    public final f f7323h = new f("ExtractionForegroundService");

    /* renamed from: i  reason: collision with root package name */
    public Context f7324i;

    /* renamed from: j  reason: collision with root package name */
    public c2 f7325j;

    /* renamed from: k  reason: collision with root package name */
    public NotificationManager f7326k;

    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        d0 h2 = e1.h(getApplicationContext());
        Context context = h2.a.a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        this.f7324i = context;
        this.f7325j = h2.y.a();
        this.f7326k = (NotificationManager) this.f7324i.getSystemService("notification");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
            r12 = this;
            java.lang.String r14 = "action_type"
            r15 = 0
            int r14 = r13.getIntExtra(r14, r15)
            r0 = 4
            r1 = 2
            r2 = 1
            if (r14 != r2) goto L_0x00a5
            monitor-enter(r12)
            java.lang.String r14 = "notification_title"
            java.lang.String r14 = r13.getStringExtra(r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "notification_subtext"
            java.lang.String r3 = r13.getStringExtra(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = "notification_timeout"
            r5 = 1
            long r4 = r13.getLongExtra(r4, r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r6 = "notification_on_click_intent"
            android.os.Parcelable r6 = r13.getParcelableExtra(r6)     // Catch:{ all -> 0x00a2 }
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6     // Catch:{ all -> 0x00a2 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a2 }
            r8 = 26
            if (r7 < r8) goto L_0x003d
            android.app.Notification$Builder r9 = new android.app.Notification$Builder     // Catch:{ all -> 0x00a2 }
            android.content.Context r10 = r12.f7324i     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = "playcore-assetpacks-service-notification-channel"
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00a2 }
            android.app.Notification$Builder r4 = r9.setTimeoutAfter(r4)     // Catch:{ all -> 0x00a2 }
            goto L_0x0049
        L_0x003d:
            android.app.Notification$Builder r4 = new android.app.Notification$Builder     // Catch:{ all -> 0x00a2 }
            android.content.Context r5 = r12.f7324i     // Catch:{ all -> 0x00a2 }
            r4.<init>(r5)     // Catch:{ all -> 0x00a2 }
            r5 = -2
            android.app.Notification$Builder r4 = r4.setPriority(r5)     // Catch:{ all -> 0x00a2 }
        L_0x0049:
            if (r6 == 0) goto L_0x004e
            r4.setContentIntent(r6)     // Catch:{ all -> 0x00a2 }
        L_0x004e:
            r5 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r5 = r4.setSmallIcon(r5)     // Catch:{ all -> 0x00a2 }
            android.app.Notification$Builder r5 = r5.setOngoing(r15)     // Catch:{ all -> 0x00a2 }
            android.app.Notification$Builder r14 = r5.setContentTitle(r14)     // Catch:{ all -> 0x00a2 }
            r14.setSubText(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r14 = "notification_color"
            int r14 = r13.getIntExtra(r14, r15)     // Catch:{ all -> 0x00a2 }
            android.app.Notification$Builder r14 = r4.setColor(r14)     // Catch:{ all -> 0x00a2 }
            r3 = -1
            r14.setVisibility(r3)     // Catch:{ all -> 0x00a2 }
            android.app.Notification r14 = r4.build()     // Catch:{ all -> 0x00a2 }
            b.l.a.d.a.e.f r3 = r12.f7323h     // Catch:{ all -> 0x00a2 }
            java.lang.String r4 = "Starting foreground installation service."
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x00a2 }
            r3.b(r0, r4, r15)     // Catch:{ all -> 0x00a2 }
            b.l.a.d.a.b.c2 r15 = r12.f7325j     // Catch:{ all -> 0x00a2 }
            r15.a(r2)     // Catch:{ all -> 0x00a2 }
            if (r7 < r8) goto L_0x009a
            java.lang.String r15 = "notification_channel_name"
            java.lang.String r13 = r13.getStringExtra(r15)     // Catch:{ all -> 0x00a2 }
            monitor-enter(r12)     // Catch:{ all -> 0x00a2 }
            android.app.NotificationChannel r15 = new android.app.NotificationChannel     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "playcore-assetpacks-service-notification-channel"
            r15.<init>(r0, r13, r1)     // Catch:{ all -> 0x0097 }
            android.app.NotificationManager r13 = r12.f7326k     // Catch:{ all -> 0x0097 }
            r13.createNotificationChannel(r15)     // Catch:{ all -> 0x0097 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a2 }
            goto L_0x009a
        L_0x0097:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a2 }
            throw r13     // Catch:{ all -> 0x00a2 }
        L_0x009a:
            r13 = -1883842196(0xffffffff8fb6d96c, float:-1.8030333E-29)
            r12.startForeground(r13, r14)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r12)
            goto L_0x00d1
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        L_0x00a5:
            if (r14 != r1) goto L_0x00c1
            monitor-enter(r12)
            b.l.a.d.a.e.f r13 = r12.f7323h     // Catch:{ all -> 0x00be }
            java.lang.String r14 = "Stopping service."
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x00be }
            r13.b(r0, r14, r3)     // Catch:{ all -> 0x00be }
            b.l.a.d.a.b.c2 r13 = r12.f7325j     // Catch:{ all -> 0x00be }
            r13.a(r15)     // Catch:{ all -> 0x00be }
            r12.stopForeground(r2)     // Catch:{ all -> 0x00be }
            r12.stopSelf()     // Catch:{ all -> 0x00be }
            monitor-exit(r12)
            goto L_0x00d1
        L_0x00be:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        L_0x00c1:
            b.l.a.d.a.e.f r13 = r12.f7323h
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r15] = r14
            java.lang.String r14 = "Unknown action type received: %d"
            r15 = 6
            r13.b(r15, r14, r0)
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.ExtractionForegroundService.onStartCommand(android.content.Intent, int, int):int");
    }
}
