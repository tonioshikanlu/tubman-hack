package p.a.a;

public final class b implements Runnable, l {

    /* renamed from: h  reason: collision with root package name */
    public final k f10502h = new k();

    /* renamed from: i  reason: collision with root package name */
    public final c f10503i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f10504j;

    public b(c cVar) {
        this.f10503i = cVar;
    }

    public void a(q qVar, Object obj) {
        j a = j.a(qVar, obj);
        synchronized (this) {
            this.f10502h.a(a);
            if (!this.f10504j) {
                this.f10504j = true;
                this.f10503i.f10511j.execute(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = r6.f10503i.f10517p;
        r3 = java.util.logging.Level.WARNING;
        r2.b(r3, java.lang.Thread.currentThread().getName() + " was interruppted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        r6.f10504j = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
        L_0x0000:
            r0 = 0
            p.a.a.k r1 = r6.f10502h     // Catch:{ InterruptedException -> 0x0034 }
            r2 = 1000(0x3e8, float:1.401E-42)
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0034 }
            p.a.a.j r3 = r1.a     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x000e
            long r2 = (long) r2     // Catch:{ all -> 0x002f }
            r1.wait(r2)     // Catch:{ all -> 0x002f }
        L_0x000e:
            p.a.a.j r2 = r1.b()     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x0034 }
            if (r2 != 0) goto L_0x0029
            monitor-enter(r6)     // Catch:{ InterruptedException -> 0x0034 }
            p.a.a.k r1 = r6.f10502h     // Catch:{ all -> 0x0026 }
            p.a.a.j r2 = r1.b()     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x0024
            r6.f10504j = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            r6.f10504j = r0
            return
        L_0x0024:
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ InterruptedException -> 0x0034 }
        L_0x0029:
            p.a.a.c r1 = r6.f10503i     // Catch:{ InterruptedException -> 0x0034 }
            r1.c(r2)     // Catch:{ InterruptedException -> 0x0034 }
            goto L_0x0000
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x0034 }
            throw r2     // Catch:{ InterruptedException -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x005a
        L_0x0034:
            r1 = move-exception
            p.a.a.c r2 = r6.f10503i     // Catch:{ all -> 0x0032 }
            p.a.a.g r2 = r2.f10517p     // Catch:{ all -> 0x0032 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0032 }
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = " was interruppted"
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0032 }
            r2.b(r3, r4, r1)     // Catch:{ all -> 0x0032 }
            r6.f10504j = r0
            return
        L_0x005a:
            r6.f10504j = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a.a.b.run():void");
    }
}
