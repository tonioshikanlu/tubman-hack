package g.a;

import e.r;
import e.v.f;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import g.a.a.j;
import g.a.a.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class d1 implements y0, m, l1 {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9932h = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_state");
    public volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a<T> extends h<T> {

        /* renamed from: o  reason: collision with root package name */
        public final d1 f9933o;

        public a(e.v.d<? super T> dVar, d1 d1Var) {
            super(dVar, 1);
            this.f9933o = d1Var;
        }

        public Throwable n(y0 y0Var) {
            Throwable th;
            Object p2 = this.f9933o.p();
            if (!(p2 instanceof c) || (th = (Throwable) ((c) p2)._rootCause) == null) {
                return p2 instanceof r ? ((r) p2).a : y0Var.S();
            }
            return th;
        }

        public String s() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends c1<y0> {

        /* renamed from: l  reason: collision with root package name */
        public final d1 f9934l;

        /* renamed from: m  reason: collision with root package name */
        public final c f9935m;

        /* renamed from: n  reason: collision with root package name */
        public final l f9936n;

        /* renamed from: o  reason: collision with root package name */
        public final Object f9937o;

        public b(d1 d1Var, c cVar, l lVar, Object obj) {
            super(lVar.f9959l);
            this.f9934l = d1Var;
            this.f9935m = cVar;
            this.f9936n = lVar;
            this.f9937o = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return r.a;
        }

        public void n(Throwable th) {
            d1 d1Var = this.f9934l;
            c cVar = this.f9935m;
            l lVar = this.f9936n;
            Object obj = this.f9937o;
            l y = d1Var.y(lVar);
            if (y == null || !d1Var.I(cVar, y, obj)) {
                d1Var.f(d1Var.l(cVar, obj));
            }
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("ChildCompletion[");
            y.append(this.f9936n);
            y.append(", ");
            y.append(this.f9937o);
            y.append(']');
            return y.toString();
        }
    }

    public static final class c implements u0 {
        public volatile Object _exceptionsHolder = null;
        public volatile int _isCompleting;
        public volatile Object _rootCause;

        /* renamed from: h  reason: collision with root package name */
        public final i1 f9938h;

        public c(i1 i1Var, boolean z, Throwable th) {
            this.f9938h = i1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> d = d();
                        d.add(obj);
                        d.add(th);
                        this._exceptionsHolder = d;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public boolean b() {
            return ((Throwable) this._rootCause) == null;
        }

        public i1 c() {
            return this.f9938h;
        }

        public final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        public final boolean f() {
            return this._exceptionsHolder == e1.f9945e;
        }

        public final List<Throwable> g(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = d();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> d = d();
                d.add(obj);
                arrayList = d;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!i.a(th, th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = e1.f9945e;
            return arrayList;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [boolean, int] */
        public String toString() {
            StringBuilder y = b.e.a.a.a.y("Finishing[cancelling=");
            y.append(e());
            y.append(", completing=");
            y.append(this._isCompleting);
            y.append(", rootCause=");
            y.append((Throwable) this._rootCause);
            y.append(", exceptions=");
            y.append(this._exceptionsHolder);
            y.append(", list=");
            y.append(this.f9938h);
            y.append(']');
            return y.toString();
        }
    }

    public static final class d extends j.a {
        public final /* synthetic */ d1 d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f9939e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar, j jVar2, d1 d1Var, Object obj) {
            super(jVar2);
            this.d = d1Var;
            this.f9939e = obj;
        }

        public Object c(Object obj) {
            j jVar = (j) obj;
            if (this.d.p() == this.f9939e) {
                return null;
            }
            return g.a.a.i.a;
        }
    }

    public d1(boolean z) {
        this._state = z ? e1.f9946g : e1.f;
        this._parentHandle = null;
    }

    public final void A(i1 i1Var, Throwable th) {
        u uVar = null;
        Object f = i1Var.f();
        Objects.requireNonNull(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        for (j jVar = (j) f; !i.a(jVar, i1Var); jVar = jVar.g()) {
            if (jVar instanceof a1) {
                c1 c1Var = (c1) jVar;
                try {
                    c1Var.n(th);
                } catch (Throwable th2) {
                    if (uVar != null) {
                        b.q.a.a.k(uVar, th2);
                    } else {
                        uVar = new u("Exception in completion handler " + c1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (uVar != null) {
            s(uVar);
        }
        h(th);
    }

    public void B(Object obj) {
    }

    public void C() {
    }

    public final void D(c1<?> c1Var) {
        i1 i1Var = new i1();
        j.f9909i.lazySet(i1Var, c1Var);
        j.f9908h.lazySet(i1Var, c1Var);
        while (true) {
            if (c1Var.f() == c1Var) {
                if (j.f9908h.compareAndSet(c1Var, c1Var, i1Var)) {
                    i1Var.d(c1Var);
                    break;
                }
            } else {
                break;
            }
        }
        f9932h.compareAndSet(this, c1Var, c1Var.g());
    }

    public final int E(Object obj) {
        if (obj instanceof l0) {
            if (((l0) obj).f9960h) {
                return 0;
            }
            if (!f9932h.compareAndSet(this, obj, e1.f9946g)) {
                return -1;
            }
            C();
            return 1;
        } else if (!(obj instanceof t0)) {
            return 0;
        } else {
            if (!f9932h.compareAndSet(this, obj, ((t0) obj).f9984h)) {
                return -1;
            }
            C();
            return 1;
        }
    }

    public final String F(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.e()) {
                return "Cancelling";
            }
            return cVar._isCompleting != 0 ? "Completing" : "Active";
        } else if (!(obj instanceof u0)) {
            return obj instanceof r ? "Cancelled" : "Completed";
        } else {
            if (((u0) obj).b()) {
                return "Active";
            }
            return "New";
        }
    }

    public final CancellationException G(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = i();
            }
            cancellationException = new z0(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008e, code lost:
        if (r1 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0090, code lost:
        A(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0095, code lost:
        if ((r8 instanceof g.a.l) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0099, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x009a, code lost:
        r0 = (g.a.l) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009c, code lost:
        if (r0 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x009e, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a0, code lost:
        r8 = r8.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a4, code lost:
        if (r8 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a6, code lost:
        r6 = y(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00aa, code lost:
        if (r6 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b0, code lost:
        if (I(r5, r6, r9) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return g.a.e1.f9944b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return l(r5, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            g.a.a.q r0 = g.a.e1.c
            g.a.a.q r1 = g.a.e1.a
            boolean r2 = r8 instanceof g.a.u0
            if (r2 != 0) goto L_0x0009
            return r1
        L_0x0009:
            boolean r2 = r8 instanceof g.a.l0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            boolean r2 = r8 instanceof g.a.c1
            if (r2 == 0) goto L_0x003f
        L_0x0013:
            boolean r2 = r8 instanceof g.a.l
            if (r2 != 0) goto L_0x003f
            boolean r2 = r9 instanceof g.a.r
            if (r2 != 0) goto L_0x003f
            g.a.u0 r8 = (g.a.u0) r8
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f9932h
            boolean r2 = r9 instanceof g.a.u0
            if (r2 == 0) goto L_0x002c
            g.a.v0 r2 = new g.a.v0
            r5 = r9
            g.a.u0 r5 = (g.a.u0) r5
            r2.<init>(r5)
            goto L_0x002d
        L_0x002c:
            r2 = r9
        L_0x002d:
            boolean r1 = r1.compareAndSet(r7, r8, r2)
            if (r1 != 0) goto L_0x0035
            r3 = r4
            goto L_0x003b
        L_0x0035:
            r7.B(r9)
            r7.j(r8, r9)
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            return r9
        L_0x003e:
            return r0
        L_0x003f:
            g.a.u0 r8 = (g.a.u0) r8
            g.a.i1 r2 = r7.o(r8)
            if (r2 == 0) goto L_0x00bd
            boolean r5 = r8 instanceof g.a.d1.c
            r6 = 0
            if (r5 != 0) goto L_0x004e
            r5 = r6
            goto L_0x004f
        L_0x004e:
            r5 = r8
        L_0x004f:
            g.a.d1$c r5 = (g.a.d1.c) r5
            if (r5 == 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            g.a.d1$c r5 = new g.a.d1$c
            r5.<init>(r2, r4, r6)
        L_0x0059:
            monitor-enter(r5)
            int r4 = r5._isCompleting     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0062
            monitor-exit(r5)
            r0 = r1
            goto L_0x00bd
        L_0x0062:
            r5._isCompleting = r3     // Catch:{ all -> 0x00ba }
            if (r5 == r8) goto L_0x0070
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f9932h     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.compareAndSet(r7, r8, r5)     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x0070
            monitor-exit(r5)
            goto L_0x00bd
        L_0x0070:
            boolean r0 = r5.e()     // Catch:{ all -> 0x00ba }
            boolean r1 = r9 instanceof g.a.r     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x007a
            r1 = r6
            goto L_0x007b
        L_0x007a:
            r1 = r9
        L_0x007b:
            g.a.r r1 = (g.a.r) r1     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0084
            java.lang.Throwable r1 = r1.a     // Catch:{ all -> 0x00ba }
            r5.a(r1)     // Catch:{ all -> 0x00ba }
        L_0x0084:
            java.lang.Object r1 = r5._rootCause     // Catch:{ all -> 0x00ba }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00ba }
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r1 = r6
        L_0x008d:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x0093
            r7.A(r2, r1)
        L_0x0093:
            boolean r0 = r8 instanceof g.a.l
            if (r0 != 0) goto L_0x0099
            r0 = r6
            goto L_0x009a
        L_0x0099:
            r0 = r8
        L_0x009a:
            g.a.l r0 = (g.a.l) r0
            if (r0 == 0) goto L_0x00a0
            r6 = r0
            goto L_0x00aa
        L_0x00a0:
            g.a.i1 r8 = r8.c()
            if (r8 == 0) goto L_0x00aa
            g.a.l r6 = r7.y(r8)
        L_0x00aa:
            if (r6 == 0) goto L_0x00b5
            boolean r8 = r7.I(r5, r6, r9)
            if (r8 == 0) goto L_0x00b5
            g.a.a.q r0 = g.a.e1.f9944b
            goto L_0x00bd
        L_0x00b5:
            java.lang.Object r0 = r7.l(r5, r9)
            goto L_0x00bd
        L_0x00ba:
            r8 = move-exception
            monitor-exit(r5)
            throw r8
        L_0x00bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.d1.H(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean I(c cVar, l lVar, Object obj) {
        while (e.a.a.a.y0.m.o1.c.K(lVar.f9959l, false, false, new b(this, cVar, lVar, obj), 1, (Object) null) == j1.f9957h) {
            lVar = y(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    public CancellationException N() {
        Throwable th;
        Object p2 = p();
        CancellationException cancellationException = null;
        if (p2 instanceof c) {
            th = (Throwable) ((c) p2)._rootCause;
        } else if (p2 instanceof r) {
            th = ((r) p2).a;
        } else if (!(p2 instanceof u0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + p2).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder y = b.e.a.a.a.y("Parent job is ");
        y.append(F(p2));
        return new z0(y.toString(), th, this);
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [g.a.t0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.a.j0 O(boolean r8, boolean r9, e.x.b.l<? super java.lang.Throwable, e.r> r10) {
        /*
            r7 = this;
            g.a.j1 r0 = g.a.j1.f9957h
            r1 = 0
            r2 = r1
        L_0x0004:
            java.lang.Object r3 = r7.p()
            boolean r4 = r3 instanceof g.a.l0
            if (r4 == 0) goto L_0x0039
            r4 = r3
            g.a.l0 r4 = (g.a.l0) r4
            boolean r5 = r4.f9960h
            if (r5 == 0) goto L_0x0023
            if (r2 == 0) goto L_0x0016
            goto L_0x001a
        L_0x0016:
            g.a.c1 r2 = r7.w(r10, r8)
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f9932h
            boolean r3 = r4.compareAndSet(r7, r3, r2)
            if (r3 == 0) goto L_0x0004
            return r2
        L_0x0023:
            g.a.i1 r3 = new g.a.i1
            r3.<init>()
            boolean r5 = r4.f9960h
            if (r5 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            g.a.t0 r5 = new g.a.t0
            r5.<init>(r3)
            r3 = r5
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f9932h
            r5.compareAndSet(r7, r4, r3)
            goto L_0x0004
        L_0x0039:
            boolean r4 = r3 instanceof g.a.u0
            if (r4 == 0) goto L_0x00a0
            r4 = r3
            g.a.u0 r4 = (g.a.u0) r4
            g.a.i1 r4 = r4.c()
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            java.util.Objects.requireNonNull(r3, r4)
            g.a.c1 r3 = (g.a.c1) r3
            r7.D(r3)
            goto L_0x0004
        L_0x0051:
            if (r8 == 0) goto L_0x0088
            boolean r5 = r3 instanceof g.a.d1.c
            if (r5 == 0) goto L_0x0088
            monitor-enter(r3)
            r5 = r3
            g.a.d1$c r5 = (g.a.d1.c) r5     // Catch:{ all -> 0x0085 }
            java.lang.Object r5 = r5._rootCause     // Catch:{ all -> 0x0085 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x0085 }
            if (r5 == 0) goto L_0x006f
            boolean r6 = r10 instanceof g.a.l     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x006d
            r6 = r3
            g.a.d1$c r6 = (g.a.d1.c) r6     // Catch:{ all -> 0x0085 }
            int r6 = r6._isCompleting     // Catch:{ all -> 0x0085 }
            if (r6 != 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r6 = r0
            goto L_0x0083
        L_0x006f:
            if (r2 == 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            g.a.c1 r2 = r7.w(r10, r8)     // Catch:{ all -> 0x0085 }
        L_0x0076:
            boolean r6 = r7.d(r3, r4, r2)     // Catch:{ all -> 0x0085 }
            if (r6 != 0) goto L_0x007e
            monitor-exit(r3)
            goto L_0x0004
        L_0x007e:
            if (r5 != 0) goto L_0x0082
            monitor-exit(r3)
            return r2
        L_0x0082:
            r6 = r2
        L_0x0083:
            monitor-exit(r3)
            goto L_0x008a
        L_0x0085:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L_0x0088:
            r6 = r0
            r5 = r1
        L_0x008a:
            if (r5 == 0) goto L_0x0092
            if (r9 == 0) goto L_0x0091
            r10.invoke(r5)
        L_0x0091:
            return r6
        L_0x0092:
            if (r2 == 0) goto L_0x0095
            goto L_0x0099
        L_0x0095:
            g.a.c1 r2 = r7.w(r10, r8)
        L_0x0099:
            boolean r3 = r7.d(r3, r4, r2)
            if (r3 == 0) goto L_0x0004
            return r2
        L_0x00a0:
            if (r9 == 0) goto L_0x00b0
            boolean r8 = r3 instanceof g.a.r
            if (r8 != 0) goto L_0x00a7
            r3 = r1
        L_0x00a7:
            g.a.r r3 = (g.a.r) r3
            if (r3 == 0) goto L_0x00ad
            java.lang.Throwable r1 = r3.a
        L_0x00ad:
            r10.invoke(r1)
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.d1.O(boolean, boolean, e.x.b.l):g.a.j0");
    }

    public final CancellationException S() {
        Object p2 = p();
        if (p2 instanceof c) {
            Throwable th = (Throwable) ((c) p2)._rootCause;
            if (th != null) {
                return G(th, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (p2 instanceof u0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (p2 instanceof r) {
            return G(((r) p2).a, (String) null);
        } else {
            return new z0(getClass().getSimpleName() + " has completed normally", (Throwable) null, this);
        }
    }

    public final void Y(l1 l1Var) {
        g(l1Var);
    }

    public boolean b() {
        Object p2 = p();
        return (p2 instanceof u0) && ((u0) p2).b();
    }

    public final boolean d(Object obj, i1 i1Var, c1<?> c1Var) {
        boolean z;
        d dVar = new d(c1Var, c1Var, this, obj);
        do {
            j h2 = i1Var.h();
            j.f9909i.lazySet(c1Var, h2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j.f9908h;
            atomicReferenceFieldUpdater.lazySet(c1Var, i1Var);
            dVar.f9911b = i1Var;
            z = !atomicReferenceFieldUpdater.compareAndSet(h2, i1Var, dVar) ? false : dVar.a(h2) == null ? true : true;
            if (z) {
                return true;
            }
        } while (!z);
        return false;
    }

    public void f(Object obj) {
    }

    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        return f.a.C0144a.a(this, r, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e2, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b4 A[EDGE_INSN: B:76:0x00b4->B:56:0x00b4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(java.lang.Object r14) {
        /*
            r13 = this;
            g.a.a.q r0 = g.a.e1.d
            g.a.a.q r1 = g.a.e1.f9944b
            g.a.a.q r2 = g.a.e1.c
            g.a.a.q r3 = g.a.e1.a
            boolean r4 = r13.n()
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0039
        L_0x0011:
            java.lang.Object r4 = r13.p()
            boolean r8 = r4 instanceof g.a.u0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r4 instanceof g.a.d1.c
            if (r8 == 0) goto L_0x0025
            r8 = r4
            g.a.d1$c r8 = (g.a.d1.c) r8
            int r8 = r8._isCompleting
            if (r8 == 0) goto L_0x0025
            goto L_0x0035
        L_0x0025:
            g.a.r r8 = new g.a.r
            java.lang.Throwable r9 = r13.k(r14)
            r8.<init>(r9, r6, r5)
            java.lang.Object r4 = r13.H(r4, r8)
            if (r4 == r2) goto L_0x0011
            goto L_0x0036
        L_0x0035:
            r4 = r3
        L_0x0036:
            if (r4 != r1) goto L_0x003a
            return r7
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 != r3) goto L_0x00e3
            r4 = 0
            r8 = r4
        L_0x003e:
            java.lang.Object r9 = r13.p()
            boolean r10 = r9 instanceof g.a.d1.c
            if (r10 == 0) goto L_0x0084
            monitor-enter(r9)
            r2 = r9
            g.a.d1$c r2 = (g.a.d1.c) r2     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.f()     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0053
            monitor-exit(r9)
            goto L_0x00e2
        L_0x0053:
            r2 = r9
            g.a.d1$c r2 = (g.a.d1.c) r2     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0081 }
            if (r14 != 0) goto L_0x005e
            if (r2 != 0) goto L_0x006b
        L_0x005e:
            if (r8 == 0) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            java.lang.Throwable r8 = r13.k(r14)     // Catch:{ all -> 0x0081 }
        L_0x0065:
            r14 = r9
            g.a.d1$c r14 = (g.a.d1.c) r14     // Catch:{ all -> 0x0081 }
            r14.a(r8)     // Catch:{ all -> 0x0081 }
        L_0x006b:
            r14 = r9
            g.a.d1$c r14 = (g.a.d1.c) r14     // Catch:{ all -> 0x0081 }
            java.lang.Object r14 = r14._rootCause     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r14 = (java.lang.Throwable) r14     // Catch:{ all -> 0x0081 }
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x0076
            r4 = r14
        L_0x0076:
            monitor-exit(r9)
            if (r4 == 0) goto L_0x00b4
            g.a.d1$c r9 = (g.a.d1.c) r9
            g.a.i1 r14 = r9.f9938h
            r13.A(r14, r4)
            goto L_0x00b4
        L_0x0081:
            r14 = move-exception
            monitor-exit(r9)
            throw r14
        L_0x0084:
            boolean r10 = r9 instanceof g.a.u0
            if (r10 == 0) goto L_0x00e2
            if (r8 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            java.lang.Throwable r8 = r13.k(r14)
        L_0x008f:
            r10 = r9
            g.a.u0 r10 = (g.a.u0) r10
            boolean r11 = r10.b()
            if (r11 == 0) goto L_0x00b6
            g.a.i1 r9 = r13.o(r10)
            if (r9 == 0) goto L_0x00b1
            g.a.d1$c r11 = new g.a.d1$c
            r11.<init>(r9, r6, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f9932h
            boolean r10 = r12.compareAndSet(r13, r10, r11)
            if (r10 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r13.A(r9, r8)
            r9 = r7
            goto L_0x00b2
        L_0x00b1:
            r9 = r6
        L_0x00b2:
            if (r9 == 0) goto L_0x003e
        L_0x00b4:
            r4 = r3
            goto L_0x00e3
        L_0x00b6:
            g.a.r r10 = new g.a.r
            r10.<init>(r8, r6, r5)
            java.lang.Object r10 = r13.H(r9, r10)
            if (r10 == r3) goto L_0x00c7
            if (r10 != r2) goto L_0x00c5
            goto L_0x003e
        L_0x00c5:
            r4 = r10
            goto L_0x00e3
        L_0x00c7:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Cannot happen in "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L_0x00e2:
            r4 = r0
        L_0x00e3:
            if (r4 != r3) goto L_0x00e7
        L_0x00e5:
            r6 = r7
            goto L_0x00f1
        L_0x00e7:
            if (r4 != r1) goto L_0x00ea
            goto L_0x00e5
        L_0x00ea:
            if (r4 != r0) goto L_0x00ed
            goto L_0x00f1
        L_0x00ed:
            r13.f(r4)
            goto L_0x00e5
        L_0x00f1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.d1.g(java.lang.Object):boolean");
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        return f.a.C0144a.b(this, bVar);
    }

    public final f.b<?> getKey() {
        return y0.f10039g;
    }

    public final boolean h(Throwable th) {
        if (u()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        k kVar = (k) this._parentHandle;
        if (kVar == null || kVar == j1.f9957h) {
            return z;
        }
        if (kVar.l(th) || z) {
            return true;
        }
        return false;
    }

    public String i() {
        return "Job was cancelled";
    }

    public final void j(u0 u0Var, Object obj) {
        k kVar = (k) this._parentHandle;
        if (kVar != null) {
            kVar.e();
            this._parentHandle = j1.f9957h;
        }
        u uVar = null;
        if (!(obj instanceof r)) {
            obj = null;
        }
        r rVar = (r) obj;
        Throwable th = rVar != null ? rVar.a : null;
        if (u0Var instanceof c1) {
            try {
                ((c1) u0Var).n(th);
            } catch (Throwable th2) {
                s(new u("Exception in completion handler " + u0Var + " for " + this, th2));
            }
        } else {
            i1 c2 = u0Var.c();
            if (c2 != null) {
                Object f = c2.f();
                Objects.requireNonNull(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                for (j jVar = (j) f; !i.a(jVar, c2); jVar = jVar.g()) {
                    if (jVar instanceof c1) {
                        c1 c1Var = (c1) jVar;
                        try {
                            c1Var.n(th);
                        } catch (Throwable th3) {
                            if (uVar != null) {
                                b.q.a.a.k(uVar, th3);
                            } else {
                                uVar = new u("Exception in completion handler " + c1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (uVar != null) {
                    s(uVar);
                }
            }
        }
    }

    public final Throwable k(Object obj) {
        if (!(obj != null ? obj instanceof Throwable : true)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            return ((l1) obj).N();
        } else if (obj != null) {
            return (Throwable) obj;
        } else {
            return new z0(i(), (Throwable) null, this);
        }
    }

    public final k k0(m mVar) {
        j0 K = e.a.a.a.y0.m.o1.c.K(this, true, false, new l(this, mVar), 2, (Object) null);
        Objects.requireNonNull(K, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (k) K;
    }

    public final Object l(c cVar, Object obj) {
        T t = null;
        r rVar = (r) (!(obj instanceof r) ? null : obj);
        T t2 = rVar != null ? rVar.a : null;
        synchronized (cVar) {
            cVar.e();
            List<Throwable> g2 = cVar.g(t2);
            if (!g2.isEmpty()) {
                Iterator<T> it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        t = next;
                        break;
                    }
                }
                t = (Throwable) t;
                if (t == null) {
                    t = (Throwable) g2.get(0);
                }
            } else if (cVar.e()) {
                t = new z0(i(), (Throwable) null, this);
            }
            if (t != null) {
                if (g2.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                    for (T next2 : g2) {
                        if (next2 != t && next2 != t && !(next2 instanceof CancellationException) && newSetFromMap.add(next2)) {
                            b.q.a.a.k(t, next2);
                        }
                    }
                }
            }
        }
        if (!(t == null || t == t2)) {
            obj = new r(t, false, 2);
        }
        if (t != null) {
            if (h(t) || r(t)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                r.f9980b.compareAndSet((r) obj, 0, 1);
            }
        }
        B(obj);
        f9932h.compareAndSet(this, cVar, obj instanceof u0 ? new v0((u0) obj) : obj);
        j(cVar, obj);
        return obj;
    }

    public boolean m() {
        return true;
    }

    public f minusKey(f.b<?> bVar) {
        return f.a.C0144a.c(this, bVar);
    }

    public boolean n() {
        return false;
    }

    public final i1 o(u0 u0Var) {
        i1 c2 = u0Var.c();
        if (c2 != null) {
            return c2;
        }
        if (u0Var instanceof l0) {
            return new i1();
        }
        if (u0Var instanceof c1) {
            D((c1) u0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u0Var).toString());
    }

    public final Object p() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public f plus(f fVar) {
        return f.a.C0144a.d(this, fVar);
    }

    public boolean r(Throwable th) {
        return false;
    }

    public void s(Throwable th) {
        throw th;
    }

    public final boolean start() {
        int E;
        do {
            E = E(p());
            if (E == 0) {
                return false;
            }
        } while (E != 1);
        return true;
    }

    public final void t(y0 y0Var) {
        j1 j1Var = j1.f9957h;
        if (y0Var == null) {
            this._parentHandle = j1Var;
            return;
        }
        y0Var.start();
        k k0 = y0Var.k0(this);
        this._parentHandle = k0;
        if (!(p() instanceof u0)) {
            k0.e();
            this._parentHandle = j1Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x() + '{' + F(p()) + '}');
        sb.append('@');
        sb.append(e.a.a.a.y0.m.o1.c.F(this));
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final Object v(Object obj) {
        Object H;
        do {
            H = H(p(), obj);
            if (H == e1.a) {
                String str = "Job " + this + " is already complete or completing, " + "but is being completed with " + obj;
                Throwable th = null;
                if (!(obj instanceof r)) {
                    obj = null;
                }
                r rVar = (r) obj;
                if (rVar != null) {
                    th = rVar.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (H == e1.c);
        return H;
    }

    public final c1<?> w(l<? super Throwable, r> lVar, boolean z) {
        a1 a1Var = null;
        if (z) {
            if (lVar instanceof a1) {
                a1Var = lVar;
            }
            a1 a1Var2 = a1Var;
            return a1Var2 != null ? a1Var2 : new w0(this, lVar);
        }
        if (lVar instanceof c1) {
            a1Var = lVar;
        }
        c1<?> c1Var = a1Var;
        return c1Var != null ? c1Var : new x0(this, lVar);
    }

    public String x() {
        return getClass().getSimpleName();
    }

    public final l y(j jVar) {
        while (jVar.i()) {
            jVar = jVar.h();
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.i()) {
                if (jVar instanceof l) {
                    return (l) jVar;
                }
                if (jVar instanceof i1) {
                    return null;
                }
            }
        }
    }
}
