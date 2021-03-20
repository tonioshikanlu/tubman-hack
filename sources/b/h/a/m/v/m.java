package b.h.a.m.v;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import b.h.a.m.v.i;
import b.h.a.m.v.q;
import b.h.a.q.f;
import b.h.a.q.g;
import b.h.a.s.k.a;
import b.h.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class m<R> implements i.a<R>, a.d {
    public static final c F = new c();
    public r A;
    public boolean B;
    public q<?> C;
    public i<R> D;
    public volatile boolean E;

    /* renamed from: h  reason: collision with root package name */
    public final e f729h = new e();

    /* renamed from: i  reason: collision with root package name */
    public final b.h.a.s.k.d f730i = new d.b();

    /* renamed from: j  reason: collision with root package name */
    public final q.a f731j;

    /* renamed from: k  reason: collision with root package name */
    public final Pools.Pool<m<?>> f732k;

    /* renamed from: l  reason: collision with root package name */
    public final c f733l;

    /* renamed from: m  reason: collision with root package name */
    public final n f734m;

    /* renamed from: n  reason: collision with root package name */
    public final b.h.a.m.v.e0.a f735n;

    /* renamed from: o  reason: collision with root package name */
    public final b.h.a.m.v.e0.a f736o;

    /* renamed from: p  reason: collision with root package name */
    public final b.h.a.m.v.e0.a f737p;

    /* renamed from: q  reason: collision with root package name */
    public final b.h.a.m.v.e0.a f738q;
    public final AtomicInteger r = new AtomicInteger();
    public b.h.a.m.m s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public w<?> x;
    public b.h.a.m.a y;
    public boolean z;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final f f739h;

        public a(f fVar) {
            this.f739h = fVar;
        }

        public void run() {
            g gVar = (g) this.f739h;
            gVar.f970b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.f729h.f744h.contains(new d(this.f739h, b.h.a.s.e.f1012b))) {
                        m mVar = m.this;
                        f fVar = this.f739h;
                        Objects.requireNonNull(mVar);
                        try {
                            ((g) fVar).m(mVar.A, 5);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final f f741h;

        public b(f fVar) {
            this.f741h = fVar;
        }

        public void run() {
            g gVar = (g) this.f741h;
            gVar.f970b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.f729h.f744h.contains(new d(this.f741h, b.h.a.s.e.f1012b))) {
                        m.this.C.c();
                        m mVar = m.this;
                        f fVar = this.f741h;
                        Objects.requireNonNull(mVar);
                        try {
                            ((g) fVar).n(mVar.C, mVar.y);
                            m.this.g(this.f741h);
                        } catch (Throwable th) {
                            throw new c(th);
                        }
                    }
                    m.this.c();
                }
            }
        }
    }

    @VisibleForTesting
    public static class c {
    }

    public static final class d {
        public final f a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f743b;

        public d(f fVar, Executor executor) {
            this.a = fVar;
            this.f743b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: h  reason: collision with root package name */
        public final List<d> f744h = new ArrayList(2);

        public boolean isEmpty() {
            return this.f744h.isEmpty();
        }

        @NonNull
        public Iterator<d> iterator() {
            return this.f744h.iterator();
        }
    }

    public m(b.h.a.m.v.e0.a aVar, b.h.a.m.v.e0.a aVar2, b.h.a.m.v.e0.a aVar3, b.h.a.m.v.e0.a aVar4, n nVar, q.a aVar5, Pools.Pool<m<?>> pool) {
        c cVar = F;
        this.f735n = aVar;
        this.f736o = aVar2;
        this.f737p = aVar3;
        this.f738q = aVar4;
        this.f734m = nVar;
        this.f731j = aVar5;
        this.f732k = pool;
        this.f733l = cVar;
    }

    public synchronized void a(f fVar, Executor executor) {
        Runnable runnable;
        this.f730i.a();
        this.f729h.f744h.add(new d(fVar, executor));
        boolean z2 = true;
        if (this.z) {
            d(1);
            runnable = new b(fVar);
        } else if (this.B) {
            d(1);
            runnable = new a(fVar);
        } else {
            if (this.E) {
                z2 = false;
            }
            b.a.a.n.f.b(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(runnable);
    }

    public void b() {
        if (!e()) {
            this.E = true;
            i<R> iVar = this.D;
            iVar.L = true;
            g gVar = iVar.J;
            if (gVar != null) {
                gVar.cancel();
            }
            n nVar = this.f734m;
            b.h.a.m.m mVar = this.s;
            l lVar = (l) nVar;
            synchronized (lVar) {
                t tVar = lVar.a;
                Objects.requireNonNull(tVar);
                Map<b.h.a.m.m, m<?>> a2 = tVar.a(this.w);
                if (equals(a2.get(mVar))) {
                    a2.remove(mVar);
                }
            }
        }
    }

    public void c() {
        q<?> qVar;
        synchronized (this) {
            this.f730i.a();
            b.a.a.n.f.b(e(), "Not yet complete!");
            int decrementAndGet = this.r.decrementAndGet();
            b.a.a.n.f.b(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.C;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.d();
        }
    }

    public synchronized void d(int i2) {
        q<?> qVar;
        b.a.a.n.f.b(e(), "Not yet complete!");
        if (this.r.getAndAdd(i2) == 0 && (qVar = this.C) != null) {
            qVar.c();
        }
    }

    public final boolean e() {
        return this.B || this.z || this.E;
    }

    public final synchronized void f() {
        boolean a2;
        if (this.s != null) {
            this.f729h.f744h.clear();
            this.s = null;
            this.C = null;
            this.x = null;
            this.B = false;
            this.E = false;
            this.z = false;
            i<R> iVar = this.D;
            i.e eVar = iVar.f697n;
            synchronized (eVar) {
                eVar.a = true;
                a2 = eVar.a(false);
            }
            if (a2) {
                iVar.u();
            }
            this.D = null;
            this.A = null;
            this.y = null;
            this.f732k.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void g(f fVar) {
        boolean z2;
        this.f730i.a();
        this.f729h.f744h.remove(new d(fVar, b.h.a.s.e.f1012b));
        if (this.f729h.isEmpty()) {
            b();
            if (!this.z) {
                if (!this.B) {
                    z2 = false;
                    if (z2 && this.r.get() == 0) {
                        f();
                    }
                }
            }
            z2 = true;
            f();
        }
    }

    public void h(i<?> iVar) {
        (this.u ? this.f737p : this.v ? this.f738q : this.f736o).f673h.execute(iVar);
    }

    @NonNull
    public b.h.a.s.k.d j() {
        return this.f730i;
    }
}
