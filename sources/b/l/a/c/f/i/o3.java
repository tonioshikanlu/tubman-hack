package b.l.a.c.f.i;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class o3<T> {
    public static final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static volatile n3 f3671g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f3672h = new AtomicInteger();
    public final m3 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3673b;
    public final T c;
    public volatile int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile T f3674e;

    static {
        new AtomicReference();
    }

    public /* synthetic */ o3(m3 m3Var, String str, Object obj) {
        if (m3Var.a != null) {
            this.a = m3Var;
            this.f3673b = str;
            this.c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract T a(Object obj);

    public final String b() {
        Objects.requireNonNull(this.a);
        return this.f3673b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9 A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa A[Catch:{ all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de A[Catch:{ all -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f3672h
            int r0 = r0.get()
            int r1 = r7.d
            if (r1 >= r0) goto L_0x013e
            monitor-enter(r7)
            int r1 = r7.d     // Catch:{ all -> 0x00a4 }
            if (r1 >= r0) goto L_0x013a
            b.l.a.c.f.i.n3 r1 = f3671g     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0134
            b.l.a.c.f.i.m3 r2 = r7.a     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00a4 }
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.c3 r2 = b.l.a.c.f.i.c3.a(r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.b(r3)     // Catch:{ all -> 0x00a4 }
            r3 = 0
            if (r2 == 0) goto L_0x0062
            java.util.regex.Pattern r4 = b.l.a.c.f.i.t2.c     // Catch:{ all -> 0x00a4 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x00a4 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.b()     // Catch:{ all -> 0x00a4 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00a4 }
            int r6 = r5.length()     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x0057
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00a4 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a4 }
            r4 = r5
        L_0x005d:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x00a4 }
        L_0x0060:
            r2 = r3
            goto L_0x00a7
        L_0x0062:
            b.l.a.c.f.i.m3 r2 = r7.a     // Catch:{ all -> 0x00a4 }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0129
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.m3 r4 = r7.a     // Catch:{ all -> 0x00a4 }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x00a4 }
            boolean r2 = b.l.a.c.f.i.e3.a(r2, r4)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x008c
            b.l.a.c.f.i.m3 r2 = r7.a     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00a4 }
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x00a4 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.m3 r4 = r7.a     // Catch:{ all -> 0x00a4 }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.x2 r2 = b.l.a.c.f.i.x2.a(r2, r4)     // Catch:{ all -> 0x00a4 }
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x0060
            java.lang.String r4 = r7.b()     // Catch:{ all -> 0x00a4 }
            java.util.Map r2 = r2.b()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a7
        L_0x00a4:
            r0 = move-exception
            goto L_0x013c
        L_0x00a7:
            if (r2 == 0) goto L_0x00aa
            goto L_0x00ce
        L_0x00aa:
            b.l.a.c.f.i.m3 r2 = r7.a     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x00a4 }
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.c3 r2 = b.l.a.c.f.i.c3.a(r2)     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.m3 r4 = r7.a     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = r7.f3673b     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = r2.b(r4)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x00ca
        L_0x00c9:
            r2 = r3
        L_0x00ca:
            if (r2 != 0) goto L_0x00ce
            T r2 = r7.c     // Catch:{ all -> 0x00a4 }
        L_0x00ce:
            b.l.a.c.f.i.t3 r1 = r1.b()     // Catch:{ all -> 0x00a4 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.r3 r1 = (b.l.a.c.f.i.r3) r1     // Catch:{ all -> 0x00a4 }
            boolean r4 = r1.a()     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x0124
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.d3 r1 = (b.l.a.c.f.i.d3) r1     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.m3 r2 = r7.a     // Catch:{ all -> 0x00a4 }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = r7.f3673b     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x011b
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a4 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.a     // Catch:{ all -> 0x00a4 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00a4 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x00a4 }
            if (r1 != 0) goto L_0x00fe
            goto L_0x011b
        L_0x00fe:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = ""
            int r4 = r2.length()     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x010f
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x0114
        L_0x010f:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00a4 }
            r2.<init>(r3)     // Catch:{ all -> 0x00a4 }
        L_0x0114:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00a4 }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a4 }
        L_0x011b:
            if (r3 != 0) goto L_0x0120
            T r2 = r7.c     // Catch:{ all -> 0x00a4 }
            goto L_0x0124
        L_0x0120:
            java.lang.Object r2 = r7.a(r3)     // Catch:{ all -> 0x00a4 }
        L_0x0124:
            r7.f3674e = r2     // Catch:{ all -> 0x00a4 }
            r7.d = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x013a
        L_0x0129:
            r1.a()     // Catch:{ all -> 0x00a4 }
            b.l.a.c.f.i.m3 r0 = r7.a     // Catch:{ all -> 0x00a4 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00a4 }
            java.util.Map<java.lang.String, b.l.a.c.f.i.p3> r0 = b.l.a.c.f.i.p3.a     // Catch:{ all -> 0x00a4 }
            throw r3     // Catch:{ all -> 0x00a4 }
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a4 }
            r0.<init>(r2)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x013a:
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            goto L_0x013e
        L_0x013c:
            monitor-exit(r7)     // Catch:{ all -> 0x00a4 }
            throw r0
        L_0x013e:
            T r0 = r7.f3674e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.o3.c():java.lang.Object");
    }
}
