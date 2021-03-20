package b.l.f.b0;

import androidx.exifinterface.media.ExifInterface;
import b.l.f.b0.b.c;
import b.l.f.e;
import b.l.f.h;
import b.l.f.m;
import b.l.f.o;
import b.l.f.q;
import b.l.f.r;
import b.l.f.s;
import b.l.f.y.b;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Objects;

public final class a implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final s[] f5584b = new s[0];
    public final c a = new c();

    public q a(b.l.f.c cVar, Map<e, ?> map) {
        int i2;
        String str;
        StringBuilder sb;
        int i3;
        b a2 = cVar.a();
        int i4 = a2.f5811h;
        int i5 = a2.f5812i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < a2.f5812i; i9++) {
            int i10 = 0;
            while (true) {
                int i11 = a2.f5813j;
                if (i10 >= i11) {
                    break;
                }
                int i12 = a2.f5814k[(i11 * i9) + i10];
                if (i12 != 0) {
                    if (i9 < i5) {
                        i5 = i9;
                    }
                    if (i9 > i8) {
                        i8 = i9;
                    }
                    int i13 = i10 << 5;
                    if (i13 < i4) {
                        int i14 = 0;
                        while ((i12 << (31 - i14)) == 0) {
                            i14++;
                        }
                        int i15 = i14 + i13;
                        if (i15 < i4) {
                            i4 = i15;
                        }
                    }
                    if (i13 + 31 > i7) {
                        int i16 = 31;
                        while ((i12 >>> i16) == 0) {
                            i16--;
                        }
                        int i17 = i13 + i16;
                        if (i17 > i7) {
                            i7 = i17;
                        }
                    }
                }
                i10++;
            }
        }
        int[] iArr = (i7 < i4 || i8 < i5) ? null : new int[]{i4, i5, (i7 - i4) + 1, (i8 - i5) + 1};
        if (iArr != null) {
            int i18 = iArr[0];
            int i19 = iArr[1];
            int i20 = iArr[2];
            int i21 = iArr[3];
            int i22 = (30 + 31) / 32;
            int[] iArr2 = new int[(i22 * 33)];
            for (int i23 = 0; i23 < 33; i23++) {
                int i24 = (((i21 / 2) + (i23 * i21)) / 33) + i19;
                for (int i25 = 0; i25 < 30; i25++) {
                    if (a2.b((((((i23 & 1) * i20) / 2) + ((i20 / 2) + (i25 * i20))) / 30) + i18, i24)) {
                        int i26 = (i25 / 32) + (i23 * i22);
                        iArr2[i26] = (1 << (i25 & 31)) | iArr2[i26];
                    }
                }
            }
            c cVar2 = this.a;
            Objects.requireNonNull(cVar2);
            byte[] bArr = new byte[144];
            for (int i27 = 0; i27 < 33; i27++) {
                int[] iArr3 = b.l.f.b0.b.a.a[i27];
                for (int i28 = 0; i28 < 30; i28++) {
                    int i29 = iArr3[i28];
                    if (i29 >= 0) {
                        if (((iArr2[(i28 / 32) + (i27 * i22)] >>> (i28 & 31)) & 1) != 0) {
                            int i30 = i29 / 6;
                            bArr[i30] = (byte) (((byte) (1 << (5 - (i29 % 6)))) | bArr[i30]);
                        }
                    }
                }
            }
            cVar2.a(bArr, 0, 10, 10, 0);
            byte b2 = bArr[0] & 15;
            if (b2 == 2 || b2 == 3 || b2 == 4) {
                c cVar3 = cVar2;
                byte[] bArr2 = bArr;
                cVar3.a(bArr2, 20, 84, 40, 1);
                cVar3.a(bArr2, 20, 84, 40, 2);
                i2 = 94;
            } else if (b2 == 5) {
                c cVar4 = cVar2;
                byte[] bArr3 = bArr;
                cVar4.a(bArr3, 20, 68, 56, 1);
                cVar4.a(bArr3, 20, 68, 56, 2);
                i2 = 78;
            } else {
                throw h.a();
            }
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, 0, bArr4, 0, 10);
            System.arraycopy(bArr, 20, bArr4, 10, i2 - 10);
            StringBuilder sb2 = new StringBuilder(144);
            if (b2 == 2 || b2 == 3) {
                if (b2 == 2) {
                    str = new DecimalFormat("0000000000".substring(0, b.l.f.b0.b.b.a(bArr4, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32}))).format((long) b.l.f.b0.b.b.a(bArr4, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    String[] strArr = b.l.f.b0.b.b.a;
                    str = String.valueOf(new char[]{strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{39, 40, 41, ExifInterface.START_CODE, 31, 32})), strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(b.l.f.b0.b.b.a(bArr4, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format((long) b.l.f.b0.b.b.a(bArr4, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                String format2 = decimalFormat.format((long) b.l.f.b0.b.b.a(bArr4, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                sb2.append(b.l.f.b0.b.b.b(bArr4, 10, 84));
                if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                    i6 = 9;
                    sb = new StringBuilder();
                } else {
                    sb = new StringBuilder();
                }
                sb.append(str);
                sb.append(29);
                sb.append(format);
                sb.append(29);
                sb.append(format2);
                sb.append(29);
                sb2.insert(i6, sb.toString());
            } else {
                if (b2 == 4) {
                    i3 = 93;
                } else if (b2 == 5) {
                    i3 = 77;
                }
                sb2.append(b.l.f.b0.b.b.b(bArr4, 1, i3));
            }
            String sb3 = sb2.toString();
            String valueOf = String.valueOf(b2);
            q qVar = new q(sb3, bArr4, f5584b, b.l.f.a.MAXICODE);
            if (valueOf != null) {
                qVar.b(r.ERROR_CORRECTION_LEVEL, valueOf);
            }
            return qVar;
        }
        throw m.f5759j;
    }

    public q b(b.l.f.c cVar) {
        return a(cVar, (Map<e, ?>) null);
    }

    public void c() {
    }
}
