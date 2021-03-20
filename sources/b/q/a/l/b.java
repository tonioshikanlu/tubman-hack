package b.q.a.l;

import java.io.InputStream;
import java.nio.charset.Charset;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6813b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final a a;

    public interface a {
    }

    /* renamed from: b.q.a.l.b$b  reason: collision with other inner class name */
    public static class C0118b implements a {
        public final InputStream a;

        public C0118b(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a() {
            return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
        }
    }

    public b(InputStream inputStream) {
        this.a = new C0118b(inputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        android.util.Log.d("ImageHeaderParser", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a() {
        /*
            r18 = this;
            r0 = r18
            b.q.a.l.b$a r1 = r0.a
            b.q.a.l.b$b r1 = (b.q.a.l.b.C0118b) r1
            int r1 = r1.a()
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            r4 = 18761(0x4949, float:2.629E-41)
            r5 = 19789(0x4d4d, float:2.773E-41)
            r6 = 1
            if (r3 == r2) goto L_0x001d
            if (r1 == r5) goto L_0x001d
            if (r1 != r4) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = 0
            goto L_0x001e
        L_0x001d:
            r2 = r6
        L_0x001e:
            r3 = 3
            r4 = -1
            java.lang.String r7 = "ImageHeaderParser"
            if (r2 != 0) goto L_0x003f
            boolean r2 = android.util.Log.isLoggable(r7, r3)
            if (r2 == 0) goto L_0x003e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parser doesn't handle magic number: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.d(r7, r1)
        L_0x003e:
            return r4
        L_0x003f:
            b.q.a.l.b$a r1 = r0.a
            b.q.a.l.b$b r1 = (b.q.a.l.b.C0118b) r1
            java.io.InputStream r1 = r1.a
            int r1 = r1.read()
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            short r1 = (short) r1
            if (r1 == r2) goto L_0x005d
            boolean r2 = android.util.Log.isLoggable(r7, r3)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r2 = "Unknown segmentId="
            java.lang.String r1 = b.e.a.a.a.g(r2, r1)
            goto L_0x00d2
        L_0x005d:
            b.q.a.l.b$a r1 = r0.a
            b.q.a.l.b$b r1 = (b.q.a.l.b.C0118b) r1
            java.io.InputStream r1 = r1.a
            int r1 = r1.read()
            r1 = r1 & r2
            short r1 = (short) r1
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L_0x006e
            goto L_0x00d5
        L_0x006e:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L_0x007b
            boolean r1 = android.util.Log.isLoggable(r7, r3)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = "Found MARKER_EOI in exif segment"
            goto L_0x00d2
        L_0x007b:
            b.q.a.l.b$a r2 = r0.a
            b.q.a.l.b$b r2 = (b.q.a.l.b.C0118b) r2
            int r2 = r2.a()
            int r2 = r2 + -2
            r8 = 225(0xe1, float:3.15E-43)
            if (r1 == r8) goto L_0x00d6
            b.q.a.l.b$a r8 = r0.a
            long r9 = (long) r2
            b.q.a.l.b$b r8 = (b.q.a.l.b.C0118b) r8
            java.util.Objects.requireNonNull(r8)
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0098
            goto L_0x00b7
        L_0x0098:
            r13 = r9
        L_0x0099:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b5
            java.io.InputStream r15 = r8.a
            long r15 = r15.skip(r13)
            int r17 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r17 <= 0) goto L_0x00a8
            goto L_0x00b3
        L_0x00a8:
            java.io.InputStream r15 = r8.a
            int r15 = r15.read()
            if (r15 != r4) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            r15 = 1
        L_0x00b3:
            long r13 = r13 - r15
            goto L_0x0099
        L_0x00b5:
            long r11 = r9 - r13
        L_0x00b7:
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x003f
            boolean r8 = android.util.Log.isLoggable(r7, r3)
            if (r8 == 0) goto L_0x00d5
            java.lang.String r8 = "Unable to skip enough data, type: "
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r10 = ", but actually skipped: "
            java.lang.StringBuilder r1 = b.e.a.a.a.A(r8, r1, r9, r2, r10)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
        L_0x00d2:
            android.util.Log.d(r7, r1)
        L_0x00d5:
            r2 = r4
        L_0x00d6:
            if (r2 != r4) goto L_0x00e4
            boolean r1 = android.util.Log.isLoggable(r7, r3)
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = "Failed to parse exif segment length, or exif segment not found"
            android.util.Log.d(r7, r1)
        L_0x00e3:
            return r4
        L_0x00e4:
            byte[] r1 = new byte[r2]
            b.q.a.l.b$a r8 = r0.a
            b.q.a.l.b$b r8 = (b.q.a.l.b.C0118b) r8
            java.util.Objects.requireNonNull(r8)
            r9 = r2
        L_0x00ee:
            if (r9 <= 0) goto L_0x00fc
            java.io.InputStream r10 = r8.a
            int r11 = r2 - r9
            int r10 = r10.read(r1, r11, r9)
            if (r10 == r4) goto L_0x00fc
            int r9 = r9 - r10
            goto L_0x00ee
        L_0x00fc:
            int r8 = r2 - r9
            if (r8 == r2) goto L_0x0110
            boolean r1 = android.util.Log.isLoggable(r7, r3)
            if (r1 == 0) goto L_0x023b
            java.lang.String r1 = "Unable to read exif segment data, length: "
            java.lang.String r3 = ", actually read: "
            java.lang.String r1 = b.e.a.a.a.i(r1, r2, r3, r8)
            goto L_0x0238
        L_0x0110:
            byte[] r8 = f6813b
            int r8 = r8.length
            if (r2 <= r8) goto L_0x0117
            r8 = r6
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 == 0) goto L_0x012b
            r9 = 0
        L_0x011b:
            byte[] r10 = f6813b
            int r11 = r10.length
            if (r9 >= r11) goto L_0x012b
            byte r11 = r1[r9]
            byte r10 = r10[r9]
            if (r11 == r10) goto L_0x0128
            r8 = 0
            goto L_0x012b
        L_0x0128:
            int r9 = r9 + 1
            goto L_0x011b
        L_0x012b:
            if (r8 == 0) goto L_0x0230
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r8)
            java.nio.Buffer r1 = r1.limit(r2)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r2 = 6
            short r9 = r1.getShort(r2)
            if (r9 != r5) goto L_0x0145
            goto L_0x0166
        L_0x0145:
            r5 = 18761(0x4949, float:2.629E-41)
            if (r9 != r5) goto L_0x014c
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L_0x0166
        L_0x014c:
            boolean r5 = android.util.Log.isLoggable(r7, r3)
            if (r5 == 0) goto L_0x0166
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "Unknown endianness = "
            r5.append(r10)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r7, r5)
        L_0x0166:
            r1.order(r8)
            r5 = 10
            int r5 = r1.getInt(r5)
            int r5 = r5 + r2
            short r2 = r1.getShort(r5)
            r8 = 0
        L_0x0175:
            if (r8 >= r2) goto L_0x023b
            int r9 = r5 + 2
            int r10 = r8 * 12
            int r10 = r10 + r9
            short r9 = r1.getShort(r10)
            r11 = 274(0x112, float:3.84E-43)
            if (r9 == r11) goto L_0x0186
            goto L_0x022c
        L_0x0186:
            int r11 = r10 + 2
            short r11 = r1.getShort(r11)
            if (r11 < r6) goto L_0x0212
            r12 = 12
            if (r11 <= r12) goto L_0x0194
            goto L_0x0212
        L_0x0194:
            int r12 = r10 + 4
            int r12 = r1.getInt(r12)
            if (r12 >= 0) goto L_0x01a6
            boolean r9 = android.util.Log.isLoggable(r7, r3)
            if (r9 == 0) goto L_0x022c
            java.lang.String r9 = "Negative tiff component count"
            goto L_0x0229
        L_0x01a6:
            boolean r13 = android.util.Log.isLoggable(r7, r3)
            java.lang.String r14 = " tagType="
            if (r13 == 0) goto L_0x01c8
            java.lang.String r13 = "Got tagIndex="
            java.lang.String r15 = " formatCode="
            java.lang.StringBuilder r13 = b.e.a.a.a.A(r13, r8, r14, r9, r15)
            r13.append(r11)
            java.lang.String r15 = " componentCount="
            r13.append(r15)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r7, r13)
        L_0x01c8:
            int[] r13 = c
            r13 = r13[r11]
            int r12 = r12 + r13
            r13 = 4
            if (r12 <= r13) goto L_0x01de
            boolean r9 = android.util.Log.isLoggable(r7, r3)
            if (r9 == 0) goto L_0x022c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Got byte count > 4, not orientation, continuing, formatCode="
            goto L_0x021f
        L_0x01de:
            int r10 = r10 + 8
            if (r10 < 0) goto L_0x0205
            int r11 = r1.remaining()
            if (r10 <= r11) goto L_0x01e9
            goto L_0x0205
        L_0x01e9:
            if (r12 < 0) goto L_0x01f8
            int r12 = r12 + r10
            int r11 = r1.remaining()
            if (r12 <= r11) goto L_0x01f3
            goto L_0x01f8
        L_0x01f3:
            short r4 = r1.getShort(r10)
            goto L_0x023b
        L_0x01f8:
            boolean r10 = android.util.Log.isLoggable(r7, r3)
            if (r10 == 0) goto L_0x022c
            java.lang.String r10 = "Illegal number of bytes for TI tag data tagType="
            java.lang.String r9 = b.e.a.a.a.g(r10, r9)
            goto L_0x0229
        L_0x0205:
            boolean r11 = android.util.Log.isLoggable(r7, r3)
            if (r11 == 0) goto L_0x022c
            java.lang.String r11 = "Illegal tagValueOffset="
            java.lang.String r9 = b.e.a.a.a.i(r11, r10, r14, r9)
            goto L_0x0229
        L_0x0212:
            boolean r9 = android.util.Log.isLoggable(r7, r3)
            if (r9 == 0) goto L_0x022c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Got invalid format code = "
        L_0x021f:
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
        L_0x0229:
            android.util.Log.d(r7, r9)
        L_0x022c:
            int r8 = r8 + 1
            goto L_0x0175
        L_0x0230:
            boolean r1 = android.util.Log.isLoggable(r7, r3)
            if (r1 == 0) goto L_0x023b
            java.lang.String r1 = "Missing jpeg exif preamble"
        L_0x0238:
            android.util.Log.d(r7, r1)
        L_0x023b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.l.b.a():int");
    }
}
