package b.h.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import b.h.a.d;
import b.h.a.m.v.k;
import b.h.a.n.c;
import b.h.a.n.f;
import b.h.a.n.h;
import b.h.a.n.j;
import b.h.a.n.m;
import b.h.a.n.n;
import b.h.a.n.p;
import b.h.a.q.d;
import b.h.a.q.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class i implements ComponentCallbacks2, b.h.a.n.i {
    public static final e s = ((e) ((e) new e().f(Bitmap.class)).j());

    /* renamed from: h  reason: collision with root package name */
    public final c f505h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f506i;

    /* renamed from: j  reason: collision with root package name */
    public final h f507j;
    @GuardedBy("this")

    /* renamed from: k  reason: collision with root package name */
    public final n f508k;
    @GuardedBy("this")

    /* renamed from: l  reason: collision with root package name */
    public final m f509l;
    @GuardedBy("this")

    /* renamed from: m  reason: collision with root package name */
    public final p f510m = new p();

    /* renamed from: n  reason: collision with root package name */
    public final Runnable f511n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f512o;

    /* renamed from: p  reason: collision with root package name */
    public final c f513p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList<d<Object>> f514q;
    @GuardedBy("this")
    public e r;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f507j.a(iVar);
        }
    }

    public class b implements c.a {
        @GuardedBy("RequestManager.this")
        public final n a;

        public b(@NonNull n nVar) {
            this.a = nVar;
        }
    }

    static {
        e eVar = (e) ((e) new e().f(b.h.a.m.x.g.c.class)).j();
        e eVar2 = (e) ((e) ((e) new e().g(k.f717b)).p(f.LOW)).t(true);
    }

    public i(@NonNull c cVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context) {
        e eVar;
        n nVar = new n();
        b.h.a.n.d dVar = cVar.f473n;
        a aVar = new a();
        this.f511n = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f512o = handler;
        this.f505h = cVar;
        this.f507j = hVar;
        this.f509l = mVar;
        this.f508k = nVar;
        this.f506i = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(nVar);
        Objects.requireNonNull((f) dVar);
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        c eVar2 = z ? new b.h.a.n.e(applicationContext, bVar) : new j();
        this.f513p = eVar2;
        if (b.h.a.s.j.h()) {
            handler.post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(eVar2);
        this.f514q = new CopyOnWriteArrayList<>(cVar.f469j.f488e);
        e eVar3 = cVar.f469j;
        synchronized (eVar3) {
            if (eVar3.f492j == null) {
                Objects.requireNonNull((d.a) eVar3.d);
                e eVar4 = new e();
                eVar4.A = true;
                eVar3.f492j = eVar4;
            }
            eVar = eVar3.f492j;
        }
        r(eVar);
        synchronized (cVar.f474o) {
            if (!cVar.f474o.contains(this)) {
                cVar.f474o.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public synchronized void d() {
        p();
        this.f510m.d();
    }

    public synchronized void j() {
        this.f510m.j();
        for (T n2 : b.h.a.s.j.e(this.f510m.f953h)) {
            n(n2);
        }
        this.f510m.f953h.clear();
        n nVar = this.f508k;
        Iterator it = ((ArrayList) b.h.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            nVar.a((b.h.a.q.b) it.next());
        }
        nVar.f946b.clear();
        this.f507j.b(this);
        this.f507j.b(this.f513p);
        this.f512o.removeCallbacks(this.f511n);
        c cVar = this.f505h;
        synchronized (cVar.f474o) {
            if (cVar.f474o.contains(this)) {
                cVar.f474o.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @CheckResult
    @NonNull
    public <ResourceType> h<ResourceType> k(@NonNull Class<ResourceType> cls) {
        return new h<>(this.f505h, this, cls, this.f506i);
    }

    @CheckResult
    @NonNull
    public h<Bitmap> l() {
        return k(Bitmap.class).a(s);
    }

    @CheckResult
    @NonNull
    public h<Drawable> m() {
        return k(Drawable.class);
    }

    public void n(@Nullable b.h.a.q.h.h<?> hVar) {
        boolean z;
        if (hVar != null) {
            boolean s2 = s(hVar);
            b.h.a.q.b f = hVar.f();
            if (!s2) {
                c cVar = this.f505h;
                synchronized (cVar.f474o) {
                    Iterator<i> it = cVar.f474o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().s(hVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && f != null) {
                    hVar.i((b.h.a.q.b) null);
                    f.clear();
                }
            }
        }
    }

    @CheckResult
    @NonNull
    public h<Drawable> o(@Nullable String str) {
        return m().G(str);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public synchronized void onStart() {
        q();
        this.f510m.onStart();
    }

    public void onTrimMemory(int i2) {
    }

    public synchronized void p() {
        n nVar = this.f508k;
        nVar.c = true;
        Iterator it = ((ArrayList) b.h.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            b.h.a.q.b bVar = (b.h.a.q.b) it.next();
            if (bVar.isRunning()) {
                bVar.pause();
                nVar.f946b.add(bVar);
            }
        }
    }

    public synchronized void q() {
        n nVar = this.f508k;
        nVar.c = false;
        Iterator it = ((ArrayList) b.h.a.s.j.e(nVar.a)).iterator();
        while (it.hasNext()) {
            b.h.a.q.b bVar = (b.h.a.q.b) it.next();
            if (!bVar.c() && !bVar.isRunning()) {
                bVar.a();
            }
        }
        nVar.f946b.clear();
    }

    public synchronized void r(@NonNull e eVar) {
        this.r = (e) ((e) eVar.clone()).b();
    }

    public synchronized boolean s(@NonNull b.h.a.q.h.h<?> hVar) {
        b.h.a.q.b f = hVar.f();
        if (f == null) {
            return true;
        }
        if (!this.f508k.a(f)) {
            return false;
        }
        this.f510m.f953h.remove(hVar);
        hVar.i((b.h.a.q.b) null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f508k + ", treeNode=" + this.f509l + "}";
    }
}
