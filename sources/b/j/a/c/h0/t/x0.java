package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.j0.z;
import b.j.a.c.y;
import java.util.UUID;

public class x0 extends r0<UUID> {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f2149j = "0123456789abcdef".toCharArray();

    public x0() {
        super(UUID.class);
    }

    public static final void q(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 24);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >> 16);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >> 8);
        bArr[i5 + 1] = (byte) i2;
    }

    public static void r(int i2, char[] cArr, int i3) {
        char[] cArr2 = f2149j;
        cArr[i3] = cArr2[(i2 >> 12) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i2 >> 8) & 15];
        int i5 = i4 + 1;
        cArr[i5] = cArr2[(i2 >> 4) & 15];
        cArr[i5 + 1] = cArr2[i2 & 15];
    }

    public boolean d(y yVar, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    public void f(Object obj, f fVar, y yVar) {
        UUID uuid = (UUID) obj;
        if (!fVar.e() || (fVar instanceof z)) {
            char[] cArr = new char[36];
            long mostSignificantBits = uuid.getMostSignificantBits();
            int i2 = (int) (mostSignificantBits >> 32);
            r(i2 >> 16, cArr, 0);
            r(i2, cArr, 4);
            cArr[8] = '-';
            int i3 = (int) mostSignificantBits;
            r(i3 >>> 16, cArr, 9);
            cArr[13] = '-';
            r(i3, cArr, 14);
            cArr[18] = '-';
            long leastSignificantBits = uuid.getLeastSignificantBits();
            r((int) (leastSignificantBits >>> 48), cArr, 19);
            cArr[23] = '-';
            r((int) (leastSignificantBits >>> 32), cArr, 24);
            int i4 = (int) leastSignificantBits;
            r(i4 >> 16, cArr, 28);
            r(i4, cArr, 32);
            fVar.R0(cArr, 0, 36);
            return;
        }
        byte[] bArr = new byte[16];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        q((int) (mostSignificantBits2 >> 32), bArr, 0);
        q((int) mostSignificantBits2, bArr, 4);
        q((int) (leastSignificantBits2 >> 32), bArr, 8);
        q((int) leastSignificantBits2, bArr, 12);
        fVar.n0(bArr);
    }
}
