package b.p.b.a0.j;

import androidx.appcompat.widget.ActivityChooserView;
import b.p.b.a0.i;
import b.p.b.a0.j.b;
import b.p.b.a0.j.k;
import b.p.b.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.f;
import o.g;
import o.h;

public final class d implements Closeable {
    public static final ExecutorService B;
    public final Set<Integer> A;

    /* renamed from: h  reason: collision with root package name */
    public final s f6492h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6493i;

    /* renamed from: j  reason: collision with root package name */
    public final C0115d f6494j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<Integer, k> f6495k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final String f6496l;

    /* renamed from: m  reason: collision with root package name */
    public int f6497m;

    /* renamed from: n  reason: collision with root package name */
    public int f6498n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6499o;

    /* renamed from: p  reason: collision with root package name */
    public final ExecutorService f6500p;

    /* renamed from: q  reason: collision with root package name */
    public final s f6501q;
    public long r;
    public long s;
    public t t;
    public final t u;
    public boolean v;
    public final v w;
    public final Socket x;
    public final c y;
    public final e z;

    public class a extends b.p.b.a0.d {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f6502i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a f6503j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, a aVar) {
            super(str, objArr);
            this.f6502i = i2;
            this.f6503j = aVar;
        }

        public void a() {
            try {
                d dVar = d.this;
                dVar.y.s(this.f6502i, this.f6503j);
            } catch (IOException unused) {
            }
        }
    }

    public class b extends b.p.b.a0.d {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f6505i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ long f6506j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f6505i = i2;
            this.f6506j = j2;
        }

        public void a() {
            try {
                d.this.y.g(this.f6505i, this.f6506j);
            } catch (IOException unused) {
            }
        }
    }

    public static class c {
        public Socket a;

        /* renamed from: b  reason: collision with root package name */
        public String f6508b;
        public g c;
        public f d;

        /* renamed from: e  reason: collision with root package name */
        public s f6509e = s.SPDY_3;

        public c(boolean z) {
        }
    }

    /* renamed from: b.p.b.a0.j.d$d  reason: collision with other inner class name */
    public static abstract class C0115d {
        public static final C0115d a = new a();

        /* renamed from: b.p.b.a0.j.d$d$a */
        public static class a extends C0115d {
        }
    }

    public class e extends b.p.b.a0.d implements b.a {

        /* renamed from: i  reason: collision with root package name */
        public final b f6510i;

        public class a extends b.p.b.a0.d {

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ k f6512i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, k kVar) {
                super(str, objArr);
                this.f6512i = kVar;
            }

            public void a() {
                try {
                    C0115d dVar = d.this.f6494j;
                    k kVar = this.f6512i;
                    Objects.requireNonNull((C0115d.a) dVar);
                    kVar.c(a.REFUSED_STREAM);
                } catch (IOException e2) {
                    Logger logger = b.p.b.a0.b.a;
                    Level level = Level.INFO;
                    StringBuilder y = b.e.a.a.a.y("FramedConnection.Listener failure for ");
                    y.append(d.this.f6496l);
                    logger.log(level, y.toString(), e2);
                    try {
                        this.f6512i.c(a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends b.p.b.a0.d {
            public b(String str, Object... objArr) {
                super(str, objArr);
            }

            public void a() {
                Objects.requireNonNull(d.this.f6494j);
            }
        }

        public e(b bVar, a aVar) {
            super("OkHttp %s", d.this.f6496l);
            this.f6510i = bVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = b.p.b.a0.j.a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f6511j.e(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                b.p.b.a0.j.a r0 = b.p.b.a0.j.a.INTERNAL_ERROR
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.f6493i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 != 0) goto L_0x000d
                b.p.b.a0.j.b r1 = r5.f6510i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                r1.u()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            L_0x000d:
                b.p.b.a0.j.b r1 = r5.f6510i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.a0(r5)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 == 0) goto L_0x0016
                goto L_0x000d
            L_0x0016:
                b.p.b.a0.j.a r1 = b.p.b.a0.j.a.NO_ERROR     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                b.p.b.a0.j.a r0 = b.p.b.a0.j.a.CANCEL     // Catch:{ IOException -> 0x0024 }
                b.p.b.a0.j.d r2 = b.p.b.a0.j.d.this     // Catch:{ IOException -> 0x002b }
                r2.e(r1, r0)     // Catch:{ IOException -> 0x002b }
                goto L_0x002b
            L_0x0020:
                r1 = move-exception
                r2 = r0
                goto L_0x0035
            L_0x0023:
                r1 = r0
            L_0x0024:
                b.p.b.a0.j.a r0 = b.p.b.a0.j.a.PROTOCOL_ERROR     // Catch:{ all -> 0x0031 }
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ IOException -> 0x002b }
                r1.e(r0, r0)     // Catch:{ IOException -> 0x002b }
            L_0x002b:
                b.p.b.a0.j.b r0 = r5.f6510i
                b.p.b.a0.i.c(r0)
                return
            L_0x0031:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x0035:
                b.p.b.a0.j.d r3 = b.p.b.a0.j.d.this     // Catch:{ IOException -> 0x003a }
                r3.e(r2, r0)     // Catch:{ IOException -> 0x003a }
            L_0x003a:
                b.p.b.a0.j.b r0 = r5.f6510i
                b.p.b.a0.i.c(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.d.e.a():void");
        }

        public void b(boolean z, int i2, g gVar, int i3) {
            boolean z2;
            boolean z3;
            int i4 = i2;
            g gVar2 = gVar;
            int i5 = i3;
            if (d.b(d.this, i4)) {
                d dVar = d.this;
                Objects.requireNonNull(dVar);
                o.e eVar = new o.e();
                long j2 = (long) i5;
                gVar2.c0(j2);
                gVar2.T(eVar, j2);
                if (eVar.f10453i == j2) {
                    dVar.f6500p.execute(new h(dVar, "OkHttp %s Push Data[%s]", new Object[]{dVar.f6496l, Integer.valueOf(i2)}, i2, eVar, i3, z));
                    return;
                }
                throw new IOException(eVar.f10453i + " != " + i5);
            }
            k q2 = d.this.q(i4);
            if (q2 == null) {
                d.this.S(i4, a.INVALID_STREAM);
                gVar2.skip((long) i5);
                return;
            }
            k.c cVar = q2.f6539g;
            long j3 = (long) i5;
            Objects.requireNonNull(cVar);
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                synchronized (k.this) {
                    z2 = cVar.f6552l;
                    z3 = cVar.f6549i.f10453i + j3 > cVar.f6550j;
                }
                if (z3) {
                    gVar2.skip(j3);
                    k.this.e(a.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    gVar2.skip(j3);
                    break;
                } else {
                    long T = gVar2.T(cVar.f6548h, j3);
                    if (T != -1) {
                        j3 -= T;
                        synchronized (k.this) {
                            o.e eVar2 = cVar.f6549i;
                            boolean z4 = eVar2.f10453i == 0;
                            eVar2.n(cVar.f6548h);
                            if (z4) {
                                k.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                q2.j();
            }
        }

        public void c(int i2, a aVar, h hVar) {
            k[] kVarArr;
            hVar.l();
            synchronized (d.this) {
                kVarArr = (k[]) d.this.f6495k.values().toArray(new k[d.this.f6495k.size()]);
                d.this.f6499o = true;
            }
            for (k kVar : kVarArr) {
                if (kVar.c > i2 && kVar.h()) {
                    a aVar2 = a.REFUSED_STREAM;
                    synchronized (kVar) {
                        if (kVar.f6543k == null) {
                            kVar.f6543k = aVar2;
                            kVar.notifyAll();
                        }
                    }
                    d.this.z(kVar.c);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
            if (r2 != b.p.b.a0.j.m.f6561h) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
            if (r8 == false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
            r6.e(r3);
            r1.f6511j.z(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
            if (r6.f != null) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
            if (r2 != r4) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
            if (r10 == false) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
            r6.f = r7;
            r2 = r6.i();
            r6.notifyAll();
            r9 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
            if (r2 != r5) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
            if (r10 == false) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
            r3 = b.p.b.a0.j.a.STREAM_IN_USE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
            r2 = new java.util.ArrayList();
            r2.addAll(r6.f);
            r2.addAll(r7);
            r6.f = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
            if (r3 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
            r6.e(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ec, code lost:
            if (r9 != false) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
            r6.d.z(r6.c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f5, code lost:
            if (r15 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f7, code lost:
            r6.j();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r14, boolean r15, int r16, int r17, java.util.List<b.p.b.a0.j.l> r18, b.p.b.a0.j.m r19) {
            /*
                r13 = this;
                r1 = r13
                r0 = r16
                r7 = r18
                r2 = r19
                b.p.b.a0.j.a r3 = b.p.b.a0.j.a.PROTOCOL_ERROR
                b.p.b.a0.j.m r4 = b.p.b.a0.j.m.SPDY_HEADERS
                b.p.b.a0.j.m r5 = b.p.b.a0.j.m.SPDY_REPLY
                b.p.b.a0.j.d r6 = b.p.b.a0.j.d.this
                boolean r6 = b.p.b.a0.j.d.b(r6, r0)
                r8 = 2
                r9 = 1
                r10 = 0
                if (r6 == 0) goto L_0x0039
                b.p.b.a0.j.d r3 = b.p.b.a0.j.d.this
                java.util.concurrent.ExecutorService r11 = r3.f6500p
                b.p.b.a0.j.g r12 = new b.p.b.a0.j.g
                java.lang.Object[] r5 = new java.lang.Object[r8]
                java.lang.String r2 = r3.f6496l
                r5[r10] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
                r5[r9] = r2
                java.lang.String r4 = "OkHttp %s Push Headers[%s]"
                r2 = r12
                r6 = r16
                r7 = r18
                r8 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r11.execute(r12)
                return
            L_0x0039:
                b.p.b.a0.j.d r11 = b.p.b.a0.j.d.this
                monitor-enter(r11)
                b.p.b.a0.j.d r6 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00fe }
                boolean r12 = r6.f6499o     // Catch:{ all -> 0x00fe }
                if (r12 == 0) goto L_0x0044
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x0044:
                b.p.b.a0.j.k r6 = r6.q(r0)     // Catch:{ all -> 0x00fe }
                if (r6 != 0) goto L_0x00a3
                if (r2 == r5) goto L_0x0051
                if (r2 != r4) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r2 = r10
                goto L_0x0052
            L_0x0051:
                r2 = r9
            L_0x0052:
                if (r2 == 0) goto L_0x005d
                b.p.b.a0.j.d r2 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.a r3 = b.p.b.a0.j.a.INVALID_STREAM     // Catch:{ all -> 0x00fe }
                r2.S(r0, r3)     // Catch:{ all -> 0x00fe }
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x005d:
                b.p.b.a0.j.d r4 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00fe }
                int r2 = r4.f6497m     // Catch:{ all -> 0x00fe }
                if (r0 > r2) goto L_0x0065
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x0065:
                int r2 = r0 % 2
                int r3 = r4.f6498n     // Catch:{ all -> 0x00fe }
                int r3 = r3 % r8
                if (r2 != r3) goto L_0x006e
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x006e:
                b.p.b.a0.j.k r12 = new b.p.b.a0.j.k     // Catch:{ all -> 0x00fe }
                r2 = r12
                r3 = r16
                r5 = r14
                r6 = r15
                r7 = r18
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d r2 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00fe }
                r2.f6497m = r0     // Catch:{ all -> 0x00fe }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r2.f6495k     // Catch:{ all -> 0x00fe }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00fe }
                r2.put(r3, r12)     // Catch:{ all -> 0x00fe }
                java.util.concurrent.ExecutorService r2 = b.p.b.a0.j.d.B     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d$e$a r3 = new b.p.b.a0.j.d$e$a     // Catch:{ all -> 0x00fe }
                java.lang.String r4 = "OkHttp %s stream %d"
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.d r6 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00fe }
                java.lang.String r6 = r6.f6496l     // Catch:{ all -> 0x00fe }
                r5[r10] = r6     // Catch:{ all -> 0x00fe }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00fe }
                r5[r9] = r0     // Catch:{ all -> 0x00fe }
                r3.<init>(r4, r5, r12)     // Catch:{ all -> 0x00fe }
                r2.execute(r3)     // Catch:{ all -> 0x00fe }
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                return
            L_0x00a3:
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                b.p.b.a0.j.m r8 = b.p.b.a0.j.m.SPDY_SYN_STREAM
                if (r2 != r8) goto L_0x00aa
                r8 = r9
                goto L_0x00ab
            L_0x00aa:
                r8 = r10
            L_0x00ab:
                if (r8 == 0) goto L_0x00b6
                r6.e(r3)
                b.p.b.a0.j.d r2 = b.p.b.a0.j.d.this
                r2.z(r0)
                return
            L_0x00b6:
                r0 = 0
                monitor-enter(r6)
                java.util.List<b.p.b.a0.j.l> r8 = r6.f     // Catch:{ all -> 0x00fb }
                if (r8 != 0) goto L_0x00cd
                if (r2 != r4) goto L_0x00bf
                r10 = r9
            L_0x00bf:
                if (r10 == 0) goto L_0x00c2
                goto L_0x00e5
            L_0x00c2:
                r6.f = r7     // Catch:{ all -> 0x00fb }
                boolean r2 = r6.i()     // Catch:{ all -> 0x00fb }
                r6.notifyAll()     // Catch:{ all -> 0x00fb }
                r9 = r2
                goto L_0x00e4
            L_0x00cd:
                if (r2 != r5) goto L_0x00d0
                r10 = r9
            L_0x00d0:
                if (r10 == 0) goto L_0x00d5
                b.p.b.a0.j.a r3 = b.p.b.a0.j.a.STREAM_IN_USE     // Catch:{ all -> 0x00fb }
                goto L_0x00e5
            L_0x00d5:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00fb }
                r2.<init>()     // Catch:{ all -> 0x00fb }
                java.util.List<b.p.b.a0.j.l> r3 = r6.f     // Catch:{ all -> 0x00fb }
                r2.addAll(r3)     // Catch:{ all -> 0x00fb }
                r2.addAll(r7)     // Catch:{ all -> 0x00fb }
                r6.f = r2     // Catch:{ all -> 0x00fb }
            L_0x00e4:
                r3 = r0
            L_0x00e5:
                monitor-exit(r6)     // Catch:{ all -> 0x00fb }
                if (r3 == 0) goto L_0x00ec
                r6.e(r3)
                goto L_0x00f5
            L_0x00ec:
                if (r9 != 0) goto L_0x00f5
                b.p.b.a0.j.d r0 = r6.d
                int r2 = r6.c
                r0.z(r2)
            L_0x00f5:
                if (r15 == 0) goto L_0x00fa
                r6.j()
            L_0x00fa:
                return
            L_0x00fb:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x00fb }
                throw r0
            L_0x00fe:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00fe }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.d.e.d(boolean, boolean, int, int, java.util.List, b.p.b.a0.j.m):void");
        }

        public void e(boolean z, int i2, int i3) {
            if (z) {
                synchronized (d.this) {
                }
                return;
            }
            d dVar = d.this;
            d.B.execute(new e(dVar, "OkHttp %s ping %08x%08x", new Object[]{dVar.f6496l, Integer.valueOf(i2), Integer.valueOf(i3)}, true, i2, i3, (r) null));
        }

        public void f(int i2, a aVar) {
            if (d.b(d.this, i2)) {
                d dVar = d.this;
                dVar.f6500p.execute(new i(dVar, "OkHttp %s Push Reset[%s]", new Object[]{dVar.f6496l, Integer.valueOf(i2)}, i2, aVar));
                return;
            }
            k z = d.this.z(i2);
            if (z != null) {
                synchronized (z) {
                    if (z.f6543k == null) {
                        z.f6543k = aVar;
                        z.notifyAll();
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(boolean r11, b.p.b.a0.j.t r12) {
            /*
                r10 = this;
                b.p.b.a0.j.d r0 = b.p.b.a0.j.d.this
                monitor-enter(r0)
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r1 = r1.u     // Catch:{ all -> 0x00db }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.b(r2)     // Catch:{ all -> 0x00db }
                r3 = 0
                if (r11 == 0) goto L_0x001f
                b.p.b.a0.j.d r11 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.u     // Catch:{ all -> 0x00db }
                r11.c = r3     // Catch:{ all -> 0x00db }
                r11.f6593b = r3     // Catch:{ all -> 0x00db }
                r11.a = r3     // Catch:{ all -> 0x00db }
                int[] r11 = r11.d     // Catch:{ all -> 0x00db }
                java.util.Arrays.fill(r11, r3)     // Catch:{ all -> 0x00db }
            L_0x001f:
                b.p.b.a0.j.d r11 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.u     // Catch:{ all -> 0x00db }
                java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x00db }
                r4 = r3
            L_0x0027:
                r5 = 10
                if (r4 >= r5) goto L_0x0040
                boolean r5 = r12.c(r4)     // Catch:{ all -> 0x00db }
                if (r5 != 0) goto L_0x0032
                goto L_0x003d
            L_0x0032:
                int r5 = r12.a(r4)     // Catch:{ all -> 0x00db }
                int[] r6 = r12.d     // Catch:{ all -> 0x00db }
                r6 = r6[r4]     // Catch:{ all -> 0x00db }
                r11.d(r4, r5, r6)     // Catch:{ all -> 0x00db }
            L_0x003d:
                int r4 = r4 + 1
                goto L_0x0027
            L_0x0040:
                b.p.b.a0.j.d r11 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                b.p.b.s r4 = r11.f6492h     // Catch:{ all -> 0x00db }
                b.p.b.s r5 = b.p.b.s.HTTP_2     // Catch:{ all -> 0x00db }
                r6 = 1
                if (r4 != r5) goto L_0x005b
                java.util.concurrent.ExecutorService r4 = b.p.b.a0.j.d.B     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.j r5 = new b.p.b.a0.j.j     // Catch:{ all -> 0x00db }
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00db }
                java.lang.String r11 = r11.f6496l     // Catch:{ all -> 0x00db }
                r7[r3] = r11     // Catch:{ all -> 0x00db }
                java.lang.String r11 = "OkHttp %s ACK Settings"
                r5.<init>(r10, r11, r7, r12)     // Catch:{ all -> 0x00db }
                r4.execute(r5)     // Catch:{ all -> 0x00db }
            L_0x005b:
                b.p.b.a0.j.d r11 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.t r11 = r11.u     // Catch:{ all -> 0x00db }
                int r11 = r11.b(r2)     // Catch:{ all -> 0x00db }
                r12 = -1
                r4 = 0
                r2 = 0
                if (r11 == r12) goto L_0x00a7
                if (r11 == r1) goto L_0x00a7
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                boolean r7 = r1.v     // Catch:{ all -> 0x00db }
                if (r7 != 0) goto L_0x0083
                long r7 = r1.s     // Catch:{ all -> 0x00db }
                long r7 = r7 + r11
                r1.s = r7     // Catch:{ all -> 0x00db }
                int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r7 <= 0) goto L_0x007f
                r1.notifyAll()     // Catch:{ all -> 0x00db }
            L_0x007f:
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                r1.v = r6     // Catch:{ all -> 0x00db }
            L_0x0083:
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r1 = r1.f6495k     // Catch:{ all -> 0x00db }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00db }
                if (r1 != 0) goto L_0x00a8
                b.p.b.a0.j.d r1 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r1 = r1.f6495k     // Catch:{ all -> 0x00db }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r2 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r2.f6495k     // Catch:{ all -> 0x00db }
                int r2 = r2.size()     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.k[] r2 = new b.p.b.a0.j.k[r2]     // Catch:{ all -> 0x00db }
                java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x00db }
                r2 = r1
                b.p.b.a0.j.k[] r2 = (b.p.b.a0.j.k[]) r2     // Catch:{ all -> 0x00db }
                goto L_0x00a8
            L_0x00a7:
                r11 = r4
            L_0x00a8:
                java.util.concurrent.ExecutorService r1 = b.p.b.a0.j.d.B     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d$e$b r7 = new b.p.b.a0.j.d$e$b     // Catch:{ all -> 0x00db }
                java.lang.String r8 = "OkHttp %s settings"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00db }
                b.p.b.a0.j.d r9 = b.p.b.a0.j.d.this     // Catch:{ all -> 0x00db }
                java.lang.String r9 = r9.f6496l     // Catch:{ all -> 0x00db }
                r6[r3] = r9     // Catch:{ all -> 0x00db }
                r7.<init>(r8, r6)     // Catch:{ all -> 0x00db }
                r1.execute(r7)     // Catch:{ all -> 0x00db }
                monitor-exit(r0)     // Catch:{ all -> 0x00db }
                if (r2 == 0) goto L_0x00da
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 == 0) goto L_0x00da
                int r1 = r2.length
            L_0x00c4:
                if (r3 >= r1) goto L_0x00da
                r4 = r2[r3]
                monitor-enter(r4)
                long r5 = r4.f6537b     // Catch:{ all -> 0x00d7 }
                long r5 = r5 + r11
                r4.f6537b = r5     // Catch:{ all -> 0x00d7 }
                if (r0 <= 0) goto L_0x00d3
                r4.notifyAll()     // Catch:{ all -> 0x00d7 }
            L_0x00d3:
                monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
                int r3 = r3 + 1
                goto L_0x00c4
            L_0x00d7:
                r11 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00d7 }
                throw r11
            L_0x00da:
                return
            L_0x00db:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00db }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.d.e.g(boolean, b.p.b.a0.j.t):void");
        }

        public void h(int i2, long j2) {
            d dVar = d.this;
            if (i2 == 0) {
                synchronized (dVar) {
                    d dVar2 = d.this;
                    dVar2.s += j2;
                    dVar2.notifyAll();
                }
                return;
            }
            k q2 = dVar.q(i2);
            if (q2 != null) {
                synchronized (q2) {
                    q2.f6537b += j2;
                    if (j2 > 0) {
                        q2.notifyAll();
                    }
                }
            }
        }
    }

    static {
        Class<d> cls = d.class;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = i.a;
        B = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, timeUnit, synchronousQueue, new b.p.b.a0.h("OkHttp FramedConnection", true));
    }

    public d(c cVar, a aVar) {
        c cVar2 = cVar;
        s sVar = s.HTTP_2;
        System.nanoTime();
        this.r = 0;
        this.t = new t();
        t tVar = new t();
        this.u = tVar;
        this.v = false;
        this.A = new LinkedHashSet();
        s sVar2 = cVar2.f6509e;
        this.f6492h = sVar2;
        this.f6501q = s.a;
        this.f6493i = true;
        this.f6494j = C0115d.a;
        this.f6498n = 1;
        if (sVar2 == sVar) {
            this.f6498n = 3;
        }
        this.t.d(7, 0, 16777216);
        String str = cVar2.f6508b;
        this.f6496l = str;
        if (sVar2 == sVar) {
            this.w = new o();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            String format = String.format("OkHttp %s Push Observer", new Object[]{str});
            byte[] bArr = i.a;
            this.f6500p = new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new b.p.b.a0.h(format, true));
            tVar.d(7, 0, 65535);
            tVar.d(5, 0, 16384);
        } else if (sVar2 == s.SPDY_3) {
            this.w = new u();
            this.f6500p = null;
        } else {
            throw new AssertionError(sVar2);
        }
        this.s = (long) tVar.b(65536);
        this.x = cVar2.a;
        this.y = this.w.b(cVar2.d, true);
        e eVar = new e(this.w.a(cVar2.c, true), (a) null);
        this.z = eVar;
        new Thread(eVar).start();
    }

    public static boolean b(d dVar, int i2) {
        return dVar.f6492h == s.HTTP_2 && i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized void H(boolean z2) {
        if (z2) {
            System.nanoTime();
        }
    }

    public void N(a aVar) {
        synchronized (this.y) {
            synchronized (this) {
                if (!this.f6499o) {
                    this.f6499o = true;
                    int i2 = this.f6497m;
                    this.y.w(i2, aVar, i.a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.y.Z());
        r6 = (long) r2;
        r8.s -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O(int r9, boolean r10, o.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            b.p.b.a0.j.c r12 = r8.y
            r12.L(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.s     // Catch:{ InterruptedException -> 0x0058 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, b.p.b.a0.j.k> r2 = r8.f6495k     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r2 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0056 }
            int r2 = (int) r4     // Catch:{ all -> 0x0056 }
            b.p.b.a0.j.c r4 = r8.y     // Catch:{ all -> 0x0056 }
            int r4 = r4.Z()     // Catch:{ all -> 0x0056 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0056 }
            long r4 = r8.s     // Catch:{ all -> 0x0056 }
            long r6 = (long) r2     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.s = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            b.p.b.a0.j.c r4 = r8.y
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.L(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.d.O(int, boolean, o.e, long):void");
    }

    public void S(int i2, a aVar) {
        B.submit(new a("OkHttp %s stream %d", new Object[]{this.f6496l, Integer.valueOf(i2)}, i2, aVar));
    }

    public void Y(int i2, long j2) {
        B.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f6496l, Integer.valueOf(i2)}, i2, j2));
    }

    public void close() {
        e(a.NO_ERROR, a.CANCEL);
    }

    public final void e(a aVar, a aVar2) {
        int i2;
        k[] kVarArr = null;
        try {
            N(aVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f6495k.isEmpty()) {
                kVarArr = (k[]) this.f6495k.values().toArray(new k[this.f6495k.size()]);
                this.f6495k.clear();
                H(false);
            }
        }
        if (kVarArr != null) {
            for (k c2 : kVarArr) {
                try {
                    c2.c(aVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.y.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.x.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    public void flush() {
        this.y.flush();
    }

    public synchronized k q(int i2) {
        return this.f6495k.get(Integer.valueOf(i2));
    }

    public synchronized k z(int i2) {
        k remove;
        remove = this.f6495k.remove(Integer.valueOf(i2));
        if (remove != null && this.f6495k.isEmpty()) {
            H(true);
        }
        notifyAll();
        return remove;
    }
}
