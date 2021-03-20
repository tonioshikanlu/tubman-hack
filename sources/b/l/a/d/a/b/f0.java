package b.l.a.d.a.b;

import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import java.io.File;

public final class f0 {
    public static final f f = new f("ExtractChunkTaskHandler");
    public final byte[] a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    public final t f4537b;
    public final c0<n2> c;
    public final c0<q> d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f4538e;

    public f0(t tVar, c0<n2> c0Var, c0<q> c0Var2, k0 k0Var) {
        this.f4537b = tVar;
        this.c = c0Var;
        this.d = c0Var2;
        this.f4538e = k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0299, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r6 = r5.length();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0162, code lost:
        if (r8 == r3) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0164, code lost:
        f.b(3, "Chunk has ended while resuming the previous chunks file content.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        r7 = r14;
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3.a(r4.getCanonicalPath(), r6, r7, r2.f4525g);
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02a5 A[SYNTHETIC, Splitter:B:120:0x02a5] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x035c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01af A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d0 A[Catch:{ all -> 0x0299 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0200 A[Catch:{ all -> 0x0299 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(b.l.a.d.a.b.e0 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            b.l.a.d.a.b.t1 r0 = new b.l.a.d.a.b.t1
            b.l.a.d.a.b.t r10 = r1.f4537b
            java.lang.String r11 = r2.f4647b
            int r12 = r2.c
            long r13 = r2.d
            java.lang.String r15 = r2.f4524e
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            java.io.File r3 = r3.q(r4, r5, r6, r8)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r10 = 2
            r11 = 1
            r12 = 3
            r13 = 0
            java.io.InputStream r3 = r2.f4529k     // Catch:{ IOException -> 0x036c }
            int r4 = r2.f     // Catch:{ IOException -> 0x036c }
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r11) goto L_0x0039
            r9 = r3
            goto L_0x003f
        L_0x0039:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x036c }
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x036c }
            r9 = r4
        L_0x003f:
            int r3 = r2.f4525g     // Catch:{ all -> 0x035d }
            r16 = 0
            if (r3 <= 0) goto L_0x01ab
            b.l.a.d.a.b.s1 r3 = r0.e()     // Catch:{ all -> 0x035d }
            int r4 = r3.f4623e     // Catch:{ all -> 0x035d }
            int r6 = r2.f4525g     // Catch:{ all -> 0x035d }
            int r7 = r6 + -1
            if (r4 != r7) goto L_0x018c
            int r4 = r3.a     // Catch:{ all -> 0x035d }
            if (r4 == r11) goto L_0x0108
            if (r4 == r10) goto L_0x00bd
            if (r4 != r12) goto L_0x00a5
            b.l.a.d.a.e.f r4 = f     // Catch:{ all -> 0x0106 }
            java.lang.String r6 = "Resuming central directory from last chunk."
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x0106 }
            r4.b(r12, r6, r7)     // Catch:{ all -> 0x0106 }
            long r3 = r3.c     // Catch:{ all -> 0x0106 }
            java.io.File r6 = r0.i()     // Catch:{ all -> 0x0106 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = "rw"
            r7.<init>(r6, r8)     // Catch:{ all -> 0x0106 }
            r7.seek(r3)     // Catch:{ all -> 0x0097 }
        L_0x0072:
            byte[] r3 = r0.a     // Catch:{ all -> 0x0097 }
            int r3 = r9.read(r3)     // Catch:{ all -> 0x0097 }
            if (r3 <= 0) goto L_0x007f
            byte[] r4 = r0.a     // Catch:{ all -> 0x0097 }
            r7.write(r4, r13, r3)     // Catch:{ all -> 0x0097 }
        L_0x007f:
            if (r3 == r5) goto L_0x0072
            r7.close()     // Catch:{ all -> 0x0106 }
            boolean r3 = r23.a()     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x008d
            r14 = r9
            goto L_0x017e
        L_0x008d:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.a     // Catch:{ all -> 0x0106 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0097:
            r0 = move-exception
            r3 = r0
            r7.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a4
        L_0x009d:
            r0 = move-exception
            r4 = r0
            b.l.a.d.a.e.v r0 = b.l.a.d.a.e.b0.a     // Catch:{ all -> 0x0106 }
            r0.a(r3, r4)     // Catch:{ all -> 0x0106 }
        L_0x00a4:
            throw r3     // Catch:{ all -> 0x0106 }
        L_0x00a5:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0106 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x0106 }
            int r3 = r3.a     // Catch:{ all -> 0x0106 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0106 }
            r4[r13] = r3     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0106 }
            int r4 = r2.a     // Catch:{ all -> 0x0106 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x00bd:
            b.l.a.d.a.e.f r3 = f     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0106 }
            r3.b(r12, r4, r5)     // Catch:{ all -> 0x0106 }
            b.l.a.d.a.b.t r3 = r1.f4537b     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = r2.f4647b     // Catch:{ all -> 0x0106 }
            int r5 = r2.c     // Catch:{ all -> 0x0106 }
            long r6 = r2.d     // Catch:{ all -> 0x0106 }
            java.lang.String r8 = r2.f4524e     // Catch:{ all -> 0x0106 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0106 }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x0106 }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.q(r17, r18, r19, r21)     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = "checkpoint_ext.dat"
            r15.<init>(r3, r4)     // Catch:{ all -> 0x0106 }
            boolean r3 = r15.exists()     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x00fc
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream     // Catch:{ all -> 0x0106 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0106 }
            r4.<init>(r15)     // Catch:{ all -> 0x0106 }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x0106 }
            r14 = r9
            r9 = r3
            goto L_0x01ad
        L_0x00fc:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.a     // Catch:{ all -> 0x0106 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            goto L_0x0149
        L_0x0108:
            b.l.a.d.a.e.f r4 = f     // Catch:{ all -> 0x035d }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ all -> 0x035d }
            java.lang.String r6 = r3.f4622b     // Catch:{ all -> 0x035d }
            r5[r13] = r6     // Catch:{ all -> 0x035d }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.b(r12, r6, r5)     // Catch:{ all -> 0x035d }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x035d }
            java.lang.String r5 = r3.f4622b     // Catch:{ all -> 0x035d }
            r4.<init>(r5)     // Catch:{ all -> 0x035d }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0181
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x035d }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x035d }
            long r6 = r3.c     // Catch:{ all -> 0x035d }
            r5.seek(r6)     // Catch:{ all -> 0x035d }
            long r6 = r3.d     // Catch:{ all -> 0x035d }
        L_0x0130:
            r14 = 8192(0x2000, double:4.0474E-320)
            long r14 = java.lang.Math.min(r6, r14)     // Catch:{ all -> 0x035d }
            int r3 = (int) r14     // Catch:{ all -> 0x035d }
            byte[] r8 = r1.a     // Catch:{ all -> 0x035d }
            int r8 = r9.read(r8, r13, r3)     // Catch:{ all -> 0x035d }
            int r8 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x035d }
            if (r8 <= 0) goto L_0x014d
            byte[] r14 = r1.a     // Catch:{ all -> 0x0106 }
            r5.write(r14, r13, r8)     // Catch:{ all -> 0x0106 }
            goto L_0x014d
        L_0x0149:
            r3 = r0
            r14 = r9
            goto L_0x0360
        L_0x014d:
            long r14 = (long) r8
            long r14 = r6 - r14
            r6 = 0
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x015b
            if (r8 > 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r6 = r14
            goto L_0x0130
        L_0x015b:
            long r6 = r5.length()     // Catch:{ all -> 0x035d }
            r5.close()     // Catch:{ all -> 0x035d }
            if (r8 == r3) goto L_0x01ab
            b.l.a.d.a.e.f r3 = f     // Catch:{ all -> 0x035d }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x035d }
            r3.b(r12, r5, r8)     // Catch:{ all -> 0x035d }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x035d }
            int r8 = r2.f4525g     // Catch:{ all -> 0x035d }
            r3 = r0
            r5 = r6
            r18 = r8
            r7 = r14
            r14 = r9
            r9 = r18
            r3.a(r4, r5, r7, r9)     // Catch:{ all -> 0x0299 }
        L_0x017e:
            r9 = r16
            goto L_0x01ad
        L_0x0181:
            r14 = r9
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0299 }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.a     // Catch:{ all -> 0x0299 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x018c:
            r14 = r9
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0299 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0299 }
            r5[r13] = r6     // Catch:{ all -> 0x0299 }
            int r3 = r3.f4623e     // Catch:{ all -> 0x0299 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0299 }
            r5[r11] = r3     // Catch:{ all -> 0x0299 }
            java.lang.String r3 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0299 }
            int r4 = r2.a     // Catch:{ all -> 0x0299 }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x01ab:
            r14 = r9
            r9 = r14
        L_0x01ad:
            if (r9 == 0) goto L_0x029c
            b.l.a.d.a.b.a0 r3 = new b.l.a.d.a.b.a0     // Catch:{ all -> 0x0299 }
            r3.<init>(r9)     // Catch:{ all -> 0x0299 }
            java.io.File r4 = r22.b(r23)     // Catch:{ all -> 0x0299 }
        L_0x01b8:
            b.l.a.d.a.b.y1 r5 = r3.b()     // Catch:{ all -> 0x0299 }
            boolean r6 = r5.d     // Catch:{ all -> 0x0299 }
            if (r6 != 0) goto L_0x0205
            boolean r6 = r3.f4481l     // Catch:{ all -> 0x0299 }
            if (r6 != 0) goto L_0x0205
            boolean r6 = r5.b()     // Catch:{ all -> 0x0299 }
            if (r6 == 0) goto L_0x0200
            boolean r6 = r5.a()     // Catch:{ all -> 0x0299 }
            if (r6 != 0) goto L_0x0200
            byte[] r6 = r5.f     // Catch:{ all -> 0x0299 }
            r0.f(r6)     // Catch:{ all -> 0x0299 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r5.a     // Catch:{ all -> 0x0299 }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x0299 }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x0299 }
            r7.mkdirs()     // Catch:{ all -> 0x0299 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0299 }
            r7.<init>(r6)     // Catch:{ all -> 0x0299 }
            byte[] r6 = r1.a     // Catch:{ all -> 0x0299 }
            int r6 = r3.read(r6)     // Catch:{ all -> 0x0299 }
        L_0x01ee:
            if (r6 <= 0) goto L_0x01fc
            byte[] r8 = r1.a     // Catch:{ all -> 0x0299 }
            r7.write(r8, r13, r6)     // Catch:{ all -> 0x0299 }
            byte[] r6 = r1.a     // Catch:{ all -> 0x0299 }
            int r6 = r3.read(r6)     // Catch:{ all -> 0x0299 }
            goto L_0x01ee
        L_0x01fc:
            r7.close()     // Catch:{ all -> 0x0299 }
            goto L_0x0205
        L_0x0200:
            byte[] r6 = r5.f     // Catch:{ all -> 0x0299 }
            r0.g(r6, r3)     // Catch:{ all -> 0x0299 }
        L_0x0205:
            boolean r6 = r3.f4480k     // Catch:{ all -> 0x0299 }
            if (r6 != 0) goto L_0x020d
            boolean r6 = r3.f4481l     // Catch:{ all -> 0x0299 }
            if (r6 == 0) goto L_0x01b8
        L_0x020d:
            boolean r4 = r3.f4481l     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x021f
            b.l.a.d.a.e.f r4 = f     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x0299 }
            r4.b(r12, r6, r7)     // Catch:{ all -> 0x0299 }
            byte[] r4 = r5.f     // Catch:{ all -> 0x0299 }
            r0.g(r4, r9)     // Catch:{ all -> 0x0299 }
        L_0x021f:
            boolean r4 = r23.a()     // Catch:{ all -> 0x0299 }
            if (r4 != 0) goto L_0x029c
            boolean r4 = r5.d     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x023a
            b.l.a.d.a.e.f r3 = f     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0299 }
            r3.b(r12, r4, r6)     // Catch:{ all -> 0x0299 }
            byte[] r3 = r5.f     // Catch:{ all -> 0x0299 }
            int r4 = r2.f4525g     // Catch:{ all -> 0x0299 }
            r0.b(r3, r4)     // Catch:{ all -> 0x0299 }
            goto L_0x029c
        L_0x023a:
            boolean r4 = r3.f4481l     // Catch:{ all -> 0x0299 }
            if (r4 == 0) goto L_0x024d
            b.l.a.d.a.e.f r3 = f     // Catch:{ all -> 0x0299 }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0299 }
            r3.b(r12, r4, r5)     // Catch:{ all -> 0x0299 }
            int r3 = r2.f4525g     // Catch:{ all -> 0x0299 }
            r0.c(r3)     // Catch:{ all -> 0x0299 }
            goto L_0x029c
        L_0x024d:
            int r4 = r5.c     // Catch:{ all -> 0x0299 }
            if (r4 != 0) goto L_0x027b
            b.l.a.d.a.e.f r4 = f     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x0299 }
            r4.b(r12, r6, r7)     // Catch:{ all -> 0x0299 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0299 }
            java.io.File r6 = r22.b(r23)     // Catch:{ all -> 0x0299 }
            java.lang.String r7 = r5.a     // Catch:{ all -> 0x0299 }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x0299 }
            long r5 = r5.f4651b     // Catch:{ all -> 0x0299 }
            long r7 = r3.f4479j     // Catch:{ all -> 0x0299 }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x0299 }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0273
            goto L_0x028c
        L_0x0273:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0     // Catch:{ all -> 0x0299 }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x0299 }
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x027b:
            b.l.a.d.a.e.f r4 = f     // Catch:{ all -> 0x0299 }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x0299 }
            r4.b(r12, r5, r6)     // Catch:{ all -> 0x0299 }
            java.io.File r4 = r0.i()     // Catch:{ all -> 0x0299 }
            long r5 = r4.length()     // Catch:{ all -> 0x0299 }
        L_0x028c:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x0299 }
            long r7 = r3.f4479j     // Catch:{ all -> 0x0299 }
            int r9 = r2.f4525g     // Catch:{ all -> 0x0299 }
            r3 = r0
            r3.a(r4, r5, r7, r9)     // Catch:{ all -> 0x0299 }
            goto L_0x029c
        L_0x0299:
            r0 = move-exception
            goto L_0x035f
        L_0x029c:
            r14.close()     // Catch:{ IOException -> 0x036c }
            boolean r3 = r23.a()
            if (r3 == 0) goto L_0x02c6
            int r3 = r2.f4525g     // Catch:{ IOException -> 0x02ab }
            r0.d(r3)     // Catch:{ IOException -> 0x02ab }
            goto L_0x02c6
        L_0x02ab:
            r0 = move-exception
            b.l.a.d.a.e.f r3 = f
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r5 = r0.getMessage()
            r4[r13] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r6 = 6
            r3.b(r6, r5, r4)
            b.l.a.d.a.b.g0 r3 = new b.l.a.d.a.b.g0
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.a
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02c6:
            b.l.a.d.a.e.f r0 = f
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f4525g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r13] = r3
            java.lang.String r3 = r2.f4524e
            r4[r11] = r3
            java.lang.String r3 = r2.f4647b
            r4[r10] = r3
            int r3 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r12] = r3
            java.lang.String r3 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r5 = 4
            r0.b(r5, r3, r4)
            b.l.a.d.a.e.c0<b.l.a.d.a.b.n2> r0 = r1.c
            java.lang.Object r0 = r0.a()
            b.l.a.d.a.b.n2 r0 = (b.l.a.d.a.b.n2) r0
            int r3 = r2.a
            java.lang.String r4 = r2.f4647b
            java.lang.String r5 = r2.f4524e
            int r6 = r2.f4525g
            r0.g(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f4529k     // Catch:{ IOException -> 0x0302 }
            r0.close()     // Catch:{ IOException -> 0x0302 }
            goto L_0x031c
        L_0x0302:
            b.l.a.d.a.e.f r0 = f
            java.lang.Object[] r3 = new java.lang.Object[r12]
            int r4 = r2.f4525g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            java.lang.String r4 = r2.f4524e
            r3[r11] = r4
            java.lang.String r4 = r2.f4647b
            r3[r10] = r4
            java.lang.String r4 = "Could not close file for chunk %s of slice %s of pack %s."
            r5 = 5
            r0.b(r5, r4, r3)
        L_0x031c:
            int r0 = r2.f4528j
            if (r0 != r12) goto L_0x035c
            b.l.a.d.a.e.c0<b.l.a.d.a.b.q> r0 = r1.d
            java.lang.Object r0 = r0.a()
            b.l.a.d.a.b.q r0 = (b.l.a.d.a.b.q) r0
            java.lang.String r3 = r2.f4647b
            long r7 = r2.f4527i
            r4 = 3
            r5 = 0
            b.l.a.d.a.b.k0 r6 = r1.f4538e
            monitor-enter(r6)
            int r9 = r2.f4525g     // Catch:{ all -> 0x0359 }
            double r9 = (double) r9     // Catch:{ all -> 0x0359 }
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 + r11
            int r2 = r2.f4526h     // Catch:{ all -> 0x0359 }
            double r11 = (double) r2     // Catch:{ all -> 0x0359 }
            double r9 = r9 / r11
            java.util.Map<java.lang.String, java.lang.Double> r2 = r6.a     // Catch:{ all -> 0x0359 }
            java.lang.Double r11 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x0359 }
            r2.put(r3, r11)     // Catch:{ all -> 0x0359 }
            monitor-exit(r6)
            r11 = 1
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.b(r2, r3, r4, r5, r7, r9, r11)
            android.os.Handler r3 = r0.f4608n
            b.l.a.d.a.b.n r4 = new b.l.a.d.a.b.n
            r4.<init>(r0, r2)
            r3.post(r4)
            return
        L_0x0359:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x035c:
            return
        L_0x035d:
            r0 = move-exception
            r14 = r9
        L_0x035f:
            r3 = r0
        L_0x0360:
            r14.close()     // Catch:{ all -> 0x0364 }
            goto L_0x036b
        L_0x0364:
            r0 = move-exception
            r4 = r0
            b.l.a.d.a.e.v r0 = b.l.a.d.a.e.b0.a     // Catch:{ IOException -> 0x036c }
            r0.a(r3, r4)     // Catch:{ IOException -> 0x036c }
        L_0x036b:
            throw r3     // Catch:{ IOException -> 0x036c }
        L_0x036c:
            r0 = move-exception
            b.l.a.d.a.e.f r3 = f
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r5 = r0.getMessage()
            r4[r13] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r6 = 6
            r3.b(r6, r5, r4)
            b.l.a.d.a.b.g0 r3 = new b.l.a.d.a.b.g0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f4525g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r13] = r5
            java.lang.String r5 = r2.f4524e
            r4[r11] = r5
            java.lang.String r5 = r2.f4647b
            r4[r10] = r5
            int r5 = r2.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r12] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.f0.a(b.l.a.d.a.b.e0):void");
    }

    public final File b(e0 e0Var) {
        File k2 = this.f4537b.k(e0Var.f4647b, e0Var.c, e0Var.d, e0Var.f4524e);
        if (!k2.exists()) {
            k2.mkdirs();
        }
        return k2;
    }
}
