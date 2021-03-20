package b.h.a.m.x.c;

import androidx.annotation.NonNull;
import b.h.a.m.v.c0.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class w extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public volatile byte[] f882h;

    /* renamed from: i  reason: collision with root package name */
    public int f883i;

    /* renamed from: j  reason: collision with root package name */
    public int f884j;

    /* renamed from: k  reason: collision with root package name */
    public int f885k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f886l;

    /* renamed from: m  reason: collision with root package name */
    public final b f887m;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(@NonNull InputStream inputStream, @NonNull b bVar) {
        super(inputStream);
        this.f887m = bVar;
        this.f882h = (byte[]) bVar.e(65536, byte[].class);
    }

    public static IOException q() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f882h == null || inputStream == null) {
            q();
            throw null;
        }
        return (this.f883i - this.f886l) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) {
        int i2;
        int i3 = this.f885k;
        if (i3 == -1 || this.f886l - i3 >= (i2 = this.f884j)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f885k = -1;
                this.f886l = 0;
                this.f883i = read;
            }
            return read;
        }
        if (i3 == 0 && i2 > bArr.length && this.f883i == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.f887m.e(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f882h = bArr2;
            this.f887m.d(bArr);
            bArr = bArr2;
        } else if (i3 > 0) {
            System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
        }
        int i4 = this.f886l - this.f885k;
        this.f886l = i4;
        this.f885k = 0;
        this.f883i = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f886l;
        if (read2 > 0) {
            i5 += read2;
        }
        this.f883i = i5;
        return read2;
    }

    public void close() {
        if (this.f882h != null) {
            this.f887m.d(this.f882h);
            this.f882h = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        if (this.f882h != null) {
            this.f887m.d(this.f882h);
            this.f882h = null;
        }
    }

    public synchronized void mark(int i2) {
        this.f884j = Math.max(this.f884j, i2);
        this.f885k = this.f886l;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x0039=Splitter:B:28:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f882h     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f886l     // Catch:{ all -> 0x003d }
            int r4 = r6.f883i     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.b(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f882h     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f882h     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            q()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x0026:
            int r1 = r6.f883i     // Catch:{ all -> 0x003d }
            int r2 = r6.f886l     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f886l = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            q()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.w.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.NonNull byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f882h     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f886l     // Catch:{ all -> 0x008e }
            int r4 = r7.f883i     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f886l     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f886l = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f885k     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.b(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.f882h     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.f882h     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x0063:
            int r4 = r7.f883i     // Catch:{ all -> 0x008e }
            int r5 = r7.f886l     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f886l     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f886l = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008a:
            q()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.w.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f882h != null) {
            int i2 = this.f885k;
            if (-1 != i2) {
                this.f886l = i2;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f886l + " markLimit: " + this.f884j);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0;
        }
        byte[] bArr = this.f882h;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i2 = this.f883i;
                int i3 = this.f886l;
                if (((long) (i2 - i3)) >= j2) {
                    this.f886l = (int) (((long) i3) + j2);
                    return j2;
                }
                long j3 = ((long) i2) - ((long) i3);
                this.f886l = i2;
                if (this.f885k == -1 || j2 > ((long) this.f884j)) {
                    return j3 + inputStream.skip(j2 - j3);
                } else if (b(inputStream, bArr) == -1) {
                    return j3;
                } else {
                    int i4 = this.f883i;
                    int i5 = this.f886l;
                    if (((long) (i4 - i5)) >= j2 - j3) {
                        this.f886l = (int) ((((long) i5) + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + ((long) i4)) - ((long) i5);
                    this.f886l = i4;
                    return j4;
                }
            } else {
                q();
                throw null;
            }
        } else {
            q();
            throw null;
        }
    }
}
