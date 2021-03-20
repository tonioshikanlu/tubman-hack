package g.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends r {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(e.v.d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0003
            goto L_0x001e
        L_0x0003:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001e:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.i.<init>(e.v.d, java.lang.Throwable, boolean):void");
    }
}
