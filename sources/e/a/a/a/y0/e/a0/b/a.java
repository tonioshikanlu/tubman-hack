package e.a.a.a.y0.e.a0.b;

import androidx.exifinterface.media.ExifInterface;
import e.x.c.i;

public class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i2) {
        int i3 = i2;
        String str = (i3 == 1 || i3 == 3 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 12 || i3 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i3 == 1 || i3 == 3 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 12 || i3 == 14) ? 2 : 3)];
        if (i3 == 1 || i3 == 3 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 12 || i3 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i3 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i3 == 3) {
            objArr[1] = "encode8to7";
        } else if (i3 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i3 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i3 == 10) {
            objArr[1] = "dropMarker";
        } else if (i3 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i3 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i3) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i3 == 1 || i3 == 3 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 12 || i3 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static byte[] b(String[] strArr) {
        int i2;
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    String[] c = c(strArr);
                    i.e(c, "strings");
                    int i3 = 0;
                    for (String length : c) {
                        i3 += length.length();
                    }
                    byte[] bArr = new byte[i3];
                    int i4 = 0;
                    for (String str : c) {
                        int length2 = str.length() - 1;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                i2 = i4 + 1;
                                bArr[i4] = (byte) str.charAt(i5);
                                if (i5 == length2) {
                                    break;
                                }
                                i5++;
                                i4 = i2;
                            }
                            i4 = i2;
                        }
                    }
                    return bArr;
                } else if (charAt == 65535) {
                    strArr = c(strArr);
                }
            }
            int i6 = 0;
            for (String length3 : strArr) {
                i6 += length3.length();
            }
            byte[] bArr2 = new byte[i6];
            int i7 = 0;
            for (String str2 : strArr) {
                int length4 = str2.length();
                int i8 = 0;
                while (i8 < length4) {
                    bArr2[i7] = (byte) str2.charAt(i8);
                    i8++;
                    i7++;
                }
            }
            for (int i9 = 0; i9 < i6; i9++) {
                bArr2[i9] = (byte) ((bArr2[i9] + Byte.MAX_VALUE) & 127);
            }
            int i10 = (i6 * 7) / 8;
            byte[] bArr3 = new byte[i10];
            int i11 = 0;
            byte b2 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                i11++;
                int i13 = b2 + 1;
                bArr3[i12] = (byte) (((bArr2[i11] & ExifInterface.MARKER) >>> b2) + ((bArr2[i11] & ((1 << i13) - 1)) << (7 - b2)));
                if (b2 == 6) {
                    i11++;
                    b2 = 0;
                } else {
                    b2 = i13;
                }
            }
            return bArr3;
        }
        a(7);
        throw null;
    }

    public static String[] c(String[] strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
