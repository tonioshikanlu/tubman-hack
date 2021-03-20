package n.m0.f;

import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import n.m0.f.d;

public final class c {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public a f10157b;
    public final List<a> c = new ArrayList();
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final d f10158e;
    public final String f;

    public c(d dVar, String str) {
        i.e(dVar, "taskRunner");
        i.e(str, "name");
        this.f10158e = dVar;
        this.f = str;
    }

    public final void a() {
        byte[] bArr = n.m0.c.a;
        synchronized (this.f10158e) {
            if (b()) {
                this.f10158e.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f10157b;
        if (aVar != null) {
            i.c(aVar);
            if (aVar.d) {
                this.d = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).d) {
                a aVar2 = this.c.get(size);
                if (d.f10161j.a().isLoggable(Level.FINE)) {
                    e.a.a.a.y0.m.o1.c.d(aVar2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(n.m0.f.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            e.x.c.i.e(r3, r0)
            n.m0.f.d r0 = r2.f10158e
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r3.d     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0023
            n.m0.f.d$b r4 = n.m0.f.d.f10161j     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = n.m0.f.d.f10160i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            e.a.a.a.y0.m.o1.c.d(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            n.m0.f.d$b r4 = n.m0.f.d.f10161j     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = n.m0.f.d.f10160i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            e.a.a.a.y0.m.o1.c.d(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x003a:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            n.m0.f.d r3 = r2.f10158e     // Catch:{ all -> 0x0048 }
            r3.e(r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.f.c.c(n.m0.f.a, long):void");
    }

    public final boolean d(a aVar, long j2, boolean z) {
        StringBuilder sb;
        String str;
        i.e(aVar, "task");
        i.e(this, "queue");
        c cVar = aVar.a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c2 = this.f10158e.f10164g.c();
        long j3 = c2 + j2;
        int indexOf = this.c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f10155b <= j3) {
                d.b bVar = d.f10161j;
                if (d.f10160i.isLoggable(Level.FINE)) {
                    e.a.a.a.y0.m.o1.c.d(aVar, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(indexOf);
        }
        aVar.f10155b = j3;
        d.b bVar2 = d.f10161j;
        if (d.f10160i.isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(e.a.a.a.y0.m.o1.c.A(j3 - c2));
            e.a.a.a.y0.m.o1.c.d(aVar, this, sb.toString());
        }
        Iterator<a> it = this.c.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f10155b - c2 > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = this.c.size();
        }
        this.c.add(i2, aVar);
        if (i2 == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = n.m0.c.a;
        synchronized (this.f10158e) {
            this.a = true;
            if (b()) {
                this.f10158e.e(this);
            }
        }
    }

    public String toString() {
        return this.f;
    }
}
