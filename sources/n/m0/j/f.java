package n.m0.j;

import e.r;
import e.x.c.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import n.m0.j.n;
import n.m0.j.o;
import n.m0.k.h;
import o.g;

public final class f implements Closeable {
    public static final t J;
    public static final f K = null;
    public t A;
    public long B;
    public long C;
    public long D;
    public long E;
    public final Socket F;
    public final p G;
    public final d H;
    public final Set<Integer> I;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10288h;

    /* renamed from: i  reason: collision with root package name */
    public final c f10289i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<Integer, o> f10290j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final String f10291k;

    /* renamed from: l  reason: collision with root package name */
    public int f10292l;

    /* renamed from: m  reason: collision with root package name */
    public int f10293m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10294n;

    /* renamed from: o  reason: collision with root package name */
    public final n.m0.f.d f10295o;

    /* renamed from: p  reason: collision with root package name */
    public final n.m0.f.c f10296p;

    /* renamed from: q  reason: collision with root package name */
    public final n.m0.f.c f10297q;
    public final n.m0.f.c r;
    public final s s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public final t z;

    public static final class a extends n.m0.f.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f10298e;
        public final /* synthetic */ long f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, f fVar, long j2) {
            super(str2, true);
            this.f10298e = fVar;
            this.f = j2;
        }

        public long a() {
            f fVar;
            boolean z;
            synchronized (this.f10298e) {
                fVar = this.f10298e;
                long j2 = fVar.u;
                long j3 = fVar.t;
                if (j2 < j3) {
                    z = true;
                } else {
                    fVar.t = j3 + 1;
                    z = false;
                }
            }
            if (z) {
                b bVar = b.PROTOCOL_ERROR;
                fVar.b(bVar, bVar, (IOException) null);
                return -1;
            }
            fVar.S(false, 1, 0);
            return this.f;
        }
    }

    public static final class b {
        public Socket a;

        /* renamed from: b  reason: collision with root package name */
        public String f10299b;
        public g c;
        public o.f d;

        /* renamed from: e  reason: collision with root package name */
        public c f10300e = c.a;
        public s f = s.a;

        /* renamed from: g  reason: collision with root package name */
        public int f10301g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10302h;

        /* renamed from: i  reason: collision with root package name */
        public final n.m0.f.d f10303i;

        public b(boolean z, n.m0.f.d dVar) {
            i.e(dVar, "taskRunner");
            this.f10302h = z;
            this.f10303i = dVar;
        }
    }

    public static abstract class c {
        public static final c a = new a();

        public static final class a extends c {
            public void b(o oVar) {
                i.e(oVar, "stream");
                oVar.c(b.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(f fVar, t tVar) {
            i.e(fVar, "connection");
            i.e(tVar, "settings");
        }

        public abstract void b(o oVar);
    }

    public final class d implements n.b, e.x.b.a<r> {

        /* renamed from: h  reason: collision with root package name */
        public final n f10304h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ f f10305i;

        public static final class a extends n.m0.f.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ o f10306e;
            public final /* synthetic */ d f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ List f10307g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z, String str2, boolean z2, o oVar, d dVar, o oVar2, int i2, List list, boolean z3) {
                super(str2, z2);
                this.f10306e = oVar;
                this.f = dVar;
                this.f10307g = list;
            }

            public long a() {
                try {
                    this.f.f10305i.f10289i.b(this.f10306e);
                    return -1;
                } catch (IOException e2) {
                    h.a aVar = h.c;
                    h hVar = h.a;
                    StringBuilder y = b.e.a.a.a.y("Http2Connection.Listener failure for ");
                    y.append(this.f.f10305i.f10291k);
                    hVar.i(y.toString(), 4, e2);
                    try {
                        this.f10306e.c(b.PROTOCOL_ERROR, e2);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        public static final class b extends n.m0.f.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ d f10308e;
            public final /* synthetic */ int f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ int f10309g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z, String str2, boolean z2, d dVar, int i2, int i3) {
                super(str2, z2);
                this.f10308e = dVar;
                this.f = i2;
                this.f10309g = i3;
            }

            public long a() {
                this.f10308e.f10305i.S(true, this.f, this.f10309g);
                return -1;
            }
        }

        public static final class c extends n.m0.f.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ d f10310e;
            public final /* synthetic */ boolean f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ t f10311g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z, String str2, boolean z2, d dVar, boolean z3, t tVar) {
                super(str2, z2);
                this.f10310e = dVar;
                this.f = z3;
                this.f10311g = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
            /* JADX WARNING: Removed duplicated region for block: B:60:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public long a() {
                /*
                    r21 = this;
                    r1 = r21
                    n.m0.j.f$d r13 = r1.f10310e
                    boolean r9 = r1.f
                    n.m0.j.t r10 = r1.f10311g
                    java.util.Objects.requireNonNull(r13)
                    java.lang.String r0 = "settings"
                    e.x.c.i.e(r10, r0)
                    e.x.c.t r14 = new e.x.c.t
                    r14.<init>()
                    e.x.c.u r15 = new e.x.c.u
                    r15.<init>()
                    e.x.c.u r0 = new e.x.c.u
                    r0.<init>()
                    n.m0.j.f r2 = r13.f10305i
                    n.m0.j.p r12 = r2.G
                    monitor-enter(r12)
                    n.m0.j.f r11 = r13.f10305i     // Catch:{ all -> 0x0113 }
                    monitor-enter(r11)     // Catch:{ all -> 0x0113 }
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x010a }
                    n.m0.j.t r2 = r2.A     // Catch:{ all -> 0x010a }
                    if (r9 == 0) goto L_0x002f
                    r3 = r10
                    goto L_0x003a
                L_0x002f:
                    n.m0.j.t r3 = new n.m0.j.t     // Catch:{ all -> 0x010a }
                    r3.<init>()     // Catch:{ all -> 0x010a }
                    r3.b(r2)     // Catch:{ all -> 0x010a }
                    r3.b(r10)     // Catch:{ all -> 0x010a }
                L_0x003a:
                    r0.f7989h = r3     // Catch:{ all -> 0x010a }
                    int r3 = r3.a()     // Catch:{ all -> 0x010a }
                    long r3 = (long) r3     // Catch:{ all -> 0x010a }
                    int r2 = r2.a()     // Catch:{ all -> 0x010a }
                    long r5 = (long) r2     // Catch:{ all -> 0x010a }
                    long r3 = r3 - r5
                    r14.f7988h = r3     // Catch:{ all -> 0x010a }
                    r7 = 0
                    int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    r6 = 0
                    if (r2 == 0) goto L_0x0076
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, n.m0.j.o> r2 = r2.f10290j     // Catch:{ all -> 0x010a }
                    boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x005b
                    goto L_0x0076
                L_0x005b:
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x010a }
                    java.util.Map<java.lang.Integer, n.m0.j.o> r2 = r2.f10290j     // Catch:{ all -> 0x010a }
                    java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x010a }
                    n.m0.j.o[] r3 = new n.m0.j.o[r6]     // Catch:{ all -> 0x010a }
                    java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x010a }
                    if (r2 == 0) goto L_0x006e
                    n.m0.j.o[] r2 = (n.m0.j.o[]) r2     // Catch:{ all -> 0x010a }
                    goto L_0x0077
                L_0x006e:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
                    java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r0.<init>(r2)     // Catch:{ all -> 0x010a }
                    throw r0     // Catch:{ all -> 0x010a }
                L_0x0076:
                    r2 = 0
                L_0x0077:
                    r15.f7989h = r2     // Catch:{ all -> 0x010a }
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x010a }
                    T r3 = r0.f7989h     // Catch:{ all -> 0x010a }
                    n.m0.j.t r3 = (n.m0.j.t) r3     // Catch:{ all -> 0x010a }
                    java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x010a }
                    java.lang.String r4 = "<set-?>"
                    e.x.c.i.e(r3, r4)     // Catch:{ all -> 0x010a }
                    r2.A = r3     // Catch:{ all -> 0x010a }
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x010a }
                    n.m0.f.c r5 = r2.r     // Catch:{ all -> 0x010a }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
                    r2.<init>()     // Catch:{ all -> 0x010a }
                    n.m0.j.f r3 = r13.f10305i     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = r3.f10291k     // Catch:{ all -> 0x010a }
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r3 = " onSettings"
                    r2.append(r3)     // Catch:{ all -> 0x010a }
                    java.lang.String r16 = r2.toString()     // Catch:{ all -> 0x010a }
                    r17 = 1
                    n.m0.j.g r4 = new n.m0.j.g     // Catch:{ all -> 0x010a }
                    r2 = r4
                    r3 = r16
                    r18 = r4
                    r4 = r17
                    r19 = r5
                    r5 = r16
                    r16 = r6
                    r6 = r17
                    r7 = r13
                    r8 = r0
                    r17 = r11
                    r11 = r14
                    r20 = r12
                    r12 = r15
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0108 }
                    r3 = r18
                    r2 = r19
                    r4 = 0
                    r2.c(r3, r4)     // Catch:{ all -> 0x0108 }
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ IOException -> 0x00d6 }
                    n.m0.j.p r2 = r2.G     // Catch:{ IOException -> 0x00d6 }
                    T r0 = r0.f7989h     // Catch:{ IOException -> 0x00d6 }
                    n.m0.j.t r0 = (n.m0.j.t) r0     // Catch:{ IOException -> 0x00d6 }
                    r2.b(r0)     // Catch:{ IOException -> 0x00d6 }
                    goto L_0x00de
                L_0x00d6:
                    r0 = move-exception
                    n.m0.j.f r2 = r13.f10305i     // Catch:{ all -> 0x0111 }
                    n.m0.j.b r3 = n.m0.j.b.PROTOCOL_ERROR     // Catch:{ all -> 0x0111 }
                    r2.b(r3, r3, r0)     // Catch:{ all -> 0x0111 }
                L_0x00de:
                    monitor-exit(r20)
                    T r0 = r15.f7989h
                    n.m0.j.o[] r0 = (n.m0.j.o[]) r0
                    if (r0 == 0) goto L_0x0105
                    e.x.c.i.c(r0)
                    int r2 = r0.length
                    r6 = r16
                L_0x00eb:
                    if (r6 >= r2) goto L_0x0105
                    r3 = r0[r6]
                    monitor-enter(r3)
                    long r7 = r14.f7988h     // Catch:{ all -> 0x0102 }
                    long r9 = r3.d     // Catch:{ all -> 0x0102 }
                    long r9 = r9 + r7
                    r3.d = r9     // Catch:{ all -> 0x0102 }
                    int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00fe
                    r3.notifyAll()     // Catch:{ all -> 0x0102 }
                L_0x00fe:
                    monitor-exit(r3)
                    int r6 = r6 + 1
                    goto L_0x00eb
                L_0x0102:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                L_0x0105:
                    r2 = -1
                    return r2
                L_0x0108:
                    r0 = move-exception
                    goto L_0x010f
                L_0x010a:
                    r0 = move-exception
                    r17 = r11
                    r20 = r12
                L_0x010f:
                    monitor-exit(r17)     // Catch:{ all -> 0x0111 }
                    throw r0     // Catch:{ all -> 0x0111 }
                L_0x0111:
                    r0 = move-exception
                    goto L_0x0116
                L_0x0113:
                    r0 = move-exception
                    r20 = r12
                L_0x0116:
                    monitor-exit(r20)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: n.m0.j.f.d.c.a():long");
            }
        }

        public d(f fVar, n nVar) {
            i.e(nVar, "reader");
            this.f10305i = fVar;
            this.f10304h = nVar;
        }

        public void a() {
        }

        public void b(boolean z, t tVar) {
            i.e(tVar, "settings");
            n.m0.f.c cVar = this.f10305i.f10296p;
            String q2 = b.e.a.a.a.q(new StringBuilder(), this.f10305i.f10291k, " applyAndAckSettings");
            cVar.c(new c(q2, true, q2, true, this, z, tVar), 0);
        }

        public void c(boolean z, int i2, int i3) {
            if (z) {
                synchronized (this.f10305i) {
                    if (i2 == 1) {
                        this.f10305i.u++;
                    } else if (i2 == 2) {
                        this.f10305i.w++;
                    } else if (i2 == 3) {
                        f fVar = this.f10305i;
                        fVar.x++;
                        fVar.notifyAll();
                    }
                }
                return;
            }
            n.m0.f.c cVar = this.f10305i.f10296p;
            String q2 = b.e.a.a.a.q(new StringBuilder(), this.f10305i.f10291k, " ping");
            cVar.c(new b(q2, true, q2, true, this, i2, i3), 0);
        }

        public void d(boolean z, int i2, g gVar, int i3) {
            boolean z2;
            boolean z3;
            long j2;
            int i4 = i2;
            g gVar2 = gVar;
            int i5 = i3;
            i.e(gVar2, "source");
            if (this.f10305i.q(i4)) {
                f fVar = this.f10305i;
                Objects.requireNonNull(fVar);
                i.e(gVar2, "source");
                o.e eVar = new o.e();
                long j3 = (long) i5;
                gVar2.c0(j3);
                gVar2.T(eVar, j3);
                String str = fVar.f10291k + '[' + i4 + "] onData";
                fVar.f10297q.c(new h(str, true, str, true, fVar, i2, eVar, i3, z), 0);
                return;
            }
            o e2 = this.f10305i.e(i4);
            if (e2 == null) {
                this.f10305i.Y(i4, b.PROTOCOL_ERROR);
                long j4 = (long) i5;
                this.f10305i.N(j4);
                gVar2.skip(j4);
                return;
            }
            i.e(gVar2, "source");
            byte[] bArr = n.m0.c.a;
            o.b bVar = e2.f10347g;
            long j5 = (long) i5;
            Objects.requireNonNull(bVar);
            i.e(gVar2, "source");
            while (true) {
                boolean z4 = true;
                if (j5 <= 0) {
                    break;
                }
                synchronized (o.this) {
                    z2 = bVar.f10363l;
                    z3 = bVar.f10360i.f10453i + j5 > bVar.f10362k;
                }
                if (z3) {
                    gVar2.skip(j5);
                    o.this.e(b.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    gVar2.skip(j5);
                    break;
                } else {
                    long T = gVar2.T(bVar.f10359h, j5);
                    if (T != -1) {
                        j5 -= T;
                        synchronized (o.this) {
                            if (bVar.f10361j) {
                                o.e eVar2 = bVar.f10359h;
                                j2 = eVar2.f10453i;
                                eVar2.skip(j2);
                            } else {
                                o.e eVar3 = bVar.f10360i;
                                if (eVar3.f10453i != 0) {
                                    z4 = false;
                                }
                                eVar3.n(bVar.f10359h);
                                if (z4) {
                                    o oVar = o.this;
                                    if (oVar != null) {
                                        oVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            bVar.b(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                e2.j(n.m0.c.f10150b, true);
            }
        }

        public Object e() {
            b bVar;
            b bVar2 = b.INTERNAL_ERROR;
            e = null;
            try {
                this.f10304h.e(this);
                while (this.f10304h.b(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    this.f10305i.b(bVar, b.CANCEL, (IOException) null);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        b bVar3 = b.PROTOCOL_ERROR;
                        this.f10305i.b(bVar3, bVar3, e);
                        n.m0.c.d(this.f10304h);
                        return r.a;
                    } catch (Throwable th) {
                        th = th;
                        this.f10305i.b(bVar, bVar2, e);
                        n.m0.c.d(this.f10304h);
                        throw th;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                bVar = bVar2;
                b bVar32 = b.PROTOCOL_ERROR;
                this.f10305i.b(bVar32, bVar32, e);
                n.m0.c.d(this.f10304h);
                return r.a;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                this.f10305i.b(bVar, bVar2, e);
                n.m0.c.d(this.f10304h);
                throw th;
            }
            n.m0.c.d(this.f10304h);
            return r.a;
        }

        public void f(int i2, int i3, int i4, boolean z) {
        }

        public void g(int i2, long j2) {
            Object obj;
            if (i2 == 0) {
                Object obj2 = this.f10305i;
                synchronized (obj2) {
                    f fVar = this.f10305i;
                    fVar.E += j2;
                    fVar.notifyAll();
                    obj = obj2;
                }
            } else {
                o e2 = this.f10305i.e(i2);
                if (e2 != null) {
                    synchronized (e2) {
                        e2.d += j2;
                        obj = e2;
                        if (j2 > 0) {
                            e2.notifyAll();
                            obj = e2;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void h(int i2, b bVar) {
            i.e(bVar, "errorCode");
            if (this.f10305i.q(i2)) {
                f fVar = this.f10305i;
                Objects.requireNonNull(fVar);
                i.e(bVar, "errorCode");
                String str = fVar.f10291k + '[' + i2 + "] onReset";
                fVar.f10297q.c(new k(str, true, str, true, fVar, i2, bVar), 0);
                return;
            }
            o z = this.f10305i.z(i2);
            if (z != null) {
                z.k(bVar);
            }
        }

        public void i(boolean z, int i2, int i3, List<c> list) {
            int i4 = i2;
            List<c> list2 = list;
            i.e(list2, "headerBlock");
            if (this.f10305i.q(i4)) {
                f fVar = this.f10305i;
                Objects.requireNonNull(fVar);
                i.e(list2, "requestHeaders");
                String str = fVar.f10291k + '[' + i4 + "] onHeaders";
                fVar.f10297q.c(new i(str, true, str, true, fVar, i2, list, z), 0);
                return;
            }
            synchronized (this.f10305i) {
                o e2 = this.f10305i.e(i4);
                if (e2 == null) {
                    f fVar2 = this.f10305i;
                    if (!fVar2.f10294n) {
                        if (i4 > fVar2.f10292l) {
                            if (i4 % 2 != fVar2.f10293m % 2) {
                                o oVar = new o(i2, this.f10305i, false, z, n.m0.c.w(list));
                                f fVar3 = this.f10305i;
                                fVar3.f10292l = i4;
                                fVar3.f10290j.put(Integer.valueOf(i2), oVar);
                                n.m0.f.c f = this.f10305i.f10295o.f();
                                String str2 = this.f10305i.f10291k + '[' + i4 + "] onStream";
                                a aVar = r1;
                                a aVar2 = new a(str2, true, str2, true, oVar, this, e2, i2, list, z);
                                f.c(aVar, 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                e2.j(n.m0.c.w(list), z);
            }
        }

        public void j(int i2, int i3, List<c> list) {
            i.e(list, "requestHeaders");
            f fVar = this.f10305i;
            Objects.requireNonNull(fVar);
            i.e(list, "requestHeaders");
            synchronized (fVar) {
                if (fVar.I.contains(Integer.valueOf(i3))) {
                    fVar.Y(i3, b.PROTOCOL_ERROR);
                    return;
                }
                fVar.I.add(Integer.valueOf(i3));
                String str = fVar.f10291k + '[' + i3 + "] onRequest";
                fVar.f10297q.c(new j(str, true, str, true, fVar, i3, list), 0);
            }
        }

        public void k(int i2, b bVar, o.h hVar) {
            int i3;
            o[] oVarArr;
            i.e(bVar, "errorCode");
            i.e(hVar, "debugData");
            hVar.l();
            synchronized (this.f10305i) {
                Object[] array = this.f10305i.f10290j.values().toArray(new o[0]);
                if (array != null) {
                    oVarArr = (o[]) array;
                    this.f10305i.f10294n = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (o oVar : oVarArr) {
                if (oVar.f10353m > i2 && oVar.h()) {
                    oVar.k(b.REFUSED_STREAM);
                    this.f10305i.z(oVar.f10353m);
                }
            }
        }
    }

    public static final class e extends n.m0.f.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f10312e;
        public final /* synthetic */ int f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f10313g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z, String str2, boolean z2, f fVar, int i2, b bVar) {
            super(str2, z2);
            this.f10312e = fVar;
            this.f = i2;
            this.f10313g = bVar;
        }

        public long a() {
            try {
                f fVar = this.f10312e;
                int i2 = this.f;
                b bVar = this.f10313g;
                Objects.requireNonNull(fVar);
                i.e(bVar, "statusCode");
                fVar.G.H(i2, bVar);
                return -1;
            } catch (IOException e2) {
                f fVar2 = this.f10312e;
                b bVar2 = b.PROTOCOL_ERROR;
                fVar2.b(bVar2, bVar2, e2);
                return -1;
            }
        }
    }

    /* renamed from: n.m0.j.f$f  reason: collision with other inner class name */
    public static final class C0235f extends n.m0.f.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f10314e;
        public final /* synthetic */ int f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f10315g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0235f(String str, boolean z, String str2, boolean z2, f fVar, int i2, long j2) {
            super(str2, z2);
            this.f10314e = fVar;
            this.f = i2;
            this.f10315g = j2;
        }

        public long a() {
            try {
                this.f10314e.G.g(this.f, this.f10315g);
                return -1;
            } catch (IOException e2) {
                f fVar = this.f10314e;
                b bVar = b.PROTOCOL_ERROR;
                fVar.b(bVar, bVar, e2);
                return -1;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, 65535);
        tVar.c(5, 16384);
        J = tVar;
    }

    public f(b bVar) {
        i.e(bVar, "builder");
        boolean z2 = bVar.f10302h;
        this.f10288h = z2;
        this.f10289i = bVar.f10300e;
        String str = bVar.f10299b;
        if (str != null) {
            this.f10291k = str;
            this.f10293m = bVar.f10302h ? 3 : 2;
            n.m0.f.d dVar = bVar.f10303i;
            this.f10295o = dVar;
            n.m0.f.c f = dVar.f();
            this.f10296p = f;
            this.f10297q = dVar.f();
            this.r = dVar.f();
            this.s = bVar.f;
            t tVar = new t();
            if (bVar.f10302h) {
                tVar.c(7, 16777216);
            }
            this.z = tVar;
            t tVar2 = J;
            this.A = tVar2;
            this.E = (long) tVar2.a();
            Socket socket = bVar.a;
            if (socket != null) {
                this.F = socket;
                o.f fVar = bVar.d;
                if (fVar != null) {
                    this.G = new p(fVar, z2);
                    g gVar = bVar.c;
                    if (gVar != null) {
                        this.H = new d(this, new n(gVar, z2));
                        this.I = new LinkedHashSet();
                        int i2 = bVar.f10301g;
                        if (i2 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i2);
                            String m2 = b.e.a.a.a.m(str, " ping");
                            f.c(new a(m2, m2, this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    i.m("source");
                    throw null;
                }
                i.m("sink");
                throw null;
            }
            i.m("socket");
            throw null;
        }
        i.m("connectionName");
        throw null;
    }

    public final void H(b bVar) {
        i.e(bVar, "statusCode");
        synchronized (this.G) {
            synchronized (this) {
                if (!this.f10294n) {
                    this.f10294n = true;
                    int i2 = this.f10292l;
                    this.G.q(i2, bVar, n.m0.c.a);
                }
            }
        }
    }

    public final synchronized void N(long j2) {
        long j3 = this.B + j2;
        this.B = j3;
        long j4 = j3 - this.C;
        if (j4 >= ((long) (this.z.a() / 2))) {
            e0(0, j4);
            this.C += j4;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.G.f10368i);
        r6 = (long) r2;
        r8.D += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(int r9, boolean r10, o.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            n.m0.j.p r12 = r8.G
            r12.L(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.D     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.E     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.Map<java.lang.Integer, n.m0.j.o> r2 = r8.f10290j     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0057 }
            int r2 = (int) r4     // Catch:{ all -> 0x0057 }
            n.m0.j.p r4 = r8.G     // Catch:{ all -> 0x0057 }
            int r4 = r4.f10368i     // Catch:{ all -> 0x0057 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.D     // Catch:{ all -> 0x0057 }
            long r6 = (long) r2     // Catch:{ all -> 0x0057 }
            long r4 = r4 + r6
            r8.D = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            long r12 = r12 - r6
            n.m0.j.p r4 = r8.G
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            r4.L(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x0066
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0057 }
            r9.interrupt()     // Catch:{ all -> 0x0057 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.f.O(int, boolean, o.e, long):void");
    }

    public final void S(boolean z2, int i2, int i3) {
        try {
            this.G.c(z2, i2, i3);
        } catch (IOException e2) {
            b bVar = b.PROTOCOL_ERROR;
            b(bVar, bVar, e2);
        }
    }

    public final void Y(int i2, b bVar) {
        i.e(bVar, "errorCode");
        String str = this.f10291k + '[' + i2 + "] writeSynReset";
        this.f10296p.c(new e(str, true, str, true, this, i2, bVar), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:16|(5:18|19|20|33|21))|23|24|25|26|27|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(n.m0.j.b r4, n.m0.j.b r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = "streamCode"
            e.x.c.i.e(r5, r0)
            byte[] r0 = n.m0.c.a
            r3.H(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, n.m0.j.o> r0 = r3.f10290j     // Catch:{ all -> 0x0062 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.Map<java.lang.Integer, n.m0.j.o> r4 = r3.f10290j     // Catch:{ all -> 0x0062 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0062 }
            n.m0.j.o[] r0 = new n.m0.j.o[r1]     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0032
            n.m0.j.o[] r4 = (n.m0.j.o[]) r4     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.Integer, n.m0.j.o> r0 = r3.f10290j     // Catch:{ all -> 0x0062 }
            r0.clear()     // Catch:{ all -> 0x0062 }
            goto L_0x003a
        L_0x0032:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0062 }
            throw r4     // Catch:{ all -> 0x0062 }
        L_0x003a:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0048
            int r0 = r4.length
        L_0x003e:
            if (r1 >= r0) goto L_0x0048
            r2 = r4[r1]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0048:
            n.m0.j.p r4 = r3.G     // Catch:{ IOException -> 0x004d }
            r4.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            java.net.Socket r4 = r3.F     // Catch:{ IOException -> 0x0052 }
            r4.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            n.m0.f.c r4 = r3.f10296p
            r4.e()
            n.m0.f.c r4 = r3.f10297q
            r4.e()
            n.m0.f.c r4 = r3.r
            r4.e()
            return
        L_0x0062:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.f.b(n.m0.j.b, n.m0.j.b, java.io.IOException):void");
    }

    public void close() {
        b(b.NO_ERROR, b.CANCEL, (IOException) null);
    }

    public final synchronized o e(int i2) {
        return this.f10290j.get(Integer.valueOf(i2));
    }

    public final void e0(int i2, long j2) {
        String str = this.f10291k + '[' + i2 + "] windowUpdate";
        this.f10296p.c(new C0235f(str, true, str, true, this, i2, j2), 0);
    }

    public final boolean q(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized o z(int i2) {
        o remove;
        remove = this.f10290j.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }
}
