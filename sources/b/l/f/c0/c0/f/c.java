package b.l.f.c0.c0.f;

import androidx.renderscript.ScriptIntrinsicBLAS;
import b.l.f.c0.c0.a;
import b.l.f.c0.c0.b;
import b.l.f.c0.c0.f.d.d;
import b.l.f.c0.c0.f.d.e;
import b.l.f.c0.c0.f.d.g;
import b.l.f.c0.c0.f.d.j;
import b.l.f.c0.c0.f.d.k;
import b.l.f.c0.c0.f.d.s;
import b.l.f.c0.r;
import b.l.f.m;
import b.l.f.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends a {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f5608k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f5609l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5610m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    public static final int[][] f5611n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f5612o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, ScriptIntrinsicBLAS.UNIT}, new int[]{185, 133, 188, ScriptIntrinsicBLAS.RIGHT, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, new int[]{103, 98, 83, 38, 114, ScriptIntrinsicBLAS.NON_UNIT, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    public static final int[][] f5613p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f5614g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f5615h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final int[] f5616i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public boolean f5617j;

    public static q p(List<a> list) {
        j jVar;
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).f5606b == null) {
            size--;
        }
        b.l.f.y.a aVar = new b.l.f.y.a(size * 12);
        int i2 = list.get(0).f5606b.a;
        int i3 = 0;
        for (int i4 = 11; i4 >= 0; i4--) {
            if (((1 << i4) & i2) != 0) {
                aVar.l(i3);
            }
            i3++;
        }
        for (int i5 = 1; i5 < list.size(); i5++) {
            a aVar2 = list.get(i5);
            int i6 = aVar2.a.a;
            for (int i7 = 11; i7 >= 0; i7--) {
                if (((1 << i7) & i6) != 0) {
                    aVar.l(i3);
                }
                i3++;
            }
            b bVar = aVar2.f5606b;
            if (bVar != null) {
                int i8 = bVar.a;
                for (int i9 = 11; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) != 0) {
                        aVar.l(i3);
                    }
                    i3++;
                }
            }
        }
        if (aVar.f(1)) {
            jVar = new g(aVar);
        } else if (!aVar.f(2)) {
            jVar = new k(aVar);
        } else {
            int d = s.d(aVar, 1, 4);
            if (d == 4) {
                jVar = new b.l.f.c0.c0.f.d.a(aVar);
            } else if (d != 5) {
                int d2 = s.d(aVar, 1, 5);
                if (d2 == 12) {
                    jVar = new b.l.f.c0.c0.f.d.c(aVar);
                } else if (d2 != 13) {
                    switch (s.d(aVar, 1, 7)) {
                        case 56:
                            jVar = new e(aVar, "310", "11");
                            break;
                        case 57:
                            jVar = new e(aVar, "320", "11");
                            break;
                        case 58:
                            jVar = new e(aVar, "310", "13");
                            break;
                        case 59:
                            jVar = new e(aVar, "320", "13");
                            break;
                        case 60:
                            jVar = new e(aVar, "310", "15");
                            break;
                        case 61:
                            jVar = new e(aVar, "320", "15");
                            break;
                        case 62:
                            jVar = new e(aVar, "310", "17");
                            break;
                        case 63:
                            jVar = new e(aVar, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
                    }
                } else {
                    jVar = new d(aVar);
                }
            } else {
                jVar = new b.l.f.c0.c0.f.d.b(aVar);
            }
        }
        String a = jVar.a();
        b.l.f.s[] sVarArr = list.get(0).c.c;
        b.l.f.s[] sVarArr2 = list.get(list.size() - 1).c.c;
        return new q(a, (byte[]) null, new b.l.f.s[]{sVarArr[0], sVarArr[1], sVarArr2[0], sVarArr2[1]}, b.l.f.a.RSS_EXPANDED);
    }

    public static void t(int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length / 2; i2++) {
            int i3 = iArr[i2];
            int i4 = (length - i2) - 1;
            iArr[i2] = iArr[i4];
            iArr[i4] = i3;
        }
    }

    public void c() {
        this.f5614g.clear();
        this.f5615h.clear();
    }

    public q d(int i2, b.l.f.y.a aVar, Map<b.l.f.e, ?> map) {
        this.f5614g.clear();
        this.f5617j = false;
        try {
            return p(r(i2, aVar));
        } catch (m unused) {
            this.f5614g.clear();
            this.f5617j = true;
            return p(r(i2, aVar));
        }
    }

    public final boolean m() {
        a aVar = this.f5614g.get(0);
        b bVar = aVar.a;
        b bVar2 = aVar.f5606b;
        if (bVar2 == null) {
            return false;
        }
        int i2 = bVar2.f5595b;
        int i3 = 2;
        for (int i4 = 1; i4 < this.f5614g.size(); i4++) {
            a aVar2 = this.f5614g.get(i4);
            i2 += aVar2.a.f5595b;
            i3++;
            b bVar3 = aVar2.f5606b;
            if (bVar3 != null) {
                i2 += bVar3.f5595b;
                i3++;
            }
        }
        if (((i3 - 4) * 211) + (i2 % 211) == bVar.a) {
            return true;
        }
        return false;
    }

    public final List<a> n(List<b> list, int i2) {
        boolean z;
        while (i2 < this.f5615h.size()) {
            b bVar = this.f5615h.get(i2);
            this.f5614g.clear();
            for (b bVar2 : list) {
                this.f5614g.addAll(bVar2.a);
            }
            this.f5614g.addAll(bVar.a);
            List<a> list2 = this.f5614g;
            int[][] iArr = f5613p;
            int length = iArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                int[] iArr2 = iArr[i3];
                if (list2.size() <= iArr2.length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list2.size()) {
                            z = true;
                            break;
                        } else if (list2.get(i4).c.a != iArr2[i4]) {
                            z = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
                i3++;
            }
            if (!z2) {
                i2++;
            } else if (m()) {
                return this.f5614g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(bVar);
                try {
                    return n(arrayList, i2 + 1);
                } catch (m unused) {
                }
            }
        }
        throw m.f5759j;
    }

    public final List<a> o(boolean z) {
        List<a> list = null;
        if (this.f5615h.size() > 25) {
            this.f5615h.clear();
            return null;
        }
        this.f5614g.clear();
        if (z) {
            Collections.reverse(this.f5615h);
        }
        try {
            list = n(new ArrayList(), 0);
        } catch (m unused) {
        }
        if (z) {
            Collections.reverse(this.f5615h);
        }
        return list;
    }

    public b q(b.l.f.y.a aVar, b.l.f.c0.c0.c cVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        b.l.f.y.a aVar2 = aVar;
        b.l.f.c0.c0.c cVar2 = cVar;
        int[][] iArr = f5612o;
        int[] iArr2 = this.f5593b;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            iArr2[i2] = 0;
        }
        if (z2) {
            r.h(aVar2, cVar2.f5596b[0], iArr2);
        } else {
            r.g(aVar2, cVar2.f5596b[1], iArr2);
            int i3 = 0;
            for (int length = iArr2.length - 1; i3 < length; length--) {
                int i4 = iArr2[i3];
                iArr2[i3] = iArr2[length];
                iArr2[length] = i4;
                i3++;
            }
        }
        float o0 = ((float) b.l.f.x.a.g.o0(iArr2)) / 17.0f;
        int[] iArr3 = cVar2.f5596b;
        float f = ((float) (iArr3[1] - iArr3[0])) / 15.0f;
        if (Math.abs(o0 - f) / f <= 0.3f) {
            int[] iArr4 = this.f5594e;
            int[] iArr5 = this.f;
            float[] fArr = this.c;
            float[] fArr2 = this.d;
            for (int i5 = 0; i5 < iArr2.length; i5++) {
                float f2 = (((float) iArr2[i5]) * 1.0f) / o0;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw m.f5759j;
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw m.f5759j;
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    iArr4[i7] = i6;
                    fArr[i7] = f2 - ((float) i6);
                } else {
                    iArr5[i7] = i6;
                    fArr2[i7] = f2 - ((float) i6);
                }
            }
            int o02 = b.l.f.x.a.g.o0(this.f5594e);
            int o03 = b.l.f.x.a.g.o0(this.f);
            if (o02 > 13) {
                z3 = false;
                z4 = true;
            } else {
                z4 = false;
                z3 = o02 < 4;
            }
            if (o03 > 13) {
                z6 = false;
                z5 = true;
            } else if (o03 < 4) {
                z5 = false;
                z6 = true;
            } else {
                z6 = false;
                z5 = false;
            }
            int i8 = (o02 + o03) - 17;
            boolean z7 = (o02 & 1) == 1;
            boolean z8 = (o03 & 1) == 0;
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw m.f5759j;
                    } else if (z7) {
                        if (!z8) {
                            z4 = true;
                        } else {
                            throw m.f5759j;
                        }
                    } else if (z8) {
                        z5 = true;
                    } else {
                        throw m.f5759j;
                    }
                } else if (z7) {
                    if (!z8) {
                        throw m.f5759j;
                    } else if (o02 < o03) {
                        z3 = true;
                        z5 = true;
                    } else {
                        z4 = true;
                        z6 = true;
                    }
                } else if (z8) {
                    throw m.f5759j;
                }
            } else if (z7) {
                if (!z8) {
                    z3 = true;
                } else {
                    throw m.f5759j;
                }
            } else if (z8) {
                z6 = true;
            } else {
                throw m.f5759j;
            }
            if (z3) {
                if (!z4) {
                    a.j(this.f5594e, this.c);
                } else {
                    throw m.f5759j;
                }
            }
            if (z4) {
                a.i(this.f5594e, this.c);
            }
            if (z6) {
                if (!z5) {
                    a.j(this.f, this.c);
                } else {
                    throw m.f5759j;
                }
            }
            if (z5) {
                a.i(this.f, this.d);
            }
            int i9 = (((cVar2.a * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i10 = 0;
            int i11 = 0;
            for (int length2 = iArr4.length - 1; length2 >= 0; length2--) {
                if (cVar2.a != 0 || !z || !z2) {
                    i10 += iArr4[length2] * iArr[i9][length2 * 2];
                }
                i11 += iArr4[length2];
            }
            int i12 = 0;
            for (int length3 = iArr5.length - 1; length3 >= 0; length3--) {
                if (cVar2.a != 0 || !z || !z2) {
                    i12 += iArr5[length3] * iArr[i9][(length3 * 2) + 1];
                }
            }
            int i13 = i10 + i12;
            if ((i11 & 1) != 0 || i11 > 13 || i11 < 4) {
                throw m.f5759j;
            }
            int i14 = (13 - i11) / 2;
            int i15 = f5608k[i14];
            return new b((b.l.f.x.a.g.z(iArr4, i15, true) * f5609l[i14]) + b.l.f.x.a.g.z(iArr5, 9 - i15, false) + f5610m[i14], i13);
        }
        throw m.f5759j;
    }

    public List<a> r(int i2, b.l.f.y.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        while (!z6) {
            try {
                List<a> list = this.f5614g;
                list.add(s(aVar, list, i2));
            } catch (m e2) {
                if (!this.f5614g.isEmpty()) {
                    z6 = true;
                } else {
                    throw e2;
                }
            }
        }
        if (m()) {
            return this.f5614g;
        }
        boolean z7 = !this.f5615h.isEmpty();
        int i3 = 0;
        boolean z8 = false;
        while (true) {
            if (i3 >= this.f5615h.size()) {
                z = false;
                break;
            }
            b bVar = this.f5615h.get(i3);
            if (bVar.f5607b > i2) {
                z = bVar.a.equals(this.f5614g);
                break;
            }
            z8 = bVar.a.equals(this.f5614g);
            i3++;
        }
        if (!z && !z8) {
            List<a> list2 = this.f5614g;
            Iterator<T> it = this.f5615h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                b bVar2 = (b) it.next();
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z4 = true;
                        continue;
                        break;
                    }
                    a aVar2 = (a) it2.next();
                    Iterator<a> it3 = bVar2.a.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (aVar2.equals(it3.next())) {
                                z5 = true;
                                continue;
                                break;
                            }
                        } else {
                            z5 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z5) {
                        z4 = false;
                        continue;
                        break;
                    }
                }
                if (z4) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                this.f5615h.add(i3, new b(this.f5614g, i2, false));
                List<a> list3 = this.f5614g;
                Iterator<b> it4 = this.f5615h.iterator();
                while (it4.hasNext()) {
                    b next = it4.next();
                    if (next.a.size() != list3.size()) {
                        Iterator<a> it5 = next.a.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (!list3.contains(it5.next())) {
                                    z3 = false;
                                    break;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                        if (z3) {
                            it4.remove();
                        }
                    }
                }
            }
        }
        if (z7) {
            List<a> o2 = o(false);
            if (o2 != null) {
                return o2;
            }
            List<a> o3 = o(true);
            if (o3 != null) {
                return o3;
            }
        }
        throw m.f5759j;
    }

    public a s(b.l.f.y.a aVar, List<a> list, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        b.l.f.c0.c0.c cVar;
        b.l.f.y.a aVar2 = aVar;
        List<a> list2 = list;
        int i8 = 2;
        int i9 = 0;
        boolean z = true;
        boolean z2 = list.size() % 2 == 0;
        if (this.f5617j) {
            z2 = !z2;
        }
        int i10 = -1;
        boolean z3 = true;
        while (true) {
            int[] iArr = this.a;
            iArr[i3] = i3;
            iArr[1] = i3;
            iArr[i8] = i3;
            iArr[3] = i3;
            int i11 = aVar2.f5810i;
            if (i10 >= 0) {
                i4 = i10;
            } else if (list.isEmpty()) {
                i4 = i3;
            } else {
                i4 = list2.get(list.size() - 1).c.f5596b[1];
            }
            int i12 = list.size() % i8 != 0 ? 1 : i3;
            if (this.f5617j) {
                i12 ^= 1;
            }
            boolean z4 = i3;
            while (i4 < i11) {
                z4 = !aVar2.f(i4);
                if (!z4) {
                    break;
                }
                i4++;
            }
            int i13 = z4;
            int i14 = i4;
            while (i4 < i11) {
                if (aVar2.f(i4) != i13) {
                    iArr[i3] = iArr[i3] + 1;
                } else {
                    if (i3 == 3) {
                        if (i12 != 0) {
                            t(iArr);
                        }
                        if (a.k(iArr)) {
                            int[] iArr2 = this.f5616i;
                            int i15 = 0;
                            iArr2[0] = i14;
                            iArr2[1] = i4;
                            if (z2) {
                                int i16 = iArr2[0] - 1;
                                while (i16 >= 0 && !aVar2.f(i16)) {
                                    i16--;
                                }
                                int i17 = i16 + 1;
                                int[] iArr3 = this.f5616i;
                                i7 = iArr3[0] - i17;
                                i6 = i17;
                                i5 = iArr3[1];
                                i15 = 0;
                            } else {
                                int i18 = iArr2[0];
                                int h2 = aVar2.h(iArr2[1] + 1);
                                i7 = h2 - this.f5616i[1];
                                i5 = h2;
                                i6 = i18;
                            }
                            int[] iArr4 = this.a;
                            System.arraycopy(iArr4, i15, iArr4, 1, iArr4.length - 1);
                            iArr4[i15] = i7;
                            b bVar = null;
                            try {
                                int l2 = a.l(iArr4, f5611n);
                                int[] iArr5 = new int[2];
                                iArr5[i15] = i6;
                                iArr5[1] = i5;
                                cVar = new b.l.f.c0.c0.c(l2, iArr5, i6, i5, i2);
                            } catch (m unused) {
                                cVar = null;
                            }
                            if (cVar == null) {
                                int i19 = this.f5616i[0];
                                i10 = aVar2.f(i19) ? aVar2.g(aVar2.h(i19)) : aVar2.h(aVar2.g(i19));
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                b q2 = q(aVar2, cVar, z2, true);
                                if (!list.isEmpty()) {
                                    if (list2.get(list.size() - 1).f5606b != null) {
                                        z = false;
                                    }
                                    if (z) {
                                        throw m.f5759j;
                                    }
                                }
                                try {
                                    bVar = q(aVar2, cVar, z2, false);
                                } catch (m unused2) {
                                }
                                return new a(q2, bVar, cVar);
                            }
                            i8 = 2;
                            i9 = 0;
                        } else {
                            if (i12 != 0) {
                                t(iArr);
                            }
                            i14 = iArr[0] + iArr[1] + i14;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = 0;
                            iArr[3] = 0;
                            i3--;
                        }
                    } else {
                        i3++;
                    }
                    iArr[i3] = 1;
                    i13 ^= 1;
                }
                i4++;
            }
            throw m.f5759j;
        }
    }
}
