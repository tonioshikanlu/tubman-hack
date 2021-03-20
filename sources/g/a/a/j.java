package g.a.a;

import e.x.c.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9908h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9909i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9910j;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    private volatile Object _removedRef = null;

    public static abstract class a extends d<j> {

        /* renamed from: b  reason: collision with root package name */
        public j f9911b;
        public final j c;

        public a(j jVar) {
            this.c = jVar;
        }

        public void b(Object obj, Object obj2) {
            j jVar = (j) obj;
            boolean z = obj2 == null;
            j jVar2 = z ? this.c : this.f9911b;
            if (jVar2 != null && j.f9908h.compareAndSet(jVar, this, jVar2) && z) {
                j jVar3 = this.c;
                j jVar4 = this.f9911b;
                i.c(jVar4);
                jVar3.d(jVar4);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<j> cls2 = j.class;
        f9908h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f9909i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f9910j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (f9908h.compareAndSet(r2, r1, ((g.a.a.o) r3).a) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.a.a.j a(g.a.a.n r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            g.a.a.j r7 = (g.a.a.j) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f9909i
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.i()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof g.a.a.n
            if (r4 == 0) goto L_0x002c
            g.a.a.n r3 = (g.a.a.n) r3
            r3.a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof g.a.a.o
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f9908h
            g.a.a.o r3 = (g.a.a.o) r3
            g.a.a.j r3 = r3.a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            g.a.a.j r1 = (g.a.a.j) r1
            goto L_0x0007
        L_0x0046:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r3, r2)
            r2 = r3
            g.a.a.j r2 = (g.a.a.j) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.j.a(g.a.a.n):g.a.a.j");
    }

    public final void d(j jVar) {
        j jVar2;
        do {
            jVar2 = (j) jVar._prev;
            if (f() != jVar) {
                return;
            }
        } while (!f9909i.compareAndSet(jVar, jVar2, this));
        if (i()) {
            jVar.a((n) null);
        }
    }

    public final Object f() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final j g() {
        j jVar;
        Object f = f();
        o oVar = (o) (!(f instanceof o) ? null : f);
        if (oVar != null && (jVar = oVar.a) != null) {
            return jVar;
        }
        Objects.requireNonNull(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        return (j) f;
    }

    public final j h() {
        j a2 = a((n) null);
        if (a2 == null) {
            Object obj = this._prev;
            while (true) {
                a2 = (j) obj;
                if (!a2.i()) {
                    break;
                }
                obj = a2._prev;
            }
        }
        return a2;
    }

    public boolean i() {
        return f() instanceof o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.f()
            boolean r1 = r0 instanceof g.a.a.o
            if (r1 == 0) goto L_0x000d
            g.a.a.o r0 = (g.a.a.o) r0
            g.a.a.j r0 = r0.a
            goto L_0x0037
        L_0x000d:
            if (r0 != r4) goto L_0x0012
            g.a.a.j r0 = (g.a.a.j) r0
            goto L_0x0037
        L_0x0012:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = r0
            g.a.a.j r1 = (g.a.a.j) r1
            java.lang.Object r2 = r1._removedRef
            g.a.a.o r2 = (g.a.a.o) r2
            if (r2 == 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            g.a.a.o r2 = new g.a.a.o
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f9910j
            r3.lazySet(r1, r2)
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f9908h
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r1.a(r0)
        L_0x0037:
            if (r0 != 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.j.k():boolean");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
