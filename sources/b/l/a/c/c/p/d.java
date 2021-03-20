package b.l.a.c.c.p;

import androidx.exifinterface.media.ExifInterface;

public class d {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f2822b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i2 = 0;
        while (i2 < length && (!z || i2 != length - 1 || (bArr[i2] & ExifInterface.MARKER) != 0)) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
            i2++;
        }
        return sb.toString();
    }
}
