package g.a.a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class l<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9912e;
    public static final AtomicLongFieldUpdater f;

    /* renamed from: g  reason: collision with root package name */
    public static final q f9913g = new q("REMOVE_FROZEN");

    /* renamed from: h  reason: collision with root package name */
    public static final a f9914h = new a((DefaultConstructorMarker) null);
    private volatile Object _next = null;
    private volatile long _state = 0;
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicReferenceArray f9915b;
    public final int c;
    public final boolean d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    static {
        Class<l> cls = l.class;
        f9912e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public l(int i2, boolean z) {
        this.c = i2;
        this.d = z;
        int i3 = i2 - 1;
        this.a = i3;
        this.f9915b = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (i3 <= 1073741823) {
            if (!((i2 & i3) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e2) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.a;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (this.d || this.f9915b.get(i3 & i4) == null) {
                if (f.compareAndSet(this, j2, (-1152921503533105153L & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                    this.f9915b.set(i3 & i4, e2);
                    l lVar = this;
                    while ((lVar._state & 1152921504606846976L) != 0) {
                        lVar = lVar.e();
                        Object obj = lVar.f9915b.get(lVar.a & i3);
                        if (!(obj instanceof b) || ((b) obj).a != i3) {
                            lVar = null;
                            continue;
                        } else {
                            lVar.f9915b.set(lVar.a & i3, e2);
                            continue;
                        }
                        if (lVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.c;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j2 = this._state;
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.a.a.l<E> e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            g.a.a.l r0 = (g.a.a.l) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f9912e
            r1 = 0
            g.a.a.l r4 = new g.a.a.l
            int r5 = r10.c
            int r5 = r5 * 2
            boolean r6 = r10.d
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.a
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f9915b
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            g.a.a.l$b r7 = new g.a.a.l$b
            r7.<init>(r5)
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f9915b
            int r9 = r4.a
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0060:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.l.e():g.a.a.l");
    }

    public final Object f() {
        while (true) {
            long j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return f9913g;
            }
            int i2 = (int) ((j2 & 1073741823) >> 0);
            int i3 = this.a;
            int i4 = ((int) ((1152921503533105152L & j2) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 == i5) {
                return null;
            }
            Object obj = this.f9915b.get(i5);
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j3 = ((long) ((i2 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f.compareAndSet(this, j2, (j2 & -1073741824) | j3)) {
                    this.f9915b.set(this.a & i2, (Object) null);
                    return obj2;
                } else if (this.d) {
                    l lVar = this;
                    while (true) {
                        long j4 = lVar._state;
                        int i6 = (int) ((j4 & 1073741823) >> 0);
                        if ((j4 & 1152921504606846976L) != 0) {
                            lVar = lVar.e();
                        } else {
                            if (f.compareAndSet(lVar, j4, (j4 & -1073741824) | j3)) {
                                lVar.f9915b.set(lVar.a & i6, (Object) null);
                                lVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (lVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
