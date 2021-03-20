package o.b0;

import androidx.exifinterface.media.ExifInterface;
import e.x.c.i;
import o.e;
import o.q;
import o.u;

public final class a {
    public static final byte[] a;

    static {
        i.e("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(e.c0.a.a);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final boolean a(u uVar, int i2, byte[] bArr, int i3, int i4) {
        i.e(uVar, "segment");
        i.e(bArr, "bytes");
        int i5 = uVar.c;
        byte[] bArr2 = uVar.a;
        while (i3 < i4) {
            if (i2 == i5) {
                uVar = uVar.f;
                i.c(uVar);
                byte[] bArr3 = uVar.a;
                int i6 = uVar.f10489b;
                bArr2 = bArr3;
                i2 = i6;
                i5 = uVar.c;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String b(e eVar, long j2) {
        i.e(eVar, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (eVar.N(j3) == ((byte) 13)) {
                String n0 = eVar.n0(j3);
                eVar.skip(2);
                return n0;
            }
        }
        String n02 = eVar.n0(j2);
        eVar.skip(1);
        return n02;
    }

    public static final int c(e eVar, q qVar, boolean z) {
        int i2;
        int i3;
        int i4;
        u uVar;
        int i5;
        e eVar2 = eVar;
        q qVar2 = qVar;
        i.e(eVar2, "$this$selectPrefix");
        i.e(qVar2, "options");
        u uVar2 = eVar2.f10452h;
        if (uVar2 != null) {
            byte[] bArr = uVar2.a;
            int i6 = uVar2.f10489b;
            int i7 = uVar2.c;
            int[] iArr = qVar2.f10479i;
            u uVar3 = uVar2;
            int i8 = -1;
            int i9 = 0;
            loop0:
            while (true) {
                int i10 = i9 + 1;
                int i11 = iArr[i9];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = (i11 * -1) + i12;
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & ExifInterface.MARKER) != iArr[i12]) {
                            return i8;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 == i7) {
                            i.c(uVar3);
                            u uVar4 = uVar3.f;
                            i.c(uVar4);
                            i5 = uVar4.f10489b;
                            byte[] bArr2 = uVar4.a;
                            i4 = uVar4.c;
                            if (uVar4 != uVar2) {
                                byte[] bArr3 = bArr2;
                                uVar = uVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            u uVar5 = uVar3;
                            i4 = i7;
                            i5 = i15;
                            uVar = uVar5;
                        }
                        if (z2) {
                            i3 = iArr[i16];
                            i2 = i5;
                            i7 = i4;
                            uVar3 = uVar;
                            break;
                        }
                        i6 = i5;
                        i7 = i4;
                        i12 = i16;
                        uVar3 = uVar;
                    }
                } else {
                    i2 = i6 + 1;
                    byte b2 = bArr[i6] & ExifInterface.MARKER;
                    int i17 = i12 + i11;
                    while (i12 != i17) {
                        if (b2 == iArr[i12]) {
                            i3 = iArr[i12 + i11];
                            if (i2 == i7) {
                                uVar3 = uVar3.f;
                                i.c(uVar3);
                                i2 = uVar3.f10489b;
                                bArr = uVar3.a;
                                i7 = uVar3.c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i3 >= 0) {
                    return i3;
                }
                i9 = -i3;
                i6 = i2;
            }
            if (z) {
                return -2;
            }
            return i8;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
