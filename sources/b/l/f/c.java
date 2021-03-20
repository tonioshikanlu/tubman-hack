package b.l.f;

import androidx.exifinterface.media.ExifInterface;
import b.l.f.y.a;
import b.l.f.y.b;
import b.l.f.y.h;
import java.lang.reflect.Array;

public final class c {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public b f5585b;

    public c(b bVar) {
        this.a = bVar;
    }

    public b a() {
        b bVar;
        int i2;
        int i3;
        c cVar = this;
        if (cVar.f5585b == null) {
            h hVar = (h) cVar.a;
            b bVar2 = hVar.d;
            if (bVar2 == null) {
                j jVar = hVar.a;
                int i4 = jVar.a;
                int i5 = jVar.f5757b;
                if (i4 < 40 || i5 < 40) {
                    bVar = new b(i4, i5);
                    hVar.b(i4);
                    int[] iArr = hVar.c;
                    for (int i6 = 1; i6 < 5; i6++) {
                        byte[] b2 = jVar.b((i5 * i6) / 5, hVar.f5832b);
                        int i7 = (i4 << 2) / 5;
                        for (int i8 = i4 / 5; i8 < i7; i8++) {
                            int i9 = (b2[i8] & ExifInterface.MARKER) >> 3;
                            iArr[i9] = iArr[i9] + 1;
                        }
                    }
                    int a2 = h.a(iArr);
                    byte[] a3 = jVar.a();
                    for (int i10 = 0; i10 < i5; i10++) {
                        int i11 = i10 * i4;
                        for (int i12 = 0; i12 < i4; i12++) {
                            if ((a3[i11 + i12] & ExifInterface.MARKER) < a2) {
                                bVar.g(i12, i10);
                            }
                        }
                    }
                } else {
                    byte[] a4 = jVar.a();
                    int i13 = i4 >> 3;
                    if ((i4 & 7) != 0) {
                        i13++;
                    }
                    int i14 = i5 >> 3;
                    if ((i5 & 7) != 0) {
                        i14++;
                    }
                    int i15 = i5 - 8;
                    int i16 = i4 - 8;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i13;
                    iArr2[0] = i14;
                    int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
                    int i17 = 0;
                    while (true) {
                        int i18 = 8;
                        if (i17 >= i14) {
                            break;
                        }
                        int i19 = i17 << 3;
                        if (i19 > i15) {
                            i19 = i15;
                        }
                        int i20 = 0;
                        while (i20 < i13) {
                            int i21 = i20 << 3;
                            if (i21 > i16) {
                                i21 = i16;
                            }
                            int i22 = (i19 * i4) + i21;
                            int i23 = 0;
                            int i24 = 0;
                            byte b3 = ExifInterface.MARKER;
                            byte b4 = 0;
                            while (true) {
                                i2 = i19;
                                if (i23 >= i18) {
                                    break;
                                }
                                int i25 = i23;
                                byte b5 = b3;
                                byte b6 = b4;
                                int i26 = 0;
                                while (i26 < i18) {
                                    byte b7 = a4[i22 + i26] & ExifInterface.MARKER;
                                    i24 += b7;
                                    if (b7 < b5) {
                                        b5 = b7;
                                    }
                                    if (b7 > b6) {
                                        b6 = b7;
                                    }
                                    i26++;
                                    i18 = 8;
                                }
                                if (b6 - b5 > 24) {
                                    i3 = i25;
                                    while (true) {
                                        i3++;
                                        i22 += i4;
                                        if (i3 >= 8) {
                                            break;
                                        }
                                        int i27 = 0;
                                        for (int i28 = 8; i27 < i28; i28 = 8) {
                                            i24 += a4[i22 + i27] & ExifInterface.MARKER;
                                            i27++;
                                            b5 = b5;
                                        }
                                    }
                                    b3 = b5;
                                } else {
                                    b3 = b5;
                                    i3 = i25;
                                }
                                i23 = i3 + 1;
                                i22 += i4;
                                i18 = 8;
                                b4 = b6;
                                i19 = i2;
                            }
                            int i29 = i24 >> 6;
                            byte b8 = b3;
                            if (b4 - b8 <= 24) {
                                i29 = b8 / 2;
                                if (i17 > 0 && i20 > 0) {
                                    int i30 = i17 - 1;
                                    int i31 = i20 - 1;
                                    int i32 = (((iArr3[i17][i31] * 2) + iArr3[i30][i20]) + iArr3[i30][i31]) / 4;
                                    if (b8 < i32) {
                                        i29 = i32;
                                    }
                                }
                            }
                            iArr3[i17][i20] = i29;
                            i20++;
                            i19 = i2;
                            i18 = 8;
                        }
                        i17++;
                    }
                    bVar = new b(i4, i5);
                    for (int i33 = 0; i33 < i14; i33++) {
                        int i34 = i33 << 3;
                        if (i34 > i15) {
                            i34 = i15;
                        }
                        int i35 = i14 - 3;
                        if (i33 < 2) {
                            i35 = 2;
                        } else if (i33 <= i35) {
                            i35 = i33;
                        }
                        int i36 = 0;
                        while (i36 < i13) {
                            int i37 = i36 << 3;
                            if (i37 > i16) {
                                i37 = i16;
                            }
                            int i38 = i13 - 3;
                            int i39 = 2;
                            if (i36 < 2) {
                                i38 = 2;
                            } else if (i36 <= i38) {
                                i38 = i36;
                            }
                            int i40 = i13;
                            int i41 = -2;
                            int i42 = 0;
                            while (i41 <= i39) {
                                int[] iArr4 = iArr3[i35 + i41];
                                i42 = iArr4[i38 - 2] + iArr4[i38 - 1] + iArr4[i38] + iArr4[i38 + 1] + iArr4[i38 + 2] + i42;
                                i41++;
                                i39 = 2;
                            }
                            int i43 = i39;
                            int i44 = i42 / 25;
                            int i45 = (i34 * i4) + i37;
                            int i46 = i35;
                            int i47 = 8;
                            int i48 = 0;
                            while (i48 < i47) {
                                int i49 = i14;
                                int i50 = 0;
                                while (i50 < i47) {
                                    byte[] bArr = a4;
                                    if ((a4[i45 + i50] & ExifInterface.MARKER) <= i44) {
                                        bVar.g(i37 + i50, i34 + i48);
                                    }
                                    i50++;
                                    a4 = bArr;
                                    i47 = 8;
                                }
                                byte[] bArr2 = a4;
                                i48++;
                                i45 += i4;
                                i14 = i49;
                                i47 = 8;
                            }
                            byte[] bArr3 = a4;
                            int i51 = i14;
                            i36++;
                            i35 = i46;
                            i13 = i40;
                        }
                        byte[] bArr4 = a4;
                        int i52 = i13;
                        int i53 = i14;
                    }
                }
                hVar.d = bVar;
                bVar2 = hVar.d;
            }
            cVar = this;
            cVar.f5585b = bVar2;
        }
        return cVar.f5585b;
    }

