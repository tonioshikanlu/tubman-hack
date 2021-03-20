package b.h.a.q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.e;
import b.h.a.f;
import b.h.a.m.m;
import b.h.a.m.p;
import b.h.a.m.t;
import b.h.a.m.v.k;
import b.h.a.m.v.l;
import b.h.a.m.v.r;
import b.h.a.m.v.w;
import b.h.a.q.h.h;
import b.h.a.s.j;
import b.h.a.s.k.d;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class g<R> implements b, b.h.a.q.h.g, f {
    public static final boolean D = Log.isLoggable("Request", 2);
    @GuardedBy("requestLock")
    public int A;
    @GuardedBy("requestLock")
    public boolean B;
    @Nullable
    public RuntimeException C;
    @Nullable
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final d f970b;
    public final Object c;
    @Nullable
    public final d<R> d;

    /* renamed from: e  reason: collision with root package name */
    public final c f971e;
    public final Context f;

    /* renamed from: g  reason: collision with root package name */
    public final e f972g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Object f973h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f974i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f975j;

    /* renamed from: k  reason: collision with root package name */
    public final int f976k;

    /* renamed from: l  reason: collision with root package name */
    public final int f977l;

    /* renamed from: m  reason: collision with root package name */
    public final f f978m;

    /* renamed from: n  reason: collision with root package name */
    public final h<R> f979n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final List<d<R>> f980o;

    /* renamed from: p  reason: collision with root package name */
    public final b.h.a.q.i.e<? super R> f981p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f982q;
    @GuardedBy("requestLock")
    public w<R> r;
    @GuardedBy("requestLock")
    public l.d s;
    @GuardedBy("requestLock")
    public long t;
    public volatile l u;
    @GuardedBy("requestLock")
    public a v;
    @GuardedBy("requestLock")
    @Nullable
    public Drawable w;
    @GuardedBy("requestLock")
    @Nullable
    public Drawable x;
    @GuardedBy("requestLock")
    @Nullable
    public Drawable y;
    @GuardedBy("requestLock")
    public int z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public g(Context context, e eVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, a<?> aVar, int i2, int i3, f fVar, h<R> hVar, @Nullable d<R> dVar, @Nullable List<d<R>> list, c cVar, l lVar, b.h.a.q.i.e<? super R> eVar2, Executor executor) {
        e eVar3 = eVar;
        this.a = D ? String.valueOf(hashCode()) : null;
        this.f970b = new d.b();
        this.c = obj;
        this.f = context;
        this.f972g = eVar3;
        this.f973h = obj2;
        this.f974i = cls;
        this.f975j = aVar;
        this.f976k = i2;
        this.f977l = i3;
        this.f978m = fVar;
        this.f979n = hVar;
        this.d = dVar;
        this.f980o = list;
        this.f971e = cVar;
        this.u = lVar;
        this.f981p = eVar2;
        this.f982q = executor;
        this.v = a.PENDING;
        if (this.C == null && eVar3.f490h) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.e()     // Catch:{ all -> 0x00b3 }
            b.h.a.s.k.d r1 = r5.f970b     // Catch:{ all -> 0x00b3 }
            r1.a()     // Catch:{ all -> 0x00b3 }
            int r1 = b.h.a.s.f.f1014b     // Catch:{ all -> 0x00b3 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00b3 }
            r5.t = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f973h     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003e
            int r1 = r5.f976k     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f977l     // Catch:{ all -> 0x00b3 }
            boolean r1 = b.h.a.s.j.j(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0029
            int r1 = r5.f976k     // Catch:{ all -> 0x00b3 }
            r5.z = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f977l     // Catch:{ all -> 0x00b3 }
            r5.A = r1     // Catch:{ all -> 0x00b3 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r5.g()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0031
            r1 = 5
            goto L_0x0032
        L_0x0031:
            r1 = 3
        L_0x0032:
            b.h.a.m.v.r r2 = new b.h.a.m.v.r     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.m(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003e:
            b.h.a.q.g$a r1 = r5.v     // Catch:{ all -> 0x00b3 }
            b.h.a.q.g$a r2 = b.h.a.q.g.a.RUNNING     // Catch:{ all -> 0x00b3 }
            if (r1 == r2) goto L_0x00ab
            b.h.a.q.g$a r3 = b.h.a.q.g.a.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r1 != r3) goto L_0x0051
            b.h.a.m.v.w<R> r1 = r5.r     // Catch:{ all -> 0x00b3 }
            b.h.a.m.a r2 = b.h.a.m.a.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r5.n(r1, r2)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0051:
            b.h.a.q.g$a r1 = b.h.a.q.g.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.v = r1     // Catch:{ all -> 0x00b3 }
            int r3 = r5.f976k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f977l     // Catch:{ all -> 0x00b3 }
            boolean r3 = b.h.a.s.j.j(r3, r4)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0067
            int r3 = r5.f976k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f977l     // Catch:{ all -> 0x00b3 }
            r5.d(r3, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x0067:
            b.h.a.q.h.h<R> r3 = r5.f979n     // Catch:{ all -> 0x00b3 }
            r3.h(r5)     // Catch:{ all -> 0x00b3 }
        L_0x006c:
            b.h.a.q.g$a r3 = r5.v     // Catch:{ all -> 0x00b3 }
            if (r3 == r2) goto L_0x0072
            if (r3 != r1) goto L_0x008b
        L_0x0072:
            b.h.a.q.c r1 = r5.f971e     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007f
            boolean r1 = r1.c(r5)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r1 = 0
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            if (r1 == 0) goto L_0x008b
            b.h.a.q.h.h<R> r1 = r5.f979n     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.h()     // Catch:{ all -> 0x00b3 }
            r1.e(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = D     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.t     // Catch:{ all -> 0x00b3 }
            double r2 = b.h.a.s.f.a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.l(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.g.a():void");
    }

    public boolean b() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.CLEARED;
        }
        return z2;
    }

    public boolean c() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r5.u.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            r5.e()     // Catch:{ all -> 0x0043 }
            b.h.a.s.k.d r1 = r5.f970b     // Catch:{ all -> 0x0043 }
            r1.a()     // Catch:{ all -> 0x0043 }
            b.h.a.q.g$a r1 = r5.v     // Catch:{ all -> 0x0043 }
            b.h.a.q.g$a r2 = b.h.a.q.g.a.CLEARED     // Catch:{ all -> 0x0043 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0013:
            r5.f()     // Catch:{ all -> 0x0043 }
            b.h.a.m.v.w<R> r1 = r5.r     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.r = r3     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            b.h.a.q.c r3 = r5.f971e     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.f(r5)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            b.h.a.q.h.h<R> r3 = r5.f979n     // Catch:{ all -> 0x0043 }
            android.graphics.drawable.Drawable r4 = r5.h()     // Catch:{ all -> 0x0043 }
            r3.g(r4)     // Catch:{ all -> 0x0043 }
        L_0x0038:
            r5.v = r2     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0042
            b.h.a.m.v.l r0 = r5.u
            r0.f(r1)
        L_0x0042:
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.g.clear():void");
    }

    public void d(int i2, int i3) {
        Object obj;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        a aVar;
        p pVar;
        int i5 = i2;
        int i6 = i3;
        this.f970b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                boolean z5 = D;
                if (z5) {
                    l("Got onSizeReady in " + b.h.a.s.f.a(this.t));
                }
                if (this.v == a.WAITING_FOR_SIZE) {
                    a aVar2 = a.RUNNING;
                    this.v = aVar2;
                    float f2 = this.f975j.f961i;
                    if (i5 != Integer.MIN_VALUE) {
                        i5 = Math.round(((float) i5) * f2);
                    }
                    this.z = i5;
                    if (i6 == Integer.MIN_VALUE) {
                        i4 = i6;
                    } else {
                        i4 = Math.round(f2 * ((float) i6));
                    }
                    this.A = i4;
                    if (z5) {
                        l("finished setup for calling load in " + b.h.a.s.f.a(this.t));
                    }
                    l lVar = this.u;
                    e eVar = this.f972g;
                    Object obj3 = this.f973h;
                    a<?> aVar3 = this.f975j;
                    m mVar = aVar3.s;
                    int i7 = this.z;
                    int i8 = this.A;
                    Class<?> cls = aVar3.z;
                    Class<R> cls2 = this.f974i;
                    f fVar = this.f978m;
                    k kVar = aVar3.f962j;
                    Map<Class<?>, t<?>> map = aVar3.y;
                    boolean z6 = aVar3.t;
                    a aVar4 = aVar2;
                    boolean z7 = aVar3.F;
                    p pVar2 = aVar3.x;
                    Object obj4 = obj2;
                    try {
                        z2 = aVar3.f968p;
                        z3 = aVar3.D;
                        z4 = aVar3.G;
                        aVar = aVar4;
                        pVar = pVar2;
                        obj = obj4;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        l.d b2 = lVar.b(eVar, obj3, mVar, i7, i8, cls, cls2, fVar, kVar, map, z6, z7, pVar, z2, z3, z4, aVar3.E, this, this.f982q);
                        try {
                            this.s = b2;
                            if (this.v != aVar) {
                                this.s = null;
                            }
                            if (z5) {
                                l("finished onSizeReady in " + b.h.a.s.f.a(this.t));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void e() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    public final void f() {
        e();
        this.f970b.a();
        this.f979n.a(this);
        l.d dVar = this.s;
        if (dVar != null) {
            synchronized (l.this) {
                dVar.a.g(dVar.f728b);
            }
            this.s = null;
        }
    }

    @GuardedBy("requestLock")
    public final Drawable g() {
        int i2;
        if (this.y == null) {
            a<?> aVar = this.f975j;
            Drawable drawable = aVar.v;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.w) > 0) {
                this.y = k(i2);
            }
        }
        return this.y;
    }

    @GuardedBy("requestLock")
    public final Drawable h() {
        int i2;
        if (this.x == null) {
            a<?> aVar = this.f975j;
            Drawable drawable = aVar.f966n;
            this.x = drawable;
            if (drawable == null && (i2 = aVar.f967o) > 0) {
                this.x = k(i2);
            }
        }
        return this.x;
    }

    public boolean i(b bVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        f fVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        f fVar2;
        int size2;
        b bVar2 = bVar;
        if (!(bVar2 instanceof g)) {
            return false;
        }
        synchronized (this.c) {
            i2 = this.f976k;
            i3 = this.f977l;
            obj = this.f973h;
            cls = this.f974i;
            aVar = this.f975j;
            fVar = this.f978m;
            List<d<R>> list = this.f980o;
            size = list != null ? list.size() : 0;
        }
        g gVar = (g) bVar2;
        synchronized (gVar.c) {
            i4 = gVar.f976k;
            i5 = gVar.f977l;
            obj2 = gVar.f973h;
            cls2 = gVar.f974i;
            aVar2 = gVar.f975j;
            fVar2 = gVar.f978m;
            List<d<R>> list2 = gVar.f980o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i2 == i4 && i3 == i5) {
            char[] cArr = j.a;
            if ((obj == null ? obj2 == null : obj instanceof b.h.a.m.w.l ? ((b.h.a.m.w.l) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public boolean isRunning() {
        boolean z2;
        synchronized (this.c) {
            a aVar = this.v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    @GuardedBy("requestLock")
    public final boolean j() {
        c cVar = this.f971e;
        return cVar == null || !cVar.getRoot().b();
    }

    @GuardedBy("requestLock")
    public final Drawable k(@DrawableRes int i2) {
        Resources.Theme theme = this.f975j.B;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        e eVar = this.f972g;
        return b.h.a.m.x.e.a.a(eVar, eVar, i2, theme);
    }

    public final void l(String str) {
        StringBuilder B2 = b.e.a.a.a.B(str, " this: ");
        B2.append(this.a);
        Log.v("Request", B2.toString());
    }

    /* JADX INFO: finally extract failed */
    public final void m(r rVar, int i2) {
        boolean z2;
        this.f970b.a();
        synchronized (this.c) {
            Objects.requireNonNull(rVar);
            int i3 = this.f972g.f491i;
            if (i3 <= i2) {
                Log.w("Glide", "Load failed for " + this.f973h + " with size [" + this.z + "x" + this.A + "]", rVar);
                if (i3 <= 4) {
                    rVar.e("Glide");
                }
            }
            this.s = null;
            this.v = a.FAILED;
            boolean z3 = true;
            this.B = true;
            try {
                List<d<R>> list = this.f980o;
                if (list != null) {
                    z2 = false;
                    for (d<R> b2 : list) {
                        z2 |= b2.b(rVar, this.f973h, this.f979n, j());
                    }
                } else {
                    z2 = false;
                }
                d<R> dVar = this.d;
                if (dVar == null || !dVar.b(rVar, this.f973h, this.f979n, j())) {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    p();
                }
                this.B = false;
                c cVar = this.f971e;
                if (cVar != null) {
                    cVar.a(this);
                }
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    public void n(w<?> wVar, b.h.a.m.a aVar) {
        this.f970b.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.s = null;
                    if (wVar == null) {
                        m(new r("Expected to receive a Resource<R> with an object of " + this.f974i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    if (obj != null) {
                        if (this.f974i.isAssignableFrom(obj.getClass())) {
                            c cVar = this.f971e;
                            if (!(cVar == null || cVar.d(this))) {
                                try {
                                    this.r = null;
                                    this.v = a.COMPLETE;
                                    this.u.f(wVar);
                                    return;
                                } catch (Throwable th) {
                                    wVar2 = wVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                o(wVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f974i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(wVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    m(new r(sb.toString()), 5);
                    this.u.f(wVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (wVar2 != null) {
                this.u.f(wVar2);
            }
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.GuardedBy("requestLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(b.h.a.m.v.w<R> r11, R r12, b.h.a.m.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.j()
            b.h.a.q.g$a r0 = b.h.a.q.g.a.COMPLETE
            r10.v = r0
            r10.r = r11
            b.h.a.e r11 = r10.f972g
            int r11 = r11.f491i
            r0 = 3
            if (r11 > r0) goto L_0x0064
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = b.e.a.a.a.y(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f973h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.t
            double r0 = b.h.a.s.f.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x0064:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<b.h.a.q.d<R>> r0 = r10.f980o     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008a
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b6 }
            r9 = r7
        L_0x0071:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b6 }
            b.h.a.q.d r0 = (b.h.a.q.d) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r10.f973h     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r3 = r10.f979n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            r9 = r9 | r0
            goto L_0x0071
        L_0x008a:
            r9 = r7
        L_0x008b:
            b.h.a.q.d<R> r0 = r10.d     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r10.f973h     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r3 = r10.f979n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r11 = r7
        L_0x009e:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00ac
            b.h.a.q.i.e<? super R> r11 = r10.f981p     // Catch:{ all -> 0x00b6 }
            b.h.a.q.i.d r11 = r11.a(r13, r6)     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r13 = r10.f979n     // Catch:{ all -> 0x00b6 }
            r13.b(r12, r11)     // Catch:{ all -> 0x00b6 }
        L_0x00ac:
            r10.B = r7
            b.h.a.q.c r11 = r10.f971e
            if (r11 == 0) goto L_0x00b5
            r11.e(r10)
        L_0x00b5:
            return
        L_0x00b6:
            r11 = move-exception
            r10.B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.q.g.o(b.h.a.m.v.w, java.lang.Object, b.h.a.m.a):void");
    }

    @GuardedBy("requestLock")
    public final void p() {
        int i2;
        c cVar = this.f971e;
        if (cVar == null || cVar.c(this)) {
            Drawable drawable = null;
            if (this.f973h == null) {
                drawable = g();
            }
            if (drawable == null) {
                if (this.w == null) {
                    a<?> aVar = this.f975j;
                    Drawable drawable2 = aVar.f964l;
                    this.w = drawable2;
                    if (drawable2 == null && (i2 = aVar.f965m) > 0) {
                        this.w = k(i2);
                    }
                }
                drawable = this.w;
            }
            if (drawable == null) {
                drawable = h();
            }
            this.f979n.c(drawable);
        }
    }

    public void pause() {
        synchronized (this.c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
