package o;

import e.x.c.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class b extends a0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f10442h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f10443i;

    /* renamed from: j  reason: collision with root package name */
    public static b f10444j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f10445k = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public boolean f10446e;
    public b f;

    /* renamed from: g  reason: collision with root package name */
    public long f10447g;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final b a() {
            Class<b> cls = b.class;
            b bVar = b.f10444j;
            i.c(bVar);
            b bVar2 = bVar.f;
            long nanoTime = System.nanoTime();
            if (bVar2 == null) {
                cls.wait(b.f10442h);
                b bVar3 = b.f10444j;
                i.c(bVar3);
                if (bVar3.f != null || System.nanoTime() - nanoTime < b.f10443i) {
                    return null;
                }
                return b.f10444j;
            }
            long j2 = bVar2.f10447g - nanoTime;
            if (j2 > 0) {
                long j3 = j2 / 1000000;
                cls.wait(j3, (int) (j2 - (1000000 * j3)));
                return null;
            }
            b bVar4 = b.f10444j;
            i.c(bVar4);
            bVar4.f = bVar2.f;
            bVar2.f = null;
            return bVar2;
        }
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    public static final class C0240b extends Thread {
        public C0240b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o.b> r0 = o.b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                o.b$a r1 = o.b.f10445k     // Catch:{ all -> 0x0019 }
                o.b r1 = r1.a()     // Catch:{ all -> 0x0019 }
                o.b r2 = o.b.f10444j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                o.b.f10444j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: o.b.C0240b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f10442h = millis;
        f10443i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[EDGE_INSN: B:40:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r9 = this;
            boolean r0 = r9.f10446e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0079
            long r2 = r9.c
            boolean r0 = r9.a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0013
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            r9.f10446e = r1
            java.lang.Class<o.b> r1 = o.b.class
            monitor-enter(r1)
            o.b r5 = f10444j     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x002b
            o.b r5 = new o.b     // Catch:{ all -> 0x0076 }
            r5.<init>()     // Catch:{ all -> 0x0076 }
            f10444j = r5     // Catch:{ all -> 0x0076 }
            o.b$b r5 = new o.b$b     // Catch:{ all -> 0x0076 }
            r5.<init>()     // Catch:{ all -> 0x0076 }
            r5.start()     // Catch:{ all -> 0x0076 }
        L_0x002b:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x003d
            long r7 = r9.c()     // Catch:{ all -> 0x0076 }
            long r7 = r7 - r5
            long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0076 }
            goto L_0x003f
        L_0x003d:
            if (r4 == 0) goto L_0x0041
        L_0x003f:
            long r2 = r2 + r5
            goto L_0x0047
        L_0x0041:
            if (r0 == 0) goto L_0x0070
            long r2 = r9.c()     // Catch:{ all -> 0x0076 }
        L_0x0047:
            r9.f10447g = r2     // Catch:{ all -> 0x0076 }
            long r2 = r2 - r5
            o.b r0 = f10444j     // Catch:{ all -> 0x0076 }
        L_0x004c:
            e.x.c.i.c(r0)     // Catch:{ all -> 0x0076 }
            o.b r4 = r0.f     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x0061
            e.x.c.i.c(r4)     // Catch:{ all -> 0x0076 }
            long r7 = r4.f10447g     // Catch:{ all -> 0x0076 }
            long r7 = r7 - r5
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            o.b r0 = r0.f     // Catch:{ all -> 0x0076 }
            goto L_0x004c
        L_0x0061:
            o.b r2 = r0.f     // Catch:{ all -> 0x0076 }
            r9.f = r2     // Catch:{ all -> 0x0076 }
            r0.f = r9     // Catch:{ all -> 0x0076 }
            o.b r2 = f10444j     // Catch:{ all -> 0x0076 }
            if (r0 != r2) goto L_0x006e
            r1.notify()     // Catch:{ all -> 0x0076 }
        L_0x006e:
            monitor-exit(r1)
            return
        L_0x0070:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0076 }
            r0.<init>()     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0079:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.h():void");
    }

    public final boolean i() {
        boolean z = false;
        if (!this.f10446e) {
            return false;
        }
        this.f10446e = false;
        synchronized (b.class) {
            b bVar = f10444j;
            while (true) {
                if (bVar == null) {
                    z = true;
                    break;
                }
                b bVar2 = bVar.f;
                if (bVar2 == this) {
                    bVar.f = this.f;
                    this.f = null;
                    break;
                }
                bVar = bVar2;
            }
        }
        return z;
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
