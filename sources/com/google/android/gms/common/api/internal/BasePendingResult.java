package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.e;
import b.l.a.c.c.l.f;
import b.l.a.c.c.l.h;
import b.l.a.c.c.l.i;
import b.l.a.c.c.l.k.p1;
import b.l.a.c.c.l.k.v1;
import b.l.a.c.f.c.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends h> extends e<R> {

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadLocal<Boolean> f7266n = new v1();
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final a<R> f7267b;
    public final WeakReference<GoogleApiClient> c;
    public final CountDownLatch d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<e.a> f7268e;
    public i<? super R> f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<p1> f7269g;

    /* renamed from: h  reason: collision with root package name */
    public R f7270h;

    /* renamed from: i  reason: collision with root package name */
    public Status f7271i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f7272j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7273k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7274l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7275m;
    @KeepName
    public b mResultGuardian;

    public static class a<R extends h> extends c {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a(hVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.g(hVar);
                    throw e2;
                }
            } else if (i2 != 2) {
                Log.wtf("BasePendingResult", b.e.a.a.a.Q(45, "Don't know how to handle message: ", i2), new Exception());
            } else {
                ((BasePendingResult) message.obj).h(Status.f7260n);
            }
        }
    }

    public final class b {
        public b(v1 v1Var) {
        }

        public final void finalize() {
            BasePendingResult.g(BasePendingResult.this.f7270h);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.f7268e = new ArrayList<>();
        this.f7269g = new AtomicReference<>();
        this.f7275m = false;
        this.f7267b = new a<>(Looper.getMainLooper());
        this.c = new WeakReference<>((Object) null);
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.f7268e = new ArrayList<>();
        this.f7269g = new AtomicReference<>();
        this.f7275m = false;
        this.f7267b = new a<>(googleApiClient.f());
        this.c = new WeakReference<>(googleApiClient);
    }

    public static void g(h hVar) {
        if (hVar instanceof f) {
            try {
                ((f) hVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.f7273k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001f
            boolean r1 = r2.f7272j     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            R r1 = r2.f7270h     // Catch:{ all -> 0x0021 }
            g(r1)     // Catch:{ all -> 0x0021 }
            r1 = 1
            r2.f7273k = r1     // Catch:{ all -> 0x0021 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f7261o     // Catch:{ all -> 0x0021 }
            b.l.a.c.c.l.h r1 = r2.b(r1)     // Catch:{ all -> 0x0021 }
            r2.f(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a():void");
    }

    @NonNull
    public abstract R b(Status status);

    public final R c() {
        R r;
        synchronized (this.a) {
            b.l.a.c.b.a.G(!this.f7272j, "Result has already been consumed.");
            b.l.a.c.b.a.G(d(), "Result is not ready.");
            r = this.f7270h;
            this.f7270h = null;
            this.f = null;
            this.f7272j = true;
        }
        p1 andSet = this.f7269g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    public final boolean d() {
        return this.d.getCount() == 0;
    }

    public final void e(R r) {
        synchronized (this.a) {
            if (this.f7274l || this.f7273k) {
                g(r);
                return;
            }
            d();
            boolean z = true;
            b.l.a.c.b.a.G(!d(), "Results have already been set");
            if (this.f7272j) {
                z = false;
            }
            b.l.a.c.b.a.G(z, "Result has already been consumed");
            f(r);
        }
    }

    public final void f(R r) {
        this.f7270h = r;
        this.d.countDown();
        this.f7271i = this.f7270h.y();
        if (this.f7273k) {
            this.f = null;
        } else if (this.f != null) {
            this.f7267b.removeMessages(2);
            a<R> aVar = this.f7267b;
            i<? super R> iVar = this.f;
            h c2 = c();
            Objects.requireNonNull(aVar);
            aVar.sendMessage(aVar.obtainMessage(1, new Pair(iVar, c2)));
        } else if (this.f7270h instanceof f) {
            this.mResultGuardian = new b((v1) null);
        }
        ArrayList<e.a> arrayList = this.f7268e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            e.a aVar2 = arrayList.get(i2);
            i2++;
            aVar2.a(this.f7271i);
        }
        this.f7268e.clear();
    }

    public final void h(Status status) {
        synchronized (this.a) {
            if (!d()) {
                e(b(status));
                this.f7274l = true;
            }
        }
    }

    public final void i() {
        this.f7275m = this.f7275m || f7266n.get().booleanValue();
    }
}
