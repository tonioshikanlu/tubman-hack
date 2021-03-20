package b.l.a.c.f.g;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import b.l.a.c.c.l.k.j;
import b.l.a.c.g.a;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

public final class k {
    public final x<i> a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3458b;
    public boolean c = false;
    public final Map<j.a<a>, n> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map<j.a<Object>, m> f3459e = new HashMap();
    public final Map<j.a<Object>, l> f = new HashMap();

    public k(Context context, x<i> xVar) {
        this.f3458b = context;
        this.a = xVar;
    }

    public final void a() {
        synchronized (this.d) {
            for (n next : this.d.values()) {
                if (next != null) {
                    ((i) this.a.b()).q0(t.V(next, (f) null));
                }
            }
            this.d.clear();
        }
        synchronized (this.f) {
            for (l next2 : this.f.values()) {
                if (next2 != null) {
                    ((i) this.a.b()).q0(new t(2, (r) null, (IBinder) null, (PendingIntent) null, next2, (IBinder) null));
                }
            }
            this.f.clear();
        }
        synchronized (this.f3459e) {
            for (m next3 : this.f3459e.values()) {
                if (next3 != null) {
                    ((i) this.a.b()).d1(new a0(2, (y) null, next3, (IBinder) null));
                }
            }
            this.f3459e.clear();
        }
    }

    public final void b(LocationRequest locationRequest, j<a> jVar, f fVar) {
        n nVar;
        j<a> jVar2 = jVar;
        this.a.a();
        synchronized (this.d) {
            n nVar2 = this.d.get(jVar2.c);
            if (nVar2 == null) {
                nVar2 = new n(jVar2);
            }
            nVar = nVar2;
            this.d.put(jVar2.c, nVar);
        }
        ((i) this.a.b()).q0(new t(1, new r(locationRequest, r.f3461o, (String) null, false, false, false, (String) null), nVar, (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null));
    }

    public final void c() {
        if (this.c) {
            this.a.a();
            ((i) this.a.b()).i0(false);
            this.c = false;
        }
    }
}