    public a b(int i2, a aVar) {
        int i3;
        h hVar = (h) this.a;
        j jVar = hVar.a;
        int i4 = jVar.a;
        if (aVar.f5810i < i4) {
            aVar = new a(i4);
        } else {
            int length = aVar.f5809h.length;
            for (int i5 = 0; i5 < length; i5++) {
                aVar.f5809h[i5] = 0;
            }
        }
        hVar.b(i4);
        byte[] b2 = jVar.b(i2, hVar.f5832b);
        int[] iArr = hVar.c;
        int i6 = 0;
        while (true) {
            i3 = 1;
            if (i6 >= i4) {
                break;
            }
            int i7 = (b2[i6] & ExifInterface.MARKER) >> 3;
            iArr[i7] = iArr[i7] + 1;
            i6++;
        }
        int a2 = h.a(iArr);
        if (i4 < 3) {
            for (int i8 = 0; i8 < i4; i8++) {
                if ((b2[i8] & ExifInterface.MARKER) < a2) {
                    aVar.l(i8);
                }
            }
        } else {
            byte b3 = b2[0] & ExifInterface.MARKER;
            byte b4 = b2[1] & ExifInterface.MARKER;
            while (i3 < i4 - 1) {
                int i9 = i3 + 1;
                byte b5 = b2[i9] & ExifInterface.MARKER;
                if ((((b4 << 2) - b3) - b5) / 2 < a2) {
                    aVar.l(i3);
                }
                b3 = b4;
                i3 = i9;
                b4 = b5;
            }
        }
        return aVar;
    }

    public String toString() {
        try {
            return a().toString();
        } catch (m unused) {
            return "";
        }
    }
}
