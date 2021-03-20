package b.l.f.w.e;

import b.l.f.m;
import b.l.f.s;
import b.l.f.x.a.g;
import b.l.f.y.b;
import b.l.f.y.f;
import b.l.f.y.i;
import b.l.f.y.l.c;
import b.l.f.y.l.e;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f5786g = {3808, 476, 2107, 1799};
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5787b;
    public int c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5788e;
    public int f;

    /* renamed from: b.l.f.w.e.a$a  reason: collision with other inner class name */
    public static final class C0099a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5789b;

        public C0099a(int i2, int i3) {
            this.a = i2;
            this.f5789b = i3;
        }

        public String toString() {
            return "<" + this.a + ' ' + this.f5789b + '>';
        }
    }

    public a(b bVar) {
        this.a = bVar;
    }

    public static s[] b(s[] sVarArr, int i2, int i3) {
        float f2 = ((float) i3) / (((float) i2) * 2.0f);
        float f3 = sVarArr[0].a - sVarArr[2].a;
        float f4 = sVarArr[0].f5775b - sVarArr[2].f5775b;
        float f5 = (sVarArr[0].a + sVarArr[2].a) / 2.0f;
        float f6 = (sVarArr[0].f5775b + sVarArr[2].f5775b) / 2.0f;
        float f7 = f3 * f2;
        float f8 = f4 * f2;
        s sVar = new s(f5 + f7, f6 + f8);
        s sVar2 = new s(f5 - f7, f6 - f8);
        float f9 = sVarArr[1].a - sVarArr[3].a;
        float f10 = sVarArr[1].f5775b - sVarArr[3].f5775b;
        float f11 = (sVarArr[1].a + sVarArr[3].a) / 2.0f;
        float f12 = (sVarArr[1].f5775b + sVarArr[3].f5775b) / 2.0f;
        float f13 = f9 * f2;
        float f14 = f2 * f10;
        return new s[]{sVar, new s(f11 + f13, f12 + f14), sVar2, new s(f11 - f13, f12 - f14)};
    }

    public b.l.f.w.a a(boolean z) {
        s sVar;
        s sVar2;
        s sVar3;
        s sVar4;
        s sVar5;
        s sVar6;
        s sVar7;
        s sVar8;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        C0099a aVar;
        int i6 = 2;
        int i7 = -1;
        int i8 = 1;
        try {
            b bVar = this.a;
            s[] b2 = new b.l.f.y.k.a(bVar, 10, bVar.f5811h / 2, bVar.f5812i / 2).b();
            sVar3 = b2[0];
            sVar2 = b2[1];
            sVar = b2[2];
            sVar4 = b2[3];
        } catch (m unused) {
            b bVar2 = this.a;
            int i9 = bVar2.f5811h / 2;
            int i10 = bVar2.f5812i / 2;
            int i11 = i10 - 7;
            int i12 = i9 + 7 + 1;
            int i13 = i12;
            int i14 = i11;
            while (true) {
                i14--;
                if (!f(i13, i14) || this.a.b(i13, i14)) {
                    int i15 = i13 - 1;
                    int i16 = i14 + 1;
                } else {
                    i13++;
                }
            }
            int i152 = i13 - 1;
            int i162 = i14 + 1;
            while (f(i152, i162) && !this.a.b(i152, i162)) {
                i152++;
            }
            int i17 = i152 - 1;
            while (f(i17, i162) && !this.a.b(i17, i162)) {
                i162--;
            }
            s sVar9 = new s((float) i17, (float) (i162 + 1));
            int i18 = i10 + 7;
            int i19 = i18;
            while (true) {
                i19++;
                if (!f(i12, i19) || this.a.b(i12, i19)) {
                    int i20 = i12 - 1;
                    int i21 = i19 - 1;
                } else {
                    i12++;
                }
            }
            int i202 = i12 - 1;
            int i212 = i19 - 1;
            while (f(i202, i212) && !this.a.b(i202, i212)) {
                i202++;
            }
            int i22 = i202 - 1;
            while (f(i22, i212) && !this.a.b(i22, i212)) {
                i212++;
            }
            s sVar10 = new s((float) i22, (float) (i212 - 1));
            int i23 = i9 - 7;
            int i24 = i23 - 1;
            while (true) {
                i18++;
                if (!f(i24, i18) || this.a.b(i24, i18)) {
                    int i25 = i24 + 1;
                    int i26 = i18 - 1;
                } else {
                    i24--;
                }
            }
            int i252 = i24 + 1;
            int i262 = i18 - 1;
            while (f(i252, i262) && !this.a.b(i252, i262)) {
                i252--;
            }
            int i27 = i252 + 1;
            while (f(i27, i262) && !this.a.b(i27, i262)) {
                i262++;
            }
            s sVar11 = new s((float) i27, (float) (i262 - 1));
            do {
                i23--;
                i11--;
                if (!f(i23, i11) || this.a.b(i23, i11)) {
                    int i28 = i23 + 1;
                    int i29 = i11 + 1;
                }
                i23--;
                i11--;
                break;
            } while (this.a.b(i23, i11));
            int i282 = i23 + 1;
            int i292 = i11 + 1;
            while (f(i282, i292) && !this.a.b(i282, i292)) {
                i282--;
            }
            int i30 = i282 + 1;
            while (f(i30, i292) && !this.a.b(i30, i292)) {
                i292--;
            }
            sVar4 = new s((float) i30, (float) (i292 + 1));
            sVar = sVar11;
            sVar2 = sVar10;
            sVar3 = sVar9;
        }
        int g0 = g.g0((((sVar3.a + sVar4.a) + sVar2.a) + sVar.a) / 4.0f);
        int g02 = g.g0((((sVar3.f5775b + sVar4.f5775b) + sVar2.f5775b) + sVar.f5775b) / 4.0f);
        try {
            s[] b3 = new b.l.f.y.k.a(this.a, 15, g0, g02).b();
            sVar7 = b3[0];
            sVar6 = b3[1];
            sVar5 = b3[2];
            sVar8 = b3[3];
        } catch (m unused2) {
            int i31 = g02 - 7;
            int i32 = g0 + 7 + 1;
            int i33 = i32;
            int i34 = i31;
            while (true) {
                i34--;
                if (!f(i33, i34) || this.a.b(i33, i34)) {
                    int i35 = i33 - 1;
                    int i36 = i34 + 1;
                } else {
                    i33++;
                }
            }
            int i352 = i33 - 1;
            int i362 = i34 + 1;
            while (f(i352, i362) && !this.a.b(i352, i362)) {
                i352++;
            }
            int i37 = i352 - 1;
            while (f(i37, i362) && !this.a.b(i37, i362)) {
                i362--;
            }
            s sVar12 = new s((float) i37, (float) (i362 + 1));
            int i38 = g02 + 7;
            int i39 = i38;
            while (true) {
                i39++;
                if (!f(i32, i39) || this.a.b(i32, i39)) {
                    int i40 = i32 - 1;
                    int i41 = i39 - 1;
                } else {
                    i32++;
                }
            }
            int i402 = i32 - 1;
            int i412 = i39 - 1;
            while (f(i402, i412) && !this.a.b(i402, i412)) {
                i402++;
            }
            int i42 = i402 - 1;
            while (f(i42, i412) && !this.a.b(i42, i412)) {
                i412++;
            }
            s sVar13 = new s((float) i42, (float) (i412 - 1));
            int i43 = g0 - 7;
            int i44 = i43 - 1;
            while (true) {
                i38++;
                if (!f(i44, i38) || this.a.b(i44, i38)) {
                    int i45 = i44 + 1;
                    int i46 = i38 - 1;
                } else {
                    i44--;
                }
            }
            int i452 = i44 + 1;
            int i462 = i38 - 1;
            while (f(i452, i462) && !this.a.b(i452, i462)) {
                i452--;
            }
            int i47 = i452 + 1;
            while (f(i47, i462) && !this.a.b(i47, i462)) {
                i462++;
            }
            s sVar14 = new s((float) i47, (float) (i462 - 1));
            do {
                i43--;
                i31--;
                if (!f(i43, i31) || this.a.b(i43, i31)) {
                    int i48 = i43 + 1;
                    int i49 = i31 + 1;
                }
                i43--;
                i31--;
                break;
            } while (this.a.b(i43, i31));
            int i482 = i43 + 1;
            int i492 = i31 + 1;
            while (f(i482, i492) && !this.a.b(i482, i492)) {
                i482--;
            }
            int i50 = i482 + 1;
            while (f(i50, i492) && !this.a.b(i50, i492)) {
                i492--;
            }
            sVar8 = new s((float) i50, (float) (i492 + 1));
            sVar7 = sVar12;
            s sVar15 = sVar13;
            sVar5 = sVar14;
            sVar6 = sVar15;
        }
        C0099a aVar2 = new C0099a(g.g0((((sVar7.a + sVar8.a) + sVar6.a) + sVar5.a) / 4.0f), g.g0((((sVar7.f5775b + sVar8.f5775b) + sVar6.f5775b) + sVar5.f5775b) / 4.0f));
        this.f5788e = 1;
        boolean z2 = true;
        C0099a aVar3 = aVar2;
        C0099a aVar4 = aVar3;
        C0099a aVar5 = aVar4;
        while (this.f5788e < 9) {
            C0099a e2 = e(aVar2, z2, i8, i7);
            C0099a e3 = e(aVar3, z2, i8, i8);
            C0099a e4 = e(aVar4, z2, i7, i8);
            C0099a e5 = e(aVar5, z2, i7, i7);
            if (this.f5788e > i6) {
                double m2 = (double) ((g.m(e5.a, e5.f5789b, e2.a, e2.f5789b) * ((float) this.f5788e)) / (g.m(aVar5.a, aVar5.f5789b, aVar2.a, aVar2.f5789b) * ((float) (this.f5788e + i6))));
                if (m2 < 0.75d || m2 > 1.25d) {
                    break;
                }
                C0099a aVar6 = new C0099a(e2.a - 3, e2.f5789b + 3);
                C0099a aVar7 = new C0099a(e3.a - 3, e3.f5789b - 3);
                C0099a aVar8 = new C0099a(e4.a + 3, e4.f5789b - 3);
                aVar = e2;
                C0099a aVar9 = new C0099a(e5.a + 3, e5.f5789b + 3);
                int c2 = c(aVar9, aVar6);
                if (!(c2 != 0 && c(aVar6, aVar7) == c2 && c(aVar7, aVar8) == c2 && c(aVar8, aVar9) == c2)) {
                    break;
                }
            } else {
                aVar = e2;
            }
            z2 = !z2;
            this.f5788e++;
            aVar5 = e5;
            aVar3 = e3;
            aVar4 = e4;
            aVar2 = aVar;
            i6 = 2;
            i7 = -1;
            i8 = 1;
        }
        int i51 = this.f5788e;
        if (i51 == 5 || i51 == 7) {
            this.f5787b = i51 == 5;
            int i52 = i51 * 2;
            s[] b4 = b(new s[]{new s(((float) aVar2.a) + 0.5f, ((float) aVar2.f5789b) - 0.5f), new s(((float) aVar3.a) + 0.5f, ((float) aVar3.f5789b) + 0.5f), new s(((float) aVar4.a) - 0.5f, ((float) aVar4.f5789b) + 0.5f), new s(((float) aVar5.a) - 0.5f, ((float) aVar5.f5789b) - 0.5f)}, i52 - 3, i52);
            if (z) {
                s sVar16 = b4[0];
                b4[0] = b4[2];
                b4[2] = sVar16;
            }
            if (!g(b4[0]) || !g(b4[1]) || !g(b4[2]) || !g(b4[3])) {
                throw m.f5759j;
            }
            int i53 = this.f5788e * 2;
            int[] iArr = {h(b4[0], b4[1], i53), h(b4[1], b4[2], i53), h(b4[2], b4[3], i53), h(b4[3], b4[0], i53)};
            int i54 = 0;
            for (int i55 = 0; i55 < 4; i55++) {
                int i56 = iArr[i55];
                i54 = (i54 << 3) + ((i56 >> (i53 - 2)) << 1) + (i56 & 1);
            }
            int i57 = ((i54 & 1) << 11) + (i54 >> 1);
            for (int i58 = 0; i58 < 4; i58++) {
                if (Integer.bitCount(f5786g[i58] ^ i57) <= 2) {
                    this.f = i58;
                    long j3 = 0;
                    for (int i59 = 0; i59 < 4; i59++) {
                        int i60 = iArr[(this.f + i59) % 4];
                        if (this.f5787b) {
                            j2 = j3 << 7;
                            i5 = (i60 >> 1) & 127;
                        } else {
                            j2 = j3 << 10;
                            i5 = ((i60 >> 1) & 31) + ((i60 >> 2) & 992);
                        }
                        j3 = j2 + ((long) i5);
                    }
                    int i61 = 7;
                    if (this.f5787b) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                        i61 = 10;
                    }
                    int i62 = i61 - i2;
                    int[] iArr2 = new int[i61];
                    while (true) {
                        i61--;
                        if (i61 >= 0) {
                            iArr2[i61] = ((int) j3) & 15;
                            j3 >>= 4;
                        } else {
                            try {
                                break;
                            } catch (e unused3) {
                                throw m.f5759j;
                            }
                        }
                    }
                    new c(b.l.f.y.l.a.f5845k).a(iArr2, i62);
                    int i63 = 0;
                    for (int i64 = 0; i64 < i2; i64++) {
                        i63 = (i63 << 4) + iArr2[i64];
                    }
                    if (this.f5787b) {
                        i3 = 1;
                        this.c = (i63 >> 6) + 1;
                        i4 = i63 & 63;
                    } else {
                        i3 = 1;
                        this.c = (i63 >> 11) + 1;
                        i4 = i63 & 2047;
                    }
                    this.d = i4 + i3;
                    b bVar3 = this.a;
                    int i65 = this.f;
                    s sVar17 = b4[i65 % 4];
                    s sVar18 = b4[(i65 + 1) % 4];
                    s sVar19 = b4[(i65 + 2) % 4];
                    s sVar20 = b4[(i65 + 3) % 4];
                    f fVar = f.a;
                    int d2 = d();
                    float f2 = ((float) d2) / 2.0f;
                    float f3 = (float) this.f5788e;
                    float f4 = f2 - f3;
                    float f5 = f2 + f3;
                    return new b.l.f.w.a(fVar.a(bVar3, d2, d2, i.a(f4, f4, f5, f4, f5, f5, f4, f5, sVar17.a, sVar17.f5775b, sVar18.a, sVar18.f5775b, sVar19.a, sVar19.f5775b, sVar20.a, sVar20.f5775b)), b(b4, this.f5788e * 2, d()), this.f5787b, this.d, this.c);
                }
            }
            throw m.f5759j;
        }
        throw m.f5759j;
    }

    public final int c(C0099a aVar, C0099a aVar2) {
        float m2 = g.m(aVar.a, aVar.f5789b, aVar2.a, aVar2.f5789b);
        int i2 = aVar2.a;
        int i3 = aVar.a;
        float f2 = ((float) (i2 - i3)) / m2;
        int i4 = aVar2.f5789b;
        int i5 = aVar.f5789b;
        float f3 = ((float) (i4 - i5)) / m2;
        float f4 = (float) i3;
        float f5 = (float) i5;
        boolean b2 = this.a.b(i3, i5);
        int ceil = (int) Math.ceil((double) m2);
        boolean z = false;
        int i6 = 0;
        for (int i7 = 0; i7 < ceil; i7++) {
            f4 += f2;
            f5 += f3;
            if (this.a.b(g.g0(f4), g.g0(f5)) != b2) {
                i6++;
            }
        }
        float f6 = ((float) i6) / m2;
        if (f6 > 0.1f && f6 < 0.9f) {
            return 0;
        }
        if (f6 <= 0.1f) {
            z = true;
        }
        return z == b2 ? 1 : -1;
    }

    public final int d() {
        if (this.f5787b) {
            return (this.c * 4) + 11;
        }
        int i2 = this.c;
        if (i2 <= 4) {
            return (i2 * 4) + 15;
        }
        return ((((i2 - 4) / 8) + 1) * 2) + (i2 * 4) + 15;
    }

    public final C0099a e(C0099a aVar, boolean z, int i2, int i3) {
        int i4 = aVar.a + i2;
        int i5 = aVar.f5789b;
        while (true) {
            i5 += i3;
            if (!f(i4, i5) || this.a.b(i4, i5) != z) {
                int i6 = i4 - i2;
                int i7 = i5 - i3;
            } else {
                i4 += i2;
            }
        }
        int i62 = i4 - i2;
        int i72 = i5 - i3;
        while (f(i62, i72) && this.a.b(i62, i72) == z) {
            i62 += i2;
        }
        int i8 = i62 - i2;
        while (f(i8, i72) && this.a.b(i8, i72) == z) {
            i72 += i3;
        }
        return new C0099a(i8, i72 - i3);
    }

    public final boolean f(int i2, int i3) {
        if (i2 < 0) {
            return false;
        }
        b bVar = this.a;
        return i2 < bVar.f5811h && i3 > 0 && i3 < bVar.f5812i;
    }

    public final boolean g(s sVar) {
        return f(g.g0(sVar.a), g.g0(sVar.f5775b));
    }

    public final int h(s sVar, s sVar2, int i2) {
        float l2 = g.l(sVar.a, sVar.f5775b, sVar2.a, sVar2.f5775b);
        float f2 = l2 / ((float) i2);
        float f3 = sVar.a;
        float f4 = sVar.f5775b;
        float f5 = ((sVar2.a - f3) * f2) / l2;
        float f6 = ((sVar2.f5775b - f4) * f2) / l2;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            float f7 = (float) i4;
            if (this.a.b(g.g0((f7 * f5) + f3), g.g0((f7 * f6) + f4))) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }
}
