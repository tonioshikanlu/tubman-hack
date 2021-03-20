package b.p.b;

import b.p.b.a0.b;
import b.p.b.a0.g;
import b.p.b.a0.h;
import b.p.b.a0.k.p;
import com.amplitude.api.Constants;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static final i f6712g;
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6713b;
    public final long c;
    public Runnable d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final Deque<b.p.b.a0.l.a> f6714e = new ArrayDeque();
    public final g f = new g();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0079 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
            L_0x0000:
                b.p.b.i r0 = b.p.b.i.this
                long r1 = java.lang.System.nanoTime()
                monitor-enter(r0)
                java.util.Deque<b.p.b.a0.l.a> r3 = r0.f6714e     // Catch:{ all -> 0x007d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007d }
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0014:
                boolean r9 = r3.hasNext()     // Catch:{ all -> 0x007d }
                if (r9 == 0) goto L_0x0036
                java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x007d }
                b.p.b.a0.l.a r9 = (b.p.b.a0.l.a) r9     // Catch:{ all -> 0x007d }
                int r10 = r0.a(r9, r1)     // Catch:{ all -> 0x007d }
                if (r10 <= 0) goto L_0x0029
                int r5 = r5 + 1
                goto L_0x0014
            L_0x0029:
                int r4 = r4 + 1
                long r10 = r9.f6680l     // Catch:{ all -> 0x007d }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x0014
                r6 = r9
                r7 = r10
                goto L_0x0014
            L_0x0036:
                long r1 = r0.c     // Catch:{ all -> 0x007d }
                int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                r9 = -1
                r11 = 0
                if (r3 >= 0) goto L_0x0051
                int r3 = r0.f6713b     // Catch:{ all -> 0x007d }
                if (r4 <= r3) goto L_0x0045
                goto L_0x0051
            L_0x0045:
                if (r4 <= 0) goto L_0x004a
                long r1 = r1 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                goto L_0x005d
            L_0x004a:
                if (r5 <= 0) goto L_0x004e
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                goto L_0x005d
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                r1 = r9
                goto L_0x005d
            L_0x0051:
                java.util.Deque<b.p.b.a0.l.a> r1 = r0.f6714e     // Catch:{ all -> 0x007d }
                r1.remove(r6)     // Catch:{ all -> 0x007d }
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                java.net.Socket r0 = r6.c
                b.p.b.a0.i.d(r0)
                r1 = r11
            L_0x005d:
                int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0062
                return
            L_0x0062:
                int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x0000
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r1 / r3
                long r3 = r3 * r5
                long r1 = r1 - r3
                b.p.b.i r0 = b.p.b.i.this
                monitor-enter(r0)
                b.p.b.i r3 = b.p.b.i.this     // Catch:{ InterruptedException -> 0x0079 }
                int r1 = (int) r1     // Catch:{ InterruptedException -> 0x0079 }
                r3.wait(r5, r1)     // Catch:{ InterruptedException -> 0x0079 }
                goto L_0x0079
            L_0x0077:
                r1 = move-exception
                goto L_0x007b
            L_0x0079:
                monitor-exit(r0)     // Catch:{ all -> 0x0077 }
                goto L_0x0000
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x0077 }
                throw r1
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.i.a.run():void");
        }
    }

    static {
        i iVar;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
        if (property != null && !Boolean.parseBoolean(property)) {
            iVar = new i(0, parseLong);
        } else if (property3 != null) {
            int parseInt = Integer.parseInt(property3);
        } else {
            iVar = new i(5, parseLong);
        }
        f6712g = iVar;
    }

    public i(int i2, long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = b.p.b.a0.i.a;
        this.a = new ThreadPoolExecutor(0, 1, 60, timeUnit2, linkedBlockingQueue, new h("OkHttp ConnectionPool", true));
        this.f6713b = i2;
        this.c = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException(b.e.a.a.a.j("keepAliveDuration <= 0: ", j2));
        }
    }

    public final int a(b.p.b.a0.l.a aVar, long j2) {
        List<Reference<p>> list = aVar.f6678j;
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).get() != null) {
                i2++;
            } else {
                Logger logger = b.a;
                StringBuilder y = b.e.a.a.a.y("A connection to ");
                y.append(aVar.a.a.a);
                y.append(" was leaked. Did you forget to close a response body?");
                logger.warning(y.toString());
                list.remove(i2);
                aVar.f6679k = true;
                if (list.isEmpty()) {
                    aVar.f6680l = j2 - this.c;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
