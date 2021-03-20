package b.h.a.m.v;

import android.os.SystemClock;
import android.util.Log;
import b.h.a.m.a;
import b.h.a.m.d;
import b.h.a.m.m;
import b.h.a.m.v.g;
import b.h.a.m.w.n;
import b.h.a.s.f;
import java.util.Collections;
import java.util.List;

public class b0 implements g, g.a {

    /* renamed from: h  reason: collision with root package name */
    public final h<?> f626h;

    /* renamed from: i  reason: collision with root package name */
    public final g.a f627i;

    /* renamed from: j  reason: collision with root package name */
    public int f628j;

    /* renamed from: k  reason: collision with root package name */
    public d f629k;

    /* renamed from: l  reason: collision with root package name */
    public Object f630l;

    /* renamed from: m  reason: collision with root package name */
    public volatile n.a<?> f631m;

    /* renamed from: n  reason: collision with root package name */
    public e f632n;

    public b0(h<?> hVar, g.a aVar) {
        this.f626h = hVar;
        this.f627i = aVar;
    }

    /* JADX INFO: finally extract failed */
    public boolean a() {
        Object obj = this.f630l;
        if (obj != null) {
            this.f630l = null;
            int i2 = f.f1014b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                d<X> e2 = this.f626h.e(obj);
                f fVar = new f(e2, obj, this.f626h.f682i);
                m mVar = this.f631m.a;
                h<?> hVar = this.f626h;
                this.f632n = new e(mVar, hVar.f687n);
                hVar.b().a(this.f632n, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f632n + ", data: " + obj + ", encoder: " + e2 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f631m.c.b();
                this.f629k = new d(Collections.singletonList(this.f631m.a), this.f626h, this);
            } catch (Throwable th) {
                this.f631m.c.b();
                throw th;
            }
        }
        d dVar = this.f629k;
        if (dVar != null && dVar.a()) {
            return true;
        }
        this.f629k = null;
        this.f631m = null;
        boolean z = false;
        while (!z) {
            if (!(this.f628j < this.f626h.c().size())) {
                break;
            }
            List<n.a<?>> c = this.f626h.c();
            int i3 = this.f628j;
            this.f628j = i3 + 1;
            this.f631m = c.get(i3);
            if (this.f631m != null && (this.f626h.f689p.c(this.f631m.c.e()) || this.f626h.g(this.f631m.c.a()))) {
                this.f631m.c.f(this.f626h.f688o, new a0(this, this.f631m));
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        n.a<?> aVar = this.f631m;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void e(m mVar, Exception exc, b.h.a.m.u.d<?> dVar, a aVar) {
        this.f627i.e(mVar, exc, dVar, this.f631m.c.e());
    }

    public void h(m mVar, Object obj, b.h.a.m.u.d<?> dVar, a aVar, m mVar2) {
        this.f627i.h(mVar, obj, dVar, this.f631m.c.e(), mVar);
    }
}
