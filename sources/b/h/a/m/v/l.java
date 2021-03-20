package b.h.a.m.v;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.t;
import b.h.a.m.v.a;
import b.h.a.m.v.d0.a;
import b.h.a.m.v.d0.e;
import b.h.a.m.v.d0.f;
import b.h.a.m.v.d0.h;
import b.h.a.m.v.d0.i;
import b.h.a.m.v.i;
import b.h.a.m.v.q;
import b.h.a.q.g;
import b.h.a.s.k.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class l implements n, i.a, q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f718i = Log.isLoggable("Engine", 2);
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final p f719b;
    public final i c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final z f720e;
    public final c f;

    /* renamed from: g  reason: collision with root package name */
    public final a f721g;

    /* renamed from: h  reason: collision with root package name */
    public final a f722h;

    @VisibleForTesting
    public static class a {
        public final i.d a;

        /* renamed from: b  reason: collision with root package name */
        public final Pools.Pool<i<?>> f723b = b.h.a.s.k.a.a(150, new C0027a());
        public int c;

        /* renamed from: b.h.a.m.v.l$a$a  reason: collision with other inner class name */
        public class C0027a implements a.b<i<?>> {
            public C0027a() {
            }

            public Object a() {
                a aVar = a.this;
                return new i(aVar.a, aVar.f723b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    @VisibleForTesting
    public static class b {
        public final b.h.a.m.v.e0.a a;

        /* renamed from: b  reason: collision with root package name */
        public final b.h.a.m.v.e0.a f724b;
        public final b.h.a.m.v.e0.a c;
        public final b.h.a.m.v.e0.a d;

        /* renamed from: e  reason: collision with root package name */
        public final n f725e;
        public final q.a f;

        /* renamed from: g  reason: collision with root package name */
        public final Pools.Pool<m<?>> f726g = b.h.a.s.k.a.a(150, new a());

        public class a implements a.b<m<?>> {
            public a() {
            }

            public Object a() {
                b bVar = b.this;
                return new m(bVar.a, bVar.f724b, bVar.c, bVar.d, bVar.f725e, bVar.f, bVar.f726g);
            }
        }

        public b(b.h.a.m.v.e0.a aVar, b.h.a.m.v.e0.a aVar2, b.h.a.m.v.e0.a aVar3, b.h.a.m.v.e0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.f724b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.f725e = nVar;
            this.f = aVar5;
        }
    }

    public static class c implements i.d {
        public final a.C0023a a;

        /* renamed from: b  reason: collision with root package name */
        public volatile b.h.a.m.v.d0.a f727b;

        public c(a.C0023a aVar) {
            this.a = aVar;
        }

        public b.h.a.m.v.d0.a a() {
            if (this.f727b == null) {
                synchronized (this) {
                    if (this.f727b == null) {
                        b.h.a.m.v.d0.d dVar = (b.h.a.m.v.d0.d) this.a;
                        f fVar = (f) dVar.f660b;
                        File cacheDir = fVar.a.getCacheDir();
                        e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f663b != null) {
                            cacheDir = new File(cacheDir, fVar.f663b);
                        }
                        if (cacheDir != null) {
                            if (!cacheDir.mkdirs()) {
                                if (cacheDir.exists()) {
                                    if (!cacheDir.isDirectory()) {
                                    }
                                }
                            }
                            eVar = new e(cacheDir, dVar.a);
                        }
                        this.f727b = eVar;
                    }
                    if (this.f727b == null) {
                        this.f727b = new b.h.a.m.v.d0.b();
                    }
                }
            }
            return this.f727b;
        }
    }

    public class d {
        public final m<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final b.h.a.q.f f728b;

        public d(b.h.a.q.f fVar, m<?> mVar) {
            this.f728b = fVar;
            this.a = mVar;
        }
    }

    public l(b.h.a.m.v.d0.i iVar, a.C0023a aVar, b.h.a.m.v.e0.a aVar2, b.h.a.m.v.e0.a aVar3, b.h.a.m.v.e0.a aVar4, b.h.a.m.v.e0.a aVar5, boolean z) {
        this.c = iVar;
        c cVar = new c(aVar);
        this.f = cVar;
        a aVar6 = new a(z);
        this.f722h = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.d = this;
            }
        }
        this.f719b = new p();
        this.a = new t();
        this.d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f721g = new a(cVar);
        this.f720e = new z();
        ((h) iVar).d = this;
    }

    public static void d(String str, long j2, m mVar) {
        StringBuilder B = b.e.a.a.a.B(str, " in ");
        B.append(b.h.a.s.f.a(j2));
        B.append("ms, key: ");
        B.append(mVar);
        Log.v("Engine", B.toString());
    }

    public void a(m mVar, q<?> qVar) {
        a aVar = this.f722h;
        synchronized (aVar) {
            a.b remove = aVar.f620b.remove(mVar);
            if (remove != null) {
                remove.c = null;
                remove.clear();
            }
        }
        if (qVar.f751h) {
            w wVar = (w) ((h) this.c).d(mVar, qVar);
        } else {
            this.f720e.a(qVar, false);
        }
    }

    public <R> d b(b.h.a.e eVar, Object obj, m mVar, int i2, int i3, Class<?> cls, Class<R> cls2, b.h.a.f fVar, k kVar, Map<Class<?>, t<?>> map, boolean z, boolean z2, p pVar, boolean z3, boolean z4, boolean z5, boolean z6, b.h.a.q.f fVar2, Executor executor) {
        long j2;
        if (f718i) {
            int i4 = b.h.a.s.f.f1014b;
            j2 = SystemClock.elapsedRealtimeNanos();
        } else {
            j2 = 0;
        }
        long j3 = j2;
        Objects.requireNonNull(this.f719b);
        o oVar = new o(obj, mVar, i2, i3, map, cls, cls2, pVar);
        synchronized (this) {
            q<?> c2 = c(oVar, z3, j3);
            if (c2 == null) {
                d g2 = g(eVar, obj, mVar, i2, i3, cls, cls2, fVar, kVar, map, z, z2, pVar, z3, z4, z5, z6, fVar2, executor, oVar, j3);
                return g2;
            }
            ((g) fVar2).n(c2, b.h.a.m.a.MEMORY_CACHE);
            return null;
        }
    }

    @Nullable
    public final q<?> c(o oVar, boolean z, long j2) {
        q<?> qVar;
        Y remove;
        q<?> qVar2;
        if (!z) {
            return null;
        }
        a aVar = this.f722h;
        synchronized (aVar) {
            a.b bVar = aVar.f620b.get(oVar);
            if (bVar == null) {
                qVar = null;
            } else {
                qVar = (q) bVar.get();
                if (qVar == null) {
                    aVar.b(bVar);
                }
            }
        }
        if (qVar != null) {
            qVar.c();
        }
        if (qVar != null) {
            if (f718i) {
                d("Loaded resource from active resources", j2, oVar);
            }
            return qVar;
        }
        h hVar = (h) this.c;
        synchronized (hVar) {
            remove = hVar.a.remove(oVar);
            if (remove != null) {
                hVar.c -= (long) hVar.b(remove);
            }
        }
        w wVar = (w) remove;
        if (wVar == null) {
            qVar2 = null;
        } else {
            qVar2 = wVar instanceof q ? (q) wVar : new q<>(wVar, true, true, oVar, this);
        }
        if (qVar2 != null) {
            qVar2.c();
            this.f722h.a(oVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f718i) {
            d("Loaded resource from cache", j2, oVar);
        }
        return qVar2;
    }

    public synchronized void e(m<?> mVar, m mVar2, q<?> qVar) {
        if (qVar != null) {
            if (qVar.f751h) {
                this.f722h.a(mVar2, qVar);
            }
        }
        t tVar = this.a;
        Objects.requireNonNull(tVar);
        Map<m, m<?>> a2 = tVar.a(mVar.w);
        if (mVar.equals(a2.get(mVar2))) {
            a2.remove(mVar2);
        }
    }

    public void f(w<?> wVar) {
        if (wVar instanceof q) {
            ((q) wVar).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> b.h.a.m.v.l.d g(b.h.a.e r17, java.lang.Object r18, b.h.a.m.m r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, b.h.a.f r24, b.h.a.m.v.k r25, java.util.Map<java.lang.Class<?>, b.h.a.m.t<?>> r26, boolean r27, boolean r28, b.h.a.m.p r29, boolean r30, boolean r31, boolean r32, boolean r33, b.h.a.q.f r34, java.util.concurrent.Executor r35, b.h.a.m.v.o r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            b.h.a.m.v.t r15 = r1.a
            if (r9 == 0) goto L_0x0023
            java.util.Map<b.h.a.m.m, b.h.a.m.v.m<?>> r15 = r15.f766b
            goto L_0x0025
        L_0x0023:
            java.util.Map<b.h.a.m.m, b.h.a.m.v.m<?>> r15 = r15.a
        L_0x0025:
            java.lang.Object r15 = r15.get(r12)
            b.h.a.m.v.m r15 = (b.h.a.m.v.m) r15
            if (r15 == 0) goto L_0x003f
            r15.a(r10, r11)
            boolean r0 = f718i
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "Added to existing load"
            d(r0, r13, r12)
        L_0x0039:
            b.h.a.m.v.l$d r0 = new b.h.a.m.v.l$d
            r0.<init>(r10, r15)
            return r0
        L_0x003f:
            b.h.a.m.v.l$b r15 = r1.d
            androidx.core.util.Pools$Pool<b.h.a.m.v.m<?>> r15 = r15.f726g
            java.lang.Object r15 = r15.acquire()
            b.h.a.m.v.m r15 = (b.h.a.m.v.m) r15
            java.lang.String r13 = "Argument must not be null"
            java.util.Objects.requireNonNull(r15, r13)
            monitor-enter(r15)
            r15.s = r12     // Catch:{ all -> 0x0116 }
            r13 = r30
            r15.t = r13     // Catch:{ all -> 0x0116 }
            r13 = r31
            r15.u = r13     // Catch:{ all -> 0x0116 }
            r13 = r32
            r15.v = r13     // Catch:{ all -> 0x0116 }
            r15.w = r9     // Catch:{ all -> 0x0116 }
            monitor-exit(r15)
            b.h.a.m.v.l$a r13 = r1.f721g
            androidx.core.util.Pools$Pool<b.h.a.m.v.i<?>> r14 = r13.f723b
            java.lang.Object r14 = r14.acquire()
            b.h.a.m.v.i r14 = (b.h.a.m.v.i) r14
            java.lang.String r10 = "Argument must not be null"
            java.util.Objects.requireNonNull(r14, r10)
            int r10 = r13.c
            int r11 = r10 + 1
            r13.c = r11
            b.h.a.m.v.h<R> r11 = r14.f691h
            b.h.a.m.v.i$d r13 = r14.f694k
            r11.c = r0
            r11.d = r2
            r11.f687n = r3
            r11.f679e = r4
            r11.f = r5
            r11.f689p = r7
            r1 = r22
            r11.f680g = r1
            r11.f681h = r13
            r1 = r23
            r11.f684k = r1
            r11.f688o = r6
            r11.f682i = r8
            r1 = r26
            r11.f683j = r1
            r1 = r27
            r11.f690q = r1
            r1 = r28
            r11.r = r1
            r14.f698o = r0
            r14.f699p = r3
            r14.f700q = r6
            r14.r = r12
            r14.s = r4
            r14.t = r5
            r14.u = r7
            r14.B = r9
            r14.v = r8
            r14.w = r15
            r14.x = r10
            b.h.a.m.v.i$f r0 = b.h.a.m.v.i.f.INITIALIZE
            r14.z = r0
            r14.C = r2
            r1 = r16
            b.h.a.m.v.t r0 = r1.a
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r15.w
            java.util.Map r0 = r0.a(r2)
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.a(r0, r2)
            monitor-enter(r15)
            r15.D = r14     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r2 = b.h.a.m.v.i.g.INITIALIZE     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r2 = r14.r(r2)     // Catch:{ all -> 0x0113 }
            b.h.a.m.v.i$g r3 = b.h.a.m.v.i.g.RESOURCE_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 == r3) goto L_0x00e6
            b.h.a.m.v.i$g r3 = b.h.a.m.v.i.g.DATA_CACHE     // Catch:{ all -> 0x0113 }
            if (r2 != r3) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r2 = 0
            goto L_0x00e7
        L_0x00e6:
            r2 = 1
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            b.h.a.m.v.e0.a r2 = r15.f735n     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00ec:
            boolean r2 = r15.u     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00f3
            b.h.a.m.v.e0.a r2 = r15.f737p     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00f3:
            boolean r2 = r15.v     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x00fa
            b.h.a.m.v.e0.a r2 = r15.f738q     // Catch:{ all -> 0x0113 }
            goto L_0x00fc
        L_0x00fa:
            b.h.a.m.v.e0.a r2 = r15.f736o     // Catch:{ all -> 0x0113 }
        L_0x00fc:
            java.util.concurrent.ExecutorService r2 = r2.f673h     // Catch:{ all -> 0x0113 }
            r2.execute(r14)     // Catch:{ all -> 0x0113 }
            monitor-exit(r15)
            boolean r2 = f718i
            if (r2 == 0) goto L_0x010d
            java.lang.String r2 = "Started new load"
            r3 = r37
            d(r2, r3, r12)
        L_0x010d:
            b.h.a.m.v.l$d r2 = new b.h.a.m.v.l$d
            r2.<init>(r0, r15)
            return r2
        L_0x0113:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0116:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.v.l.g(b.h.a.e, java.lang.Object, b.h.a.m.m, int, int, java.lang.Class, java.lang.Class, b.h.a.f, b.h.a.m.v.k, java.util.Map, boolean, boolean, b.h.a.m.p, boolean, boolean, boolean, boolean, b.h.a.q.f, java.util.concurrent.Executor, b.h.a.m.v.o, long):b.h.a.m.v.l$d");
    }
}
