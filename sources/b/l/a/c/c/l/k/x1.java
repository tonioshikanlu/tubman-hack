package b.l.a.c.c.l.k;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b.l.a.c.c.b;
import b.l.a.c.c.f;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.d;
import b.l.a.c.j.e;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

public final class x1 implements c1 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f2731b;
    public final p0 c;
    public final p0 d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<a.c<?>, p0> f2732e;
    public final Set<n> f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: g  reason: collision with root package name */
    public final a.f f2733g;

    /* renamed from: h  reason: collision with root package name */
    public Bundle f2734h;

    /* renamed from: i  reason: collision with root package name */
    public b f2735i = null;

    /* renamed from: j  reason: collision with root package name */
    public b f2736j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2737k = false;

    /* renamed from: l  reason: collision with root package name */
    public final Lock f2738l;

    /* renamed from: m  reason: collision with root package name */
    public int f2739m = 0;

    public x1(Context context, j0 j0Var, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, d dVar, a.C0058a<? extends e, b.l.a.c.j.a> aVar, a.f fVar2, ArrayList<w1> arrayList, ArrayList<w1> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.a = context;
        this.f2731b = j0Var;
        this.f2738l = lock;
        this.f2733g = fVar2;
        Context context2 = context;
        j0 j0Var2 = j0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        f fVar3 = fVar;
        p0 p0Var = r3;
        p0 p0Var2 = new p0(context2, j0Var2, lock2, looper2, fVar3, map2, (d) null, map4, (a.C0058a<? extends e, b.l.a.c.j.a>) null, arrayList2, new z1(this, (a2) null));
        this.c = p0Var;
        this.d = new p0(context2, j0Var2, lock2, looper2, fVar3, map, dVar, map3, aVar, arrayList, new b2(this, (a2) null));
        ArrayMap arrayMap = new ArrayMap();
        for (a.c<?> put : map2.keySet()) {
            arrayMap.put(put, this.c);
        }
        for (a.c<?> put2 : map.keySet()) {
            arrayMap.put(put2, this.d);
        }
        this.f2732e = Collections.unmodifiableMap(arrayMap);
    }

    public static void g(x1 x1Var) {
        b bVar;
        b bVar2;
        if (!h(x1Var.f2735i)) {
            if (x1Var.f2735i == null || !h(x1Var.f2736j)) {
                bVar = x1Var.f2735i;
                if (bVar != null && (bVar2 = x1Var.f2736j) != null) {
                    if (x1Var.d.f2700l < x1Var.c.f2700l) {
                        bVar = bVar2;
                    }
                } else {
                    return;
                }
            } else {
                x1Var.d.b();
                bVar = x1Var.f2735i;
            }
            x1Var.f(bVar);
        } else if (h(x1Var.f2736j) || x1Var.j()) {
            int i2 = x1Var.f2739m;
            if (i2 != 1) {
                if (i2 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    x1Var.f2739m = 0;
                }
                x1Var.f2731b.a(x1Var.f2734h);
            }
            x1Var.i();
            x1Var.f2739m = 0;
        } else {
            b bVar3 = x1Var.f2736j;
            if (bVar3 == null) {
                return;
            }
            if (x1Var.f2739m == 1) {
                x1Var.i();
                return;
            }
            x1Var.f(bVar3);
            x1Var.c.b();
        }
    }

    public static boolean h(b bVar) {
        return bVar != null && bVar.W();
    }

    public final boolean a() {
        this.f2738l.lock();
        try {
            boolean z = true;
            if (!(this.c.f2699k instanceof t) || (!(this.d.f2699k instanceof t) && !j() && this.f2739m != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f2738l.unlock();
        }
    }

    public final void b() {
        this.f2736j = null;
        this.f2735i = null;
        this.f2739m = 0;
        this.c.b();
        this.d.b();
        i();
    }

    public final void c() {
        this.f2739m = 2;
        this.f2737k = false;
        this.f2736j = null;
        this.f2735i = null;
        this.c.f2699k.c();
        this.d.f2699k.c();
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(@NonNull T t) {
        p0 p0Var;
        a.c<A> cVar = t.f2624o;
        b.l.a.c.b.a.k(this.f2732e.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        if (!this.f2732e.get(cVar).equals(this.d)) {
            p0Var = this.c;
        } else if (j()) {
            t.l(new Status(1, 4, (String) null, this.f2733g == null ? null : PendingIntent.getActivity(this.a, System.identityHashCode(this.f2731b), this.f2733g.s(), 134217728)));
            return t;
        } else {
            p0Var = this.d;
        }
        return p0Var.d(t);
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.d.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.c.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void f(b bVar) {
        int i2 = this.f2739m;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f2739m = 0;
            }
            this.f2731b.b(bVar);
        }
        i();
        this.f2739m = 0;
    }

    public final void i() {
        for (n a2 : this.f) {
            a2.a();
        }
        this.f.clear();
    }

    public final boolean j() {
        b bVar = this.f2736j;
        return bVar != null && bVar.f2588i == 4;
    }
}
