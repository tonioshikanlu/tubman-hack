package b.l.a.c.i.b;

import android.os.SystemClock;
import b.l.a.c.c.p.c;
import java.util.Objects;

public final class o8 {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f4203b;
    public final l c;
    public final /* synthetic */ q8 d;

    public o8(q8 q8Var) {
        this.d = q8Var;
        this.c = new n8(this, q8Var.a);
        Objects.requireNonNull((c) q8Var.a.f4121n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.f4203b = elapsedRealtime;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r7, boolean r8, long r9) {
        /*
            r6 = this;
            b.l.a.c.i.b.q8 r0 = r6.d
            r0.h()
            b.l.a.c.i.b.q8 r0 = r6.d
            r0.i()
            b.l.a.c.f.i.o9.b()
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.p0
            r2 = 0
            boolean r0 = r0.r(r2, r1)
            if (r0 == 0) goto L_0x003c
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0058
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.u3 r0 = r0.t
            b.l.a.c.i.b.q8 r1 = r6.d
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.c.p.b r1 = r1.f4121n
            b.l.a.c.c.p.c r1 = (b.l.a.c.c.p.c) r1
            java.util.Objects.requireNonNull(r1)
            goto L_0x0051
        L_0x003c:
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.u3 r0 = r0.t
            b.l.a.c.i.b.q8 r1 = r6.d
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.c.p.b r1 = r1.f4121n
            b.l.a.c.c.p.c r1 = (b.l.a.c.c.p.c) r1
            java.util.Objects.requireNonNull(r1)
        L_0x0051:
            long r3 = java.lang.System.currentTimeMillis()
            r0.b(r3)
        L_0x0058:
            long r0 = r6.a
            long r0 = r9 - r0
            if (r7 != 0) goto L_0x007a
            r3 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0065
            goto L_0x007a
        L_0x0065:
            b.l.a.c.i.b.q8 r7 = r6.d
            b.l.a.c.i.b.l4 r7 = r7.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r9 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r7.b(r9, r8)
            r7 = 0
            return r7
        L_0x007a:
            if (r8 != 0) goto L_0x0082
            long r0 = r6.f4203b
            long r0 = r9 - r0
            r6.f4203b = r9
        L_0x0082:
            b.l.a.c.i.b.q8 r7 = r6.d
            b.l.a.c.i.b.l4 r7 = r7.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Recording user engagement, ms"
            r7.b(r4, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r3 = "_et"
            r7.putLong(r3, r0)
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            boolean r0 = r0.w()
            b.l.a.c.i.b.q8 r1 = r6.d
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.b7 r1 = r1.y()
            r3 = 1
            r0 = r0 ^ r3
            b.l.a.c.i.b.t6 r0 = r1.p(r0)
            b.l.a.c.i.b.b7.r(r0, r7, r3)
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.U
            boolean r0 = r0.r(r2, r1)
            if (r0 != 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00d1
            r4 = 1
            java.lang.String r0 = "_fr"
            r7.putLong(r0, r4)
        L_0x00d1:
            b.l.a.c.i.b.q8 r0 = r6.d
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            boolean r0 = r0.r(r2, r1)
            if (r0 == 0) goto L_0x00df
            if (r8 != 0) goto L_0x00ee
        L_0x00df:
            b.l.a.c.i.b.q8 r8 = r6.d
            b.l.a.c.i.b.l4 r8 = r8.a
            b.l.a.c.i.b.m6 r8 = r8.s()
            java.lang.String r0 = "auto"
            java.lang.String r1 = "_e"
            r8.A(r0, r1, r7)
        L_0x00ee:
            r6.a = r9
            b.l.a.c.i.b.l r7 = r6.c
            r7.c()
            b.l.a.c.i.b.l r7 = r6.c
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            r7.b(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.o8.a(boolean, boolean, long):boolean");
    }
}
