package b.l.a.c.f.e;

import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class g0<T> implements o0<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f2985p = new int[0];

    /* renamed from: q  reason: collision with root package name */
    public static final Unsafe f2986q = n1.t();
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2987b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f2988e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2989g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2990h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f2991i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2992j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2993k;

    /* renamed from: l  reason: collision with root package name */
    public final s f2994l;

    /* renamed from: m  reason: collision with root package name */
    public final c1<?, ?> f2995m;

    /* renamed from: n  reason: collision with root package name */
    public final gn<?> f2996n;

    /* renamed from: o  reason: collision with root package name */
    public final a0 f2997o;

    public g0(int[] iArr, Object[] objArr, int i2, int i3, e0 e0Var, boolean z, int[] iArr2, int i4, int i5, i0 i0Var, s sVar, c1 c1Var, gn gnVar, a0 a0Var) {
        this.a = iArr;
        this.f2987b = objArr;
        this.c = i2;
        this.d = i3;
        this.f2989g = e0Var instanceof e;
        this.f2990h = z;
        this.f = gnVar != null && gnVar.a(e0Var);
        this.f2991i = iArr2;
        this.f2992j = i4;
        this.f2993k = i5;
        this.f2994l = sVar;
        this.f2995m = c1Var;
        this.f2996n = gnVar;
        this.f2988e = e0Var;
        this.f2997o = a0Var;
    }

    public static final void C(int i2, Object obj, cn cnVar) {
        if (obj instanceof String) {
            cnVar.a.s(i2, (String) obj);
            return;
        }
        cnVar.a.t(i2, (um) obj);
    }

    public static d1 D(Object obj) {
        e eVar = (e) obj;
        d1 d1Var = eVar.zzc;
        if (d1Var != d1.f) {
            return d1Var;
        }
        d1 a2 = d1.a();
        eVar.zzc = a2;
        return a2;
    }

    public static <T> g0 F(c0 c0Var, i0 i0Var, s sVar, c1 c1Var, gn gnVar, a0 a0Var) {
        if (c0Var instanceof n0) {
            return G((n0) c0Var, i0Var, sVar, c1Var, gnVar, a0Var);
        }
        a1 a1Var = (a1) c0Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0395  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> b.l.a.c.f.e.g0<T> G(b.l.a.c.f.e.n0 r35, b.l.a.c.f.e.i0 r36, b.l.a.c.f.e.s r37, b.l.a.c.f.e.c1<?, ?> r38, b.l.a.c.f.e.gn<?> r39, b.l.a.c.f.e.a0 r40) {
        /*
            r0 = r35
            int r1 = r0.d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x000b
            r1 = r2
            goto L_0x000c
        L_0x000b:
            r1 = r3
        L_0x000c:
            r4 = 0
            if (r1 != r3) goto L_0x0011
            r11 = r2
            goto L_0x0012
        L_0x0011:
            r11 = r4
        L_0x0012:
            java.lang.String r1 = r0.f3180b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x002c
            r5 = r2
        L_0x0022:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x002d
            r5 = r7
            goto L_0x0022
        L_0x002c:
            r7 = r2
        L_0x002d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x004c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0039:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0049
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0039
        L_0x0049:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x004c:
            if (r7 != 0) goto L_0x0059
            int[] r7 = f2985p
            r9 = r4
            r10 = r9
            r12 = r10
            r14 = r12
            r15 = r14
            r13 = r7
            r7 = r15
            goto L_0x016a
        L_0x0059:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0065:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0075
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0065
        L_0x0075:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0078:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0097
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0084:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0094
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0084
        L_0x0094:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0097:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a3
        L_0x00b3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x016a:
            sun.misc.Unsafe r8 = f2986q
            java.lang.Object[] r2 = r0.c
            b.l.a.c.f.e.e0 r6 = r0.a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L_0x0189:
            if (r7 >= r3) goto L_0x03e8
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L_0x019e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L_0x019e
        L_0x01b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r15
            r3 = r25
        L_0x01c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01d4
        L_0x01ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L_0x01f7
        L_0x01f3:
            r29 = r10
            r15 = r25
        L_0x01f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L_0x0205:
            r9 = 51
            if (r10 < r9) goto L_0x02b2
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L_0x0220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L_0x023f
        L_0x023d:
            r9 = r27
        L_0x023f:
            r27 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x0260
            r0 = 17
            if (r9 != r0) goto L_0x024c
            goto L_0x0260
        L_0x024c:
            r0 = 12
            if (r9 != r0) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L_0x026d
        L_0x0260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L_0x026d:
            r14 = r9
        L_0x026e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0280
        L_0x0278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = H(r6, r0)
            r2[r15] = r0
        L_0x0280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029b
        L_0x0293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = H(r6, r4)
            r2[r15] = r4
        L_0x029b:
            long r4 = r8.objectFieldOffset(r4)
            int r4 = (int) r4
            r19 = r1
            r30 = r4
            r31 = r14
            r15 = r27
            r18 = 1
            r4 = r0
            r14 = r6
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            goto L_0x03ae
        L_0x02b2:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = H(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0327
            r14 = 17
            if (r10 != r14) goto L_0x02ca
            goto L_0x0327
        L_0x02ca:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r5) goto L_0x02d1
            goto L_0x0316
        L_0x02d1:
            r14 = 12
            if (r10 == r14) goto L_0x0306
            r14 = 30
            if (r10 == r14) goto L_0x0306
            r14 = 44
            if (r10 != r14) goto L_0x02de
            goto L_0x0306
        L_0x02de:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02ff
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0303
        L_0x02ff:
            r23 = r14
            r0 = r27
        L_0x0303:
            r18 = 1
            goto L_0x0334
        L_0x0306:
            if (r11 != 0) goto L_0x0303
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L_0x0323
        L_0x0316:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L_0x0323:
            r14 = r6
            r0 = r27
            goto L_0x0335
        L_0x0327:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L_0x0334:
            r14 = r6
        L_0x0335:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0395
            r5 = 17
            if (r10 > r5) goto L_0x0395
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0369
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0353:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0365
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L_0x0353
        L_0x0365:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L_0x036b
        L_0x0369:
            r30 = r5
        L_0x036b:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x037a
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0382
        L_0x037a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = H(r14, r5)
            r2[r19] = r5
        L_0x0382:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r0 = (int) r0
            int r6 = r6 % 32
            r15 = r30
            r30 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a0
        L_0x0395:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            r30 = 1048575(0xfffff, float:1.469367E-39)
        L_0x03a0:
            r1 = 18
            if (r10 < r1) goto L_0x03ae
            r1 = 49
            if (r10 > r1) goto L_0x03ae
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L_0x03ae:
            int r1 = r20 + 1
            r32[r20] = r7
            int r5 = r1 + 1
            r7 = r3 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x03bb
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bc
        L_0x03bb:
            r7 = 0
        L_0x03bc:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c3
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c4
        L_0x03c3:
            r3 = 0
        L_0x03c4:
            r3 = r3 | r7
            int r7 = r10 << 20
            r3 = r3 | r7
            r3 = r3 | r4
            r32[r1] = r3
            int r20 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r30
            r32[r5] = r1
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L_0x0189
        L_0x03e8:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            b.l.a.c.f.e.g0 r0 = new b.l.a.c.f.e.g0
            r1 = r35
            b.l.a.c.f.e.e0 r10 = r1.a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.G(b.l.a.c.f.e.n0, b.l.a.c.f.e.i0, b.l.a.c.f.e.s, b.l.a.c.f.e.c1, b.l.a.c.f.e.gn, b.l.a.c.f.e.a0):b.l.a.c.f.e.g0");
    }

    public static Field H(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            a.L(sb, "Field ", str, " for ", name);
            throw new RuntimeException(a.q(sb, " not found. Known fields are ", arrays));
        }
    }

    public static <T> double o(T t, long j2) {
        return ((Double) n1.q(t, j2)).doubleValue();
    }

    public static <T> float p(T t, long j2) {
        return ((Float) n1.q(t, j2)).floatValue();
    }

    public static <T> int q(T t, long j2) {
        return ((Integer) n1.q(t, j2)).intValue();
    }

    public static <T> long r(T t, long j2) {
        return ((Long) n1.q(t, j2)).longValue();
    }

    public static <T> boolean s(T t, long j2) {
        return ((Boolean) n1.q(t, j2)).booleanValue();
    }

    public final int A(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019f, code lost:
        b.l.a.c.f.e.q0.h(r11, r6, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        b.l.a.c.f.e.q0.m(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        b.l.a.c.f.e.q0.j(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        b.l.a.c.f.e.q0.o(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        b.l.a.c.f.e.q0.p(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        b.l.a.c.f.e.q0.l(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(T r17, b.l.a.c.f.e.cn r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f
            r4 = 0
            if (r3 != 0) goto L_0x0474
            int[] r3 = r0.a
            int r3 = r3.length
            sun.misc.Unsafe r5 = f2986q
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0016:
            if (r8 >= r3) goto L_0x046a
            int r11 = r0.m(r8)
            int[] r12 = r0.a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L_0x003c
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L_0x0037
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L_0x0037:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0457;
                case 1: goto L_0x044a;
                case 2: goto L_0x043b;
                case 3: goto L_0x042c;
                case 4: goto L_0x041d;
                case 5: goto L_0x040e;
                case 6: goto L_0x03ff;
                case 7: goto L_0x03f0;
                case 8: goto L_0x03e2;
                case 9: goto L_0x03d0;
                case 10: goto L_0x03be;
                case 11: goto L_0x03ae;
                case 12: goto L_0x039e;
                case 13: goto L_0x038e;
                case 14: goto L_0x037e;
                case 15: goto L_0x0370;
                case 16: goto L_0x0362;
                case 17: goto L_0x0350;
                case 18: goto L_0x0340;
                case 19: goto L_0x0330;
                case 20: goto L_0x0320;
                case 21: goto L_0x0310;
                case 22: goto L_0x0300;
                case 23: goto L_0x02f0;
                case 24: goto L_0x02e0;
                case 25: goto L_0x02d0;
                case 26: goto L_0x02c2;
                case 27: goto L_0x02b0;
                case 28: goto L_0x02a2;
                case 29: goto L_0x0298;
                case 30: goto L_0x0291;
                case 31: goto L_0x028a;
                case 32: goto L_0x0283;
                case 33: goto L_0x027c;
                case 34: goto L_0x026f;
                case 35: goto L_0x0260;
                case 36: goto L_0x0251;
                case 37: goto L_0x0242;
                case 38: goto L_0x0233;
                case 39: goto L_0x0224;
                case 40: goto L_0x0214;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f4;
                case 43: goto L_0x01e4;
                case 44: goto L_0x01d4;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01b4;
                case 47: goto L_0x01a4;
                case 48: goto L_0x0194;
                case 49: goto L_0x0181;
                case 50: goto L_0x0172;
                case 51: goto L_0x0163;
                case 52: goto L_0x0154;
                case 53: goto L_0x0143;
                case 54: goto L_0x0132;
                case 55: goto L_0x0121;
                case 56: goto L_0x0110;
                case 57: goto L_0x00ff;
                case 58: goto L_0x00ee;
                case 59: goto L_0x00df;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00b9;
                case 62: goto L_0x00a8;
                case 63: goto L_0x0097;
                case 64: goto L_0x0086;
                case 65: goto L_0x0075;
                case 66: goto L_0x0066;
                case 67: goto L_0x0057;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x029f
        L_0x0044:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            r2.f(r13, r6, r7)
            goto L_0x029f
        L_0x0057:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = r(r1, r6)
            r2.d(r13, r6)
            goto L_0x029f
        L_0x0066:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            r2.c(r13, r6)
            goto L_0x029f
        L_0x0075:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = r(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.q(r13, r6)
            goto L_0x029f
        L_0x0086:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.n(r13, r6)
            goto L_0x029f
        L_0x0097:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.l(r13, r6)
            goto L_0x029f
        L_0x00a8:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.m(r13, r6)
            goto L_0x029f
        L_0x00b9:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.um r6 = (b.l.a.c.f.e.um) r6
            b.l.a.c.f.e.bn r7 = r2.a
            r7.t(r13, r6)
            goto L_0x029f
        L_0x00cc:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            r2.e(r13, r6, r7)
            goto L_0x029f
        L_0x00df:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            C(r13, r6, r2)
            goto L_0x029f
        L_0x00ee:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            boolean r6 = s(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.r(r13, r6)
            goto L_0x029f
        L_0x00ff:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.n(r13, r6)
            goto L_0x029f
        L_0x0110:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = r(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.q(r13, r6)
            goto L_0x029f
        L_0x0121:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = q(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.l(r13, r6)
            goto L_0x029f
        L_0x0132:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = r(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.o(r13, r6)
            goto L_0x029f
        L_0x0143:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = r(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.o(r13, r6)
            goto L_0x029f
        L_0x0154:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            float r6 = p(r1, r6)
            r2.a(r13, r6)
            goto L_0x029f
        L_0x0163:
            boolean r11 = r0.x(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            double r6 = o(r1, r6)
            r2.b(r13, r6)
            goto L_0x029f
        L_0x0172:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x017a
            goto L_0x029f
        L_0x017a:
            java.lang.Object r1 = r0.Q(r8)
            b.l.a.c.f.e.x r1 = (b.l.a.c.f.e.x) r1
            throw r4
        L_0x0181:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            b.l.a.c.f.e.q0.u(r11, r6, r2, r7)
            goto L_0x029f
        L_0x0194:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
        L_0x019f:
            b.l.a.c.f.e.q0.h(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01a4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01a9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.m(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01b4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01b9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.j(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01c4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01c9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.o(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01d4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01d9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.p(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01e4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01e9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.l(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01f4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.q(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0204:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.n(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0214:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.i(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0224:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.k(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0233:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.g(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0242:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.f(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0251:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.e(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0260:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.d(r11, r6, r2, r12)
            goto L_0x029f
        L_0x026f:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            goto L_0x019f
        L_0x027c:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01a9
        L_0x0283:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01b9
        L_0x028a:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01c9
        L_0x0291:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01d9
        L_0x0298:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01e9
        L_0x029f:
            r14 = 0
            goto L_0x0463
        L_0x02a2:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.s(r11, r6, r2)
            goto L_0x029f
        L_0x02b0:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            b.l.a.c.f.e.q0.t(r11, r6, r2, r7)
            goto L_0x029f
        L_0x02c2:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.r(r11, r6, r2)
            goto L_0x029f
        L_0x02d0:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            b.l.a.c.f.e.q0.q(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02e0:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.n(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02f0:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.i(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0300:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.k(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0310:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.g(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0320:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.f(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0330:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.e(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0340:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.e.q0.d(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0350:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            r2.f(r13, r6, r7)
            goto L_0x0463
        L_0x0362:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            r2.d(r13, r6)
            goto L_0x0463
        L_0x0370:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            r2.c(r13, r6)
            goto L_0x0463
        L_0x037e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.q(r13, r6)
            goto L_0x0463
        L_0x038e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.n(r13, r6)
            goto L_0x0463
        L_0x039e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.l(r13, r6)
            goto L_0x0463
        L_0x03ae:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.m(r13, r6)
            goto L_0x0463
        L_0x03be:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.um r6 = (b.l.a.c.f.e.um) r6
            b.l.a.c.f.e.bn r7 = r2.a
            r7.t(r13, r6)
            goto L_0x0463
        L_0x03d0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.e.o0 r7 = r0.P(r8)
            r2.e(r13, r6, r7)
            goto L_0x0463
        L_0x03e2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            C(r13, r6, r2)
            goto L_0x0463
        L_0x03f0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            boolean r6 = b.l.a.c.f.e.n1.m(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.r(r13, r6)
            goto L_0x0463
        L_0x03ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.n(r13, r6)
            goto L_0x0463
        L_0x040e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.q(r13, r6)
            goto L_0x0463
        L_0x041d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.e.bn r7 = r2.a
            r7.l(r13, r6)
            goto L_0x0463
        L_0x042c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.o(r13, r6)
            goto L_0x0463
        L_0x043b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.e.bn r11 = r2.a
            r11.o(r13, r6)
            goto L_0x0463
        L_0x044a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            float r6 = b.l.a.c.f.e.n1.n(r1, r6)
            r2.a(r13, r6)
            goto L_0x0463
        L_0x0457:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            double r6 = b.l.a.c.f.e.n1.o(r1, r6)
            r2.b(r13, r6)
        L_0x0463:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0016
        L_0x046a:
            b.l.a.c.f.e.c1<?, ?> r3 = r0.f2995m
            java.lang.Object r1 = r3.j(r1)
            r3.r(r1, r2)
            return
        L_0x0474:
            b.l.a.c.f.e.gn<?> r2 = r0.f2996n
            r2.b(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.B(java.lang.Object, b.l.a.c.f.e.cn):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0294, code lost:
        r7 = r7 | r8;
        r0 = r4;
        r23 = r6;
        r12 = r10;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029f, code lost:
        r23 = r6;
        r27 = r9;
        r8 = r5;
        r17 = r18;
        r2 = r13;
        r14 = null;
        r6 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0122, code lost:
        r9.putInt(r14, r25, r3);
        r5 = r0;
        r19 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        r10 = r0;
        r13 = r4;
        r19 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0133, code lost:
        r18 = 65535;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0191, code lost:
        r4 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0193, code lost:
        r9.putObject(r14, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ce, code lost:
        r7 = r7 | r8;
        r1 = r34;
        r4 = r0;
        r0 = r3;
        r3 = r5;
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fc, code lost:
        r10 = r0;
        r13 = r4;
        r19 = r6;
        r18 = 65535;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0203, code lost:
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0236, code lost:
        r9.putLong(r30, r2, r21);
        r7 = r7 | r8;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0244, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0264, code lost:
        r7 = r7 | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0265, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0266, code lost:
        r12 = r5;
        r23 = r6;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0413  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E(T r30, byte[] r31, int r32, int r33, int r34, b.l.a.c.f.e.jm r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f2986q
            r16 = 0
            r0 = r32
            r1 = r34
            r3 = r16
            r4 = r3
            r7 = r4
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x043a
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = b.l.a.c.b.a.w1(r0, r12, r4, r11)
            int r4 = r11.a
            r28 = r4
            r4 = r0
            r0 = r28
        L_0x002d:
            int r8 = r0 >>> 3
            r10 = r0 & 7
            r5 = 3
            if (r8 <= r2) goto L_0x0044
            int r3 = r3 / r5
            int r2 = r15.c
            if (r8 < r2) goto L_0x0042
            int r2 = r15.d
            if (r8 > r2) goto L_0x0042
            int r2 = r15.A(r8, r3)
            goto L_0x0048
        L_0x0042:
            r2 = -1
            goto L_0x0048
        L_0x0044:
            int r2 = r15.z(r8)
        L_0x0048:
            r3 = -1
            if (r2 != r3) goto L_0x005b
            r32 = r0
            r17 = r3
            r19 = r6
            r26 = r7
            r20 = r8
            r27 = r9
            r2 = r16
            goto L_0x036b
        L_0x005b:
            int[] r1 = r15.a
            int r18 = r2 + 1
            r5 = r1[r18]
            int r3 = r5 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r20 = r8
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r5 & r17
            r21 = r4
            r22 = r5
            long r4 = (long) r8
            r8 = 17
            if (r3 > r8) goto L_0x02b0
            int r8 = r2 + 2
            r1 = r1[r8]
            int r8 = r1 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r13
            r25 = r4
            if (r1 == r6) goto L_0x0092
            if (r6 == r13) goto L_0x008c
            long r4 = (long) r6
            r9.putInt(r14, r4, r7)
        L_0x008c:
            long r4 = (long) r1
            int r7 = r9.getInt(r14, r4)
            r6 = r1
        L_0x0092:
            r1 = 5
            switch(r3) {
                case 0: goto L_0x026b;
                case 1: goto L_0x0247;
                case 2: goto L_0x021e;
                case 3: goto L_0x021e;
                case 4: goto L_0x0206;
                case 5: goto L_0x01d8;
                case 6: goto L_0x01ba;
                case 7: goto L_0x0197;
                case 8: goto L_0x0178;
                case 9: goto L_0x0152;
                case 10: goto L_0x0138;
                case 11: goto L_0x0206;
                case 12: goto L_0x00f3;
                case 13: goto L_0x01ba;
                case 14: goto L_0x01d8;
                case 15: goto L_0x00e4;
                case 16: goto L_0x00c3;
                default: goto L_0x0096;
            }
        L_0x0096:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 3
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L_0x029f
            b.l.a.c.f.e.o0 r0 = r15.P(r6)
            int r3 = r20 << 3
            r4 = r3 | 4
            r21 = r1
            r1 = r31
            r2 = r13
            r3 = r33
            r12 = r21
            r10 = r5
            r5 = r35
            int r4 = b.l.a.c.b.a.A2(r0, r1, r2, r3, r4, r5)
            r0 = r7 & r8
            if (r0 != 0) goto L_0x0287
            java.lang.Object r0 = r11.c
            goto L_0x0291
        L_0x00c3:
            if (r10 != 0) goto L_0x00de
            r4 = r21
            int r1 = b.l.a.c.b.a.R1(r12, r4, r11)
            long r3 = r11.f3100b
            long r3 = b.l.a.c.f.e.vm.o(r3)
            r10 = r1
            r21 = r3
            r19 = r6
            r18 = -1
            r4 = r0
            r6 = r2
            r2 = r25
            goto L_0x0236
        L_0x00de:
            r10 = r0
            r19 = r6
            r13 = r21
            goto L_0x0133
        L_0x00e4:
            r4 = r21
            if (r10 != 0) goto L_0x012f
            int r1 = b.l.a.c.b.a.Q0(r12, r4, r11)
            int r3 = r11.a
            int r3 = b.l.a.c.f.e.vm.n(r3)
            goto L_0x0122
        L_0x00f3:
            r4 = r21
            if (r10 != 0) goto L_0x012f
            int r1 = b.l.a.c.b.a.Q0(r12, r4, r11)
            int r3 = r11.a
            b.l.a.c.f.e.h r4 = r15.R(r2)
            if (r4 == 0) goto L_0x0120
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            b.l.a.c.f.e.d1 r4 = D(r30)
            long r13 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4.c(r0, r3)
            r14 = r30
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L_0x0265
        L_0x0120:
            r14 = r30
        L_0x0122:
            r4 = r25
            r9.putInt(r14, r4, r3)
            r5 = r0
            r19 = r6
            r18 = -1
            r6 = r2
            goto L_0x0264
        L_0x012f:
            r10 = r0
            r13 = r4
            r19 = r6
        L_0x0133:
            r18 = -1
            r6 = r2
            goto L_0x0203
        L_0x0138:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x01fc
            int r3 = b.l.a.c.b.a.w2(r12, r4, r11)
            java.lang.Object r4 = r11.c
            r9.putObject(r14, r1, r4)
            r1 = r3
            r19 = r6
            r18 = -1
            r6 = r5
            r5 = r0
            goto L_0x0264
        L_0x0152:
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x0174
            b.l.a.c.f.e.o0 r3 = r15.P(r5)
            r13 = r33
            int r3 = b.l.a.c.b.a.y2(r3, r12, r4, r13, r11)
            r4 = r7 & r8
            if (r4 != 0) goto L_0x0169
            goto L_0x0191
        L_0x0169:
            java.lang.Object r4 = r9.getObject(r14, r1)
            java.lang.Object r10 = r11.c
            java.lang.Object r4 = b.l.a.c.f.e.j.c(r4, r10)
            goto L_0x0193
        L_0x0174:
            r13 = r33
            goto L_0x01fc
        L_0x0178:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 2
            if (r10 != r3) goto L_0x01fc
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r22 & r3
            if (r3 != 0) goto L_0x018d
            int r3 = b.l.a.c.b.a.n2(r12, r4, r11)
            goto L_0x0191
        L_0x018d:
            int r3 = b.l.a.c.b.a.r2(r12, r4, r11)
        L_0x0191:
            java.lang.Object r4 = r11.c
        L_0x0193:
            r9.putObject(r14, r1, r4)
            goto L_0x01ce
        L_0x0197:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            if (r10 != 0) goto L_0x01fc
            int r3 = b.l.a.c.b.a.R1(r12, r4, r11)
            r32 = r3
            long r3 = r11.f3100b
            r21 = 0
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01b0
            r3 = 1
            goto L_0x01b2
        L_0x01b0:
            r3 = r16
        L_0x01b2:
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.d(r14, r1, r3)
            r3 = r32
            goto L_0x01ce
        L_0x01ba:
            r13 = r33
            r3 = r1
            r5 = r2
            r4 = r21
            r1 = r25
            if (r10 != r3) goto L_0x01fc
            int r3 = b.l.a.c.b.a.a2(r12, r4)
            r9.putInt(r14, r1, r3)
            int r4 = r4 + 4
            r3 = r4
        L_0x01ce:
            r7 = r7 | r8
            r1 = r34
            r4 = r0
            r0 = r3
            r3 = r5
            r2 = r20
            goto L_0x001a
        L_0x01d8:
            r13 = r33
            r5 = r2
            r4 = r21
            r1 = r25
            r3 = 1
            if (r10 != r3) goto L_0x01fc
            long r21 = b.l.a.c.b.a.h2(r12, r4)
            r10 = r0
            r0 = r9
            r2 = r1
            r1 = r30
            r18 = -1
            r13 = r4
            r19 = r6
            r6 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r13 + 8
            r1 = r4
            r5 = r10
            goto L_0x0264
        L_0x01fc:
            r10 = r0
            r13 = r4
            r19 = r6
            r18 = -1
            r6 = r5
        L_0x0203:
            r5 = r10
            goto L_0x029f
        L_0x0206:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L_0x0244
            int r0 = b.l.a.c.b.a.Q0(r12, r13, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            r1 = r0
            r5 = r4
            goto L_0x0264
        L_0x021e:
            r4 = r0
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r2 = r25
            if (r10 != 0) goto L_0x0244
            int r1 = b.l.a.c.b.a.R1(r12, r13, r11)
            r32 = r1
            long r0 = r11.f3100b
            r10 = r32
            r21 = r0
        L_0x0236:
            r0 = r9
            r1 = r30
            r13 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r7 | r8
            r7 = r0
            r5 = r13
            goto L_0x0266
        L_0x0244:
            r5 = r4
            goto L_0x029f
        L_0x0247:
            r5 = r0
            r3 = r1
            r19 = r6
            r13 = r21
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r3) goto L_0x029f
            int r0 = b.l.a.c.b.a.a2(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.f.e.m1 r3 = b.l.a.c.f.e.n1.f3182e
            r3.f(r14, r1, r0)
            int r4 = r13 + 4
            r1 = r4
        L_0x0264:
            r7 = r7 | r8
        L_0x0265:
            r10 = r1
        L_0x0266:
            r12 = r5
            r23 = r6
            goto L_0x02f2
        L_0x026b:
            r5 = r0
            r19 = r6
            r13 = r21
            r0 = 1
            r18 = -1
            r6 = r2
            r1 = r25
            if (r10 != r0) goto L_0x029f
            long r3 = b.l.a.c.b.a.h2(r12, r13)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            b.l.a.c.f.e.n1.p(r14, r1, r3)
            int r4 = r13 + 8
            r10 = r5
            goto L_0x0294
        L_0x0287:
            java.lang.Object r0 = r9.getObject(r14, r12)
            java.lang.Object r1 = r11.c
            java.lang.Object r0 = b.l.a.c.f.e.j.c(r0, r1)
        L_0x0291:
            r9.putObject(r14, r12, r0)
        L_0x0294:
            r0 = r7 | r8
            r7 = r0
            r0 = r4
            r23 = r6
            r12 = r10
            r6 = r19
            goto L_0x02f5
        L_0x029f:
            r10 = r5
            r21 = r13
            r23 = r6
            r27 = r9
            r8 = r10
            r17 = r18
            r2 = r21
            r14 = 0
            r6 = r34
            goto L_0x03c2
        L_0x02b0:
            r12 = r4
            r8 = r6
            r18 = -1
            r5 = r0
            r6 = r2
            r0 = 2
            r1 = 27
            if (r3 != r1) goto L_0x0312
            if (r10 != r0) goto L_0x0302
            java.lang.Object r0 = r9.getObject(r14, r12)
            b.l.a.c.f.e.i r0 = (b.l.a.c.f.e.i) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x02da
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d2
            r1 = 10
            goto L_0x02d3
        L_0x02d2:
            int r1 = r1 + r1
        L_0x02d3:
            b.l.a.c.f.e.i r0 = r0.h(r1)
            r9.putObject(r14, r12, r0)
        L_0x02da:
            r10 = r0
            b.l.a.c.f.e.o0 r0 = r15.P(r6)
            r1 = r5
            r2 = r31
            r3 = r21
            r4 = r33
            r12 = r5
            r5 = r10
            r23 = r6
            r19 = r8
            r6 = r35
            int r10 = b.l.a.c.b.a.G2(r0, r1, r2, r3, r4, r5, r6)
        L_0x02f2:
            r6 = r19
            r0 = r10
        L_0x02f5:
            r13 = r33
            r1 = r34
            r4 = r12
            r2 = r20
            r3 = r23
            r12 = r31
            goto L_0x001a
        L_0x0302:
            r23 = r6
            r19 = r8
            r32 = r5
            r26 = r7
            r27 = r9
            r17 = r18
            r15 = r21
            goto L_0x0366
        L_0x0312:
            r23 = r6
            r19 = r8
            r8 = r5
            r1 = 49
            if (r3 > r1) goto L_0x0350
            r5 = r22
            long r5 = (long) r5
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r3
            r3 = r21
            r22 = r4
            r4 = r33
            r24 = r5
            r6 = 0
            r5 = r8
            r15 = r6
            r6 = r20
            r26 = r7
            r7 = r10
            r32 = r8
            r10 = r20
            r8 = r23
            r27 = r9
            r17 = r18
            r9 = r24
            r11 = r22
            r15 = r21
            r14 = r35
            int r4 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r4 == r15) goto L_0x0367
            r0 = r4
            goto L_0x03a1
        L_0x0350:
            r26 = r7
            r32 = r8
            r27 = r9
            r17 = r18
            r15 = r21
            r5 = r22
            r22 = r3
            r1 = 50
            r9 = r22
            if (r9 != r1) goto L_0x0386
            if (r10 == r0) goto L_0x0375
        L_0x0366:
            r4 = r15
        L_0x0367:
            r1 = r34
            r2 = r23
        L_0x036b:
            r8 = r32
            r6 = r1
            r23 = r2
            r2 = r4
            r7 = r26
            r14 = 0
            goto L_0x03c2
        L_0x0375:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r23
            r6 = r12
            r0.N(r1, r2, r3, r4, r5, r6)
            r14 = 0
            throw r14
        L_0x0386:
            r14 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r32
            r6 = r20
            r7 = r10
            r10 = r12
            r12 = r23
            r13 = r35
            int r0 = r0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03bb
        L_0x03a1:
            r15 = r29
            r14 = r30
            r12 = r31
            r4 = r32
            r13 = r33
            r1 = r34
            r11 = r35
            r6 = r19
            r2 = r20
            r3 = r23
            r7 = r26
            r9 = r27
            goto L_0x001a
        L_0x03bb:
            r8 = r32
            r6 = r34
            r2 = r0
            r7 = r26
        L_0x03c2:
            if (r8 != r6) goto L_0x03d2
            if (r6 == 0) goto L_0x03d2
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r6
            r4 = r8
            r3 = r14
            r6 = r19
            goto L_0x0443
        L_0x03d2:
            r9 = r29
            r3 = r14
            boolean r0 = r9.f
            if (r0 == 0) goto L_0x0413
            r10 = r35
            b.l.a.c.f.e.fn r0 = r10.d
            b.l.a.c.f.e.fn r1 = b.l.a.c.f.e.fn.a()
            if (r0 == r1) goto L_0x0410
            b.l.a.c.f.e.e0 r0 = r9.f2988e
            b.l.a.c.f.e.fn r1 = r10.d
            java.util.Map<b.l.a.c.f.e.en, b.l.a.c.f.e.d<?, ?>> r1 = r1.a
            b.l.a.c.f.e.en r4 = new b.l.a.c.f.e.en
            r11 = r20
            r4.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r4)
            b.l.a.c.f.e.d r0 = (b.l.a.c.f.e.d) r0
            if (r0 != 0) goto L_0x040a
            b.l.a.c.f.e.d1 r4 = D(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = b.l.a.c.b.a.I2(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0428
        L_0x040a:
            r12 = r30
            r0 = r12
            b.l.a.c.f.e.c r0 = (b.l.a.c.f.e.c) r0
            throw r3
        L_0x0410:
            r12 = r30
            goto L_0x0417
        L_0x0413:
            r12 = r30
            r10 = r35
        L_0x0417:
            r11 = r20
            b.l.a.c.f.e.d1 r4 = D(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = b.l.a.c.b.a.I2(r0, r1, r2, r3, r4, r5)
        L_0x0428:
            r13 = r33
            r1 = r6
            r4 = r8
            r15 = r9
            r2 = r11
            r14 = r12
            r6 = r19
            r3 = r23
            r9 = r27
            r12 = r31
            r11 = r10
            goto L_0x001a
        L_0x043a:
            r19 = r6
            r26 = r7
            r27 = r9
            r12 = r14
            r9 = r15
            r3 = 0
        L_0x0443:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x044e
            long r5 = (long) r6
            r2 = r27
            r2.putInt(r12, r5, r7)
        L_0x044e:
            int r2 = r9.f2992j
        L_0x0450:
            int r5 = r9.f2993k
            if (r2 >= r5) goto L_0x045e
            int[] r5 = r9.f2991i
            r5 = r5[r2]
            r9.k(r12, r5, r3)
            int r2 = r2 + 1
            goto L_0x0450
        L_0x045e:
            r2 = r33
            if (r1 != 0) goto L_0x046a
            if (r0 != r2) goto L_0x0465
            goto L_0x046e
        L_0x0465:
            b.l.a.c.f.e.l r0 = b.l.a.c.f.e.l.f()
            throw r0
        L_0x046a:
            if (r0 > r2) goto L_0x046f
            if (r4 != r1) goto L_0x046f
        L_0x046e:
            return r0
        L_0x046f:
            b.l.a.c.f.e.l r0 = b.l.a.c.f.e.l.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.E(java.lang.Object, byte[], int, int, int, b.l.a.c.f.e.jm):int");
    }

    public final void I(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (v(t2, i2)) {
            Object q2 = n1.q(t, j2);
            Object q3 = n1.q(t2, j2);
            if (q2 != null && q3 != null) {
                n1.f3182e.s(t, j2, j.c(q2, q3));
                w(t, i2);
            } else if (q3 != null) {
                n1.f3182e.s(t, j2, q3);
                w(t, i2);
            }
        }
    }

    public final void J(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (x(t2, i4, i2)) {
            Object q2 = x(t, i4, i2) ? n1.q(t, j2) : null;
            Object q3 = n1.q(t2, j2);
            if (q2 != null && q3 != null) {
                n1.f3182e.s(t, j2, j.c(q2, q3));
                y(t, i4, i2);
            } else if (q3 != null) {
                n1.f3182e.s(t, j2, q3);
                y(t, i4, i2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ac, code lost:
        r4 = r4 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0342, code lost:
        r1 = b.l.a.c.f.e.bn.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x036f, code lost:
        r6 = b.l.a.c.f.e.bn.B(r8);
        r1 = ((b.l.a.c.f.e.um) r1).l();
        r4 = ((b.l.a.c.f.e.bn.b(r1) + r1) + r6) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0395, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03a5, code lost:
        r1 = r0.getInt(r15, r12);
        r6 = b.l.a.c.f.e.bn.B(r8);
        r1 = b.l.a.c.f.e.bn.C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b1, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03bc, code lost:
        r6 = r0.getLong(r15, r12);
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c4, code lost:
        r6 = b.l.a.c.f.e.bn.c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c8, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ce, code lost:
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03d2, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03d9, code lost:
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03dd, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e0, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r1 = b.l.a.c.f.e.bn.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        r6 = b.l.a.c.f.e.bn.B(r8);
        r1 = ((b.l.a.c.f.e.um) r1).l();
        r7 = (b.l.a.c.f.e.bn.b(r1) + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        r1 = q(r15, r12);
        r6 = b.l.a.c.f.e.bn.B(r8);
        r1 = b.l.a.c.f.e.bn.C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        r6 = r(r15, r12);
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        r6 = b.l.a.c.f.e.bn.c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014d, code lost:
        r1 = b.l.a.c.f.e.bn.B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022d, code lost:
        r7 = (b.l.a.c.f.e.bn.b(r1) + b.l.a.c.f.e.bn.B(r8)) + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int K(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f2986q
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x03e7
            int r6 = r14.m(r3)
            int[] r7 = r14.a
            r8 = r7[r3]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r2) goto L_0x0037
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1 = r1 & r6
            long r12 = (long) r1
            switch(r9) {
                case 0: goto L_0x03d5;
                case 1: goto L_0x03ca;
                case 2: goto L_0x03b8;
                case 3: goto L_0x03b3;
                case 4: goto L_0x03a1;
                case 5: goto L_0x039c;
                case 6: goto L_0x0397;
                case 7: goto L_0x038d;
                case 8: goto L_0x0363;
                case 9: goto L_0x0351;
                case 10: goto L_0x0348;
                case 11: goto L_0x0336;
                case 12: goto L_0x0330;
                case 13: goto L_0x032a;
                case 14: goto L_0x0324;
                case 15: goto L_0x0313;
                case 16: goto L_0x0301;
                case 17: goto L_0x02ed;
                case 18: goto L_0x02e1;
                case 19: goto L_0x02d5;
                case 20: goto L_0x02c9;
                case 21: goto L_0x02bc;
                case 22: goto L_0x02af;
                case 23: goto L_0x02e1;
                case 24: goto L_0x02d5;
                case 25: goto L_0x0295;
                case 26: goto L_0x0289;
                case 27: goto L_0x0279;
                case 28: goto L_0x026d;
                case 29: goto L_0x0260;
                case 30: goto L_0x0253;
                case 31: goto L_0x02d5;
                case 32: goto L_0x02e1;
                case 33: goto L_0x0246;
                case 34: goto L_0x0239;
                case 35: goto L_0x0221;
                case 36: goto L_0x0214;
                case 37: goto L_0x0207;
                case 38: goto L_0x01fa;
                case 39: goto L_0x01ed;
                case 40: goto L_0x01e0;
                case 41: goto L_0x01d3;
                case 42: goto L_0x01c4;
                case 43: goto L_0x01b6;
                case 44: goto L_0x01a8;
                case 45: goto L_0x019a;
                case 46: goto L_0x018c;
                case 47: goto L_0x017e;
                case 48: goto L_0x0170;
                case 49: goto L_0x0160;
                case 50: goto L_0x0153;
                case 51: goto L_0x0147;
                case 52: goto L_0x013b;
                case 53: goto L_0x0127;
                case 54: goto L_0x0120;
                case 55: goto L_0x010c;
                case 56: goto L_0x0105;
                case 57: goto L_0x00fe;
                case 58: goto L_0x00f2;
                case 59: goto L_0x00c6;
                case 60: goto L_0x00b2;
                case 61: goto L_0x00a7;
                case 62: goto L_0x0093;
                case 63: goto L_0x008b;
                case 64: goto L_0x0083;
                case 65: goto L_0x007b;
                case 66: goto L_0x0068;
                case 67: goto L_0x0054;
                case 68: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x03e0
        L_0x003e:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.e.e0 r1 = (b.l.a.c.f.e.e0) r1
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.bn.j(r8, r1, r6)
            goto L_0x03df
        L_0x0054:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            long r6 = r(r15, r12)
            int r1 = b.l.a.c.f.e.bn.B(r8)
            long r6 = b.l.a.c.f.e.bn.h(r6)
            goto L_0x0135
        L_0x0068:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            int r1 = q(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.g(r1)
            goto L_0x00a1
        L_0x007b:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x014d
        L_0x0083:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x0141
        L_0x008b:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x0112
        L_0x0093:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            int r1 = q(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
        L_0x00a1:
            int r1 = b.l.a.c.f.e.bn.b(r1)
            goto L_0x03b1
        L_0x00a7:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x00d4
        L_0x00b2:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.q0.P(r8, r1, r6)
            goto L_0x03df
        L_0x00c6:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof b.l.a.c.f.e.um
            if (r6 == 0) goto L_0x00e6
        L_0x00d4:
            b.l.a.c.f.e.um r1 = (b.l.a.c.f.e.um) r1
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = r1.l()
            int r7 = b.l.a.c.f.e.bn.b(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x02ac
        L_0x00e6:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.d(r1)
            goto L_0x03b1
        L_0x00f2:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            int r1 = b.l.a.c.f.e.bn.B(r8)
            goto L_0x0395
        L_0x00fe:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x0141
        L_0x0105:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x014d
        L_0x010c:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
        L_0x0112:
            int r1 = q(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.C(r1)
            goto L_0x03b1
        L_0x0120:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
            goto L_0x012d
        L_0x0127:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
        L_0x012d:
            long r6 = r(r15, r12)
            int r1 = b.l.a.c.f.e.bn.B(r8)
        L_0x0135:
            int r6 = b.l.a.c.f.e.bn.c(r6)
            goto L_0x03c8
        L_0x013b:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
        L_0x0141:
            int r1 = b.l.a.c.f.e.bn.B(r8)
            goto L_0x03d2
        L_0x0147:
            boolean r1 = r14.x(r15, r8, r3)
            if (r1 == 0) goto L_0x03e0
        L_0x014d:
            int r1 = b.l.a.c.f.e.bn.B(r8)
            goto L_0x03dd
        L_0x0153:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.Q(r3)
            b.l.a.c.f.e.a0.a(r8, r1, r6)
            goto L_0x03e0
        L_0x0160:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.q0.S(r8, r1, r6)
            goto L_0x03df
        L_0x0170:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.A(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x017e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.I(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x018c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.M(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x019a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.K(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01a8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.C(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01b6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.G(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01c4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = b.l.a.c.f.e.q0.a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01d3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.K(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01e0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.M(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01ed:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.E(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x01fa:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.y(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x0207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.w(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x0214:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.K(r1)
            if (r1 <= 0) goto L_0x03e0
            goto L_0x022d
        L_0x0221:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.M(r1)
            if (r1 <= 0) goto L_0x03e0
        L_0x022d:
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r7 = b.l.a.c.f.e.bn.b(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
            goto L_0x02ac
        L_0x0239:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = b.l.a.c.f.e.q0.B(r8, r1, r6)
            goto L_0x03df
        L_0x0246:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.e.q0.J(r8, r6, r1)
            goto L_0x03df
        L_0x0253:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.e.q0.D(r8, r6, r1)
            goto L_0x03df
        L_0x0260:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.e.q0.H(r8, r6, r1)
            goto L_0x03df
        L_0x026d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.R(r8, r1)
            goto L_0x03df
        L_0x0279:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.q0.Q(r8, r1, r6)
            goto L_0x03df
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.O(r8, r1)
            goto L_0x03df
        L_0x0295:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = b.l.a.c.f.e.q0.a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x02a5
            r7 = 0
            goto L_0x02ac
        L_0x02a5:
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r6 = r6 + r11
            int r7 = r6 * r1
        L_0x02ac:
            int r4 = r4 + r7
            goto L_0x03e0
        L_0x02af:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = b.l.a.c.f.e.q0.F(r8, r1, r6)
            goto L_0x03df
        L_0x02bc:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.e.q0.z(r8, r6, r1)
            goto L_0x03df
        L_0x02c9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.x(r8, r1)
            goto L_0x03df
        L_0x02d5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.L(r8, r1)
            goto L_0x03df
        L_0x02e1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.e.q0.N(r8, r1)
            goto L_0x03df
        L_0x02ed:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.e.e0 r1 = (b.l.a.c.f.e.e0) r1
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.bn.j(r8, r1, r6)
            goto L_0x03df
        L_0x0301:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            long r6 = r0.getLong(r15, r12)
            int r1 = b.l.a.c.f.e.bn.B(r8)
            long r6 = b.l.a.c.f.e.bn.h(r6)
            goto L_0x03c4
        L_0x0313:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            int r1 = r0.getInt(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.g(r1)
            goto L_0x0342
        L_0x0324:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
            goto L_0x03d9
        L_0x032a:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
            goto L_0x03ce
        L_0x0330:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            goto L_0x03a5
        L_0x0336:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            int r1 = r0.getInt(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
        L_0x0342:
            int r1 = b.l.a.c.f.e.bn.b(r1)
            goto L_0x03b1
        L_0x0348:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x036f
        L_0x0351:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.e.o0 r6 = r14.P(r3)
            int r1 = b.l.a.c.f.e.q0.P(r8, r1, r6)
            goto L_0x03df
        L_0x0363:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof b.l.a.c.f.e.um
            if (r6 == 0) goto L_0x0382
        L_0x036f:
            b.l.a.c.f.e.um r1 = (b.l.a.c.f.e.um) r1
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = r1.l()
            int r7 = b.l.a.c.f.e.bn.b(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r4
            r4 = r7
            goto L_0x03e0
        L_0x0382:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.d(r1)
            goto L_0x03b1
        L_0x038d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
            int r1 = b.l.a.c.f.e.bn.B(r8)
        L_0x0395:
            int r1 = r1 + r11
            goto L_0x03df
        L_0x0397:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
            goto L_0x03ce
        L_0x039c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
            goto L_0x03d9
        L_0x03a1:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
        L_0x03a5:
            int r1 = r0.getInt(r15, r12)
            int r6 = b.l.a.c.f.e.bn.B(r8)
            int r1 = b.l.a.c.f.e.bn.C(r1)
        L_0x03b1:
            int r1 = r1 + r6
            goto L_0x03df
        L_0x03b3:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
            goto L_0x03bc
        L_0x03b8:
            r1 = r7 & r5
            if (r1 == 0) goto L_0x03e0
        L_0x03bc:
            long r6 = r0.getLong(r15, r12)
            int r1 = b.l.a.c.f.e.bn.B(r8)
        L_0x03c4:
            int r6 = b.l.a.c.f.e.bn.c(r6)
        L_0x03c8:
            int r1 = r1 + r6
            goto L_0x03df
        L_0x03ca:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
        L_0x03ce:
            int r1 = b.l.a.c.f.e.bn.B(r8)
        L_0x03d2:
            int r1 = r1 + 4
            goto L_0x03df
        L_0x03d5:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x03e0
        L_0x03d9:
            int r1 = b.l.a.c.f.e.bn.B(r8)
        L_0x03dd:
            int r1 = r1 + 8
        L_0x03df:
            int r4 = r4 + r1
        L_0x03e0:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x03e7:
            b.l.a.c.f.e.c1<?, ?> r0 = r14.f2995m
            java.lang.Object r1 = r0.j(r15)
            int r0 = r0.q(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f
            if (r1 != 0) goto L_0x03f7
            return r0
        L_0x03f7:
            b.l.a.c.f.e.gn<?> r0 = r14.f2996n
            r0.b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.K(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0274, code lost:
        r4 = b.l.a.c.f.e.bn.j(r7, (b.l.a.c.f.e.e0) b.l.a.c.f.e.n1.q(r11, r8), P(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028e, code lost:
        r6 = b.l.a.c.f.e.bn.B(r7);
        r4 = b.l.a.c.f.e.bn.h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a2, code lost:
        r5 = b.l.a.c.f.e.bn.B(r7);
        r4 = b.l.a.c.f.e.bn.g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02cd, code lost:
        r5 = b.l.a.c.f.e.bn.B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d1, code lost:
        r4 = b.l.a.c.f.e.bn.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02dd, code lost:
        r4 = b.l.a.c.f.e.n1.q(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e8, code lost:
        r4 = b.l.a.c.f.e.q0.P(r7, b.l.a.c.f.e.n1.q(r11, r8), P(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0302, code lost:
        if ((r4 instanceof b.l.a.c.f.e.um) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0304, code lost:
        r5 = b.l.a.c.f.e.bn.B(r7);
        r4 = ((b.l.a.c.f.e.um) r4).l();
        r6 = (b.l.a.c.f.e.bn.b(r4) + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0314, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0317, code lost:
        r5 = b.l.a.c.f.e.bn.B(r7);
        r4 = b.l.a.c.f.e.bn.d((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0328, code lost:
        r4 = b.l.a.c.f.e.bn.B(r7) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0343, code lost:
        r4 = b.l.a.c.f.e.n1.j(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0347, code lost:
        r5 = b.l.a.c.f.e.bn.B(r7);
        r4 = b.l.a.c.f.e.bn.C(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034f, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x035e, code lost:
        r4 = b.l.a.c.f.e.n1.k(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0362, code lost:
        r6 = b.l.a.c.f.e.bn.B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0366, code lost:
        r4 = b.l.a.c.f.e.bn.c(r4) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0372, code lost:
        r4 = b.l.a.c.f.e.bn.B(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x037f, code lost:
        r4 = b.l.a.c.f.e.bn.B(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0385, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0386, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if ((r4 instanceof b.l.a.c.f.e.um) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r4 = q(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        r4 = r(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b4, code lost:
        r6 = (b.l.a.c.f.e.bn.b(r4) + b.l.a.c.f.e.bn.B(r7)) + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f2986q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r10.a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x038a
            int r4 = r10.m(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            b.l.a.c.f.e.ln r4 = b.l.a.c.f.e.ln.DOUBLE_LIST_PACKED
            int r4 = r4.f3148h
            if (r5 < r4) goto L_0x002b
            b.l.a.c.f.e.ln r4 = b.l.a.c.f.e.ln.SINT64_LIST_PACKED
            int r4 = r4.f3148h
            if (r5 > r4) goto L_0x002b
            int r4 = r2 + 2
            r4 = r6[r4]
        L_0x002b:
            switch(r5) {
                case 0: goto L_0x0379;
                case 1: goto L_0x036c;
                case 2: goto L_0x0358;
                case 3: goto L_0x0351;
                case 4: goto L_0x033d;
                case 5: goto L_0x0336;
                case 6: goto L_0x032f;
                case 7: goto L_0x0322;
                case 8: goto L_0x02f6;
                case 9: goto L_0x02e2;
                case 10: goto L_0x02d7;
                case 11: goto L_0x02c3;
                case 12: goto L_0x02bb;
                case 13: goto L_0x02b3;
                case 14: goto L_0x02ab;
                case 15: goto L_0x0298;
                case 16: goto L_0x0284;
                case 17: goto L_0x026e;
                case 18: goto L_0x0262;
                case 19: goto L_0x0256;
                case 20: goto L_0x024a;
                case 21: goto L_0x023e;
                case 22: goto L_0x0232;
                case 23: goto L_0x0262;
                case 24: goto L_0x0256;
                case 25: goto L_0x0218;
                case 26: goto L_0x020c;
                case 27: goto L_0x01fc;
                case 28: goto L_0x01f0;
                case 29: goto L_0x01e4;
                case 30: goto L_0x01d8;
                case 31: goto L_0x0256;
                case 32: goto L_0x0262;
                case 33: goto L_0x01cc;
                case 34: goto L_0x01c0;
                case 35: goto L_0x01a8;
                case 36: goto L_0x019b;
                case 37: goto L_0x018e;
                case 38: goto L_0x0181;
                case 39: goto L_0x0174;
                case 40: goto L_0x0167;
                case 41: goto L_0x015a;
                case 42: goto L_0x014b;
                case 43: goto L_0x013d;
                case 44: goto L_0x012f;
                case 45: goto L_0x0121;
                case 46: goto L_0x0113;
                case 47: goto L_0x0105;
                case 48: goto L_0x00f7;
                case 49: goto L_0x00e7;
                case 50: goto L_0x00da;
                case 51: goto L_0x00d2;
                case 52: goto L_0x00ca;
                case 53: goto L_0x00be;
                case 54: goto L_0x00b7;
                case 55: goto L_0x00ab;
                case 56: goto L_0x00a3;
                case 57: goto L_0x009b;
                case 58: goto L_0x0093;
                case 59: goto L_0x0083;
                case 60: goto L_0x007b;
                case 61: goto L_0x0073;
                case 62: goto L_0x0067;
                case 63: goto L_0x0060;
                case 64: goto L_0x0058;
                case 65: goto L_0x0050;
                case 66: goto L_0x0044;
                case 67: goto L_0x0038;
                case 68: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0386
        L_0x0030:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0274
        L_0x0038:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            long r4 = r(r11, r8)
            goto L_0x028e
        L_0x0044:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            int r4 = q(r11, r8)
            goto L_0x02a2
        L_0x0050:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x037f
        L_0x0058:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0372
        L_0x0060:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x00b1
        L_0x0067:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            int r4 = q(r11, r8)
            goto L_0x02cd
        L_0x0073:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x02dd
        L_0x007b:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x02e8
        L_0x0083:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            boolean r5 = r4 instanceof b.l.a.c.f.e.um
            if (r5 == 0) goto L_0x0317
            goto L_0x0304
        L_0x0093:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0328
        L_0x009b:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0372
        L_0x00a3:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x037f
        L_0x00ab:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
        L_0x00b1:
            int r4 = q(r11, r8)
            goto L_0x0347
        L_0x00b7:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x00c4
        L_0x00be:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
        L_0x00c4:
            long r4 = r(r11, r8)
            goto L_0x0362
        L_0x00ca:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0372
        L_0x00d2:
            boolean r4 = r10.x(r11, r7, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x037f
        L_0x00da:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.lang.Object r5 = r10.Q(r2)
            b.l.a.c.f.e.a0.a(r7, r4, r5)
            goto L_0x0386
        L_0x00e7:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.o0 r5 = r10.P(r2)
            int r4 = b.l.a.c.f.e.q0.S(r7, r4, r5)
            goto L_0x0385
        L_0x00f7:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.A(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0105:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.I(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0113:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.M(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0121:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.K(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x012f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.C(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x013d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.G(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x014b:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = b.l.a.c.f.e.q0.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x015a:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.K(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0167:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.M(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0174:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.E(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x0181:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.y(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x018e:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.w(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x019b:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.K(r4)
            if (r4 <= 0) goto L_0x0386
            goto L_0x01b4
        L_0x01a8:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.M(r4)
            if (r4 <= 0) goto L_0x0386
        L_0x01b4:
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r6 = b.l.a.c.f.e.bn.b(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x0314
        L_0x01c0:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.B(r7, r4, r1)
            goto L_0x0385
        L_0x01cc:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.J(r7, r4, r1)
            goto L_0x0385
        L_0x01d8:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.D(r7, r4, r1)
            goto L_0x0385
        L_0x01e4:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.H(r7, r4, r1)
            goto L_0x0385
        L_0x01f0:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.R(r7, r4)
            goto L_0x0385
        L_0x01fc:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.o0 r5 = r10.P(r2)
            int r4 = b.l.a.c.f.e.q0.Q(r7, r4, r5)
            goto L_0x0385
        L_0x020c:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.O(r7, r4)
            goto L_0x0385
        L_0x0218:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = b.l.a.c.f.e.q0.a
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0228
            r5 = r1
            goto L_0x022f
        L_0x0228:
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r5 = r5 + 1
            int r5 = r5 * r4
        L_0x022f:
            int r3 = r3 + r5
            goto L_0x0386
        L_0x0232:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.F(r7, r4, r1)
            goto L_0x0385
        L_0x023e:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.z(r7, r4, r1)
            goto L_0x0385
        L_0x024a:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.x(r7, r4)
            goto L_0x0385
        L_0x0256:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.L(r7, r4)
            goto L_0x0385
        L_0x0262:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.e.q0.N(r7, r4)
            goto L_0x0385
        L_0x026e:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x0274:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            b.l.a.c.f.e.e0 r4 = (b.l.a.c.f.e.e0) r4
            b.l.a.c.f.e.o0 r5 = r10.P(r2)
            int r4 = b.l.a.c.f.e.bn.j(r7, r4, r5)
            goto L_0x0385
        L_0x0284:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            long r4 = b.l.a.c.f.e.n1.k(r11, r8)
        L_0x028e:
            int r6 = b.l.a.c.f.e.bn.B(r7)
            long r4 = b.l.a.c.f.e.bn.h(r4)
            goto L_0x0366
        L_0x0298:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            int r4 = b.l.a.c.f.e.n1.j(r11, r8)
        L_0x02a2:
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r4 = b.l.a.c.f.e.bn.g(r4)
            goto L_0x02d1
        L_0x02ab:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x037f
        L_0x02b3:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0372
        L_0x02bb:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0343
        L_0x02c3:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            int r4 = b.l.a.c.f.e.n1.j(r11, r8)
        L_0x02cd:
            int r5 = b.l.a.c.f.e.bn.B(r7)
        L_0x02d1:
            int r4 = b.l.a.c.f.e.bn.b(r4)
            goto L_0x034f
        L_0x02d7:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x02dd:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            goto L_0x0304
        L_0x02e2:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x02e8:
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            b.l.a.c.f.e.o0 r5 = r10.P(r2)
            int r4 = b.l.a.c.f.e.q0.P(r7, r4, r5)
            goto L_0x0385
        L_0x02f6:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r8)
            boolean r5 = r4 instanceof b.l.a.c.f.e.um
            if (r5 == 0) goto L_0x0317
        L_0x0304:
            b.l.a.c.f.e.um r4 = (b.l.a.c.f.e.um) r4
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r4 = r4.l()
            int r6 = b.l.a.c.f.e.bn.b(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x0314:
            int r3 = r3 + r6
            goto L_0x0386
        L_0x0317:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r4 = b.l.a.c.f.e.bn.d(r4)
            goto L_0x034f
        L_0x0322:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x0328:
            int r4 = b.l.a.c.f.e.bn.B(r7)
            int r4 = r4 + 1
            goto L_0x0385
        L_0x032f:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x0372
        L_0x0336:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x037f
        L_0x033d:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x0343:
            int r4 = b.l.a.c.f.e.n1.j(r11, r8)
        L_0x0347:
            int r5 = b.l.a.c.f.e.bn.B(r7)
            int r4 = b.l.a.c.f.e.bn.C(r4)
        L_0x034f:
            int r4 = r4 + r5
            goto L_0x0385
        L_0x0351:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
            goto L_0x035e
        L_0x0358:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x035e:
            long r4 = b.l.a.c.f.e.n1.k(r11, r8)
        L_0x0362:
            int r6 = b.l.a.c.f.e.bn.B(r7)
        L_0x0366:
            int r4 = b.l.a.c.f.e.bn.c(r4)
            int r4 = r4 + r6
            goto L_0x0385
        L_0x036c:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x0372:
            int r4 = b.l.a.c.f.e.bn.B(r7)
            int r4 = r4 + 4
            goto L_0x0385
        L_0x0379:
            boolean r4 = r10.v(r11, r2)
            if (r4 == 0) goto L_0x0386
        L_0x037f:
            int r4 = b.l.a.c.f.e.bn.B(r7)
            int r4 = r4 + 8
        L_0x0385:
            int r3 = r3 + r4
        L_0x0386:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x038a:
            b.l.a.c.f.e.c1<?, ?> r0 = r10.f2995m
            java.lang.Object r11 = r0.j(r11)
            int r11 = r0.q(r11)
            int r11 = r11 + r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.L(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        if (r7.f3100b != 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0259, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025a, code lost:
        r12.e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025d, code lost:
        if (r4 >= r5) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025f, code lost:
        r6 = b.l.a.c.b.a.Q0(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0265, code lost:
        if (r2 == r7.a) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0268, code lost:
        r4 = b.l.a.c.b.a.R1(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0270, code lost:
        if (r7.f3100b == 0) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0274, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r4 == 0) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        r12.add(b.l.a.c.f.e.um.J(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r1 >= r5) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        r4 = b.l.a.c.b.a.Q0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r2 == r7.a) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0132, code lost:
        r1 = b.l.a.c.b.a.Q0(r3, r4, r7);
        r4 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        if (r4 < 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013e, code lost:
        if (r4 != 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0140, code lost:
        r12.add(b.l.a.c.f.e.um.f3344i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014a, code lost:
        throw b.l.a.c.f.e.l.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014f, code lost:
        throw b.l.a.c.f.e.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0150, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int M(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, b.l.a.c.f.e.jm r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f2986q
            java.lang.Object r12 = r11.getObject(r1, r9)
            b.l.a.c.f.e.i r12 = (b.l.a.c.f.e.i) r12
            boolean r13 = r12.a()
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 + r13
        L_0x002c:
            b.l.a.c.f.e.i r12 = r12.h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 2
            r11 = 1
            r13 = 0
            switch(r27) {
                case 18: goto L_0x0391;
                case 19: goto L_0x0348;
                case 20: goto L_0x0310;
                case 21: goto L_0x0310;
                case 22: goto L_0x02f5;
                case 23: goto L_0x02b6;
                case 24: goto L_0x0275;
                case 25: goto L_0x0221;
                case 26: goto L_0x0176;
                case 27: goto L_0x015b;
                case 28: goto L_0x010e;
                case 29: goto L_0x02f5;
                case 30: goto L_0x00d8;
                case 31: goto L_0x0275;
                case 32: goto L_0x02b6;
                case 33: goto L_0x0098;
                case 34: goto L_0x0058;
                case 35: goto L_0x0391;
                case 36: goto L_0x0348;
                case 37: goto L_0x0310;
                case 38: goto L_0x0310;
                case 39: goto L_0x02f5;
                case 40: goto L_0x02b6;
                case 41: goto L_0x0275;
                case 42: goto L_0x0221;
                case 43: goto L_0x02f5;
                case 44: goto L_0x00d8;
                case 45: goto L_0x0275;
                case 46: goto L_0x02b6;
                case 47: goto L_0x0098;
                case 48: goto L_0x0058;
                default: goto L_0x003b;
            }
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x03f9
            b.l.a.c.f.e.o0 r1 = r0.P(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = b.l.a.c.b.a.A2(r22, r23, r24, r25, r26, r27)
            goto L_0x03d7
        L_0x0058:
            if (r6 != r10) goto L_0x007c
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0063:
            if (r1 >= r2) goto L_0x0073
            int r1 = b.l.a.c.b.a.R1(r3, r1, r7)
            long r4 = r7.f3100b
            long r4 = b.l.a.c.f.e.vm.o(r4)
            r12.l(r4)
            goto L_0x0063
        L_0x0073:
            if (r1 != r2) goto L_0x0077
            goto L_0x03fa
        L_0x0077:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x007c:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
        L_0x0080:
            int r1 = b.l.a.c.b.a.R1(r3, r4, r7)
            long r8 = r7.f3100b
            long r8 = b.l.a.c.f.e.vm.o(r8)
            r12.l(r8)
            if (r1 >= r5) goto L_0x0097
            int r4 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0080
        L_0x0097:
            return r1
        L_0x0098:
            if (r6 != r10) goto L_0x00bc
            b.l.a.c.f.e.f r12 = (b.l.a.c.f.e.f) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00a3:
            if (r1 >= r2) goto L_0x00b3
            int r1 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r4 = r7.a
            int r4 = b.l.a.c.f.e.vm.n(r4)
            r12.l(r4)
            goto L_0x00a3
        L_0x00b3:
            if (r1 != r2) goto L_0x00b7
            goto L_0x03fa
        L_0x00b7:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x00bc:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.f.e.f r12 = (b.l.a.c.f.e.f) r12
        L_0x00c0:
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            int r4 = b.l.a.c.f.e.vm.n(r4)
            r12.l(r4)
            if (r1 >= r5) goto L_0x00d7
            int r4 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x00c0
        L_0x00d7:
            return r1
        L_0x00d8:
            if (r6 != r10) goto L_0x00df
            int r2 = b.l.a.c.b.a.E2(r3, r4, r12, r7)
            goto L_0x00f0
        L_0x00df:
            if (r6 != 0) goto L_0x03f9
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = b.l.a.c.b.a.C2(r2, r3, r4, r5, r6, r7)
        L_0x00f0:
            b.l.a.c.f.e.e r1 = (b.l.a.c.f.e.e) r1
            b.l.a.c.f.e.d1 r3 = r1.zzc
            b.l.a.c.f.e.d1 r4 = b.l.a.c.f.e.d1.f
            if (r3 != r4) goto L_0x00f9
            r3 = 0
        L_0x00f9:
            b.l.a.c.f.e.h r4 = r0.R(r8)
            b.l.a.c.f.e.c1<?, ?> r5 = r0.f2995m
            r6 = r22
            java.lang.Object r3 = b.l.a.c.f.e.q0.b(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x0109
            goto L_0x0242
        L_0x0109:
            b.l.a.c.f.e.d1 r3 = (b.l.a.c.f.e.d1) r3
            r1.zzc = r3
            return r2
        L_0x010e:
            if (r6 != r10) goto L_0x03f9
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x0156
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0151
            if (r4 != 0) goto L_0x011f
            goto L_0x0140
        L_0x011f:
            b.l.a.c.f.e.um r6 = b.l.a.c.f.e.um.J(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0127:
            if (r1 >= r5) goto L_0x0150
            int r4 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0132
            goto L_0x0150
        L_0x0132:
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x014b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0146
            if (r4 != 0) goto L_0x011f
        L_0x0140:
            b.l.a.c.f.e.um r4 = b.l.a.c.f.e.um.f3344i
            r12.add(r4)
            goto L_0x0127
        L_0x0146:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x014b:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x0150:
            return r1
        L_0x0151:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x0156:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x015b:
            if (r6 == r10) goto L_0x015f
            goto L_0x03f9
        L_0x015f:
            b.l.a.c.f.e.o0 r1 = r0.P(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = b.l.a.c.b.a.G2(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x0176:
            if (r6 != r10) goto L_0x03f9
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01c3
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01be
            if (r4 != 0) goto L_0x018e
            goto L_0x01ad
        L_0x018e:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = b.l.a.c.f.e.j.a
            r8.<init>(r3, r1, r4, r9)
        L_0x0195:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x0199:
            if (r1 >= r5) goto L_0x03fa
            int r4 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x03fa
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01b9
            if (r4 != 0) goto L_0x01b1
        L_0x01ad:
            r12.add(r6)
            goto L_0x0199
        L_0x01b1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = b.l.a.c.f.e.j.a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0195
        L_0x01b9:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x01be:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x01c3:
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x021c
            if (r4 != 0) goto L_0x01cf
        L_0x01cd:
            r8 = r1
            goto L_0x01f6
        L_0x01cf:
            int r8 = r1 + r4
            boolean r9 = b.l.a.c.f.e.s1.a(r3, r1, r8)
            if (r9 == 0) goto L_0x0217
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = b.l.a.c.f.e.j.a
            r9.<init>(r3, r1, r4, r10)
        L_0x01de:
            r12.add(r9)
        L_0x01e1:
            if (r8 >= r5) goto L_0x0214
            int r1 = b.l.a.c.b.a.Q0(r3, r8, r7)
            int r4 = r7.a
            if (r2 != r4) goto L_0x0214
            int r1 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x020f
            if (r4 != 0) goto L_0x01fa
            goto L_0x01cd
        L_0x01f6:
            r12.add(r6)
            goto L_0x01e1
        L_0x01fa:
            int r8 = r1 + r4
            boolean r9 = b.l.a.c.f.e.s1.a(r3, r1, r8)
            if (r9 == 0) goto L_0x020a
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = b.l.a.c.f.e.j.a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01de
        L_0x020a:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.g()
            throw r1
        L_0x020f:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x0214:
            r1 = r8
            goto L_0x03fa
        L_0x0217:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.g()
            throw r1
        L_0x021c:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.b()
            throw r1
        L_0x0221:
            r1 = 0
            if (r6 != r10) goto L_0x024a
            b.l.a.c.f.e.km r12 = (b.l.a.c.f.e.km) r12
            int r2 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x022d:
            if (r2 >= r4) goto L_0x0240
            int r2 = b.l.a.c.b.a.R1(r3, r2, r7)
            long r5 = r7.f3100b
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x023b
            r5 = r11
            goto L_0x023c
        L_0x023b:
            r5 = r1
        L_0x023c:
            r12.e(r5)
            goto L_0x022d
        L_0x0240:
            if (r2 != r4) goto L_0x0245
        L_0x0242:
            r1 = r2
            goto L_0x03fa
        L_0x0245:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x024a:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.f.e.km r12 = (b.l.a.c.f.e.km) r12
            int r4 = b.l.a.c.b.a.R1(r3, r4, r7)
            long r8 = r7.f3100b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0259
            goto L_0x0272
        L_0x0259:
            r6 = r1
        L_0x025a:
            r12.e(r6)
            if (r4 >= r5) goto L_0x0274
            int r6 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r8 = r7.a
            if (r2 == r8) goto L_0x0268
            goto L_0x0274
        L_0x0268:
            int r4 = b.l.a.c.b.a.R1(r3, r6, r7)
            long r8 = r7.f3100b
            int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0259
        L_0x0272:
            r6 = r11
            goto L_0x025a
        L_0x0274:
            return r4
        L_0x0275:
            if (r6 != r10) goto L_0x0295
            b.l.a.c.f.e.f r12 = (b.l.a.c.f.e.f) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0280:
            if (r1 >= r2) goto L_0x028c
            int r4 = b.l.a.c.b.a.a2(r3, r1)
            r12.l(r4)
            int r1 = r1 + 4
            goto L_0x0280
        L_0x028c:
            if (r1 != r2) goto L_0x0290
            goto L_0x03fa
        L_0x0290:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x0295:
            if (r6 != r9) goto L_0x03f9
            b.l.a.c.f.e.f r12 = (b.l.a.c.f.e.f) r12
            int r1 = b.l.a.c.b.a.a2(r18, r19)
        L_0x029d:
            r12.l(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x02b5
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x02ad
            goto L_0x02b5
        L_0x02ad:
            int r4 = b.l.a.c.b.a.a2(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x029d
        L_0x02b5:
            return r4
        L_0x02b6:
            if (r6 != r10) goto L_0x02d6
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02c1:
            if (r1 >= r2) goto L_0x02cd
            long r4 = b.l.a.c.b.a.h2(r3, r1)
            r12.l(r4)
            int r1 = r1 + 8
            goto L_0x02c1
        L_0x02cd:
            if (r1 != r2) goto L_0x02d1
            goto L_0x03fa
        L_0x02d1:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x02d6:
            if (r6 != r11) goto L_0x03f9
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
            long r8 = b.l.a.c.b.a.h2(r18, r19)
        L_0x02de:
            r12.l(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x02f4
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            long r8 = b.l.a.c.b.a.h2(r3, r1)
            r4 = r1
            goto L_0x02de
        L_0x02f4:
            return r4
        L_0x02f5:
            if (r6 != r10) goto L_0x02fd
            int r1 = b.l.a.c.b.a.E2(r3, r4, r12, r7)
            goto L_0x03fa
        L_0x02fd:
            if (r6 == 0) goto L_0x0301
            goto L_0x03f9
        L_0x0301:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = b.l.a.c.b.a.C2(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0310:
            if (r6 != r10) goto L_0x0330
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x031b:
            if (r1 >= r2) goto L_0x0327
            int r1 = b.l.a.c.b.a.R1(r3, r1, r7)
            long r4 = r7.f3100b
            r12.l(r4)
            goto L_0x031b
        L_0x0327:
            if (r1 != r2) goto L_0x032b
            goto L_0x03fa
        L_0x032b:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x0330:
            if (r6 != 0) goto L_0x03f9
            b.l.a.c.f.e.t r12 = (b.l.a.c.f.e.t) r12
        L_0x0334:
            int r1 = b.l.a.c.b.a.R1(r3, r4, r7)
            long r8 = r7.f3100b
            r12.l(r8)
            if (r1 >= r5) goto L_0x0347
            int r4 = b.l.a.c.b.a.Q0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0334
        L_0x0347:
            return r1
        L_0x0348:
            if (r6 != r10) goto L_0x036c
            b.l.a.c.f.e.mn r12 = (b.l.a.c.f.e.mn) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0353:
            if (r1 >= r2) goto L_0x0363
            int r4 = b.l.a.c.b.a.a2(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.e(r4)
            int r1 = r1 + 4
            goto L_0x0353
        L_0x0363:
            if (r1 != r2) goto L_0x0367
            goto L_0x03fa
        L_0x0367:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x036c:
            if (r6 != r9) goto L_0x03f9
            b.l.a.c.f.e.mn r12 = (b.l.a.c.f.e.mn) r12
            int r1 = b.l.a.c.b.a.a2(r18, r19)
        L_0x0374:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x0390
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0388
            goto L_0x0390
        L_0x0388:
            int r4 = b.l.a.c.b.a.a2(r3, r1)
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x0374
        L_0x0390:
            return r4
        L_0x0391:
            if (r6 != r10) goto L_0x03b4
            b.l.a.c.f.e.dn r12 = (b.l.a.c.f.e.dn) r12
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x039c:
            if (r1 >= r2) goto L_0x03ac
            long r4 = b.l.a.c.b.a.h2(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.e(r4)
            int r1 = r1 + 8
            goto L_0x039c
        L_0x03ac:
            if (r1 != r2) goto L_0x03af
            goto L_0x03fa
        L_0x03af:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.a()
            throw r1
        L_0x03b4:
            if (r6 != r11) goto L_0x03f9
            b.l.a.c.f.e.dn r12 = (b.l.a.c.f.e.dn) r12
            long r8 = b.l.a.c.b.a.h2(r18, r19)
        L_0x03bc:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x03d6
            int r1 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x03d0
            goto L_0x03d6
        L_0x03d0:
            long r8 = b.l.a.c.b.a.h2(r3, r1)
            r4 = r1
            goto L_0x03bc
        L_0x03d6:
            return r4
        L_0x03d7:
            java.lang.Object r8 = r7.c
            r12.add(r8)
            if (r4 >= r5) goto L_0x03f8
            int r8 = b.l.a.c.b.a.Q0(r3, r4, r7)
            int r9 = r7.a
            if (r2 == r9) goto L_0x03e7
            goto L_0x03f8
        L_0x03e7:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = b.l.a.c.b.a.A2(r22, r23, r24, r25, r26, r27)
            goto L_0x03d7
        L_0x03f8:
            return r4
        L_0x03f9:
            r1 = r4
        L_0x03fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, b.l.a.c.f.e.jm):int");
    }

    public final <K, V> int N(Object obj, byte[] bArr, int i2, int i3, int i4, long j2) {
        Unsafe unsafe = f2986q;
        Object Q = Q(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((z) object).f3428h) {
            z a2 = z.f3427i.a();
            a0.b(a2, object);
            unsafe.putObject(obj, j2, a2);
        }
        x xVar = (x) Q;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3 = b.l.a.c.f.e.j.c(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, b.l.a.c.f.e.jm r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f2986q
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 2
            r15 = 5
            switch(r25) {
                case 51: goto L_0x017d;
                case 52: goto L_0x0165;
                case 53: goto L_0x0151;
                case 54: goto L_0x0151;
                case 55: goto L_0x0143;
                case 56: goto L_0x012e;
                case 57: goto L_0x0119;
                case 58: goto L_0x0103;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0143;
                case 63: goto L_0x0072;
                case 64: goto L_0x0119;
                case 65: goto L_0x012e;
                case 66: goto L_0x0062;
                case 67: goto L_0x0052;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0196
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0196
            b.l.a.c.f.e.o0 r5 = r0.P(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = b.l.a.c.b.a.A2(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            goto L_0x0196
        L_0x0056:
            int r2 = b.l.a.c.b.a.R1(r3, r4, r11)
            long r3 = r11.f3100b
            long r3 = b.l.a.c.f.e.vm.o(r3)
            goto L_0x015a
        L_0x0062:
            if (r5 == 0) goto L_0x0066
            goto L_0x0196
        L_0x0066:
            int r2 = b.l.a.c.b.a.Q0(r3, r4, r11)
            int r3 = r11.a
            int r3 = b.l.a.c.f.e.vm.n(r3)
            goto L_0x014c
        L_0x0072:
            if (r5 != 0) goto L_0x0196
            int r3 = b.l.a.c.b.a.Q0(r3, r4, r11)
            int r4 = r11.a
            b.l.a.c.f.e.h r5 = r0.R(r6)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            b.l.a.c.f.e.d1 r1 = D(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            goto L_0x009e
        L_0x0094:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x009e:
            r2 = r3
            goto L_0x0197
        L_0x00a1:
            if (r5 == r7) goto L_0x00a5
            goto L_0x0196
        L_0x00a5:
            int r2 = b.l.a.c.b.a.w2(r3, r4, r11)
            java.lang.Object r3 = r11.c
            goto L_0x015e
        L_0x00ad:
            if (r5 != r7) goto L_0x0196
            b.l.a.c.f.e.o0 r2 = r0.P(r6)
            r5 = r20
            int r2 = b.l.a.c.b.a.y2(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            java.lang.Object r3 = b.l.a.c.f.e.j.c(r15, r3)
            goto L_0x00db
        L_0x00cf:
            if (r5 != r7) goto L_0x0196
            int r2 = b.l.a.c.b.a.Q0(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00df
            java.lang.String r3 = ""
        L_0x00db:
            r12.putObject(r1, r9, r3)
            goto L_0x00fe
        L_0x00df:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f3
            int r5 = r2 + r4
            boolean r5 = b.l.a.c.f.e.s1.a(r3, r2, r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            b.l.a.c.f.e.l r1 = b.l.a.c.f.e.l.g()
            throw r1
        L_0x00f3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = b.l.a.c.f.e.j.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x00fe:
            r12.putInt(r1, r13, r8)
            goto L_0x0197
        L_0x0103:
            if (r5 != 0) goto L_0x0196
            int r2 = b.l.a.c.b.a.R1(r3, r4, r11)
            long r3 = r11.f3100b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0113
            r15 = 1
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x015e
        L_0x0119:
            if (r5 == r15) goto L_0x011d
            goto L_0x0196
        L_0x011d:
            int r2 = b.l.a.c.b.a.a2(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x012e:
            r2 = 1
            if (r5 == r2) goto L_0x0132
            goto L_0x0196
        L_0x0132:
            long r2 = b.l.a.c.b.a.h2(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0143:
            if (r5 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            int r2 = b.l.a.c.b.a.Q0(r3, r4, r11)
            int r3 = r11.a
        L_0x014c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x015e
        L_0x0151:
            if (r5 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            int r2 = b.l.a.c.b.a.R1(r3, r4, r11)
            long r3 = r11.f3100b
        L_0x015a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x015e:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0165:
            if (r5 == r15) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            int r2 = b.l.a.c.b.a.a2(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x017d:
            r2 = 1
            if (r5 == r2) goto L_0x0181
            goto L_0x0196
        L_0x0181:
            long r2 = b.l.a.c.b.a.h2(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0196:
            r2 = r4
        L_0x0197:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.O(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, b.l.a.c.f.e.jm):int");
    }

    public final o0 P(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f2987b;
        o0 o0Var = (o0) objArr[i4];
        if (o0Var != null) {
            return o0Var;
        }
        o0 a2 = l0.c.a((Class) objArr[i4 + 1]);
        this.f2987b[i4] = a2;
        return a2;
    }

    public final Object Q(int i2) {
        int i3 = i2 / 3;
        return this.f2987b[i3 + i3];
    }

    public final h R(int i2) {
        int i3 = i2 / 3;
        return (h) this.f2987b[i3 + i3 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d8, code lost:
        if (r0 != r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0326, code lost:
        if (r0 != r15) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0328, code lost:
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012d, code lost:
        r1 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0153, code lost:
        r6.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ad, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c0, code lost:
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c2, code lost:
        r6.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c5, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021a, code lost:
        r7 = r7 | r23;
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        r23 = r10;
        r0 = r17;
        r29 = r19;
        r19 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022a, code lost:
        r2 = r5;
        r28 = r6;
        r6 = r19;
        r19 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int S(T r32, byte[] r33, int r34, int r35, b.l.a.c.f.e.jm r36) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            sun.misc.Unsafe r9 = f2986q
            r10 = -1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r0 = r34
            r6 = r8
            r1 = r10
            r2 = r16
            r7 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x035c
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = b.l.a.c.b.a.w1(r0, r12, r3, r11)
            int r3 = r11.a
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0045
            int r2 = r2 / 3
            int r0 = r15.c
            if (r5 < r0) goto L_0x0043
            int r0 = r15.d
            if (r5 > r0) goto L_0x0043
            int r0 = r15.A(r5, r2)
            goto L_0x0049
        L_0x0043:
            r2 = r10
            goto L_0x004a
        L_0x0045:
            int r0 = r15.z(r5)
        L_0x0049:
            r2 = r0
        L_0x004a:
            if (r2 != r10) goto L_0x0057
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = r10
            r10 = r16
            goto L_0x0336
        L_0x0057:
            int[] r0 = r15.a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = r1 >>> 20
            r10 = r10 & 255(0xff, float:3.57E-43)
            r34 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0233
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r6) goto L_0x0095
            if (r6 == r5) goto L_0x0088
            long r1 = (long) r6
            r6 = r19
            r6.putInt(r14, r1, r7)
            goto L_0x008a
        L_0x0088:
            r6 = r19
        L_0x008a:
            if (r0 == r5) goto L_0x0092
            long r1 = (long) r0
            int r1 = r6.getInt(r14, r1)
            r7 = r1
        L_0x0092:
            r2 = r6
            r6 = r0
            goto L_0x0097
        L_0x0095:
            r2 = r19
        L_0x0097:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0200;
                case 1: goto L_0x01e4;
                case 2: goto L_0x01c7;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01b0;
                case 5: goto L_0x018f;
                case 6: goto L_0x0179;
                case 7: goto L_0x0158;
                case 8: goto L_0x0137;
                case 9: goto L_0x0113;
                case 10: goto L_0x0102;
                case 11: goto L_0x01b0;
                case 12: goto L_0x00f1;
                case 13: goto L_0x0179;
                case 14: goto L_0x018f;
                case 15: goto L_0x00da;
                case 16: goto L_0x00a6;
                default: goto L_0x009b;
            }
        L_0x009b:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            goto L_0x01ad
        L_0x00a6:
            if (r3 != 0) goto L_0x00cd
            int r10 = b.l.a.c.b.a.R1(r12, r4, r11)
            long r0 = r11.f3100b
            long r21 = b.l.a.c.f.e.vm.o(r0)
            r0 = r2
            r1 = r32
            r19 = r6
            r4 = r20
            r6 = r2
            r2 = r8
            r20 = r34
            r8 = r4
            r25 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r7 | r23
            r7 = r0
            r17 = r10
            r10 = r8
            goto L_0x021f
        L_0x00cd:
            r25 = r5
            r19 = r6
            r8 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            r10 = r8
            goto L_0x022a
        L_0x00da:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = b.l.a.c.b.a.Q0(r12, r4, r11)
            int r1 = r11.a
            int r1 = b.l.a.c.f.e.vm.n(r1)
            goto L_0x01c2
        L_0x00f1:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = b.l.a.c.b.a.Q0(r12, r4, r11)
            goto L_0x01c0
        L_0x0102:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = b.l.a.c.b.a.w2(r12, r4, r11)
            goto L_0x012d
        L_0x0113:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            b.l.a.c.f.e.o0 r0 = r15.P(r10)
            int r0 = b.l.a.c.b.a.y2(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r6.getObject(r14, r8)
            if (r1 != 0) goto L_0x0130
        L_0x012d:
            java.lang.Object r1 = r11.c
            goto L_0x0153
        L_0x0130:
            java.lang.Object r2 = r11.c
            java.lang.Object r1 = b.l.a.c.f.e.j.c(r1, r2)
            goto L_0x0153
        L_0x0137:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 2
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x014e
            int r0 = b.l.a.c.b.a.n2(r12, r4, r11)
            goto L_0x012d
        L_0x014e:
            int r0 = b.l.a.c.b.a.r2(r12, r4, r11)
            goto L_0x012d
        L_0x0153:
            r6.putObject(r14, r8, r1)
            goto L_0x01c5
        L_0x0158:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = b.l.a.c.b.a.R1(r12, r4, r11)
            long r1 = r11.f3100b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0171
            r1 = 1
            goto L_0x0173
        L_0x0171:
            r1 = r16
        L_0x0173:
            b.l.a.c.f.e.m1 r2 = b.l.a.c.f.e.n1.f3182e
            r2.d(r14, r8, r1)
            goto L_0x01c5
        L_0x0179:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = b.l.a.c.b.a.a2(r12, r4)
            r6.putInt(r14, r8, r0)
            int r4 = r4 + 4
            goto L_0x021a
        L_0x018f:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 1
            r20 = r34
            r6 = r2
            if (r3 != r0) goto L_0x01ad
            long r21 = b.l.a.c.b.a.h2(r12, r4)
            r0 = r6
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r8 + 8
            goto L_0x021a
        L_0x01ad:
            r5 = r4
            goto L_0x022a
        L_0x01b0:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022a
            int r0 = b.l.a.c.b.a.Q0(r12, r5, r11)
        L_0x01c0:
            int r1 = r11.a
        L_0x01c2:
            r6.putInt(r14, r8, r1)
        L_0x01c5:
            r4 = r0
            goto L_0x021a
        L_0x01c7:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022a
            int r17 = b.l.a.c.b.a.R1(r12, r5, r11)
            long r4 = r11.f3100b
            r0 = r6
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r0 = r7 | r23
            r7 = r0
            goto L_0x021f
        L_0x01e4:
            r25 = r5
            r19 = r6
            r10 = r20
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022a
            int r0 = b.l.a.c.b.a.a2(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.f.e.m1 r1 = b.l.a.c.f.e.n1.f3182e
            r1.f(r14, r8, r0)
            int r4 = r5 + 4
            goto L_0x021a
        L_0x0200:
            r25 = r5
            r19 = r6
            r10 = r20
            r0 = 1
            r20 = r34
            r6 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022a
            long r0 = b.l.a.c.b.a.h2(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            b.l.a.c.f.e.n1.p(r14, r8, r0)
            int r4 = r5 + 8
        L_0x021a:
            r0 = r7 | r23
            r7 = r0
            r17 = r4
        L_0x021f:
            r23 = r10
            r0 = r17
            r29 = r19
            r19 = r6
            r6 = r29
            goto L_0x027e
        L_0x022a:
            r2 = r5
            r28 = r6
            r6 = r19
            r19 = -1
            goto L_0x0336
        L_0x0233:
            r20 = r34
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r6
            r6 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0296
            r0 = 2
            if (r3 != r0) goto L_0x0289
            java.lang.Object r0 = r6.getObject(r14, r8)
            b.l.a.c.f.e.i r0 = (b.l.a.c.f.e.i) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0264
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025c
            r1 = 10
            goto L_0x025d
        L_0x025c:
            int r1 = r1 + r1
        L_0x025d:
            b.l.a.c.f.e.i r0 = r0.h(r1)
            r6.putObject(r14, r8, r0)
        L_0x0264:
            r8 = r0
            b.l.a.c.f.e.o0 r0 = r15.P(r4)
            r1 = r17
            r2 = r33
            r3 = r5
            r23 = r4
            r4 = r35
            r5 = r8
            r8 = r19
            r19 = r6
            r6 = r36
            int r0 = b.l.a.c.b.a.G2(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x027e:
            r9 = r19
            r1 = r20
            r2 = r23
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0289:
            r23 = r4
            r15 = r5
            r28 = r6
            r27 = r7
            r26 = r19
            r19 = -1
            goto L_0x02fa
        L_0x0296:
            r23 = r4
            r29 = r19
            r19 = r6
            r6 = r29
            r0 = 49
            if (r10 > r0) goto L_0x02de
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r7
            r7 = r34
            r29 = r8
            r9 = r25
            r24 = r29
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r36
            int r0 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02db
            goto L_0x0328
        L_0x02db:
            r4 = r0
            goto L_0x032f
        L_0x02de:
            r34 = r3
            r15 = r5
            r26 = r6
            r27 = r7
            r24 = r8
            r18 = r10
            r28 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            r7 = r34
            if (r9 != r0) goto L_0x030e
            r0 = 2
            if (r7 == r0) goto L_0x02fc
        L_0x02fa:
            r4 = r15
            goto L_0x032f
        L_0x02fc:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r23
            r6 = r24
            r0.N(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x030e:
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r36
            int r0 = r0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02db
        L_0x0328:
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0347
        L_0x032f:
            r2 = r4
            r10 = r23
            r6 = r26
            r7 = r27
        L_0x0336:
            b.l.a.c.f.e.d1 r4 = D(r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = b.l.a.c.b.a.I2(r0, r1, r2, r3, r4, r5)
            r2 = r10
        L_0x0347:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x035c:
            r27 = r7
            r1 = r8
            r28 = r9
            if (r6 == r1) goto L_0x036d
            long r1 = (long) r6
            r3 = r32
            r7 = r27
            r4 = r28
            r4.putInt(r3, r1, r7)
        L_0x036d:
            r1 = r35
            if (r0 != r1) goto L_0x0372
            return r0
        L_0x0372:
            b.l.a.c.f.e.l r0 = b.l.a.c.f.e.l.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.S(java.lang.Object, byte[], int, int, b.l.a.c.f.e.jm):int");
    }

    public final T a() {
        return ((e) this.f2988e).h(4, (Object) null, (Object) null);
    }

    public final void b(T t) {
        int i2;
        int i3 = this.f2992j;
        while (true) {
            i2 = this.f2993k;
            if (i3 >= i2) {
                break;
            }
            long m2 = (long) (m(this.f2991i[i3]) & 1048575);
            Object q2 = n1.q(t, m2);
            if (q2 != null) {
                ((z) q2).f3428h = false;
                n1.f3182e.s(t, m2, q2);
            }
            i3++;
        }
        int length = this.f2991i.length;
        while (i2 < length) {
            this.f2994l.b(t, (long) this.f2991i[i2]);
            i2++;
        }
        this.f2995m.m(t);
        if (this.f) {
            this.f2996n.d(t);
        }
    }

    public final int c(T t) {
        return this.f2990h ? L(t) : K(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        b.l.a.c.f.e.n1.f3182e.s(r7, r2, b.l.a.c.f.e.n1.q(r8, r2));
        y(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        b.l.a.c.f.e.n1.f3182e.s(r7, r2, b.l.a.c.f.e.n1.q(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        b.l.a.c.f.e.n1.f3182e.o(r7, r2, b.l.a.c.f.e.n1.j(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        b.l.a.c.f.e.n1.l(r7, r2, b.l.a.c.f.e.n1.k(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        w(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010a
            int r1 = r6.m(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00e6;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0093;
                case 9: goto L_0x008e;
                case 10: goto L_0x0087;
                case 11: goto L_0x0080;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006a;
                case 15: goto L_0x0063;
                case 16: goto L_0x005b;
                case 17: goto L_0x008e;
                case 18: goto L_0x0054;
                case 19: goto L_0x0054;
                case 20: goto L_0x0054;
                case 21: goto L_0x0054;
                case 22: goto L_0x0054;
                case 23: goto L_0x0054;
                case 24: goto L_0x0054;
                case 25: goto L_0x0054;
                case 26: goto L_0x0054;
                case 27: goto L_0x0054;
                case 28: goto L_0x0054;
                case 29: goto L_0x0054;
                case 30: goto L_0x0054;
                case 31: goto L_0x0054;
                case 32: goto L_0x0054;
                case 33: goto L_0x0054;
                case 34: goto L_0x0054;
                case 35: goto L_0x0054;
                case 36: goto L_0x0054;
                case 37: goto L_0x0054;
                case 38: goto L_0x0054;
                case 39: goto L_0x0054;
                case 40: goto L_0x0054;
                case 41: goto L_0x0054;
                case 42: goto L_0x0054;
                case 43: goto L_0x0054;
                case 44: goto L_0x0054;
                case 45: goto L_0x0054;
                case 46: goto L_0x0054;
                case 47: goto L_0x0054;
                case 48: goto L_0x0054;
                case 49: goto L_0x0054;
                case 50: goto L_0x003f;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0106
        L_0x001f:
            boolean r1 = r6.x(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0031
        L_0x0026:
            r6.J(r7, r8, r0)
            goto L_0x0106
        L_0x002b:
            boolean r1 = r6.x(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0031:
            java.lang.Object r1 = b.l.a.c.f.e.n1.q(r8, r2)
            b.l.a.c.f.e.m1 r5 = b.l.a.c.f.e.n1.f3182e
            r5.s(r7, r2, r1)
            r6.y(r7, r4, r0)
            goto L_0x0106
        L_0x003f:
            java.lang.Class<?> r1 = b.l.a.c.f.e.q0.a
            java.lang.Object r1 = b.l.a.c.f.e.n1.q(r7, r2)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r8, r2)
            java.lang.Object r1 = b.l.a.c.f.e.a0.b(r1, r4)
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.s(r7, r2, r1)
            goto L_0x0106
        L_0x0054:
            b.l.a.c.f.e.s r1 = r6.f2994l
            r1.c(r7, r8, r2)
            goto L_0x0106
        L_0x005b:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0063:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x006a:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0072:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0079:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0080:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0087:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0099
        L_0x008e:
            r6.I(r7, r8, r0)
            goto L_0x0106
        L_0x0093:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0099:
            java.lang.Object r1 = b.l.a.c.f.e.n1.q(r8, r2)
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.s(r7, r2, r1)
            goto L_0x0103
        L_0x00a3:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = b.l.a.c.f.e.n1.m(r8, r2)
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.d(r7, r2, r1)
            goto L_0x0103
        L_0x00b3:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x00ba:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00c1:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00c7:
            int r1 = b.l.a.c.f.e.n1.j(r8, r2)
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.o(r7, r2, r1)
            goto L_0x0103
        L_0x00d1:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00d8:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00de:
            long r4 = b.l.a.c.f.e.n1.k(r8, r2)
            b.l.a.c.f.e.n1.l(r7, r2, r4)
            goto L_0x0103
        L_0x00e6:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            float r1 = b.l.a.c.f.e.n1.n(r8, r2)
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e
            r4.f(r7, r2, r1)
            goto L_0x0103
        L_0x00f6:
            boolean r1 = r6.v(r8, r0)
            if (r1 == 0) goto L_0x0106
            double r4 = b.l.a.c.f.e.n1.o(r8, r2)
            b.l.a.c.f.e.n1.p(r7, r2, r4)
        L_0x0103:
            r6.w(r7, r0)
        L_0x0106:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x010a:
            b.l.a.c.f.e.c1<?, ?> r0 = r6.f2995m
            java.lang.Class<?> r1 = b.l.a.c.f.e.q0.a
            java.lang.Object r1 = r0.j(r7)
            java.lang.Object r2 = r0.j(r8)
            java.lang.Object r1 = r0.o(r1, r2)
            r0.i(r7, r1)
            boolean r7 = r6.f
            if (r7 != 0) goto L_0x0122
            return
        L_0x0122:
            b.l.a.c.f.e.gn<?> r7 = r6.f2996n
            r7.b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.d(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = r(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = b.l.a.c.f.e.n1.q(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) b.l.a.c.f.e.n1.q(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = b.l.a.c.f.e.j.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = b.l.a.c.f.e.j.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0129
            int r3 = r8.m(r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0125
        L_0x001f:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0036:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0045:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            boolean r3 = s(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x008d:
            int r2 = r2 * 53
            int r3 = q(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = r(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            float r3 = p(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.x(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            double r3 = o(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0125
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = b.l.a.c.f.e.n1.m(r9, r5)
        L_0x00f7:
            int r3 = b.l.a.c.f.e.j.b(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = b.l.a.c.f.e.n1.n(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = b.l.a.c.f.e.n1.o(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = b.l.a.c.f.e.j.a(r3)
        L_0x0123:
            int r3 = r3 + r2
            r2 = r3
        L_0x0125:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0129:
            int r2 = r2 * 53
            b.l.a.c.f.e.c1<?, ?> r0 = r8.f2995m
            java.lang.Object r0 = r0.j(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f
            if (r1 != 0) goto L_0x013b
            return r0
        L_0x013b:
            b.l.a.c.f.e.gn<?> r0 = r8.f2996n
            r0.b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.e(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.m(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.n(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = b.l.a.c.f.e.n1.j(r9, r3)
            int r3 = b.l.a.c.f.e.n1.j(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            long r5 = b.l.a.c.f.e.n1.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            long r5 = b.l.a.c.f.e.n1.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.e.n1.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r10, r5)
            boolean r3 = b.l.a.c.f.e.q0.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = b.l.a.c.f.e.n1.m(r9, r5)
            boolean r4 = b.l.a.c.f.e.n1.m(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            long r5 = b.l.a.c.f.e.n1.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.e.n1.j(r9, r5)
            int r4 = b.l.a.c.f.e.n1.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            long r5 = b.l.a.c.f.e.n1.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.e.n1.k(r9, r5)
            long r5 = b.l.a.c.f.e.n1.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = b.l.a.c.f.e.n1.n(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = b.l.a.c.f.e.n1.n(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.t(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = b.l.a.c.f.e.n1.o(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = b.l.a.c.f.e.n1.o(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            b.l.a.c.f.e.c1<?, ?> r0 = r8.f2995m
            java.lang.Object r0 = r0.j(r9)
            b.l.a.c.f.e.c1<?, ?> r2 = r8.f2995m
            java.lang.Object r2 = r2.j(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            b.l.a.c.f.e.gn<?> r0 = r8.f2996n
            r0.b(r9)
            b.l.a.c.f.e.gn<?> r9 = r8.f2996n
            r9.b(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0306, code lost:
        r0.o(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x030f, code lost:
        r0.n(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0318, code lost:
        r0.m(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0321, code lost:
        r0.l(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0333, code lost:
        r14 = b.l.a.c.f.e.q0.b(r4, r6, R(r5), r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033d, code lost:
        r0.j(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x038c, code lost:
        r0.e(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0395, code lost:
        r0.d(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x039e, code lost:
        r0.c(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a7, code lost:
        r0.b(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03b0, code lost:
        r0.G(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b9, code lost:
        r0.a(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c2, code lost:
        r0.F(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03cb, code lost:
        r0.E(r4.a(r2, (long) (r6 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03fe, code lost:
        r8.s(r2, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0413, code lost:
        b.l.a.c.f.e.n1.l(r2, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x042a, code lost:
        r8.o(r2, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0462, code lost:
        r14 = b.l.a.c.f.e.q0.c(r4, r7, r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04a2, code lost:
        b.l.a.c.f.e.n1.f3182e.s(r2, r6, b.l.a.c.f.e.j.c(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0538, code lost:
        w(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r11.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x055d, code lost:
        if (r14 == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055f, code lost:
        r14 = r11.k(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0568, code lost:
        if (r11.n(r14, r0) == false) goto L_0x056a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x056a, code lost:
        r0 = r1.f2992j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x056e, code lost:
        if (r0 < r1.f2993k) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0570, code lost:
        k(r2, r1.f2991i[r0], r14);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x057a, code lost:
        if (r14 != null) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057c, code lost:
        r11.l(r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0209, code lost:
        y(r2, r4, r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x055a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(T r17, b.l.a.c.f.e.wm r18, b.l.a.c.f.e.fn r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r10 = r19
            java.util.Objects.requireNonNull(r19)
            b.l.a.c.f.e.c1<?, ?> r11 = r1.f2995m
            b.l.a.c.f.e.gn<?> r12 = r1.f2996n
            r3 = 0
            r14 = 0
        L_0x0011:
            int r4 = r18.v()     // Catch:{ all -> 0x00ad }
            int r5 = r1.z(r4)     // Catch:{ all -> 0x00ad }
            if (r5 >= 0) goto L_0x0080
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x0036
            int r0 = r1.f2992j
        L_0x0022:
            int r3 = r1.f2993k
            if (r0 >= r3) goto L_0x0030
            int[] r3 = r1.f2991i
            r3 = r3[r0]
            r1.k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0030:
            if (r14 == 0) goto L_0x057f
            r11.l(r2, r14)
            return
        L_0x0036:
            boolean r5 = r1.f     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x003c
            r5 = 0
            goto L_0x0043
        L_0x003c:
            b.l.a.c.f.e.e0 r5 = r1.f2988e     // Catch:{ all -> 0x00ad }
            java.lang.Object r4 = r12.f(r10, r5, r4)     // Catch:{ all -> 0x00ad }
            r5 = r4
        L_0x0043:
            if (r5 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x004b
            b.l.a.c.f.e.kn r3 = r12.c(r2)     // Catch:{ all -> 0x00ad }
        L_0x004b:
            r15 = r3
            r3 = r12
            r4 = r18
            r6 = r19
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r14 = r3.e(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ad }
            r3 = r15
            goto L_0x0011
        L_0x005a:
            r11.a(r0)     // Catch:{ all -> 0x00ad }
            if (r14 != 0) goto L_0x0064
            java.lang.Object r4 = r11.k(r2)     // Catch:{ all -> 0x00ad }
            r14 = r4
        L_0x0064:
            boolean r4 = r11.n(r14, r0)     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f2992j
        L_0x006c:
            int r3 = r1.f2993k
            if (r0 >= r3) goto L_0x007a
            int[] r3 = r1.f2991i
            r3 = r3[r0]
            r1.k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x006c
        L_0x007a:
            if (r14 == 0) goto L_0x057f
            r11.l(r2, r14)
            return
        L_0x0080:
            int r6 = r1.m(r5)     // Catch:{ all -> 0x00ad }
            int r7 = r6 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 3
            r15 = 1
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0525;
                case 1: goto L_0x050e;
                case 2: goto L_0x0505;
                case 3: goto L_0x04f7;
                case 4: goto L_0x04e7;
                case 5: goto L_0x04de;
                case 6: goto L_0x04d3;
                case 7: goto L_0x04c1;
                case 8: goto L_0x04bc;
                case 9: goto L_0x0487;
                case 10: goto L_0x047c;
                case 11: goto L_0x0472;
                case 12: goto L_0x044c;
                case 13: goto L_0x043c;
                case 14: goto L_0x042f;
                case 15: goto L_0x0418;
                case 16: goto L_0x0403;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03c7;
                case 19: goto L_0x03be;
                case 20: goto L_0x03b5;
                case 21: goto L_0x03ac;
                case 22: goto L_0x03a3;
                case 23: goto L_0x039a;
                case 24: goto L_0x0391;
                case 25: goto L_0x0388;
                case 26: goto L_0x0362;
                case 27: goto L_0x0350;
                case 28: goto L_0x0342;
                case 29: goto L_0x0339;
                case 30: goto L_0x0326;
                case 31: goto L_0x031d;
                case 32: goto L_0x0314;
                case 33: goto L_0x030b;
                case 34: goto L_0x0302;
                case 35: goto L_0x02f7;
                case 36: goto L_0x02ec;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02d6;
                case 39: goto L_0x02cb;
                case 40: goto L_0x02c0;
                case 41: goto L_0x02b5;
                case 42: goto L_0x02aa;
                case 43: goto L_0x029f;
                case 44: goto L_0x028d;
                case 45: goto L_0x0281;
                case 46: goto L_0x0275;
                case 47: goto L_0x0269;
                case 48: goto L_0x025d;
                case 49: goto L_0x024a;
                case 50: goto L_0x020e;
                case 51: goto L_0x01f2;
                case 52: goto L_0x01da;
                case 53: goto L_0x01cc;
                case 54: goto L_0x01b9;
                case 55: goto L_0x01a6;
                case 56: goto L_0x0198;
                case 57: goto L_0x018a;
                case 58: goto L_0x0177;
                case 59: goto L_0x0172;
                case 60: goto L_0x013b;
                case 61: goto L_0x0131;
                case 62: goto L_0x0123;
                case 63: goto L_0x0101;
                case 64: goto L_0x00ee;
                case 65: goto L_0x00dc;
                case 66: goto L_0x00c6;
                case 67: goto L_0x00b0;
                case 68: goto L_0x0099;
                default: goto L_0x0091;
            }
        L_0x0091:
            if (r14 != 0) goto L_0x053e
            java.lang.Object r4 = r11.g()     // Catch:{ k -> 0x055a }
            goto L_0x053d
        L_0x0099:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r8 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r0.p(r9)     // Catch:{ k -> 0x055a }
            java.lang.Object r8 = r0.r(r8, r10)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
        L_0x00a8:
            r9.s(r2, r6, r8)     // Catch:{ k -> 0x055a }
            goto L_0x0209
        L_0x00ad:
            r0 = move-exception
            goto L_0x0580
        L_0x00b0:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r8.f()     // Catch:{ k -> 0x055a }
            long r8 = b.l.a.c.f.e.vm.o(r8)     // Catch:{ k -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x00c6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            int r8 = r8.e()     // Catch:{ k -> 0x055a }
            int r8 = b.l.a.c.f.e.vm.n(r8)     // Catch:{ k -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x00dc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r15)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r8.i()     // Catch:{ k -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x00ee:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r8 = 5
            r0.p(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            int r8 = r8.h()     // Catch:{ k -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x0101:
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r7 = r0.a     // Catch:{ k -> 0x055a }
            int r7 = r7.e()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.h r9 = r1.R(r5)     // Catch:{ k -> 0x055a }
            if (r9 == 0) goto L_0x0116
            boolean r9 = r9.a()     // Catch:{ k -> 0x055a }
            if (r9 == 0) goto L_0x0462
        L_0x0116:
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ k -> 0x055a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r7 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r7.s(r2, r8, r6)     // Catch:{ k -> 0x055a }
            goto L_0x0209
        L_0x0123:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            int r8 = r18.D()     // Catch:{ k -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x0131:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.um r8 = r18.C()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x013b:
            boolean r7 = r1.x(r2, r4, r5)     // Catch:{ k -> 0x055a }
            r6 = r6 & r8
            if (r7 == 0) goto L_0x015b
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            java.lang.Object r8 = b.l.a.c.f.e.n1.q(r2, r6)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r9 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r13 = 2
            r0.p(r13)     // Catch:{ k -> 0x055a }
            java.lang.Object r9 = r0.q(r9, r10)     // Catch:{ k -> 0x055a }
            java.lang.Object r8 = b.l.a.c.f.e.j.c(r8, r9)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x015b:
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r8 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r9 = 2
            r0.p(r9)     // Catch:{ k -> 0x055a }
            java.lang.Object r8 = r0.q(r8, r10)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r9.s(r2, r6, r8)     // Catch:{ k -> 0x055a }
            r1.w(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0209
        L_0x0172:
            r1.l(r2, r6, r0)     // Catch:{ k -> 0x055a }
            goto L_0x0209
        L_0x0177:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            boolean r8 = r8.d()     // Catch:{ k -> 0x055a }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x018a:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            int r8 = r18.z()     // Catch:{ k -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x0198:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            long r8 = r18.y()     // Catch:{ k -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x01a6:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            int r8 = r8.e()     // Catch:{ k -> 0x055a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x01b9:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r8.f()     // Catch:{ k -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x01cc:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            long r8 = r18.x()     // Catch:{ k -> 0x055a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x01da:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r8 = 5
            r0.p(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            int r8 = r8.h()     // Catch:{ k -> 0x055a }
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch:{ k -> 0x055a }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x01f2:
            r6 = r6 & r8
            long r6 = (long) r6     // Catch:{ k -> 0x055a }
            r0.p(r15)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r8 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r8.i()     // Catch:{ k -> 0x055a }
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch:{ k -> 0x055a }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r9 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x00a8
        L_0x0209:
            r1.y(r2, r4, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x020e:
            java.lang.Object r4 = r1.Q(r5)     // Catch:{ k -> 0x055a }
            int r5 = r1.m(r5)     // Catch:{ k -> 0x055a }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.lang.Object r7 = b.l.a.c.f.e.n1.q(r2, r5)     // Catch:{ k -> 0x055a }
            if (r7 == 0) goto L_0x0236
            r8 = r7
            b.l.a.c.f.e.z r8 = (b.l.a.c.f.e.z) r8     // Catch:{ k -> 0x055a }
            boolean r8 = r8.f3428h     // Catch:{ k -> 0x055a }
            r8 = r8 ^ r15
            if (r8 == 0) goto L_0x0241
            b.l.a.c.f.e.z r8 = b.l.a.c.f.e.z.f3427i     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.z r8 = r8.a()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.a0.b(r8, r7)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r7 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r7.s(r2, r5, r8)     // Catch:{ k -> 0x055a }
            r7 = r8
            goto L_0x0241
        L_0x0236:
            b.l.a.c.f.e.z r7 = b.l.a.c.f.e.z.f3427i     // Catch:{ k -> 0x0247 }
            b.l.a.c.f.e.z r7 = r7.a()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x0247 }
            r8.s(r2, r5, r7)     // Catch:{ k -> 0x0247 }
        L_0x0241:
            b.l.a.c.f.e.z r7 = (b.l.a.c.f.e.z) r7     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.x r4 = (b.l.a.c.f.e.x) r4     // Catch:{ k -> 0x055a }
            r7 = 0
            throw r7     // Catch:{ k -> 0x055a }
        L_0x0247:
            r7 = 0
            goto L_0x055a
        L_0x024a:
            r7 = 0
            r4 = r6 & r8
            long r8 = (long) r4     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r4 = r1.P(r5)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.s r5 = r1.f2994l     // Catch:{ k -> 0x055a }
            java.util.List r5 = r5.a(r2, r8)     // Catch:{ k -> 0x055a }
            r0.h(r5, r4, r10)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x025d:
            r7 = 0
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x0260:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0306
        L_0x0269:
            r7 = 0
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x026c:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x030f
        L_0x0275:
            r7 = 0
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x0278:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0318
        L_0x0281:
            r7 = 0
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x0284:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0321
        L_0x028d:
            r7 = 0
            b.l.a.c.f.e.s r9 = r1.f2994l     // Catch:{ k -> 0x055a }
            r6 = r6 & r8
            long r7 = (long) r6     // Catch:{ k -> 0x055a }
            java.util.List r6 = r9.a(r2, r7)     // Catch:{ k -> 0x055a }
            r0.k(r6)     // Catch:{ k -> 0x055a }
        L_0x0299:
            b.l.a.c.f.e.h r5 = r1.R(r5)     // Catch:{ k -> 0x055a }
            goto L_0x0333
        L_0x029f:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02a1:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x033d
        L_0x02aa:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02ac:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x038c
        L_0x02b5:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02b7:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0395
        L_0x02c0:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02c2:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x039e
        L_0x02cb:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02cd:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x03a7
        L_0x02d6:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02d8:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x03b0
        L_0x02e1:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02e3:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x03b9
        L_0x02ec:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02ee:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x03c2
        L_0x02f7:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
        L_0x02f9:
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x03cb
        L_0x0302:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x0260
        L_0x0306:
            r0.o(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x030b:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x026c
        L_0x030f:
            r0.n(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0314:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x0278
        L_0x0318:
            r0.m(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x031d:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x0284
        L_0x0321:
            r0.l(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0326:
            b.l.a.c.f.e.s r7 = r1.f2994l     // Catch:{ k -> 0x055a }
            r6 = r6 & r8
            long r8 = (long) r6     // Catch:{ k -> 0x055a }
            java.util.List r6 = r7.a(r2, r8)     // Catch:{ k -> 0x055a }
            r0.k(r6)     // Catch:{ k -> 0x055a }
            goto L_0x0299
        L_0x0333:
            java.lang.Object r14 = b.l.a.c.f.e.q0.b(r4, r6, r5, r14, r11)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0339:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02a1
        L_0x033d:
            r0.j(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0342:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            r0.i(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0350:
            b.l.a.c.f.e.o0 r4 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.s r7 = r1.f2994l     // Catch:{ k -> 0x055a }
            java.util.List r5 = r7.a(r2, r5)     // Catch:{ k -> 0x055a }
            r0.g(r5, r4, r10)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0362:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0369
            r4 = r15
            goto L_0x036a
        L_0x0369:
            r4 = r13
        L_0x036a:
            if (r4 == 0) goto L_0x037a
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            r0.f(r4, r15)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x037a:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            r5 = r6 & r8
            long r5 = (long) r5     // Catch:{ k -> 0x055a }
            java.util.List r4 = r4.a(r2, r5)     // Catch:{ k -> 0x055a }
            r0.f(r4, r13)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0388:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02ac
        L_0x038c:
            r0.e(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0391:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02b7
        L_0x0395:
            r0.d(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x039a:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02c2
        L_0x039e:
            r0.c(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03a3:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02cd
        L_0x03a7:
            r0.b(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03ac:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02d8
        L_0x03b0:
            r0.G(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03b5:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02e3
        L_0x03b9:
            r0.a(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03be:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02ee
        L_0x03c2:
            r0.F(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03c7:
            b.l.a.c.f.e.s r4 = r1.f2994l     // Catch:{ k -> 0x055a }
            goto L_0x02f9
        L_0x03cb:
            r0.E(r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x03d0:
            boolean r4 = r1.v(r2, r5)     // Catch:{ k -> 0x055a }
            if (r4 == 0) goto L_0x03ee
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r2, r6)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r5 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r0.p(r9)     // Catch:{ k -> 0x055a }
            java.lang.Object r5 = r0.r(r5, r10)     // Catch:{ k -> 0x055a }
        L_0x03e8:
            java.lang.Object r4 = b.l.a.c.f.e.j.c(r4, r5)     // Catch:{ k -> 0x055a }
            goto L_0x04a2
        L_0x03ee:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r4 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r0.p(r9)     // Catch:{ k -> 0x055a }
            java.lang.Object r4 = r0.r(r4, r10)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
        L_0x03fe:
            r8.s(r2, r6, r4)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x0403:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r4.f()     // Catch:{ k -> 0x055a }
            long r8 = b.l.a.c.f.e.vm.o(r8)     // Catch:{ k -> 0x055a }
        L_0x0413:
            b.l.a.c.f.e.n1.l(r2, r6, r8)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x0418:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            int r4 = r4.e()     // Catch:{ k -> 0x055a }
            int r4 = b.l.a.c.f.e.vm.n(r4)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
        L_0x042a:
            r8.o(r2, r6, r4)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x042f:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r15)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r4.i()     // Catch:{ k -> 0x055a }
            goto L_0x0413
        L_0x043c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r4 = 5
            r0.p(r4)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            int r4 = r4.h()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x042a
        L_0x044c:
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r7 = r0.a     // Catch:{ k -> 0x055a }
            int r7 = r7.e()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.h r9 = r1.R(r5)     // Catch:{ k -> 0x055a }
            if (r9 == 0) goto L_0x0468
            boolean r9 = r9.a()     // Catch:{ k -> 0x055a }
            if (r9 == 0) goto L_0x0462
            goto L_0x0468
        L_0x0462:
            java.lang.Object r14 = b.l.a.c.f.e.q0.c(r4, r7, r14, r11)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x0468:
            r4 = r6 & r8
            long r8 = (long) r4     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r4 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r4.o(r2, r8, r7)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x0472:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            int r4 = r18.D()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x042a
        L_0x047c:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.um r4 = r18.C()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x03fe
        L_0x0487:
            boolean r4 = r1.v(r2, r5)     // Catch:{ k -> 0x055a }
            if (r4 == 0) goto L_0x04a9
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r2, r6)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r5 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r8 = 2
            r0.p(r8)     // Catch:{ k -> 0x055a }
            java.lang.Object r5 = r0.q(r5, r10)     // Catch:{ k -> 0x055a }
            goto L_0x03e8
        L_0x04a2:
            b.l.a.c.f.e.m1 r5 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r5.s(r2, r6, r4)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x04a9:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.o0 r4 = r1.P(r5)     // Catch:{ k -> 0x055a }
            r8 = 2
            r0.p(r8)     // Catch:{ k -> 0x055a }
            java.lang.Object r4 = r0.q(r4, r10)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x03fe
        L_0x04bc:
            r1.l(r2, r6, r0)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x04c1:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            boolean r4 = r4.d()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r8.d(r2, r6, r4)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x04d3:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            int r4 = r18.z()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x042a
        L_0x04de:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            long r8 = r18.y()     // Catch:{ k -> 0x055a }
            goto L_0x0413
        L_0x04e7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            int r4 = r4.e()     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            goto L_0x042a
        L_0x04f7:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r13)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r4.f()     // Catch:{ k -> 0x055a }
            goto L_0x0413
        L_0x0505:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            long r8 = r18.x()     // Catch:{ k -> 0x055a }
            goto L_0x0413
        L_0x050e:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r4 = 5
            r0.p(r4)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            int r4 = r4.h()     // Catch:{ k -> 0x055a }
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.m1 r8 = b.l.a.c.f.e.n1.f3182e     // Catch:{ k -> 0x055a }
            r8.f(r2, r6, r4)     // Catch:{ k -> 0x055a }
            goto L_0x0538
        L_0x0525:
            r4 = r6 & r8
            long r6 = (long) r4     // Catch:{ k -> 0x055a }
            r0.p(r15)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.vm r4 = r0.a     // Catch:{ k -> 0x055a }
            long r8 = r4.i()     // Catch:{ k -> 0x055a }
            double r8 = java.lang.Double.longBitsToDouble(r8)     // Catch:{ k -> 0x055a }
            b.l.a.c.f.e.n1.p(r2, r6, r8)     // Catch:{ k -> 0x055a }
        L_0x0538:
            r1.w(r2, r5)     // Catch:{ k -> 0x055a }
            goto L_0x0011
        L_0x053d:
            r14 = r4
        L_0x053e:
            boolean r4 = r11.n(r14, r0)     // Catch:{ k -> 0x055a }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f2992j
        L_0x0546:
            int r3 = r1.f2993k
            if (r0 >= r3) goto L_0x0554
            int[] r3 = r1.f2991i
            r3 = r3[r0]
            r1.k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x0546
        L_0x0554:
            if (r14 == 0) goto L_0x057f
            r11.l(r2, r14)
            return
        L_0x055a:
            r11.a(r0)     // Catch:{ all -> 0x00ad }
            if (r14 != 0) goto L_0x0564
            java.lang.Object r4 = r11.k(r2)     // Catch:{ all -> 0x00ad }
            r14 = r4
        L_0x0564:
            boolean r4 = r11.n(r14, r0)     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f2992j
        L_0x056c:
            int r3 = r1.f2993k
            if (r0 >= r3) goto L_0x057a
            int[] r3 = r1.f2991i
            r3 = r3[r0]
            r1.k(r2, r3, r14)
            int r0 = r0 + 1
            goto L_0x056c
        L_0x057a:
            if (r14 == 0) goto L_0x057f
            r11.l(r2, r14)
        L_0x057f:
            return
        L_0x0580:
            int r3 = r1.f2992j
        L_0x0582:
            int r4 = r1.f2993k
            if (r3 >= r4) goto L_0x0590
            int[] r4 = r1.f2991i
            r4 = r4[r3]
            r1.k(r2, r4, r14)
            int r3 = r3 + 1
            goto L_0x0582
        L_0x0590:
            if (r14 == 0) goto L_0x0595
            r11.l(r2, r14)
        L_0x0595:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.g(java.lang.Object, b.l.a.c.f.e.wm, b.l.a.c.f.e.fn):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0323, code lost:
        r12.d(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0334, code lost:
        r12.c(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0345, code lost:
        r12.a.q(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0358, code lost:
        r12.a.n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x036b, code lost:
        r12.a.l(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        r12.a.m(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038b, code lost:
        r12.a.t(r6, (b.l.a.c.f.e.um) b.l.a.c.f.e.n1.q(r11, (long) (r4 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a0, code lost:
        r12.e(r6, b.l.a.c.f.e.n1.q(r11, (long) (r4 & 1048575)), P(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b5, code lost:
        C(r6, b.l.a.c.f.e.n1.q(r11, (long) (r4 & 1048575)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03cc, code lost:
        r12.a.r(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03df, code lost:
        r12.a.n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f1, code lost:
        r12.a.q(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0403, code lost:
        r12.a.l(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0415, code lost:
        r12.a.o(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0427, code lost:
        r12.a.o(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0439, code lost:
        r12.a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0449, code lost:
        r12.b(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0308, code lost:
        r12.f(r6, b.l.a.c.f.e.n1.q(r11, (long) (r4 & 1048575)), P(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r11, b.l.a.c.f.e.cn r12) {
        /*
            r10 = this;
            boolean r0 = r10.f2990h
            if (r0 == 0) goto L_0x0460
            boolean r0 = r10.f
            r1 = 0
            if (r0 != 0) goto L_0x045a
            int[] r0 = r10.a
            int r0 = r0.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r0) goto L_0x0450
            int r4 = r10.m(r3)
            int[] r5 = r10.a
            r6 = r5[r3]
            int r7 = r4 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x043d;
                case 1: goto L_0x042d;
                case 2: goto L_0x041b;
                case 3: goto L_0x0409;
                case 4: goto L_0x03f7;
                case 5: goto L_0x03e5;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03c0;
                case 8: goto L_0x03af;
                case 9: goto L_0x039a;
                case 10: goto L_0x0385;
                case 11: goto L_0x0372;
                case 12: goto L_0x035f;
                case 13: goto L_0x034c;
                case 14: goto L_0x0339;
                case 15: goto L_0x0328;
                case 16: goto L_0x0317;
                case 17: goto L_0x0302;
                case 18: goto L_0x02f3;
                case 19: goto L_0x02e4;
                case 20: goto L_0x02d5;
                case 21: goto L_0x02c6;
                case 22: goto L_0x02b7;
                case 23: goto L_0x02a8;
                case 24: goto L_0x0299;
                case 25: goto L_0x028a;
                case 26: goto L_0x027b;
                case 27: goto L_0x0268;
                case 28: goto L_0x0259;
                case 29: goto L_0x024a;
                case 30: goto L_0x023b;
                case 31: goto L_0x022c;
                case 32: goto L_0x021d;
                case 33: goto L_0x020e;
                case 34: goto L_0x01ff;
                case 35: goto L_0x01f0;
                case 36: goto L_0x01e1;
                case 37: goto L_0x01d2;
                case 38: goto L_0x01c3;
                case 39: goto L_0x01b4;
                case 40: goto L_0x01a5;
                case 41: goto L_0x0196;
                case 42: goto L_0x0187;
                case 43: goto L_0x0178;
                case 44: goto L_0x0169;
                case 45: goto L_0x015a;
                case 46: goto L_0x014b;
                case 47: goto L_0x013c;
                case 48: goto L_0x012d;
                case 49: goto L_0x011a;
                case 50: goto L_0x0109;
                case 51: goto L_0x00fb;
                case 52: goto L_0x00ed;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00c3;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00a7;
                case 58: goto L_0x0099;
                case 59: goto L_0x0091;
                case 60: goto L_0x0089;
                case 61: goto L_0x0081;
                case 62: goto L_0x0073;
                case 63: goto L_0x0065;
                case 64: goto L_0x0057;
                case 65: goto L_0x0049;
                case 66: goto L_0x003b;
                case 67: goto L_0x002d;
                case 68: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x044c
        L_0x0025:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x0308
        L_0x002d:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = r(r11, r4)
            goto L_0x0323
        L_0x003b:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x0334
        L_0x0049:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = r(r11, r4)
            goto L_0x0345
        L_0x0057:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x0358
        L_0x0065:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x036b
        L_0x0073:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x037e
        L_0x0081:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x038b
        L_0x0089:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03a0
        L_0x0091:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03b5
        L_0x0099:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = s(r11, r4)
            goto L_0x03cc
        L_0x00a7:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x03df
        L_0x00b5:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = r(r11, r4)
            goto L_0x03f1
        L_0x00c3:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = q(r11, r4)
            goto L_0x0403
        L_0x00d1:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = r(r11, r4)
            goto L_0x0415
        L_0x00df:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = r(r11, r4)
            goto L_0x0427
        L_0x00ed:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = p(r11, r4)
            goto L_0x0439
        L_0x00fb:
            boolean r5 = r10.x(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = o(r11, r4)
            goto L_0x0449
        L_0x0109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r4)
            if (r4 != 0) goto L_0x0113
            goto L_0x044c
        L_0x0113:
            java.lang.Object r11 = r10.Q(r3)
            b.l.a.c.f.e.x r11 = (b.l.a.c.f.e.x) r11
            throw r1
        L_0x011a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.o0 r6 = r10.P(r3)
            b.l.a.c.f.e.q0.u(r5, r4, r12, r6)
            goto L_0x044c
        L_0x012d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.h(r5, r4, r12, r8)
            goto L_0x044c
        L_0x013c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.m(r5, r4, r12, r8)
            goto L_0x044c
        L_0x014b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.j(r5, r4, r12, r8)
            goto L_0x044c
        L_0x015a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.o(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.p(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.l(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.q(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.n(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.i(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.k(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.g(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.f(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.e(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.d(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.h(r5, r4, r12, r2)
            goto L_0x044c
        L_0x020e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.m(r5, r4, r12, r2)
            goto L_0x044c
        L_0x021d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.j(r5, r4, r12, r2)
            goto L_0x044c
        L_0x022c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.o(r5, r4, r12, r2)
            goto L_0x044c
        L_0x023b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.p(r5, r4, r12, r2)
            goto L_0x044c
        L_0x024a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.l(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.s(r5, r4, r12)
            goto L_0x044c
        L_0x0268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.o0 r6 = r10.P(r3)
            b.l.a.c.f.e.q0.t(r5, r4, r12, r6)
            goto L_0x044c
        L_0x027b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.r(r5, r4, r12)
            goto L_0x044c
        L_0x028a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.q(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.n(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.i(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.k(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.g(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.f(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.e(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.e.q0.d(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0302:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x0308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r4)
            b.l.a.c.f.e.o0 r5 = r10.P(r3)
            r12.f(r6, r4, r5)
            goto L_0x044c
        L_0x0317:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.e.n1.k(r11, r4)
        L_0x0323:
            r12.d(r6, r4)
            goto L_0x044c
        L_0x0328:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x0334:
            r12.c(r6, r4)
            goto L_0x044c
        L_0x0339:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.e.n1.k(r11, r4)
        L_0x0345:
            b.l.a.c.f.e.bn r7 = r12.a
            r7.q(r6, r4)
            goto L_0x044c
        L_0x034c:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x0358:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.n(r6, r4)
            goto L_0x044c
        L_0x035f:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x036b:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.l(r6, r4)
            goto L_0x044c
        L_0x0372:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x037e:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.m(r6, r4)
            goto L_0x044c
        L_0x0385:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x038b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r4)
            b.l.a.c.f.e.um r4 = (b.l.a.c.f.e.um) r4
            b.l.a.c.f.e.bn r5 = r12.a
            r5.t(r6, r4)
            goto L_0x044c
        L_0x039a:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r4)
            b.l.a.c.f.e.o0 r5 = r10.P(r3)
            r12.e(r6, r4, r5)
            goto L_0x044c
        L_0x03af:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.e.n1.q(r11, r4)
            C(r6, r4, r12)
            goto L_0x044c
        L_0x03c0:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = b.l.a.c.f.e.n1.m(r11, r4)
        L_0x03cc:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.r(r6, r4)
            goto L_0x044c
        L_0x03d3:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x03df:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.n(r6, r4)
            goto L_0x044c
        L_0x03e5:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.e.n1.k(r11, r4)
        L_0x03f1:
            b.l.a.c.f.e.bn r7 = r12.a
            r7.q(r6, r4)
            goto L_0x044c
        L_0x03f7:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.e.n1.j(r11, r4)
        L_0x0403:
            b.l.a.c.f.e.bn r5 = r12.a
            r5.l(r6, r4)
            goto L_0x044c
        L_0x0409:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.e.n1.k(r11, r4)
        L_0x0415:
            b.l.a.c.f.e.bn r7 = r12.a
            r7.o(r6, r4)
            goto L_0x044c
        L_0x041b:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.e.n1.k(r11, r4)
        L_0x0427:
            b.l.a.c.f.e.bn r7 = r12.a
            r7.o(r6, r4)
            goto L_0x044c
        L_0x042d:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = b.l.a.c.f.e.n1.n(r11, r4)
        L_0x0439:
            r12.a(r6, r4)
            goto L_0x044c
        L_0x043d:
            boolean r5 = r10.v(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = b.l.a.c.f.e.n1.o(r11, r4)
        L_0x0449:
            r12.b(r6, r4)
        L_0x044c:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x0450:
            b.l.a.c.f.e.c1<?, ?> r0 = r10.f2995m
            java.lang.Object r11 = r0.j(r11)
            r0.r(r11, r12)
            return
        L_0x045a:
            b.l.a.c.f.e.gn<?> r12 = r10.f2996n
            r12.b(r11)
            throw r1
        L_0x0460:
            r10.B(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.g0.h(java.lang.Object, b.l.a.c.f.e.cn):void");
    }

    public final boolean i(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.f2992j) {
            int i7 = this.f2991i[i5];
            int i8 = this.a[i7];
            int m2 = m(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = f2986q.getInt(t2, (long) i10);
                }
                i2 = i4;
                i3 = i10;
            } else {
                i3 = i6;
                i2 = i4;
            }
            if ((268435456 & m2) != 0 && !u(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (m2 >>> 20) & 255;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (x(t2, i8, i7) && !P(i7).i(n1.q(t2, (long) (m2 & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !((z) n1.q(t2, (long) (m2 & 1048575))).isEmpty()) {
                            x xVar = (x) Q(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) n1.q(t2, (long) (m2 & 1048575));
                if (!list.isEmpty()) {
                    o0 P = P(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!P.i(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (u(t, i7, i3, i2, i11) && !P(i7).i(n1.q(t2, (long) (m2 & 1048575)))) {
                return false;
            }
            i5++;
            i6 = i3;
            i4 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.f2996n.b(t2);
        throw null;
    }

    public final void j(T t, byte[] bArr, int i2, int i3, jm jmVar) {
        if (this.f2990h) {
            S(t, bArr, i2, i3, jmVar);
        } else {
            E(t, bArr, i2, i3, 0, jmVar);
        }
    }

    public final <UT, UB> Object k(Object obj, int i2, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        Object q2 = n1.q(obj, (long) (iArr[i2 + 1] & 1048575));
        if (q2 == null || R(i2) == null) {
            return obj2;
        }
        z zVar = (z) q2;
        x xVar = (x) Q(i2);
        throw null;
    }

    public final void l(Object obj, int i2, wm wmVar) {
        long j2;
        Object C;
        if ((536870912 & i2) != 0) {
            j2 = (long) (i2 & 1048575);
            C = wmVar.B();
        } else {
            int i3 = i2 & 1048575;
            if (this.f2989g) {
                j2 = (long) i3;
                C = wmVar.A();
            } else {
                j2 = (long) i3;
                C = wmVar.C();
            }
        }
        n1.f3182e.s(obj, j2, C);
    }

    public final int m(int i2) {
        return this.a[i2 + 1];
    }

    public final int n(int i2) {
        return this.a[i2 + 2];
    }

    public final boolean t(T t, T t2, int i2) {
        return v(t, i2) == v(t2, i2);
    }

    public final boolean u(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? v(t, i2) : (i4 & i5) != 0;
    }

    public final boolean v(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 != 1048575) {
            return (n1.j(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long j3 = (long) (i4 & 1048575);
        switch ((i4 >>> 20) & 255) {
            case 0:
                return n1.o(t, j3) != ShadowDrawableWrapper.COS_45;
            case 1:
                return n1.n(t, j3) != 0.0f;
            case 2:
                return n1.k(t, j3) != 0;
            case 3:
                return n1.k(t, j3) != 0;
            case 4:
                return n1.j(t, j3) != 0;
            case 5:
                return n1.k(t, j3) != 0;
            case 6:
                return n1.j(t, j3) != 0;
            case 7:
                return n1.m(t, j3);
            case 8:
                Object q2 = n1.q(t, j3);
                if (q2 instanceof String) {
                    return !((String) q2).isEmpty();
                }
                if (q2 instanceof um) {
                    return !um.f3344i.equals(q2);
                }
                throw new IllegalArgumentException();
            case 9:
                return n1.q(t, j3) != null;
            case 10:
                return !um.f3344i.equals(n1.q(t, j3));
            case 11:
                return n1.j(t, j3) != 0;
            case 12:
                return n1.j(t, j3) != 0;
            case 13:
                return n1.j(t, j3) != 0;
            case 14:
                return n1.k(t, j3) != 0;
            case 15:
                return n1.j(t, j3) != 0;
            case 16:
                return n1.k(t, j3) != 0;
            case 17:
                return n1.q(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void w(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            n1.f3182e.o(t, j2, (1 << (i3 >>> 20)) | n1.j(t, j2));
        }
    }

    public final boolean x(T t, int i2, int i3) {
        return n1.j(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final void y(T t, int i2, int i3) {
        n1.f3182e.o(t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    public final int z(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return A(i2, 0);
    }
}
