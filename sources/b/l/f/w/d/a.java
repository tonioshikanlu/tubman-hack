package b.l.f.w.d;

import androidx.exifinterface.media.ExifInterface;
import b.g.a.e.f.h;
import b.g.a.h.n;
import b.l.a.c.h.f.l;
import b.l.f.p;
import b.l.f.y.b;
import b.l.f.y.e;
import b.l.f.y.l.c;
import b.m.a.j;
import b.m.a.t.i;
import b.m.a.t.k;
import com.google.android.material.badge.BadgeDrawable;
import java.util.Arrays;
import java.util.List;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5777b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", h.f414g, i.f5973b, j.f5920k, k.f5975b, l.a, "m", n.f437k, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f5778e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", " ", "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    public b.l.f.w.a a;

    /* renamed from: b.l.f.w.d.a$a  reason: collision with other inner class name */
    public enum C0098a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static int b(boolean[] zArr, int i2, int i3) {
        int i4 = 0;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 <<= 1;
            if (zArr[i5]) {
                i4 |= 1;
            }
        }
        return i4;
    }

    public e a(b.l.f.w.a aVar) {
        int i2;
        b.l.f.y.l.a aVar2;
        String str;
        b.l.f.w.a aVar3 = aVar;
        this.a = aVar3;
        b bVar = aVar3.a;
        boolean z = aVar3.c;
        int i3 = aVar3.f5776e;
        int i4 = (z ? 11 : 14) + (i3 << 2);
        int[] iArr = new int[i4];
        int i5 = ((z ? 88 : 112) + (i3 << 4)) * i3;
        boolean[] zArr = new boolean[i5];
        int i6 = 2;
        if (z) {
            for (int i7 = 0; i7 < i4; i7++) {
                iArr[i7] = i7;
            }
        } else {
            int i8 = i4 / 2;
            int i9 = ((((i8 - 1) / 15) * 2) + (i4 + 1)) / 2;
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = (i10 / 15) + i10;
                iArr[(i8 - i10) - 1] = (i9 - i11) - 1;
                iArr[i8 + i10] = i11 + i9 + 1;
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i2 = 12;
            if (i12 >= i3) {
                break;
            }
            int i14 = (i3 - i12) << i6;
            if (z) {
                i2 = 9;
            }
            int i15 = i14 + i2;
            int i16 = i12 << 1;
            int i17 = (i4 - 1) - i16;
            int i18 = 0;
            while (i18 < i15) {
                int i19 = i18 << 1;
                int i20 = 0;
                while (i20 < i6) {
                    int i21 = i16 + i20;
                    int i22 = i16 + i18;
                    zArr[i13 + i19 + i20] = bVar.b(iArr[i21], iArr[i22]);
                    int i23 = i17 - i20;
                    zArr[(i15 * 2) + i13 + i19 + i20] = bVar.b(iArr[i22], iArr[i23]);
                    int i24 = i17 - i18;
                    zArr[(i15 * 4) + i13 + i19 + i20] = bVar.b(iArr[i23], iArr[i24]);
                    zArr[(i15 * 6) + i13 + i19 + i20] = bVar.b(iArr[i24], iArr[i21]);
                    i20++;
                    z = z;
                    i3 = i3;
                    i6 = 2;
                }
                int i25 = i3;
                boolean z2 = z;
                i18++;
                i6 = 2;
            }
            boolean z3 = z;
            i13 += i15 << 3;
            i12++;
            i3 = i3;
            i6 = 2;
        }
        b.l.f.w.a aVar4 = this.a;
        int i26 = aVar4.f5776e;
        int i27 = 8;
        if (i26 <= 2) {
            aVar2 = b.l.f.y.l.a.f5844j;
            i2 = 6;
        } else if (i26 <= 8) {
            aVar2 = b.l.f.y.l.a.f5848n;
            i2 = 8;
        } else if (i26 <= 22) {
            i2 = 10;
            aVar2 = b.l.f.y.l.a.f5843i;
        } else {
            aVar2 = b.l.f.y.l.a.f5842h;
        }
        int i28 = aVar4.d;
        int i29 = i5 / i2;
        if (i29 >= i28) {
            int i30 = i5 % i2;
            int[] iArr2 = new int[i29];
            int i31 = 0;
            while (i31 < i29) {
                iArr2[i31] = b(zArr, i30, i2);
                i31++;
                i30 += i2;
            }
            try {
                new c(aVar2).a(iArr2, i29 - i28);
                int i32 = 1;
                int i33 = (1 << i2) - 1;
                int i34 = 0;
                int i35 = 0;
                while (i34 < i28) {
                    int i36 = iArr2[i34];
                    if (i36 == 0 || i36 == i33) {
                        throw b.l.f.h.a();
                    }
                    if (i36 == i32 || i36 == i33 - 1) {
                        i35++;
                    }
                    i34++;
                    i32 = 1;
                }
                int i37 = (i28 * i2) - i35;
                boolean[] zArr2 = new boolean[i37];
                int i38 = 0;
                for (int i39 = 0; i39 < i28; i39++) {
                    int i40 = iArr2[i39];
                    int i41 = 1;
                    if (i40 == 1 || i40 == i33 - 1) {
                        Arrays.fill(zArr2, i38, (i38 + i2) - 1, i40 > 1);
                        i38 = (i2 - 1) + i38;
                    } else {
                        int i42 = i2 - 1;
                        while (i42 >= 0) {
                            int i43 = i38 + 1;
                            zArr2[i38] = ((i41 << i42) & i40) != 0;
                            i42--;
                            i38 = i43;
                            i41 = 1;
                        }
                    }
                }
                int i44 = (i37 + 7) / 8;
                byte[] bArr = new byte[i44];
                for (int i45 = 0; i45 < i44; i45++) {
                    int i46 = i45 << 3;
                    int i47 = i37 - i46;
                    bArr[i45] = (byte) (i47 >= 8 ? b(zArr2, i46, 8) : b(zArr2, i46, i47) << (8 - i47));
                }
                C0098a aVar5 = C0098a.UPPER;
                StringBuilder sb = new StringBuilder(20);
                C0098a aVar6 = aVar5;
                C0098a aVar7 = aVar6;
                int i48 = 0;
                while (i48 < i37) {
                    C0098a aVar8 = C0098a.BINARY;
                    if (aVar6 == aVar8) {
                        if (i37 - i48 < 5) {
                            break;
                        }
                        int b2 = b(zArr2, i48, 5);
                        i48 += 5;
                        if (b2 == 0) {
                            if (i37 - i48 < 11) {
                                break;
                            }
                            b2 = b(zArr2, i48, 11) + 31;
                            i48 += 11;
                        }
                        int i49 = 0;
                        while (true) {
                            if (i49 >= b2) {
                                break;
                            } else if (i37 - i48 < i27) {
                                i48 = i37;
                                break;
                            } else {
                                sb.append((char) b(zArr2, i48, i27));
                                i48 += 8;
                                i49++;
                            }
                        }
                        aVar6 = aVar7;
                    } else {
                        C0098a aVar9 = C0098a.DIGIT;
                        int i50 = aVar6 == aVar9 ? 4 : 5;
                        if (i37 - i48 < i50) {
                            break;
                        }
                        int b3 = b(zArr2, i48, i50);
                        i48 += i50;
                        int ordinal = aVar6.ordinal();
                        if (ordinal == 0) {
                            str = f5777b[b3];
                        } else if (ordinal == 1) {
                            str = c[b3];
                        } else if (ordinal == 2) {
                            str = d[b3];
                        } else if (ordinal == 3) {
                            str = f[b3];
                        } else if (ordinal == 4) {
                            str = f5778e[b3];
                        } else {
                            throw new IllegalStateException("Bad table");
                        }
                        if (str.startsWith("CTRL_")) {
                            char charAt = str.charAt(5);
                            if (charAt != 'B') {
                                if (charAt != 'D') {
                                    aVar8 = charAt != 'P' ? charAt != 'L' ? charAt != 'M' ? aVar5 : C0098a.MIXED : C0098a.LOWER : C0098a.PUNCT;
                                } else {
                                    aVar8 = aVar9;
                                }
                            }
                            if (str.charAt(6) == 'L') {
                                aVar6 = aVar8;
                            } else {
                                aVar7 = aVar6;
                                aVar6 = aVar8;
                                i27 = 8;
                            }
                        } else {
                            sb.append(str);
                            aVar6 = aVar7;
                        }
                    }
                    aVar7 = aVar6;
                    i27 = 8;
                }
                e eVar = new e(bArr, sb.toString(), (List<byte[]>) null, (String) null);
                eVar.f5826b = i37;
                return eVar;
            } catch (b.l.f.y.l.e e2) {
                throw (p.f5761h ? new b.l.f.h(e2) : b.l.f.h.f5756j);
            }
        } else {
            throw b.l.f.h.a();
        }
    }
}
