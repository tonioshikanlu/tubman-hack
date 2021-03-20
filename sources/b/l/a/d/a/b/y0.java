package b.l.a.d.a.b;

import b.l.a.d.a.e.b0;
import b.l.a.d.a.e.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class y0 {
    public static final f d = new f("ExtractorTaskFinder");
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final t f4650b;
    public final z c;

    public y0(v0 v0Var, t tVar, z zVar) {
        this.a = v0Var;
        this.f4650b = tVar;
        this.c = zVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: b.l.a.d.a.b.k1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: b.l.a.d.a.b.k1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: b.l.a.d.a.b.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: b.l.a.d.a.b.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: b.l.a.d.a.b.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: b.l.a.d.a.b.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: b.l.a.d.a.b.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: b.l.a.d.a.b.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: b.l.a.d.a.b.k1} */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        d.b(3, "Found final move task for session %s with pack %s.", new java.lang.Object[]{java.lang.Integer.valueOf(r4.a), r4.c.a});
        r12 = r4.a;
        r9 = r4.c;
        r11 = new b.l.a.d.a.b.k1(r12, r9.a, r4.f4621b, r9.f4617b);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0310 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e4 A[LOOP:9: B:89:0x02e4->B:149:0x02e4, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0208 A[Catch:{ IOException -> 0x008f, all -> 0x03a8 }] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.d.a.b.x0 a() {
        /*
            r39 = this;
            r1 = r39
            b.l.a.d.a.b.v0 r0 = r1.a     // Catch:{ all -> 0x03a8 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f     // Catch:{ all -> 0x03a8 }
            r0.lock()     // Catch:{ all -> 0x03a8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x03a8 }
            r2.<init>()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.v0 r0 = r1.a     // Catch:{ all -> 0x03a8 }
            java.util.Map<java.lang.Integer, b.l.a.d.a.b.s0> r0 = r0.f4639e     // Catch:{ all -> 0x03a8 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x03a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.s0 r3 = (b.l.a.d.a.b.s0) r3     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r4 = r3.c     // Catch:{ all -> 0x03a8 }
            int r4 = r4.c     // Catch:{ all -> 0x03a8 }
            boolean r4 = b.l.a.d.a.b.e1.f(r4)     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x03a8 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x03a8 }
            if (r0 != 0) goto L_0x03a3
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x03a8 }
            r5 = 2
            r6 = 3
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.s0 r4 = (b.l.a.d.a.b.s0) r4     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t r9 = r1.f4650b     // Catch:{ IOException -> 0x008f }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ IOException -> 0x008f }
            java.lang.String r11 = r10.a     // Catch:{ IOException -> 0x008f }
            int r12 = r4.f4621b     // Catch:{ IOException -> 0x008f }
            long r13 = r10.f4617b     // Catch:{ IOException -> 0x008f }
            int r9 = r9.n(r11, r12, r13)     // Catch:{ IOException -> 0x008f }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ IOException -> 0x008f }
            java.util.List<b.l.a.d.a.b.t0> r10 = r10.f4618e     // Catch:{ IOException -> 0x008f }
            int r10 = r10.size()     // Catch:{ IOException -> 0x008f }
            if (r9 != r10) goto L_0x003e
            b.l.a.d.a.e.f r0 = d     // Catch:{ all -> 0x03a8 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x03a8 }
            int r10 = r4.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03a8 }
            r9[r7] = r10     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x03a8 }
            r9[r8] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = "Found final move task for session %s with pack %s."
            r0.b(r6, r10, r9)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.k1 r0 = new b.l.a.d.a.b.k1     // Catch:{ all -> 0x03a8 }
            int r12 = r4.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r9 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r13 = r9.a     // Catch:{ all -> 0x03a8 }
            int r14 = r4.f4621b     // Catch:{ all -> 0x03a8 }
            long r9 = r9.f4617b     // Catch:{ all -> 0x03a8 }
            r11 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15)     // Catch:{ all -> 0x03a8 }
            goto L_0x00af
        L_0x008f:
            r0 = move-exception
            b.l.a.d.a.b.g0 r2 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x03a8 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x03a8 }
            int r5 = r4.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03a8 }
            r3[r7] = r5     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r5 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = r5.a     // Catch:{ all -> 0x03a8 }
            r3[r8] = r5     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x03a8 }
            int r4 = r4.a     // Catch:{ all -> 0x03a8 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x03a8 }
            throw r2     // Catch:{ all -> 0x03a8 }
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 != 0) goto L_0x03a0
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x00b5:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.s0 r4 = (b.l.a.d.a.b.s0) r4     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r9 = r4.c     // Catch:{ all -> 0x03a8 }
            int r9 = r9.c     // Catch:{ all -> 0x03a8 }
            boolean r9 = b.l.a.d.a.b.e1.f(r9)     // Catch:{ all -> 0x03a8 }
            if (r9 == 0) goto L_0x00b5
            b.l.a.d.a.b.r0 r9 = r4.c     // Catch:{ all -> 0x03a8 }
            java.util.List<b.l.a.d.a.b.t0> r9 = r9.f4618e     // Catch:{ all -> 0x03a8 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x00d3:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r10 == 0) goto L_0x00b5
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t0 r10 = (b.l.a.d.a.b.t0) r10     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t r11 = r1.f4650b     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r12 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r13 = r12.a     // Catch:{ all -> 0x03a8 }
            int r14 = r4.f4621b     // Catch:{ all -> 0x03a8 }
            r17 = r9
            long r8 = r12.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r15 = r10.a     // Catch:{ all -> 0x03a8 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r8
            java.io.File r8 = r11.l(r12, r13, r14, r16)     // Catch:{ all -> 0x03a8 }
            boolean r8 = r8.exists()     // Catch:{ all -> 0x03a8 }
            if (r8 == 0) goto L_0x0136
            b.l.a.d.a.e.f r0 = d     // Catch:{ all -> 0x03a8 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x03a8 }
            int r9 = r4.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03a8 }
            r8[r7] = r9     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r9 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = r9.a     // Catch:{ all -> 0x03a8 }
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = r10.a     // Catch:{ all -> 0x03a8 }
            r8[r5] = r9     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = "Found merge task for session %s with pack %s and slice %s."
            r0.b(r6, r9, r8)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.h1 r0 = new b.l.a.d.a.b.h1     // Catch:{ all -> 0x03a8 }
            int r8 = r4.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r9 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r11 = r9.a     // Catch:{ all -> 0x03a8 }
            int r4 = r4.f4621b     // Catch:{ all -> 0x03a8 }
            long r12 = r9.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = r10.a     // Catch:{ all -> 0x03a8 }
            r17 = r0
            r18 = r8
            r19 = r11
            r20 = r4
            r21 = r12
            r23 = r9
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x03a8 }
            goto L_0x013b
        L_0x0136:
            r9 = r17
            r8 = 1
            goto L_0x00d3
        L_0x013a:
            r0 = 0
        L_0x013b:
            if (r0 != 0) goto L_0x03a0
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x0141:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x01c7
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.s0 r4 = (b.l.a.d.a.b.s0) r4     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r8 = r4.c     // Catch:{ all -> 0x03a8 }
            int r8 = r8.c     // Catch:{ all -> 0x03a8 }
            boolean r8 = b.l.a.d.a.b.e1.f(r8)     // Catch:{ all -> 0x03a8 }
            if (r8 == 0) goto L_0x0141
            b.l.a.d.a.b.r0 r8 = r4.c     // Catch:{ all -> 0x03a8 }
            java.util.List<b.l.a.d.a.b.t0> r8 = r8.f4618e     // Catch:{ all -> 0x03a8 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x015f:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t0 r9 = (b.l.a.d.a.b.t0) r9     // Catch:{ all -> 0x03a8 }
            boolean r10 = r1.b(r4, r9)     // Catch:{ all -> 0x03a8 }
            if (r10 == 0) goto L_0x015f
            b.l.a.d.a.b.t r11 = r1.f4650b     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r12 = r10.a     // Catch:{ all -> 0x03a8 }
            int r13 = r4.f4621b     // Catch:{ all -> 0x03a8 }
            long r14 = r10.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x03a8 }
            r16 = r10
            java.io.File r10 = r11.k(r12, r13, r14, r16)     // Catch:{ all -> 0x03a8 }
            boolean r10 = r10.exists()     // Catch:{ all -> 0x03a8 }
            if (r10 == 0) goto L_0x015f
            b.l.a.d.a.e.f r0 = d     // Catch:{ all -> 0x03a8 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x03a8 }
            int r10 = r4.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03a8 }
            r8[r7] = r10     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x03a8 }
            r11 = 1
            r8[r11] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x03a8 }
            r8[r5] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = "Found verify task for session %s with pack %s and slice %s."
            r0.b(r6, r10, r8)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.w1 r0 = new b.l.a.d.a.b.w1     // Catch:{ all -> 0x03a8 }
            int r8 = r4.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r4.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r11 = r10.a     // Catch:{ all -> 0x03a8 }
            int r4 = r4.f4621b     // Catch:{ all -> 0x03a8 }
            long r12 = r10.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r9.a     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = r9.f4626b     // Catch:{ all -> 0x03a8 }
            r17 = r0
            r18 = r8
            r19 = r11
            r20 = r4
            r21 = r12
            r23 = r10
            r24 = r9
            r17.<init>(r18, r19, r20, r21, r23, r24)     // Catch:{ all -> 0x03a8 }
            goto L_0x01c8
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            if (r0 != 0) goto L_0x03a0
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x01ce:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03a8 }
            r8 = 4
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x03a8 }
            r9 = r0
            b.l.a.d.a.b.s0 r9 = (b.l.a.d.a.b.s0) r9     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r0 = r9.c     // Catch:{ all -> 0x03a8 }
            int r0 = r0.c     // Catch:{ all -> 0x03a8 }
            boolean r0 = b.l.a.d.a.b.e1.f(r0)     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x01ce
            b.l.a.d.a.b.r0 r0 = r9.c     // Catch:{ all -> 0x03a8 }
            java.util.List<b.l.a.d.a.b.t0> r0 = r0.f4618e     // Catch:{ all -> 0x03a8 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x01ee:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x03a8 }
            r11 = r0
            b.l.a.d.a.b.t0 r11 = (b.l.a.d.a.b.t0) r11     // Catch:{ all -> 0x03a8 }
            int r0 = r11.f     // Catch:{ all -> 0x03a8 }
            r12 = 1
            if (r0 == r12) goto L_0x0205
            if (r0 != r5) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r0 = r7
            goto L_0x0206
        L_0x0205:
            r0 = 1
        L_0x0206:
            if (r0 != 0) goto L_0x01ee
            b.l.a.d.a.b.t1 r0 = new b.l.a.d.a.b.t1     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t r12 = r1.f4650b     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r13 = r9.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r14 = r13.a     // Catch:{ all -> 0x03a8 }
            int r15 = r9.f4621b     // Catch:{ all -> 0x03a8 }
            r24 = r4
            long r3 = r13.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r13 = r11.a     // Catch:{ all -> 0x03a8 }
            r17 = r0
            r18 = r12
            r19 = r14
            r20 = r15
            r21 = r3
            r23 = r13
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x03a8 }
            int r0 = r0.j()     // Catch:{ IOException -> 0x022c }
            goto L_0x023c
        L_0x022c:
            r0 = move-exception
            r3 = r0
            b.l.a.d.a.e.f r0 = d     // Catch:{ all -> 0x03a8 }
            r4 = 1
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x03a8 }
            r12[r7] = r3     // Catch:{ all -> 0x03a8 }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r4 = 6
            r0.b(r4, r3, r12)     // Catch:{ all -> 0x03a8 }
            r0 = r7
        L_0x023c:
            r3 = -1
            if (r0 == r3) goto L_0x02b8
            java.util.List<b.l.a.d.a.b.q0> r3 = r11.d     // Catch:{ all -> 0x03a8 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.q0 r3 = (b.l.a.d.a.b.q0) r3     // Catch:{ all -> 0x03a8 }
            boolean r3 = r3.a     // Catch:{ all -> 0x03a8 }
            if (r3 == 0) goto L_0x02b8
            b.l.a.d.a.e.f r3 = d     // Catch:{ all -> 0x03a8 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x03a8 }
            int r10 = r11.f4627e     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03a8 }
            r4[r7] = r10     // Catch:{ all -> 0x03a8 }
            int r10 = r9.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03a8 }
            r12 = 1
            r4[r12] = r10     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r9.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x03a8 }
            r4[r5] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x03a8 }
            r4[r6] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03a8 }
            r4[r8] = r10     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.b(r6, r10, r4)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.z r3 = r1.c     // Catch:{ all -> 0x03a8 }
            int r4 = r9.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r9.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x03a8 }
            java.lang.String r12 = r11.a     // Catch:{ all -> 0x03a8 }
            java.io.InputStream r38 = r3.a(r4, r10, r12, r0)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.e0 r3 = new b.l.a.d.a.b.e0     // Catch:{ all -> 0x03a8 }
            int r4 = r9.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r10 = r9.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r12 = r10.a     // Catch:{ all -> 0x03a8 }
            int r13 = r9.f4621b     // Catch:{ all -> 0x03a8 }
            long r14 = r10.f4617b     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x03a8 }
            int r6 = r11.f4627e     // Catch:{ all -> 0x03a8 }
            java.util.List<b.l.a.d.a.b.q0> r11 = r11.d     // Catch:{ all -> 0x03a8 }
            int r34 = r11.size()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r9 = r9.c     // Catch:{ all -> 0x03a8 }
            long r7 = r9.d     // Catch:{ all -> 0x03a8 }
            int r9 = r9.c     // Catch:{ all -> 0x03a8 }
            r25 = r3
            r26 = r4
            r27 = r12
            r28 = r13
            r29 = r14
            r31 = r10
            r32 = r6
            r33 = r0
            r35 = r7
            r37 = r9
            r25.<init>(r26, r27, r28, r29, r31, r32, r33, r34, r35, r37, r38)     // Catch:{ all -> 0x03a8 }
            goto L_0x02c0
        L_0x02b8:
            r4 = r24
            r6 = 3
            r7 = 0
            r8 = 4
            goto L_0x01ee
        L_0x02bf:
            r3 = 0
        L_0x02c0:
            if (r3 != 0) goto L_0x0398
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x02c6:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r2 == 0) goto L_0x0386
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.s0 r2 = (b.l.a.d.a.b.s0) r2     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r3 = r2.c     // Catch:{ all -> 0x03a8 }
            int r3 = r3.c     // Catch:{ all -> 0x03a8 }
            boolean r3 = b.l.a.d.a.b.e1.f(r3)     // Catch:{ all -> 0x03a8 }
            if (r3 == 0) goto L_0x02c6
            b.l.a.d.a.b.r0 r3 = r2.c     // Catch:{ all -> 0x03a8 }
            java.util.List<b.l.a.d.a.b.t0> r3 = r3.f4618e     // Catch:{ all -> 0x03a8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03a8 }
        L_0x02e4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x02c6
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t0 r4 = (b.l.a.d.a.b.t0) r4     // Catch:{ all -> 0x03a8 }
            int r6 = r4.f     // Catch:{ all -> 0x03a8 }
            r7 = 1
            if (r6 == r7) goto L_0x02fa
            if (r6 != r5) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r6 = 0
            goto L_0x02fb
        L_0x02fa:
            r6 = 1
        L_0x02fb:
            if (r6 == 0) goto L_0x02e4
            java.util.List<b.l.a.d.a.b.q0> r6 = r4.d     // Catch:{ all -> 0x03a8 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.q0 r6 = (b.l.a.d.a.b.q0) r6     // Catch:{ all -> 0x03a8 }
            boolean r6 = r6.a     // Catch:{ all -> 0x03a8 }
            if (r6 == 0) goto L_0x02e4
            boolean r6 = r1.b(r2, r4)     // Catch:{ all -> 0x03a8 }
            if (r6 != 0) goto L_0x02e4
            b.l.a.d.a.e.f r0 = d     // Catch:{ all -> 0x03a8 }
            r6 = 4
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x03a8 }
            int r6 = r4.f     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03a8 }
            r7 = 0
            r3[r7] = r6     // Catch:{ all -> 0x03a8 }
            int r6 = r2.a     // Catch:{ all -> 0x03a8 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x03a8 }
            r7 = 1
            r3[r7] = r6     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r6 = r2.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x03a8 }
            r3[r5] = r6     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x03a8 }
            r7 = 3
            r3[r7] = r5     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.b(r7, r5, r3)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.z r0 = r1.c     // Catch:{ all -> 0x03a8 }
            int r3 = r2.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r5 = r2.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = r5.a     // Catch:{ all -> 0x03a8 }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x03a8 }
            r8 = 0
            java.io.InputStream r30 = r0.a(r3, r5, r6, r8)     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.q1 r0 = new b.l.a.d.a.b.q1     // Catch:{ all -> 0x03a8 }
            int r3 = r2.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r5 = r2.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = r5.a     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t r6 = r1.f4650b     // Catch:{ all -> 0x03a8 }
            java.io.File r6 = r6.a(r5)     // Catch:{ all -> 0x03a8 }
            r9 = 1
            long r6 = b.l.a.d.a.b.t.c(r6, r9)     // Catch:{ all -> 0x03a8 }
            int r6 = (int) r6     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.t r7 = r1.f4650b     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r8 = r2.c     // Catch:{ all -> 0x03a8 }
            java.lang.String r8 = r8.a     // Catch:{ all -> 0x03a8 }
            long r21 = r7.s(r8)     // Catch:{ all -> 0x03a8 }
            int r7 = r2.f4621b     // Catch:{ all -> 0x03a8 }
            b.l.a.d.a.b.r0 r2 = r2.c     // Catch:{ all -> 0x03a8 }
            long r8 = r2.f4617b     // Catch:{ all -> 0x03a8 }
            int r2 = r4.f     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = r4.a     // Catch:{ all -> 0x03a8 }
            long r11 = r4.c     // Catch:{ all -> 0x03a8 }
            r17 = r0
            r18 = r3
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r8
            r26 = r2
            r27 = r10
            r28 = r11
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x03a8 }
            goto L_0x0387
        L_0x0386:
            r0 = 0
        L_0x0387:
            b.l.a.d.a.b.v0 r2 = r1.a
            if (r0 == 0) goto L_0x0391
        L_0x038b:
            java.util.concurrent.locks.ReentrantLock r2 = r2.f
            r2.unlock()
            return r0
        L_0x0391:
            java.util.concurrent.locks.ReentrantLock r0 = r2.f
        L_0x0393:
            r0.unlock()
            r2 = 0
            return r2
        L_0x0398:
            b.l.a.d.a.b.v0 r0 = r1.a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            r0.unlock()
            return r3
        L_0x03a0:
            b.l.a.d.a.b.v0 r2 = r1.a
            goto L_0x038b
        L_0x03a3:
            b.l.a.d.a.b.v0 r0 = r1.a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            goto L_0x0393
        L_0x03a8:
            r0 = move-exception
            b.l.a.d.a.b.v0 r2 = r1.a
            java.util.concurrent.locks.ReentrantLock r2 = r2.f
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.y0.a():b.l.a.d.a.b.x0");
    }

    public final boolean b(s0 s0Var, t0 t0Var) {
        FileInputStream fileInputStream;
        t tVar = this.f4650b;
        r0 r0Var = s0Var.c;
        File p2 = tVar.p(r0Var.a, s0Var.f4621b, r0Var.f4617b, t0Var.a);
        if (!p2.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(p2);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null) {
                t1.f4628h.b(6, "Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                return true;
            } else {
                return false;
            }
        } catch (IOException e2) {
            t1.f4628h.b(6, "Could not read checkpoint while checking if extraction finished. %s", new Object[]{e2});
            return false;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }
}
