package b.l.a.c.c.l.k;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b.l.a.c.c.b;
import b.l.a.c.c.f;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.d;
import b.l.a.c.c.m.n;
import b.l.a.c.j.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class x implements m0 {
    public final p0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f2718b;
    public final Context c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public b f2719e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f2720g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2721h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f2722i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final Set<a.c> f2723j = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    public e f2724k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2725l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2726m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2727n;

    /* renamed from: o  reason: collision with root package name */
    public n f2728o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2729p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2730q;
    public final d r;
    public final Map<a<?>, Boolean> s;
    public final a.C0058a<? extends e, b.l.a.c.j.a> t;
    public ArrayList<Future<?>> u = new ArrayList<>();

    public x(p0 p0Var, d dVar, Map<a<?>, Boolean> map, f fVar, a.C0058a<? extends e, b.l.a.c.j.a> aVar, Lock lock, Context context) {
        this.a = p0Var;
        this.r = dVar;
        this.s = map;
        this.d = fVar;
        this.t = aVar;
        this.f2718b = lock;
        this.c = context;
    }

    public final void a() {
        this.a.f2695g.clear();
        this.f2726m = false;
        this.f2719e = null;
        this.f2720g = 0;
        this.f2725l = true;
        this.f2727n = false;
        this.f2729p = false;
        HashMap hashMap = new HashMap();
        for (a next : this.s.keySet()) {
            a.f fVar = this.a.f.get(next.a());
            Objects.requireNonNull(next.a);
            boolean booleanValue = this.s.get(next).booleanValue();
            if (fVar.t()) {
                this.f2726m = true;
                if (booleanValue) {
                    this.f2723j.add(next.a());
                } else {
                    this.f2725l = false;
                }
            }
            hashMap.put(fVar, new z(this, next, booleanValue));
        }
        if (this.f2726m) {
            this.r.f2774i = Integer.valueOf(System.identityHashCode(this.a.f2701m));
            e0 e0Var = new e0(this, (w) null);
            a.C0058a<? extends e, b.l.a.c.j.a> aVar = this.t;
            Context context = this.c;
            Looper looper = this.a.f2701m.f2676g;
            d dVar = this.r;
            this.f2724k = (e) aVar.a(context, looper, dVar, dVar.f2772g, e0Var, e0Var);
        }
        this.f2721h = this.a.f.size();
        this.u.add(q0.a.submit(new y(this, hashMap)));
    }

    public final boolean b() {
        j();
        m(true);
        this.a.f((b) null);
        return true;
    }

    public final void c() {
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(T t2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean e() {
        b bVar;
        int i2 = this.f2721h - 1;
        this.f2721h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            j0 j0Var = this.a.f2701m;
            Objects.requireNonNull(j0Var);
            StringWriter stringWriter = new StringWriter();
            j0Var.i("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new b(8, (PendingIntent) null);
        } else {
            bVar = this.f2719e;
            if (bVar == null) {
                return true;
            }
            this.a.f2700l = this.f;
        }
        p(bVar);
        return false;
    }

    public final void f() {
        if (this.f2721h == 0) {
            if (!this.f2726m || this.f2727n) {
                ArrayList arrayList = new ArrayList();
                this.f2720g = 1;
                this.f2721h = this.a.f.size();
                for (a.c next : this.a.f.keySet()) {
                    if (!this.a.f2695g.containsKey(next)) {
                        arrayList.add(this.a.f.get(next));
                    } else if (e()) {
                        h();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(q0.a.submit(new d0(this, arrayList)));
                }
            }
        }
    }

    public final void g(int i2) {
        p(new b(8, (PendingIntent) null));
    }

    /* JADX INFO: finally extract failed */
    public final void h() {
        p0 p0Var = this.a;
        p0Var.a.lock();
        try {
            p0Var.f2701m.m();
            p0Var.f2699k = new t(p0Var);
            p0Var.f2699k.a();
            p0Var.f2693b.signalAll();
            p0Var.a.unlock();
            q0.a.execute(new w(this));
            e eVar = this.f2724k;
            if (eVar != null) {
                if (this.f2729p) {
                    eVar.g(this.f2728o, this.f2730q);
                }
                m(false);
            }
            for (a.c<?> cVar : this.a.f2695g.keySet()) {
                this.a.f.get(cVar).b();
            }
            this.a.f2702n.a(this.f2722i.isEmpty() ? null : this.f2722i);
        } catch (Throwable th) {
            p0Var.a.unlock();
            throw th;
        }
    }

    public final void i() {
        this.f2726m = false;
        this.a.f2701m.f2685p = Collections.emptySet();
        for (a.c next : this.f2723j) {
            if (!this.a.f2695g.containsKey(next)) {
                this.a.f2695g.put(next, new b(17, (PendingIntent) null));
            }
        }
    }

    public final void j() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    public final void k(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f2722i.putAll(bundle);
            }
            if (e()) {
                h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r8 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(b.l.a.c.c.b r6, b.l.a.c.c.l.a<?> r7, boolean r8) {
        /*
            r5 = this;
            b.l.a.c.c.l.a$a<?, O> r0 = r7.a
            java.util.Objects.requireNonNull(r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0023
            boolean r8 = r6.V()
            if (r8 == 0) goto L_0x0014
        L_0x0012:
            r8 = r2
            goto L_0x0021
        L_0x0014:
            b.l.a.c.c.f r8 = r5.d
            int r3 = r6.f2588i
            r4 = 0
            android.content.Intent r8 = r8.a(r4, r3, r4)
            if (r8 == 0) goto L_0x0020
            goto L_0x0012
        L_0x0020:
            r8 = r1
        L_0x0021:
            if (r8 == 0) goto L_0x002c
        L_0x0023:
            b.l.a.c.c.b r8 = r5.f2719e
            if (r8 == 0) goto L_0x002b
            int r8 = r5.f
            if (r0 >= r8) goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0032
            r5.f2719e = r6
            r5.f = r0
        L_0x0032:
            b.l.a.c.c.l.k.p0 r8 = r5.a
            java.util.Map<b.l.a.c.c.l.a$c<?>, b.l.a.c.c.b> r8 = r8.f2695g
            b.l.a.c.c.l.a$c r7 = r7.a()
            r8.put(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.l.k.x.l(b.l.a.c.c.b, b.l.a.c.c.l.a, boolean):void");
    }

    public final void m(boolean z) {
        e eVar = this.f2724k;
        if (eVar != null) {
            if (eVar.a() && z) {
                this.f2724k.d();
            }
            this.f2724k.b();
            if (this.r.f2773h) {
                this.f2724k = null;
            }
            this.f2728o = null;
        }
    }

    public final boolean n(int i2) {
        if (this.f2720g == i2) {
            return true;
        }
        j0 j0Var = this.a.f2701m;
        Objects.requireNonNull(j0Var);
        StringWriter stringWriter = new StringWriter();
        j0Var.i("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        Log.w("GACConnecting", stringWriter.toString());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i3 = this.f2721h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GACConnecting", sb2.toString());
        int i4 = this.f2720g;
        String str = "UNKNOWN";
        String str2 = i4 != 0 ? i4 != 1 ? str : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        if (i2 == 0) {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        } else if (i2 == 1) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        }
        StringBuilder sb3 = new StringBuilder(str.length() + str2.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str2);
        sb3.append(" but received callback for step ");
        sb3.append(str);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        p(new b(8, (PendingIntent) null));
        return false;
    }

    public final void o(b bVar, a<?> aVar, boolean z) {
        if (n(1)) {
            l(bVar, aVar, z);
            if (e()) {
                h();
            }
        }
    }

    public final void p(b bVar) {
        j();
        m(!bVar.V());
        this.a.f(bVar);
        this.a.f2702n.b(bVar);
    }
}
