package b.l.a.c.c.l.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.b;
import b.l.a.c.c.f;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.d;
import b.l.a.c.j.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class p0 implements c1, y1 {
    public final Lock a;

    /* renamed from: b  reason: collision with root package name */
    public final Condition f2693b;
    public final Context c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final r0 f2694e;
    public final Map<a.c<?>, a.f> f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<a.c<?>, b> f2695g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final d f2696h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<a<?>, Boolean> f2697i;

    /* renamed from: j  reason: collision with root package name */
    public final a.C0058a<? extends e, b.l.a.c.j.a> f2698j;

    /* renamed from: k  reason: collision with root package name */
    public volatile m0 f2699k;

    /* renamed from: l  reason: collision with root package name */
    public int f2700l;

    /* renamed from: m  reason: collision with root package name */
    public final j0 f2701m;

    /* renamed from: n  reason: collision with root package name */
    public final d1 f2702n;

    public p0(Context context, j0 j0Var, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, d dVar, Map<a<?>, Boolean> map2, a.C0058a<? extends e, b.l.a.c.j.a> aVar, ArrayList<w1> arrayList, d1 d1Var) {
        this.c = context;
        this.a = lock;
        this.d = fVar;
        this.f = map;
        this.f2696h = dVar;
        this.f2697i = map2;
        this.f2698j = aVar;
        this.f2701m = j0Var;
        this.f2702n = d1Var;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            w1 w1Var = arrayList.get(i2);
            i2++;
            w1Var.c = this;
        }
        this.f2694e = new r0(this, looper);
        this.f2693b = lock.newCondition();
        this.f2699k = new g0(this);
    }

    public final boolean a() {
        return this.f2699k instanceof t;
    }

    public final void b() {
        if (this.f2699k.b()) {
            this.f2695g.clear();
        }
    }

    public final void c() {
        this.f2699k.c();
    }

    public final <A extends a.b, T extends d<? extends h, A>> T d(@NonNull T t) {
        t.i();
        return this.f2699k.d(t);
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f2699k);
        for (a next : this.f2697i.keySet()) {
            printWriter.append(str).append(next.c).println(":");
            this.f.get(next.a()).e(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public final void f(b bVar) {
        this.a.lock();
        try {
            this.f2699k = new g0(this);
            this.f2699k.a();
            this.f2693b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void g(int i2) {
        this.a.lock();
        try {
            this.f2699k.g(i2);
        } finally {
            this.a.unlock();
        }
    }

    public final void k(@Nullable Bundle bundle) {
        this.a.lock();
        try {
            this.f2699k.k(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final void o(@NonNull b bVar, @NonNull a<?> aVar, boolean z) {
        this.a.lock();
        try {
            this.f2699k.o(bVar, aVar, z);
        } finally {
            this.a.unlock();
        }
    }
}
