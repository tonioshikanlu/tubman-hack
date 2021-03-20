package g.a;

import e.v.d;
import e.v.f;
import g.a.a.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class g0<T> extends p<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9948l = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_decision");
    private volatile int _decision = 0;

    public g0(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f9948l
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            e.v.d<T> r0 = r4.f9917k
            e.v.d r0 = b.q.a.a.A1(r0)
            e.v.d<T> r1 = r4.f9917k
            java.lang.Object r5 = e.a.a.a.y0.m.o1.c.X(r5, r1)
            r1 = 0
            g.a.a.g.b(r0, r5, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.g0.J(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f9948l
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            e.v.i.a r0 = e.v.i.a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.p()
            java.lang.Object r0 = g.a.e1.a(r0)
            boolean r1 = r0 instanceof g.a.r
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            g.a.r r0 = (g.a.r) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.g0.P():java.lang.Object");
    }

    public void f(Object obj) {
        J(obj);
    }
}
