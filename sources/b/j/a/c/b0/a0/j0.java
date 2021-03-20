package b.j.a.c.b0.a0;

import androidx.exifinterface.media.ExifInterface;
import b.j.a.b.a;
import b.j.a.b.b;
import b.j.a.b.w.c;
import b.j.a.c.g;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class j0 extends m<UUID> {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f1686l;

    static {
        int[] iArr = new int[127];
        f1686l = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < 10; i2++) {
            f1686l[i2 + 48] = i2;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            int[] iArr2 = f1686l;
            int i4 = i3 + 10;
            iArr2[i3 + 97] = i4;
            iArr2[i3 + 65] = i4;
        }
    }

    public j0() {
        super(UUID.class);
    }

    public static int i0(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & ExifInterface.MARKER) | (bArr[i2] << 24) | ((bArr[i2 + 1] & ExifInterface.MARKER) << 16) | ((bArr[i2 + 2] & ExifInterface.MARKER) << 8);
    }

    public static long j0(byte[] bArr, int i2) {
        return ((((long) i0(bArr, i2 + 4)) << 32) >>> 32) | (((long) i0(bArr, i2)) << 32);
    }

    public Object c0(String str, g gVar) {
        if (str.length() != 36) {
            if (str.length() == 24) {
                a aVar = b.f1372b;
                Objects.requireNonNull(aVar);
                c cVar = new c((b.j.a.b.w.a) null, 500);
                aVar.c(str, cVar);
                return h0(cVar.N(), gVar);
            }
            gVar.L(this.f1761h, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        } else if (str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') {
            int m0 = m0(str, 24, gVar);
            return new UUID((((long) l0(str, 0, gVar)) << 32) + ((((long) m0(str, 9, gVar)) << 16) | ((long) m0(str, 14, gVar))), ((((long) l0(str, 28, gVar)) << 32) >>> 32) | (((long) (m0 | (m0(str, 19, gVar) << 16))) << 32));
        } else {
            gVar.L(this.f1761h, str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            throw null;
        }
    }

    public Object d0(Object obj, g gVar) {
        if (obj instanceof byte[]) {
            return h0((byte[]) obj, gVar);
        }
        super.d0(obj, gVar);
        throw null;
    }

    public int g0(String str, g gVar, char c) {
        throw gVar.e0(str, this.f1761h, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c), Integer.toHexString(c)}));
    }

    public final UUID h0(byte[] bArr, g gVar) {
        if (bArr.length == 16) {
            return new UUID(j0(bArr, 0), j0(bArr, 8));
        }
        throw new b.j.a.c.c0.c(gVar.f1996m, b.e.a.a.a.o(b.e.a.a.a.y("Can only construct UUIDs from byte[16]; got "), bArr.length, " bytes"), bArr, this.f1761h);
    }

    public int k0(String str, int i2, g gVar) {
        int i3;
        int[] iArr = f1686l;
        char charAt = str.charAt(i2);
        char charAt2 = str.charAt(i2 + 1);
        if (charAt <= 127 && charAt2 <= 127 && (i3 = (iArr[charAt] << 4) | iArr[charAt2]) >= 0) {
            return i3;
        }
        if (charAt > 127 || iArr[charAt] < 0) {
            g0(str, gVar, charAt);
            throw null;
        }
        g0(str, gVar, charAt2);
        throw null;
    }

    public int l0(String str, int i2, g gVar) {
        return k0(str, i2 + 6, gVar) + (k0(str, i2, gVar) << 24) + (k0(str, i2 + 2, gVar) << 16) + (k0(str, i2 + 4, gVar) << 8);
    }

    public int m0(String str, int i2, g gVar) {
        return k0(str, i2 + 2, gVar) + (k0(str, i2, gVar) << 8);
    }
}
