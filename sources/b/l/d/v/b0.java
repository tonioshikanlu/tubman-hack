package b.l.d.v;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import b.l.a.c.k.i;
import java.util.Map;

public final class b0 {
    @GuardedBy("this")
    public int a = 0;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, i<Void>> f5304b = new ArrayMap();
    @GuardedBy("itself")
    public final x c;

    public b0(x xVar) {
        this.c = xVar;
    }

    @GuardedBy("this")
    @Nullable
    public final String a() {
        String b2;
        synchronized (this.c) {
            b2 = this.c.b();
        }
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        String[] split = b2.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = r0.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3.length != 2) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r4 = r3[0];
        r3 = r3[1];
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r7 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r7 == 83) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r7 == 85) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r4.equals("U") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r4.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r5 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r5 == 1) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = r10.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        if (r10.h(r5) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        r10.d(r10.d.a(com.google.firebase.iid.FirebaseInstanceId.l(), r5.a, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.n() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r3 = "unsubscribe operation succeeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r5 = r10.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r10.h(r5) != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        r10.d(r10.d.b(com.google.firebase.iid.FirebaseInstanceId.l(), r5.a, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.n() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r3 = "subscribe operation succeeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        android.util.Log.d("FirebaseInstanceId", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r3 = java.lang.String.valueOf(r3.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r3.length() != 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r3 = "Topic sync failed: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        r3 = new java.lang.String("Topic sync failed: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        android.util.Log.e("FirebaseInstanceId", r3);
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
        if (r2 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r2 = r9.f5304b.remove(java.lang.Integer.valueOf(r9.a));
        c(r0);
        r9.a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r2 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        r2.a.q(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.google.firebase.iid.FirebaseInstanceId r10) {
        /*
            r9 = this;
        L_0x0000:
            monitor-enter(r9)
            java.lang.String r0 = r9.a()     // Catch:{ all -> 0x00ee }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r10 = com.google.firebase.iid.FirebaseInstanceId.n()     // Catch:{ all -> 0x00ee }
            if (r10 == 0) goto L_0x0015
            java.lang.String r10 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r10, r0)     // Catch:{ all -> 0x00ee }
        L_0x0015:
            monitor-exit(r9)     // Catch:{ all -> 0x00ee }
            return r1
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "!"
            java.lang.String[] r3 = r0.split(r3)
            int r4 = r3.length
            r5 = 2
            r6 = 0
            if (r4 != r5) goto L_0x00c5
            r4 = r3[r6]
            r3 = r3[r1]
            r5 = -1
            int r7 = r4.hashCode()     // Catch:{ IOException -> 0x00a5 }
            r8 = 83
            if (r7 == r8) goto L_0x0041
            r8 = 85
            if (r7 == r8) goto L_0x0037
            goto L_0x004a
        L_0x0037:
            java.lang.String r7 = "U"
            boolean r4 = r4.equals(r7)     // Catch:{ IOException -> 0x00a5 }
            if (r4 == 0) goto L_0x004a
            r5 = r1
            goto L_0x004a
        L_0x0041:
            java.lang.String r7 = "S"
            boolean r4 = r4.equals(r7)     // Catch:{ IOException -> 0x00a5 }
            if (r4 == 0) goto L_0x004a
            r5 = r6
        L_0x004a:
            java.lang.String r4 = "token not available"
            if (r5 == 0) goto L_0x007a
            if (r5 == r1) goto L_0x0052
            goto L_0x00c5
        L_0x0052:
            b.l.d.v.a0 r5 = r10.m()     // Catch:{ IOException -> 0x00a5 }
            boolean r7 = r10.h(r5)     // Catch:{ IOException -> 0x00a5 }
            if (r7 != 0) goto L_0x0074
            java.lang.String r4 = com.google.firebase.iid.FirebaseInstanceId.l()     // Catch:{ IOException -> 0x00a5 }
            b.l.d.v.b r7 = r10.d     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r5 = r5.a     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.k.h r3 = r7.a(r4, r5, r3)     // Catch:{ IOException -> 0x00a5 }
            r10.d(r3)     // Catch:{ IOException -> 0x00a5 }
            boolean r3 = com.google.firebase.iid.FirebaseInstanceId.n()     // Catch:{ IOException -> 0x00a5 }
            if (r3 == 0) goto L_0x00c5
            java.lang.String r3 = "unsubscribe operation succeeded"
            goto L_0x009b
        L_0x0074:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x00a5 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00a5 }
            throw r3     // Catch:{ IOException -> 0x00a5 }
        L_0x007a:
            b.l.d.v.a0 r5 = r10.m()     // Catch:{ IOException -> 0x00a5 }
            boolean r7 = r10.h(r5)     // Catch:{ IOException -> 0x00a5 }
            if (r7 != 0) goto L_0x009f
            java.lang.String r4 = com.google.firebase.iid.FirebaseInstanceId.l()     // Catch:{ IOException -> 0x00a5 }
            java.lang.String r5 = r5.a     // Catch:{ IOException -> 0x00a5 }
            b.l.d.v.b r7 = r10.d     // Catch:{ IOException -> 0x00a5 }
            b.l.a.c.k.h r3 = r7.b(r4, r5, r3)     // Catch:{ IOException -> 0x00a5 }
            r10.d(r3)     // Catch:{ IOException -> 0x00a5 }
            boolean r3 = com.google.firebase.iid.FirebaseInstanceId.n()     // Catch:{ IOException -> 0x00a5 }
            if (r3 == 0) goto L_0x00c5
            java.lang.String r3 = "subscribe operation succeeded"
        L_0x009b:
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00c5
        L_0x009f:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x00a5 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00a5 }
            throw r3     // Catch:{ IOException -> 0x00a5 }
        L_0x00a5:
            r3 = move-exception
            java.lang.String r4 = "Topic sync failed: "
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            if (r5 == 0) goto L_0x00bb
            java.lang.String r3 = r4.concat(r3)
            goto L_0x00c0
        L_0x00bb:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x00c0:
            android.util.Log.e(r2, r3)
            r2 = r6
            goto L_0x00c6
        L_0x00c5:
            r2 = r1
        L_0x00c6:
            if (r2 != 0) goto L_0x00c9
            return r6
        L_0x00c9:
            monitor-enter(r9)
            java.util.Map<java.lang.Integer, b.l.a.c.k.i<java.lang.Void>> r2 = r9.f5304b     // Catch:{ all -> 0x00eb }
            int r3 = r9.a     // Catch:{ all -> 0x00eb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00eb }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x00eb }
            b.l.a.c.k.i r2 = (b.l.a.c.k.i) r2     // Catch:{ all -> 0x00eb }
            r9.c(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r9.a     // Catch:{ all -> 0x00eb }
            int r0 = r0 + r1
            r9.a = r0     // Catch:{ all -> 0x00eb }
            monitor-exit(r9)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            b.l.a.c.k.e0<TResult> r1 = r2.a
            r1.q(r0)
            goto L_0x0000
        L_0x00eb:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00eb }
            throw r10
        L_0x00ee:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ee }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.b0.b(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    public final synchronized boolean c(String str) {
        synchronized (this.c) {
            String b2 = this.c.b();
            if (!b2.startsWith(str.length() != 0 ? ",".concat(str) : new String(","))) {
                return false;
            }
            String substring = b2.substring((str.length() != 0 ? ",".concat(str) : new String(",")).length());
            x xVar = this.c;
            synchronized (xVar) {
                xVar.a.edit().putString("topic_operation_queue", substring).apply();
            }
            return true;
        }
    }
}
