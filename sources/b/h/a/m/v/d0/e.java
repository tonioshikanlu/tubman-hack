package b.h.a.m.v.d0;

import android.util.Log;
import b.h.a.k.a;
import b.h.a.m.m;
import java.io.File;
import java.io.IOException;

public class e implements a {
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final File f661b;
    public final long c;
    public final c d = new c();

    /* renamed from: e  reason: collision with root package name */
    public a f662e;

    @Deprecated
    public e(File file, long j2) {
        this.f661b = file;
        this.c = j2;
        this.a = new k();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.h.a.m.m r6, b.h.a.m.v.d0.a.b r7) {
        /*
            r5 = this;
            b.h.a.m.v.d0.k r0 = r5.a
            java.lang.String r0 = r0.a(r6)
            b.h.a.m.v.d0.c r1 = r5.d
            monitor-enter(r1)
            java.util.Map<java.lang.String, b.h.a.m.v.d0.c$a> r2 = r1.a     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00d5 }
            b.h.a.m.v.d0.c$a r2 = (b.h.a.m.v.d0.c.a) r2     // Catch:{ all -> 0x00d5 }
            if (r2 != 0) goto L_0x0031
            b.h.a.m.v.d0.c$b r2 = r1.f658b     // Catch:{ all -> 0x00d5 }
            java.util.Queue<b.h.a.m.v.d0.c$a> r3 = r2.a     // Catch:{ all -> 0x00d5 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d5 }
            java.util.Queue<b.h.a.m.v.d0.c$a> r2 = r2.a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            b.h.a.m.v.d0.c$a r2 = (b.h.a.m.v.d0.c.a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            b.h.a.m.v.d0.c$a r2 = new b.h.a.m.v.d0.c$a     // Catch:{ all -> 0x00d5 }
            r2.<init>()     // Catch:{ all -> 0x00d5 }
        L_0x0028:
            java.util.Map<java.lang.String, b.h.a.m.v.d0.c$a> r3 = r1.a     // Catch:{ all -> 0x00d5 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00d5 }
        L_0x0031:
            int r3 = r2.f659b     // Catch:{ all -> 0x00d5 }
            r4 = 1
            int r3 = r3 + r4
            r2.f659b = r3     // Catch:{ all -> 0x00d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.locks.Lock r1 = r2.a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x00ce }
            r2.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ce }
            android.util.Log.v(r1, r6)     // Catch:{ all -> 0x00ce }
        L_0x0064:
            b.h.a.k.a r6 = r5.c()     // Catch:{ IOException -> 0x00bc }
            b.h.a.k.a$e r1 = r6.O(r0)     // Catch:{ IOException -> 0x00bc }
            if (r1 == 0) goto L_0x0074
        L_0x006e:
            b.h.a.m.v.d0.c r6 = r5.d
            r6.a(r0)
            return
        L_0x0074:
            b.h.a.k.a$c r6 = r6.H(r0)     // Catch:{ IOException -> 0x00bc }
            if (r6 == 0) goto L_0x00a5
            r1 = 0
            java.io.File r1 = r6.b(r1)     // Catch:{ all -> 0x009c }
            b.h.a.m.v.f r7 = (b.h.a.m.v.f) r7     // Catch:{ all -> 0x009c }
            b.h.a.m.d<DataType> r2 = r7.a     // Catch:{ all -> 0x009c }
            DataType r3 = r7.f677b     // Catch:{ all -> 0x009c }
            b.h.a.m.p r7 = r7.c     // Catch:{ all -> 0x009c }
            boolean r7 = r2.a(r3, r1, r7)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x0094
            b.h.a.k.a r7 = b.h.a.k.a.this     // Catch:{ all -> 0x009c }
            b.h.a.k.a.b(r7, r6, r4)     // Catch:{ all -> 0x009c }
            r6.c = r4     // Catch:{ all -> 0x009c }
        L_0x0094:
            boolean r7 = r6.c     // Catch:{ IOException -> 0x00bc }
            if (r7 != 0) goto L_0x006e
            r6.a()     // Catch:{ IOException -> 0x006e }
            goto L_0x006e
        L_0x009c:
            r7 = move-exception
            boolean r1 = r6.c     // Catch:{ IOException -> 0x00bc }
            if (r1 != 0) goto L_0x00a4
            r6.a()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r7     // Catch:{ IOException -> 0x00bc }
        L_0x00a5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bc }
            r7.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00bc }
            r7.append(r0)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00bc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc }
            throw r6     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00ce }
            if (r7 == 0) goto L_0x006e
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00ce }
            goto L_0x006e
        L_0x00ce:
            r6 = move-exception
            b.h.a.m.v.d0.c r7 = r5.d
            r7.a(r0)
            throw r6
        L_0x00d5:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.d0.e.a(b.h.a.m.m, b.h.a.m.v.d0.a$b):void");
    }

    public File b(m mVar) {
        String a2 = this.a.a(mVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a2 + " for for Key: " + mVar);
        }
        try {
            a.e O = c().O(a2);
            if (O != null) {
                return O.a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    public final synchronized a c() {
        if (this.f662e == null) {
            this.f662e = a.Y(this.f661b, 1, 1, this.c);
        }
        return this.f662e;
    }
}
