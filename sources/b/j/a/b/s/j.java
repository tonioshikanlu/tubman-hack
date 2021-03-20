package b.j.a.b.s;

import b.e.a.a.a;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.Reader;

public class j extends Reader {

    /* renamed from: h  reason: collision with root package name */
    public final b f1488h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f1489i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f1490j;

    /* renamed from: k  reason: collision with root package name */
    public int f1491k;

    /* renamed from: l  reason: collision with root package name */
    public int f1492l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1493m;

    /* renamed from: n  reason: collision with root package name */
    public char f1494n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f1495o;

    /* renamed from: p  reason: collision with root package name */
    public int f1496p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1497q;
    public char[] r;

    public j(b bVar, InputStream inputStream, byte[] bArr, int i2, int i3, boolean z) {
        boolean z2 = false;
        this.f1488h = bVar;
        this.f1489i = inputStream;
        this.f1490j = bArr;
        this.f1491k = i2;
        this.f1492l = i3;
        this.f1493m = z;
        this.f1497q = inputStream != null ? true : z2;
    }

    public final void b() {
        byte[] bArr = this.f1490j;
        if (bArr != null) {
            this.f1490j = null;
            this.f1488h.f(bArr);
        }
    }

    public void close() {
        InputStream inputStream = this.f1489i;
        if (inputStream != null) {
            this.f1489i = null;
            b();
            inputStream.close();
        }
    }

