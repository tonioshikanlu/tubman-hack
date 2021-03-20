package b.h.a.m.v;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import b.h.a.m.m;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.s;
import b.h.a.m.u.e;
import b.h.a.m.v.g;
import b.h.a.m.v.j;
import b.h.a.m.v.l;
import b.h.a.m.v.m;
import b.h.a.m.v.q;
import b.h.a.s.k.a;
import b.h.a.s.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public long A;
    public boolean B;
    public Object C;
    public Thread D;
    public m E;
    public m F;
    public Object G;
    public b.h.a.m.a H;
    public b.h.a.m.u.d<?> I;
    public volatile g J;
    public volatile boolean K;
    public volatile boolean L;

    /* renamed from: h  reason: collision with root package name */
    public final h<R> f691h = new h<>();

    /* renamed from: i  reason: collision with root package name */
    public final List<Throwable> f692i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final b.h.a.s.k.d f693j = new d.b();

    /* renamed from: k  reason: collision with root package name */
    public final d f694k;

    /* renamed from: l  reason: collision with root package name */
    public final Pools.Pool<i<?>> f695l;

    /* renamed from: m  reason: collision with root package name */
    public final c<?> f696m = new c<>();

    /* renamed from: n  reason: collision with root package name */
    public final e f697n = new e();

    /* renamed from: o  reason: collision with root package name */
    public b.h.a.e f698o;

    /* renamed from: p  reason: collision with root package name */
    public m f699p;

    /* renamed from: q  reason: collision with root package name */
    public b.h.a.f f700q;
    public o r;
    public int s;
    public int t;
    public k u;
    public p v;
    public a<R> w;
    public int x;
    public g y;
    public f z;

    public interface a<R> {
    }

    public final class b<Z> implements j.a<Z> {
        public final b.h.a.m.a a;

        public b(b.h.a.m.a aVar) {
            this.a = aVar;
        }
    }

    public static class c<Z> {
        public m a;

        /* renamed from: b  reason: collision with root package name */
        public s<Z> f702b;
        public v<Z> c;
    }

    public interface d {
    }

    public static class e {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f703b;
        public boolean c;

        public final boolean a(boolean z) {
            return (this.c || z || this.f703b) && this.a;
        }
    }

    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, Pools.Pool<i<?>> pool) {
        this.f694k = dVar;
        this.f695l = pool;
    }

    public int compareTo(@NonNull Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f700q.ordinal() - iVar.f700q.ordinal();
        return ordinal == 0 ? this.x - iVar.x : ordinal;
    }

    public void d() {
        this.z = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.w).h(this);
    }

    public void e(m mVar, Exception exc, b.h.a.m.u.d<?> dVar, b.h.a.m.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", (Throwable) exc);
        Class<?> a2 = dVar.a();
        rVar.f760i = mVar;
        rVar.f761j = aVar;
        rVar.f762k = a2;
        this.f692i.add(rVar);
        if (Thread.currentThread() != this.D) {
            this.z = f.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.w).h(this);
            return;
        }
        v();
    }

    public void h(m mVar, Object obj, b.h.a.m.u.d<?> dVar, b.h.a.m.a aVar, m mVar2) {
        this.E = mVar;
        this.G = obj;
        this.I = dVar;
        this.H = aVar;
        this.F = mVar2;
        if (Thread.currentThread() != this.D) {
            this.z = f.DECODE_DATA;
            ((m) this.w).h(this);
            return;
        }
        n();
    }

    @NonNull
    public b.h.a.s.k.d j() {
        return this.f693j;
    }

    public final <Data> w<R> l(b.h.a.m.u.d<?> dVar, Data data, b.h.a.m.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i2 = b.h.a.s.f.f1014b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> m2 = m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                s("Decoded result " + m2, elapsedRealtimeNanos, (String) null);
            }
            return m2;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> m(Data data, b.h.a.m.a aVar) {
        b.h.a.m.u.e<?> b2;
        u<Data, ?, R> d2 = this.f691h.d(data.getClass());
        p pVar = this.v;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = aVar == b.h.a.m.a.RESOURCE_DISK_CACHE || this.f691h.r;
            o oVar = b.h.a.m.x.c.m.f866i;
            Boolean bool = (Boolean) pVar.c(oVar);
            if (bool == null || (bool.booleanValue() && !z2)) {
                pVar = new p();
                pVar.d(this.v);
                pVar.f586b.put(oVar, Boolean.valueOf(z2));
            }
        }
        p pVar2 = pVar;
        b.h.a.m.u.f fVar = this.f698o.f487b.f499e;
        synchronized (fVar) {
            e.a<?> aVar2 = fVar.a.get(data.getClass());
            if (aVar2 == null) {
                Iterator<e.a<?>> it = fVar.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(data.getClass())) {
                        aVar2 = next;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = b.h.a.m.u.f.f597b;
            }
            b2 = aVar2.b(data);
        }
        try {
            return d2.a(b2, pVar2, this.s, this.t, new b(aVar));
        } finally {
            b2.b();
        }
    }

    public final void n() {
        w<R> wVar;
        c<?> cVar;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.A;
            StringBuilder y2 = b.e.a.a.a.y("data: ");
            y2.append(this.G);
            y2.append(", cache key: ");
            y2.append(this.E);
            y2.append(", fetcher: ");
            y2.append(this.I);
            s("Retrieved data", j2, y2.toString());
        }
        v<R> vVar = null;
        try {
            wVar = l(this.I, this.G, this.H);
        } catch (r e2) {
            m mVar = this.F;
            b.h.a.m.a aVar = this.H;
            e2.f760i = mVar;
            e2.f761j = aVar;
            e2.f762k = null;
            this.f692i.add(e2);
            wVar = null;
        }
        if (wVar != null) {
            b.h.a.m.a aVar2 = this.H;
            if (wVar instanceof s) {
                ((s) wVar).initialize();
            }
            if (this.f696m.c != null) {
                vVar = v.c(wVar);
                wVar = vVar;
            }
            x();
            m mVar2 = (m) this.w;
            synchronized (mVar2) {
                mVar2.x = wVar;
                mVar2.y = aVar2;
            }
            synchronized (mVar2) {
                mVar2.f730i.a();
                if (mVar2.E) {
                    mVar2.x.recycle();
                    mVar2.f();
                } else if (mVar2.f729h.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!mVar2.z) {
                    m.c cVar2 = mVar2.f733l;
                    w<?> wVar2 = mVar2.x;
                    boolean z2 = mVar2.t;
                    b.h.a.m.m mVar3 = mVar2.s;
                    q.a aVar3 = mVar2.f731j;
                    Objects.requireNonNull(cVar2);
                    mVar2.C = new q(wVar2, z2, true, mVar3, aVar3);
                    mVar2.z = true;
                    m.e eVar = mVar2.f729h;
                    Objects.requireNonNull(eVar);
                    ArrayList arrayList = new ArrayList(eVar.f744h);
                    mVar2.d(arrayList.size() + 1);
                    b.h.a.m.m mVar4 = mVar2.s;
                    q<?> qVar = mVar2.C;
                    ((l) mVar2.f734m).e(mVar2, mVar4, qVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m.d dVar = (m.d) it.next();
                        dVar.f743b.execute(new m.b(dVar.a));
                    }
                    mVar2.c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.y = g.ENCODE;
            try {
                cVar = this.f696m;
                if (cVar.c != null) {
                    ((l.c) this.f694k).a().a(cVar.a, new f(cVar.f702b, cVar.c, this.v));
                    cVar.c.d();
                }
                if (vVar != null) {
                    vVar.d();
                }
                e eVar2 = this.f697n;
                synchronized (eVar2) {
                    eVar2.f703b = true;
                    a2 = eVar2.a(false);
                }
                if (a2) {
                    u();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.d();
                }
                throw th;
            }
        } else {
            v();
        }
    }

    public final g p() {
        int ordinal = this.y.ordinal();
        if (ordinal == 1) {
            return new x(this.f691h, this);
        }
        if (ordinal == 2) {
            return new d(this.f691h, this);
        }
        if (ordinal == 3) {
            return new b0(this.f691h, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder y2 = b.e.a.a.a.y("Unrecognized stage: ");
        y2.append(this.y);
        throw new IllegalStateException(y2.toString());
    }

    public final g r(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return this.u.b() ? gVar2 : r(gVar2);
        }
        if (ordinal == 1) {
            return this.u.a() ? gVar3 : r(gVar3);
        }
        if (ordinal == 2) {
            return this.B ? gVar4 : g.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public void run() {
        b.h.a.m.u.d<?> dVar = this.I;
        try {
            if (this.L) {
                t();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            w();
            if (dVar != null) {
                dVar.b();
            }
        } catch (c e2) {
            throw e2;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }

    public final void s(String str, long j2, String str2) {
        StringBuilder B2 = b.e.a.a.a.B(str, " in ");
        B2.append(b.h.a.s.f.a(j2));
        B2.append(", load key: ");
        B2.append(this.r);
        B2.append(str2 != null ? b.e.a.a.a.m(", ", str2) : "");
        B2.append(", thread: ");
        B2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", B2.toString());
    }

    public final void t() {
        boolean a2;
        x();
        r rVar = new r("Failed to load resource", (List<Throwable>) new ArrayList(this.f692i));
        m mVar = (m) this.w;
        synchronized (mVar) {
            mVar.A = rVar;
        }
        synchronized (mVar) {
            mVar.f730i.a();
            if (mVar.E) {
                mVar.f();
            } else if (mVar.f729h.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!mVar.B) {
                mVar.B = true;
                b.h.a.m.m mVar2 = mVar.s;
                m.e eVar = mVar.f729h;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.f744h);
                mVar.d(arrayList.size() + 1);
                ((l) mVar.f734m).e(mVar, mVar2, (q<?>) null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m.d dVar = (m.d) it.next();
                    dVar.f743b.execute(new m.a(dVar.a));
                }
                mVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar2 = this.f697n;
        synchronized (eVar2) {
            eVar2.c = true;
            a2 = eVar2.a(false);
        }
        if (a2) {
            u();
        }
    }

    public final void u() {
        e eVar = this.f697n;
        synchronized (eVar) {
            eVar.f703b = false;
            eVar.a = false;
            eVar.c = false;
        }
        c<?> cVar = this.f696m;
        cVar.a = null;
        cVar.f702b = null;
        cVar.c = null;
        h<R> hVar = this.f691h;
        hVar.c = null;
        hVar.d = null;
        hVar.f687n = null;
        hVar.f680g = null;
        hVar.f684k = null;
        hVar.f682i = null;
        hVar.f688o = null;
        hVar.f683j = null;
        hVar.f689p = null;
        hVar.a.clear();
        hVar.f685l = false;
        hVar.f678b.clear();
        hVar.f686m = false;
        this.K = false;
        this.f698o = null;
        this.f699p = null;
        this.v = null;
        this.f700q = null;
        this.r = null;
        this.w = null;
        this.y = null;
        this.J = null;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.A = 0;
        this.L = false;
        this.C = null;
        this.f692i.clear();
        this.f695l.release(this);
    }

    public final void v() {
        this.D = Thread.currentThread();
        int i2 = b.h.a.s.f.f1014b;
        this.A = SystemClock.elapsedRealtimeNanos();
        boolean z2 = false;
        while (!this.L && this.J != null && !(z2 = this.J.a())) {
            this.y = r(this.y);
            this.J = p();
            if (this.y == g.SOURCE) {
                this.z = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.w).h(this);
                return;
            }
        }
        if ((this.y == g.FINISHED || this.L) && !z2) {
            t();
        }
    }

    public final void w() {
        int ordinal = this.z.ordinal();
        if (ordinal == 0) {
            this.y = r(g.INITIALIZE);
            this.J = p();
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                n();
                return;
            }
            StringBuilder y2 = b.e.a.a.a.y("Unrecognized run reason: ");
            y2.append(this.z);
            throw new IllegalStateException(y2.toString());
        }
        v();
    }

    public final void x() {
        Throwable th;
        this.f693j.a();
        if (this.K) {
            if (this.f692i.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f692i;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.K = true;
    }
}
