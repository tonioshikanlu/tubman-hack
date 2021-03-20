package okhttp3.internal.publicsuffix;

import androidx.exifinterface.media.ExifInterface;
import e.c0.h;
import e.t.g;
import e.x.c.i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10496e = {(byte) 42};
    public static final List<String> f = b.q.a.a.l2("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f10497g = new PublicSuffixDatabase();

    /* renamed from: h  reason: collision with root package name */
    public static final a f10498h = new a((DefaultConstructorMarker) null);
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f10499b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final String a(a aVar, byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            byte b2;
            int i4;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr3[i6] != ((byte) 10)) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i3 = i7 + i8;
                    if (bArr3[i3] == ((byte) 10)) {
                        break;
                    }
                    i8++;
                }
                int i9 = i3 - i7;
                int i10 = i2;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        b2 = 46;
                        z = false;
                    } else {
                        byte b3 = bArr4[i10][i11];
                        byte[] bArr5 = c.a;
                        byte b4 = b3 & ExifInterface.MARKER;
                        z = z2;
                        b2 = b4;
                    }
                    byte b5 = bArr3[i7 + i12];
                    byte[] bArr6 = c.a;
                    i4 = b2 - (b5 & ExifInterface.MARKER);
                    if (i4 == 0) {
                        i12++;
                        i11++;
                        if (i12 == i9) {
                            break;
                        } else if (bArr4[i10].length != i11) {
                            z2 = z;
                        } else if (i10 == bArr4.length - 1) {
                            break;
                        } else {
                            i10++;
                            i11 = -1;
                            z2 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i13 = i9 - i12;
                        int length2 = bArr4[i10].length - i11;
                        int length3 = bArr4.length;
                        for (int i14 = i10 + 1; i14 < length3; i14++) {
                            length2 += bArr4[i14].length;
                        }
                        if (length2 >= i13) {
                            if (length2 <= i13) {
                                Charset charset = StandardCharsets.UTF_8;
                                i.d(charset, "UTF_8");
                                return new String(bArr3, i7, i9, charset);
                            }
                        }
                    }
                    i5 = i3 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3 == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0149 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "domain"
            e.x.c.i.e(r15, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r15)
            java.lang.String r1 = "unicodeDomain"
            e.x.c.i.d(r0, r1)
            java.util.List r0 = r14.c(r0)
            e.t.o r1 = e.t.o.f7934h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r2 = f10498h
            java.util.concurrent.atomic.AtomicBoolean r3 = r14.a
            boolean r3 = r3.get()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0055
            java.util.concurrent.atomic.AtomicBoolean r3 = r14.a
            boolean r3 = r3.compareAndSet(r4, r5)
            if (r3 == 0) goto L_0x0055
            r3 = r4
        L_0x0029:
            r14.b()     // Catch:{ InterruptedIOException -> 0x0046, IOException -> 0x0031 }
            if (r3 == 0) goto L_0x0062
            goto L_0x003e
        L_0x002f:
            r15 = move-exception
            goto L_0x004b
        L_0x0031:
            r6 = move-exception
            n.m0.k.h$a r7 = n.m0.k.h.c     // Catch:{ all -> 0x002f }
            n.m0.k.h r7 = n.m0.k.h.a     // Catch:{ all -> 0x002f }
            java.lang.String r8 = "Failed to read public suffix list"
            r9 = 5
            r7.i(r8, r9, r6)     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0062
        L_0x003e:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x0062
        L_0x0046:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002f }
            r3 = r5
            goto L_0x0029
        L_0x004b:
            if (r3 == 0) goto L_0x0054
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0054:
            throw r15
        L_0x0055:
            java.util.concurrent.CountDownLatch r3 = r14.f10499b     // Catch:{ InterruptedException -> 0x005b }
            r3.await()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0062
        L_0x005b:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L_0x0062:
            byte[] r3 = r14.c
            if (r3 == 0) goto L_0x0068
            r3 = r5
            goto L_0x0069
        L_0x0068:
            r3 = r4
        L_0x0069:
            if (r3 == 0) goto L_0x017b
            int r3 = r0.size()
            byte[][] r6 = new byte[r3][]
            r7 = r4
        L_0x0072:
            if (r7 >= r3) goto L_0x0094
            java.lang.Object r8 = r0.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = "UTF_8"
            e.x.c.i.d(r9, r10)
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r8, r10)
            byte[] r8 = r8.getBytes(r9)
            java.lang.String r9 = "(this as java.lang.String).getBytes(charset)"
            e.x.c.i.d(r8, r9)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x0072
        L_0x0094:
            r7 = r4
        L_0x0095:
            java.lang.String r8 = "publicSuffixListBytes"
            r9 = 0
            if (r7 >= r3) goto L_0x00ac
            byte[] r10 = r14.c
            if (r10 == 0) goto L_0x00a8
            java.lang.String r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r2, r10, r6, r7)
            if (r10 == 0) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00a8:
            e.x.c.i.m(r8)
            throw r9
        L_0x00ac:
            r10 = r9
        L_0x00ad:
            if (r3 <= r5) goto L_0x00d0
            java.lang.Object r7 = r6.clone()
            byte[][] r7 = (byte[][]) r7
            int r11 = r7.length
            int r11 = r11 - r5
            r12 = r4
        L_0x00b8:
            if (r12 >= r11) goto L_0x00d0
            byte[] r13 = f10496e
            r7[r12] = r13
            byte[] r13 = r14.c
            if (r13 == 0) goto L_0x00cc
            java.lang.String r13 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r2, r13, r7, r12)
            if (r13 == 0) goto L_0x00c9
            goto L_0x00d1
        L_0x00c9:
            int r12 = r12 + 1
            goto L_0x00b8
        L_0x00cc:
            e.x.c.i.m(r8)
            throw r9
        L_0x00d0:
            r13 = r9
        L_0x00d1:
            if (r13 == 0) goto L_0x00eb
            int r3 = r3 - r5
            r7 = r4
        L_0x00d5:
            if (r7 >= r3) goto L_0x00eb
            byte[] r8 = r14.d
            if (r8 == 0) goto L_0x00e5
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r2, r8, r6, r7)
            if (r8 == 0) goto L_0x00e2
            goto L_0x00ec
        L_0x00e2:
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00e5:
            java.lang.String r15 = "publicSuffixExceptionListBytes"
            e.x.c.i.m(r15)
            throw r9
        L_0x00eb:
            r8 = r9
        L_0x00ec:
            r2 = 6
            r3 = 46
            r6 = 33
            if (r8 == 0) goto L_0x010b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            char[] r7 = new char[r5]
            r7[r4] = r3
            java.util.List r1 = e.c0.h.x(r1, r7, r4, r4, r2)
            goto L_0x0133
        L_0x010b:
            if (r10 != 0) goto L_0x0112
            if (r13 != 0) goto L_0x0112
            java.util.List<java.lang.String> r1 = f
            goto L_0x0133
        L_0x0112:
            if (r10 == 0) goto L_0x011d
            char[] r7 = new char[r5]
            r7[r4] = r3
            java.util.List r7 = e.c0.h.x(r10, r7, r4, r4, r2)
            goto L_0x011e
        L_0x011d:
            r7 = r1
        L_0x011e:
            if (r13 == 0) goto L_0x0128
            char[] r1 = new char[r5]
            r1[r4] = r3
            java.util.List r1 = e.c0.h.x(r13, r1, r4, r4, r2)
        L_0x0128:
            int r2 = r7.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x0133
            r1 = r7
        L_0x0133:
            int r2 = r0.size()
            int r3 = r1.size()
            if (r2 != r3) goto L_0x014a
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r4)
            if (r2 == r6) goto L_0x014a
            return r9
        L_0x014a:
            java.lang.Object r2 = r1.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r4)
            int r0 = r0.size()
            int r1 = r1.size()
            if (r2 != r6) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            int r1 = r1 + r5
        L_0x0160:
            int r0 = r0 - r1
            java.util.List r15 = r14.c(r15)
            e.b0.h r15 = e.t.g.d(r15)
            e.b0.h r1 = e.b0.s.b(r15, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            java.lang.String r2 = "."
            java.lang.String r15 = e.b0.s.f(r1, r2, r3, r4, r5, r6, r7, r8)
            return r15
        L_0x017b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        b.q.a.a.A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0049
            o.m r1 = new o.m
            o.z r0 = e.a.a.a.y0.m.o1.c.f0(r0)
            r1.<init>(r0)
            o.g r0 = e.a.a.a.y0.m.o1.c.m(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            byte[] r2 = r0.G(r2)     // Catch:{ all -> 0x0042 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r3 = (long) r3     // Catch:{ all -> 0x0042 }
            byte[] r3 = r0.G(r3)     // Catch:{ all -> 0x0042 }
            b.q.a.a.A(r0, r1)
            monitor-enter(r5)
            e.x.c.i.c(r2)     // Catch:{ all -> 0x003f }
            r5.c = r2     // Catch:{ all -> 0x003f }
            e.x.c.i.c(r3)     // Catch:{ all -> 0x003f }
            r5.d = r3     // Catch:{ all -> 0x003f }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f10499b
            r0.countDown()
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            b.q.a.a.A(r0, r1)
            throw r2
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }

    public final List<String> c(String str) {
        List<String> x = h.x(str, new char[]{'.'}, false, 0, 6);
        return i.a((String) g.z(x), "") ? g.l(x, 1) : x;
    }
}
