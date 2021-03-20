package b.l.f.c0;

import b.l.f.m;
import b.l.f.p;
import b.l.f.q;
import b.l.f.r;
import b.l.f.s;
import b.l.f.y.a;
import java.util.EnumMap;

public final class x {
    public static final int[] c = {1, 1, 2};
    public final v a = new v();

    /* renamed from: b  reason: collision with root package name */
    public final w f5651b = new w();

    public q a(int i2, a aVar, int i3) {
        EnumMap enumMap;
        int i4 = i2;
        a aVar2 = aVar;
        int[] iArr = c;
        int[] o2 = y.o(aVar2, i3, false, iArr, new int[iArr.length]);
        try {
            return this.f5651b.a(i4, aVar2, o2);
        } catch (p unused) {
            v vVar = this.a;
            StringBuilder sb = vVar.f5649b;
            sb.setLength(0);
            int[] iArr2 = vVar.a;
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            int i5 = aVar2.f5810i;
            int i6 = o2[1];
            int i7 = 0;
            for (int i8 = 0; i8 < 2 && i6 < i5; i8++) {
                int k2 = y.k(aVar2, iArr2, i6, y.f5654h);
                sb.append((char) ((k2 % 10) + 48));
                for (int i9 : iArr2) {
                    i6 += i9;
                }
                if (k2 >= 10) {
                    i7 |= 1 << (1 - i8);
                }
                if (i8 != 1) {
                    i6 = aVar2.h(aVar2.g(i6));
                }
            }
            if (sb.length() != 2) {
                throw m.f5759j;
            } else if (Integer.parseInt(sb.toString()) % 4 == i7) {
                String sb2 = sb.toString();
                if (sb2.length() != 2) {
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(r.class);
                    enumMap.put(r.ISSUE_NUMBER, Integer.valueOf(sb2));
                }
                float f = (float) i4;
                q qVar = new q(sb2, (byte[]) null, new s[]{new s(((float) (o2[0] + o2[1])) / 2.0f, f), new s((float) i6, f)}, b.l.f.a.UPC_EAN_EXTENSION);
                if (enumMap != null) {
                    qVar.a(enumMap);
                }
                return qVar;
            } else {
                throw m.f5759j;
            }
        }
    }
}
