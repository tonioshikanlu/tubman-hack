package b.l.a.c.c.l.k;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import b.l.a.c.c.e;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.d;
import b.l.a.c.c.l.k.j;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.m;
import b.l.a.c.c.m.n;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.u;
import b.l.a.c.k.i;
import com.amplitude.api.Constants;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class g implements Handler.Callback {

    /* renamed from: k  reason: collision with root package name */
    public static final Status f2640k = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: l  reason: collision with root package name */
    public static final Status f2641l = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: m  reason: collision with root package name */
    public static final Object f2642m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static g f2643n;
    public long a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2644b;
    public final e c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f2645e = new AtomicInteger(1);
    public final AtomicInteger f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public final Map<b<?>, a<?>> f2646g = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: h  reason: collision with root package name */
    public final Set<b<?>> f2647h = new ArraySet();

    /* renamed from: i  reason: collision with root package name */
    public final Set<b<?>> f2648i = new ArraySet();

    /* renamed from: j  reason: collision with root package name */
    public final Handler f2649j;

    public class a<O extends a.d> implements GoogleApiClient.b, GoogleApiClient.c, y1 {
        public final Queue<g1> a = new LinkedList();

        /* renamed from: b  reason: collision with root package name */
        public final a.f f2650b;
        public final a.b c;
        public final b<O> d;

        /* renamed from: e  reason: collision with root package name */
        public final c2 f2651e;
        public final Set<u1> f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        public final Map<j.a<?>, f1> f2652g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        public final int f2653h;

        /* renamed from: i  reason: collision with root package name */
        public final i1 f2654i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2655j;

        /* renamed from: k  reason: collision with root package name */
        public final List<c> f2656k = new ArrayList();

        /* renamed from: l  reason: collision with root package name */
        public b.l.a.c.c.b f2657l = null;

        @WorkerThread
        public a(d<O> dVar) {
            a.f c2 = dVar.c(g.this.f2649j.getLooper(), this);
            this.f2650b = c2;
            if (c2 instanceof u) {
                Objects.requireNonNull((u) c2);
                this.c = null;
            } else {
                this.c = c2;
            }
            this.d = dVar.d;
            this.f2651e = new c2();
            this.f2653h = dVar.f;
            if (c2.t()) {
                this.f2654i = dVar.d(g.this.f2644b, g.this.f2649j);
            } else {
                this.f2654i = null;
            }
        }

        @WorkerThread
        public final void a() {
            b.l.a.c.b.a.t(g.this.f2649j);
            if (!this.f2650b.a() && !this.f2650b.o()) {
                g gVar = g.this;
                int a2 = gVar.d.a(gVar.f2644b, this.f2650b);
                if (a2 != 0) {
                    n(new b.l.a.c.c.b(a2, (PendingIntent) null));
                    return;
                }
                g gVar2 = g.this;
                a.f fVar = this.f2650b;
                b bVar = new b(fVar, this.d);
                if (fVar.t()) {
                    i1 i1Var = this.f2654i;
                    b.l.a.c.j.e eVar = i1Var.f;
                    if (eVar != null) {
                        eVar.b();
                    }
                    i1Var.f2670e.f2774i = Integer.valueOf(System.identityHashCode(i1Var));
                    a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> aVar = i1Var.c;
                    Context context = i1Var.a;
                    Looper looper = i1Var.f2669b.getLooper();
                    b.l.a.c.c.m.d dVar = i1Var.f2670e;
                    i1Var.f = (b.l.a.c.j.e) aVar.a(context, looper, dVar, dVar.f2772g, i1Var, i1Var);
                    i1Var.f2671g = bVar;
                    Set<Scope> set = i1Var.d;
                    if (set == null || set.isEmpty()) {
                        i1Var.f2669b.post(new h1(i1Var));
                    } else {
                        i1Var.f.c();
                    }
                }
                this.f2650b.r(bVar);
            }
        }

        public final boolean b() {
            return this.f2650b.t();
        }

        @WorkerThread
        @Nullable
        public final b.l.a.c.c.d c(@Nullable b.l.a.c.c.d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                b.l.a.c.c.d[] p2 = this.f2650b.p();
                if (p2 == null) {
                    p2 = new b.l.a.c.c.d[0];
                }
                ArrayMap arrayMap = new ArrayMap(p2.length);
                for (b.l.a.c.c.d dVar : p2) {
                    arrayMap.put(dVar.f2594h, Long.valueOf(dVar.V()));
                }
                for (b.l.a.c.c.d dVar2 : dVarArr) {
                    if (!arrayMap.containsKey(dVar2.f2594h) || ((Long) arrayMap.get(dVar2.f2594h)).longValue() < dVar2.V()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }

        @WorkerThread
        public final void d(g1 g1Var) {
            b.l.a.c.b.a.t(g.this.f2649j);
            if (!this.f2650b.a()) {
                this.a.add(g1Var);
                b.l.a.c.c.b bVar = this.f2657l;
                if (bVar == null || !bVar.V()) {
                    a();
                } else {
                    n(this.f2657l);
                }
            } else if (e(g1Var)) {
                p();
            } else {
                this.a.add(g1Var);
            }
        }

        @WorkerThread
        public final boolean e(g1 g1Var) {
            if (!(g1Var instanceof l0)) {
                r(g1Var);
                return true;
            }
            l0 l0Var = (l0) g1Var;
            b.l.a.c.c.d c2 = c(l0Var.f(this));
            if (c2 == null) {
                r(g1Var);
                return true;
            } else if (l0Var.g(this)) {
                c cVar = new c(this.d, c2, (s0) null);
                int indexOf = this.f2656k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.f2656k.get(indexOf);
                    g.this.f2649j.removeMessages(15, cVar2);
                    Handler handler = g.this.f2649j;
                    Message obtain = Message.obtain(handler, 15, cVar2);
                    Objects.requireNonNull(g.this);
                    handler.sendMessageDelayed(obtain, 5000);
                    return false;
                }
                this.f2656k.add(cVar);
                Handler handler2 = g.this.f2649j;
                Message obtain2 = Message.obtain(handler2, 15, cVar);
                Objects.requireNonNull(g.this);
                handler2.sendMessageDelayed(obtain2, 5000);
                Handler handler3 = g.this.f2649j;
                Message obtain3 = Message.obtain(handler3, 16, cVar);
                Objects.requireNonNull(g.this);
                handler3.sendMessageDelayed(obtain3, 120000);
                b.l.a.c.c.b bVar = new b.l.a.c.c.b(2, (PendingIntent) null);
                t(bVar);
                g.this.c(bVar, this.f2653h);
                return false;
            } else {
                l0Var.c(new b.l.a.c.c.l.j(c2));
                return false;
            }
        }

        @WorkerThread
        public final void f() {
            l();
            u(b.l.a.c.c.b.f2586l);
            m();
            Iterator<f1> it = this.f2652g.values().iterator();
            if (!it.hasNext()) {
                i();
                p();
                return;
            }
            Objects.requireNonNull(it.next());
            throw null;
        }

        public final void g(int i2) {
            if (Looper.myLooper() == g.this.f2649j.getLooper()) {
                h();
            } else {
                g.this.f2649j.post(new v0(this));
            }
        }

        @WorkerThread
        public final void h() {
            l();
            this.f2655j = true;
            this.f2651e.a(true, o1.d);
            Handler handler = g.this.f2649j;
            Message obtain = Message.obtain(handler, 9, this.d);
            Objects.requireNonNull(g.this);
            handler.sendMessageDelayed(obtain, 5000);
            Handler handler2 = g.this.f2649j;
            Message obtain2 = Message.obtain(handler2, 11, this.d);
            Objects.requireNonNull(g.this);
            handler2.sendMessageDelayed(obtain2, 120000);
            g.this.d.a.clear();
        }

        @WorkerThread
        public final void i() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                g1 g1Var = (g1) obj;
                if (!this.f2650b.a()) {
                    return;
                }
                if (e(g1Var)) {
                    this.a.remove(g1Var);
                }
            }
        }

        @WorkerThread
        public final void j() {
            b.l.a.c.b.a.t(g.this.f2649j);
            Status status = g.f2640k;
            q(status);
            c2 c2Var = this.f2651e;
            Objects.requireNonNull(c2Var);
            c2Var.a(false, status);
            for (j.a t1Var : (j.a[]) this.f2652g.keySet().toArray(new j.a[this.f2652g.size()])) {
                d(new t1(t1Var, new i()));
            }
            u(new b.l.a.c.c.b(4));
            if (this.f2650b.a()) {
                this.f2650b.f(new x0(this));
            }
        }

        public final void k(@Nullable Bundle bundle) {
            if (Looper.myLooper() == g.this.f2649j.getLooper()) {
                f();
            } else {
                g.this.f2649j.post(new t0(this));
            }
        }

        @WorkerThread
        public final void l() {
            b.l.a.c.b.a.t(g.this.f2649j);
            this.f2657l = null;
        }

        @WorkerThread
        public final void m() {
            if (this.f2655j) {
                g.this.f2649j.removeMessages(11, this.d);
                g.this.f2649j.removeMessages(9, this.d);
                this.f2655j = false;
            }
        }

        @WorkerThread
        public final void n(@NonNull b.l.a.c.c.b bVar) {
            b.l.a.c.j.e eVar;
            b.l.a.c.b.a.t(g.this.f2649j);
            i1 i1Var = this.f2654i;
            if (!(i1Var == null || (eVar = i1Var.f) == null)) {
                eVar.b();
            }
            l();
            g.this.d.a.clear();
            u(bVar);
            if (bVar.f2588i == 4) {
                Status status = g.f2640k;
                q(g.f2641l);
            } else if (this.a.isEmpty()) {
                this.f2657l = bVar;
            } else {
                t(bVar);
                if (!g.this.c(bVar, this.f2653h)) {
                    if (bVar.f2588i == 18) {
                        this.f2655j = true;
                    }
                    if (this.f2655j) {
                        Handler handler = g.this.f2649j;
                        Message obtain = Message.obtain(handler, 9, this.d);
                        Objects.requireNonNull(g.this);
                        handler.sendMessageDelayed(obtain, 5000);
                        return;
                    }
                    String str = this.d.c.c;
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 63);
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    q(new Status(17, sb.toString()));
                }
            }
        }

        public final void o(b.l.a.c.c.b bVar, b.l.a.c.c.l.a<?> aVar, boolean z) {
            if (Looper.myLooper() == g.this.f2649j.getLooper()) {
                n(bVar);
            } else {
                g.this.f2649j.post(new u0(this, bVar));
            }
        }

        public final void p() {
            g.this.f2649j.removeMessages(12, this.d);
            Handler handler = g.this.f2649j;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.d), g.this.a);
        }

        @WorkerThread
        public final void q(Status status) {
            b.l.a.c.b.a.t(g.this.f2649j);
            for (g1 a2 : this.a) {
                a2.a(status);
            }
            this.a.clear();
        }

        @WorkerThread
        public final void r(g1 g1Var) {
            g1Var.b(this.f2651e, b());
            try {
                g1Var.e(this);
            } catch (DeadObjectException unused) {
                g(1);
                this.f2650b.b();
            }
        }

        @WorkerThread
        public final boolean s(boolean z) {
            b.l.a.c.b.a.t(g.this.f2649j);
            if (!this.f2650b.a() || this.f2652g.size() != 0) {
                return false;
            }
            c2 c2Var = this.f2651e;
            if (!c2Var.a.isEmpty() || !c2Var.f2623b.isEmpty()) {
                if (z) {
                    p();
                }
                return false;
            }
            this.f2650b.b();
            return true;
        }

        @WorkerThread
        public final boolean t(@NonNull b.l.a.c.c.b bVar) {
            Status status = g.f2640k;
            synchronized (g.f2642m) {
                Objects.requireNonNull(g.this);
            }
            return false;
        }

        @WorkerThread
        public final void u(b.l.a.c.c.b bVar) {
            for (u1 next : this.f) {
                String str = null;
                if (b.l.a.c.b.a.T(bVar, b.l.a.c.c.b.f2586l)) {
                    str = this.f2650b.q();
                }
                next.a(this.d, bVar, str);
            }
            this.f.clear();
        }
    }

    public class b implements j1, b.c {
        public final a.f a;

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f2659b;
        public n c = null;
        public Set<Scope> d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2660e = false;

        public b(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.f2659b = bVar;
        }

        public final void a(@NonNull b.l.a.c.c.b bVar) {
            g.this.f2649j.post(new z0(this, bVar));
        }

        @WorkerThread
        public final void b(b.l.a.c.c.b bVar) {
            a aVar = g.this.f2646g.get(this.f2659b);
            b.l.a.c.b.a.t(g.this.f2649j);
            aVar.f2650b.b();
            aVar.n(bVar);
        }
    }

    public static class c {
        public final b<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final b.l.a.c.c.d f2661b;

        public c(b bVar, b.l.a.c.c.d dVar, s0 s0Var) {
            this.a = bVar;
            this.f2661b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                return b.l.a.c.b.a.T(this.a, cVar.a) && b.l.a.c.b.a.T(this.f2661b, cVar.f2661b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.f2661b});
        }

        public final String toString() {
            r rVar = new r(this, (q0) null);
            rVar.a("key", this.a);
            rVar.a("feature", this.f2661b);
            return rVar.toString();
        }
    }

    public g(Context context, Looper looper, e eVar) {
        this.f2644b = context;
        b.l.a.c.f.c.c cVar = new b.l.a.c.f.c.c(looper, this);
        this.f2649j = cVar;
        this.c = eVar;
        this.d = new m(eVar);
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    public static g a(Context context) {
        g gVar;
        synchronized (f2642m) {
            if (f2643n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = e.c;
                f2643n = new g(applicationContext, looper, e.d);
            }
            gVar = f2643n;
        }
        return gVar;
    }

    @WorkerThread
    public final void b(d<?> dVar) {
        b<O> bVar = dVar.d;
        a aVar = this.f2646g.get(bVar);
        if (aVar == null) {
            aVar = new a(dVar);
            this.f2646g.put(bVar, aVar);
        }
        if (aVar.b()) {
            this.f2648i.add(bVar);
        }
        aVar.a();
    }

    public final boolean c(b.l.a.c.c.b bVar, int i2) {
        PendingIntent pendingIntent;
        e eVar = this.c;
        Context context = this.f2644b;
        Objects.requireNonNull(eVar);
        if (bVar.V()) {
            pendingIntent = bVar.f2589j;
        } else {
            Intent a2 = eVar.a(context, bVar.f2588i, (String) null);
            pendingIntent = a2 == null ? null : PendingIntent.getActivity(context, 0, a2, 134217728);
        }
        if (pendingIntent == null) {
            return false;
        }
        int i3 = bVar.f2588i;
        int i4 = GoogleApiActivity.f7245i;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        eVar.i(context, i3, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        b.l.a.c.c.d[] f2;
        int i2 = message.what;
        long j2 = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
        int i3 = 0;
        a aVar = null;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.a = j2;
                this.f2649j.removeMessages(12);
                for (b<?> obtainMessage : this.f2646g.keySet()) {
                    Handler handler = this.f2649j;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.a);
                }
                break;
            case 2:
                u1 u1Var = (u1) message.obj;
                Iterator<b<?>> it = u1Var.a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b next = it.next();
                        a aVar2 = this.f2646g.get(next);
                        if (aVar2 == null) {
                            u1Var.a(next, new b.l.a.c.c.b(13), (String) null);
                            break;
                        } else if (aVar2.f2650b.a()) {
                            u1Var.a(next, b.l.a.c.c.b.f2586l, aVar2.f2650b.q());
                        } else {
                            b.l.a.c.b.a.t(g.this.f2649j);
                            if (aVar2.f2657l != null) {
                                b.l.a.c.b.a.t(g.this.f2649j);
                                u1Var.a(next, aVar2.f2657l, (String) null);
                            } else {
                                b.l.a.c.b.a.t(g.this.f2649j);
                                aVar2.f.add(u1Var);
                                aVar2.a();
                            }
                        }
                    }
                }
            case 3:
                for (a next2 : this.f2646g.values()) {
                    next2.l();
                    next2.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                e1 e1Var = (e1) message.obj;
                a aVar3 = this.f2646g.get(e1Var.c.d);
                if (aVar3 == null) {
                    b(e1Var.c);
                    aVar3 = this.f2646g.get(e1Var.c.d);
                }
                if (aVar3.b() && this.f.get() != e1Var.f2632b) {
                    e1Var.a.a(f2640k);
                    aVar3.j();
                    break;
                } else {
                    aVar3.d(e1Var.a);
                    break;
                }
                break;
            case 5:
                int i4 = message.arg1;
                b.l.a.c.c.b bVar = (b.l.a.c.c.b) message.obj;
                Iterator<a<?>> it2 = this.f2646g.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a next3 = it2.next();
                        if (next3.f2653h == i4) {
                            aVar = next3;
                        }
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i4);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    e eVar = this.c;
                    int i5 = bVar.f2588i;
                    Objects.requireNonNull(eVar);
                    boolean z = b.l.a.c.c.i.a;
                    String X = b.l.a.c.c.b.X(i5);
                    String str = bVar.f2590k;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(X).length() + 69);
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(X);
                    sb2.append(": ");
                    sb2.append(str);
                    aVar.q(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f2644b.getApplicationContext() instanceof Application) {
                    c.b((Application) this.f2644b.getApplicationContext());
                    c cVar = c.f2618l;
                    cVar.a(new s0(this));
                    if (!cVar.f2620i.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f2620i.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f2619h.set(true);
                        }
                    }
                    if (!cVar.f2619h.get()) {
                        this.a = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
                        break;
                    }
                }
                break;
            case 7:
                b((d) message.obj);
                break;
            case 9:
                if (this.f2646g.containsKey(message.obj)) {
                    a aVar4 = this.f2646g.get(message.obj);
                    b.l.a.c.b.a.t(g.this.f2649j);
                    if (aVar4.f2655j) {
                        aVar4.a();
                        break;
                    }
                }
                break;
            case 10:
                for (b<?> remove : this.f2648i) {
                    this.f2646g.remove(remove).j();
                }
                this.f2648i.clear();
                break;
            case 11:
                if (this.f2646g.containsKey(message.obj)) {
                    a aVar5 = this.f2646g.get(message.obj);
                    b.l.a.c.b.a.t(g.this.f2649j);
                    if (aVar5.f2655j) {
                        aVar5.m();
                        g gVar = g.this;
                        aVar5.q(gVar.c.d(gVar.f2644b) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        aVar5.f2650b.b();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f2646g.containsKey(message.obj)) {
                    this.f2646g.get(message.obj).s(true);
                    break;
                }
                break;
            case 14:
                Objects.requireNonNull((s) message.obj);
                if (!this.f2646g.containsKey((Object) null)) {
                    throw null;
                }
                this.f2646g.get((Object) null).s(false);
                throw null;
            case 15:
                c cVar2 = (c) message.obj;
                if (this.f2646g.containsKey(cVar2.a)) {
                    a aVar6 = this.f2646g.get(cVar2.a);
                    if (aVar6.f2656k.contains(cVar2) && !aVar6.f2655j) {
                        if (aVar6.f2650b.a()) {
                            aVar6.i();
                            break;
                        } else {
                            aVar6.a();
                            break;
                        }
                    }
                }
                break;
            case 16:
                c cVar3 = (c) message.obj;
                if (this.f2646g.containsKey(cVar3.a)) {
                    a aVar7 = this.f2646g.get(cVar3.a);
                    if (aVar7.f2656k.remove(cVar3)) {
                        g.this.f2649j.removeMessages(15, cVar3);
                        g.this.f2649j.removeMessages(16, cVar3);
                        b.l.a.c.c.d dVar = cVar3.f2661b;
                        ArrayList arrayList = new ArrayList(aVar7.a.size());
                        for (g1 g1Var : aVar7.a) {
                            if ((g1Var instanceof l0) && (f2 = ((l0) g1Var).f(aVar7)) != null) {
                                int length = f2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        i6 = -1;
                                    } else if (!b.l.a.c.b.a.T(f2[i6], dVar)) {
                                        i6++;
                                    }
                                }
                                if (i6 >= 0) {
                                    arrayList.add(g1Var);
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            g1 g1Var2 = (g1) obj;
                            aVar7.a.remove(g1Var2);
                            g1Var2.c(new b.l.a.c.c.l.j(dVar));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
