package n.m0.g;

import androidx.core.app.NotificationCompat;
import e.x.c.i;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import n.k0;
import n.m0.f.c;
import n.m0.f.d;
import n.m0.g.e;
import n.m0.k.h;

public final class j {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final c f10217b;
    public final a c = new a(this, b.e.a.a.a.q(new StringBuilder(), n.m0.c.f10152g, " ConnectionPool"));
    public final ConcurrentLinkedQueue<i> d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    public final int f10218e;

    public static final class a extends n.m0.f.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ j f10219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(str, true);
            this.f10219e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
            r1 = r6.c;
            e.x.c.i.c(r1);
            n.m0.c.e(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
            if (r0.d.isEmpty() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
            r0.f10217b.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a() {
            /*
                r13 = this;
                n.m0.g.j r0 = r13.f10219e
                long r1 = java.lang.System.nanoTime()
                java.util.concurrent.ConcurrentLinkedQueue<n.m0.g.i> r3 = r0.d
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0013:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x003f
                java.lang.Object r9 = r3.next()
                n.m0.g.i r9 = (n.m0.g.i) r9
                java.lang.String r10 = "connection"
                e.x.c.i.d(r9, r10)
                monitor-enter(r9)
                int r10 = r0.b(r9, r1)     // Catch:{ all -> 0x003c }
                if (r10 <= 0) goto L_0x002e
                int r5 = r5 + 1
                goto L_0x003a
            L_0x002e:
                int r4 = r4 + 1
                long r10 = r9.f10215p     // Catch:{ all -> 0x003c }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x003a
                r6 = r9
                r7 = r10
            L_0x003a:
                monitor-exit(r9)
                goto L_0x0013
            L_0x003c:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L_0x003f:
                long r9 = r0.a
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.f10218e
                if (r4 <= r3) goto L_0x004a
                goto L_0x0054
            L_0x004a:
                if (r4 <= 0) goto L_0x004e
                long r9 = r9 - r7
                goto L_0x008b
            L_0x004e:
                if (r5 <= 0) goto L_0x0051
                goto L_0x008b
            L_0x0051:
                r9 = -1
                goto L_0x008b
            L_0x0054:
                e.x.c.i.c(r6)
                monitor-enter(r6)
                java.util.List<java.lang.ref.Reference<n.m0.g.e>> r3 = r6.f10214o     // Catch:{ all -> 0x008c }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008c }
                r4 = 1
                r3 = r3 ^ r4
                r9 = 0
                if (r3 == 0) goto L_0x0066
            L_0x0064:
                monitor-exit(r6)
                goto L_0x008b
            L_0x0066:
                long r11 = r6.f10215p     // Catch:{ all -> 0x008c }
                long r11 = r11 + r7
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x006e
                goto L_0x0064
            L_0x006e:
                r6.f10208i = r4     // Catch:{ all -> 0x008c }
                java.util.concurrent.ConcurrentLinkedQueue<n.m0.g.i> r1 = r0.d     // Catch:{ all -> 0x008c }
                r1.remove(r6)     // Catch:{ all -> 0x008c }
                monitor-exit(r6)
                java.net.Socket r1 = r6.c
                e.x.c.i.c(r1)
                n.m0.c.e(r1)
                java.util.concurrent.ConcurrentLinkedQueue<n.m0.g.i> r1 = r0.d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x008b
                n.m0.f.c r0 = r0.f10217b
                r0.a()
            L_0x008b:
                return r9
            L_0x008c:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.g.j.a.a():long");
        }
    }

    public j(d dVar, int i2, long j2, TimeUnit timeUnit) {
        i.e(dVar, "taskRunner");
        i.e(timeUnit, "timeUnit");
        this.f10218e = i2;
        this.a = timeUnit.toNanos(j2);
        this.f10217b = dVar.f();
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(b.e.a.a.a.j("keepAliveDuration <= 0: ", j2).toString());
        }
    }

    public final boolean a(n.a aVar, e eVar, List<k0> list, boolean z) {
        i.e(aVar, "address");
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        Iterator<i> it = this.d.iterator();
        while (it.hasNext()) {
            i next = it.next();
            i.d(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.j()) {
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.b(next);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(i iVar, long j2) {
        byte[] bArr = n.m0.c.a;
        List<Reference<e>> list = iVar.f10214o;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder y = b.e.a.a.a.y("A connection to ");
                y.append(iVar.f10216q.a.a);
                y.append(" was leaked. ");
                y.append("Did you forget to close a response body?");
                String sb = y.toString();
                h.a aVar = h.c;
                h.a.k(sb, ((e.b) reference).a);
                list.remove(i2);
                iVar.f10208i = true;
                if (list.isEmpty()) {
                    iVar.f10215p = j2 - this.a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
