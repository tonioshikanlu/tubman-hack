package l.b.c;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

public final class h {
    public static final char[] a;

    static {
        char[] cArr = new char[512];
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = "0123456789abcdef".charAt(i2 >>> 4);
            cArr[i2 | 256] = "0123456789abcdef".charAt(i2 & 15);
        }
        a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 16; i3++) {
            bArr["0123456789abcdef".charAt(i3)] = (byte) i3;
        }
    }

    public static void a(byte b2, char[] cArr, int i2) {
        byte b3 = b2 & ExifInterface.MARKER;
        char[] cArr2 = a;
        cArr[i2] = cArr2[b3];
        cArr[i2 + 1] = cArr2[b3 | 256];
    }

    public static void b(long j2, char[] cArr, int i2) {
        a((byte) ((int) ((j2 >> 56) & 255)), cArr, i2);
        a((byte) ((int) ((j2 >> 48) & 255)), cArr, i2 + 2);
        a((byte) ((int) ((j2 >> 40) & 255)), cArr, i2 + 4);
        a((byte) ((int) ((j2 >> 32) & 255)), cArr, i2 + 6);
        a((byte) ((int) ((j2 >> 24) & 255)), cArr, i2 + 8);
        a((byte) ((int) ((j2 >> 16) & 255)), cArr, i2 + 10);
        a((byte) ((int) ((j2 >> 8) & 255)), cArr, i2 + 12);
        a((byte) ((int) (j2 & 255)), cArr, i2 + 14);
    }
}
