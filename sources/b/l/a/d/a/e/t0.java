package b.l.a.d.a.e;

import android.os.IInterface;

public abstract class t0 extends h0 implements IInterface {
    public t0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: b.l.a.d.a.e.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.l.a.d.a.e.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: b.l.a.d.a.e.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: b.l.a.d.a.e.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: b.l.a.d.a.e.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: b.l.a.d.a.e.u0} */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.content.ComponentName] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.content.ComponentName] */
    /* JADX WARNING: type inference failed for: r10v11, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r9, android.os.Parcel r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 3
            if (r9 == r0) goto L_0x0066
            if (r9 == r4) goto L_0x000a
            return r3
        L_0x000a:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = b.l.a.d.a.e.i0.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x0019
            goto L_0x002c
        L_0x0019:
            java.lang.String r10 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r0 = r10 instanceof b.l.a.d.a.e.v0
            if (r0 == 0) goto L_0x0027
            r2 = r10
            b.l.a.d.a.e.v0 r2 = (b.l.a.d.a.e.v0) r2
            goto L_0x002c
        L_0x0027:
            b.l.a.d.a.e.u0 r2 = new b.l.a.d.a.e.u0
            r2.<init>(r9)
        L_0x002c:
            r9 = r8
            b.l.a.d.a.b.y r9 = (b.l.a.d.a.b.y) r9
            b.l.a.d.a.e.f r10 = r9.a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "clearAssetPackStorage AIDL call"
            r10.b(r4, r3, r0)
            android.content.Context r10 = r9.f4649b
            boolean r10 = b.l.a.d.a.e.r.a(r10)
            if (r10 == 0) goto L_0x005c
            android.content.Context r10 = r9.f4649b
            boolean r10 = b.l.a.d.a.e.r.b(r10)
            if (r10 != 0) goto L_0x0049
            goto L_0x005c
        L_0x0049:
            b.l.a.d.a.b.t r9 = r9.c
            java.io.File r9 = r9.g()
            b.l.a.d.a.b.t.h(r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r2.J(r9)
            goto L_0x0149
        L_0x005c:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r2.l0(r9)
            goto L_0x0149
        L_0x0066:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = b.l.a.d.a.e.i0.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.IBinder r10 = r10.readStrongBinder()
            if (r10 != 0) goto L_0x0076
            r0 = r2
            goto L_0x0088
        L_0x0076:
            java.lang.String r0 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r5 = r0 instanceof b.l.a.d.a.e.v0
            if (r5 == 0) goto L_0x0083
            b.l.a.d.a.e.v0 r0 = (b.l.a.d.a.e.v0) r0
            goto L_0x0088
        L_0x0083:
            b.l.a.d.a.e.u0 r0 = new b.l.a.d.a.e.u0
            r0.<init>(r10)
        L_0x0088:
            r10 = r8
            b.l.a.d.a.b.y r10 = (b.l.a.d.a.b.y) r10
            b.l.a.d.a.e.f r5 = r10.a
            java.lang.String r6 = "updateServiceState AIDL call"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r5.b(r4, r6, r7)
            android.content.Context r4 = r10.f4649b
            boolean r4 = b.l.a.d.a.e.r.a(r4)
            if (r4 == 0) goto L_0x0141
            android.content.Context r4 = r10.f4649b
            boolean r4 = b.l.a.d.a.e.r.b(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x0141
        L_0x00a6:
            monitor-enter(r10)
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x013e }
            android.content.Context r5 = r10.f4649b     // Catch:{ all -> 0x013e }
            java.lang.Class<com.google.android.play.core.assetpacks.ExtractionForegroundService> r6 = com.google.android.play.core.assetpacks.ExtractionForegroundService.class
            r4.<init>(r5, r6)     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "action_type"
            int r5 = r9.getInt(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = "action_type"
            r4.putExtra(r6, r5)     // Catch:{ all -> 0x013e }
            if (r5 != r1) goto L_0x0103
            java.lang.String r5 = "notification_channel_name"
            java.lang.String r6 = "notification_channel_name"
            java.lang.String r6 = r9.getString(r6)     // Catch:{ all -> 0x013e }
            r4.putExtra(r5, r6)     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "notification_title"
            java.lang.String r6 = "notification_title"
            java.lang.String r6 = r9.getString(r6)     // Catch:{ all -> 0x013e }
            r4.putExtra(r5, r6)     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "notification_subtext"
            java.lang.String r6 = "notification_subtext"
            java.lang.String r6 = r9.getString(r6)     // Catch:{ all -> 0x013e }
            r4.putExtra(r5, r6)     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "notification_timeout"
            java.lang.String r6 = "notification_timeout"
            long r6 = r9.getLong(r6)     // Catch:{ all -> 0x013e }
            r4.putExtra(r5, r6)     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "notification_on_click_intent"
            android.os.Parcelable r5 = r9.getParcelable(r5)     // Catch:{ all -> 0x013e }
            boolean r6 = r5 instanceof android.app.PendingIntent     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x00f8
            java.lang.String r6 = "notification_on_click_intent"
            r4.putExtra(r6, r5)     // Catch:{ all -> 0x013e }
        L_0x00f8:
            java.lang.String r5 = "notification_color"
            java.lang.String r6 = "notification_color"
            int r9 = r9.getInt(r6)     // Catch:{ all -> 0x013e }
            r4.putExtra(r5, r9)     // Catch:{ all -> 0x013e }
        L_0x0103:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0119, IllegalStateException -> 0x0117 }
            r5 = 26
            if (r9 < r5) goto L_0x0110
            android.content.Context r9 = r10.f4649b     // Catch:{ SecurityException -> 0x0119, IllegalStateException -> 0x0117 }
            android.content.ComponentName r2 = r9.startForegroundService(r4)     // Catch:{ SecurityException -> 0x0119, IllegalStateException -> 0x0117 }
            goto L_0x0123
        L_0x0110:
            android.content.Context r9 = r10.f4649b     // Catch:{ SecurityException -> 0x0119, IllegalStateException -> 0x0117 }
            android.content.ComponentName r2 = r9.startService(r4)     // Catch:{ SecurityException -> 0x0119, IllegalStateException -> 0x0117 }
            goto L_0x0123
        L_0x0117:
            r9 = move-exception
            goto L_0x011a
        L_0x0119:
            r9 = move-exception
        L_0x011a:
            b.l.a.d.a.e.f r4 = r10.a     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "Failed starting installation service."
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x013e }
            r4.a(r9, r5, r6)     // Catch:{ all -> 0x013e }
        L_0x0123:
            if (r2 != 0) goto L_0x012f
            b.l.a.d.a.e.f r9 = r10.a     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "Failed starting installation service."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x013e }
            r4 = 6
            r9.b(r4, r2, r3)     // Catch:{ all -> 0x013e }
        L_0x012f:
            monitor-exit(r10)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r0.F(r9, r10)
            goto L_0x0149
        L_0x013e:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L_0x0141:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r0.l0(r9)
        L_0x0149:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.e.t0.g(int, android.os.Parcel):boolean");
    }
}