    public final void e(int i2, int i3) {
        int i4 = this.f1496p + i2;
        int i5 = this.f1495o;
        StringBuilder A = a.A("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i2, ", needed ", i3, ", at char #");
        A.append(i5);
        A.append(", byte #");
        A.append(i4);
        A.append(")");
        throw new CharConversionException(A.toString());
    }

    public int read() {
        if (this.r == null) {
            this.r = new char[1];
        }
        if (read(this.r, 0, 1) < 1) {
            return -1;
        }
        return this.r[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r13, int r14, int r15) {
        /*
            r12 = this;
            byte[] r0 = r12.f1490j
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 1
            if (r15 >= r2) goto L_0x000a
            return r15
        L_0x000a:
            if (r14 < 0) goto L_0x0164
            int r3 = r14 + r15
            int r4 = r13.length
            if (r3 > r4) goto L_0x0164
            char r15 = r12.f1494n
            r4 = 0
            r5 = 4
            if (r15 == 0) goto L_0x001f
            int r0 = r14 + 1
            r13[r14] = r15
            r12.f1494n = r4
            goto L_0x009d
        L_0x001f:
            int r15 = r12.f1492l
            int r6 = r12.f1491k
            int r7 = r15 - r6
            if (r7 >= r5) goto L_0x009c
            int r8 = r12.f1496p
            int r15 = r15 - r7
            int r15 = r15 + r8
            r12.f1496p = r15
            java.lang.String r15 = "Strange I/O stream, returned 0 bytes on read"
            r8 = 0
            if (r7 <= 0) goto L_0x003b
            if (r6 <= 0) goto L_0x0039
            java.lang.System.arraycopy(r0, r6, r0, r4, r7)
            r12.f1491k = r4
        L_0x0039:
            r0 = r7
            goto L_0x005c
        L_0x003b:
            r12.f1491k = r4
            java.io.InputStream r6 = r12.f1489i
            if (r6 != 0) goto L_0x0043
            r0 = r1
            goto L_0x0047
        L_0x0043:
            int r0 = r6.read(r0)
        L_0x0047:
            if (r0 >= r2) goto L_0x005c
            r12.f1492l = r4
            if (r0 >= 0) goto L_0x0056
            boolean r15 = r12.f1497q
            if (r15 == 0) goto L_0x0054
            r12.b()
        L_0x0054:
            r15 = r4
            goto L_0x008e
        L_0x0056:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x005c:
            r12.f1492l = r0
        L_0x005e:
            int r0 = r12.f1492l
            if (r0 >= r5) goto L_0x008d
            java.io.InputStream r6 = r12.f1489i
            if (r6 != 0) goto L_0x0068
            r0 = r1
            goto L_0x0070
        L_0x0068:
            byte[] r9 = r12.f1490j
            int r10 = r9.length
            int r10 = r10 - r0
            int r0 = r6.read(r9, r0, r10)
        L_0x0070:
            if (r0 >= r2) goto L_0x0087
            if (r0 >= 0) goto L_0x0081
            boolean r13 = r12.f1497q
            if (r13 == 0) goto L_0x007b
            r12.b()
        L_0x007b:
            int r13 = r12.f1492l
            r12.e(r13, r5)
            throw r8
        L_0x0081:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r15)
            throw r13
        L_0x0087:
            int r6 = r12.f1492l
            int r6 = r6 + r0
            r12.f1492l = r6
            goto L_0x005e
        L_0x008d:
            r15 = r2
        L_0x008e:
            if (r15 != 0) goto L_0x009c
            if (r7 != 0) goto L_0x0093
            return r1
        L_0x0093:
            int r13 = r12.f1492l
            int r14 = r12.f1491k
            int r13 = r13 - r14
            r12.e(r13, r5)
            throw r8
        L_0x009c:
            r0 = r14
        L_0x009d:
            int r15 = r12.f1492l
            int r15 = r15 - r5
        L_0x00a0:
            if (r0 >= r3) goto L_0x015d
            int r5 = r12.f1491k
            boolean r6 = r12.f1493m
            if (r6 == 0) goto L_0x00c5
            byte[] r6 = r12.f1490j
            byte r7 = r6[r5]
            int r7 = r7 << 8
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r9 = r5 + 3
            byte r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            goto L_0x00e4
        L_0x00c5:
            byte[] r6 = r12.f1490j
            byte r7 = r6[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r5 + 2
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r5 + 3
            byte r6 = r6[r9]
            int r6 = r6 << 8
            r6 = r6 | r8
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x00e4:
            int r5 = r5 + 4
            r12.f1491k = r5
            if (r7 == 0) goto L_0x0155
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r8 = r7 + -1
            r9 = 16
            int r8 = r8 << r9
            r6 = r6 | r8
            if (r7 > r9) goto L_0x0111
            int r7 = r0 + 1
            r8 = 55296(0xd800, float:7.7486E-41)
            int r9 = r6 >> 10
            int r9 = r9 + r8
            char r8 = (char) r9
            r13[r0] = r8
            r0 = 56320(0xdc00, float:7.8921E-41)
            r8 = r6 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r8
            if (r7 < r3) goto L_0x010e
            char r13 = (char) r6
            r12.f1494n = r13
            r0 = r7
            goto L_0x015d
        L_0x010e:
            r6 = r0
            r0 = r7
            goto L_0x0155
        L_0x0111:
            int r0 = r0 - r14
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r14 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r4] = r14
            java.lang.String r14 = " (above 0x%08x)"
            java.lang.String r13 = java.lang.String.format(r14, r13)
            int r14 = r12.f1496p
            int r15 = r12.f1491k
            int r14 = r14 + r15
            int r14 = r14 + r1
            int r15 = r12.f1495o
            int r15 = r15 + r0
            java.io.CharConversionException r0 = new java.io.CharConversionException
            java.lang.String r1 = "Invalid UTF-32 character 0x"
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r6)
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " at char #"
            r1.append(r13)
            r1.append(r15)
            java.lang.String r13 = ", byte #"
            r1.append(r13)
            java.lang.String r13 = ")"
            java.lang.String r13 = b.e.a.a.a.o(r1, r14, r13)
            r0.<init>(r13)
            throw r0
        L_0x0155:
            int r7 = r0 + 1
            char r6 = (char) r6
            r13[r0] = r6
            r0 = r7
            if (r5 <= r15) goto L_0x00a0
        L_0x015d:
            int r0 = r0 - r14
            int r13 = r12.f1495o
            int r13 = r13 + r0
            r12.f1495o = r13
            return r0
        L_0x0164:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "read(buf,"
            java.lang.String r2 = ","
            java.lang.String r3 = "), cbuf["
            java.lang.StringBuilder r14 = b.e.a.a.a.A(r1, r14, r2, r15, r3)
            int r13 = r13.length
            java.lang.String r15 = "]"
            java.lang.String r13 = b.e.a.a.a.o(r14, r13, r15)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.s.j.read(char[], int, int):int");
    }
}
