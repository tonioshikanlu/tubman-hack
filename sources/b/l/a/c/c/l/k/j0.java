package b.l.a.c.c.l.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.c.b;
import b.l.a.c.c.e;
import b.l.a.c.c.i;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.d;
import b.l.a.c.c.m.j;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class j0 extends GoogleApiClient implements d1 {

    /* renamed from: b  reason: collision with root package name */
    public final Lock f2674b;
    public final j c;
    public c1 d = null;

    /* renamed from: e  reason: collision with root package name */
    public final int f2675e;
    public final Context f;

    /* renamed from: g  reason: collision with root package name */
    public final Looper f2676g;

    /* renamed from: h  reason: collision with root package name */
    public final Queue<d<?, ?>> f2677h = new LinkedList();

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f2678i;

    /* renamed from: j  reason: collision with root package name */
    public long f2679j = 120000;

    /* renamed from: k  reason: collision with root package name */
    public long f2680k = 5000;

    /* renamed from: l  reason: collision with root package name */
    public final k0 f2681l;

    /* renamed from: m  reason: collision with root package name */
    public final e f2682m;

    /* renamed from: n  reason: collision with root package name */
    public b1 f2683n;

    /* renamed from: o  reason: collision with root package name */
    public final Map<a.c<?>, a.f> f2684o;

    /* renamed from: p  reason: collision with root package name */
    public Set<Scope> f2685p = new HashSet();

    /* renamed from: q  reason: collision with root package name */
    public final d f2686q;
    public final Map<a<?>, Boolean> r;
    public final a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> s;
    public final k t = new k();
    public final ArrayList<w1> u;
    public Integer v = null;
    public final o1 w;
    public final j.a x;

    public j0(Context context, Lock lock, Looper looper, d dVar, e eVar, a.C0058a aVar, Map map, List list, List list2, Map map2, int i2, int i3, ArrayList arrayList) {
        Map map3 = map2;
        int i4 = i2;
        i0 i0Var = new i0(this);
        this.x = i0Var;
        this.f = context;
        this.f2674b = lock;
        this.c = new j(looper, i0Var);
        this.f2676g = looper;
        this.f2681l = new k0(this, looper);
        this.f2682m = eVar;
        this.f2675e = i4;
        if (i4 >= 0) {
            this.v = Integer.valueOf(i3);
        }
        this.r = map;
        this.f2684o = map3;
        this.u = arrayList;
        this.w = new o1(map3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleApiClient.b bVar = (GoogleApiClient.b) it.next();
            j jVar = this.c;
            Objects.requireNonNull(jVar);
            Objects.requireNonNull(bVar, "null reference");
            synchronized (jVar.f2797i) {
                if (jVar.f2793b.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    jVar.f2793b.add(bVar);
                }
            }
            if (jVar.a.a()) {
                Handler handler = jVar.f2796h;
                handler.sendMessage(handler.obtainMessage(1, bVar));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.c.b((GoogleApiClient.c) it2.next());
        }
        this.f2686q = dVar;
        this.s = aVar;
    }

    public static int j(Iterable<a.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (a.f next : iterable) {
            if (next.t()) {
                z2 = true;
            }
            if (next.h()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    public static void k(j0 j0Var) {
        j0Var.f2674b.lock();
        try {
            if (j0Var.f2678i) {
                j0Var.l();
            }
        } finally {
            j0Var.f2674b.unlock();
        }
    }

    public static String o(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final void a(Bundle bundle) {
        while (!this.f2677h.isEmpty()) {
            d(this.f2677h.remove());
        }
        j jVar = this.c;
        b.l.a.c.b.a.u(jVar.f2796h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (jVar.f2797i) {
            boolean z = true;
            b.l.a.c.b.a.F(!jVar.f2795g);
            jVar.f2796h.removeMessages(1);
            jVar.f2795g = true;
            if (jVar.c.size() != 0) {
                z = false;
            }
            b.l.a.c.b.a.F(z);
            ArrayList arrayList = new ArrayList(jVar.f2793b);
            int i2 = jVar.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.b bVar = (GoogleApiClient.b) obj;
                if (!jVar.f2794e || !jVar.a.a() || jVar.f.get() != i2) {
                    break;
                } else if (!jVar.c.contains(bVar)) {
                    bVar.k(bundle);
                }
            }
            jVar.c.clear();
            jVar.f2795g = false;
        }
    }

    public final void b(b bVar) {
        e eVar = this.f2682m;
        Context context = this.f;
        int i2 = bVar.f2588i;
        Objects.requireNonNull(eVar);
        if (!i.c(context, i2)) {
            m();
        }
        if (!this.f2678i) {
            j jVar = this.c;
            b.l.a.c.b.a.u(jVar.f2796h, "onConnectionFailure must only be called on the Handler thread");
            jVar.f2796h.removeMessages(1);
            synchronized (jVar.f2797i) {
                ArrayList arrayList = new ArrayList(jVar.d);
                int i3 = jVar.f.get();
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    GoogleApiClient.c cVar = (GoogleApiClient.c) obj;
                    if (!jVar.f2794e) {
                        break;
                    } else if (jVar.f.get() != i3) {
                        break;
                    } else if (jVar.d.contains(cVar)) {
                        cVar.n(bVar);
                    }
                }
            }
            this.c.a();
        }
    }

    public final void c(int i2, boolean z) {
        if (i2 == 1 && !z && !this.f2678i) {
            this.f2678i = true;
            if (this.f2683n == null) {
                try {
                    this.f2683n = this.f2682m.g(this.f.getApplicationContext(), new n0(this));
                } catch (SecurityException unused) {
                }
            }
            k0 k0Var = this.f2681l;
            k0Var.sendMessageDelayed(k0Var.obtainMessage(1), this.f2679j);
            k0 k0Var2 = this.f2681l;
            k0Var2.sendMessageDelayed(k0Var2.obtainMessage(2), this.f2680k);
        }
        for (BasePendingResult h2 : (BasePendingResult[]) this.w.a.toArray(o1.f2689e)) {
            h2.h(o1.d);
        }
        j jVar = this.c;
        b.l.a.c.b.a.u(jVar.f2796h, "onUnintentionalDisconnection must only be called on the Handler thread");
        jVar.f2796h.removeMessages(1);
        synchronized (jVar.f2797i) {
            jVar.f2795g = true;
            ArrayList arrayList = new ArrayList(jVar.f2793b);
            int i3 = jVar.f.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                GoogleApiClient.b bVar = (GoogleApiClient.b) obj;
                if (!jVar.f2794e || jVar.f.get() != i3) {
                    break;
                } else if (jVar.f2793b.contains(bVar)) {
                    bVar.g(i2);
                }
            }
            jVar.c.clear();
            jVar.f2795g = false;
        }
        this.c.a();
        if (i2 == 2) {
            l();
        }
    }

    public final void connect() {
        this.f2674b.lock();
        try {
            boolean z = false;
            if (this.f2675e >= 0) {
                if (this.v != null) {
                    z = true;
                }
                b.l.a.c.b.a.G(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(j(this.f2684o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            h(this.v.intValue());
        } finally {
            this.f2674b.unlock();
        }
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(@NonNull T t2) {
        b.l.a.c.b.a.k(t2.f2624o != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f2684o.containsKey(t2.f2624o);
        a<?> aVar = t2.f2625p;
        String str = aVar != null ? aVar.c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        b.l.a.c.b.a.k(containsKey, sb.toString());
        this.f2674b.lock();
        try {
            if (this.d != null) {
                if (this.f2678i) {
                    this.f2677h.add(t2);
                    while (!this.f2677h.isEmpty()) {
                        d remove = this.f2677h.remove();
                        this.w.b(remove);
                        remove.l(Status.f7259m);
                    }
                } else {
                    t2 = this.d.d(t2);
                }
                return t2;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f2674b.unlock();
        }
    }

    public final void disconnect() {
        this.f2674b.lock();
        try {
            this.w.a();
            c1 c1Var = this.d;
            if (c1Var != null) {
                c1Var.b();
            }
            k kVar = this.t;
            for (j<?> jVar : kVar.a) {
                jVar.f2672b = null;
            }
            kVar.a.clear();
            for (d dVar : this.f2677h) {
                dVar.f7269g.set((Object) null);
                dVar.a();
            }
            this.f2677h.clear();
            if (this.d != null) {
                m();
                this.c.a();
            }
        } finally {
            this.f2674b.unlock();
        }
    }

    @NonNull
    public final <C extends a.f> C e(@NonNull a.c<C> cVar) {
        C c2 = (a.f) this.f2684o.get(cVar);
        b.l.a.c.b.a.B(c2, "Appropriate Api was not requested.");
        return c2;
    }

    public final Looper f() {
        return this.f2676g;
    }

    public final boolean g() {
        c1 c1Var = this.d;
        return c1Var != null && c1Var.a();
    }

    public final void h(int i2) {
        this.f2674b.lock();
        boolean z = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            b.l.a.c.b.a.k(z, sb.toString());
            n(i2);
            l();
        } finally {
            this.f2674b.unlock();
        }
    }

    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f);
        printWriter.append(str).append("mResuming=").print(this.f2678i);
        printWriter.append(" mWorkQueue.size()=").print(this.f2677h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.w.a.size());
        c1 c1Var = this.d;
        if (c1Var != null) {
            c1Var.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void l() {
        this.c.f2794e = true;
        this.d.c();
    }

    public final boolean m() {
        if (!this.f2678i) {
            return false;
        }
        this.f2678i = false;
        this.f2681l.removeMessages(2);
        this.f2681l.removeMessages(1);
        b1 b1Var = this.f2683n;
        if (b1Var != null) {
            b1Var.a();
            this.f2683n = null;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: b.l.a.c.c.l.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(int r19) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Integer r0 = r15.v
            if (r0 != 0) goto L_0x000d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r15.v = r0
            goto L_0x0015
        L_0x000d:
            int r0 = r0.intValue()
            r1 = r19
            if (r0 != r1) goto L_0x0191
        L_0x0015:
            b.l.a.c.c.l.k.c1 r0 = r15.d
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            java.util.Map<b.l.a.c.c.l.a$c<?>, b.l.a.c.c.l.a$f> r0 = r15.f2684o
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0026:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r0.next()
            b.l.a.c.c.l.a$f r4 = (b.l.a.c.c.l.a.f) r4
            boolean r6 = r4.t()
            if (r6 == 0) goto L_0x003a
            r2 = r5
        L_0x003a:
            boolean r4 = r4.h()
            if (r4 == 0) goto L_0x0026
            r3 = r5
            goto L_0x0026
        L_0x0042:
            java.lang.Integer r0 = r15.v
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x015d
            r3 = 2
            if (r0 == r3) goto L_0x0050
        L_0x004d:
            r12 = r15
            goto L_0x0162
        L_0x0050:
            if (r2 == 0) goto L_0x004d
            android.content.Context r2 = r15.f
            java.util.concurrent.locks.Lock r3 = r15.f2674b
            android.os.Looper r4 = r15.f2676g
            b.l.a.c.c.e r6 = r15.f2682m
            java.util.Map<b.l.a.c.c.l.a$c<?>, b.l.a.c.c.l.a$f> r0 = r15.f2684o
            b.l.a.c.c.m.d r8 = r15.f2686q
            java.util.Map<b.l.a.c.c.l.a<?>, java.lang.Boolean> r7 = r15.r
            b.l.a.c.c.l.a$a<? extends b.l.a.c.j.e, b.l.a.c.j.a> r9 = r15.s
            java.util.ArrayList<b.l.a.c.c.l.k.w1> r10 = r15.u
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
            r11.<init>()
            androidx.collection.ArrayMap r12 = new androidx.collection.ArrayMap
            r12.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0077:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00a6
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r16 = r14.getValue()
            r1 = r16
            b.l.a.c.c.l.a$f r1 = (b.l.a.c.c.l.a.f) r1
            boolean r16 = r1.h()
            if (r16 == 0) goto L_0x0092
            r13 = r1
        L_0x0092:
            boolean r16 = r1.t()
            java.lang.Object r14 = r14.getKey()
            b.l.a.c.c.l.a$c r14 = (b.l.a.c.c.l.a.c) r14
            if (r16 == 0) goto L_0x00a2
            r11.put(r14, r1)
            goto L_0x0077
        L_0x00a2:
            r12.put(r14, r1)
            goto L_0x0077
        L_0x00a6:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r5
            java.lang.String r1 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            b.l.a.c.b.a.G(r0, r1)
            androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
            r14.<init>()
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap
            r5.<init>()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = r0.next()
            b.l.a.c.c.l.a r1 = (b.l.a.c.c.l.a) r1
            r16 = r0
            b.l.a.c.c.l.a$c r0 = r1.a()
            boolean r17 = r11.containsKey(r0)
            if (r17 == 0) goto L_0x00e6
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14.put(r1, r0)
        L_0x00e3:
            r0 = r16
            goto L_0x00c2
        L_0x00e6:
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r5.put(r1, r0)
            goto L_0x00e3
        L_0x00f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r10.size()
            r15 = 0
        L_0x010d:
            if (r15 >= r0) goto L_0x0141
            java.lang.Object r16 = r10.get(r15)
            int r15 = r15 + 1
            r19 = r0
            r0 = r16
            b.l.a.c.c.l.k.w1 r0 = (b.l.a.c.c.l.k.w1) r0
            r16 = r10
            b.l.a.c.c.l.a<?> r10 = r0.a
            boolean r10 = r14.containsKey(r10)
            if (r10 == 0) goto L_0x0129
            r7.add(r0)
            goto L_0x0134
        L_0x0129:
            b.l.a.c.c.l.a<?> r10 = r0.a
            boolean r10 = r5.containsKey(r10)
            if (r10 == 0) goto L_0x0139
            r1.add(r0)
        L_0x0134:
            r0 = r19
            r10 = r16
            goto L_0x010d
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)
            throw r0
        L_0x0141:
            b.l.a.c.c.l.k.x1 r15 = new b.l.a.c.c.l.k.x1
            r0 = r15
            r16 = r1
            r1 = r2
            r2 = r18
            r17 = r5
            r5 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            r10 = r13
            r12 = r16
            r13 = r14
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r12 = r18
            r12.d = r15
            return
        L_0x015d:
            r12 = r15
            if (r2 == 0) goto L_0x0189
            if (r3 != 0) goto L_0x0181
        L_0x0162:
            b.l.a.c.c.l.k.p0 r13 = new b.l.a.c.c.l.k.p0
            android.content.Context r1 = r12.f
            java.util.concurrent.locks.Lock r3 = r12.f2674b
            android.os.Looper r4 = r12.f2676g
            b.l.a.c.c.e r5 = r12.f2682m
            java.util.Map<b.l.a.c.c.l.a$c<?>, b.l.a.c.c.l.a$f> r6 = r12.f2684o
            b.l.a.c.c.m.d r7 = r12.f2686q
            java.util.Map<b.l.a.c.c.l.a<?>, java.lang.Boolean> r8 = r12.r
            b.l.a.c.c.l.a$a<? extends b.l.a.c.j.e, b.l.a.c.j.a> r9 = r12.s
            java.util.ArrayList<b.l.a.c.c.l.k.w1> r10 = r12.u
            r0 = r13
            r2 = r18
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.d = r13
            return
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)
            throw r0
        L_0x0189:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)
            throw r0
        L_0x0191:
            r12 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = o(r19)
            java.lang.Integer r2 = r12.v
            int r2 = r2.intValue()
            java.lang.String r2 = o(r2)
            int r3 = r1.length()
            int r3 = r3 + 51
            int r4 = r2.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r4 = "Cannot use sign-in mode: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ". Mode was already set to "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.l.k.j0.n(int):void");
    }
}
