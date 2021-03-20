package b.l.f.c0;

import b.l.f.d;
import b.l.f.e;
import b.l.f.h;
import b.l.f.m;
import b.l.f.p;
import b.l.f.q;
import b.l.f.r;
import b.l.f.s;
import b.l.f.t;
import b.l.f.y.a;
import java.util.Arrays;
import java.util.Map;

public abstract class y extends r {
    public static final int[] d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5652e = {1, 1, 1, 1, 1};
    public static final int[] f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g  reason: collision with root package name */
    public static final int[][] f5653g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f5654h;
    public final StringBuilder a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public final x f5655b = new x();
    public final m c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f5653g = iArr;
        int[][] iArr2 = new int[20][];
        f5654h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = f5653g[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            f5654h[i2] = iArr4;
        }
    }

    public static boolean j(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 1;
        return r(charSequence.subSequence(0, i2)) == Character.digit(charSequence.charAt(i2), 10);
    }

    public static int k(a aVar, int[] iArr, int i2, int[][] iArr2) {
        r.g(aVar, i2, iArr);
        int length = iArr2.length;
        float f2 = 0.48f;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            float f3 = r.f(iArr, iArr2[i4], 0.7f);
            if (f3 < f2) {
                i3 = i4;
                f2 = f3;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        throw m.f5759j;
    }

    public static int[] o(a aVar, int i2, boolean z, int[] iArr, int[] iArr2) {
        int i3 = aVar.f5810i;
        int h2 = z ? aVar.h(i2) : aVar.g(i2);
        int length = iArr.length;
        boolean z2 = z;
        int i4 = 0;
        int i5 = h2;
        while (h2 < i3) {
            if (aVar.f(h2) != z2) {
                iArr2[i4] = iArr2[i4] + 1;
            } else {
                if (i4 != length - 1) {
                    i4++;
                } else if (r.f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i5, h2};
                } else {
                    i5 += iArr2[0] + iArr2[1];
                    int i6 = i4 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i6);
                    iArr2[i6] = 0;
                    iArr2[i4] = 0;
                    i4 = i6;
                }
                iArr2[i4] = 1;
                z2 = !z2;
            }
            h2++;
        }
        throw m.f5759j;
    }

    public static int[] p(a aVar) {
        int[] iArr = d;
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = null;
        boolean z = false;
        int i2 = 0;
        while (!z) {
            Arrays.fill(iArr2, 0, iArr.length, 0);
            iArr3 = o(aVar, i2, false, iArr, iArr2);
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            int i5 = i3 - (i4 - i3);
            if (i5 >= 0) {
                z = aVar.j(i5, i3, false);
            }
            i2 = i4;
        }
        return iArr3;
    }

    public static int r(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int charAt = charSequence.charAt(i3) - '0';
            if (charAt < 0 || charAt > 9) {
                throw h.a();
            }
            i2 += charAt;
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int charAt2 = charSequence.charAt(i5) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw h.a();
            }
            i4 += charAt2;
        }
        return (1000 - i4) % 10;
    }

    public q d(int i2, a aVar, Map<e, ?> map) {
        return n(i2, aVar, p(aVar), map);
    }

    public boolean i(String str) {
        return j(str);
    }

    public int[] l(a aVar, int i2) {
        int[] iArr = d;
        return o(aVar, i2, false, iArr, new int[iArr.length]);
    }

    public abstract int m(a aVar, int[] iArr, StringBuilder sb);

    public q n(int i2, a aVar, int[] iArr, Map<e, ?> map) {
        int i3;
        boolean z;
        String str = null;
        t tVar = map == null ? null : (t) map.get(e.NEED_RESULT_POINT_CALLBACK);
        if (tVar != null) {
            tVar.a(new s(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i2));
        }
        StringBuilder sb = this.a;
        sb.setLength(0);
        int m2 = m(aVar, iArr, sb);
        if (tVar != null) {
            tVar.a(new s((float) m2, (float) i2));
        }
        int[] l2 = l(aVar, m2);
        if (tVar != null) {
            tVar.a(new s(((float) (l2[0] + l2[1])) / 2.0f, (float) i2));
        }
        int i4 = l2[1];
        int i5 = (i4 - l2[0]) + i4;
        if (i5 >= aVar.f5810i || !aVar.j(i4, i5, false)) {
            throw m.f5759j;
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw h.a();
        } else if (i(sb2)) {
            b.l.f.a q2 = q();
            float f2 = (float) i2;
            q qVar = new q(sb2, (byte[]) null, new s[]{new s(((float) (iArr[1] + iArr[0])) / 2.0f, f2), new s(((float) (l2[1] + l2[0])) / 2.0f, f2)}, q2);
            try {
                q a2 = this.f5655b.a(i2, aVar, l2[1]);
                qVar.b(r.UPC_EAN_EXTENSION, a2.a);
                qVar.a(a2.f5764e);
                s[] sVarArr = a2.c;
                s[] sVarArr2 = qVar.c;
                if (sVarArr2 == null) {
                    qVar.c = sVarArr;
                } else if (sVarArr != null && sVarArr.length > 0) {
                    s[] sVarArr3 = new s[(sVarArr2.length + sVarArr.length)];
                    System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
                    System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
                    qVar.c = sVarArr3;
                }
                i3 = a2.a.length();
            } catch (p unused) {
                i3 = 0;
            }
            int[] iArr2 = map == null ? null : (int[]) map.get(e.ALLOWED_EAN_EXTENSIONS);
            if (iArr2 != null) {
                int length = iArr2.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z = false;
                        break;
                    } else if (i3 == iArr2[i6]) {
                        z = true;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (!z) {
                    throw m.f5759j;
                }
            }
            if (q2 == b.l.f.a.EAN_13 || q2 == b.l.f.a.UPC_A) {
                m mVar = this.c;
                mVar.b();
                int parseInt = Integer.parseInt(sb2.substring(0, 3));
                int size = mVar.a.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        int[] iArr3 = mVar.a.get(i7);
                        int i8 = iArr3[0];
                        if (parseInt < i8) {
                            break;
                        }
                        if (iArr3.length != 1) {
                            i8 = iArr3[1];
                        }
                        if (parseInt <= i8) {
                            str = mVar.f5642b.get(i7);
                            break;
                        }
                        i7++;
                    } else {
                        break;
                    }
                }
                if (str != null) {
                    qVar.b(r.POSSIBLE_COUNTRY, str);
                }
            }
            return qVar;
        } else {
            throw d.a();
        }
    }

    public abstract b.l.f.a q();
}
