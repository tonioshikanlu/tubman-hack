package b.h.a.m.x.c;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

public final class k implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f857b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a(byte[] bArr, int i2) {
            int min = Math.min(i2, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        public short b() {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & ExifInterface.MARKER);
            }
            throw new c.a();
        }

        public int c() {
            return (b() << 8) | b();
        }

        public long skip(long j2) {
            int min = (int) Math.min((long) this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            if (this.a.remaining() - i2 >= 2) {
                return this.a.getShort(i2);
            }
            return -1;
        }

        public int b(int i2) {
            if (this.a.remaining() - i2 >= 4) {
                return this.a.getInt(i2);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(byte[] bArr, int i2);

        short b();

        int c();

        long skip(long j2);
    }

    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a(byte[] bArr, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 != 0 || i4 != -1) {
                return i3;
            }
            throw new c.a();
        }

        public short b() {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public int c() {
            return (b() << 8) | b();
        }

        public long skip(long j2) {
            if (j2 < 0) {
                return 0;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }
    }

    @NonNull
    public ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    public int b(@NonNull InputStream inputStream, @NonNull b.h.a.m.v.c0.b bVar) {
        String str;
        byte[] bArr;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int c2 = dVar.c();
            if ((c2 & 65496) == 65496 || c2 == 19789 || c2 == 18761) {
                int e2 = e(dVar);
                if (e2 != -1) {
                    bArr = (byte[]) bVar.e(e2, byte[].class);
                    int f = f(dVar, bArr, e2);
                    bVar.d(bArr);
                    return f;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    str = "Failed to parse exif segment length, or exif segment not found";
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                str = "Parser doesn't handle magic number: " + c2;
            }
            Log.d("DfltImageHeaderParser", str);
            return -1;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.d(bArr);
            throw th;
        }
    }

    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return d(new d(inputStream));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType d(b.h.a.m.x.c.k.c r6) {
        /*
            r5 = this;
            int r0 = r6.c()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.c()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.c()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.k.d(b.h.a.m.x.c.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final int e(c cVar) {
        short b2;
        int c2;
        long j2;
        long skip;
        do {
            short b3 = cVar.b();
            if (b3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + b3);
                }
                return -1;
            }
            b2 = cVar.b();
            if (b2 == 218) {
                return -1;
            }
            if (b2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            c2 = cVar.c() - 2;
            if (b2 == 225) {
                return c2;
            }
            j2 = (long) c2;
            skip = cVar.skip(j2);
        } while (skip == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder A = b.e.a.a.a.A("Unable to skip enough data, type: ", b2, ", wanted to skip: ", c2, ", but actually skipped: ");
            A.append(skip);
            Log.d("DfltImageHeaderParser", A.toString());
        }
        return -1;
    }

    public final int f(c cVar, byte[] bArr, int i2) {
        ByteOrder byteOrder;
        String str;
        String str2;
        StringBuilder sb;
        int a2 = cVar.a(bArr, i2);
        if (a2 != i2) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + a2);
            }
            return -1;
        }
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i2);
            short a3 = bVar.a(6);
            if (a3 != 18761) {
                if (a3 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a3);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            bVar.a.order(byteOrder);
            int b2 = bVar.b(10) + 6;
            short a4 = bVar.a(b2);
            for (int i4 = 0; i4 < a4; i4++) {
                int i5 = (i4 * 12) + b2 + 2;
                short a5 = bVar.a(i5);
                if (a5 == 274) {
                    short a6 = bVar.a(i5 + 2);
                    if (a6 >= 1 && a6 <= 12) {
                        int b3 = bVar.b(i5 + 4);
                        if (b3 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder A = b.e.a.a.a.A("Got tagIndex=", i4, " tagType=", a5, " formatCode=");
                                A.append(a6);
                                A.append(" componentCount=");
                                A.append(b3);
                                Log.d("DfltImageHeaderParser", A.toString());
                            }
                            int i6 = b3 + f857b[a6];
                            if (i6 <= 4) {
                                int i7 = i5 + 8;
                                if (i7 < 0 || i7 > bVar.a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = b.e.a.a.a.i("Illegal tagValueOffset=", i7, " tagType=", a5);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                } else if (i6 >= 0 && i6 + i7 <= bVar.a.remaining()) {
                                    return bVar.a(i7);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        str = b.e.a.a.a.g("Illegal number of bytes for TI tag data tagType=", a5);
                                        Log.d("DfltImageHeaderParser", str);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb = new StringBuilder();
                                str2 = "Got byte count > 4, not orientation, continuing, formatCode=";
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            str = "Negative tiff component count";
                            Log.d("DfltImageHeaderParser", str);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb = new StringBuilder();
                        str2 = "Got invalid format code = ";
                    }
                    sb.append(str2);
                    sb.append(a6);
                    str = sb.toString();
                    Log.d("DfltImageHeaderParser", str);
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
