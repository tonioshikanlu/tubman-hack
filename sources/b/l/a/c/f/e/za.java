package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public abstract class za implements nb {
    public static final int[] c = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    public int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3436b;

    public za(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.a = i(bArr);
            this.f3436b = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void g(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i2 = 0; i2 < 10; i2++) {
            h(iArr2, 0, 4, 8, 12);
            h(iArr2, 1, 5, 9, 13);
            h(iArr2, 2, 6, 10, 14);
            h(iArr2, 3, 7, 11, 15);
            h(iArr2, 0, 5, 10, 15);
            h(iArr2, 1, 6, 11, 12);
            h(iArr2, 2, 7, 8, 13);
            h(iArr2, 3, 4, 9, 14);
        }
    }

    public static void h(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> -16) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> -12) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> -8) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> -7) | (i16 << 7);
    }

    public static int[] i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public final byte[] a(byte[] bArr) {
        return d(ByteBuffer.wrap(bArr));
    }

    public abstract int[] b(int[] iArr, int i2);

    public abstract int c();

    public final byte[] d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= c()) {
            byte[] bArr = new byte[c()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            int remaining = byteBuffer.remaining();
            int i2 = (remaining / 64) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer e2 = e(bArr, this.f3436b + i3);
                if (i3 == i2 - 1) {
                    a.d2(allocate, byteBuffer, e2, remaining % 64);
                } else {
                    a.d2(allocate, byteBuffer, e2, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final ByteBuffer e(byte[] bArr, int i2) {
        int[] b2 = b(i(bArr), i2);
        int[] iArr = (int[]) b2.clone();
        g(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            b2[i3] = b2[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b2, 0, 16);
        return order;
    }
}
