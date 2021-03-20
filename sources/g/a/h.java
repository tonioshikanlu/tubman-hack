package g.a;

import e.a.a.a.y0.m.o1.c;
import e.r;
import e.v.f;
import e.v.i.a;
import e.v.j.a.d;
import e.x.b.l;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class h<T> extends h0<T> implements g<T>, d {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9950m = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decision");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9951n = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");
    private volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    private volatile Object _state = c.f9927h;

    /* renamed from: k  reason: collision with root package name */
    public final f f9952k;

    /* renamed from: l  reason: collision with root package name */
    public final e.v.d<T> f9953l;

    public h(e.v.d<? super T> dVar, int i2) {
        super(i2);
        this.f9953l = dVar;
        this.f9952k = dVar.getContext();
    }

    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof k1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof r)) {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (!(qVar.f9977e != null)) {
                        if (f9951n.compareAndSet(this, obj2, q.a(qVar, (Object) null, (e) null, (l) null, (Object) null, th, 15))) {
                            e eVar = qVar.f9976b;
                            if (eVar != null) {
                                i(eVar, th);
                            }
                            l<Throwable, r> lVar = qVar.c;
                            if (lVar != null) {
                                j(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f9951n.compareAndSet(this, obj2, new q(obj2, (e) null, (l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final e.v.d<T> b() {
        return this.f9953l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: g.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: g.a.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Throwable r0 = e.k.a(r13)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            g.a.r r13 = new g.a.r
            r2 = 2
            r13.<init>(r0, r1, r2)
        L_0x000e:
            int r0 = r12.f9954j
            r2 = 0
        L_0x0011:
            r6 = 0
            java.lang.Object r10 = r12._state
            boolean r3 = r10 instanceof g.a.k1
            if (r3 == 0) goto L_0x0050
            r3 = r10
            g.a.k1 r3 = (g.a.k1) r3
            boolean r4 = r13 instanceof g.a.r
            if (r4 == 0) goto L_0x0020
            goto L_0x003f
        L_0x0020:
            boolean r4 = e.a.a.a.y0.m.o1.c.M(r0)
            if (r4 != 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            boolean r4 = r3 instanceof g.a.e
            if (r4 == 0) goto L_0x003f
            g.a.q r11 = new g.a.q
            boolean r4 = r3 instanceof g.a.e
            if (r4 != 0) goto L_0x0032
            r3 = r2
        L_0x0032:
            r5 = r3
            g.a.e r5 = (g.a.e) r5
            r8 = 0
            r9 = 16
            r7 = 0
            r3 = r11
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0040
        L_0x003f:
            r11 = r13
        L_0x0040:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f9951n
            boolean r3 = r3.compareAndSet(r12, r10, r11)
            if (r3 != 0) goto L_0x0049
            goto L_0x0011
        L_0x0049:
            r12.l()
            r12.m(r0)
            goto L_0x0062
        L_0x0050:
            boolean r0 = r10 instanceof g.a.i
            if (r0 == 0) goto L_0x0063
            g.a.i r10 = (g.a.i) r10
            java.util.Objects.requireNonNull(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = g.a.i.c
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            return
        L_0x0063:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Already resumed, but proposed with update "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.h.c(java.lang.Object):void");
    }

    public Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    public <T> T e(Object obj) {
        return obj instanceof q ? ((q) obj).a : obj;
    }

    public Object g() {
        return this._state;
    }

    public f getContext() {
        return this.f9952k;
    }

    public final void h(l<? super Throwable, r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f fVar = this.f9952k;
            c.H(fVar, new u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(e eVar, Throwable th) {
        try {
            eVar.a(th);
        } catch (Throwable th2) {
            f fVar = this.f9952k;
            c.H(fVar, new u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(l<? super Throwable, r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            f fVar = this.f9952k;
            c.H(fVar, new u("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean k(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof k1)) {
                return false;
            }
            z = obj instanceof e;
        } while (!f9951n.compareAndSet(this, obj, new i(this, th, z)));
        if (!z) {
            obj = null;
        }
        e eVar = (e) obj;
        if (eVar != null) {
            i(eVar, th);
        }
        l();
        m(this.f9954j);
        return true;
    }

    public final void l() {
        if (!q()) {
            j0 j0Var = (j0) this._parentHandle;
            if (j0Var != null) {
                j0Var.e();
            }
            this._parentHandle = j1.f9957h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 != r1) goto L_0x000a
            r0 = r2
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f9950m
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            e.v.d r0 = r4.b()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r2 = r1
        L_0x002b:
            if (r2 != 0) goto L_0x007f
            boolean r3 = r0 instanceof g.a.a.f
            if (r3 == 0) goto L_0x007f
            boolean r5 = e.a.a.a.y0.m.o1.c.M(r5)
            int r3 = r4.f9954j
            boolean r3 = e.a.a.a.y0.m.o1.c.M(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            g.a.a.f r5 = (g.a.a.f) r5
            g.a.x r5 = r5.f9905n
            e.v.f r0 = r0.getContext()
            boolean r2 = r5.n0(r0)
            if (r2 == 0) goto L_0x0050
            r5.m0(r0, r4)
            goto L_0x0082
        L_0x0050:
            g.a.p1 r5 = g.a.p1.f9975b
            g.a.m0 r5 = g.a.p1.a()
            boolean r0 = r5.s0()
            if (r0 == 0) goto L_0x0060
            r5.q0(r4)
            goto L_0x0082
        L_0x0060:
            r5.r0(r1)
            e.v.d r0 = r4.b()     // Catch:{ all -> 0x0071 }
            e.a.a.a.y0.m.o1.c.b0(r4, r0, r1)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.t0()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r2 = 0
            r4.f(r0, r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.o0(r1)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.o0(r1)
            throw r0
        L_0x007f:
            e.a.a.a.y0.m.o1.c.b0(r4, r0, r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.h.m(int):void");
    }

    public Throwable n(y0 y0Var) {
        return y0Var.S();
    }

    public final Object o() {
        y0 y0Var;
        y0 y0Var2;
        Throwable h2;
        boolean z = true;
        boolean z2 = !(this._state instanceof k1);
        if (this.f9954j == 2) {
            e.v.d<T> dVar = this.f9953l;
            if (!(dVar instanceof g.a.a.f)) {
                dVar = null;
            }
            g.a.a.f fVar = (g.a.a.f) dVar;
            if (!(fVar == null || (h2 = fVar.h(this)) == null)) {
                if (!z2) {
                    k(h2);
                }
                z2 = true;
            }
        }
        if (!z2 && ((j0) this._parentHandle) == null && (y0Var2 = (y0) this.f9953l.getContext().get(y0.f10039g)) != null) {
            j0 K = c.K(y0Var2, true, false, new j(y0Var2, this), 2, (Object) null);
            this._parentHandle = K;
            if ((!(this._state instanceof k1)) && !q()) {
                K.e();
                this._parentHandle = j1.f9957h;
            }
        }
        while (true) {
            int i2 = this._decision;
            if (i2 == 0) {
                if (f9950m.compareAndSet(this, 0, 1)) {
                    break;
                }
            } else if (i2 == 2) {
                z = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z) {
            return a.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof r) {
            throw ((r) obj).a;
        } else if (!c.M(this.f9954j) || (y0Var = (y0) this.f9952k.get(y0.f10039g)) == null || y0Var.b()) {
            return e(obj);
        } else {
            CancellationException S = y0Var.S();
            a(obj, S);
            throw S;
        }
    }

    public void p(l<? super Throwable, r> lVar) {
        e eVar = (e) lVar;
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof c)) {
                Throwable th = null;
                if (!(obj instanceof e)) {
                    boolean z = obj instanceof r;
                    boolean z2 = true;
                    if (z) {
                        r rVar = (r) obj;
                        Objects.requireNonNull(rVar);
                        if (!r.f9980b.compareAndSet(rVar, 0, 1)) {
                            r(lVar, obj);
                            throw null;
                        } else if (obj instanceof i) {
                            if (!z) {
                                obj = null;
                            }
                            r rVar2 = (r) obj;
                            if (rVar2 != null) {
                                th = rVar2.a;
                            }
                            h(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof q) {
                        q qVar = (q) obj;
                        if (qVar.f9976b == null) {
                            Throwable th2 = qVar.f9977e;
                            if (th2 == null) {
                                z2 = false;
                            }
                            if (z2) {
                                h(lVar, th2);
                                return;
                            }
                            if (f9951n.compareAndSet(this, obj, q.a(qVar, (Object) null, eVar, (l) null, (Object) null, (Throwable) null, 29))) {
                                return;
                            }
                        } else {
                            r(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f9951n.compareAndSet(this, obj, new q(obj, eVar, (l) null, (Object) null, (Throwable) null, 28))) {
                            return;
                        }
                    }
                } else {
                    r(lVar, obj);
                    throw null;
                }
            } else if (f9951n.compareAndSet(this, obj, eVar)) {
                return;
            }
        }
    }

    public final boolean q() {
        e.v.d<T> dVar = this.f9953l;
        return (dVar instanceof g.a.a.f) && ((g.a.a.f) dVar).j(this);
    }

    public final void r(l<? super Throwable, r> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String s() {
        return "CancellableContinuation";
    }

    public String toString() {
        return s() + '(' + c.p0(this.f9953l) + "){" + this._state + "}@" + c.F(this);
    }
}
