package n.m0.j;

import b.e.a.a.a;
import e.x.c.i;
import n.m0.c;
import o.h;

public final class e {
    public static final h a = h.f10456l.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10286b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f10287e = new e();

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            i.d(binaryString, "Integer.toBinaryString(it)");
            strArr[i2] = e.c0.h.v(c.i("%8s", binaryString), ' ', '0', false, 4);
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = c;
            strArr3[i4 | 8] = i.k(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + "|" + strArr5[i6];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i8]);
                sb.append("|");
                strArr5[i9 | 8] = a.q(sb, strArr5[i6], "|PADDED");
            }
        }
        int length = c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = c;
            if (strArr6[i10] == null) {
                strArr6[i10] = d[i10];
            }
        }
    }

    public final String a(int i2) {
        String[] strArr = f10286b;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return c.i("0x%02x", Integer.valueOf(i2));
    }

    public final String b(boolean z, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        String str3;
        String str4;
        String a2 = a(i4);
        if (i5 == 0) {
            str = "";
        } else {
            if (!(i4 == 2 || i4 == 3)) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : d[i5];
                } else if (!(i4 == 7 || i4 == 8)) {
                    String[] strArr = c;
                    if (i5 < strArr.length) {
                        str2 = strArr[i5];
                        i.c(str2);
                    } else {
                        str2 = d[i5];
                    }
                    if (i4 == 5 && (i5 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i4 != 0 || (i5 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = e.c0.h.w(str2, str4, str3, false, 4);
                }
            }
            str = d[i5];
        }
        return c.i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), a2, str);
    }
}
